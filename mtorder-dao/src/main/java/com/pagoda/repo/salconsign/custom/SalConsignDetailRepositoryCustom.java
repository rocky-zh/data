package com.pagoda.repo.salconsign.custom;

import com.pagoda.api.dto.salconsign.*;
import com.pagoda.domain.salconsign.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalConsignDetail扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignDetailRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param orderSeqno
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salunitId
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param grossWeight
   * @param netWeight
   * @param qty
   * @param volume
   * @param taxRate
   * @param price
   * @param discountRate
   * @param actualAmt
   * @param discountPrice
   * @param shippedPrice
   * @param shippedCount
   * @param pageable
   * @return
   */
  Page<SalConsignDetailDTO> findBy(
      @Param("orderSeqno") String orderSeqno,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salunitId") Long salunitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("grossWeight") java.math.BigDecimal grossWeight,
      @Param("netWeight") java.math.BigDecimal netWeight,
      @Param("qty") java.math.BigDecimal qty,
      @Param("volume") java.math.BigDecimal volume,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("price") java.math.BigDecimal price,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("actualAmt") java.math.BigDecimal actualAmt,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedCount") Integer shippedCount,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param orderSeqno
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salunitId
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param grossWeight
   * @param netWeight
   * @param qty
   * @param volume
   * @param taxRate
   * @param price
   * @param discountRate
   * @param actualAmt
   * @param discountPrice
   * @param shippedPrice
   * @param shippedCount
   * @return
   */
  List<SalConsignDetailDTO> findBy(
      @Param("orderSeqno") String orderSeqno,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salunitId") Long salunitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("grossWeight") java.math.BigDecimal grossWeight,
      @Param("netWeight") java.math.BigDecimal netWeight,
      @Param("qty") java.math.BigDecimal qty,
      @Param("volume") java.math.BigDecimal volume,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("price") java.math.BigDecimal price,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("actualAmt") java.math.BigDecimal actualAmt,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedCount") Integer shippedCount);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalConsignDetailDTO> findByExample(
      @Param("example") SalConsignDetail example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalConsignDetailDTO> findByExample(@Param("example") SalConsignDetail example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalConsignDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalConsignDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

  /**
   * 复杂条件更新
   *
   * @param builder
   * @return
   */
  // int updateByBuilder(@Param("builder") JpaUpdateBuilder builder);

  /**
   * 使用模糊查找方式，注意可能导致全表扫描
   *
   * @param example
   * @param fields, 模糊查找的字段（字符串类型）
   * @param stringMatcher，模糊查找方式，
   *     STARTING表示字符串前缀匹配类似str%，ENDING表示字符串后缀匹配类似%str，CONTAINING表示完全模糊匹配类似%str%
   * @param pageable
   * @return
   */
  Page<SalConsignDetailDTO> findByFuzzySearch(
      @Param("example") SalConsignDetail example,
      @Param("fields") List<String> fields,
      @Param("stringMatcher") ExampleMatcher.StringMatcher stringMatcher,
      @Param("pageable") Pageable pageable);

  /**
   * 查询某个字段的取值查询一组对象，通常用于查询匹配父表主键id的一组对象
   *
   * @param fieldName 模型字段名字（表字段，通常是外键，与父表的主键id匹配）
   * @param value 字段取值
   * @param pageable
   * @return
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  Page<SalConsignDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException;

  /**
   * 查询某个字段的取值查询一组对象，通常用于查询匹配父表主键id的一组对象
   *
   * @param fieldName 模型字段名字（表字段，通常是外键，与父表的主键id匹配）
   * @param value 字段取值
   * @return
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  List<SalConsignDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
