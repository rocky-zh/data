package com.pagoda.api.purorder;

import com.pagoda.api.dto.purorder.*;
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
public interface BasePurOrderDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  PurOrderDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid PurOrderDetailDTO entity)
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
  Iterable<PurOrderDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PurOrderDetailDTO> entities)
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
  PurOrderDetailDTO update(@ApiParam(value = "entity", required = true) PurOrderDetailDTO entity)
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
  Iterable<PurOrderDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PurOrderDetailDTO> entities)
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
  PurOrderDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<PurOrderDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<PurOrderDetailDTO> findByExample(
      @ApiParam("example") PurOrderDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param recOrgId
   * @param recOrgCode
   * @param recOrgName
   * @param isPrePrice
   * @param purQty
   * @param discountType
   * @param isRec
   * @param recQty
   * @param isRecInv
   * @param billStatus
   * @param billQty
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param goodsLevel
   * @param goodsOrion
   * @param applyQty
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param purUnitRate
   * @param arrOrgId
   * @param arrOrgCode
   * @param arrOrgName
   * @param sourceType
   * @param requestQty
   * @param planRecDate
   * @param purPrice
   * @param taxRate
   * @param discountAmt
   * @param isReturn
   * @param returnQty
   * @param applyId
   * @param applySeqno
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param remark
   * @param stockinQty
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<PurOrderDetailDTO> findBy(
      @ApiParam("recOrgId") Long recOrgId,
      @ApiParam("recOrgCode") String recOrgCode,
      @ApiParam("recOrgName") String recOrgName,
      @ApiParam("isPrePrice") Integer isPrePrice,
      @ApiParam("purQty") java.math.BigDecimal purQty,
      @ApiParam("discountType") Integer discountType,
      @ApiParam("isRec") Integer isRec,
      @ApiParam("recQty") java.math.BigDecimal recQty,
      @ApiParam("isRecInv") Integer isRecInv,
      @ApiParam("billStatus") Integer billStatus,
      @ApiParam("billQty") java.math.BigDecimal billQty,
      @ApiParam("orderId") Long orderId,
      @ApiParam("orderSeqno") String orderSeqno,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("goodsLevel") Integer goodsLevel,
      @ApiParam("goodsOrion") String goodsOrion,
      @ApiParam("applyQty") java.math.BigDecimal applyQty,
      @ApiParam("purUnitId") Long purUnitId,
      @ApiParam("purUnitCode") String purUnitCode,
      @ApiParam("purUnitName") String purUnitName,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("purUnitRate") java.math.BigDecimal purUnitRate,
      @ApiParam("arrOrgId") Long arrOrgId,
      @ApiParam("arrOrgCode") String arrOrgCode,
      @ApiParam("arrOrgName") String arrOrgName,
      @ApiParam("sourceType") Integer sourceType,
      @ApiParam("requestQty") java.math.BigDecimal requestQty,
      @ApiParam("planRecDate") java.util.Date planRecDate,
      @ApiParam("purPrice") java.math.BigDecimal purPrice,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("discountAmt") java.math.BigDecimal discountAmt,
      @ApiParam("isReturn") Integer isReturn,
      @ApiParam("returnQty") java.math.BigDecimal returnQty,
      @ApiParam("applyId") Long applyId,
      @ApiParam("applySeqno") String applySeqno,
      @ApiParam("venOrgId") Long venOrgId,
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("remark") String remark,
      @ApiParam("stockinQty") java.math.BigDecimal stockinQty,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
