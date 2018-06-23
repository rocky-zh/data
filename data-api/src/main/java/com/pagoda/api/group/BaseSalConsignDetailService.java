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
public interface BaseSalConsignDetailService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  SalConsignDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignDetailDTO entity)
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
  Iterable<SalConsignDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalConsignDetailDTO> entities)
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
  SalConsignDetailDTO update(
      @ApiParam(value = "entity", required = true) SalConsignDetailDTO entity)
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
  Iterable<SalConsignDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignDetailDTO> entities)
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
  SalConsignDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<SalConsignDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException;

  /**
   * 新增一条叶子节点记录
   *
   * @param entity 节点记录
   * @param pid 父节点id
   * @param catId 目录id
   * @param entId 企业id
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "createLeafNode", notes = "新增一个叶子节点记录")
  SalConsignDetailDTO createLeafNode(
      @ApiParam(value = "entity", required = true) @Valid SalConsignDetailDTO entity,
      @ApiParam(value = "pid", required = true) Long pid,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException;

  /**
   * 删除一个叶子节点记录
   *
   * @param id
   * @param catId
   * @param entId
   * @throws ServiceException
   */
  @ApiOperation(value = "deleteLeafNode", notes = "删除一个叶子节点记录")
  void deleteLeafNode(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException;

  /**
   * 删除节点对应的整个子树
   *
   * @param id
   * @param catId
   * @param entId
   */
  @ApiOperation(value = "deleteSubTree", notes = "删除节点对应的整个子树")
  void deleteSubTree(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId);

  /**
   * 查询上一层的父节点
   *
   * @param id 查询id对应的节点的父节点
   * @param catId
   * @param entId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getParentNode", notes = "查询上一层的父节点")
  SalConsignDetailDTO getParentNode(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException;

  /**
   * 修改cid节点的父节点，把cid节点对应的整个子树迁移到pid节点下面
   *
   * @param pid
   * @param cid
   * @param catId
   * @param entId
   * @throws ServiceException
   */
  @ApiOperation(value = "moveSubTree", notes = "修改cid节点的父节点，把cid节点对应的整个子树迁移到pid节点下面")
  public void moveSubTree(
      @ApiParam(value = "pid", required = true) Long pid,
      @ApiParam(value = "cid", required = true) Long cid,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException;

  /**
   * 查询直接子节点
   *
   * @param id
   * @param catId
   * @param entId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getChildren", notes = "取得id之下的所有直接子节点")
  Iterable<SalConsignDetailDTO> getChildren(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException;

  /**
   * 取得id之下的子树中的所有叶子节点
   *
   * @param id
   * @param catId
   * @param entId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getLeafNodes", notes = "取得id之下的子树，以一个树形结构返回")
  List<SalConsignDetailDTO> getLeafNodes(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
      throws ServiceException;

  /**
   * 取得id之下的子树，以一个树形结构返回。
   *
   * @param id
   * @param catId
   * @param entId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getTree", notes = "取得id之下的子树，以一个树形结构返回")
  SalConsignDetailDTO getTree(
      @ApiParam(value = "id", required = true) Long id,
      @ApiParam(value = "catId", required = true) Long catId,
      @ApiParam(value = "entId", required = true) Long entId)
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
  Page<SalConsignDetailDTO> findByExample(
      @ApiParam("example") SalConsignDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param actual_amt
   * @param con_id
   * @param con_no
   * @param discount_price
   * @param discount_rate
   * @param enabled
   * @param goods_code
   * @param goods_id
   * @param goods_name
   * @param goods_spec
   * @param gross_weight
   * @param net_weight
   * @param order_id
   * @param order_no
   * @param price
   * @param qty
   * @param sal_con_out_depot_code
   * @param sal_con_out_depot_id
   * @param sal_con_out_depot_name
   * @param sal_unit_code
   * @param sal_unit_id
   * @param sal_unit_name
   * @param sal_unit_rate
   * @param shipped_amt
   * @param shipped_count
   * @param shipped_gross_weight
   * @param shipped_net_weight
   * @param shipped_price
   * @param shipped_qty
   * @param shipped_volume
   * @param tax_amt
   * @param tax_rate
   * @param total_amt
   * @param volume
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<SalConsignDetailDTO> findBy(
      @ApiParam("actualAmt") java.math.BigDecimal actualAmt,
      @ApiParam("conId") Long conId,
      @ApiParam("conNo") String conNo,
      @ApiParam("discountPrice") java.math.BigDecimal discountPrice,
      @ApiParam("discountRate") java.math.BigDecimal discountRate,
      @ApiParam("enabled") Boolean enabled,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("grossWeight") java.math.BigDecimal grossWeight,
      @ApiParam("netWeight") java.math.BigDecimal netWeight,
      @ApiParam("orderId") Long orderId,
      @ApiParam("orderNo") String orderNo,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("qty") java.math.BigDecimal qty,
      @ApiParam("salConOutDepotCode") String salConOutDepotCode,
      @ApiParam("salConOutDepotId") Long salConOutDepotId,
      @ApiParam("salConOutDepotName") String salConOutDepotName,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitId") Long salUnitId,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salUnitRate") java.math.BigDecimal salUnitRate,
      @ApiParam("shippedAmt") java.math.BigDecimal shippedAmt,
      @ApiParam("shippedCount") Integer shippedCount,
      @ApiParam("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @ApiParam("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @ApiParam("shippedPrice") java.math.BigDecimal shippedPrice,
      @ApiParam("shippedQty") java.math.BigDecimal shippedQty,
      @ApiParam("shippedVolume") java.math.BigDecimal shippedVolume,
      @ApiParam("taxAmt") java.math.BigDecimal taxAmt,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("totalAmt") java.math.BigDecimal totalAmt,
      @ApiParam("volume") java.math.BigDecimal volume,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
