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
public interface BasePurApplyDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  PurApplyDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid PurApplyDetailDTO entity)
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
  Iterable<PurApplyDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PurApplyDetailDTO> entities)
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
  PurApplyDetailDTO update(@ApiParam(value = "entity", required = true) PurApplyDetailDTO entity)
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
  Iterable<PurApplyDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PurApplyDetailDTO> entities)
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
  PurApplyDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<PurApplyDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<PurApplyDetailDTO> findByExample(
      @ApiParam("example") PurApplyDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param apply_id
   * @param apply_price
   * @param apply_qty
   * @param bas_unit_code
   * @param bas_unit_id
   * @param bas_unit_name
   * @param cal_cus_order_qty
   * @param cal_cus_sal_qty
   * @param cal_inv_qty
   * @param cal_on_way_qty
   * @param cal_outer_fer_qty
   * @param cal_pur_rate
   * @param cal_replenishment_qty
   * @param cal_stock_up_qty
   * @param confirm_qty
   * @param deal_pur_qty
   * @param deal_sal_org_id
   * @param deal_sal_qty
   * @param deal_status
   * @param del_id
   * @param goods_level
   * @param goods_orion
   * @param inv_price
   * @param pur_unit_code
   * @param pur_unit_id
   * @param pur_unit_name
   * @param pur_unit_rate
   * @param request_qty
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<PurApplyDetailDTO> findBy(
      @ApiParam("applyId") Long applyId,
      @ApiParam("applyPrice") java.math.BigDecimal applyPrice,
      @ApiParam("applyQty") Integer applyQty,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("calCusOrderQty") Double calCusOrderQty,
      @ApiParam("calCusSalQty") Double calCusSalQty,
      @ApiParam("calInvQty") Double calInvQty,
      @ApiParam("calOnWayQty") Double calOnWayQty,
      @ApiParam("calOuterFerQty") Double calOuterFerQty,
      @ApiParam("calPurRate") Double calPurRate,
      @ApiParam("calReplenishmentQty") Double calReplenishmentQty,
      @ApiParam("calStockUpQty") Double calStockUpQty,
      @ApiParam("confirmQty") Integer confirmQty,
      @ApiParam("dealPurQty") Integer dealPurQty,
      @ApiParam("dealSalOrgId") String dealSalOrgId,
      @ApiParam("dealSalQty") Integer dealSalQty,
      @ApiParam("dealStatus") Integer dealStatus,
      @ApiParam("delId") Integer delId,
      @ApiParam("goodsLevel") Integer goodsLevel,
      @ApiParam("goodsOrion") String goodsOrion,
      @ApiParam("invPrice") java.math.BigDecimal invPrice,
      @ApiParam("purUnitCode") String purUnitCode,
      @ApiParam("purUnitId") Long purUnitId,
      @ApiParam("purUnitName") String purUnitName,
      @ApiParam("purUnitRate") Double purUnitRate,
      @ApiParam("requestQty") Integer requestQty,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
