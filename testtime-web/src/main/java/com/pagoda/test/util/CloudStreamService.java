package com.pagoda.test.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

/**
 * 封装消息队列调用
 *
 * @author PagodaGenerator
 * @generated
 */
@EnableBinding(Processor.class)
public class CloudStreamService {

  @Autowired private Processor stream;

  public void sendMessage(String msg) {
    try {
      stream.output().send(MessageBuilder.withPayload(msg).build());
    } catch (Exception e) {

      e.printStackTrace();
    }
  }

  // 监听 binding 为 Processor.INPUT 的消息
  @StreamListener(Processor.INPUT)
  public void receive(Message<String> message) {
    System.out.println("收到：" + message.getPayload());
  }
}
