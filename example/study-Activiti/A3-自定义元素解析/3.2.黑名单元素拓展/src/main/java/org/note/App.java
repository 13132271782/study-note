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
        BpmnModel bpmnModel = bpmnXMLConverter.convertToBpmnModel(inputStreamSource, true, false, "UTF-8");
        System.out.println(bpmnModel);
        // 获取id为 theTask 的任务节点的所有信息
        FlowElement flowElement = bpmnModel.getProcesses().get(0).getFlowElement("theTask");
        System.out.println("解析" + flowElement.getName());
        // 获取自定义属性
        Map<String, List<ExtensionAttribute>> attributes = flowElement.getAttributes();
        List<ExtensionAttribute> listId = attributes.get("id");
        listId.forEach(item -> {
            System.out.println(item.getNamespacePrefix() + ":" + item.getName() + " = " + item.getValue());
        });
        List<ExtensionAttribute> listName = attributes.get("name");
        listName.forEach(item -> {
            System.out.println(item.getNamespacePrefix() + ":" + item.getName() + " = " + item.getValue());
        });
    }

}
