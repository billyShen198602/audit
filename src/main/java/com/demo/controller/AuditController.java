package com.demo.controller;

import com.demo.constant.Result;
import com.demo.service.AuditService;
import com.demo.utils.ResultUtils;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/audit")
public class AuditController {

    @Autowired
    private AuditService auditService;

    @ApiOperation(value = "发起审批接口",notes = "用户发起审批功能")
    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/audit")
    public Result promoterTask(@RequestParam("promoterUserId") String promoterUserId,
                               @RequestParam("ruleId") String ruleId, @RequestParam("taskName") String taskName){
        String promoterTask = auditService.promoterTask(promoterUserId, ruleId, taskName);
        return ResultUtils.success(promoterTask);
    }


}
