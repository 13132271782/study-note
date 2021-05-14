package org.note;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.Test;

import java.io.File;

public class App {

    @Test
    public void test() {
        // 创建流程引擎
        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = cfg.buildProcessEngine();
        File file = new File("");
        String resource = "process1.bpmn";
        String bpmn = file.getAbsolutePath() + "/src/main/resources/processes/" + resource;
        System.out.println("部署文件：" + bpmn);
        // 部署
        DeploymentBuilder deploymentBuilder = processEngine.getRepositoryService().createDeployment().addString(resource, bpmn);
        deploymentBuilder.deploy();
    }

}
