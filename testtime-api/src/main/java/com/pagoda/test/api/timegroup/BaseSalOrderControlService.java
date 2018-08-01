package com.pagoda.test.api.timegroup;

import com.pagoda.test.api.dto.timegroup.*;
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
   * @param isCtrlDepInput
   * @param isCtrlAccnt
   * @param isCtrlDuty
   * @param isCtrlVrfyTrans
   * @param isCtrlDistCyc
   * @param isCtrlMustSell
   * @param isCtrlRouteSplit
   * @param isCtrlSafetyStock
   * @param allowSafetyStockTimes
   * @param isCtrlExeBatchPolicy
   * @param isCtrlOneOrder
   * @param placeOrderTime
   * @param placeOrderTime2
   * @param isCtrlReturn
   * @param returnGoodsTime1
   * @param returnGoodsTime2
   * @param enabled
   * @param remark
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
      @ApiParam("isCtrlDepInput") Integer isCtrlDepInput,
      @ApiParam("isCtrlAccnt") Integer isCtrlAccnt,
      @ApiParam("isCtrlDuty") Integer isCtrlDuty,
      @ApiParam("isCtrlVrfyTrans") Integer isCtrlVrfyTrans,
      @ApiParam("isCtrlDistCyc") Integer isCtrlDistCyc,
      @ApiParam("isCtrlMustSell") Integer isCtrlMustSell,
      @ApiParam("isCtrlRouteSplit") Integer isCtrlRouteSplit,
      @ApiParam("isCtrlSafetyStock") Integer isCtrlSafetyStock,
      @ApiParam("allowSafetyStockTimes") java.math.BigDecimal allowSafetyStockTimes,
      @ApiParam("isCtrlExeBatchPolicy") Integer isCtrlExeBatchPolicy,
      @ApiParam("isCtrlOneOrder") Integer isCtrlOneOrder,
      @ApiParam("placeOrderTime") java.util.Date placeOrderTime,
      @ApiParam("placeOrderTime2") java.util.Date placeOrderTime2,
      @ApiParam("isCtrlReturn") Integer isCtrlReturn,
      @ApiParam("returnGoodsTime1") java.util.Date returnGoodsTime1,
      @ApiParam("returnGoodsTime2") java.util.Date returnGoodsTime2,
      @ApiParam("enabled") Integer enabled,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据时分秒查询
   *
   * @param placeOrderTime
   * @param idList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectWithTime", notes = "")
  Page<SalOrderControlDTO> selectWithTime(
      @ApiParam("place_order_time") java.util.Date placeOrderTime,
      @ApiParam("idList") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
