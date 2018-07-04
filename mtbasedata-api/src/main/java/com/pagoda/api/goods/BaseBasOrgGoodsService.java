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
public interface BaseBasOrgGoodsService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasOrgGoodsDTO create(@ApiParam(value = "entity", required = true) @Valid BasOrgGoodsDTO entity)
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
  Iterable<BasOrgGoodsDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgGoodsDTO> entities)
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
  BasOrgGoodsDTO update(@ApiParam(value = "entity", required = true) BasOrgGoodsDTO entity)
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
  Iterable<BasOrgGoodsDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgGoodsDTO> entities)
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
  BasOrgGoodsDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasOrgGoodsDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasOrgGoodsDTO> findByExample(
      @ApiParam("example") BasOrgGoodsDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param orgCode
   * @param orgName
   * @param isOrgLot
   * @param isPur
   * @param purRetOutDepotCode
   * @param purRetOutDepotName
   * @param purRetOutDepotId
   * @param purRecInDepotId
   * @param purRecInDepotCode
   * @param purRecInDepotName
   * @param salConInDepotCode
   * @param salConInDepotName
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
   * @param orgId
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param entId
   * @param taxRate
   * @param isEnabled
   * @param salConInDepotId
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param salRetInDepotId
   * @param salRetInDepotCode
   * @param salRetInDepotName
   * @param salRetOutDepotId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasOrgGoodsDTO> findBy(
      @ApiParam("orgCode") String orgCode,
      @ApiParam("orgName") String orgName,
      @ApiParam("isOrgLot") Integer isOrgLot,
      @ApiParam("isPur") Integer isPur,
      @ApiParam("purRetOutDepotCode") String purRetOutDepotCode,
      @ApiParam("purRetOutDepotName") String purRetOutDepotName,
      @ApiParam("purRetOutDepotId") Long purRetOutDepotId,
      @ApiParam("purRecInDepotId") Long purRecInDepotId,
      @ApiParam("purRecInDepotCode") String purRecInDepotCode,
      @ApiParam("purRecInDepotName") String purRecInDepotName,
      @ApiParam("salConInDepotCode") String salConInDepotCode,
      @ApiParam("salConInDepotName") String salConInDepotName,
      @ApiParam("salRetOutDepotCode") String salRetOutDepotCode,
      @ApiParam("salRetOutDepotName") String salRetOutDepotName,
      @ApiParam("isDataDetail") Integer isDataDetail,
      @ApiParam("batchQty") java.math.BigDecimal batchQty,
      @ApiParam("batchPolicy") Integer batchPolicy,
      @ApiParam("isSale") Integer isSale,
      @ApiParam("isReturn") Integer isReturn,
      @ApiParam("isTrans") Integer isTrans,
      @ApiParam("conCycle") java.math.BigDecimal conCycle,
      @ApiParam("isStockInv") Integer isStockInv,
      @ApiParam("isRet") Integer isRet,
      @ApiParam("isMustRet") Integer isMustRet,
      @ApiParam("purExcRatio") java.math.BigDecimal purExcRatio,
      @ApiParam("isDefDepot") Integer isDefDepot,
      @ApiParam("orgId") Long orgId,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("entId") Long entId,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("salConInDepotId") Long salConInDepotId,
      @ApiParam("salConOutDepotId") Long salConOutDepotId,
      @ApiParam("salConOutDepotCode") String salConOutDepotCode,
      @ApiParam("salConOutDepotName") String salConOutDepotName,
      @ApiParam("salRetInDepotId") Long salRetInDepotId,
      @ApiParam("salRetInDepotCode") String salRetInDepotCode,
      @ApiParam("salRetInDepotName") String salRetInDepotName,
      @ApiParam("salRetOutDepotId") Long salRetOutDepotId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
