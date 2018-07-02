package com.pagoda.repo.salconsign.custom;

import com.pagoda.api.dto.salconsign.*;
import com.pagoda.domain.salconsign.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalConsignHead扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignHeadRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param orderId
   * @param orderNo
   * @param waveNo
   * @param tatalQty
   * @param totalAmt
   * @param entryDate
   * @param conStatus
   * @param printStatus
   * @param printCount
   * @param seqno
   * @param entId
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param transitLineNo
   * @param taxAmt
   * @param shippedQty
   * @param shippedAmt
   * @param preArrivalDate
   * @param remark
   * @param pageable
   * @return
   */
  Page<SalConsignHeadDTO> findBy(
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("waveNo") String waveNo,
      @Param("tatalQty") java.math.BigDecimal tatalQty,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("entryDate") java.sql.Timestamp entryDate,
      @Param("conStatus") Integer conStatus,
      @Param("printStatus") Integer printStatus,
      @Param("printCount") Integer printCount,
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("transitLineNo") String transitLineNo,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param orderId
   * @param orderNo
   * @param waveNo
   * @param tatalQty
   * @param totalAmt
   * @param entryDate
   * @param conStatus
   * @param printStatus
   * @param printCount
   * @param seqno
   * @param entId
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param transitLineNo
   * @param taxAmt
   * @param shippedQty
   * @param shippedAmt
   * @param preArrivalDate
   * @param remark
   * @return
   */
  List<SalConsignHeadDTO> findBy(
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("waveNo") String waveNo,
      @Param("tatalQty") java.math.BigDecimal tatalQty,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("entryDate") java.sql.Timestamp entryDate,
      @Param("conStatus") Integer conStatus,
      @Param("printStatus") Integer printStatus,
      @Param("printCount") Integer printCount,
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("transitLineNo") String transitLineNo,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("remark") String remark);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalConsignHeadDTO> findByExample(
      @Param("example") SalConsignHead example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalConsignHeadDTO> findByExample(@Param("example") SalConsignHead example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalConsignHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalConsignHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<SalConsignHeadDTO> findByFuzzySearch(
      @Param("example") SalConsignHead example,
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
  Page<SalConsignHeadDTO> findByField(
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
  List<SalConsignHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
