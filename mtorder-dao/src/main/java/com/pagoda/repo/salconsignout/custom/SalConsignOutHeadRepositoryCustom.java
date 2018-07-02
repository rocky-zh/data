package com.pagoda.repo.salconsignout.custom;

import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.domain.salconsignout.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalConsignOutHead扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignOutHeadRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param seqno
   * @param entId
   * @param conId
   * @param conSeqno
   * @param preArrivalDate
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param transitLineNo
   * @param shippedQty
   * @param shippedGrossWeight
   * @param shippedNetWeight
   * @param shippedVolume
   * @param shippedAmt
   * @param taxAmt
   * @param stockoutStatus
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param remark
   * @param confirmUserCode
   * @param confirmUserName
   * @param confirmTime
   * @param pageable
   * @return
   */
  Page<SalConsignOutHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("transitLineNo") String transitLineNo,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("remark") String remark,
      @Param("confirmUserCode") String confirmUserCode,
      @Param("confirmUserName") String confirmUserName,
      @Param("confirmTime") java.sql.Timestamp confirmTime,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param seqno
   * @param entId
   * @param conId
   * @param conSeqno
   * @param preArrivalDate
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param transitLineNo
   * @param shippedQty
   * @param shippedGrossWeight
   * @param shippedNetWeight
   * @param shippedVolume
   * @param shippedAmt
   * @param taxAmt
   * @param stockoutStatus
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param remark
   * @param confirmUserCode
   * @param confirmUserName
   * @param confirmTime
   * @return
   */
  List<SalConsignOutHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("transitLineNo") String transitLineNo,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("remark") String remark,
      @Param("confirmUserCode") String confirmUserCode,
      @Param("confirmUserName") String confirmUserName,
      @Param("confirmTime") java.sql.Timestamp confirmTime);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalConsignOutHeadDTO> findByExample(
      @Param("example") SalConsignOutHead example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalConsignOutHeadDTO> findByExample(@Param("example") SalConsignOutHead example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalConsignOutHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalConsignOutHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<SalConsignOutHeadDTO> findByFuzzySearch(
      @Param("example") SalConsignOutHead example,
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
  Page<SalConsignOutHeadDTO> findByField(
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
  List<SalConsignOutHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
