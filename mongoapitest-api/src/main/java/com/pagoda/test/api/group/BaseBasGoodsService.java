package com.pagoda.test.api.group;

import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.api.*;

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
   * @param mnemWord
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param invUnitId
   * @param invUnitName
   * @param invUnitCode
   * @param invRate
   * @param salUnitId
   * @param salUnitCode
   * @param salUnitName
   * @param salRate
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param purRate
   * @param retUnitId
   * @param retUnitCode
   * @param retUnitName
   * @param retRate
   * @param unitVolume
   * @param unitWeight
   * @param barcode
   * @param taxRate
   * @param isEntLot
   * @param shelfLifeType
   * @param shelfLifeQty
   * @param isEnabled
   * @param isPur
   * @param isSale
   * @param isRet
   * @param code
   * @param searchWord
   * @param isMulti
   * @param name
   * @param remark
   * @param enName
   * @param entId
   * @param goodsSpec
   * @param goodsOrigin
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasGoodsDTO> findBy(
      @ApiParam("mnemWord") String mnemWord,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("invUnitId") Long invUnitId,
      @ApiParam("invUnitName") String invUnitName,
      @ApiParam("invUnitCode") String invUnitCode,
      @ApiParam("invRate") java.math.BigDecimal invRate,
      @ApiParam("salUnitId") Long salUnitId,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salRate") java.math.BigDecimal salRate,
      @ApiParam("purUnitId") Long purUnitId,
      @ApiParam("purUnitCode") String purUnitCode,
      @ApiParam("purUnitName") String purUnitName,
      @ApiParam("purRate") java.math.BigDecimal purRate,
      @ApiParam("retUnitId") Long retUnitId,
      @ApiParam("retUnitCode") String retUnitCode,
      @ApiParam("retUnitName") String retUnitName,
      @ApiParam("retRate") java.math.BigDecimal retRate,
      @ApiParam("unitVolume") java.math.BigDecimal unitVolume,
      @ApiParam("unitWeight") java.math.BigDecimal unitWeight,
      @ApiParam("barcode") String barcode,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("isEntLot") Integer isEntLot,
      @ApiParam("shelfLifeType") Integer shelfLifeType,
      @ApiParam("shelfLifeQty") java.math.BigDecimal shelfLifeQty,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isPur") Integer isPur,
      @ApiParam("isSale") Integer isSale,
      @ApiParam("isRet") Integer isRet,
      @ApiParam("code") String code,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("isMulti") Integer isMulti,
      @ApiParam("name") String name,
      @ApiParam("remark") String remark,
      @ApiParam("enName") String enName,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("goodsOrigin") String goodsOrigin,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
