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
public interface BaseSalConsignOutDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalConsignOutDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignOutDetailDTO entity)
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
  Iterable<SalConsignOutDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<SalConsignOutDetailDTO> entities)
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
  SalConsignOutDetailDTO update(
      @ApiParam(value = "entity", required = true) SalConsignOutDetailDTO entity)
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
  Iterable<SalConsignOutDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignOutDetailDTO> entities)
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
  SalConsignOutDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalConsignOutDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<SalConsignOutDetailDTO> findByExample(
      @ApiParam("example") SalConsignOutDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param stockoutId
   * @param stockoutSeqno
   * @param salUnitId
   * @param shipSeq
   * @param consignTime
   * @param consignerId
   * @param consignerName
   * @param note
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalConsignOutDetailDTO> findBy(
      @ApiParam("stockoutId") Long stockoutId,
      @ApiParam("stockoutSeqno") String stockoutSeqno,
      @ApiParam("salUnitId") Long salUnitId,
      @ApiParam("shipSeq") Integer shipSeq,
      @ApiParam("consignTime") java.sql.Timestamp consignTime,
      @ApiParam("consignerId") Long consignerId,
      @ApiParam("consignerName") String consignerName,
      @ApiParam("note") String note,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 查询发货出库单详情
   *
   * @param stockoutSeqno
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findSalConsignOutDetail", notes = "")
  Page<SalConsignOutDetailDTO> findSalConsignOutDetail(
      @ApiParam("stockout_seqno") String stockoutSeqno,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 查询单个商品发货详情
   *
   * @param conId
   * @param goodsId
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findGoodsOutDetail", notes = "")
  Page<SalConsignOutDetailDTO> findGoodsOutDetail(
      @ApiParam("con_id") Long conId,
      @ApiParam("goods_id") Long goodsId,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
