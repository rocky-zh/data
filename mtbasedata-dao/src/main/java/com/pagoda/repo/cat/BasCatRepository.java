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
 * BasCat 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasCatRepository
    extends BasCatRepositoryCustom, PagodaJpaRepository<BasCat, Long> {

  /**
   * 根据目录id查询目录下是否存在目录分类
   *
   * @param catId
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "searchBasCatClassByCatId",
    sql =
        "select code from bas_cat_class where {{#cat_id}}cat_id=:cat_id and {{/cat_id}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  Page<BasCatDTO> searchBasCatClassByCatId(
      @Param("cat_id") Long catId,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList,
      @Param("pageable") Pageable pageable);

  /**
   * 根据目录id查询目录下是否存在目录分类
   *
   * @param catId
   * @param deleted
   * @param idList
   * @return
   */
  @SqlTemplate(
    name = "searchBasCatClassByCatId",
    sql =
        "select code from bas_cat_class where {{#cat_id}}cat_id=:cat_id and {{/cat_id}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  List<BasCatDTO> searchBasCatClassByCatId(
      @Param("cat_id") Long catId,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList);

  /**
   * 模糊查询目录代码列表
   *
   * @param code
   * @param tableId
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "searchBasCatCode",
    sql =
        "select code from bas_cat where {{#code}}code like '%{{code}}%' and {{/code}} {{#table_id}}table_id=:table_id and{{/table_id}} {{#deleted}}deleted=:deleted and{{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  Page<BasCatDTO> searchBasCatCode(
      @Param("code") String code,
      @Param("table_id") Long tableId,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList,
      @Param("pageable") Pageable pageable);

  /**
   * 模糊查询目录代码列表
   *
   * @param code
   * @param tableId
   * @param deleted
   * @param idList
   * @return
   */
  @SqlTemplate(
    name = "searchBasCatCode",
    sql =
        "select code from bas_cat where {{#code}}code like '%{{code}}%' and {{/code}} {{#table_id}}table_id=:table_id and{{/table_id}} {{#deleted}}deleted=:deleted and{{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  List<BasCatDTO> searchBasCatCode(
      @Param("code") String code,
      @Param("table_id") Long tableId,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList);

  /**
   * 模糊查询目录名称
   *
   * @param name
   * @param tableId
   * @param deleted
   * @param idList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "searchBasCatName",
    sql =
        "select name from bas_cat where {{#name}}name like '%{{name}}%' and {{/name}} {{#table_id}}table_id=:table_id and{{/table_id}} {{#deleted}}deleted=:deleted and{{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  Page<BasCatDTO> searchBasCatName(
      @Param("name") String name,
      @Param("table_id") Long tableId,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList,
      @Param("pageable") Pageable pageable);

  /**
   * 模糊查询目录名称
   *
   * @param name
   * @param tableId
   * @param deleted
   * @param idList
   * @return
   */
  @SqlTemplate(
    name = "searchBasCatName",
    sql =
        "select name from bas_cat where {{#name}}name like '%{{name}}%' and {{/name}} {{#table_id}}table_id=:table_id and{{/table_id}} {{#deleted}}deleted=:deleted and{{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  List<BasCatDTO> searchBasCatName(
      @Param("name") String name,
      @Param("table_id") Long tableId,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList);

  /**
   * 设置默认目录
   *
   * @param tableId
   * @param deleted
   * @param id
   * @return
   */
  @SqlTemplate(
    name = "setDefaultCat",
    sql =
        "update bas_cat set is_default = 1,is_enabled = 1 where {{#table_id}}table_id=:table_id and{{/table_id}} id=:id {{#deleted}}and deleted=:deleted{{/deleted}}"
  )
  @Modifying
  Integer setDefaultCat(
      @Param("table_id") Long tableId, @Param("deleted") Long deleted, @Param("id") Long id);

  /**
   * 设置默认目录之前将所有目录设置为非默认目录以保障只有一个默认目录
   *
   * @param tableId
   * @param isDefault
   * @param deleted
   * @return
   */
  @SqlTemplate(
    name = "restDefaultBasCat",
    sql =
        "update bas_cat set is_default=:is_default where {{#table_id}}table_id=:table_id and{{/table_id}} {{#is_default}}is_default=:is_default and{{/is_default}} {{#deleted}}deleted=:deleted and{{/deleted}} 1=1"
  )
  @Modifying
  Integer restDefaultBasCat(
      @Param("table_id") Long tableId,
      @Param("is_default") Integer isDefault,
      @Param("deleted") Long deleted);

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
   */
  @SqlTemplate(
    name = "basCatFuzzyQuery",
    sql =
        "select id,code,created_at,creator_code,creator_name,creator_org_code,ent_id,is_default,is_enabled,is_multi,last_modified_at,modifier_code,modifier_name,modifier_org_code,name,show_order,remark,table_id,version from bas_cat where {{#id}}id=:id and {{/id}} {{#code}}code like '%{{code}}%' and {{/code}} {{#created_at}}created_at=:created_at and {{/created_at}} {{#creator_code}}creator_code like '%{{creator_code}}%' and {{/creator_code}} {{#creator_name}}creator_name=:creator_name and {{/creator_name}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#is_default}}is_default=:is_default and {{/is_default}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}}{{#last_modified_at}}last_modified_at =:last_modified_at and {{/last_modified_at}} {{#modifier_code}}modifier_code like '%{{modifier_code}}%' and {{/modifier_code}} {{#modifier_name}}modifier_name like '%{{modifier_name}}%' and {{/modifier_name}} {{#name}}name like '%{{name}}%' and {{/name}} {{#show_order}}show_order like '%{{show_order}}%' and {{/show_order}} {{#table_id}}table_id=:table_id and {{/table_id}} {{#version}}version like '%{{version}}%' and {{/version}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  Page<BasCatDTO> basCatFuzzyQuery(
      @Param("id") Long id,
      @Param("code") String code,
      @Param("created_at") java.util.Date createdAt,
      @Param("creator_code") String creatorCode,
      @Param("creator_name") String creatorName,
      @Param("ent_id") Long entId,
      @Param("is_default") Integer isDefault,
      @Param("is_enabled") Integer isEnabled,
      @Param("last_modified_at") java.util.Date lastModifiedAt,
      @Param("modifier_code") String modifierCode,
      @Param("modifier_name") String modifierName,
      @Param("name") String name,
      @Param("show_order") Integer showOrder,
      @Param("table_id") Long tableId,
      @Param("version") Integer version,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "basCatFuzzyQuery",
    sql =
        "select id,code,created_at,creator_code,creator_name,creator_org_code,ent_id,is_default,is_enabled,is_multi,last_modified_at,modifier_code,modifier_name,modifier_org_code,name,show_order,remark,table_id,version from bas_cat where {{#id}}id=:id and {{/id}} {{#code}}code like '%{{code}}%' and {{/code}} {{#created_at}}created_at=:created_at and {{/created_at}} {{#creator_code}}creator_code like '%{{creator_code}}%' and {{/creator_code}} {{#creator_name}}creator_name=:creator_name and {{/creator_name}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#is_default}}is_default=:is_default and {{/is_default}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}}{{#last_modified_at}}last_modified_at =:last_modified_at and {{/last_modified_at}} {{#modifier_code}}modifier_code like '%{{modifier_code}}%' and {{/modifier_code}} {{#modifier_name}}modifier_name like '%{{modifier_name}}%' and {{/modifier_name}} {{#name}}name like '%{{name}}%' and {{/name}} {{#show_order}}show_order like '%{{show_order}}%' and {{/show_order}} {{#table_id}}table_id=:table_id and {{/table_id}} {{#version}}version like '%{{version}}%' and {{/version}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1 {{#id_list}}and id in ({{#id_list}}{{^-first}}, {{/-first}}{{this}}{{/id_list}}) {{/id_list}}"
  )
  List<BasCatDTO> basCatFuzzyQuery(
      @Param("id") Long id,
      @Param("code") String code,
      @Param("created_at") java.util.Date createdAt,
      @Param("creator_code") String creatorCode,
      @Param("creator_name") String creatorName,
      @Param("ent_id") Long entId,
      @Param("is_default") Integer isDefault,
      @Param("is_enabled") Integer isEnabled,
      @Param("last_modified_at") java.util.Date lastModifiedAt,
      @Param("modifier_code") String modifierCode,
      @Param("modifier_name") String modifierName,
      @Param("name") String name,
      @Param("show_order") Integer showOrder,
      @Param("table_id") Long tableId,
      @Param("version") Integer version,
      @Param("deleted") Long deleted,
      @Param("id_list") List<Long> idList);

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
}
