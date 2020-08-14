package com.demo.controller;

import com.demo.constant.Result;
import com.demo.generator.EcifTask;
import com.demo.generator.TaskRec;
import com.demo.service.AuditService;
import com.demo.utils.ResultUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/audit")
public class AuditController {

    @Autowired
    private AuditService auditService;

    @ApiOperation(value = "发起审批接口",notes = "用户发起审批功能")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "promoterUserId",dataType = "String",required = true,value = "发起者UserId"),
            @ApiImplicitParam(paramType = "query",name = "ruleId",dataType = "String",required = true,value = "审核规则表Id"),
            @ApiImplicitParam(paramType = "query",name = "taskName",dataType = "String",required = true,value = "任务名称")
    })
    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/promoter")
    public Result promoterTask(@RequestParam("promoterUserId") String promoterUserId,
                               @RequestParam("ruleId") String ruleId, @RequestParam("taskName") String taskName){
        String promoterTask = auditService.promoterTask(promoterUserId, ruleId, taskName);
        return ResultUtils.success(promoterTask);
    }

    @ApiOperation(value = "审批接口",notes = "用户审批功能")
    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/audit")
    public Result auditTask(@RequestParam("currentUserId") String currentUserId,@RequestParam("taskId") String taskId,
                            @RequestParam("hasNextAudit") int hasNextAudit){
        boolean flag = (hasNextAudit == 0)? false : true;
        String auditTask = auditService.auditTask(currentUserId, taskId, flag);
        return ResultUtils.success(auditTask);
    }

    @ApiOperation(value = "获取待办任务列表接口",notes = "用户获取待办任务列表")
    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/preTaskList")
    public Result getPreAuditTasks(@RequestParam("currentUserId") String currentUserId){
        List<EcifTask> taskList = auditService.getPreAuditTasks(currentUserId);
        return ResultUtils.success(taskList);
    }

    @ApiOperation(value = "驳回任务接口",notes = "用户驳回任务")
    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/rejectTask")
    public Result rejectTask(@RequestParam("currentUserId") String currentUserId,@RequestParam("taskId") String taskId){
        String rejectTask = auditService.rejectTask(currentUserId, taskId);
        return ResultUtils.success(rejectTask);
    }

    @ApiOperation(value = "获取任务生命周期接口",notes = "用户获取任务生命周期")
    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/taskLifeCycle")
    public Result getTaskLifeCycle(@RequestParam("taskId") String taskId){
        List<TaskRec> taskRecList = auditService.getTaskLifeCycle(taskId);
        return ResultUtils.success(taskRecList);
    }
}
