package org.note;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.activiti.engine.delegate.event.ActivitiEventType;
import org.activiti.engine.impl.event.logger.EventFlusher;
import org.activiti.engine.impl.event.logger.EventLogger;
import org.activiti.engine.runtime.Clock;

public class MyEventLogger extends EventLogger {

    private Clock clock;
    private ObjectMapper objectMapper;

    public MyEventLogger(Clock clock, ObjectMapper objectMapper) {
        super(clock, objectMapper);
        this.clock = clock;
        this.objectMapper = objectMapper;
    }

    @Override
    protected void initializeDefaultHandlers() {
        super.initializeDefaultHandlers();
        System.out.println("初始化默认Handlers");
        addEventHandler(ActivitiEventType.ENTITY_UPDATED, TaskUpdateEventHandler.class);
    }

    @Override
    protected EventFlusher createEventFlusher() {
        System.out.println("eEventFlusher");
        return new LogFlusher();
    }
}
