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
   * @param balOrgId
   * @param balOrgCode
   * @param balOrgName
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param status
   * @param rebateMode
   * @param rebateRate
   * @param effectDate
   * @param expiryDate
   * @param isAllEffect
   * @param beginDate
   * @param endDate
   * @param remark
   * @param entId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasVenRebateHeadDTO> findBy(
      @ApiParam("no") String no,
      @ApiParam("balOrgId") Long balOrgId,
      @ApiParam("balOrgCode") String balOrgCode,
      @ApiParam("balOrgName") String balOrgName,
      @ApiParam("venOrgId") Long venOrgId,
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("status") Integer status,
      @ApiParam("rebateMode") Integer rebateMode,
      @ApiParam("rebateRate") java.math.BigDecimal rebateRate,
      @ApiParam("effectDate") java.util.Date effectDate,
      @ApiParam("expiryDate") java.util.Date expiryDate,
      @ApiParam("isAllEffect") Integer isAllEffect,
      @ApiParam("beginDate") java.util.Date beginDate,
      @ApiParam("endDate") java.util.Date endDate,
      @ApiParam("remark") String remark,
      @ApiParam("entId") Long entId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 查询供应商返利列表查询
   *
   * @param no
   * @param venOrgId
   * @param rebateMode
   * @param beginDate
   * @param endDate
   * @param effectDate
   * @param expiryDate
   * @param status
   * @param balOrgId
   * @param entId
   * @param deleted
   * @param isEnabled
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectVenRebateHeadList", notes = "")
  Page<BasVenRebateHeadDTO> selectVenRebateHeadList(
      @ApiParam("no") String no,
      @ApiParam("ven_org_id") Long venOrgId,
      @ApiParam("rebate_mode") Integer rebateMode,
      @ApiParam("begin_date") java.util.Date beginDate,
      @ApiParam("end_date") java.util.Date endDate,
      @ApiParam("effect_date") java.util.Date effectDate,
      @ApiParam("expiry_date") java.util.Date expiryDate,
      @ApiParam("status") Integer status,
      @ApiParam("bal_org_id") Long balOrgId,
      @ApiParam("ent_id") Long entId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 更新供应商返利协议状态
   *
   * @param effectDate
   * @param expiryDate
   * @param status
   * @param id
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "updateHeadStatus", notes = "")
  Integer updateHeadStatus(
      @ApiParam("effect_date") java.util.Date effectDate,
      @ApiParam("expiry_date") java.util.Date expiryDate,
      @ApiParam("status") Integer status,
      @ApiParam("id") Long id)
      throws ServiceException;
}
