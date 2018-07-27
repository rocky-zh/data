package com.pagoda.test.service.config;

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
@Configuration("serviceXxlJob")
@ConditionalOnProperty(name = "xxl.job.enabled", havingValue = "true", matchIfMissing = false)
@ConditionalOnClass({IJobHandler.class})
public class XxlJobConfig {

  @Value("${xxl.job.admin.addresses}")
  private String adminAddresses;

  @Value("${xxl.job.executor.appname}")
  private String appName;

  @Value("${xxl.job.executor.ip}")
  private String ip;

  @Value("${xxl.job.executor.port}")
  private int port;

  @Value("${xxl.job.accessToken}")
  private String accessToken;

  @Value("${xxl.job.executor.logpath}")
  private String logPath;

  @Value("${xxl.job.executor.logretentiondays}")
  private int logRetentionDays;

  @ConditionalOnMissingBean
  @Bean(initMethod = "start", destroyMethod = "destroy")
  public XxlJobExecutor xxlJobExecutor() {
    log.info(">>>>>>>>>>> xxl-job config init.");
    XxlJobExecutor xxlJobExecutor = new XxlJobExecutor();
    xxlJobExecutor.setAdminAddresses(adminAddresses);
    xxlJobExecutor.setAppName(appName);
    xxlJobExecutor.setIp(ip);
    xxlJobExecutor.setPort(port);
    xxlJobExecutor.setAccessToken(accessToken);
    xxlJobExecutor.setLogPath(logPath);
    xxlJobExecutor.setLogRetentionDays(logRetentionDays);

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
