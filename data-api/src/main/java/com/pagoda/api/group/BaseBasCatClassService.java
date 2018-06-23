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
public interface BaseBasCatClassService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasCatClassDTO create(@ApiParam(value = "entity", required = true) @Valid BasCatClassDTO entity)
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
  Iterable<BasCatClassDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasCatClassDTO> entities)
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
  BasCatClassDTO update(@ApiParam(value = "entity", required = true) BasCatClassDTO entity)
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
  Iterable<BasCatClassDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasCatClassDTO> entities)
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
  BasCatClassDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasCatClassDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
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
  BasCatClassDTO createLeafNode(
      @ApiParam(value = "entity", required = true) @Valid BasCatClassDTO entity,
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
  BasCatClassDTO getParentNode(
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
  Iterable<BasCatClassDTO> getChildren(
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
  List<BasCatClassDTO> getLeafNodes(
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
  BasCatClassDTO getTree(
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
  Page<BasCatClassDTO> findByExample(
      @ApiParam("example") BasCatClassDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param full_name
   * @param is_leaf
   * @param level_num
   * @param parent_cat_class_code
   * @param parent_cat_class_id
   * @param parent_cat_class_name
   * @param path
   * @param source_id
   * @param code
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasCatClassDTO> findBy(
      @ApiParam("fullName") String fullName,
      @ApiParam("isLeaf") String isLeaf,
      @ApiParam("levelNum") Integer levelNum,
      @ApiParam("parentCatClassCode") String parentCatClassCode,
      @ApiParam("parentCatClassId") Integer parentCatClassId,
      @ApiParam("parentCatClassName") String parentCatClassName,
      @ApiParam("path") String path,
      @ApiParam("sourceId") Integer sourceId,
      @ApiParam("code") String code,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
