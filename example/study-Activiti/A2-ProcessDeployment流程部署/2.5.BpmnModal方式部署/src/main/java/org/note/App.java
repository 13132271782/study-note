package org.note;

import org.activiti.bpmn.model.*;
import org.activiti.bpmn.model.Process;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.ZipInputStream;

public class App {

    @Test
    public void test() throws IOException {
        // 创建流程引擎
        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = cfg.buildProcessEngine();
        BpmnModel bpmnModel = build();
        // 部署
        DeploymentBuilder deploymentBuilder = processEngine.getRepositoryService().createDeployment().addBpmnModel("study_bpmn_modal", bpmnModel);
        deploymentBuilder.deploy();
    }

    private BpmnModel build() {
        BpmnModel bpmnModel = new BpmnModel();
        SequenceFlow flow1 = new SequenceFlow();
        flow1.setId("flow1");
        flow1.setName("开始节点 -> 任务节点1");
        flow1.setSourceRef("startEvent");
        flow1.setTargetRef("userTask1");
        SequenceFlow flow2 = new SequenceFlow();
        flow2.setId("flow2");
        flow2.setName("任务节点1 -> 任务节点2");
        flow2.setSourceRef("userTask1");
        flow2.setTargetRef("userTask2");
        SequenceFlow flow3 = new SequenceFlow();
        flow3.setId("flow2");
        flow3.setName("任务节点2 -> 结束节点");
        flow3.setSourceRef("userTask2");
        flow3.setTargetRef("endEvent");
        Process process = new Process();
        process.setId("process1");
        // 开始封装节点
        StartEvent startEvent = new StartEvent();
        startEvent.setId("startEvent");
        startEvent.setName("开始节点");
        startEvent.setOutgoingFlows(Collections.singletonList(flow1));
        // 任务节点1
        UserTask userTask1 = new UserTask();
        userTask1.setId("userTask1");
        userTask1.setName("任务节点1");
        userTask1.setIncomingFlows(Collections.singletonList(flow1));
        userTask1.setOutgoingFlows(Collections.singletonList(flow2));
        // 任务节点2
        UserTask userTask2 = new UserTask();
        userTask2.setId("userTask2");
        userTask2.setName("任务节点2");
        userTask2.setIncomingFlows(Collections.singletonList(flow2));
        userTask2.setOutgoingFlows(Collections.singletonList(flow3));
        // 结束节点
        EndEvent endEvent = new EndEvent();
        endEvent.setId("endEvent");
        endEvent.setName("结束节点");
        endEvent.setIncomingFlows(Collections.singletonList(flow3));
        // 组装节点到 Process 中
        process.addFlowElement(startEvent);
        process.addFlowElement(flow1);
        process.addFlowElement(userTask1);
        process.addFlowElement(flow2);
        process.addFlowElement(userTask2);
        process.addFlowElement(flow3);
        process.addFlowElement(endEvent);
        bpmnModel.addProcess(process);
        return bpmnModel;
    }

}
