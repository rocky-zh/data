package com.pagoda.api.分组;

import com.pagoda.api.dto.分组.*;
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
public interface BaseInvDepotService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  InvDepotDTO create(@ApiParam(value = "entity", required = true) @Valid InvDepotDTO entity)
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
  Iterable<InvDepotDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<InvDepotDTO> entities)
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
  InvDepotDTO update(@ApiParam(value = "entity", required = true) InvDepotDTO entity)
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
  Iterable<InvDepotDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<InvDepotDTO> entities)
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
  InvDepotDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<InvDepotDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<InvDepotDTO> findByExample(
      @ApiParam("example") InvDepotDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param adCode
   * @param adLat
   * @param adLng
   * @param address
   * @param balOrgId
   * @param currentPeriod
   * @param depotCenterId
   * @param isAllowInvOut
   * @param isAllowPostReturn
   * @param isCheckByAdd
   * @param isCheckByNegative
   * @param isCheckByPost
   * @param isCheckInputNeedCheck
   * @param isCheckQtyZero
   * @param isCheckShowFinQty
   * @param isDualDepot
   * @param isPickAllocation
   * @param isPostCheckAll
   * @param isPostDaily
   * @param isPostDailyDetail
   * @param isPurRecIn
   * @param isPurRetOut
   * @param isSalConIn
   * @param isSalConOut
   * @param isSalRetIn
   * @param isSalRetOut
   * @param isStoEnabled
   * @param isTurnExistNoPost
   * @param manageType
   * @param measureType
   * @param orgId
   * @param phone
   * @param searchWord
   * @param stoCurrentPeriod
   * @param turnDateTime
   * @param turnUserCode
   * @param turnUserName
   * @param createDateTime
   * @param createOrgCode
   * @param createUserCode
   * @param createUserName
   * @param delId
   * @param depotAddress
   * @param depotPhone
   * @param orgCode
   * @param orgName
   * @param updateDateTime
   * @param updateOrgCode
   * @param updateUserCode
   * @param updateUserName
   * @param code
   * @param entId
   * @param isEnabled
   * @param name
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<InvDepotDTO> findBy(
      @ApiParam("adCode") String adCode,
      @ApiParam("adLat") String adLat,
      @ApiParam("adLng") String adLng,
      @ApiParam("address") String address,
      @ApiParam("balOrgId") Long balOrgId,
      @ApiParam("currentPeriod") String currentPeriod,
      @ApiParam("depotCenterId") Integer depotCenterId,
      @ApiParam("isAllowInvOut") Integer isAllowInvOut,
      @ApiParam("isAllowPostReturn") Integer isAllowPostReturn,
      @ApiParam("isCheckByAdd") Integer isCheckByAdd,
      @ApiParam("isCheckByNegative") Integer isCheckByNegative,
      @ApiParam("isCheckByPost") Integer isCheckByPost,
      @ApiParam("isCheckInputNeedCheck") Integer isCheckInputNeedCheck,
      @ApiParam("isCheckQtyZero") Integer isCheckQtyZero,
      @ApiParam("isCheckShowFinQty") Integer isCheckShowFinQty,
      @ApiParam("isDualDepot") Integer isDualDepot,
      @ApiParam("isPickAllocation") Integer isPickAllocation,
      @ApiParam("isPostCheckAll") Integer isPostCheckAll,
      @ApiParam("isPostDaily") Integer isPostDaily,
      @ApiParam("isPostDailyDetail") Integer isPostDailyDetail,
      @ApiParam("isPurRecIn") Integer isPurRecIn,
      @ApiParam("isPurRetOut") Integer isPurRetOut,
      @ApiParam("isSalConIn") Integer isSalConIn,
      @ApiParam("isSalConOut") Integer isSalConOut,
      @ApiParam("isSalRetIn") Integer isSalRetIn,
      @ApiParam("isSalRetOut") Integer isSalRetOut,
      @ApiParam("isStoEnabled") Integer isStoEnabled,
      @ApiParam("isTurnExistNoPost") Integer isTurnExistNoPost,
      @ApiParam("manageType") Integer manageType,
      @ApiParam("measureType") Integer measureType,
      @ApiParam("orgId") Long orgId,
      @ApiParam("phone") String phone,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("stoCurrentPeriod") Integer stoCurrentPeriod,
      @ApiParam("turnDateTime") java.sql.Timestamp turnDateTime,
      @ApiParam("turnUserCode") String turnUserCode,
      @ApiParam("turnUserName") String turnUserName,
      @ApiParam("createDateTime") java.sql.Timestamp createDateTime,
      @ApiParam("createOrgCode") String createOrgCode,
      @ApiParam("createUserCode") String createUserCode,
      @ApiParam("createUserName") String createUserName,
      @ApiParam("delId") Integer delId,
      @ApiParam("depotAddress") String depotAddress,
      @ApiParam("depotPhone") String depotPhone,
      @ApiParam("orgCode") String orgCode,
      @ApiParam("orgName") String orgName,
      @ApiParam("updateDateTime") java.sql.Timestamp updateDateTime,
      @ApiParam("updateOrgCode") String updateOrgCode,
      @ApiParam("updateUserCode") String updateUserCode,
      @ApiParam("updateUserName") String updateUserName,
      @ApiParam("code") String code,
      @ApiParam("entId") Long entId,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("name") String name,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据目录或者目录分类查找库房
   *
   * @param catId
   * @param path
   * @param tableId
   * @param version
   * @param id
   * @param adCode
   * @param adLat
   * @param adLng
   * @param depotCenterId
   * @param entId
   * @param turnDateTime
   * @param orgId
   * @param isEnabled
   * @param name
   * @param code
   * @param currentPeriod
   * @param deleted
   * @param codeList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findInvDepotByCatClass", notes = "")
  Page<FindInvDepotByCatClassDTO> findInvDepotByCatClass(
      @ApiParam("cat_id") Long catId,
      @ApiParam("path") String path,
      @ApiParam("table_id") Integer tableId,
      @ApiParam("version") Integer version,
      @ApiParam("id") Long id,
      @ApiParam("ad_code") String adCode,
      @ApiParam("ad_lat") String adLat,
      @ApiParam("ad_lng") String adLng,
      @ApiParam("depot_center_id") Integer depotCenterId,
      @ApiParam("ent_id") Long entId,
      @ApiParam("turn_date_time") java.sql.Timestamp turnDateTime,
      @ApiParam("org_id") Long orgId,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("name") String name,
      @ApiParam("code") String code,
      @ApiParam("current_period") String currentPeriod,
      @ApiParam("deleted") Long deleted,
      @ApiParam("code_list") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 下拉模糊查询库房信息
   *
   * @param deleted
   * @param isEnabled
   * @param entId
   * @param name
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectInvByCodeOrName", notes = "")
  Page<InvDepotDTO> selectInvByCodeOrName(
      @ApiParam("deleted") Long deleted,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("ent_id") Long entId,
      @ApiParam("name") String name,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
