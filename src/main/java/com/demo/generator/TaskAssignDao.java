package com.demo.generator;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TaskAssignDao {
    long countByExample(TaskAssignExample example);

    int deleteByExample(TaskAssignExample example);

    int deleteByPrimaryKey(String taskAssignId);

    int insert(TaskAssign record);

    int insertSelective(TaskAssign record);

    void batchInsertSelective(@Param("list") List<TaskAssign> list);

    List<TaskAssign> selectByExample(TaskAssignExample example);

    TaskAssign selectByPrimaryKey(String taskAssignId);

    List<TaskAssign> selectByTaskAssign(String taskAssign);

    int updateByExampleSelective(@Param("record") TaskAssign record, @Param("example") TaskAssignExample example);

    int updateByExample(@Param("record") TaskAssign record, @Param("example") TaskAssignExample example);

    int updateByPrimaryKeySelective(TaskAssign record);

    int updateByTaskIdAndAssignId(@Param("record") TaskAssign record);

    int updateByTaskIdAndAssignIdSelective(TaskAssign record);

    int updateByTaskIdAndAssignIdSelective_( @Param("taskCompleteTime") Date taskCompleteTime,
                                             @Param("taskStatusCode") String taskStatusCode,
                                             @Param("remark") String remark,
                                             @Param("taskId") String taskId,@Param("taskAssign") String taskAssign
                                           );

    int updateByPrimaryKey(TaskAssign record);

    int judgeHasNextAudit(@Param("taskId") String taskId);

    int updateByTaskIdAndTaskStatus(TaskAssign record);

    int updateByUserId(@Param("taskId") String taskId,@Param("nextAuditId") String nextAuditId);
}