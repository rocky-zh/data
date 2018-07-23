package com.pagoda.repo.salebasicdefinition.custom;

import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.domain.salebasicdefinition.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasWrapperWithGoods扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasWrapperWithGoodsRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param mainGoodsId
   * @param mainGoodsCode
   * @param mainGoodsName
   * @param mainUnitId
   * @param mainUnitName
   * @param mainCardinal
   * @param wrapGoodsId
   * @param wrapGoodsCode
   * @param wrapGoodsName
   * @param wrapUnitId
   * @param wrapUnitName
   * @param wrapCardinal
   * @param isRound
   * @param isEnabled
   * @param pageable
   * @return
   */
  Page<BasWrapperWithGoodsDTO> findBy(
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("mainGoodsId") Long mainGoodsId,
      @Param("mainGoodsCode") String mainGoodsCode,
      @Param("mainGoodsName") String mainGoodsName,
      @Param("mainUnitId") Long mainUnitId,
      @Param("mainUnitName") String mainUnitName,
      @Param("mainCardinal") java.math.BigDecimal mainCardinal,
      @Param("wrapGoodsId") Long wrapGoodsId,
      @Param("wrapGoodsCode") String wrapGoodsCode,
      @Param("wrapGoodsName") String wrapGoodsName,
      @Param("wrapUnitId") Long wrapUnitId,
      @Param("wrapUnitName") String wrapUnitName,
      @Param("wrapCardinal") java.math.BigDecimal wrapCardinal,
      @Param("isRound") Integer isRound,
      @Param("isEnabled") Integer isEnabled,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param mainGoodsId
   * @param mainGoodsCode
   * @param mainGoodsName
   * @param mainUnitId
   * @param mainUnitName
   * @param mainCardinal
   * @param wrapGoodsId
   * @param wrapGoodsCode
   * @param wrapGoodsName
   * @param wrapUnitId
   * @param wrapUnitName
   * @param wrapCardinal
   * @param isRound
   * @param isEnabled
   * @return
   */
  List<BasWrapperWithGoodsDTO> findBy(
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("mainGoodsId") Long mainGoodsId,
      @Param("mainGoodsCode") String mainGoodsCode,
      @Param("mainGoodsName") String mainGoodsName,
      @Param("mainUnitId") Long mainUnitId,
      @Param("mainUnitName") String mainUnitName,
      @Param("mainCardinal") java.math.BigDecimal mainCardinal,
      @Param("wrapGoodsId") Long wrapGoodsId,
      @Param("wrapGoodsCode") String wrapGoodsCode,
      @Param("wrapGoodsName") String wrapGoodsName,
      @Param("wrapUnitId") Long wrapUnitId,
      @Param("wrapUnitName") String wrapUnitName,
      @Param("wrapCardinal") java.math.BigDecimal wrapCardinal,
      @Param("isRound") Integer isRound,
      @Param("isEnabled") Integer isEnabled);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasWrapperWithGoodsDTO> findByExample(
      @Param("example") BasWrapperWithGoods example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasWrapperWithGoodsDTO> findByExample(@Param("example") BasWrapperWithGoods example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasWrapperWithGoodsDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasWrapperWithGoodsDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasWrapperWithGoodsDTO> findByFuzzySearch(
      @Param("example") BasWrapperWithGoods example,
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
  Page<BasWrapperWithGoodsDTO> findByField(
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
  List<BasWrapperWithGoodsDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
