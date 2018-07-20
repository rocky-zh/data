package com.pagoda.api.salconsignout;

import com.pagoda.api.dto.salconsignout.*;
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
public interface BaseSalConsignOutExceptionLogService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalConsignOutExceptionLogDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignOutExceptionLogDTO entity)
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
  Iterable<SalConsignOutExceptionLogDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<SalConsignOutExceptionLogDTO> entities)
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
  SalConsignOutExceptionLogDTO update(
      @ApiParam(value = "entity", required = true) SalConsignOutExceptionLogDTO entity)
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
  Iterable<SalConsignOutExceptionLogDTO> batchUpdate(
      @ApiParam(value = "entities", required = true)
          Iterable<SalConsignOutExceptionLogDTO> entities)
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
  SalConsignOutExceptionLogDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalConsignOutExceptionLogDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalConsignOutExceptionLogDTO> findByExample(
      @ApiParam("example") SalConsignOutExceptionLogDTO example,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param stockoutId
   * @param stockoutSeqno
   * @param conId
   * @param conSeqno
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param goodsId
   * @param goodsCode
   * @param goodsSpec
   * @param salUnitId
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param shippedQty
   * @param shippedNetWeight
   * @param shippedGrossWeight
   * @param shippedVolume
   * @param price
   * @param amount
   * @param shipSeq
   * @param consignTime
   * @param consignerId
   * @param consignerName
   * @param stockoutStatus
   * @param auditTime
   * @param auditorCode
   * @param auditorName
   * @param remark
   * @param note
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalConsignOutExceptionLogDTO> findBy(
      @ApiParam("stockoutId") Long stockoutId,
      @ApiParam("stockoutSeqno") String stockoutSeqno,
      @ApiParam("conId") Long conId,
      @ApiParam("conSeqno") String conSeqno,
      @ApiParam("orderId") Long orderId,
      @ApiParam("orderSeqno") String orderSeqno,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("salUnitId") Long salUnitId,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salUnitRate") java.math.BigDecimal salUnitRate,
      @ApiParam("salConOutDepotId") Long salConOutDepotId,
      @ApiParam("salConOutDepotCode") String salConOutDepotCode,
      @ApiParam("salConOutDepotName") String salConOutDepotName,
      @ApiParam("shippedQty") java.math.BigDecimal shippedQty,
      @ApiParam("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @ApiParam("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @ApiParam("shippedVolume") java.math.BigDecimal shippedVolume,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("amount") java.math.BigDecimal amount,
      @ApiParam("shipSeq") Integer shipSeq,
      @ApiParam("consignTime") java.util.Date consignTime,
      @ApiParam("consignerId") Long consignerId,
      @ApiParam("consignerName") String consignerName,
      @ApiParam("stockoutStatus") Integer stockoutStatus,
      @ApiParam("auditTime") java.util.Date auditTime,
      @ApiParam("auditorCode") String auditorCode,
      @ApiParam("auditorName") String auditorName,
      @ApiParam("remark") String remark,
      @ApiParam("note") String note,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
