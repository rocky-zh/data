package com.pagoda.api.purapplyorder;

import com.pagoda.api.dto.purapplyorder.*;
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
public interface BasePurApplyHeadService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  PurApplyHeadDTO create(@ApiParam(value = "entity", required = true) @Valid PurApplyHeadDTO entity)
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
  Iterable<PurApplyHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PurApplyHeadDTO> entities)
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
  PurApplyHeadDTO update(@ApiParam(value = "entity", required = true) PurApplyHeadDTO entity)
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
  Iterable<PurApplyHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PurApplyHeadDTO> entities)
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
  PurApplyHeadDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<PurApplyHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<PurApplyHeadDTO> findByExample(
      @ApiParam("example") PurApplyHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param seqno
   * @param entId
   * @param sourceType
   * @param applyOrgId
   * @param applyOrgCode
   * @param applyOrgName
   * @param arrOrgId
   * @param arrOrgCode
   * @param arrOrgName
   * @param planRecDate
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param applyStatus
   * @param calType
   * @param calPurRate
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<PurApplyHeadDTO> findBy(
      @ApiParam("seqno") String seqno,
      @ApiParam("entId") Long entId,
      @ApiParam("sourceType") Integer sourceType,
      @ApiParam("applyOrgId") Long applyOrgId,
      @ApiParam("applyOrgCode") String applyOrgCode,
      @ApiParam("applyOrgName") String applyOrgName,
      @ApiParam("arrOrgId") Long arrOrgId,
      @ApiParam("arrOrgCode") String arrOrgCode,
      @ApiParam("arrOrgName") String arrOrgName,
      @ApiParam("planRecDate") java.util.Date planRecDate,
      @ApiParam("auditorCode") String auditorCode,
      @ApiParam("auditorName") String auditorName,
      @ApiParam("auditTime") java.sql.Timestamp auditTime,
      @ApiParam("applyStatus") Integer applyStatus,
      @ApiParam("calType") Integer calType,
      @ApiParam("calPurRate") java.math.BigDecimal calPurRate,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
