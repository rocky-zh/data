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
public interface BaseSalConsignDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalConsignDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignDetailDTO entity)
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
  Iterable<SalConsignDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalConsignDetailDTO> entities)
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
  SalConsignDetailDTO update(
      @ApiParam(value = "entity", required = true) SalConsignDetailDTO entity)
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
  Iterable<SalConsignDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignDetailDTO> entities)
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
  SalConsignDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalConsignDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalConsignDetailDTO> findByExample(
      @ApiParam("example") SalConsignDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param orderSeqno
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salunitId
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param grossWeight
   * @param netWeight
   * @param qty
   * @param volume
   * @param taxRate
   * @param price
   * @param discountRate
   * @param actualAmt
   * @param discountPrice
   * @param shippedPrice
   * @param shippedCount
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalConsignDetailDTO> findBy(
      @ApiParam("orderSeqno") String orderSeqno,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("salunitId") Long salunitId,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salUnitRate") java.math.BigDecimal salUnitRate,
      @ApiParam("salConOutDepotId") Long salConOutDepotId,
      @ApiParam("salConOutDepotCode") String salConOutDepotCode,
      @ApiParam("salConOutDepotName") String salConOutDepotName,
      @ApiParam("grossWeight") java.math.BigDecimal grossWeight,
      @ApiParam("netWeight") java.math.BigDecimal netWeight,
      @ApiParam("qty") java.math.BigDecimal qty,
      @ApiParam("volume") java.math.BigDecimal volume,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("discountRate") java.math.BigDecimal discountRate,
      @ApiParam("actualAmt") java.math.BigDecimal actualAmt,
      @ApiParam("discountPrice") java.math.BigDecimal discountPrice,
      @ApiParam("shippedPrice") java.math.BigDecimal shippedPrice,
      @ApiParam("shippedCount") Integer shippedCount,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据发货单id查询明细,用于发货时操作
   *
   * @param conId
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findSalConsignDetail", notes = "")
  Page<SalConsignDetailDTO> findSalConsignDetail(
      @ApiParam("con_id") Long conId,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 通过发货单id查看明细商品更多信息
   *
   * @param conId
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findSalConsignAllDetails", notes = "")
  Page<SalConsignDetailDTO> findSalConsignAllDetails(
      @ApiParam("con_id") Long conId,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
