package com.pagoda.repo.goods.custom;

import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasGoodsProcessDetail扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasGoodsProcessDetailRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param goodsProcId
   * @param goodsProcCode
   * @param goodsProcName
   * @param feeCode
   * @param feeName
   * @param feeAmt
   * @param remark
   * @param rankNum
   * @param entId
   * @param pageable
   * @return
   */
  Page<BasGoodsProcessDetailDTO> findBy(
      @Param("goodsProcId") Long goodsProcId,
      @Param("goodsProcCode") String goodsProcCode,
      @Param("goodsProcName") String goodsProcName,
      @Param("feeCode") String feeCode,
      @Param("feeName") String feeName,
      @Param("feeAmt") java.math.BigDecimal feeAmt,
      @Param("remark") String remark,
      @Param("rankNum") Integer rankNum,
      @Param("entId") Long entId,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param goodsProcId
   * @param goodsProcCode
   * @param goodsProcName
   * @param feeCode
   * @param feeName
   * @param feeAmt
   * @param remark
   * @param rankNum
   * @param entId
   * @return
   */
  List<BasGoodsProcessDetailDTO> findBy(
      @Param("goodsProcId") Long goodsProcId,
      @Param("goodsProcCode") String goodsProcCode,
      @Param("goodsProcName") String goodsProcName,
      @Param("feeCode") String feeCode,
      @Param("feeName") String feeName,
      @Param("feeAmt") java.math.BigDecimal feeAmt,
      @Param("remark") String remark,
      @Param("rankNum") Integer rankNum,
      @Param("entId") Long entId);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasGoodsProcessDetailDTO> findByExample(
      @Param("example") BasGoodsProcessDetail example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasGoodsProcessDetailDTO> findByExample(@Param("example") BasGoodsProcessDetail example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasGoodsProcessDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasGoodsProcessDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasGoodsProcessDetailDTO> findByFuzzySearch(
      @Param("example") BasGoodsProcessDetail example,
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
  Page<BasGoodsProcessDetailDTO> findByField(
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
  List<BasGoodsProcessDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
