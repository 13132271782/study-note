package org.note;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

public class App {

    @Test
    public void test() throws IOException {
        // 创建流程引擎
        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = cfg.buildProcessEngine();
        // 获取资源文件
        String resource = "processes.zip";
        String bpmn ="processes/" + resource;
        InputStream inputStream = App.class.getClassLoader().getResource(bpmn).openStream();
        System.out.println("部署文件：" + bpmn);
        // 部署
        DeploymentBuilder deploymentBuilder = processEngine.getRepositoryService().createDeployment().addZipInputStream(new ZipInputStream(inputStream));
        deploymentBuilder.deploy();
    }

}
