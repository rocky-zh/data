package com.pagoda.api.group;

import com.pagoda.api.dto.group.*;
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
public interface BaseBasOrgService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasOrgDTO create(@ApiParam(value = "entity", required = true) @Valid BasOrgDTO entity)
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
  Iterable<BasOrgDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgDTO> entities)
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
  BasOrgDTO update(@ApiParam(value = "entity", required = true) BasOrgDTO entity)
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
  Iterable<BasOrgDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgDTO> entities)
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
  BasOrgDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasOrgDTO> batchGetByIds(@ApiParam("idList") List<Long> idList) throws ServiceException;

  /**
   * 根据非空的字段进行查询
   *
   * @param example
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByExample", notes = "根据非空字段查询")
  Page<BasOrgDTO> findByExample(
      @ApiParam("example") BasOrgDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param bal_org_name
   * @param contact_person
   * @param dep_code
   * @param dep_id
   * @param dep_name
   * @param email
   * @param is_bal
   * @param is_cus
   * @param is_dep
   * @param is_org
   * @param is_org_group
   * @param is_out
   * @param is_ven
   * @param mobile_phone
   * @param register_address
   * @param telephone
   * @param code
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasOrgDTO> findBy(
      @ApiParam("balOrgName") String balOrgName,
      @ApiParam("contactPerson") String contactPerson,
      @ApiParam("depCode") String depCode,
      @ApiParam("depId") Long depId,
      @ApiParam("depName") String depName,
      @ApiParam("email") String email,
      @ApiParam("isBal") Integer isBal,
      @ApiParam("isCus") Integer isCus,
      @ApiParam("isDep") Integer isDep,
      @ApiParam("isOrg") Integer isOrg,
      @ApiParam("isOrgGroup") Integer isOrgGroup,
      @ApiParam("isOut") Integer isOut,
      @ApiParam("isVen") Integer isVen,
      @ApiParam("mobilePhone") String mobilePhone,
      @ApiParam("registerAddress") String registerAddress,
      @ApiParam("telephone") String telephone,
      @ApiParam("code") String code,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
