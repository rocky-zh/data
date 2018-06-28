package com.pagoda;

import com.alibaba.dcm.DnsCacheManipulator;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.concurrent.*;
import java.io.File;

/**
 * Spring Boot 启动过程定制化
 *
 * @author PagodaGenerator
 * @generated
 */
@Slf4j
public class CustomApplicationContextInitializer
    implements ApplicationContextInitializer, ApplicationListener {

  public static final String LOCALHOST = "localhost";
  public static final String APOLLO_DEFAULT_ENV_VALUE = "DEV";
  public static final String APOLLO_ENV = "env";
  public static final String APOLLO_SERVER = "apolloServer";
  public static final String APOLLO_SERVER_CONFIG = "apollo.server";
  public static final String APOLLO_ENV_CONFIG = "apollo.env";
  public static final String ZOOKEEPER_EMBED = "zookeeper.embed";

  ThreadFactory namedThreadFactory =
      new ThreadFactoryBuilder().setNameFormat("Zookeeper-Embed-Server").setDaemon(true).build();
  ExecutorService singleThreadPool =
      new ThreadPoolExecutor(
          1,
          1,
          0L,
          TimeUnit.MILLISECONDS,
          new LinkedBlockingQueue<Runnable>(1),
          namedThreadFactory,
          new ThreadPoolExecutor.AbortPolicy());

  @Override
  public void initialize(ConfigurableApplicationContext applicationContext) {
    log.info("自定义的初始化器的initialize方法被执行了");
    try {
      ConfigurableEnvironment environment = applicationContext.getEnvironment();
      // 是否启用嵌入式的zookeeper 用于本地测试环境
      if (Boolean.parseBoolean(
          environment.getProperty(ZOOKEEPER_EMBED, Boolean.FALSE.toString()))) {
        singleThreadPool.submit(
            () -> {
              StandaloneZookeeperServer.startStandaloneServer1(
                  "2000",
                  new File(System.getProperty("java.io.tmpdir"), "zookeeper").getAbsolutePath(),
                  "2181",
                  "10",
                  "5");
            });
      }
      // apollo配置中心，env指定查找参数的环境
      String apolloEnv = environment.getProperty(APOLLO_ENV_CONFIG);
      if (StringUtils.isEmpty(apolloEnv)) {
        apolloEnv = APOLLO_DEFAULT_ENV_VALUE;
      }
      System.setProperty(APOLLO_ENV, apolloEnv);
      String applloServer = environment.getProperty(APOLLO_SERVER_CONFIG);
      if (StringUtils.isEmpty(applloServer) == false) {
        DnsCacheManipulator.setDnsCache(APOLLO_SERVER, applloServer);
      }
    } catch (Exception e) {
      log.error("CustomApplicationContextInitializer.initialize", e);
    }
  }

  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    // 监听ApplicationStartingEvent
    if (event instanceof ApplicationStartingEvent) {
      log.info("ApplicationStartingEvent listened");
    }

    // 监听ApplicationEnvironmentPreparedEvent
    else if (event instanceof ApplicationEnvironmentPreparedEvent) {
      log.info("ApplicationEnvironmentPreparedEvent listened");
    }

    // 监听ApplicationPreparedEvent
    else if (event instanceof ApplicationPreparedEvent) {
      log.info("ApplicationPreparedEvent listened");
    }

    // 监听ApplicationReadyEvent
    else if (event instanceof ApplicationReadyEvent) {
      log.info("ApplicationReadyEvent listened");
    }

    // 监听ApplicationFailedEvent
    else if (event instanceof ApplicationFailedEvent) {
      log.info("ApplicationFailedEvent listened");
    }
  }
}
