package com.demo.service;

import com.demo.generator.EcifTask;
import com.demo.generator.TaskRec;

import java.util.List;

public interface AuditService {

    String promoterTask(String promoterUserId,String ruleId,String taskName);

    String auditTask(String currentUserId,String taskId,boolean hasNextAudit);

    List<EcifTask> getPreAuditTasks(String currentUserId);

    String rejectTask(String currentUserId,String taskId);

    List<TaskRec> getTaskLifeCycle(String taskId);
}
