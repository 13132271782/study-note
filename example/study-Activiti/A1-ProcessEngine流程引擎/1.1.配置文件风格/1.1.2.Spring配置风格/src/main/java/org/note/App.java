package org.note;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.TaskService;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class App {

    // 测试默认的配置方式
    @Test
    public void TestSpringConfig() {
        // 实例化
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("activiti.content.xml");
        // 获取ProcessEngine实例
        Map<String, ProcessEngine> beansOfType = genericXmlApplicationContext.getBeansOfType(ProcessEngine.class);
        // 取出第一个ProcessEngine实例对象
        ProcessEngine next = beansOfType.values().iterator().next();
        // 获取任务服务类 TaskService
        TaskService taskService = next.getTaskService();
        System.out.println(taskService);
    }

}
