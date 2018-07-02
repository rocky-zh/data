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
public interface BaseSalConsignOutHeadService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalConsignOutHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignOutHeadDTO entity)
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
  Iterable<SalConsignOutHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalConsignOutHeadDTO> entities)
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
  SalConsignOutHeadDTO update(
      @ApiParam(value = "entity", required = true) SalConsignOutHeadDTO entity)
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
  Iterable<SalConsignOutHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignOutHeadDTO> entities)
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
  SalConsignOutHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalConsignOutHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalConsignOutHeadDTO> findByExample(
      @ApiParam("example") SalConsignOutHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param seqno
   * @param entId
   * @param conId
   * @param conSeqno
   * @param preArrivalDate
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param transitLineNo
   * @param shippedQty
   * @param shippedGrossWeight
   * @param shippedNetWeight
   * @param shippedVolume
   * @param shippedAmt
   * @param taxAmt
   * @param stockoutStatus
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param remark
   * @param confirmUserCode
   * @param confirmUserName
   * @param confirmTime
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalConsignOutHeadDTO> findBy(
      @ApiParam("seqno") String seqno,
      @ApiParam("entId") Long entId,
      @ApiParam("conId") Long conId,
      @ApiParam("conSeqno") String conSeqno,
      @ApiParam("preArrivalDate") java.util.Date preArrivalDate,
      @ApiParam("conOrgId") Long conOrgId,
      @ApiParam("conOrgCode") String conOrgCode,
      @ApiParam("conOrgName") String conOrgName,
      @ApiParam("cusOrgId") Long cusOrgId,
      @ApiParam("cusOrgCode") String cusOrgCode,
      @ApiParam("cusOrgName") String cusOrgName,
      @ApiParam("transitLineNo") String transitLineNo,
      @ApiParam("shippedQty") java.math.BigDecimal shippedQty,
      @ApiParam("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @ApiParam("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @ApiParam("shippedVolume") java.math.BigDecimal shippedVolume,
      @ApiParam("shippedAmt") java.math.BigDecimal shippedAmt,
      @ApiParam("taxAmt") java.math.BigDecimal taxAmt,
      @ApiParam("stockoutStatus") Integer stockoutStatus,
      @ApiParam("auditorCode") String auditorCode,
      @ApiParam("auditorName") String auditorName,
      @ApiParam("auditTime") java.sql.Timestamp auditTime,
      @ApiParam("remark") String remark,
      @ApiParam("confirmUserCode") String confirmUserCode,
      @ApiParam("confirmUserName") String confirmUserName,
      @ApiParam("confirmTime") java.sql.Timestamp confirmTime,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据相关条件查询发货出库单单头部数据
   *
   * @param conSeqno
   * @param seqno
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param goodsCode
   * @param goodsName
   * @param stockoutStatus
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findSalConsignOutHead", notes = "")
  Page<FindSalConsignOutHeadDTO> findSalConsignOutHead(
      @ApiParam("con_seqno") String conSeqno,
      @ApiParam("seqno") String seqno,
      @ApiParam("con_org_code") String conOrgCode,
      @ApiParam("con_org_name") String conOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("transit_line_no") String transitLineNo,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("goods_code") String goodsCode,
      @ApiParam("goods_name") String goodsName,
      @ApiParam("stockout_status") Integer stockoutStatus,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 确认到货页面查询
   *
   * @param seqno
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param stockoutStatus
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findConfirmGoodsList", notes = "")
  Page<SalConsignOutHeadDTO> findConfirmGoodsList(
      @ApiParam("seqno") String seqno,
      @ApiParam("con_org_code") String conOrgCode,
      @ApiParam("con_org_name") String conOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("stockout_status") Integer stockoutStatus,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
