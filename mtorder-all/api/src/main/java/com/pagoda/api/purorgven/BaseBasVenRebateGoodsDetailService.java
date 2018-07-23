package com.pagoda.api.purorgven;

import com.pagoda.api.dto.purorgven.*;
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
public interface BaseBasVenRebateGoodsDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasVenRebateGoodsDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasVenRebateGoodsDetailDTO entity)
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
  Iterable<BasVenRebateGoodsDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<BasVenRebateGoodsDetailDTO> entities)
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
  BasVenRebateGoodsDetailDTO update(
      @ApiParam(value = "entity", required = true) BasVenRebateGoodsDetailDTO entity)
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
  Iterable<BasVenRebateGoodsDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasVenRebateGoodsDetailDTO> entities)
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
  BasVenRebateGoodsDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasVenRebateGoodsDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasVenRebateGoodsDetailDTO> findByExample(
      @ApiParam("example") BasVenRebateGoodsDetailDTO example,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param rebateId
   * @param rebateNo
   * @param entId
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param goodsClassId
   * @param goodsClassCode
   * @param goodsClassName
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param effectDate
   * @param expiryDate
   * @param status
   * @param remark
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasVenRebateGoodsDetailDTO> findBy(
      @ApiParam("rebateId") Long rebateId,
      @ApiParam("rebateNo") String rebateNo,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("goodsClassId") Long goodsClassId,
      @ApiParam("goodsClassCode") String goodsClassCode,
      @ApiParam("goodsClassName") String goodsClassName,
      @ApiParam("unitId") Long unitId,
      @ApiParam("unitCode") String unitCode,
      @ApiParam("unitName") String unitName,
      @ApiParam("effectDate") java.util.Date effectDate,
      @ApiParam("expiryDate") java.util.Date expiryDate,
      @ApiParam("status") Integer status,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 查询已授权的供应商机构返利商品明细
   *
   * @param goodsClassId
   * @param goodsName
   * @param goodsCode
   * @param status
   * @param entId
   * @param deleted
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectVenRebateGoodsDetailAuthored", notes = "")
  Page<BasVenRebateGoodsDetailDTO> selectVenRebateGoodsDetailAuthored(
      @ApiParam("goods_class_id") Long goodsClassId,
      @ApiParam("goods_name") String goodsName,
      @ApiParam("goods_code") String goodsCode,
      @ApiParam("status") Integer status,
      @ApiParam("ent_id") Long entId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 通过协议号id更新商品明细状态
   *
   * @param status
   * @param rebateId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "updateGoodsDetailStatusByRebateId", notes = "")
  Integer updateGoodsDetailStatusByRebateId(
      @ApiParam("status") Integer status, @ApiParam("rebate_id") Long rebateId)
      throws ServiceException;
}
