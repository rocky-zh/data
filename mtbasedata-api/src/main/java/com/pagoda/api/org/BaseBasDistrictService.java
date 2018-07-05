package com.pagoda.api.org;

import com.pagoda.api.dto.org.*;
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
public interface BaseBasDistrictService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasDistrictDTO create(@ApiParam(value = "entity", required = true) @Valid BasDistrictDTO entity)
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
  Iterable<BasDistrictDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasDistrictDTO> entities)
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
  BasDistrictDTO update(@ApiParam(value = "entity", required = true) BasDistrictDTO entity)
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
  Iterable<BasDistrictDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasDistrictDTO> entities)
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
  BasDistrictDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasDistrictDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasDistrictDTO> findByExample(
      @ApiParam("example") BasDistrictDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param districtLevel
   * @param code
   * @param parentCode
   * @param name
   * @param searchWord
   * @param adLat
   * @param adLng
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasDistrictDTO> findBy(
      @ApiParam("districtLevel") Integer districtLevel,
      @ApiParam("code") String code,
      @ApiParam("parentCode") String parentCode,
      @ApiParam("name") String name,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("adLat") java.math.BigDecimal adLat,
      @ApiParam("adLng") java.math.BigDecimal adLng,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 模糊查询城市 省份信息
   *
   * @param districtLevel
   * @param name
   * @param pCode
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectDistrictByLikeName", notes = "")
  Page<BasDistrictDTO> selectDistrictByLikeName(
      @ApiParam("district_level") Integer districtLevel,
      @ApiParam("name") String name,
      @ApiParam("p_code") String pCode,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
