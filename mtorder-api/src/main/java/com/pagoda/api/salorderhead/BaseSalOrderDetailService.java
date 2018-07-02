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
public interface BaseSalOrderDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalOrderDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalOrderDetailDTO entity)
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
  Iterable<SalOrderDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalOrderDetailDTO> entities)
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
  SalOrderDetailDTO update(@ApiParam(value = "entity", required = true) SalOrderDetailDTO entity)
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
  Iterable<SalOrderDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalOrderDetailDTO> entities)
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
  SalOrderDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalOrderDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalOrderDetailDTO> findByExample(
      @ApiParam("example") SalOrderDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param orderId
   * @param orderSeqno
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
   * @param requestQty
   * @param maxOrderQty
   * @param minOrderQty
   * @param price
   * @param discountPrice
   * @param discountRate
   * @param discountAmt
   * @param taxRate
   * @param taxAmt
   * @param goodsAmt
   * @param totalAmt
   * @param remark
   * @param sourceType
   * @param sourceId
   * @param sourceNo
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalOrderDetailDTO> findBy(
      @ApiParam("orderId") Long orderId,
      @ApiParam("orderSeqno") String orderSeqno,
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
      @ApiParam("requestQty") java.math.BigDecimal requestQty,
      @ApiParam("maxOrderQty") java.math.BigDecimal maxOrderQty,
      @ApiParam("minOrderQty") java.math.BigDecimal minOrderQty,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("discountPrice") java.math.BigDecimal discountPrice,
      @ApiParam("discountRate") java.math.BigDecimal discountRate,
      @ApiParam("discountAmt") java.math.BigDecimal discountAmt,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("taxAmt") java.math.BigDecimal taxAmt,
      @ApiParam("goodsAmt") java.math.BigDecimal goodsAmt,
      @ApiParam("totalAmt") java.math.BigDecimal totalAmt,
      @ApiParam("remark") String remark,
      @ApiParam("sourceType") Integer sourceType,
      @ApiParam("sourceId") Long sourceId,
      @ApiParam("sourceNo") String sourceNo,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
