package com.pagoda.api.salconsignreturn;

import com.pagoda.api.dto.salconsignreturn.*;
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
public interface BaseSalConsignReturnHeadService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalConsignReturnHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignReturnHeadDTO entity)
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
  Iterable<SalConsignReturnHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<SalConsignReturnHeadDTO> entities)
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
  SalConsignReturnHeadDTO update(
      @ApiParam(value = "entity", required = true) SalConsignReturnHeadDTO entity)
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
  Iterable<SalConsignReturnHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignReturnHeadDTO> entities)
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
  SalConsignReturnHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalConsignReturnHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalConsignReturnHeadDTO> findByExample(
      @ApiParam("example") SalConsignReturnHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param returnType
   * @param returnDate
   * @param returnQty
   * @param stockinQty
   * @param stockinGrossWeight
   * @param stockinNetWeight
   * @param totalTaxAmt
   * @param totalReturnAmt
   * @param totalStockinAmt
   * @param status
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalConsignReturnHeadDTO> findBy(
      @ApiParam("returnType") Integer returnType,
      @ApiParam("returnDate") java.sql.Timestamp returnDate,
      @ApiParam("returnQty") java.math.BigDecimal returnQty,
      @ApiParam("stockinQty") java.math.BigDecimal stockinQty,
      @ApiParam("stockinGrossWeight") java.math.BigDecimal stockinGrossWeight,
      @ApiParam("stockinNetWeight") java.math.BigDecimal stockinNetWeight,
      @ApiParam("totalTaxAmt") java.math.BigDecimal totalTaxAmt,
      @ApiParam("totalReturnAmt") java.math.BigDecimal totalReturnAmt,
      @ApiParam("totalStockinAmt") java.math.BigDecimal totalStockinAmt,
      @ApiParam("status") Integer status,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 退货单及退货单审核列表查询
   *
   * @param seqno
   * @param arrOrgCode
   * @param arrOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param returnType
   * @param status
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findSalConsignReturnHead", notes = "")
  Page<SalConsignReturnHeadDTO> findSalConsignReturnHead(
      @ApiParam("seqno") String seqno,
      @ApiParam("arr_org_code") String arrOrgCode,
      @ApiParam("arr_org_name") String arrOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("return_type") Integer returnType,
      @ApiParam("status") Integer status,
      @ApiParam("transit_line_no") String transitLineNo,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 修改打印次数
   *
   * @param seqno
   * @param arrOrgCode
   * @param arrOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param returnType
   * @param status
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param creatorOrgCode
   * @param codeList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "updatePrintCount", notes = "")
  Integer updatePrintCount(
      @ApiParam("seqno") String seqno,
      @ApiParam("arr_org_code") String arrOrgCode,
      @ApiParam("arr_org_name") String arrOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("return_type") Integer returnType,
      @ApiParam("status") Integer status,
      @ApiParam("transit_line_no") String transitLineNo,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList)
      throws ServiceException;
}
