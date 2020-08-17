package com.demo.service;

import com.demo.generator.EcifTask;
import com.demo.generator.TaskRec;
import com.demo.generator.TaskRules;

import java.util.List;

public interface AuditService {

    String promoterTask(String promoterUserId,String ruleId,String taskName);

    String auditTask(String currentUserId,String taskId);

    List<EcifTask> getPreAuditTasks(String currentUserId);

    String rejectTask(String currentUserId,String taskId);

    List<TaskRec> getTaskLifeCycle(String taskId);

    TaskRules getTaskRule(String taskId);

    List<TaskRec> getTaskLifeCycleGroupBy();

    List<TaskRules> getTaskRules(String currentUserId);
}
