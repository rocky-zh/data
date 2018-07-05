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
   * @param fullName
   * @param catId
   * @param parentCatClassId
   * @param parentCatClassCode
   * @param parentCatClassName
   * @param path
   * @param levelNum
   * @param isLeaf
   * @param code
   * @param name
   * @param entId
   * @param sourceId
   * @param isEnabled
   * @param showOrder
   * @param remark
   * @param tableId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasCatClassDTO> findBy(
      @ApiParam("fullName") String fullName,
      @ApiParam("catId") Long catId,
      @ApiParam("parentCatClassId") Long parentCatClassId,
      @ApiParam("parentCatClassCode") String parentCatClassCode,
      @ApiParam("parentCatClassName") String parentCatClassName,
      @ApiParam("path") String path,
      @ApiParam("levelNum") Integer levelNum,
      @ApiParam("isLeaf") Integer isLeaf,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("entId") Long entId,
      @ApiParam("sourceId") Long sourceId,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("showOrder") Integer showOrder,
      @ApiParam("remark") String remark,
      @ApiParam("tableId") Long tableId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 查找分类关系表中目录分类是否绑定数据
   *
   * @param catClassId
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "searchCatClassRelBindData", notes = "")
  Page<BasCatClassDTO> searchCatClassRelBindData(
      @ApiParam("cat_class_id") Long catClassId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 分页模糊查询目录分类
   *
   * @param id
   * @param catId
   * @param code
   * @param createdAt
   * @param creatorCode
   * @param creatorName
   * @param entId
   * @param fullName
   * @param isEnabled
   * @param isLeaf
   * @param lastModifiedAt
   * @param levelNum
   * @param modifierCode
   * @param modifierName
   * @param name
   * @param parentCatClassCode
   * @param parentCatClassId
   * @param parentCatClassName
   * @param path
   * @param showOrder
   * @param sourceId
   * @param tableId
   * @param version
   * @param remark
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "basCatClassFuzzyQuery", notes = "")
  Page<BasCatClassDTO> basCatClassFuzzyQuery(
      @ApiParam("id") Long id,
      @ApiParam("cat_id") Long catId,
      @ApiParam("code") String code,
      @ApiParam("created_at") java.util.Date createdAt,
      @ApiParam("creator_code") String creatorCode,
      @ApiParam("creator_name") String creatorName,
      @ApiParam("ent_id") Long entId,
      @ApiParam("full_name") String fullName,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("is_leaf") Integer isLeaf,
      @ApiParam("last_modified_at") java.util.Date lastModifiedAt,
      @ApiParam("level_num") Integer levelNum,
      @ApiParam("modifier_code") String modifierCode,
      @ApiParam("modifier_name") String modifierName,
      @ApiParam("name") String name,
      @ApiParam("parent_cat_class_code") String parentCatClassCode,
      @ApiParam("parent_cat_class_id") Long parentCatClassId,
      @ApiParam("parent_cat_class_name") String parentCatClassName,
      @ApiParam("path") String path,
      @ApiParam("show_order") Integer showOrder,
      @ApiParam("source_id") Long sourceId,
      @ApiParam("table_id") Long tableId,
      @ApiParam("version") Integer version,
      @ApiParam("remark") String remark,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 根据目录id查找直接(顶级)目录分类列表
   *
   * @param catId
   * @param deleted
   * @param entId
   * @param idList
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findTopBasCatClassByCatid", notes = "")
  Page<BasCatClassDTO> findTopBasCatClassByCatid(
      @ApiParam("cat_id") Long catId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 调整目录分类的父分类
   *
   * @param parentCatClassName
   * @param parentCatClassCode
   * @param id
   * @param deleted
   * @param parentCatClassId
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "setFatherClass", notes = "")
  Integer setFatherClass(
      @ApiParam("parent_cat_class_name") String parentCatClassName,
      @ApiParam("parent_cat_class_code") String parentCatClassCode,
      @ApiParam("id") Long id,
      @ApiParam("deleted") Long deleted,
      @ApiParam("parent_cat_class_id") Long parentCatClassId)
      throws ServiceException;
}
