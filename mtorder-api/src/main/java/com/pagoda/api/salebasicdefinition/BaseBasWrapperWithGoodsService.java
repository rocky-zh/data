package com.pagoda.api.salebasicdefinition;

import com.pagoda.api.dto.salebasicdefinition.*;
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
public interface BaseBasWrapperWithGoodsService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasWrapperWithGoodsDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasWrapperWithGoodsDTO entity)
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
  Iterable<BasWrapperWithGoodsDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<BasWrapperWithGoodsDTO> entities)
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
  BasWrapperWithGoodsDTO update(
      @ApiParam(value = "entity", required = true) BasWrapperWithGoodsDTO entity)
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
  Iterable<BasWrapperWithGoodsDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasWrapperWithGoodsDTO> entities)
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
  BasWrapperWithGoodsDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasWrapperWithGoodsDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasWrapperWithGoodsDTO> findByExample(
      @ApiParam("example") BasWrapperWithGoodsDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param mainGoodsId
   * @param mainGoodsCode
   * @param mainGoodsName
   * @param mainUnitId
   * @param mainUnitName
   * @param mainCardinal
   * @param wrapGoodsId
   * @param wrapGoodsCode
   * @param wrapGoodsName
   * @param wrapUnitId
   * @param wrapUnitName
   * @param wrapCardinal
   * @param isRound
   * @param isEnabled
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasWrapperWithGoodsDTO> findBy(
      @ApiParam("orgOrgId") Long orgOrgId,
      @ApiParam("orgOrgCode") String orgOrgCode,
      @ApiParam("orgOrgName") String orgOrgName,
      @ApiParam("mainGoodsId") Long mainGoodsId,
      @ApiParam("mainGoodsCode") String mainGoodsCode,
      @ApiParam("mainGoodsName") String mainGoodsName,
      @ApiParam("mainUnitId") Long mainUnitId,
      @ApiParam("mainUnitName") String mainUnitName,
      @ApiParam("mainCardinal") java.math.BigDecimal mainCardinal,
      @ApiParam("wrapGoodsId") Long wrapGoodsId,
      @ApiParam("wrapGoodsCode") String wrapGoodsCode,
      @ApiParam("wrapGoodsName") String wrapGoodsName,
      @ApiParam("wrapUnitId") Long wrapUnitId,
      @ApiParam("wrapUnitName") String wrapUnitName,
      @ApiParam("wrapCardinal") java.math.BigDecimal wrapCardinal,
      @ApiParam("isRound") Integer isRound,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
