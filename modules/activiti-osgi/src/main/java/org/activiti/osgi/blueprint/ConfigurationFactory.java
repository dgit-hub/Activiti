package org.activiti.osgi.blueprint;

import javax.sql.DataSource;
import java.util.List;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.activiti.engine.cfg.ProcessEngineConfigurator;
import org.activiti.engine.impl.bpmn.parser.factory.ActivityBehaviorFactory;

public class ConfigurationFactory {

    DataSource dataSource;
    String databaseSchemaUpdate;
    boolean jobExecutorActivate = true;
    List<ProcessEngineConfigurator> configurators;
    ActivityBehaviorFactory activityBehaviorFactory;

    public StandaloneProcessEngineConfiguration getConfiguration() {
  		StandaloneProcessEngineConfiguration conf =
              new StandaloneProcessEngineConfiguration();
      conf.setDataSource(dataSource);
      conf.setDatabaseSchemaUpdate(databaseSchemaUpdate);
      conf.setJobExecutorActivate(jobExecutorActivate);
      conf.setConfigurators(configurators);
      conf.setActivityBehaviorFactory(activityBehaviorFactory);
      return conf;
    }

    public void setDataSource(DataSource dataSource) {
       this.dataSource = dataSource;
    }

    public void setDatabaseSchemaUpdate(String databaseSchemaUpdate) {
      this.databaseSchemaUpdate = databaseSchemaUpdate;
    }

    public void setJobExecutorActivate(boolean jobExecutorActivate) {
      this.jobExecutorActivate = jobExecutorActivate;
    }

    public void setConfigurators(List<ProcessEngineConfigurator> configurators) {
      this.configurators = configurators;
    }

    public void setActivityBehaviorFactory(ActivityBehaviorFactory activityBehaviorFactory)
    {
        this.activityBehaviorFactory = activityBehaviorFactory;
    }
}
