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
public interface BaseSalConsignReturnDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalConsignReturnDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignReturnDetailDTO entity)
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
  Iterable<SalConsignReturnDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<SalConsignReturnDetailDTO> entities)
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
  SalConsignReturnDetailDTO update(
      @ApiParam(value = "entity", required = true) SalConsignReturnDetailDTO entity)
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
  Iterable<SalConsignReturnDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignReturnDetailDTO> entities)
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
  SalConsignReturnDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalConsignReturnDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalConsignReturnDetailDTO> findByExample(
      @ApiParam("example") SalConsignReturnDetailDTO example,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param returnId
   * @param returnSeqno
   * @param entId
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salUnitId
   * @param salUnitCode
   * @param salUnitName
   * @param salRate
   * @param salRetInDepotId
   * @param salRetInDepotCode
   * @param salRetInDepotName
   * @param returnQty
   * @param stockinQty
   * @param stockinNetWeight
   * @param stockinGrossWeight
   * @param price
   * @param returnPrice
   * @param taxRate
   * @param taxAmt
   * @param totalReturnAmt
   * @param totalStockinAmt
   * @param remark
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalConsignReturnDetailDTO> findBy(
      @ApiParam("returnId") Long returnId,
      @ApiParam("returnSeqno") String returnSeqno,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("salUnitId") Long salUnitId,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salRate") java.math.BigDecimal salRate,
      @ApiParam("salRetInDepotId") Long salRetInDepotId,
      @ApiParam("salRetInDepotCode") String salRetInDepotCode,
      @ApiParam("salRetInDepotName") String salRetInDepotName,
      @ApiParam("returnQty") java.math.BigDecimal returnQty,
      @ApiParam("stockinQty") java.math.BigDecimal stockinQty,
      @ApiParam("stockinNetWeight") java.math.BigDecimal stockinNetWeight,
      @ApiParam("stockinGrossWeight") java.math.BigDecimal stockinGrossWeight,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("returnPrice") java.math.BigDecimal returnPrice,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("taxAmt") java.math.BigDecimal taxAmt,
      @ApiParam("totalReturnAmt") java.math.BigDecimal totalReturnAmt,
      @ApiParam("totalStockinAmt") java.math.BigDecimal totalStockinAmt,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 通过退货单头表id获取退货单明细
   *
   * @param returnId
   * @param creatorOrgCode
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getSCRDetailsByReturnId", notes = "")
  Page<SalConsignReturnDetailDTO> getSCRDetailsByReturnId(
      @ApiParam("return_id") Long returnId,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据returnId删除退货单明细
   *
   * @param returnId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "deleteDetailByReturnId", notes = "")
  Integer deleteDetailByReturnId(@ApiParam("return_id") Long returnId) throws ServiceException;
}
