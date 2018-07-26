package com.test;

import com.test.config.*;
import com.pagoda.platform.dubbo.annotation.*;
import com.pagoda.platform.jms.jpa.*;

import com.alibaba.dubbo.config.ApplicationConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.pagoda.platform.opentracing.OpentracingConfiguration;

/**
 * Dubbo服务提供者
 *
 * @author PagodaGenerator
 * @generated
 */
@Import(OpentracingConfiguration.class)
@Configuration
@ImportResource(value = {"classpath*:META-INF/spring/*-dubbo-provider.xml"})
@ComponentScan({"com.test.service", "com.test.repo", "com.test.config"})
@DubboServiceScan("com.test.service")
@EnableJpaRepositories(
  basePackages = "com.test.repo",
  repositoryBaseClass = PagodaJpaRepositoryImpl.class,
  repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class
)
public class PersonProviderConfiguration {}
