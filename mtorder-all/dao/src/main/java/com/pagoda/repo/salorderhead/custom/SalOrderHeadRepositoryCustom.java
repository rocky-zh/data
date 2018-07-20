package com.pagoda.repo.salorderhead.custom;

import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.domain.salorderhead.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalOrderHead扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalOrderHeadRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param entId
   * @param seqno
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param preArrivalDate
   * @param transitLineNo
   * @param totalAmt
   * @param goodsAmt
   * @param taxAmt
   * @param totalRequestQty
   * @param orderType
   * @param inputMode
   * @param orderStatus
   * @param remark
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param commitTime
   * @param pageable
   * @return
   */
  Page<SalOrderHeadDTO> findBy(
      @Param("entId") Long entId,
      @Param("seqno") String seqno,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("transitLineNo") String transitLineNo,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("goodsAmt") java.math.BigDecimal goodsAmt,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("totalRequestQty") java.math.BigDecimal totalRequestQty,
      @Param("orderType") Integer orderType,
      @Param("inputMode") Integer inputMode,
      @Param("orderStatus") Integer orderStatus,
      @Param("remark") String remark,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("commitTime") java.util.Date commitTime,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param entId
   * @param seqno
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param preArrivalDate
   * @param transitLineNo
   * @param totalAmt
   * @param goodsAmt
   * @param taxAmt
   * @param totalRequestQty
   * @param orderType
   * @param inputMode
   * @param orderStatus
   * @param remark
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param commitTime
   * @return
   */
  List<SalOrderHeadDTO> findBy(
      @Param("entId") Long entId,
      @Param("seqno") String seqno,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("transitLineNo") String transitLineNo,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("goodsAmt") java.math.BigDecimal goodsAmt,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("totalRequestQty") java.math.BigDecimal totalRequestQty,
      @Param("orderType") Integer orderType,
      @Param("inputMode") Integer inputMode,
      @Param("orderStatus") Integer orderStatus,
      @Param("remark") String remark,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("commitTime") java.util.Date commitTime);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalOrderHeadDTO> findByExample(
      @Param("example") SalOrderHead example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalOrderHeadDTO> findByExample(@Param("example") SalOrderHead example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalOrderHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalOrderHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

  /**
   * 复杂条件更新
   *
   * @param builder
   * @return
   */
  int updateByBuilder(@Param("builder") JpaUpdateBuilder builder);

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
  Page<SalOrderHeadDTO> findByFuzzySearch(
      @Param("example") SalOrderHead example,
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
  Page<SalOrderHeadDTO> findByField(
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
  List<SalOrderHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
