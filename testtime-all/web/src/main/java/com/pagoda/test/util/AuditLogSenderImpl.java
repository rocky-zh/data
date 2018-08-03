package com.pagoda.test.util;

import com.pagoda.platform.jms.audit.*;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.handler.annotation.SendTo;

import javax.annotation.Resource;

/**
 * 审计日志发送
 *
 * @author PagodaGenerator
 * @generated
 */
@javax.annotation.Generated("com.pagoda.platform.PagodaProcessor")
@EnableBinding({AuditProcessor.class}) // 可以理解为是一个消息的发送管道的定义
public class AuditLogSenderImpl implements AuditLogSender {
  @Resource private MessageChannel output; // 消息的发送管道

  @SendTo(AuditProcessor.OUTPUT) // 返回处理结果到output通道
  @Override
  public void send(AuditLogProviderDTO auditLogProviderDTO) {
    this.output.send(MessageBuilder.withPayload(auditLogProviderDTO).build()); // 创建并发送消息
  }
}
