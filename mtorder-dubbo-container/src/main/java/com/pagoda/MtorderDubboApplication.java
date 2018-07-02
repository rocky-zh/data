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
public class MtorderDubboApplication {

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
    ApplicationContext context = SpringApplication.run(MtorderDubboApplication.class, args);
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
          com.pagoda.domain.salconsign.SalConsignHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.salconsign.SalConsignHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salconsign.SalConsignDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.salconsign.SalConsignDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.purapplyorder.PurApplyHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.purapplyorder.PurApplyHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.purapplyorder.PurApplyDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.purapplyorder.PurApplyDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salorderhead.SalOrderDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.salorderhead.SalOrderDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salorderhead.SalOrderHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.salorderhead.SalOrderHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salorderhead.SalPreOrderDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.salorderhead.SalPreOrderDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salorderhead.SalPreOrderHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.salorderhead.SalPreOrderHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salconsignout.SalConsignOutHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.salconsignout.SalConsignOutHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salconsignout.SalConsignOutDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.salconsignout.SalConsignOutDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salconsignout.SalConsignOutExceptionLog.class,
          new DtoSerializer(
              com.pagoda.api.dto.salconsignout.SalConsignOutExceptionLogDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salconsignreturn.SalConsignReturnHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.salconsignreturn.SalConsignReturnHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salconsignreturn.SalConsignReturnDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.salconsignreturn.SalConsignReturnDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salorderhead.SalOrderDetailGoodsQty.class,
          new DtoSerializer(
              com.pagoda.api.dto.salorderhead.SalOrderDetailGoodsQtyDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.pripurchase.PriceAdjustPurHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.pripurchase.PriceAdjustPurHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.pridistribution.PriceCatalogSalDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.pridistribution.PriceCatalogSalDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.pridistribution.PriceCatalogSalHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.pridistribution.PriceCatalogSalHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.pridistribution.PriceAdjustSalDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.pridistribution.PriceAdjustSalDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.pridistribution.PriceAdjustSalHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.pridistribution.PriceAdjustSalHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.pripurchase.PriceAdjustPurDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.pripurchase.PriceAdjustPurDetailDTO.class,
              serializerFactory.getClassLoader()));
    } catch (Exception e) {
      log.error("addDubboSerializer", e);
    }
  }
}
