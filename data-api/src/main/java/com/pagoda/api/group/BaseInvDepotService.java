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
   * @param active
   * @param ad_code
   * @param ad_lat
   * @param ad_lng
   * @param address
   * @param bal_org_id
   * @param code
   * @param current_period
   * @param depot_center_id
   * @param enabled
   * @param is_allow_inv_out
   * @param is_allow_post_return
   * @param is_check_by_add
   * @param is_check_by_negative
   * @param is_check_by_post
   * @param is_check_input_need_check
   * @param is_check_qty_zero
   * @param is_check_show_fin_qty
   * @param is_dual_depot
   * @param is_enabled
   * @param is_pick_allocation
   * @param is_post_check_all
   * @param is_post_daily
   * @param is_post_daily_detail
   * @param is_pur_rec_in
   * @param is_pur_ret_out
   * @param is_sal_con_in
   * @param is_sal_con_out
   * @param is_sal_ret_in
   * @param is_sal_ret_out
   * @param is_sto_enabled
   * @param is_turn_exist_no_post
   * @param manage_type
   * @param measure_type
   * @param name
   * @param org_id
   * @param phone
   * @param search_word
   * @param sto_current_period
   * @param turn_date_time
   * @param turn_user_code
   * @param turn_user_name
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<InvDepotDTO> findBy(
      @ApiParam("active") Boolean active,
      @ApiParam("adCode") String adCode,
      @ApiParam("adLat") String adLat,
      @ApiParam("adLng") String adLng,
      @ApiParam("address") String address,
      @ApiParam("balOrgId") Long balOrgId,
      @ApiParam("code") String code,
      @ApiParam("currentPeriod") String currentPeriod,
      @ApiParam("depotCenterId") Integer depotCenterId,
      @ApiParam("enabled") Boolean enabled,
      @ApiParam("isAllowInvOut") Integer isAllowInvOut,
      @ApiParam("isAllowPostReturn") Integer isAllowPostReturn,
      @ApiParam("isCheckByAdd") Integer isCheckByAdd,
      @ApiParam("isCheckByNegative") Integer isCheckByNegative,
      @ApiParam("isCheckByPost") Integer isCheckByPost,
      @ApiParam("isCheckInputNeedCheck") Integer isCheckInputNeedCheck,
      @ApiParam("isCheckQtyZero") Integer isCheckQtyZero,
      @ApiParam("isCheckShowFinQty") Integer isCheckShowFinQty,
      @ApiParam("isDualDepot") Integer isDualDepot,
      @ApiParam("isEnabled") Integer isEnabled,
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
      @ApiParam("name") String name,
      @ApiParam("orgId") Long orgId,
      @ApiParam("phone") String phone,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("stoCurrentPeriod") Integer stoCurrentPeriod,
      @ApiParam("turnDateTime") java.sql.Timestamp turnDateTime,
      @ApiParam("turnUserCode") String turnUserCode,
      @ApiParam("turnUserName") String turnUserName,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
