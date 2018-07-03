package com.pagoda.api.salconsign;

import com.pagoda.api.dto.salconsign.*;
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
public interface BaseSalConsignHeadService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalConsignHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignHeadDTO entity)
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
  Iterable<SalConsignHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalConsignHeadDTO> entities)
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
  SalConsignHeadDTO update(@ApiParam(value = "entity", required = true) SalConsignHeadDTO entity)
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
  Iterable<SalConsignHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignHeadDTO> entities)
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
  SalConsignHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalConsignHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalConsignHeadDTO> findByExample(
      @ApiParam("example") SalConsignHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param seqno
   * @param entId
   * @param orderId
   * @param orderNo
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param waveNo
   * @param transitLineNo
   * @param tatalQty
   * @param taxAmt
   * @param totalAmt
   * @param shippedQty
   * @param shippedAmt
   * @param preArrivalDate
   * @param entryDate
   * @param conStatus
   * @param printStatus
   * @param printCount
   * @param remark
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalConsignHeadDTO> findBy(
      @ApiParam("seqno") String seqno,
      @ApiParam("entId") Long entId,
      @ApiParam("orderId") Long orderId,
      @ApiParam("orderNo") String orderNo,
      @ApiParam("conOrgId") Long conOrgId,
      @ApiParam("conOrgCode") String conOrgCode,
      @ApiParam("conOrgName") String conOrgName,
      @ApiParam("cusOrgId") Long cusOrgId,
      @ApiParam("cusOrgCode") String cusOrgCode,
      @ApiParam("cusOrgName") String cusOrgName,
      @ApiParam("waveNo") String waveNo,
      @ApiParam("transitLineNo") String transitLineNo,
      @ApiParam("tatalQty") java.math.BigDecimal tatalQty,
      @ApiParam("taxAmt") java.math.BigDecimal taxAmt,
      @ApiParam("totalAmt") java.math.BigDecimal totalAmt,
      @ApiParam("shippedQty") java.math.BigDecimal shippedQty,
      @ApiParam("shippedAmt") java.math.BigDecimal shippedAmt,
      @ApiParam("preArrivalDate") java.util.Date preArrivalDate,
      @ApiParam("entryDate") java.util.Date entryDate,
      @ApiParam("conStatus") Integer conStatus,
      @ApiParam("printStatus") Integer printStatus,
      @ApiParam("printCount") Integer printCount,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据相关条件查询发货单头部数据
   *
   * @param seqno
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param waveNo
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param conStatus
   * @param creatorOrgCode
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findSalConsignHead", notes = "")
  Page<SalConsignHeadDTO> findSalConsignHead(
      @ApiParam("seqno") String seqno,
      @ApiParam("con_org_code") String conOrgCode,
      @ApiParam("con_org_name") String conOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("wave_no") String waveNo,
      @ApiParam("transit_line_no") String transitLineNo,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("con_status") Integer conStatus,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 点击打印时符合条件的所有发货单打印次数加1
   *
   * @param conNo
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param waveNo
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param conStatus
   * @param creatorOrgCode
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "updatePrintCount", notes = "")
  Integer updatePrintCount(
      @ApiParam("con_no") String conNo,
      @ApiParam("con_org_code") String conOrgCode,
      @ApiParam("con_org_name") String conOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("wave_no") String waveNo,
      @ApiParam("transit_line_no") String transitLineNo,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("con_status") Integer conStatus,
      @ApiParam("creator_org_code") String creatorOrgCode)
      throws ServiceException;
}
