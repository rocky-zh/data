package com.pagoda.repo.goods.custom;

import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasOrgGoodsvar扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasOrgGoodsvarRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param badGoodsRate
   * @param prodArea
   * @param qualSituDesc
   * @param supplyStateDesc
   * @param supplyTrendDesc
   * @param isMustSale
   * @param mustSaleDesc
   * @param difference
   * @param goodsWrapDesc
   * @param goodsEva
   * @param techDesc
   * @param isBEnabledC
   * @param isCEnabledA
   * @param isCEnabledN
   * @param isCEnabledM
   * @param isCEnabledO
   * @param isCEnabledP
   * @param isCEnabledC
   * @param isCEnabledE
   * @param isCEnabledF
   * @param entId
   * @param orgId
   * @param goodsVarId
   * @param goodsId
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param unitRate
   * @param isSale
   * @param isReturn
   * @param isStockInv
   * @param isRet
   * @param pageable
   * @return
   */
  Page<BasOrgGoodsvarDTO> findBy(
      @Param("badGoodsRate") java.math.BigDecimal badGoodsRate,
      @Param("prodArea") String prodArea,
      @Param("qualSituDesc") String qualSituDesc,
      @Param("supplyStateDesc") String supplyStateDesc,
      @Param("supplyTrendDesc") String supplyTrendDesc,
      @Param("isMustSale") Integer isMustSale,
      @Param("mustSaleDesc") String mustSaleDesc,
      @Param("difference") String difference,
      @Param("goodsWrapDesc") String goodsWrapDesc,
      @Param("goodsEva") String goodsEva,
      @Param("techDesc") String techDesc,
      @Param("isBEnabledC") Integer isBEnabledC,
      @Param("isCEnabledA") Integer isCEnabledA,
      @Param("isCEnabledN") Integer isCEnabledN,
      @Param("isCEnabledM") Integer isCEnabledM,
      @Param("isCEnabledO") Integer isCEnabledO,
      @Param("isCEnabledP") Integer isCEnabledP,
      @Param("isCEnabledC") Integer isCEnabledC,
      @Param("isCEnabledE") Integer isCEnabledE,
      @Param("isCEnabledF") Integer isCEnabledF,
      @Param("entId") Long entId,
      @Param("orgId") Long orgId,
      @Param("goodsVarId") Long goodsVarId,
      @Param("goodsId") Long goodsId,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("isSale") Integer isSale,
      @Param("isReturn") Integer isReturn,
      @Param("isStockInv") Integer isStockInv,
      @Param("isRet") Integer isRet,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param badGoodsRate
   * @param prodArea
   * @param qualSituDesc
   * @param supplyStateDesc
   * @param supplyTrendDesc
   * @param isMustSale
   * @param mustSaleDesc
   * @param difference
   * @param goodsWrapDesc
   * @param goodsEva
   * @param techDesc
   * @param isBEnabledC
   * @param isCEnabledA
   * @param isCEnabledN
   * @param isCEnabledM
   * @param isCEnabledO
   * @param isCEnabledP
   * @param isCEnabledC
   * @param isCEnabledE
   * @param isCEnabledF
   * @param entId
   * @param orgId
   * @param goodsVarId
   * @param goodsId
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param unitRate
   * @param isSale
   * @param isReturn
   * @param isStockInv
   * @param isRet
   * @return
   */
  List<BasOrgGoodsvarDTO> findBy(
      @Param("badGoodsRate") java.math.BigDecimal badGoodsRate,
      @Param("prodArea") String prodArea,
      @Param("qualSituDesc") String qualSituDesc,
      @Param("supplyStateDesc") String supplyStateDesc,
      @Param("supplyTrendDesc") String supplyTrendDesc,
      @Param("isMustSale") Integer isMustSale,
      @Param("mustSaleDesc") String mustSaleDesc,
      @Param("difference") String difference,
      @Param("goodsWrapDesc") String goodsWrapDesc,
      @Param("goodsEva") String goodsEva,
      @Param("techDesc") String techDesc,
      @Param("isBEnabledC") Integer isBEnabledC,
      @Param("isCEnabledA") Integer isCEnabledA,
      @Param("isCEnabledN") Integer isCEnabledN,
      @Param("isCEnabledM") Integer isCEnabledM,
      @Param("isCEnabledO") Integer isCEnabledO,
      @Param("isCEnabledP") Integer isCEnabledP,
      @Param("isCEnabledC") Integer isCEnabledC,
      @Param("isCEnabledE") Integer isCEnabledE,
      @Param("isCEnabledF") Integer isCEnabledF,
      @Param("entId") Long entId,
      @Param("orgId") Long orgId,
      @Param("goodsVarId") Long goodsVarId,
      @Param("goodsId") Long goodsId,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("isSale") Integer isSale,
      @Param("isReturn") Integer isReturn,
      @Param("isStockInv") Integer isStockInv,
      @Param("isRet") Integer isRet);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasOrgGoodsvarDTO> findByExample(
      @Param("example") BasOrgGoodsvar example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasOrgGoodsvarDTO> findByExample(@Param("example") BasOrgGoodsvar example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasOrgGoodsvarDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasOrgGoodsvarDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasOrgGoodsvarDTO> findByFuzzySearch(
      @Param("example") BasOrgGoodsvar example,
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
  Page<BasOrgGoodsvarDTO> findByField(
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
  List<BasOrgGoodsvarDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
