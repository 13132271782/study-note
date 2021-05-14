package org.note.config;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineLifecycleListener;

public class MyLifecycleListener implements ProcessEngineLifecycleListener {

    public void onProcessEngineBuilt(ProcessEngine processEngine) {
        System.out.println("流程引擎创建Built");
        System.out.println(processEngine);
    }

    public void onProcessEngineClosed(ProcessEngine processEngine) {
        System.out.println("流程引擎注销Closed");
        System.out.println(processEngine);
    }
}
