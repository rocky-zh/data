package com.pagoda.repo.purorgven.custom;

import com.pagoda.api.dto.purorgven.*;
import com.pagoda.domain.purorgven.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * PurOrgVenGoods扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PurOrgVenGoodsRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param goodsClassName
   * @param basUnitName
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param unitRate
   * @param price
   * @param billTaxRate
   * @param discountTaxRate
   * @param taxType
   * @param isDefault
   * @param isEnabled
   * @param isAllowReturn
   * @param purDepotId
   * @param isAllowOrder
   * @param isAllowRec
   * @param goodsClassId
   * @param basUnitId
   * @param entId
   * @param pageable
   * @return
   */
  Page<PurOrgVenGoodsDTO> findBy(
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsClassName") String goodsClassName,
      @Param("basUnitName") String basUnitName,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("price") java.math.BigDecimal price,
      @Param("billTaxRate") java.math.BigDecimal billTaxRate,
      @Param("discountTaxRate") java.math.BigDecimal discountTaxRate,
      @Param("taxType") Integer taxType,
      @Param("isDefault") Integer isDefault,
      @Param("isEnabled") Integer isEnabled,
      @Param("isAllowReturn") Integer isAllowReturn,
      @Param("purDepotId") Long purDepotId,
      @Param("isAllowOrder") Integer isAllowOrder,
      @Param("isAllowRec") Integer isAllowRec,
      @Param("goodsClassId") Long goodsClassId,
      @Param("basUnitId") Long basUnitId,
      @Param("entId") Long entId,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param goodsClassName
   * @param basUnitName
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param unitRate
   * @param price
   * @param billTaxRate
   * @param discountTaxRate
   * @param taxType
   * @param isDefault
   * @param isEnabled
   * @param isAllowReturn
   * @param purDepotId
   * @param isAllowOrder
   * @param isAllowRec
   * @param goodsClassId
   * @param basUnitId
   * @param entId
   * @return
   */
  List<PurOrgVenGoodsDTO> findBy(
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsClassName") String goodsClassName,
      @Param("basUnitName") String basUnitName,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("price") java.math.BigDecimal price,
      @Param("billTaxRate") java.math.BigDecimal billTaxRate,
      @Param("discountTaxRate") java.math.BigDecimal discountTaxRate,
      @Param("taxType") Integer taxType,
      @Param("isDefault") Integer isDefault,
      @Param("isEnabled") Integer isEnabled,
      @Param("isAllowReturn") Integer isAllowReturn,
      @Param("purDepotId") Long purDepotId,
      @Param("isAllowOrder") Integer isAllowOrder,
      @Param("isAllowRec") Integer isAllowRec,
      @Param("goodsClassId") Long goodsClassId,
      @Param("basUnitId") Long basUnitId,
      @Param("entId") Long entId);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<PurOrgVenGoodsDTO> findByExample(
      @Param("example") PurOrgVenGoods example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<PurOrgVenGoodsDTO> findByExample(@Param("example") PurOrgVenGoods example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<PurOrgVenGoodsDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<PurOrgVenGoodsDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<PurOrgVenGoodsDTO> findByFuzzySearch(
      @Param("example") PurOrgVenGoods example,
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
  Page<PurOrgVenGoodsDTO> findByField(
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
  List<PurOrgVenGoodsDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
