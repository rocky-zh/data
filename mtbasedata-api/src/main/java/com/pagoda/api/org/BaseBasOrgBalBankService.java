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
public interface BaseBasOrgBalBankService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasOrgBalBankDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasOrgBalBankDTO entity)
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
  Iterable<BasOrgBalBankDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgBalBankDTO> entities)
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
  BasOrgBalBankDTO update(@ApiParam(value = "entity", required = true) BasOrgBalBankDTO entity)
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
  Iterable<BasOrgBalBankDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgBalBankDTO> entities)
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
  BasOrgBalBankDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasOrgBalBankDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasOrgBalBankDTO> findByExample(
      @ApiParam("example") BasOrgBalBankDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param bank
   * @param provinceName
   * @param cityName
   * @param registerBank
   * @param accountName
   * @param bankAccountNo
   * @param cityCode
   * @param provinceCode
   * @param balOrgId
   * @param isDefault
   * @param remark
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasOrgBalBankDTO> findBy(
      @ApiParam("bank") String bank,
      @ApiParam("provinceName") String provinceName,
      @ApiParam("cityName") String cityName,
      @ApiParam("registerBank") String registerBank,
      @ApiParam("accountName") String accountName,
      @ApiParam("bankAccountNo") String bankAccountNo,
      @ApiParam("cityCode") String cityCode,
      @ApiParam("provinceCode") String provinceCode,
      @ApiParam("balOrgId") Long balOrgId,
      @ApiParam("isDefault") Integer isDefault,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 将改结算单位的所有默认开户行改为否
   *
   * @param balOrgId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "updateDefByBalOrgId", notes = "")
  Integer updateDefByBalOrgId(@ApiParam("bal_org_id") Long balOrgId) throws ServiceException;

  /**
   * 修改开户行的是否默认
   *
   * @param id
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "updateDefById", notes = "")
  Integer updateDefById(@ApiParam("id") Long id) throws ServiceException;

  /**
   * 通过结算单位Id删除开户行信息
   *
   * @param balOrgId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "deleteByBalOrgId", notes = "")
  Integer deleteByBalOrgId(@ApiParam("bal_org_id") Long balOrgId) throws ServiceException;
}
