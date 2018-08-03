package com.pagoda.test.config;

import com.pagoda.test.aop.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 审计日志配置
 *
 * @author PagodaGenerator
 * @generated
 */
@javax.annotation.Generated("com.pagoda.platform.PagodaProcessor")
@Configuration
@ConditionalOnProperty(name = "cas.enable", havingValue = "true", matchIfMissing = false)
public class AuditLogConfiguration {

  @Bean
  @ConditionalOnProperty(name = "auditLog.enabled", havingValue = "true", matchIfMissing = false)
  AuditLogHandlerInterceptor auditLogHandlerInterceptor() {
    return new AuditLogHandlerInterceptor();
  }
}
