package com.pagoda.config;

import com.pagoda.aop.*;
import com.pagoda.platform.jms.audit.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

  @Value("${spring.application.code:default_code}")
  private String applicationCode;

  @Value("${spring.application.name:default_name}")
  private String applicationName;

  @Bean
  @ConditionalOnProperty(name = "auditLog.enabled", havingValue = "true", matchIfMissing = false)
  AuditLogHandlerInterceptor auditLogHandlerInterceptor(AuditLogSender auditLogSender) {
    return new AuditLogHandlerInterceptor(auditLogSender, applicationCode, applicationName);
  }

  @EnableBinding({AuditProcessor.class}) // 可以理解为是一个消息的发送管道的定义
  public static class AuditLogSenderImpl implements AuditLogSender {
    @Resource private MessageChannel output; // 消息的发送管道

    @SendTo(AuditProcessor.OUTPUT) // 返回处理结果到output通道
    @Override
    public void send(AuditLogProviderDTO auditLogProviderDTO) {
      this.output.send(MessageBuilder.withPayload(auditLogProviderDTO).build()); // 创建并发送消息
    }
  }
}
