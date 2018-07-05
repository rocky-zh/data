package com.pagoda.repo.ven.custom;

import com.pagoda.api.dto.ven.*;
import com.pagoda.domain.ven.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasVenRebateHead扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasVenRebateHeadRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param no
   * @param balOrgCode
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param rebateMode
   * @param rebateRate
   * @param isAllEffect
   * @param beginDate
   * @param endDate
   * @param balOrgId
   * @param balOrgName
   * @param status
   * @param effectDate
   * @param expiryDate
   * @param remark
   * @param pageable
   * @return
   */
  Page<BasVenRebateHeadDTO> findBy(
      @Param("no") String no,
      @Param("balOrgCode") String balOrgCode,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("rebateMode") Integer rebateMode,
      @Param("rebateRate") java.math.BigDecimal rebateRate,
      @Param("isAllEffect") Integer isAllEffect,
      @Param("beginDate") java.util.Date beginDate,
      @Param("endDate") java.util.Date endDate,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("status") Integer status,
      @Param("effectDate") java.util.Date effectDate,
      @Param("expiryDate") java.util.Date expiryDate,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param no
   * @param balOrgCode
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param rebateMode
   * @param rebateRate
   * @param isAllEffect
   * @param beginDate
   * @param endDate
   * @param balOrgId
   * @param balOrgName
   * @param status
   * @param effectDate
   * @param expiryDate
   * @param remark
   * @return
   */
  List<BasVenRebateHeadDTO> findBy(
      @Param("no") String no,
      @Param("balOrgCode") String balOrgCode,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("rebateMode") Integer rebateMode,
      @Param("rebateRate") java.math.BigDecimal rebateRate,
      @Param("isAllEffect") Integer isAllEffect,
      @Param("beginDate") java.util.Date beginDate,
      @Param("endDate") java.util.Date endDate,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("status") Integer status,
      @Param("effectDate") java.util.Date effectDate,
      @Param("expiryDate") java.util.Date expiryDate,
      @Param("remark") String remark);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasVenRebateHeadDTO> findByExample(
      @Param("example") BasVenRebateHead example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasVenRebateHeadDTO> findByExample(@Param("example") BasVenRebateHead example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasVenRebateHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasVenRebateHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasVenRebateHeadDTO> findByFuzzySearch(
      @Param("example") BasVenRebateHead example,
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
  Page<BasVenRebateHeadDTO> findByField(
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
  List<BasVenRebateHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
