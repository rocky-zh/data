package com.pagoda.repo.goods.custom;

import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasOrgGoods扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasOrgGoodsRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param orgId
   * @param orgCode
   * @param orgName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param entId
   * @param isOrgLot
   * @param taxRate
   * @param isEnabled
   * @param isPur
   * @param purRetOutDepotCode
   * @param purRetOutDepotName
   * @param purRetOutDepotId
   * @param purRecInDepotId
   * @param purRecInDepotCode
   * @param purRecInDepotName
   * @param salConInDepotId
   * @param salConInDepotCode
   * @param salConInDepotName
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param salRetInDepotId
   * @param salRetInDepotCode
   * @param salRetInDepotName
   * @param salRetOutDepotId
   * @param salRetOutDepotCode
   * @param salRetOutDepotName
   * @param isDataDetail
   * @param batchQty
   * @param batchPolicy
   * @param isSale
   * @param isReturn
   * @param isTrans
   * @param conCycle
   * @param isStockInv
   * @param isRet
   * @param isMustRet
   * @param purExcRatio
   * @param isDefDepot
   * @param pageable
   * @return
   */
  Page<BasOrgGoodsDTO> findBy(
      @Param("orgId") Long orgId,
      @Param("orgCode") String orgCode,
      @Param("orgName") String orgName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("entId") Long entId,
      @Param("isOrgLot") Integer isOrgLot,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("isEnabled") Integer isEnabled,
      @Param("isPur") Integer isPur,
      @Param("purRetOutDepotCode") String purRetOutDepotCode,
      @Param("purRetOutDepotName") String purRetOutDepotName,
      @Param("purRetOutDepotId") Long purRetOutDepotId,
      @Param("purRecInDepotId") Long purRecInDepotId,
      @Param("purRecInDepotCode") String purRecInDepotCode,
      @Param("purRecInDepotName") String purRecInDepotName,
      @Param("salConInDepotId") Long salConInDepotId,
      @Param("salConInDepotCode") String salConInDepotCode,
      @Param("salConInDepotName") String salConInDepotName,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("salRetInDepotId") Long salRetInDepotId,
      @Param("salRetInDepotCode") String salRetInDepotCode,
      @Param("salRetInDepotName") String salRetInDepotName,
      @Param("salRetOutDepotId") Long salRetOutDepotId,
      @Param("salRetOutDepotCode") String salRetOutDepotCode,
      @Param("salRetOutDepotName") String salRetOutDepotName,
      @Param("isDataDetail") Integer isDataDetail,
      @Param("batchQty") java.math.BigDecimal batchQty,
      @Param("batchPolicy") Integer batchPolicy,
      @Param("isSale") Integer isSale,
      @Param("isReturn") Integer isReturn,
      @Param("isTrans") Integer isTrans,
      @Param("conCycle") java.math.BigDecimal conCycle,
      @Param("isStockInv") Integer isStockInv,
      @Param("isRet") Integer isRet,
      @Param("isMustRet") Integer isMustRet,
      @Param("purExcRatio") java.math.BigDecimal purExcRatio,
      @Param("isDefDepot") Integer isDefDepot,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param orgId
   * @param orgCode
   * @param orgName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param entId
   * @param isOrgLot
   * @param taxRate
   * @param isEnabled
   * @param isPur
   * @param purRetOutDepotCode
   * @param purRetOutDepotName
   * @param purRetOutDepotId
   * @param purRecInDepotId
   * @param purRecInDepotCode
   * @param purRecInDepotName
   * @param salConInDepotId
   * @param salConInDepotCode
   * @param salConInDepotName
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param salRetInDepotId
   * @param salRetInDepotCode
   * @param salRetInDepotName
   * @param salRetOutDepotId
   * @param salRetOutDepotCode
   * @param salRetOutDepotName
   * @param isDataDetail
   * @param batchQty
   * @param batchPolicy
   * @param isSale
   * @param isReturn
   * @param isTrans
   * @param conCycle
   * @param isStockInv
   * @param isRet
   * @param isMustRet
   * @param purExcRatio
   * @param isDefDepot
   * @return
   */
  List<BasOrgGoodsDTO> findBy(
      @Param("orgId") Long orgId,
      @Param("orgCode") String orgCode,
      @Param("orgName") String orgName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("entId") Long entId,
      @Param("isOrgLot") Integer isOrgLot,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("isEnabled") Integer isEnabled,
      @Param("isPur") Integer isPur,
      @Param("purRetOutDepotCode") String purRetOutDepotCode,
      @Param("purRetOutDepotName") String purRetOutDepotName,
      @Param("purRetOutDepotId") Long purRetOutDepotId,
      @Param("purRecInDepotId") Long purRecInDepotId,
      @Param("purRecInDepotCode") String purRecInDepotCode,
      @Param("purRecInDepotName") String purRecInDepotName,
      @Param("salConInDepotId") Long salConInDepotId,
      @Param("salConInDepotCode") String salConInDepotCode,
      @Param("salConInDepotName") String salConInDepotName,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("salRetInDepotId") Long salRetInDepotId,
      @Param("salRetInDepotCode") String salRetInDepotCode,
      @Param("salRetInDepotName") String salRetInDepotName,
      @Param("salRetOutDepotId") Long salRetOutDepotId,
      @Param("salRetOutDepotCode") String salRetOutDepotCode,
      @Param("salRetOutDepotName") String salRetOutDepotName,
      @Param("isDataDetail") Integer isDataDetail,
      @Param("batchQty") java.math.BigDecimal batchQty,
      @Param("batchPolicy") Integer batchPolicy,
      @Param("isSale") Integer isSale,
      @Param("isReturn") Integer isReturn,
      @Param("isTrans") Integer isTrans,
      @Param("conCycle") java.math.BigDecimal conCycle,
      @Param("isStockInv") Integer isStockInv,
      @Param("isRet") Integer isRet,
      @Param("isMustRet") Integer isMustRet,
      @Param("purExcRatio") java.math.BigDecimal purExcRatio,
      @Param("isDefDepot") Integer isDefDepot);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasOrgGoodsDTO> findByExample(
      @Param("example") BasOrgGoods example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasOrgGoodsDTO> findByExample(@Param("example") BasOrgGoods example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasOrgGoodsDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasOrgGoodsDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasOrgGoodsDTO> findByFuzzySearch(
      @Param("example") BasOrgGoods example,
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
  Page<BasOrgGoodsDTO> findByField(
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
  List<BasOrgGoodsDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
