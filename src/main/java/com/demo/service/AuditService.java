package com.demo.service;

import com.demo.generator.EcifTask;
import com.demo.generator.TaskRec;

import java.util.List;

public interface AuditService {

    String promoterTask(String promoterUserId,String ruleId,String taskName) throws Exception;

    String auditTask(String currentUserId,String taskId,boolean hasNextAudit) throws Exception;

    List<EcifTask> getPreAuditTasks(String currentUserId) throws Exception;

    String rejectTask(String currentUserId,String taskId) throws Exception;

    List<TaskRec> getTaskLifeCycle(String taskId) throws Exception;
}
