package org.note;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class App {

    // 测试默认的配置方式
    @Test
    public void TestActivitiConfig() {
        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = cfg.buildProcessEngine();
        System.out.println(processEngine.getName());
    }

}
