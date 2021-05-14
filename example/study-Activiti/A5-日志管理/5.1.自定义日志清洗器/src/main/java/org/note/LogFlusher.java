package org.note;

import org.activiti.engine.event.EventLogEntry;
import org.activiti.engine.impl.event.logger.AbstractEventFlusher;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.persistence.entity.EventLogEntryEntityManager;

public class LogFlusher extends AbstractEventFlusher {
    @Override
    public void closing(CommandContext commandContext) {
        System.out.println("closing");
        EventLogEntryEntityManager eventLogEntryEntityManager = commandContext.getEventLogEntryEntityManager();
        for (EventLogEntry eventLogEntry : eventLogEntryEntityManager.findAllEventLogEntries()) {
            System.out.println(eventLogEntry.toString());
        }
    }

    @Override
    public void afterSessionsFlush(CommandContext commandContext) {
        System.out.println("afterSessionsFlush");
        EventLogEntryEntityManager eventLogEntryEntityManager = commandContext.getEventLogEntryEntityManager();
        for (EventLogEntry eventLogEntry : eventLogEntryEntityManager.findAllEventLogEntries()) {
            System.out.println(eventLogEntry.toString());
        }
    }

    @Override
    public void closeFailure(CommandContext commandContext) {
        System.out.println("closeFailure");
        EventLogEntryEntityManager eventLogEntryEntityManager = commandContext.getEventLogEntryEntityManager();
        for (EventLogEntry eventLogEntry : eventLogEntryEntityManager.findAllEventLogEntries()) {
            System.out.println(eventLogEntry.toString());
        }
    }
}
