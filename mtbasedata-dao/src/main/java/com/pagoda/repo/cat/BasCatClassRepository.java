package com.pagoda.repo.cat;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.cat.*;
import com.pagoda.domain.cat.*;
import com.pagoda.repo.cat.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * BasCatClass 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasCatClassRepository
    extends BasCatClassRepositoryCustom, PagodaJpaRepository<BasCatClass, Long> {

  /**
   * 查找分类关系表中目录分类是否绑定数据
   *
   * @param catClassId
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "searchCatClassRelBindData",
    sql =
        "select cat_class_code from bas_cat_class_rel where {{#cat_class_id}}cat_class_id=:cat_class_id and {{/cat_class_id}} {{#deleted}}deleted=:deleted and{{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  Page<BasCatClassDTO> searchCatClassRelBindData(
      @Param("cat_class_id") Long catClassId,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList,
      @Param("pageable") Pageable pageable);

  /**
   * 查找分类关系表中目录分类是否绑定数据
   *
   * @param catClassId
   * @param deleted
   * @param idList
   * @return
   */
  @SqlTemplate(
    name = "searchCatClassRelBindData",
    sql =
        "select cat_class_code from bas_cat_class_rel where {{#cat_class_id}}cat_class_id=:cat_class_id and {{/cat_class_id}} {{#deleted}}deleted=:deleted and{{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  List<BasCatClassDTO> searchCatClassRelBindData(
      @Param("cat_class_id") Long catClassId,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList);

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
   */
  @SqlTemplate(
    name = "basCatClassFuzzyQuery",
    sql =
        "select id,cat_id,code,created_at,creator_code,creator_name,creator_org_code,ent_id,full_name,is_enabled,is_leaf,last_modified_at,level_num,modifier_code,modifier_name,modifier_org_code,name,parent_cat_class_code,parent_cat_class_id,parent_cat_class_name,path,show_order,source_id,table_id,tree_path,remark,version from bas_cat_class where {{#id}}id=:id and {{/id}} {{#cat_id}}cat_id=:cat_id and {{/cat_id}} {{#code}}code like '%{{code}}%' and {{/code}} {{#created_at}}created_at=:created_at and {{/created_at}} {{#creator_code}}creator_code like '%{{creator_code}}%' and {{/creator_code}} {{#creator_name}}creator_name like '%{{creator_name}}%' and {{/creator_name}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#full_name}}full_name like '%{{full_name}}%' and {{/full_name}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#is_leaf}}is_leaf=:is_leaf and {{/is_leaf}} {{#last_modified_at}}last_modified_at=:last_modified_at and {{/last_modified_at}} {{#level_num}}level_num=:level_num and {{/level_num}} {{#modifier_code}}modifier_code like '%{{modifier_code}}%' and {{/modifier_code}} {{#modifier_name}}modifier_name like '%{{modifier_name}}%' and {{/modifier_name}} {{#name}}name like '%{{name}}%' and {{/name}} {{#parent_cat_class_code}}parent_cat_class_code like '%{{parent_cat_class_code}}%' and {{/parent_cat_class_code}} {{#parent_cat_class_id}}parent_cat_class_id=:parent_cat_class_id and {{/parent_cat_class_id}} {{#parent_cat_class_name}}parent_cat_class_name like '%{{parent_cat_class_name}}%' and {{/parent_cat_class_name}} {{#path}}path like '%{{path}}%' and {{/path}} {{#show_order}}show_order like '%{{show_order}}%' and {{/show_order}} {{#source_id}}source_id=:source_id and {{/source_id}} {{#table_id}}table_id=:table_id and {{/table_id}} {{#version}}version like '%{{version}}%' and {{/version}} {{#remark}}remark like '%{{remark}}%' and {{/remark}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  Page<BasCatClassDTO> basCatClassFuzzyQuery(
      @Param("id") Long id,
      @Param("cat_id") Long catId,
      @Param("code") String code,
      @Param("created_at") java.util.Date createdAt,
      @Param("creator_code") String creatorCode,
      @Param("creator_name") String creatorName,
      @Param("ent_id") Long entId,
      @Param("full_name") String fullName,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_leaf") Integer isLeaf,
      @Param("last_modified_at") java.util.Date lastModifiedAt,
      @Param("level_num") Integer levelNum,
      @Param("modifier_code") String modifierCode,
      @Param("modifier_name") String modifierName,
      @Param("name") String name,
      @Param("parent_cat_class_code") String parentCatClassCode,
      @Param("parent_cat_class_id") Long parentCatClassId,
      @Param("parent_cat_class_name") String parentCatClassName,
      @Param("path") String path,
      @Param("show_order") Integer showOrder,
      @Param("source_id") Long sourceId,
      @Param("table_id") Long tableId,
      @Param("version") Integer version,
      @Param("remark") String remark,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "basCatClassFuzzyQuery",
    sql =
        "select id,cat_id,code,created_at,creator_code,creator_name,creator_org_code,ent_id,full_name,is_enabled,is_leaf,last_modified_at,level_num,modifier_code,modifier_name,modifier_org_code,name,parent_cat_class_code,parent_cat_class_id,parent_cat_class_name,path,show_order,source_id,table_id,tree_path,remark,version from bas_cat_class where {{#id}}id=:id and {{/id}} {{#cat_id}}cat_id=:cat_id and {{/cat_id}} {{#code}}code like '%{{code}}%' and {{/code}} {{#created_at}}created_at=:created_at and {{/created_at}} {{#creator_code}}creator_code like '%{{creator_code}}%' and {{/creator_code}} {{#creator_name}}creator_name like '%{{creator_name}}%' and {{/creator_name}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#full_name}}full_name like '%{{full_name}}%' and {{/full_name}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#is_leaf}}is_leaf=:is_leaf and {{/is_leaf}} {{#last_modified_at}}last_modified_at=:last_modified_at and {{/last_modified_at}} {{#level_num}}level_num=:level_num and {{/level_num}} {{#modifier_code}}modifier_code like '%{{modifier_code}}%' and {{/modifier_code}} {{#modifier_name}}modifier_name like '%{{modifier_name}}%' and {{/modifier_name}} {{#name}}name like '%{{name}}%' and {{/name}} {{#parent_cat_class_code}}parent_cat_class_code like '%{{parent_cat_class_code}}%' and {{/parent_cat_class_code}} {{#parent_cat_class_id}}parent_cat_class_id=:parent_cat_class_id and {{/parent_cat_class_id}} {{#parent_cat_class_name}}parent_cat_class_name like '%{{parent_cat_class_name}}%' and {{/parent_cat_class_name}} {{#path}}path like '%{{path}}%' and {{/path}} {{#show_order}}show_order like '%{{show_order}}%' and {{/show_order}} {{#source_id}}source_id=:source_id and {{/source_id}} {{#table_id}}table_id=:table_id and {{/table_id}} {{#version}}version like '%{{version}}%' and {{/version}} {{#remark}}remark like '%{{remark}}%' and {{/remark}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  List<BasCatClassDTO> basCatClassFuzzyQuery(
      @Param("id") Long id,
      @Param("cat_id") Long catId,
      @Param("code") String code,
      @Param("created_at") java.util.Date createdAt,
      @Param("creator_code") String creatorCode,
      @Param("creator_name") String creatorName,
      @Param("ent_id") Long entId,
      @Param("full_name") String fullName,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_leaf") Integer isLeaf,
      @Param("last_modified_at") java.util.Date lastModifiedAt,
      @Param("level_num") Integer levelNum,
      @Param("modifier_code") String modifierCode,
      @Param("modifier_name") String modifierName,
      @Param("name") String name,
      @Param("parent_cat_class_code") String parentCatClassCode,
      @Param("parent_cat_class_id") Long parentCatClassId,
      @Param("parent_cat_class_name") String parentCatClassName,
      @Param("path") String path,
      @Param("show_order") Integer showOrder,
      @Param("source_id") Long sourceId,
      @Param("table_id") Long tableId,
      @Param("version") Integer version,
      @Param("remark") String remark,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList);

  /**
   * 根据目录id查找直接(顶级)目录分类列表
   *
   * @param catId
   * @param deleted
   * @param entId
   * @param idList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findTopBasCatClassByCatid",
    sql =
        "select id,cat_id,code,created_at,creator_code,creator_name,creator_org_code,ent_id,full_name,is_enabled,is_leaf,last_modified_at,level_num,modifier_code,modifier_name,modifier_org_code,name,parent_cat_class_code,parent_cat_class_id,parent_cat_class_name,path,show_order,source_id,table_id,tree_path,remark,version from bas_cat_class where {{#cat_id}}cat_id=:cat_id and {{/cat_id}} {{#deleted}}deleted=:deleted and{{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} id not in (select cid from bas_cat_class_tree where {{#cat_id}}cat_id=:cat_id and {{/cat_id}} {{#ent_id}}ent_id=:ent_id and{{/ent_id}} 1=1 ) {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  Page<BasCatClassDTO> findTopBasCatClassByCatid(
      @Param("cat_id") Long catId,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("id_list") List<Long> idList,
      @Param("pageable") Pageable pageable);

  /**
   * 根据目录id查找直接(顶级)目录分类列表
   *
   * @param catId
   * @param deleted
   * @param entId
   * @param idList
   * @return
   */
  @SqlTemplate(
    name = "findTopBasCatClassByCatid",
    sql =
        "select id,cat_id,code,created_at,creator_code,creator_name,creator_org_code,ent_id,full_name,is_enabled,is_leaf,last_modified_at,level_num,modifier_code,modifier_name,modifier_org_code,name,parent_cat_class_code,parent_cat_class_id,parent_cat_class_name,path,show_order,source_id,table_id,tree_path,remark,version from bas_cat_class where {{#cat_id}}cat_id=:cat_id and {{/cat_id}} {{#deleted}}deleted=:deleted and{{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} id not in (select cid from bas_cat_class_tree where {{#cat_id}}cat_id=:cat_id and {{/cat_id}} {{#ent_id}}ent_id=:ent_id and{{/ent_id}} 1=1 ) {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  List<BasCatClassDTO> findTopBasCatClassByCatid(
      @Param("cat_id") Long catId,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("id_list") List<Long> idList);

  /**
   * 调整目录分类的父分类
   *
   * @param parentCatClassName
   * @param parentCatClassCode
   * @param id
   * @param deleted
   * @param parentCatClassId
   * @return
   */
  @SqlTemplate(
    name = "setFatherClass",
    sql =
        "update bas_cat_class set {{#parent_cat_class_id }}parent_cat_class_id =:parent_cat_class_id{{/parent_cat_class_id}},{{#parent_cat_class_name}}parent_cat_class_name=:parent_cat_class_name{{/parent_cat_class_name}},{{#parent_cat_class_code}}parent_cat_class_code=:parent_cat_class_code{{/parent_cat_class_code}} where {{#id}}id=:id and {{/id}} {{#deleted}}deleted=:deleted and{{/deleted}} 1=1"
  )
  @Modifying
  Integer setFatherClass(
      @Param("parent_cat_class_name") String parentCatClassName,
      @Param("parent_cat_class_code") String parentCatClassCode,
      @Param("id") Long id,
      @Param("deleted") Long deleted,
      @Param("parent_cat_class_id") Long parentCatClassId);

  /**
   * 动态执行一个无参数的sql,返回分页的结果
   *
   * @param selectProvider 通过SqlWrapper.asSelect封装sql
   * @param pageable 分页，排序参数
   * @param returnType 返回对象的class类型
   * @param <T>
   * @return 分页的查询结果列表
   */
  @SqlTemplate(name = "dynamicSelectPage", dynamic = true)
  public <T> Page<T> dynamicSelectPage(
      @Param("selectProvider") SelectStatementProvider selectProvider,
      @Param("pageable") Pageable pageable,
      @Param("returnType") Class<T> returnType);

  /**
   * 动态执行一个无参数的sql,返回单个结果
   *
   * @param selectProvider 通过SqlWrapper.asSelect封装sql
   * @param returnType 返回对象的class类型
   * @param <T>
   * @return 单个查询结果
   */
  @SqlTemplate(name = "dynamicSelectOne", dynamic = true, multiple = false)
  public <T> T dynamicSelectOne(
      @Param("selectProvider") SelectStatementProvider selectProvider,
      @Param("returnType") Class<T> returnType);

  /**
   * 动态执行一个无参数的sql update 语句
   *
   * @param updateProvider
   * @return 修改的记录条数
   */
  @SqlTemplate(name = "dynamicUpdate", dynamic = true)
  @Modifying
  public int dynamicUpdate(@Param("updateProvider") UpdateStatementProvider updateProvider);

  // 树形结构操作
  /**
   * 获取节点的所有祖先节点，按距离由大到小的顺序返回
   *
   * @param id 节点id
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "getParents",
    sql =
        "SELECT u.* FROM `bas_cat_class` u, `bas_cat_class_tree` t WHERE u.id=t.pid AND t.cid=:id AND t.cat_id=:cat_id AND u.deleted=0 {{#ent_id}} AND t.ent_id=:ent_id{{/ent_id}} ORDER BY t.distance DESC"
  )
  List<BasCatClassDTO> getParents(
      @Param("id") Long id, @Param("cat_id") Long catId, @Param("ent_id") Long entId);

  /**
   * 查询上一层的父节点
   *
   * @param id 节点id
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "getParentNode",
    sql =
        "SELECT u.* FROM `bas_cat_class` u, `bas_cat_class_tree` t WHERE u.id=t.pid AND t.cid=:id AND t.distance=1 AND t.cat_id=:cat_id AND u.deleted=0 {{#ent_id}} AND t.ent_id=:ent_id{{/ent_id}}"
  )
  BasCatClassDTO getParentNode(
      @Param("id") Long id, @Param("cat_id") Long catId, @Param("ent_id") Long entId);

  /**
   * 查询直接子节点
   *
   * @param id 节点id
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "getChildren",
    sql =
        "SELECT u.* FROM `bas_cat_class` u, `bas_cat_class_tree` t WHERE u.id=t.cid AND t.pid=:id AND t.distance=1 AND t.cat_id=:cat_id AND u.deleted=0 {{#ent_id}} AND t.ent_id=:ent_id{{/ent_id}}"
  )
  List<BasCatClassDTO> getChildren(
      @Param("id") Long id, @Param("cat_id") Long catId, @Param("ent_id") Long entId);

  /**
   * 分页查询直接子节点
   *
   * @param id 节点id
   * @param catId
   * @param entId
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "getChildren",
    sql =
        "SELECT u.* FROM `bas_cat_class` u, `bas_cat_class_tree` t WHERE u.id=t.cid AND t.pid=:id AND t.distance=1 AND t.cat_id=:cat_id AND u.deleted=0 {{#ent_id}} AND t.ent_id=:ent_id{{/ent_id}}"
  )
  Page<BasCatClassDTO> getChildren(
      @Param("id") Long id,
      @Param("cat_id") Long catId,
      @Param("ent_id") Long entId,
      @Param("pageable") Pageable pageable);

  /**
   * 查询子树上的所有节点
   *
   * @param id 节点id
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "getTreeNodes",
    sql =
        "SELECT u.* FROM `bas_cat_class` u, `bas_cat_class_tree` t WHERE u.id=t.cid AND t.pid=:id AND t.distance > 0 AND t.cat_id=:cat_id AND u.deleted=0 {{#ent_id}} AND t.ent_id=:ent_id{{/ent_id}} ORDER BY t.distance ASC"
  )
  List<BasCatClassDTO> getTreeNodes(
      @Param("id") Long id, @Param("cat_id") Long catId, @Param("ent_id") Long entId);
}
