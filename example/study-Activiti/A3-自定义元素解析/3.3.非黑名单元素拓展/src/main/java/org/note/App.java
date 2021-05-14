package org.note;

import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.ExtensionAttribute;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.engine.impl.util.io.InputStreamSource;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class App {

    @Test
    public void test() throws IOException {
        // 获取bpmn文件流
        String resource = "simple.bpmn";
        String bpmn = "processes/" + resource;
        InputStream inputStream = App.class.getClassLoader().getResource(bpmn).openStream();
        InputStreamSource inputStreamSource = new InputStreamSource(inputStream);
        BpmnXMLConverter bpmnXMLConverter = new BpmnXMLConverter();
        System.out.println("添加自定义解析器");
        BpmnXMLConverter.addConverter(new MyStartEventXMLConverter());
        BpmnModel bpmnModel = bpmnXMLConverter.convertToBpmnModel(inputStreamSource, true, false, "UTF-8");
        System.out.println(bpmnModel);
        // 获取id为 theStart 的任务节点的所有信息
        FlowElement flowElementTheStart = bpmnModel.getProcesses().get(0).getFlowElement("theStart");
        System.out.println("解析" + flowElementTheStart.getName());
        // 获取自定义属性
        Map<String, List<ExtensionAttribute>> attributesTheStart = flowElementTheStart.getAttributes();
        List<ExtensionAttribute> listIdTheStart = attributesTheStart.get("id");
        listIdTheStart.forEach(item -> {
            System.out.println(item.getNamespacePrefix() + ":" + item.getName() + " = " + item.getValue());
        });
        List<ExtensionAttribute> listNameTheStart = attributesTheStart.get("name");
        listNameTheStart.forEach(item -> {
            System.out.println(item.getNamespacePrefix() + ":" + item.getName() + " = " + item.getValue());
        });
    }

}
