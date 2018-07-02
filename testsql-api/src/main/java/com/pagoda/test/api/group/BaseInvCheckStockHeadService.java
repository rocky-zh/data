package com.pagoda.test.api.group;

import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.api.*;

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
public interface BaseInvCheckStockHeadService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  InvCheckStockHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid InvCheckStockHeadDTO entity)
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
  Iterable<InvCheckStockHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<InvCheckStockHeadDTO> entities)
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
  InvCheckStockHeadDTO update(
      @ApiParam(value = "entity", required = true) InvCheckStockHeadDTO entity)
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
  Iterable<InvCheckStockHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<InvCheckStockHeadDTO> entities)
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
  InvCheckStockHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<InvCheckStockHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<InvCheckStockHeadDTO> findByExample(
      @ApiParam("example") InvCheckStockHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param active
   * @param adjustDate
   * @param adjustUserId
   * @param billDate
   * @param billNo
   * @param billType
   * @param checkQty
   * @param checkStatus
   * @param checkType
   * @param depotCode
   * @param depotId
   * @param depotName
   * @param enabled
   * @param entId
   * @param periodNo
   * @param remark
   * @param ioLimit
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<InvCheckStockHeadDTO> findBy(
      @ApiParam("active") Boolean active,
      @ApiParam("adjustDate") java.sql.Timestamp adjustDate,
      @ApiParam("adjustUserId") String adjustUserId,
      @ApiParam("billDate") java.util.Date billDate,
      @ApiParam("billNo") Long billNo,
      @ApiParam("billType") String billType,
      @ApiParam("checkQty") Long checkQty,
      @ApiParam("checkStatus") Integer checkStatus,
      @ApiParam("checkType") Integer checkType,
      @ApiParam("depotCode") String depotCode,
      @ApiParam("depotId") Long depotId,
      @ApiParam("depotName") String depotName,
      @ApiParam("enabled") Boolean enabled,
      @ApiParam("entId") Long entId,
      @ApiParam("periodNo") Long periodNo,
      @ApiParam("remark") String remark,
      @ApiParam("ioLimit") Boolean ioLimit,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
