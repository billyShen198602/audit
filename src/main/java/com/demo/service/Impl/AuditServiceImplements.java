package com.demo.service.Impl;

import com.demo.constant.AuditStatusEnum;
import com.demo.constant.ResultEnum;
import com.demo.constant.TaskMap;
import com.demo.exception.MyException;
import com.demo.generator.*;
import com.demo.service.AuditService;
import com.demo.utils.ObjUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Slf4j
@Service("auditService")
public class AuditServiceImplements implements AuditService {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    /**
     * 发起审批任务
     *
     * @param promoterUserId 发起人
     * @param ruleId         审批规则
     * @param taskName       任务名称
     * @return
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public String promoterTask(String promoterUserId, String ruleId, String taskName) {
        if (TaskMap.taskIdList.contains(taskName)){
            throw new MyException(ResultEnum.TASK_ALREADY_EXISTS_ERROR.getCode(),
                    ResultEnum.TASK_ALREADY_EXISTS_ERROR.getDesc());
        }
        SqlSession session = sqlSessionFactory.openSession();
        //1、根据ruleId查询任务规则表，拿到任务审批人数组
        AtomicInteger index = new AtomicInteger(1);
        TaskRulesDao taskRulesDao = session.getMapper(TaskRulesDao.class);
        TaskRules taskRules = taskRulesDao.selectByPrimaryKey(ruleId);
        List<String> rulesUserIdList = ObjUtils.ConvertObjToList(taskRules);
        rulesUserIdList.remove(0);
        rulesUserIdList = rulesUserIdList.stream().filter(ruleUserId -> !promoterUserId.equals(ruleUserId))
                .collect(Collectors.toList());
        rulesUserIdList.stream().forEach(x -> log.info("第" + (index.getAndIncrement()) + "审批人为：" + x));
        //2、插入任务表，更新任务状态为待审批
        EcifTask ecifTask = new EcifTask();
        ecifTask.setTaskName(taskName);
        ecifTask.setTaskStatusCode(AuditStatusEnum.PRE_AUDIT.getCode());
        ecifTask.setCreateTime(new Date());
        ecifTask.setPromoterUser(promoterUserId);
        ecifTask.setTaskRulesId(ruleId);
        ecifTask.setUntilTime(new Date(2020, 12, 2, 14, 0, 0));
        EcifTaskDao ecifTaskDao = session.getMapper(EcifTaskDao.class);
        ecifTaskDao.insertSelective(ecifTask);
        session.commit();
        session.clearCache();
        //3、插入任务分配表
        EcifTask ecifTaskLatest = ecifTaskDao.selectLatest();
        SqlSession batchSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        TaskAssignDao taskAssignDao = batchSession.getMapper(TaskAssignDao.class);
        String firstRuleUserId = rulesUserIdList.get(0);
        TaskAssign taskAssign = new TaskAssign();
        taskAssign.setTaskId(ecifTaskLatest.getTaskId());
        taskAssign.setTaskAssign(firstRuleUserId);
        taskAssign.setTaskStatusCode(AuditStatusEnum.PRE_AUDIT.getCode());
        taskAssignDao.insert(taskAssign);
        rulesUserIdList.remove(0);
        for (String ruleUserId : rulesUserIdList) {
            taskAssign.setTaskId(ecifTaskLatest.getTaskId());
            taskAssign.setTaskAssign(ruleUserId);
            taskAssign.setTaskStatusCode(AuditStatusEnum.NOT_ASSIGN.getCode());
            taskAssignDao.insert(taskAssign);
        }
        //4、插入任务记录表
        TaskRecDao taskRecDao = batchSession.getMapper(TaskRecDao.class);
        TaskRec taskRec = new TaskRec();
        taskRec.setTaskId(ecifTaskLatest.getTaskId());
        taskRec.setTaskName(ecifTaskLatest.getTaskName());
        taskRec.setPromoterUser(ecifTaskLatest.getPromoterUser());
        taskRec.setTaskAssign(rulesUserIdList.get(0));
        taskRec.setCreateTime(ecifTaskLatest.getCreateTime());
        taskRec.setUntilTime(ecifTaskLatest.getUntilTime());
        taskRec.setTaskStatusChangeBefore(AuditStatusEnum.NOT_ASSIGN.getCode());
        taskRec.setTaskStatusChangeAfter(ecifTaskLatest.getTaskStatusCode());
        taskRec.setTaskStatusChangeTime(new Date());
        taskRecDao.insertSelective(taskRec);
        rulesUserIdList.remove(0);
        batchSession.commit();
        batchSession.clearCache();
        //放入内存，防止重复插入
        TaskMap.taskIdList.add(taskName);
        return "OK";
    }

    /**
     * 审批任务
     *
     * @param currentUserId 审批人(当前用户)
     * @param taskId        任务id
     * @return
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public String auditTask(String currentUserId, String taskId) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        SqlSession session = sqlSessionFactory.openSession();
        TaskAssignDao taskAssignDao = session.getMapper(TaskAssignDao.class);
        EcifTaskDao ecifTaskDao = session.getMapper(EcifTaskDao.class);
        //1、插入任务记录表
        EcifTask ecifTask_ = ecifTaskDao.selectByPrimaryKey(taskId);
        TaskRecDao taskRecDao = session.getMapper(TaskRecDao.class);
        TaskRec taskRec = new TaskRec();
        taskRec.setTaskId(taskId);
        taskRec.setTaskName(ecifTask_.getTaskName());
        taskRec.setPromoterUser(ecifTask_.getPromoterUser());
        taskRec.setTaskAssign(currentUserId);
        taskRec.setCreateTime(ecifTask_.getCreateTime());
        taskRec.setUntilTime(ecifTask_.getUntilTime());
        //2、插入任务表
        EcifTask ecifTask = new EcifTask();
        ecifTask.setTaskId(taskId);
        ecifTask.setUpdateTime(new Date());
        //3、根据任务id查询任务规则表，获取任务审批人数组链路
        EcifTask ecifTask1 = ecifTaskDao.selectByPrimaryKey(taskId);
        TaskRulesDao taskRulesDao = session.getMapper(TaskRulesDao.class);
        TaskRules taskRules = taskRulesDao.selectByPrimaryKey(ecifTask1.getTaskRulesId());
        List<String> rulesUserIdList = ObjUtils.ConvertObjToList(taskRules);
        rulesUserIdList.remove(0);
        rulesUserIdList.stream().forEach(ruleUserId -> log.info(ecifTask1.getTaskName() + "的第"
         + atomicInteger.getAndIncrement() + "个审批人为" + ruleUserId + "******"));
        int index = 0;
        for (int i = 0; i < rulesUserIdList.size(); i++) {
            if (currentUserId.equals(rulesUserIdList.get(i))) {
                index = i;
            }
        }
        //4、更新任务分配表的任务状态为已审批
        TaskAssign taskAssign = new TaskAssign();
        taskAssign.setTaskAssign(currentUserId);
        taskAssign.setTaskId(taskId);
        taskAssign.setTaskStatusCode(AuditStatusEnum.ALREADY_AUDIT.getCode());
        taskAssign.setTaskCompleteTime(new Date());
        if ((index + 1) == rulesUserIdList.size()) {
            //5、已经是最后一个节点
            taskAssign.setRemark("任务" + taskId + "已经被用户" + currentUserId + "审批，审批结束*********" );
            taskRec.setTaskStatusChangeBefore(AuditStatusEnum.PRE_AUDIT.getCode());
            taskRec.setTaskStatusChangeAfter(AuditStatusEnum.ALREADY_COMPLETE.getCode());
            taskRec.setTaskStatusChangeTime(new Date());
            //6、更新任务表的状态为已完成
            ecifTask.setTaskStatusCode(AuditStatusEnum.ALREADY_COMPLETE.getCode());
            //TODO 向发起人发送消息，任务审批已完成

        } else {
            //7、存在下一审批人
            taskRec.setTaskStatusChangeBefore(AuditStatusEnum.PRE_AUDIT.getCode());
            taskRec.setTaskStatusChangeAfter(AuditStatusEnum.ALREADY_COMPLETE.getCode());
            taskRec.setTaskStatusChangeTime(new Date());
            //8、更新任务表的任务状态为审批中
            ecifTask.setTaskStatusCode(AuditStatusEnum.ING_AUDIT.getCode());
            String nextAuditId = rulesUserIdList.get(index + 1);
            log.info("当前用户是" + currentUserId + ",下一个审批人为" + nextAuditId + "********");
            taskAssign.setRemark("任务" + taskId + "已经被用户" + currentUserId + "审批,下一个审批人为:" + nextAuditId + "******");
            //9、更新任务分配表下一审批节点的状态从"未分配"为"待审批"
            TaskAssign taskAssign1 = new TaskAssign();
            taskAssign1.setTaskId(taskId);
            taskAssign1.setTaskAssign(nextAuditId);
            int updateByUserId = taskAssignDao.updateByUserId(taskAssign1);
            log.info(String.valueOf(updateByUserId));
            //TODO 向下一审批人发送审批消息

        }
        taskAssignDao.updateByTaskIdAndAssignId(taskAssign);
        taskRecDao.insertSelective(taskRec);
        ecifTaskDao.updateByPrimaryKeySelective(ecifTask);
        session.commit();
        session.clearCache();
        return "OK";
    }

    /**
     * 用户获取当前待办审批任务列表
     *
     * @param currentUserId 当前用户
     * @return
     * @throws Exception
     */
    @Override
    public List<EcifTask> getPreAuditTasks(String currentUserId) {
        SqlSession session = sqlSessionFactory.openSession();
        TaskAssignDao taskAssignDao = session.getMapper(TaskAssignDao.class);
        List<TaskAssign> taskAssignList = taskAssignDao.selectByTaskAssign(currentUserId);
        List<String> taskIdList = taskAssignList.stream().map(TaskAssign::getTaskId).distinct().collect(Collectors.toList());
//        SqlSession batchSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        EcifTaskDao ecifTaskDao = session.getMapper(EcifTaskDao.class);
        List<EcifTask> ecifTaskList = taskIdList.stream().map(x -> ecifTaskDao.selectByPrimaryKey(x)).collect(Collectors.toList());
        return ecifTaskList;
    }

    /**
     * 用户驳回任务
     *
     * @param currentUserId 当前用户
     * @param taskId        任务id
     * @return
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public String rejectTask(String currentUserId, String taskId) {
        SqlSession session = sqlSessionFactory.openSession();
        //1、更新任务分配表的任务状态为已驳回
        TaskAssignDao taskAssignDao = session.getMapper(TaskAssignDao.class);
        TaskAssign taskAssign = new TaskAssign();
        taskAssign.setTaskId(taskId);
        taskAssign.setTaskAssign(currentUserId);
        taskAssign.setTaskStatusCode(AuditStatusEnum.ALREADY_REJECT.getCode());
        taskAssign.setTaskCompleteTime(new Date());
        taskAssign.setRemark("任务" + taskId + "已被" + currentUserId + "驳回！！！！！！！！！！！！");
        taskAssignDao.updateByTaskIdAndAssignIdSelective(taskAssign);
//        taskAssignDao.updateByTaskIdAndAssignIdSelective_(new Date(),AuditStatusEnum.ALREADY_REJECT.getCode(),
//                "任务" + taskId + "已被" + currentUserId + "驳回！！！！！！！！！！！！",
//                taskId,currentUserId);
        //2、更新任务表的任务状态为已驳回
        EcifTaskDao ecifTaskDao = session.getMapper(EcifTaskDao.class);
        EcifTask ecifTask = new EcifTask();
        ecifTask.setTaskId(taskId);
        ecifTask.setTaskStatusCode(AuditStatusEnum.ALREADY_REJECT.getCode());
        ecifTask.setUpdateTime(new Date());
        ecifTaskDao.updateByPrimaryKeySelective(ecifTask);
        //更新后续节点的任务状态为已驳回
//        TaskAssign taskAssign_ = new TaskAssign();
//        taskAssign_.setTaskCompleteTime(new Date());
//        taskAssign_.setTaskId(taskId);
//        taskAssign_.setRemark("任务" + taskId + "已经被用户" + currentUserId + "驳回！！！！！！！！！！！！！");
//        taskAssignDao.updateByTaskIdAndTaskStatus(taskAssign_);
        //3、插入任务记录表
        TaskRecDao taskRecDao = session.getMapper(TaskRecDao.class);
        EcifTask ecifTask_ = ecifTaskDao.selectByPrimaryKey(taskId);
        TaskRec taskRec = new TaskRec();
        taskRec.setTaskId(taskId);
        taskRec.setTaskName(ecifTask_.getTaskName());
        taskRec.setPromoterUser(ecifTask_.getPromoterUser());
        taskRec.setTaskAssign(currentUserId);
        taskRec.setCreateTime(ecifTask_.getCreateTime());
        taskRec.setUntilTime(ecifTask_.getUntilTime());
        taskRec.setTaskStatusChangeBefore(AuditStatusEnum.PRE_AUDIT.getCode());
        taskRec.setTaskStatusChangeAfter(AuditStatusEnum.ALREADY_REJECT.getCode());
        taskRec.setTaskStatusChangeTime(new Date());
        taskRecDao.insertSelective(taskRec);
        session.commit();
        session.clearCache();
        //4、向发起人发送消息，任务已驳回
        //TODO 向发起人发送消息，任务已驳回
        return "OK";
    }

    /**
     * 任务生命周期展示
     *
     * @param taskId 任务id
     * @return
     * @throws Exception
     */
    @Override
    public List<TaskRec> getTaskLifeCycle(String taskId) {
        SqlSession session = sqlSessionFactory.openSession();
        TaskRecDao taskRecDao = session.getMapper(TaskRecDao.class);
        List<TaskRec> taskRecList = taskRecDao.selectByTaskId(taskId);
        List<TaskRec> taskRecGroupByList = taskRecDao.selectAllGroupBy();
        return taskRecGroupByList;
    }

    /**
     * 获取任务规则
     *
     * @param taskRulesId 任务规则表id
     * @return
     */
    @Override
    public TaskRules getTaskRule(String taskRulesId) {
        SqlSession session = sqlSessionFactory.openSession();
        TaskRulesDao taskRulesDao = session.getMapper(TaskRulesDao.class);
        TaskRules taskRules = taskRulesDao.selectByPrimaryKey(taskRulesId);
        return taskRules;
    }

    /**
     * 查询全部任务
     * @return
     */
    @Override
    public List<TaskRec> getTaskLifeCycleGroupBy() {
        SqlSession session = sqlSessionFactory.openSession();
        TaskRecDao taskRecDao = session.getMapper(TaskRecDao.class);
        List<TaskRec> taskRecList = taskRecDao.selectAllGroupBy();
        return taskRecList;
    }

    /**
     * 当前用户查看所有待办任务的审批规则
     * @param currentUserId 当前用户
     * @return
     */
    @Override
    public List<TaskRules> getTaskRules(String currentUserId) {
        SqlSession session = sqlSessionFactory.openSession();
        EcifTaskDao ecifTaskDao = session.getMapper(EcifTaskDao.class);
        TaskRulesDao taskRulesDao = session.getMapper(TaskRulesDao.class);
        List<EcifTask> ecifTaskList = getPreAuditTasks(currentUserId);
        List<String> taskRulesIdList = ecifTaskList.stream().map(ecifTask -> ecifTaskDao.selectByPrimaryKey(ecifTask.getTaskId()))
                .map(EcifTask::getTaskRulesId)
                .collect(Collectors.toList());
        List<TaskRules> taskRulesList = taskRulesIdList.stream().map(taskRuleId -> taskRulesDao.selectByPrimaryKey(taskRuleId))
                .collect(Collectors.toList());
        return taskRulesList;
    }
}
