package com.pagoda.repo.goods.custom;

import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasGoods扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasGoodsRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param shortName
   * @param traditName
   * @param enName
   * @param goodsOrigin
   * @param goodsLevel
   * @param goodsType
   * @param invUnitId
   * @param invUnitName
   * @param invUnitCode
   * @param invRate
   * @param purRate
   * @param retUnitId
   * @param retUnitCode
   * @param retUnitName
   * @param retRate
   * @param unitVolume
   * @param unitWeight
   * @param barcode
   * @param isEntLot
   * @param shelfLifeType
   * @param shelfLifeQty
   * @param code
   * @param name
   * @param entId
   * @param goodsSpec
   * @param searchWord
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param salUnitId
   * @param salUnitCode
   * @param salUnitName
   * @param salRate
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param taxRate
   * @param isEnabled
   * @param isPur
   * @param isSale
   * @param isRet
   * @param mnemWord
   * @param pageable
   * @return
   */
  Page<BasGoodsDTO> findBy(
      @Param("shortName") String shortName,
      @Param("traditName") String traditName,
      @Param("enName") String enName,
      @Param("goodsOrigin") String goodsOrigin,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsType") Integer goodsType,
      @Param("invUnitId") Long invUnitId,
      @Param("invUnitName") String invUnitName,
      @Param("invUnitCode") String invUnitCode,
      @Param("invRate") java.math.BigDecimal invRate,
      @Param("purRate") java.math.BigDecimal purRate,
      @Param("retUnitId") Long retUnitId,
      @Param("retUnitCode") String retUnitCode,
      @Param("retUnitName") String retUnitName,
      @Param("retRate") java.math.BigDecimal retRate,
      @Param("unitVolume") java.math.BigDecimal unitVolume,
      @Param("unitWeight") java.math.BigDecimal unitWeight,
      @Param("barcode") String barcode,
      @Param("isEntLot") Integer isEntLot,
      @Param("shelfLifeType") Integer shelfLifeType,
      @Param("shelfLifeQty") java.math.BigDecimal shelfLifeQty,
      @Param("code") String code,
      @Param("name") String name,
      @Param("entId") Long entId,
      @Param("goodsSpec") String goodsSpec,
      @Param("searchWord") String searchWord,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salRate") java.math.BigDecimal salRate,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("isEnabled") Integer isEnabled,
      @Param("isPur") Integer isPur,
      @Param("isSale") Integer isSale,
      @Param("isRet") Integer isRet,
      @Param("mnemWord") String mnemWord,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param shortName
   * @param traditName
   * @param enName
   * @param goodsOrigin
   * @param goodsLevel
   * @param goodsType
   * @param invUnitId
   * @param invUnitName
   * @param invUnitCode
   * @param invRate
   * @param purRate
   * @param retUnitId
   * @param retUnitCode
   * @param retUnitName
   * @param retRate
   * @param unitVolume
   * @param unitWeight
   * @param barcode
   * @param isEntLot
   * @param shelfLifeType
   * @param shelfLifeQty
   * @param code
   * @param name
   * @param entId
   * @param goodsSpec
   * @param searchWord
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param salUnitId
   * @param salUnitCode
   * @param salUnitName
   * @param salRate
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param taxRate
   * @param isEnabled
   * @param isPur
   * @param isSale
   * @param isRet
   * @param mnemWord
   * @return
   */
  List<BasGoodsDTO> findBy(
      @Param("shortName") String shortName,
      @Param("traditName") String traditName,
      @Param("enName") String enName,
      @Param("goodsOrigin") String goodsOrigin,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsType") Integer goodsType,
      @Param("invUnitId") Long invUnitId,
      @Param("invUnitName") String invUnitName,
      @Param("invUnitCode") String invUnitCode,
      @Param("invRate") java.math.BigDecimal invRate,
      @Param("purRate") java.math.BigDecimal purRate,
      @Param("retUnitId") Long retUnitId,
      @Param("retUnitCode") String retUnitCode,
      @Param("retUnitName") String retUnitName,
      @Param("retRate") java.math.BigDecimal retRate,
      @Param("unitVolume") java.math.BigDecimal unitVolume,
      @Param("unitWeight") java.math.BigDecimal unitWeight,
      @Param("barcode") String barcode,
      @Param("isEntLot") Integer isEntLot,
      @Param("shelfLifeType") Integer shelfLifeType,
      @Param("shelfLifeQty") java.math.BigDecimal shelfLifeQty,
      @Param("code") String code,
      @Param("name") String name,
      @Param("entId") Long entId,
      @Param("goodsSpec") String goodsSpec,
      @Param("searchWord") String searchWord,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salRate") java.math.BigDecimal salRate,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("isEnabled") Integer isEnabled,
      @Param("isPur") Integer isPur,
      @Param("isSale") Integer isSale,
      @Param("isRet") Integer isRet,
      @Param("mnemWord") String mnemWord);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasGoodsDTO> findByExample(
      @Param("example") BasGoods example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasGoodsDTO> findByExample(@Param("example") BasGoods example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasGoodsDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasGoodsDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasGoodsDTO> findByFuzzySearch(
      @Param("example") BasGoods example,
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
  Page<BasGoodsDTO> findByField(
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
  List<BasGoodsDTO> findByField(@Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
