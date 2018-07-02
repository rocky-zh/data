package com.pagoda.repo.salconsignreturn.custom;

import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.domain.salconsignreturn.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalConsignReturnHead扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignReturnHeadRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param returnType
   * @param returnDate
   * @param returnQty
   * @param stockinQty
   * @param stockinGrossWeight
   * @param stockinNetWeight
   * @param totalTaxAmt
   * @param totalReturnAmt
   * @param totalStockinAmt
   * @param status
   * @param pageable
   * @return
   */
  Page<SalConsignReturnHeadDTO> findBy(
      @Param("returnType") Integer returnType,
      @Param("returnDate") java.sql.Timestamp returnDate,
      @Param("returnQty") java.math.BigDecimal returnQty,
      @Param("stockinQty") java.math.BigDecimal stockinQty,
      @Param("stockinGrossWeight") java.math.BigDecimal stockinGrossWeight,
      @Param("stockinNetWeight") java.math.BigDecimal stockinNetWeight,
      @Param("totalTaxAmt") java.math.BigDecimal totalTaxAmt,
      @Param("totalReturnAmt") java.math.BigDecimal totalReturnAmt,
      @Param("totalStockinAmt") java.math.BigDecimal totalStockinAmt,
      @Param("status") Integer status,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param returnType
   * @param returnDate
   * @param returnQty
   * @param stockinQty
   * @param stockinGrossWeight
   * @param stockinNetWeight
   * @param totalTaxAmt
   * @param totalReturnAmt
   * @param totalStockinAmt
   * @param status
   * @return
   */
  List<SalConsignReturnHeadDTO> findBy(
      @Param("returnType") Integer returnType,
      @Param("returnDate") java.sql.Timestamp returnDate,
      @Param("returnQty") java.math.BigDecimal returnQty,
      @Param("stockinQty") java.math.BigDecimal stockinQty,
      @Param("stockinGrossWeight") java.math.BigDecimal stockinGrossWeight,
      @Param("stockinNetWeight") java.math.BigDecimal stockinNetWeight,
      @Param("totalTaxAmt") java.math.BigDecimal totalTaxAmt,
      @Param("totalReturnAmt") java.math.BigDecimal totalReturnAmt,
      @Param("totalStockinAmt") java.math.BigDecimal totalStockinAmt,
      @Param("status") Integer status);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalConsignReturnHeadDTO> findByExample(
      @Param("example") SalConsignReturnHead example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalConsignReturnHeadDTO> findByExample(@Param("example") SalConsignReturnHead example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalConsignReturnHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalConsignReturnHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<SalConsignReturnHeadDTO> findByFuzzySearch(
      @Param("example") SalConsignReturnHead example,
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
  Page<SalConsignReturnHeadDTO> findByField(
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
  List<SalConsignReturnHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
