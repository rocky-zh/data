package com.pagoda.repo.salorderhead.custom;

import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.domain.salorderhead.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalOrderDetail扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalOrderDetailRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param goodsVarId
   * @param goodsVarName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salUnitid
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param requestQty
   * @param maxOrderQty
   * @param minOrderQty
   * @param price
   * @param discountPrice
   * @param discountRate
   * @param discountAmt
   * @param taxRate
   * @param taxAmt
   * @param goodsAmt
   * @param totalAmt
   * @param remark
   * @param sourceType
   * @param sourceId
   * @param sourceNo
   * @param pageable
   * @return
   */
  Page<SalOrderDetailDTO> findBy(
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsVarId") Long goodsVarId,
      @Param("goodsVarName") String goodsVarName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitid") Long salUnitid,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("maxOrderQty") java.math.BigDecimal maxOrderQty,
      @Param("minOrderQty") java.math.BigDecimal minOrderQty,
      @Param("price") java.math.BigDecimal price,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("discountAmt") java.math.BigDecimal discountAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("goodsAmt") java.math.BigDecimal goodsAmt,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("remark") String remark,
      @Param("sourceType") Integer sourceType,
      @Param("sourceId") Long sourceId,
      @Param("sourceNo") String sourceNo,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param goodsVarId
   * @param goodsVarName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salUnitid
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param requestQty
   * @param maxOrderQty
   * @param minOrderQty
   * @param price
   * @param discountPrice
   * @param discountRate
   * @param discountAmt
   * @param taxRate
   * @param taxAmt
   * @param goodsAmt
   * @param totalAmt
   * @param remark
   * @param sourceType
   * @param sourceId
   * @param sourceNo
   * @return
   */
  List<SalOrderDetailDTO> findBy(
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsVarId") Long goodsVarId,
      @Param("goodsVarName") String goodsVarName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitid") Long salUnitid,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("maxOrderQty") java.math.BigDecimal maxOrderQty,
      @Param("minOrderQty") java.math.BigDecimal minOrderQty,
      @Param("price") java.math.BigDecimal price,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("discountAmt") java.math.BigDecimal discountAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("goodsAmt") java.math.BigDecimal goodsAmt,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("remark") String remark,
      @Param("sourceType") Integer sourceType,
      @Param("sourceId") Long sourceId,
      @Param("sourceNo") String sourceNo);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalOrderDetailDTO> findByExample(
      @Param("example") SalOrderDetail example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalOrderDetailDTO> findByExample(@Param("example") SalOrderDetail example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalOrderDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalOrderDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<SalOrderDetailDTO> findByFuzzySearch(
      @Param("example") SalOrderDetail example,
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
  Page<SalOrderDetailDTO> findByField(
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
  List<SalOrderDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
