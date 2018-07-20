package com.pagoda.api.pripurchase;

import com.pagoda.api.dto.pripurchase.*;
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
public interface BasePriceAdjustPurDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  PriceAdjustPurDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid PriceAdjustPurDetailDTO entity)
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
  Iterable<PriceAdjustPurDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<PriceAdjustPurDetailDTO> entities)
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
  PriceAdjustPurDetailDTO update(
      @ApiParam(value = "entity", required = true) PriceAdjustPurDetailDTO entity)
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
  Iterable<PriceAdjustPurDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PriceAdjustPurDetailDTO> entities)
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
  PriceAdjustPurDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<PriceAdjustPurDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<PriceAdjustPurDetailDTO> findByExample(
      @ApiParam("example") PriceAdjustPurDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param adjustId
   * @param adjustSeqno
   * @param entId
   * @param goodsCode
   * @param goodsName
   * @param goodsId
   * @param goodsSpec
   * @param goodsClassId
   * @param goodsClassCode
   * @param goodsClassName
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param unitRate
   * @param purPrice
   * @param remark
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<PriceAdjustPurDetailDTO> findBy(
      @ApiParam("adjustId") Long adjustId,
      @ApiParam("adjustSeqno") String adjustSeqno,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("goodsClassId") Long goodsClassId,
      @ApiParam("goodsClassCode") String goodsClassCode,
      @ApiParam("goodsClassName") String goodsClassName,
      @ApiParam("unitId") Long unitId,
      @ApiParam("unitCode") String unitCode,
      @ApiParam("unitName") String unitName,
      @ApiParam("unitRate") java.math.BigDecimal unitRate,
      @ApiParam("purPrice") java.math.BigDecimal purPrice,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 商品最新调价单查询
   *
   * @param seqno
   * @param arrOrgId
   * @param venOrgId
   * @param goodsId
   * @param effectDate1
   * @param effectDate2
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorCode
   * @param entId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findGoodsLastPriceAdjust", notes = "")
  Page<FindGoodsLastPriceAdjustDTO> findGoodsLastPriceAdjust(
      @ApiParam("seqno") String seqno,
      @ApiParam("arr_org_id") List<Long> arrOrgId,
      @ApiParam("ven_org_id") List<Long> venOrgId,
      @ApiParam("goods_id") List<Long> goodsId,
      @ApiParam("effect_date1") java.util.Date effectDate1,
      @ApiParam("effect_date2") java.util.Date effectDate2,
      @ApiParam("created_at1") java.util.Date createdAt1,
      @ApiParam("created_at2") java.util.Date createdAt2,
      @ApiParam("last_modified_at1") java.util.Date lastModifiedAt1,
      @ApiParam("last_modified_at2") java.util.Date lastModifiedAt2,
      @ApiParam("creator_code") String creatorCode,
      @ApiParam("ent_id") Long entId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * @param goodsId
   * @param venOrgName
   * @param arrOrgName
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findGoodsHistoryPrice", notes = "")
  Page<FindGoodsHistoryPriceDTO> findGoodsHistoryPrice(
      @ApiParam("goods_id") Long goodsId,
      @ApiParam("ven_org_name") String venOrgName,
      @ApiParam("arr_org_name") String arrOrgName,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
