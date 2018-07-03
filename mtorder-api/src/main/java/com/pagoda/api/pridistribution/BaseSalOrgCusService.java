package com.pagoda.api.pridistribution;

import com.pagoda.api.dto.pridistribution.*;
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
 * @author PagodaGenerator
 * @generated
 */
@Validated
public interface BaseSalOrgCusService {

    /**
     * Create a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity
     * @return the saved entity
     * @throws ServiceException
     */
    @ApiOperation(value = "create", notes = "新增一条记录")
    SalOrgCusDTO create(@ApiParam(value = "entity", required = true) @Valid SalOrgCusDTO entity) throws ServiceException;

    /**
     * Create all given entities.
     *
     * @param entities
     * @return the saved entities
     * @throws IllegalArgumentException in case the given entity is {@literal null}.
     * @throws ServiceException
     */
    @ApiOperation(value = "batchCreate", notes = "批量插入多条记录")
    Iterable<SalOrgCusDTO> batchCreate(@ApiParam(value = "entities", required = true) @Valid Iterable<SalOrgCusDTO> entities) throws ServiceException;


    /**
     * Update a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity
     * @return the saved entity
     * @throws ServiceException
     */
    @ApiOperation(value = "update", notes = "更新一条记录")
    SalOrgCusDTO update(@ApiParam(value = "entity", required = true) SalOrgCusDTO entity) throws ServiceException;

    /**
     * Update all given entities.
     *
     * @param entities
     * @return the saved entities
     * @throws IllegalArgumentException in case the given entity is {@literal null}.
     * @throws ServiceException
     */
    @ApiOperation(value = "batchUpdate", notes = "批量更新多条记录")
    Iterable<SalOrgCusDTO> batchUpdate(@ApiParam(value = "entities", required = true) Iterable<SalOrgCusDTO> entities) throws ServiceException;

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
    void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids) throws ServiceException;


    /**
     * Retrieves an entity by its id.
     *
     * @param id must not be {@literal null}.
     * @return the entity with the given id or {@literal null} if none found
     * @throws IllegalArgumentException if {@code id} is {@literal null}
     * @throws ServiceException
     */
    @ApiOperation(value = "getById", notes = "根据id查询记录")
    SalOrgCusDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

    /**
    * 根据主键id批量查询
    * @param idList
    * @return
    * @throws ServiceException
    */
    @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
    Iterable<SalOrgCusDTO> batchGetByIds(@ApiParam("idList") List<Long> idList) throws ServiceException;


 /**
   *  根据非空的字段进行查询
   *  
   * @param example
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByExample", notes = "根据非空字段查询")
  Page<SalOrgCusDTO> findByExample(@ApiParam("example") SalOrgCusDTO example,  @ApiParam("pageable") Pageable pageable)  throws ServiceException;


  /**
   * 所有可查询的字段
   * @param balCusOrgId
   * @param balCusOrgName
   * @param dualOrgName
   * @param isPickAutoRec
   * @param isPickLimitCon
   * @param billType
   * @param isStoBackPrice
   * @param isCreateBill
   * @param isDefaultCon
   * @param isDefaultAllot
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param balOrgId
   * @param balOrgName
   * @param priceCatId
   * @param priceCatCode
   * @param priceCatName
   * @param isEnabled
   * @param pageable
   * @return
   * @throws ServiceException
   */
    @ApiOperation(value = "findBy", notes = "根据非空字段查询")
    Page<SalOrgCusDTO> findBy(@ApiParam("balCusOrgId")Long balCusOrgId, @ApiParam("balCusOrgName")String balCusOrgName, @ApiParam("dualOrgName")String dualOrgName, @ApiParam("isPickAutoRec")Integer isPickAutoRec, @ApiParam("isPickLimitCon")Integer isPickLimitCon, @ApiParam("billType")Integer billType, @ApiParam("isStoBackPrice")Integer isStoBackPrice, @ApiParam("isCreateBill")Integer isCreateBill, @ApiParam("isDefaultCon")Integer isDefaultCon, @ApiParam("isDefaultAllot")Integer isDefaultAllot, @ApiParam("cusOrgId")Long cusOrgId, @ApiParam("cusOrgCode")String cusOrgCode, @ApiParam("cusOrgName")String cusOrgName, @ApiParam("orgOrgId")Long orgOrgId, @ApiParam("orgOrgCode")String orgOrgCode, @ApiParam("orgOrgName")String orgOrgName, @ApiParam("balOrgId")Long balOrgId, @ApiParam("balOrgName")String balOrgName, @ApiParam("priceCatId")Long priceCatId, @ApiParam("priceCatCode")String priceCatCode, @ApiParam("priceCatName")String priceCatName, @ApiParam("isEnabled")Integer isEnabled, @ApiParam("pageable") Pageable pageable) throws ServiceException;


    /**
     * 
     * @param pageable
     * @return
     * @throws ServiceException
     */
    @ApiOperation(value = "findSalOrgCusList", notes = "")
    Page<> findSalOrgCusList(@ApiParam("pageable") Pageable pageable) throws ServiceException;

    /**
     * 去重查询价格目录和发货机构
     * @param pageable
     * @return
     * @throws ServiceException
     */
    @ApiOperation(value = "findCatalogAndOrg", notes = "")
    Page<SalOrgCusDTO> findCatalogAndOrg(@ApiParam("pageable") Pageable pageable) throws ServiceException;

}