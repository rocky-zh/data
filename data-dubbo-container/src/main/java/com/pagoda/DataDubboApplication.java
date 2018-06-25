package com.pagoda;

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
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.data.domain.Sort;
import com.pagoda.platform.dubbo.util.SortParamSerializer;
import com.pagoda.platform.dubbo.util.SortParamDeserializer;
import com.pagoda.platform.jms.ApplicationContextHolder;

/**
 * @author PagodaGenerator
 * @generated
 */
@Slf4j
@EnableHystrix
@EnableApolloConfig
@SpringBootApplication
public class DataDubboApplication {

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
    ApplicationContext context = SpringApplication.run(DataDubboApplication.class, args);
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
      staticSerializerMap.put(com.pagoda.api.SortParam.class, SortParamSerializer.instance);
      staticSerializerMap.put(Sort.class, SortParamSerializer.instance);
      staticDeserializerMap.put(com.pagoda.api.SortParam.class, SortParamDeserializer.instance);
      staticDeserializerMap.put(Sort.class, SortParamDeserializer.instance);
      // 处理DTO序列化
      staticSerializerMap.put(
          com.pagoda.domain.group.BasDistrict.class,
          new DtoSerializer(
              com.pagoda.api.dto.group.BasDistrictDTO.class, serializerFactory.getClassLoader()));
    } catch (Exception e) {
      log.error("addDubboSerializer", e);
    }
  }
}
