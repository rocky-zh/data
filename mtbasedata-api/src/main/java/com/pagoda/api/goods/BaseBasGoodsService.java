package com.pagoda.api.goods;

import com.pagoda.api.dto.goods.*;
import com.pagoda.api.*;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.*;
import java.util.concurrent.*;
import javax.validation.*;
import io.swagger.annotations.*;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.Validated;

/**
 * Service继承的父接口,定义一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public interface BaseBasGoodsService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasGoodsDTO create(@ApiParam(value = "entity", required = true) @Valid BasGoodsDTO entity)
      throws ServiceException;

  /**
   * Create all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   * @throws ServiceException
   */
  @ApiOperation(value = "batchCreate", notes = "批量插入多条记录")
  Iterable<BasGoodsDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasGoodsDTO> entities)
      throws ServiceException;

  /**
   * Update a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "update", notes = "更新一条记录")
  BasGoodsDTO update(@ApiParam(value = "entity", required = true) BasGoodsDTO entity)
      throws ServiceException;

  /**
   * Update all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   * @throws ServiceException
   */
  @ApiOperation(value = "batchUpdate", notes = "批量更新多条记录")
  Iterable<BasGoodsDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasGoodsDTO> entities)
      throws ServiceException;

  /**
   * Deletes the entity with the given id.
   *
   * @param id must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "delete", notes = "删除一条记录")
  void delete(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * Deletes the entities in a batch with the given ids.
   *
   * @param ids must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code ids} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "batchDelete", notes = "批量删除多条记录")
  void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids)
      throws ServiceException;

  /**
   * Retrieves an entity by its id.
   *
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   * @throws IllegalArgumentException if {@code id} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "getById", notes = "根据id查询记录")
  BasGoodsDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasGoodsDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException;

  /**
   * 根据非空的字段进行查询
   *
   * @param example
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByExample", notes = "根据非空字段查询")
  Page<BasGoodsDTO> findByExample(
      @ApiParam("example") BasGoodsDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
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
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasGoodsDTO> findBy(
      @ApiParam("shortName") String shortName,
      @ApiParam("traditName") String traditName,
      @ApiParam("enName") String enName,
      @ApiParam("goodsOrigin") String goodsOrigin,
      @ApiParam("goodsLevel") Integer goodsLevel,
      @ApiParam("goodsType") Integer goodsType,
      @ApiParam("invUnitId") Long invUnitId,
      @ApiParam("invUnitName") String invUnitName,
      @ApiParam("invUnitCode") String invUnitCode,
      @ApiParam("invRate") java.math.BigDecimal invRate,
      @ApiParam("purRate") java.math.BigDecimal purRate,
      @ApiParam("retUnitId") Long retUnitId,
      @ApiParam("retUnitCode") String retUnitCode,
      @ApiParam("retUnitName") String retUnitName,
      @ApiParam("retRate") java.math.BigDecimal retRate,
      @ApiParam("unitVolume") java.math.BigDecimal unitVolume,
      @ApiParam("unitWeight") java.math.BigDecimal unitWeight,
      @ApiParam("barcode") String barcode,
      @ApiParam("isEntLot") Integer isEntLot,
      @ApiParam("shelfLifeType") Integer shelfLifeType,
      @ApiParam("shelfLifeQty") java.math.BigDecimal shelfLifeQty,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("salUnitId") Long salUnitId,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salRate") java.math.BigDecimal salRate,
      @ApiParam("purUnitId") Long purUnitId,
      @ApiParam("purUnitCode") String purUnitCode,
      @ApiParam("purUnitName") String purUnitName,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isPur") Integer isPur,
      @ApiParam("isSale") Integer isSale,
      @ApiParam("isRet") Integer isRet,
      @ApiParam("mnemWord") String mnemWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 商品定义->商品查询
   *
   * @param catId
   * @param path
   * @param isPur
   * @param tableId
   * @param isEnabled
   * @param deleted
   * @param entId
   * @param isSale
   * @param isRet
   * @param createdAt
   * @param name
   * @param barcode
   * @param code
   * @param goodsType
   * @param mnemWord
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findGoodsInDefine", notes = "")
  Page<FindGoodsInDefineDTO> findGoodsInDefine(
      @ApiParam("cat_id") Long catId,
      @ApiParam("path") String path,
      @ApiParam("is_pur") Integer isPur,
      @ApiParam("table_id") Long tableId,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("is_sale") Integer isSale,
      @ApiParam("is_ret") Integer isRet,
      @ApiParam("created_at") java.util.Date createdAt,
      @ApiParam("name") String name,
      @ApiParam("barcode") String barcode,
      @ApiParam("code") String code,
      @ApiParam("goods_type") Integer goodsType,
      @ApiParam("mnem_word") String mnemWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 分类关系->根据目录分类查找商品
   *
   * @param path
   * @param catId
   * @param isPur
   * @param tableId
   * @param isEnabled
   * @param deleted
   * @param entId
   * @param isSale
   * @param isRet
   * @param createdAt
   * @param name
   * @param barcode
   * @param code
   * @param goodsType
   * @param mnemWord
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findGoodOnCatClass", notes = "")
  Page<FindGoodOnCatClassDTO> findGoodOnCatClass(
      @ApiParam("path") String path,
      @ApiParam("cat_id") Long catId,
      @ApiParam("is_pur") Integer isPur,
      @ApiParam("table_id") Long tableId,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("is_sale") Integer isSale,
      @ApiParam("is_ret") Integer isRet,
      @ApiParam("created_at") java.util.Date createdAt,
      @ApiParam("name") String name,
      @ApiParam("barcode") String barcode,
      @ApiParam("code") String code,
      @ApiParam("goods_type") Integer goodsType,
      @ApiParam("mnem_word") String mnemWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 分类关系->查找没有在当前目录下的商品
   *
   * @param catId
   * @param entId
   * @param deleted
   * @param tableId
   * @param isPur
   * @param isEnabled
   * @param isSale
   * @param isRet
   * @param createdAt
   * @param name
   * @param barcode
   * @param code
   * @param goodsType
   * @param mnemWord
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findNoClassGoodsOnCat", notes = "")
  Page<BasGoodsDTO> findNoClassGoodsOnCat(
      @ApiParam("cat_id") Long catId,
      @ApiParam("ent_id") Long entId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("table_id") Long tableId,
      @ApiParam("is_pur") Integer isPur,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("is_sale") Integer isSale,
      @ApiParam("is_ret") Integer isRet,
      @ApiParam("created_at") java.util.Date createdAt,
      @ApiParam("name") String name,
      @ApiParam("barcode") String barcode,
      @ApiParam("code") String code,
      @ApiParam("goods_type") Integer goodsType,
      @ApiParam("mnem_word") String mnemWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
