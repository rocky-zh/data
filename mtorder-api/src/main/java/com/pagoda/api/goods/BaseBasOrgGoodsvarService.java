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
public interface BaseBasOrgGoodsvarService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasOrgGoodsvarDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasOrgGoodsvarDTO entity)
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
  Iterable<BasOrgGoodsvarDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgGoodsvarDTO> entities)
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
  BasOrgGoodsvarDTO update(@ApiParam(value = "entity", required = true) BasOrgGoodsvarDTO entity)
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
  Iterable<BasOrgGoodsvarDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgGoodsvarDTO> entities)
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
  BasOrgGoodsvarDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasOrgGoodsvarDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasOrgGoodsvarDTO> findByExample(
      @ApiParam("example") BasOrgGoodsvarDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
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
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasOrgGoodsvarDTO> findBy(
      @ApiParam("badGoodsRate") java.math.BigDecimal badGoodsRate,
      @ApiParam("prodArea") String prodArea,
      @ApiParam("qualSituDesc") String qualSituDesc,
      @ApiParam("supplyStateDesc") String supplyStateDesc,
      @ApiParam("supplyTrendDesc") String supplyTrendDesc,
      @ApiParam("isMustSale") Integer isMustSale,
      @ApiParam("mustSaleDesc") String mustSaleDesc,
      @ApiParam("difference") String difference,
      @ApiParam("goodsWrapDesc") String goodsWrapDesc,
      @ApiParam("goodsEva") String goodsEva,
      @ApiParam("techDesc") String techDesc,
      @ApiParam("isBEnabledC") Integer isBEnabledC,
      @ApiParam("isCEnabledA") Integer isCEnabledA,
      @ApiParam("isCEnabledN") Integer isCEnabledN,
      @ApiParam("isCEnabledM") Integer isCEnabledM,
      @ApiParam("isCEnabledO") Integer isCEnabledO,
      @ApiParam("isCEnabledP") Integer isCEnabledP,
      @ApiParam("isCEnabledC") Integer isCEnabledC,
      @ApiParam("isCEnabledE") Integer isCEnabledE,
      @ApiParam("isCEnabledF") Integer isCEnabledF,
      @ApiParam("entId") Long entId,
      @ApiParam("orgId") Long orgId,
      @ApiParam("goodsVarId") Long goodsVarId,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("unitId") Long unitId,
      @ApiParam("unitCode") String unitCode,
      @ApiParam("unitName") String unitName,
      @ApiParam("unitRate") java.math.BigDecimal unitRate,
      @ApiParam("isSale") Integer isSale,
      @ApiParam("isReturn") Integer isReturn,
      @ApiParam("isStockInv") Integer isStockInv,
      @ApiParam("isRet") Integer isRet,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
