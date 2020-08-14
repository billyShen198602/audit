
package com.demo.audit;

import com.demo.constant.AuditStatusEnum;
import com.demo.generator.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAudit {

    @Autowired
    private EcifTaskDao ecifTaskDao;
    @Autowired
    private TaskRulesDao taskRulesDao;
    @Autowired
    private TaskStatusDao taskStatusDao;
    @Autowired
    private TaskAssignDao taskAssignDao;

    @Test
    public void testInsertTaskInfo() throws Exception {
        EcifTask ecifTask = new EcifTask();
//        ecifTask.setTaskId("3");
        ecifTask.setTaskStatusCode("0");
        ecifTask.setCreateTime(new Date());
        ecifTask.setPromoterUser("userId001");
        ecifTask.setTaskName("任务2");
//        ecifTask.setUpdateTime(new Date(2020,12,2,14,0,0));
        ecifTask.setTaskRulesId("1");
        ecifTask.setUntilTime(new Date(2020, 12, 2, 14, 0, 0));
        int insert = ecifTaskDao.insert(ecifTask);
        log.info(String.valueOf(insert));
    }

    @Test
    public void testInsertTaskRules() throws Exception {
        TaskRules taskRules = new TaskRules();
//        taskRules.setTaskRulesId("3");
        taskRules.setFirstUserId("userId001");
        taskRules.setSecondUserId("userId002");
        taskRules.setThirdUserId("userId003");
        taskRules.setFourthUserId("userId004");
        taskRules.setFifthUserId("userId005");
        taskRules.setSixthUserId("userId006");
        taskRules.setSeventhUserId("userId007");
        int insert = taskRulesDao.insertSelective(taskRules);
        log.info(String.valueOf(insert));
    }

    @Test
    public void testUpdateTaskInfo() throws Exception {
        EcifTask ecifTask = new EcifTask();
        ecifTask.setTaskId("2");
        ecifTask.setTaskName("task002Name");
        ecifTaskDao.updateByPrimaryKeySelective(ecifTask);
    }

    @Test
    public void testInsertTaskStatus() throws Exception {
        TaskStatus taskStatus = new TaskStatus();
        taskStatus.setTaskStatusName("未分配");//待审批、审批中、已审批、已驳回、已完成、未分配
        taskStatusDao.insert(taskStatus);
    }

    @Test
    public void getRulesUsersByRuleId() throws Exception {
        TaskRules taskRules = taskRulesDao.selectByPrimaryKey("3");
        String firstUserId = taskRules.getFirstUserId();
        String secondUserId = taskRules.getSecondUserId();
        log.info("firstUserId:" + firstUserId +
                ",SecondUserId:" + secondUserId);
    }

    @Test
    public void updateByTaskIdAndAssignIdSelective() throws Exception {
        TaskAssign taskAssign = new TaskAssign();
        taskAssign.setTaskId("1");
        taskAssign.setTaskAssign("userId002");
        taskAssign.setTaskStatusCode(AuditStatusEnum.ALREADY_REJECT.getCode());
        taskAssign.setTaskCompleteTime(new Date());
        taskAssign.setRemark("任务1已被userId002驳回！！！！！！！！！！！！");
        int updateByTaskIdAndAssignIdSelective = taskAssignDao.updateByTaskIdAndAssignIdSelective(taskAssign);
        log.info(String.valueOf(updateByTaskIdAndAssignIdSelective));
    }

    @Test
    public void updateByTaskIdAndAssignIdSelective_() throws Exception {
        TaskAssign taskAssign = new TaskAssign();
        taskAssign.setTaskId("1");
        taskAssign.setTaskAssign("userId002");
        taskAssign.setTaskStatusCode(AuditStatusEnum.ALREADY_REJECT.getCode());
        taskAssign.setTaskCompleteTime(new Date());
        taskAssign.setRemark("任务1已被userId002驳回！！！！！！！！！！！！");
        int updateByTaskIdAndAssignIdSelective = taskAssignDao.
                updateByTaskIdAndAssignIdSelective_(new Date(),AuditStatusEnum.ALREADY_REJECT.getCode(),
                        "任务1已被userId002驳回！！！！！！！！！！！！","1","userId002");
        log.info(String.valueOf(updateByTaskIdAndAssignIdSelective));
    }
}
