package org.note;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.activiti.engine.delegate.event.ActivitiVariableEvent;
import org.activiti.engine.delegate.event.impl.ActivitiEventImpl;

public class MyEventListener implements ActivitiEventListener {
    @Override
    public void onEvent(ActivitiEvent event) {
        System.out.println("=======================");
        System.out.println("ExecutionId = " + event.getExecutionId());
        System.out.println("ProcessDefinitionId = " + event.getProcessDefinitionId());
        System.out.println("ProcessInstanceId = " + event.getProcessInstanceId());
        System.out.println("eventType = " + event.getType());
        switch (event.getType()) {
            case VARIABLE_CREATED:
                ActivitiVariableEvent activitiVariableEvent = (ActivitiVariableEvent) event;
                break;
            case ENTITY_CREATED:
                ActivitiEventImpl activitiEvent = (ActivitiEventImpl) event;
                break;
        }
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }
}
