package com.pagoda.api.salorderhead;

import com.pagoda.api.dto.salorderhead.*;
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
public interface BaseSalPreOrderDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalPreOrderDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalPreOrderDetailDTO entity)
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
  Iterable<SalPreOrderDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalPreOrderDetailDTO> entities)
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
  SalPreOrderDetailDTO update(
      @ApiParam(value = "entity", required = true) SalPreOrderDetailDTO entity)
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
  Iterable<SalPreOrderDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalPreOrderDetailDTO> entities)
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
  SalPreOrderDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalPreOrderDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalPreOrderDetailDTO> findByExample(
      @ApiParam("example") SalPreOrderDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param preOrderId
   * @param preOrderSeqno
   * @param prePlanQty
   * @param auditQty
   * @param invQty
   * @param detailStatus
   * @param areaId
   * @param areaCode
   * @param areaName
   * @param entId
   * @param goodsVarId
   * @param goodsVarName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salUnitid
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param maxOrderQty
   * @param minOrderQty
   * @param price
   * @param totalAmt
   * @param preArrivalDate
   * @param remark
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalPreOrderDetailDTO> findBy(
      @ApiParam("preOrderId") Long preOrderId,
      @ApiParam("preOrderSeqno") String preOrderSeqno,
      @ApiParam("prePlanQty") java.math.BigDecimal prePlanQty,
      @ApiParam("auditQty") java.math.BigDecimal auditQty,
      @ApiParam("invQty") java.math.BigDecimal invQty,
      @ApiParam("detailStatus") Integer detailStatus,
      @ApiParam("areaId") Long areaId,
      @ApiParam("areaCode") String areaCode,
      @ApiParam("areaName") String areaName,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsVarId") Long goodsVarId,
      @ApiParam("goodsVarName") String goodsVarName,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("salUnitid") Long salUnitid,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salUnitRate") java.math.BigDecimal salUnitRate,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("maxOrderQty") java.math.BigDecimal maxOrderQty,
      @ApiParam("minOrderQty") java.math.BigDecimal minOrderQty,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("totalAmt") java.math.BigDecimal totalAmt,
      @ApiParam("preArrivalDate") java.util.Date preArrivalDate,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 查询追加预订单的明细
   *
   * @param preOrderId
   * @param detailStatus
   * @param preArrivalDate
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findDetailForAppend", notes = "")
  Page<SalPreOrderDetailDTO> findDetailForAppend(
      @ApiParam("pre_order_id") List<Long> preOrderId,
      @ApiParam("detail_status") List<Integer> detailStatus,
      @ApiParam("pre_arrival_date") java.util.Date preArrivalDate,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
