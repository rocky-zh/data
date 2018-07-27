package com.pagoda.test;

import com.pagoda.test.config.*;
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
@ComponentScan({"com.pagoda.test.service", "com.pagoda.test.repo", "com.pagoda.test.config"})
@DubboServiceScan("com.pagoda.test.service")
@EnableJpaRepositories(
  basePackages = "com.pagoda.test.repo",
  repositoryBaseClass = PagodaJpaRepositoryImpl.class,
  repositoryFactoryBeanClass = PagodaJpaRepositoryFactoryBean.class
)
public class TestTimeProviderConfiguration {}
