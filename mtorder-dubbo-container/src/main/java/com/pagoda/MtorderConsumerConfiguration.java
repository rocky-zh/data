package com.pagoda;

import com.pagoda.config.*;
import com.pagoda.platform.dubbo.annotation.*;
import com.pagoda.platform.jms.jpa.*;

import com.alibaba.dubbo.config.*;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.pagoda.platform.opentracing.OpentracingConfiguration;
import org.springframework.core.env.Environment;

/**
 * Dubbo服务消费者,注意修改DubboReferenceScan注解扫描的包名
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
@ImportResource(value = {"classpath*:META-INF/spring/*-dubbo-consumer.xml"})
@ConditionalOnProperty(name = "dubbo.consumer", havingValue = "true", matchIfMissing = false)
@DubboReferenceScan(
  value = {"xxx.api"},
  scope = "remote"
)
public class MtorderConsumerConfiguration {}
