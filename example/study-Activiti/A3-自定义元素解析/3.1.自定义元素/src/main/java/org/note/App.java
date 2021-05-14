package org.note;

import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.ExtensionAttribute;
import org.activiti.bpmn.model.ExtensionElement;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.engine.impl.util.io.InputStreamSource;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
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
        // 获取拓展节点信息
        Map<String, List<ExtensionElement>> extensionElements = flowElement.getExtensionElements();
        Iterator<String> iterator = extensionElements.keySet().iterator();
        while (iterator.hasNext()) {
            String elementTag = iterator.next();
            List<ExtensionElement> element = extensionElements.get(elementTag);
            System.out.println("================================");
            for (ExtensionElement el : element) {
                Map<String, List<ExtensionElement>> childElements = el.getChildElements();
                Iterator<String> iterator1 = childElements.keySet().iterator();
                System.out.println("elementTag：" + el.getNamespacePrefix() + ":" + el.getName());
                while (iterator1.hasNext()) {
                    String elementTag1 = iterator1.next();
                    List<ExtensionElement> extensionElements1 = childElements.get(elementTag1);
                    System.out.println("================");
                    for (ExtensionElement chel : extensionElements1) {
                        System.out.println("elementTag：" + chel.getNamespacePrefix() + ":" + chel.getName());
                        System.out.println("elementText = " + chel.getElementText());
                        Map<String, List<ExtensionAttribute>> attributes = chel.getAttributes();
                        Iterator<String> attrIterator = attributes.keySet().iterator();
                        while (attrIterator.hasNext()) {
                            List<ExtensionAttribute> extensionAttributes = attributes.get(attrIterator.next());
                            for (ExtensionAttribute attr : extensionAttributes) {
                                System.out.println(attr.getName() + " = " + attr.getValue());
                            }
                        }
                    }
                }
            }
        }
    }


}
