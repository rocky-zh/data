package com.pagoda.config;

import com.xxl.job.core.executor.XxlJobExecutor;
import com.xxl.job.core.handler.IJobHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/**
 * xxl-job config
 *
 * @author PagodaGenerator
 * @generated
 */
@Slf4j
@Configuration("webXxlJob")
@ConditionalOnProperty(name = "xxl.job.enabled", havingValue = "true", matchIfMissing = false)
public class XxlJobConfig {

  @Bean(initMethod = "start", destroyMethod = "destroy")
  @ConditionalOnMissingBean
  @ConfigurationProperties(prefix = "xxl.job")
  public XxlJobExecutor xxlJobExecutor() {
    log.info(">>>>>>>>>>> xxl-job config init.");
    XxlJobExecutor xxlJobExecutor = new XxlJobExecutor();
    try {
      Field jobHandlerRepository = XxlJobExecutor.class.getDeclaredField("jobHandlerRepository");
      jobHandlerRepository.setAccessible(true);
      ConcurrentHashMap<String, IJobHandler> map =
          (ConcurrentHashMap<String, IJobHandler>) jobHandlerRepository.get(null);
      map.clear();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return xxlJobExecutor;
  }
}
