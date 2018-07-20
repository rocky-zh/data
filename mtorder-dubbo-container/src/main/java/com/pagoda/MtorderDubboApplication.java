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
          com.pagoda.domain.purapply.PurApplyHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.purapply.PurApplyHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.purapply.PurApplyDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.purapply.PurApplyDetailDTO.class,
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
          com.pagoda.domain.purorder.PurOrderHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.purorder.PurOrderHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.purorder.PurOrderDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.purorder.PurOrderDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.pridistribution.SalOrgCus.class,
          new DtoSerializer(
              com.pagoda.api.dto.pridistribution.SalOrgCusDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.purorgven.PurOrgVen.class,
          new DtoSerializer(
              com.pagoda.api.dto.purorgven.PurOrgVenDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.purorgven.PurOrgVenGoods.class,
          new DtoSerializer(
              com.pagoda.api.dto.purorgven.PurOrgVenGoodsDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.purorgven.BasVenRebateGoodsDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.purorgven.BasVenRebateGoodsDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.purorgven.BasVenRebateHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.purorgven.BasVenRebateHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.purorgven.BasVenRebateOrgDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.purorgven.BasVenRebateOrgDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.prilimitmanage.PriceLimitCusRecord.class,
          new DtoSerializer(
              com.pagoda.api.dto.prilimitmanage.PriceLimitCusRecordDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.prilimitmanage.PriceLimitCatRecord.class,
          new DtoSerializer(
              com.pagoda.api.dto.prilimitmanage.PriceLimitCatRecordDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.prilimitmanage.PriceLimitOperaHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.prilimitmanage.PriceLimitOperaHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.prilimitmanage.PriceLimitCusDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.prilimitmanage.PriceLimitCusDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.prilimitmanage.PriceLimitGoodsDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.prilimitmanage.PriceLimitGoodsDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.goods.BasOrgGoods.class,
          new DtoSerializer(
              com.pagoda.api.dto.goods.BasOrgGoodsDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.driverdata.BasDriver.class,
          new DtoSerializer(
              com.pagoda.api.dto.driverdata.BasDriverDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salebasicdefinition.BasWrapperWithGoods.class,
          new DtoSerializer(
              com.pagoda.api.dto.salebasicdefinition.BasWrapperWithGoodsDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salebasicdefinition.BasRoute.class,
          new DtoSerializer(
              com.pagoda.api.dto.salebasicdefinition.BasRouteDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.salebasicdefinition.SalOrderControl.class,
          new DtoSerializer(
              com.pagoda.api.dto.salebasicdefinition.SalOrderControlDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.goods.BasOrgGoodsvar.class,
          new DtoSerializer(
              com.pagoda.api.dto.goods.BasOrgGoodsvarDTO.class,
              serializerFactory.getClassLoader()));
    } catch (Exception e) {
      log.error("addDubboSerializer", e);
    }
  }
}
