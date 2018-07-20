package com.pagoda.api.salebasicdefinition;

import com.pagoda.api.dto.salebasicdefinition.*;
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
public interface BaseSalOrderControlService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalOrderControlDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalOrderControlDTO entity)
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
  Iterable<SalOrderControlDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalOrderControlDTO> entities)
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
  SalOrderControlDTO update(@ApiParam(value = "entity", required = true) SalOrderControlDTO entity)
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
  Iterable<SalOrderControlDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalOrderControlDTO> entities)
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
  SalOrderControlDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalOrderControlDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalOrderControlDTO> findByExample(
      @ApiParam("example") SalOrderControlDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param isCtrlDep
   * @param beforeDays
   * @param allowPosGapD
   * @param allowPosGapM
   * @param isDepInput
   * @param isAccnt
   * @param isDuty
   * @param isVrfyTrans
   * @param isDistCyc
   * @param isMustSell
   * @param isRouteSplit
   * @param isSafetyStock
   * @param safetyStockMultiple
   * @param isExeBatchPolicy
   * @param isOneOrder
   * @param beginOrderTime
   * @param endOrderTime
   * @param isCtrlReturn
   * @param beginReturnTime
   * @param endReturnTime
   * @param isEnabled
   * @param remark
   * @param entId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalOrderControlDTO> findBy(
      @ApiParam("cusOrgId") Long cusOrgId,
      @ApiParam("cusOrgCode") String cusOrgCode,
      @ApiParam("cusOrgName") String cusOrgName,
      @ApiParam("isCtrlDep") Integer isCtrlDep,
      @ApiParam("beforeDays") Integer beforeDays,
      @ApiParam("allowPosGapD") Integer allowPosGapD,
      @ApiParam("allowPosGapM") Integer allowPosGapM,
      @ApiParam("isDepInput") Integer isDepInput,
      @ApiParam("isAccnt") Integer isAccnt,
      @ApiParam("isDuty") Integer isDuty,
      @ApiParam("isVrfyTrans") Integer isVrfyTrans,
      @ApiParam("isDistCyc") Integer isDistCyc,
      @ApiParam("isMustSell") Integer isMustSell,
      @ApiParam("isRouteSplit") Integer isRouteSplit,
      @ApiParam("isSafetyStock") Integer isSafetyStock,
      @ApiParam("safetyStockMultiple") java.math.BigDecimal safetyStockMultiple,
      @ApiParam("isExeBatchPolicy") Integer isExeBatchPolicy,
      @ApiParam("isOneOrder") Integer isOneOrder,
      @ApiParam("beginOrderTime") java.util.Date beginOrderTime,
      @ApiParam("endOrderTime") java.util.Date endOrderTime,
      @ApiParam("isCtrlReturn") Integer isCtrlReturn,
      @ApiParam("beginReturnTime") java.util.Date beginReturnTime,
      @ApiParam("endReturnTime") java.util.Date endReturnTime,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("remark") String remark,
      @ApiParam("entId") Long entId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
