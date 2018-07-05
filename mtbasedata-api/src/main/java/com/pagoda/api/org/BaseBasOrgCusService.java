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
public interface BaseBasOrgCusService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasOrgCusDTO create(@ApiParam(value = "entity", required = true) @Valid BasOrgCusDTO entity)
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
  Iterable<BasOrgCusDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgCusDTO> entities)
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
  BasOrgCusDTO update(@ApiParam(value = "entity", required = true) BasOrgCusDTO entity)
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
  Iterable<BasOrgCusDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgCusDTO> entities)
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
  BasOrgCusDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasOrgCusDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasOrgCusDTO> findByExample(
      @ApiParam("example") BasOrgCusDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param invLimitAmt
   * @param isInvLimitAmt
   * @param checkMinAmt
   * @param isOrderCheck
   * @param isReturnCheck
   * @param returnDealType
   * @param isModifyPrice
   * @param isModifyCheck
   * @param isCusInv
   * @param isAllotCheck
   * @param isClosed
   * @param isOrderPaused
   * @param shopOwnerName
   * @param shopOwnerPhone
   * @param openingDate
   * @param isOuterLeague
   * @param isAutoRecIn
   * @param enabledStatus
   * @param salConInDepotId
   * @param salRetOutDepotId
   * @param orgId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasOrgCusDTO> findBy(
      @ApiParam("invLimitAmt") java.math.BigDecimal invLimitAmt,
      @ApiParam("isInvLimitAmt") Integer isInvLimitAmt,
      @ApiParam("checkMinAmt") Integer checkMinAmt,
      @ApiParam("isOrderCheck") Integer isOrderCheck,
      @ApiParam("isReturnCheck") Integer isReturnCheck,
      @ApiParam("returnDealType") Integer returnDealType,
      @ApiParam("isModifyPrice") Integer isModifyPrice,
      @ApiParam("isModifyCheck") Integer isModifyCheck,
      @ApiParam("isCusInv") Integer isCusInv,
      @ApiParam("isAllotCheck") Integer isAllotCheck,
      @ApiParam("isClosed") Integer isClosed,
      @ApiParam("isOrderPaused") Integer isOrderPaused,
      @ApiParam("shopOwnerName") String shopOwnerName,
      @ApiParam("shopOwnerPhone") String shopOwnerPhone,
      @ApiParam("openingDate") java.util.Date openingDate,
      @ApiParam("isOuterLeague") Integer isOuterLeague,
      @ApiParam("isAutoRecIn") Integer isAutoRecIn,
      @ApiParam("enabledStatus") Integer enabledStatus,
      @ApiParam("salConInDepotId") Long salConInDepotId,
      @ApiParam("salRetOutDepotId") Long salRetOutDepotId,
      @ApiParam("orgId") Long orgId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 删除客户信息 通过OrgId
   *
   * @param orgId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "deleteByOrgId", notes = "")
  Integer deleteByOrgId(@ApiParam("org_id") Long orgId) throws ServiceException;
}
