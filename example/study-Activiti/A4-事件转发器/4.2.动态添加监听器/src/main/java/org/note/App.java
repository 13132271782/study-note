package org.note;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.delegate.event.ActivitiEventDispatcher;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class App {

    @Test
    public void test() throws IOException {
        // 创建流程引擎
        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = cfg.buildProcessEngine();
        // 获取bpmn文件流
        String resource = "process1.bpmn";
        String bpmn = "processes/" + resource;
        InputStream inputStream = App.class.getClassLoader().getResource(bpmn).openStream();
        // 部署
        DeploymentBuilder deploymentBuilder = processEngine.getRepositoryService().createDeployment().addInputStream(resource, inputStream);
        ActivitiEventDispatcher eventDispatcher = ((ProcessEngineConfigurationImpl) processEngine.getProcessEngineConfiguration()).getEventDispatcher();
        // 添加监听器
        MyEventListener myEventListener = new MyEventListener();
        eventDispatcher.addEventListener(myEventListener);
        System.out.println("添加监听器");
        deploymentBuilder.deploy();
        System.out.println("部署文件：" + bpmn);
        eventDispatcher.removeEventListener(myEventListener);
        System.out.println("移除监听器");
    }

}
