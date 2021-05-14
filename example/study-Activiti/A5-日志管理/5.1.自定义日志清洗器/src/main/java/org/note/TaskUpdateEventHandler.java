package org.note;

import org.activiti.engine.impl.event.logger.handler.AbstractTaskEventHandler;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.persistence.entity.EventLogEntryEntity;

public class TaskUpdateEventHandler extends AbstractTaskEventHandler {
    @Override
    public EventLogEntryEntity generateEventLogEntry(CommandContext commandContext) {
        System.out.println("TaskUpdateEventHandler");
        return null;
    }
}
