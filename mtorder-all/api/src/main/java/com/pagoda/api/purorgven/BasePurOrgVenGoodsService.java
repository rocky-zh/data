package com.pagoda.api.purorgven;

import com.pagoda.api.dto.purorgven.*;
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
public interface BasePurOrgVenGoodsService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  PurOrgVenGoodsDTO create(
      @ApiParam(value = "entity", required = true) @Valid PurOrgVenGoodsDTO entity)
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
  Iterable<PurOrgVenGoodsDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PurOrgVenGoodsDTO> entities)
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
  PurOrgVenGoodsDTO update(@ApiParam(value = "entity", required = true) PurOrgVenGoodsDTO entity)
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
  Iterable<PurOrgVenGoodsDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PurOrgVenGoodsDTO> entities)
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
  PurOrgVenGoodsDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<PurOrgVenGoodsDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<PurOrgVenGoodsDTO> findByExample(
      @ApiParam("example") PurOrgVenGoodsDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param goodsClassName
   * @param basUnitName
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param unitRate
   * @param price
   * @param billTaxRate
   * @param discountTaxRate
   * @param taxType
   * @param isDefault
   * @param isEnabled
   * @param isAllowReturn
   * @param purDepotId
   * @param isAllowOrder
   * @param isAllowRec
   * @param goodsClassId
   * @param basUnitId
   * @param entId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<PurOrgVenGoodsDTO> findBy(
      @ApiParam("venOrgId") Long venOrgId,
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("orgOrgId") Long orgOrgId,
      @ApiParam("orgOrgCode") String orgOrgCode,
      @ApiParam("orgOrgName") String orgOrgName,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("goodsClassName") String goodsClassName,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("unitId") Long unitId,
      @ApiParam("unitCode") String unitCode,
      @ApiParam("unitName") String unitName,
      @ApiParam("unitRate") java.math.BigDecimal unitRate,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("billTaxRate") java.math.BigDecimal billTaxRate,
      @ApiParam("discountTaxRate") java.math.BigDecimal discountTaxRate,
      @ApiParam("taxType") Integer taxType,
      @ApiParam("isDefault") Integer isDefault,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isAllowReturn") Integer isAllowReturn,
      @ApiParam("purDepotId") Long purDepotId,
      @ApiParam("isAllowOrder") Integer isAllowOrder,
      @ApiParam("isAllowRec") Integer isAllowRec,
      @ApiParam("goodsClassId") Long goodsClassId,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("entId") Long entId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 已授权供应商机构商品查询
   *
   * @param venOrgIdList
   * @param orgOrgIdList
   * @param goodsClassIdList
   * @param goodsIdList
   * @param billTaxRate
   * @param taxType
   * @param isDefault
   * @param isEnabled
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectOrgVenGoodsAuthored", notes = "")
  Page<PurOrgVenGoodsDTO> selectOrgVenGoodsAuthored(
      @ApiParam("ven_org_id_list") List<Long> venOrgIdList,
      @ApiParam("org_org_id_list") List<Long> orgOrgIdList,
      @ApiParam("goods_class_id_list") List<Long> goodsClassIdList,
      @ApiParam("goods_id_list") List<Long> goodsIdList,
      @ApiParam("bill_tax_rate") java.math.BigDecimal billTaxRate,
      @ApiParam("tax_type") Integer taxType,
      @ApiParam("is_default") Integer isDefault,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
