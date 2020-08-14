
package com.demo.audit;

import com.demo.generator.EcifTask;
import com.demo.generator.TaskRec;
import com.demo.service.AuditService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestService {

    @Autowired
    private AuditService auditService;

    @Test
    public void testPromoterTask() throws Exception {
        String result = auditService.promoterTask("userId001", "1", "任务1");
        log.info(result);
    }

    @Test
    public void testAuditTask() throws Exception {
        String result = auditService.auditTask("userId001", "1");
        log.info(result);
    }

    @Test
    public void testGetPreTaskList() throws Exception {
        AtomicInteger index = new AtomicInteger(1);
        List<EcifTask> taskList = auditService.getPreAuditTasks("userId002");
        taskList.stream().forEach(x -> log.info("这是用户第" + index.getAndIncrement() + "个任务，任务名称为：" + x.getTaskName()));
    }

    @Test
    public void testGetTaskLifeCycle() throws Exception{
        List<TaskRec> taskRecList = auditService.getTaskLifeCycle("1");
        taskRecList.stream().forEach(x -> log.info(x.toString() + "\r\n"));
    }

    @Test
    public void testRejectTask() throws Exception{
        String result = auditService.rejectTask("userId002", "1");
        log.info(result);
    }
}
