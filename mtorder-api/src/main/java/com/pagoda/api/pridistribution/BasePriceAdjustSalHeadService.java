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
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public interface BasePriceAdjustSalHeadService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  PriceAdjustSalHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid PriceAdjustSalHeadDTO entity)
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
  Iterable<PriceAdjustSalHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<PriceAdjustSalHeadDTO> entities)
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
  PriceAdjustSalHeadDTO update(
      @ApiParam(value = "entity", required = true) PriceAdjustSalHeadDTO entity)
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
  Iterable<PriceAdjustSalHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PriceAdjustSalHeadDTO> entities)
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
  PriceAdjustSalHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<PriceAdjustSalHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<PriceAdjustSalHeadDTO> findByExample(
      @ApiParam("example") PriceAdjustSalHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param seqno
   * @param entId
   * @param priceCatName
   * @param priceCatCode
   * @param priceCatId
   * @param status
   * @param entryTime
   * @param effectDate
   * @param auditTime
   * @param auditorCode
   * @param auditorName
   * @param remark
   * @param note
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<PriceAdjustSalHeadDTO> findBy(
      @ApiParam("seqno") String seqno,
      @ApiParam("entId") Long entId,
      @ApiParam("priceCatName") String priceCatName,
      @ApiParam("priceCatCode") String priceCatCode,
      @ApiParam("priceCatId") Long priceCatId,
      @ApiParam("status") Integer status,
      @ApiParam("entryTime") java.sql.Timestamp entryTime,
      @ApiParam("effectDate") java.util.Date effectDate,
      @ApiParam("auditTime") java.sql.Timestamp auditTime,
      @ApiParam("auditorCode") String auditorCode,
      @ApiParam("auditorName") String auditorName,
      @ApiParam("remark") String remark,
      @ApiParam("note") String note,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 配送调价单列表
   *
   * @param effectDate1
   * @param effectDate2
   * @param priceCatCode
   * @param priceCatName
   * @param status
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorOrgCode
   * @param creatorOrgCodeList
   * @param seqno
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findAdjusNoList", notes = "")
  Page<PriceAdjustSalHeadDTO> findAdjusNoList(
      @ApiParam("effect_date1") java.util.Date effectDate1,
      @ApiParam("effect_date2") java.util.Date effectDate2,
      @ApiParam("price_cat_code") String priceCatCode,
      @ApiParam("price_cat_name") String priceCatName,
      @ApiParam("status") Integer status,
      @ApiParam("created_at1") java.sql.Timestamp createdAt1,
      @ApiParam("created_at2") java.sql.Timestamp createdAt2,
      @ApiParam("last_modified_at1") java.sql.Timestamp lastModifiedAt1,
      @ApiParam("last_modified_at2") java.sql.Timestamp lastModifiedAt2,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("creator_org_code_list") String creatorOrgCodeList,
      @ApiParam("seqno") String seqno,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
