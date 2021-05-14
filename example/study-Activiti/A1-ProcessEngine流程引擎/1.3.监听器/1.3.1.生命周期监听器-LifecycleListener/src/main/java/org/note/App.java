package org.note;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class App {

    @Test
    public void Test() {
        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = cfg.buildProcessEngine();
        // 调用方法注销流程引擎
        processEngine.close();
    }

}
