package org.note;

import org.activiti.bpmn.converter.StartEventXMLConverter;
import org.activiti.bpmn.converter.util.BpmnXMLUtil;
import org.activiti.bpmn.model.BaseElement;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.ExtensionAttribute;
import org.activiti.bpmn.model.StartEvent;
import org.activiti.bpmn.model.alfresco.AlfrescoStartEvent;
import org.apache.commons.lang3.StringUtils;

import javax.xml.stream.XMLStreamReader;
import java.util.Arrays;
import java.util.List;

public class MyStartEventXMLConverter extends StartEventXMLConverter {

    // 初始化黑名单集合，这样除了id、name两个属性外其他属性都会作为拓展属性进行处理
    protected static final List<ExtensionAttribute> defaultElementAttributs = Arrays.asList(
            new ExtensionAttribute(ATTRIBUTE_ID), new ExtensionAttribute(ATTRIBUTE_NAME)
    );
    // 高速引擎开始节点的属性使用startEvent类进行封装
    public Class<? extends BaseElement> getBpmnElementType() {
        return StartEvent.class;
    }
    // 告诉程序要解析startEvent类元素
    protected String getXMLElementName() {
        return "startEvent";
    }

    public BaseElement convertXMLToElement(XMLStreamReader xtr, BpmnModel model) throws Exception {
        // 解析常规属性
        String formKey = xtr.getAttributeValue(ACTIVITI_EXTENSIONS_NAMESPACE, "formKey");
        StartEvent startEvent = null;
        // 根据 formKey的有无实例化不同的类
        if (StringUtils.isNotEmpty(formKey)){
            if (model.getStartEventFormTypes() != null && model.getStartEventFormTypes().contains(formKey)) {
                startEvent = new AlfrescoStartEvent();
            }
        }
        if (startEvent == null) {
            startEvent = new StartEvent();
        }
        BpmnXMLUtil.addXMLLocation(startEvent, xtr);
        startEvent.setInitiator(xtr.getAttributeValue(ACTIVITI_EXTENSIONS_NAMESPACE, "initiator"));
        startEvent.setFormKey(formKey);
        // 调用方法进行自定义属性的解析工作
        BpmnXMLUtil.addCustomAttributes(xtr, startEvent, defaultElementAttributs);
        // 解析子元素
        parseChildElements(getXMLElementName(), startEvent, model, xtr);
        return startEvent;
    }

}
