package com.pagoda.test;

import com.alibaba.com.caucho.hessian.io.*;
import com.alibaba.dubbo.common.serialize.support.hessian.Hessian2SerializerFactory;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

import com.ctrip.framework.apollo.spring.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.data.domain.Sort;
import org.springframework.util.ClassUtils;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import com.pagoda.platform.dubbo.util.SortParamSerializer;
import com.pagoda.platform.dubbo.util.SortParamDeserializer;
import com.pagoda.platform.jms.ApplicationContextHolder;

/**
 * @author PagodaGenerator
 * @generated
 */
@javax.annotation.Generated("com.pagoda.platform.PagodaProcessor")
@Slf4j
@EnableHystrix
@EnableApolloConfig
@SpringBootApplication
public class TestTimeDubboApplication {

  /**
   * 请求日志
   *
   * @return
   */
  @Bean
  public CommonsRequestLoggingFilter requestLoggingFilter() {
    CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
    filter.setIncludeClientInfo(true);
    filter.setIncludeQueryString(true);
    filter.setIncludePayload(true);
    filter.setMaxPayloadLength(10000);
    filter.setIncludeHeaders(true);
    return filter;
  }

  public static void main(String[] args) throws InterruptedException {
    addDubboSerializer();
    ApplicationContext context = SpringApplication.run(TestTimeDubboApplication.class, args);
    ApplicationContextHolder.setApplicationContext(context);
  }

  private static void addDubboSerializer() {
    try {
      // Dubbo序列化处理
      SerializerFactory serializerFactory = Hessian2SerializerFactory.SERIALIZER_FACTORY;
      Field staticSerializerField =
          SerializerFactory.class.getDeclaredField("_staticSerializerMap");
      staticSerializerField.setAccessible(true);
      Map staticSerializerMap = (Map) staticSerializerField.get(serializerFactory);

      Field deserializer = SerializerFactory.class.getDeclaredField("_staticDeserializerMap");
      deserializer.setAccessible(true);
      Map staticDeserializerMap = (HashMap) deserializer.get(null);
      // 处理排序参数序列化
      staticSerializerMap.put(com.pagoda.test.api.SortParam.class, SortParamSerializer.instance);
      staticSerializerMap.put(Sort.class, SortParamSerializer.instance);
      staticDeserializerMap.put(
          com.pagoda.test.api.SortParam.class, SortParamDeserializer.instance);
      staticDeserializerMap.put(Sort.class, SortParamDeserializer.instance);

      ClassLoader factoryLoader = serializerFactory.getClassLoader();
      // 处理DTO序列化
      addDtoSerializer(
          staticSerializerMap,
          "com.pagoda.test.domain.timegroup.SalConsignDetail",
          "com.pagoda.test.api.dto.timegroup.SalConsignDetailDTO",
          factoryLoader);
      addDtoSerializer(
          staticSerializerMap,
          "com.pagoda.test.domain.timegroup.BasDriver",
          "com.pagoda.test.api.dto.timegroup.BasDriverDTO",
          factoryLoader);
      addDtoSerializer(
          staticSerializerMap,
          "com.pagoda.test.domain.timegroup.PurOrgVen",
          "com.pagoda.test.api.dto.timegroup.PurOrgVenDTO",
          factoryLoader);
    } catch (Exception e) {
      log.error("addDubboSerializer", e);
    }
  }

  private static void addDtoSerializer(
      Map staticSerializerMap, String entityClass, String dtoClass, ClassLoader factoryLoader)
      throws ClassNotFoundException {
    if (ClassUtils.isPresent(entityClass, null) && ClassUtils.isPresent(dtoClass, null)) {
      staticSerializerMap.put(
          ClassUtils.forName(entityClass, null),
          new DtoSerializer(ClassUtils.forName(dtoClass, null), factoryLoader));
    }
  }
}
