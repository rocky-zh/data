package com.pagoda.api.cat;

import com.pagoda.api.dto.cat.*;
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
public interface BaseBasCatService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasCatDTO create(@ApiParam(value = "entity", required = true) @Valid BasCatDTO entity)
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
  Iterable<BasCatDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasCatDTO> entities)
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
  BasCatDTO update(@ApiParam(value = "entity", required = true) BasCatDTO entity)
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
  Iterable<BasCatDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasCatDTO> entities)
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
  BasCatDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasCatDTO> batchGetByIds(@ApiParam("idList") List<Long> idList) throws ServiceException;

  /**
   * 根据非空的字段进行查询
   *
   * @param example
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByExample", notes = "根据非空字段查询")
  Page<BasCatDTO> findByExample(
      @ApiParam("example") BasCatDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param code
   * @param name
   * @param entId
   * @param tableId
   * @param isEnabled
   * @param isDefault
   * @param isMulti
   * @param showOrder
   * @param remark
   * @param searchWord
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasCatDTO> findBy(
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("entId") Long entId,
      @ApiParam("tableId") Long tableId,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isDefault") Integer isDefault,
      @ApiParam("isMulti") Integer isMulti,
      @ApiParam("showOrder") Integer showOrder,
      @ApiParam("remark") String remark,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据目录id查询目录下是否存在目录分类
   *
   * @param catId
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "searchBasCatClassByCatId", notes = "")
  Page<BasCatDTO> searchBasCatClassByCatId(
      @ApiParam("cat_id") Long catId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 模糊查询目录代码列表
   *
   * @param code
   * @param tableId
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "searchBasCatCode", notes = "")
  Page<BasCatDTO> searchBasCatCode(
      @ApiParam("code") String code,
      @ApiParam("table_id") Long tableId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 模糊查询目录名称
   *
   * @param name
   * @param tableId
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "searchBasCatName", notes = "")
  Page<BasCatDTO> searchBasCatName(
      @ApiParam("name") String name,
      @ApiParam("table_id") Long tableId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 设置默认目录
   *
   * @param tableId
   * @param deleted
   * @param id
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "setDefaultCat", notes = "")
  Integer setDefaultCat(
      @ApiParam("table_id") Long tableId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id") Long id)
      throws ServiceException;

  /**
   * 设置默认目录之前将所有目录设置为非默认目录以保障只有一个默认目录
   *
   * @param tableId
   * @param isDefault
   * @param deleted
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "restDefaultBasCat", notes = "")
  Integer restDefaultBasCat(
      @ApiParam("table_id") Long tableId,
      @ApiParam("is_default") Integer isDefault,
      @ApiParam("deleted") Long deleted)
      throws ServiceException;

  /**
   * 目录定义的模糊查询
   *
   * @param id
   * @param code
   * @param createdAt
   * @param creatorCode
   * @param creatorName
   * @param entId
   * @param isDefault
   * @param isEnabled
   * @param lastModifiedAt
   * @param modifierCode
   * @param modifierName
   * @param name
   * @param showOrder
   * @param tableId
   * @param version
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "basCatFuzzyQuery", notes = "")
  Page<BasCatDTO> basCatFuzzyQuery(
      @ApiParam("id") Long id,
      @ApiParam("code") String code,
      @ApiParam("created_at") java.util.Date createdAt,
      @ApiParam("creator_code") String creatorCode,
      @ApiParam("creator_name") String creatorName,
      @ApiParam("ent_id") Long entId,
      @ApiParam("is_default") Integer isDefault,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("last_modified_at") java.util.Date lastModifiedAt,
      @ApiParam("modifier_code") String modifierCode,
      @ApiParam("modifier_name") String modifierName,
      @ApiParam("name") String name,
      @ApiParam("show_order") Integer showOrder,
      @ApiParam("table_id") Long tableId,
      @ApiParam("version") Integer version,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
