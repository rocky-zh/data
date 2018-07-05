package com.pagoda.api.goods;

import com.pagoda.api.dto.goods.*;
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
public interface BaseBasGoodsClassCodeRuleService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasGoodsClassCodeRuleDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasGoodsClassCodeRuleDTO entity)
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
  Iterable<BasGoodsClassCodeRuleDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<BasGoodsClassCodeRuleDTO> entities)
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
  BasGoodsClassCodeRuleDTO update(
      @ApiParam(value = "entity", required = true) BasGoodsClassCodeRuleDTO entity)
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
  Iterable<BasGoodsClassCodeRuleDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasGoodsClassCodeRuleDTO> entities)
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
  BasGoodsClassCodeRuleDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasGoodsClassCodeRuleDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  Page<BasGoodsClassCodeRuleDTO> findByExample(
      @ApiParam("example") BasGoodsClassCodeRuleDTO example,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param codeRuleId
   * @param name
   * @param goodsClassId
   * @param goodsClassCode
   * @param goodsClassName
   * @param isEnabled
   * @param isDefault
   * @param remark
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasGoodsClassCodeRuleDTO> findBy(
      @ApiParam("codeRuleId") Long codeRuleId,
      @ApiParam("name") String name,
      @ApiParam("goodsClassId") Long goodsClassId,
      @ApiParam("goodsClassCode") String goodsClassCode,
      @ApiParam("goodsClassName") String goodsClassName,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isDefault") Integer isDefault,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 商品类型的模糊查询方法
   *
   * @param name
   * @param goodsClassId
   * @param goodsClassName
   * @param remark
   * @param creatorCode
   * @param creatorName
   * @param creatorOrgCode
   * @param modifierCode
   * @param modifierName
   * @param modifierOrgCode
   * @param deleted
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "goodsClassCodeRuleFuzzyQuery", notes = "")
  Page<BasGoodsClassCodeRuleDTO> goodsClassCodeRuleFuzzyQuery(
      @ApiParam("name") String name,
      @ApiParam("goods_class_id") Long goodsClassId,
      @ApiParam("goods_class_name") String goodsClassName,
      @ApiParam("remark") String remark,
      @ApiParam("creator_code") String creatorCode,
      @ApiParam("creator_name") String creatorName,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("modifier_code") String modifierCode,
      @ApiParam("modifier_name") String modifierName,
      @ApiParam("modifier_org_code") String modifierOrgCode,
      @ApiParam("deleted") Long deleted,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 重置默认属性，以保证只有一个默认
   *
   * @param isDefault
   * @param name
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "resetDefaultValue", notes = "")
  Integer resetDefaultValue(
      @ApiParam("is_default") Integer isDefault, @ApiParam("name") String name)
      throws ServiceException;
}
