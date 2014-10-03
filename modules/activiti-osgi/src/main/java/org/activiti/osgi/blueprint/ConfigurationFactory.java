package org.activiti.osgi.blueprint;

import javax.sql.DataSource;
import java.util.List;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.activiti.engine.cfg.ProcessEngineConfigurator;

public class ConfigurationFactory {

    DataSource dataSource;
    String databaseSchemaUpdate;
    boolean jobExecutorActivate = true;
    List<ProcessEngineConfigurator> configurators;

    public StandaloneProcessEngineConfiguration getConfiguration() {
  		StandaloneProcessEngineConfiguration conf =
              new StandaloneProcessEngineConfiguration();
      conf.setDataSource(dataSource);
      conf.setDatabaseSchemaUpdate(databaseSchemaUpdate);
      conf.setJobExecutorActivate(jobExecutorActivate);
      conf.setConfigurators(configurators);
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
}
