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
public class MtbasedataDubboApplication {

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
    ApplicationContext context = SpringApplication.run(MtbasedataDubboApplication.class, args);
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
          com.pagoda.domain.unit.BasUnit.class,
          new DtoSerializer(
              com.pagoda.api.dto.unit.BasUnitDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasOrg.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasOrgDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasOrgBal.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasOrgBalDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.goods.BasGoodsProcessHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.goods.BasGoodsProcessHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.goods.BasGoodsProcessDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.goods.BasGoodsProcessDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasOrgCus.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasOrgCusDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasOrgDep.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasOrgDepDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.goods.BasOrgGoods.class,
          new DtoSerializer(
              com.pagoda.api.dto.goods.BasOrgGoodsDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasOrgGroupOrg.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasOrgGroupOrgDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasOrgOrg.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasOrgOrgDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasOrgVen.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasOrgVenDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasPost.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasPostDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.ven.BasVenRebateGoodsDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.ven.BasVenRebateGoodsDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.ven.BasVenRebateHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.ven.BasVenRebateHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.ven.BasVenRebateOrgDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.ven.BasVenRebateOrgDetailDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.ven.PurOrgVen.class,
          new DtoSerializer(
              com.pagoda.api.dto.ven.PurOrgVenDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.ven.PurOrgVenGoods.class,
          new DtoSerializer(
              com.pagoda.api.dto.ven.PurOrgVenGoodsDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.ent.SysEnt.class,
          new DtoSerializer(
              com.pagoda.api.dto.ent.SysEntDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.ent.SysEntParam.class,
          new DtoSerializer(
              com.pagoda.api.dto.ent.SysEntParamDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.cat.BasCatClass.class,
          new DtoSerializer(
              com.pagoda.api.dto.cat.BasCatClassDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.cat.BasCatClassExt.class,
          new DtoSerializer(
              com.pagoda.api.dto.cat.BasCatClassExtDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.cat.BasCatClassRel.class,
          new DtoSerializer(
              com.pagoda.api.dto.cat.BasCatClassRelDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.goods.BasGoodsClassCodeRule.class,
          new DtoSerializer(
              com.pagoda.api.dto.goods.BasGoodsClassCodeRuleDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasOrgBalBank.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasOrgBalBankDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.org.BasDistrict.class,
          new DtoSerializer(
              com.pagoda.api.dto.org.BasDistrictDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.goods.BasGoodsUnit.class,
          new DtoSerializer(
              com.pagoda.api.dto.goods.BasGoodsUnitDTO.class, serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.goods.BasGoodsBomHead.class,
          new DtoSerializer(
              com.pagoda.api.dto.goods.BasGoodsBomHeadDTO.class,
              serializerFactory.getClassLoader()));
      staticSerializerMap.put(
          com.pagoda.domain.goods.BasGoodsBomDetail.class,
          new DtoSerializer(
              com.pagoda.api.dto.goods.BasGoodsBomDetailDTO.class,
              serializerFactory.getClassLoader()));
    } catch (Exception e) {
      log.error("addDubboSerializer", e);
    }
  }
}
