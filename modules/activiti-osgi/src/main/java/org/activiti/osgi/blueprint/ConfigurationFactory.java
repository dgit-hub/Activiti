package org.activiti.osgi.blueprint;

import javax.sql.DataSource;
import java.util.List;
import java.util.Set;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.activiti.engine.cfg.ProcessEngineConfigurator;
import org.activiti.engine.impl.bpmn.parser.factory.ActivityBehaviorFactory;
import org.activiti.engine.parse.BpmnParseHandler;
import org.activiti.engine.impl.event.EventHandler;
import org.activiti.engine.delegate.event.ActivitiEventListener;

public class ConfigurationFactory {

    DataSource dataSource;
    String databaseSchemaUpdate;
    boolean jobExecutorActivate = true;
    List<ProcessEngineConfigurator> configurators;
    List<BpmnParseHandler> customDefaultBpmnParseHandlers;
    ActivityBehaviorFactory activityBehaviorFactory;
    protected Set<Class<?>> customMybatisMappers;
    protected List<ActivitiEventListener> customEventListeners;

    public StandaloneProcessEngineConfiguration getConfiguration() {
  		StandaloneProcessEngineConfiguration conf =
              new StandaloneProcessEngineConfiguration();
      conf.setDataSource(dataSource);
      conf.setDatabaseSchemaUpdate(databaseSchemaUpdate);
      conf.setJobExecutorActivate(jobExecutorActivate);
      conf.setConfigurators(configurators);
        conf.setCustomDefaultBpmnParseHandlers(customDefaultBpmnParseHandlers);
      conf.setCustomMybatisMappers(customMybatisMappers);
      conf.setActivityBehaviorFactory(activityBehaviorFactory);
      conf.setEventListeners(customEventListeners);
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

    public void setCustomDefaultBpmnParseHandlers(List<BpmnParseHandler> customDefaultBpmnParseHandlers) {
        this.customDefaultBpmnParseHandlers = customDefaultBpmnParseHandlers;
    }

    public void setActivityBehaviorFactory(ActivityBehaviorFactory activityBehaviorFactory)
    {
        this.activityBehaviorFactory = activityBehaviorFactory;
    }

    public void setCustomMybatisMappers(Set<Class<?>> customMybatisMappers) {
        this.customMybatisMappers = customMybatisMappers;
    }

    public List<ActivitiEventListener> getCustomEventListeners() {
        return customEventListeners;
    }

    public void setCustomEventListeners(List<ActivitiEventListener> customEventListeners) {
        this.customEventListeners = customEventListeners;
    }

}
