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
public interface BaseSalOrderHeadService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalOrderHeadDTO create(@ApiParam(value = "entity", required = true) @Valid SalOrderHeadDTO entity)
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
  Iterable<SalOrderHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalOrderHeadDTO> entities)
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
  SalOrderHeadDTO update(@ApiParam(value = "entity", required = true) SalOrderHeadDTO entity)
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
  Iterable<SalOrderHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalOrderHeadDTO> entities)
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
  SalOrderHeadDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalOrderHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalOrderHeadDTO> findByExample(
      @ApiParam("example") SalOrderHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param entId
   * @param seqno
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param preArrivalDate
   * @param transitLineNo
   * @param totalAmt
   * @param goodsAmt
   * @param taxAmt
   * @param totalRequestQty
   * @param orderType
   * @param inputMode
   * @param orderStatus
   * @param remark
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param commitTime
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalOrderHeadDTO> findBy(
      @ApiParam("entId") Long entId,
      @ApiParam("seqno") String seqno,
      @ApiParam("cusOrgId") Long cusOrgId,
      @ApiParam("cusOrgCode") String cusOrgCode,
      @ApiParam("cusOrgName") String cusOrgName,
      @ApiParam("preArrivalDate") java.util.Date preArrivalDate,
      @ApiParam("transitLineNo") String transitLineNo,
      @ApiParam("totalAmt") java.math.BigDecimal totalAmt,
      @ApiParam("goodsAmt") java.math.BigDecimal goodsAmt,
      @ApiParam("taxAmt") java.math.BigDecimal taxAmt,
      @ApiParam("totalRequestQty") java.math.BigDecimal totalRequestQty,
      @ApiParam("orderType") Integer orderType,
      @ApiParam("inputMode") Integer inputMode,
      @ApiParam("orderStatus") Integer orderStatus,
      @ApiParam("remark") String remark,
      @ApiParam("orgOrgId") Long orgOrgId,
      @ApiParam("orgOrgCode") String orgOrgCode,
      @ApiParam("orgOrgName") String orgOrgName,
      @ApiParam("commitTime") java.util.Date commitTime,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 查询出录入日期为当天的订单List
   *
   * @param version
   * @param calDateTimeSub
   * @param calDateTimeAdd
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findSalOrderHeadBetween", notes = "")
  Page<SalOrderHeadDTO> findSalOrderHeadBetween(
      @ApiParam("version") Integer version,
      @ApiParam("calDateTimeSub") java.util.Date calDateTimeSub,
      @ApiParam("calDateTimeAdd") java.util.Date calDateTimeAdd,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
