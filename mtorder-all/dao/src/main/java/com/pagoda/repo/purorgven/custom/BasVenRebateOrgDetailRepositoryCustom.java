package com.pagoda.repo.purorgven.custom;

import com.pagoda.api.dto.purorgven.*;
import com.pagoda.domain.purorgven.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasVenRebateOrgDetail扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasVenRebateOrgDetailRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param rebateId
   * @param rebateNo
   * @param arrOrgId
   * @param arrOrgCode
   * @param arrOrgName
   * @param entId
   * @param effectDate
   * @param expiryDate
   * @param status
   * @param remark
   * @param pageable
   * @return
   */
  Page<BasVenRebateOrgDetailDTO> findBy(
      @Param("rebateId") Long rebateId,
      @Param("rebateNo") String rebateNo,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("entId") Long entId,
      @Param("effectDate") java.util.Date effectDate,
      @Param("expiryDate") java.util.Date expiryDate,
      @Param("status") Integer status,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param rebateId
   * @param rebateNo
   * @param arrOrgId
   * @param arrOrgCode
   * @param arrOrgName
   * @param entId
   * @param effectDate
   * @param expiryDate
   * @param status
   * @param remark
   * @return
   */
  List<BasVenRebateOrgDetailDTO> findBy(
      @Param("rebateId") Long rebateId,
      @Param("rebateNo") String rebateNo,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("entId") Long entId,
      @Param("effectDate") java.util.Date effectDate,
      @Param("expiryDate") java.util.Date expiryDate,
      @Param("status") Integer status,
      @Param("remark") String remark);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasVenRebateOrgDetailDTO> findByExample(
      @Param("example") BasVenRebateOrgDetail example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasVenRebateOrgDetailDTO> findByExample(@Param("example") BasVenRebateOrgDetail example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasVenRebateOrgDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasVenRebateOrgDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasVenRebateOrgDetailDTO> findByFuzzySearch(
      @Param("example") BasVenRebateOrgDetail example,
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
  Page<BasVenRebateOrgDetailDTO> findByField(
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
  List<BasVenRebateOrgDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
