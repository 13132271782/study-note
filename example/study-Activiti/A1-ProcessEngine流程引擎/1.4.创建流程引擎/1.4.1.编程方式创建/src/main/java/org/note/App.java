package org.note;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class App {

    @Test
    public void Test() {
        ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        // 数据库驱动
        processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
        // 数据库连接地址
        processEngineConfiguration.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/document_activiti");
        // 用户名
        processEngineConfiguration.setJdbcUsername("root");
        // 密码
        processEngineConfiguration.setJdbcPassword("root");
        // 创建实例
        ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
        System.out.println(processEngine);
    }


}
