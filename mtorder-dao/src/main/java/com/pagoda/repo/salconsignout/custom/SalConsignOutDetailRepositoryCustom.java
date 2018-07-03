package com.pagoda.repo.salconsignout.custom;

import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.domain.salconsignout.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalConsignOutDetail扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignOutDetailRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param stockoutId
   * @param stockoutSeqno
   * @param conId
   * @param conSeqno
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salUnitId
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param shippedQty
   * @param shippedNetWeight
   * @param shippedGrossWeight
   * @param shippedVolume
   * @param shippedPrice
   * @param shippedAmt
   * @param taxRate
   * @param taxAmt
   * @param shipSeq
   * @param consignTime
   * @param consignerId
   * @param consignerName
   * @param stockoutStatus
   * @param auditTime
   * @param auditorCode
   * @param auditorName
   * @param remark
   * @param note
   * @param pageable
   * @return
   */
  Page<SalConsignOutDetailDTO> findBy(
      @Param("stockoutId") Long stockoutId,
      @Param("stockoutSeqno") String stockoutSeqno,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("shipSeq") Integer shipSeq,
      @Param("consignTime") java.sql.Timestamp consignTime,
      @Param("consignerId") Long consignerId,
      @Param("consignerName") String consignerName,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("note") String note,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param stockoutId
   * @param stockoutSeqno
   * @param conId
   * @param conSeqno
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salUnitId
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param shippedQty
   * @param shippedNetWeight
   * @param shippedGrossWeight
   * @param shippedVolume
   * @param shippedPrice
   * @param shippedAmt
   * @param taxRate
   * @param taxAmt
   * @param shipSeq
   * @param consignTime
   * @param consignerId
   * @param consignerName
   * @param stockoutStatus
   * @param auditTime
   * @param auditorCode
   * @param auditorName
   * @param remark
   * @param note
   * @return
   */
  List<SalConsignOutDetailDTO> findBy(
      @Param("stockoutId") Long stockoutId,
      @Param("stockoutSeqno") String stockoutSeqno,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("shipSeq") Integer shipSeq,
      @Param("consignTime") java.sql.Timestamp consignTime,
      @Param("consignerId") Long consignerId,
      @Param("consignerName") String consignerName,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("note") String note);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalConsignOutDetailDTO> findByExample(
      @Param("example") SalConsignOutDetail example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalConsignOutDetailDTO> findByExample(@Param("example") SalConsignOutDetail example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalConsignOutDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalConsignOutDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<SalConsignOutDetailDTO> findByFuzzySearch(
      @Param("example") SalConsignOutDetail example,
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
  Page<SalConsignOutDetailDTO> findByField(
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
  List<SalConsignOutDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
