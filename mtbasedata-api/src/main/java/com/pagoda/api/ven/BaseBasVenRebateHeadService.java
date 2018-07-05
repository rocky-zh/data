package com.pagoda.api.ven;

import com.pagoda.api.dto.ven.*;
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
public interface BaseBasVenRebateHeadService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasVenRebateHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasVenRebateHeadDTO entity)
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
  Iterable<BasVenRebateHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasVenRebateHeadDTO> entities)
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
  BasVenRebateHeadDTO update(
      @ApiParam(value = "entity", required = true) BasVenRebateHeadDTO entity)
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
  Iterable<BasVenRebateHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasVenRebateHeadDTO> entities)
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
  BasVenRebateHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasVenRebateHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasVenRebateHeadDTO> findByExample(
      @ApiParam("example") BasVenRebateHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param no
   * @param balOrgCode
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param rebateMode
   * @param rebateRate
   * @param isAllEffect
   * @param beginDate
   * @param endDate
   * @param balOrgId
   * @param balOrgName
   * @param status
   * @param effectDate
   * @param expiryDate
   * @param remark
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasVenRebateHeadDTO> findBy(
      @ApiParam("no") String no,
      @ApiParam("balOrgCode") String balOrgCode,
      @ApiParam("venOrgId") Long venOrgId,
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("rebateMode") Integer rebateMode,
      @ApiParam("rebateRate") java.math.BigDecimal rebateRate,
      @ApiParam("isAllEffect") Integer isAllEffect,
      @ApiParam("beginDate") java.util.Date beginDate,
      @ApiParam("endDate") java.util.Date endDate,
      @ApiParam("balOrgId") Long balOrgId,
      @ApiParam("balOrgName") String balOrgName,
      @ApiParam("status") Integer status,
      @ApiParam("effectDate") java.util.Date effectDate,
      @ApiParam("expiryDate") java.util.Date expiryDate,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
