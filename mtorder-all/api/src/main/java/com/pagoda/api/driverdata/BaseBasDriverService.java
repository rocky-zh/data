package com.pagoda.api.driverdata;

import com.pagoda.api.dto.driverdata.*;
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
public interface BaseBasDriverService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasDriverDTO create(@ApiParam(value = "entity", required = true) @Valid BasDriverDTO entity)
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
  Iterable<BasDriverDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasDriverDTO> entities)
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
  BasDriverDTO update(@ApiParam(value = "entity", required = true) BasDriverDTO entity)
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
  Iterable<BasDriverDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasDriverDTO> entities)
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
  BasDriverDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasDriverDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasDriverDTO> findByExample(
      @ApiParam("example") BasDriverDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param code
   * @param name
   * @param mobile
   * @param shortNum
   * @param plateNum
   * @param loadingWeight
   * @param loadingVolume
   * @param payAcountNo
   * @param registeBank
   * @param driverIdNumber
   * @param conOrgCode
   * @param conOrgName
   * @param enabled
   * @param remark
   * @param entId
   * @param conOrgId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasDriverDTO> findBy(
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("mobile") String mobile,
      @ApiParam("shortNum") String shortNum,
      @ApiParam("plateNum") String plateNum,
      @ApiParam("loadingWeight") java.math.BigDecimal loadingWeight,
      @ApiParam("loadingVolume") java.math.BigDecimal loadingVolume,
      @ApiParam("payAcountNo") String payAcountNo,
      @ApiParam("registeBank") String registeBank,
      @ApiParam("driverIdNumber") String driverIdNumber,
      @ApiParam("conOrgCode") String conOrgCode,
      @ApiParam("conOrgName") String conOrgName,
      @ApiParam("enabled") Integer enabled,
      @ApiParam("remark") String remark,
      @ApiParam("entId") Long entId,
      @ApiParam("conOrgId") Long conOrgId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 查询司机定义列表
   *
   * @param code
   * @param name
   * @param enabled
   * @param conOrgId
   * @param mobile
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBasDriverList", notes = "")
  Page<BasDriverDTO> findBasDriverList(
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("enabled") Integer enabled,
      @ApiParam("conOrgId") Long conOrgId,
      @ApiParam("mobile") String mobile,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
