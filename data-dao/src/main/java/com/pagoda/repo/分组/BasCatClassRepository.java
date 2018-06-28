package com.pagoda.repo.分组;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.分组.*;
import com.pagoda.domain.分组.*;
import com.pagoda.repo.分组.custom.*;

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
