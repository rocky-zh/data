package com.pagoda.api.purapplyorder;

import com.pagoda.api.dto.purapplyorder.*;
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
   * @param applyId
   * @param applySeqno
   * @param goodsOrion
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param purUnitRate
   * @param requestQty
   * @param applyQty
   * @param confirmQty
   * @param invPrice
   * @param dealPurQty
   * @param dealSalQty
   * @param dealStatus
   * @param dealSalOrgId
   * @param calCusOrderQty
   * @param calOuterFerQty
   * @param calCusSalQty
   * @param calInvQty
   * @param calOnWayQty
   * @param calStockUpQty
   * @param calReplenishmentQty
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param planRecDate
   * @param remark
   * @param calPurRate
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<PurApplyDetailDTO> findBy(
      @ApiParam("applyId") Long applyId,
      @ApiParam("applySeqno") String applySeqno,
      @ApiParam("goodsOrion") String goodsOrion,
      @ApiParam("purUnitId") Long purUnitId,
      @ApiParam("purUnitCode") String purUnitCode,
      @ApiParam("purUnitName") String purUnitName,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("purUnitRate") java.math.BigDecimal purUnitRate,
      @ApiParam("requestQty") java.math.BigDecimal requestQty,
      @ApiParam("applyQty") java.math.BigDecimal applyQty,
      @ApiParam("confirmQty") java.math.BigDecimal confirmQty,
      @ApiParam("invPrice") java.math.BigDecimal invPrice,
      @ApiParam("dealPurQty") java.math.BigDecimal dealPurQty,
      @ApiParam("dealSalQty") java.math.BigDecimal dealSalQty,
      @ApiParam("dealStatus") Integer dealStatus,
      @ApiParam("dealSalOrgId") Long dealSalOrgId,
      @ApiParam("calCusOrderQty") java.math.BigDecimal calCusOrderQty,
      @ApiParam("calOuterFerQty") java.math.BigDecimal calOuterFerQty,
      @ApiParam("calCusSalQty") java.math.BigDecimal calCusSalQty,
      @ApiParam("calInvQty") java.math.BigDecimal calInvQty,
      @ApiParam("calOnWayQty") java.math.BigDecimal calOnWayQty,
      @ApiParam("calStockUpQty") java.math.BigDecimal calStockUpQty,
      @ApiParam("calReplenishmentQty") java.math.BigDecimal calReplenishmentQty,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("planRecDate") java.util.Date planRecDate,
      @ApiParam("remark") String remark,
      @ApiParam("calPurRate") java.math.BigDecimal calPurRate,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
