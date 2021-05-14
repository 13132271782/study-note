package org.note;

import org.activiti.engine.cfg.AbstractProcessEngineConfigurator;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;

public class MyProcessEngineConfigurator extends AbstractProcessEngineConfigurator {

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void beforeInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
        System.out.println("自定义配置器：beforeInit");
        processEngineConfiguration.setDatabaseSchemaUpdate("true");
    }

    @Override
    public void configure(ProcessEngineConfigurationImpl processEngineConfiguration) {
        System.out.println("自定义配置器：configure");
        processEngineConfiguration.getEventDispatcher().addEventListener(new MyEventLogger(processEngineConfiguration.getClock(), processEngineConfiguration.getObjectMapper()));
    }

}