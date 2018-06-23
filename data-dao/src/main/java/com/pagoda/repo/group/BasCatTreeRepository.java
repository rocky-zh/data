package com.pagoda.repo.group;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.repo.group.custom.*;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

/**
 * BasCatTree 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasCatTreeRepository extends PagodaJpaRepository<BasCatTree, Long> {
  /**
   * 动态执行一个无参数的sql,返回分页的结果
   *
   * @param selectProvider 通过SqlWrapper.asSelect封装sql
   * @param pageable 分页，排序参数
   * @param returnType 返回对象的class类型
   * @param <T>
   * @return
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
   * @return
   */
  @SqlTemplate(name = "dynamicSelectOne", dynamic = true, multiple = false)
  public <T> T dynamicSelectOne(
      @Param("selectProvider") SelectStatementProvider selectProvider,
      @Param("returnType") Class<T> returnType);

  /**
   * 动态执行一个无参数的sql update 语句
   *
   * @param updateProvider
   * @return
   */
  @SqlTemplate(name = "dynamicUpdate", dynamic = true)
  @Modifying
  public int dynamicUpdate(@Param("updateProvider") UpdateStatementProvider updateProvider);

  // 树形结构操作
  /**
   * 删除一个叶子节点记录
   *
   * @param id
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "deleteLeafNode",
    sql =
        "DELETE FROM `bas_cat_tree` WHERE cid=:id AND cat_id=:catId {{#entId}} AND ent_id=:entId{{/entId}}"
  )
  @Modifying
  void deleteLeafNode(@Param("id") Long id, @Param("catId") Long catId, @Param("entId") Long entId);

  /**
   * 批量删除父子节点关系，用于移动整个子树的实现当中，pid in parents and cid in children
   *
   * @param parents
   * @param children
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "deleteParentChildren",
    sql =
        "DELETE FROM `bas_cat_tree` WHERE pid in ({{#parents}}{{^-first}}, {{/-first}}{{.}}{{/parents}}) AND cid in ({{#children}}{{^-first}}, {{/-first}}{{.}}{{/children}}) AND cat_id=:catId {{#entId}} AND ent_id=:entId{{/entId}}"
  )
  @Modifying
  void deleteParentChildren(
      @Param("parents") List<Long> parents,
      @Param("children") List<Long> children,
      @Param("catId") Long catId,
      @Param("entId") Long entId);

  /**
   * 删除节点对应的整个子树
   *
   * @param idList
   * @param catId
   * @param entId
   */
  @SqlTemplate(
    name = "deleteSubTree",
    sql =
        "DELETE FROM `bas_cat_tree` WHERE cid in ({{#idList}}{{^-first}}, {{/-first}}{{.}}{{/idList}}) AND cat_id=:catId {{#entId}} AND ent_id=:entId{{/entId}}"
  )
  @Modifying
  void deleteSubTree(
      @Param("idList") List<Long> idList, @Param("catId") Long catId, @Param("entId") Long entId);

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
        "SELECT * FROM `bas_cat_tree` WHERE cid=:id AND cat_id=:catId AND distance=1 {{#entId}} AND ent_id=:entId{{/entId}}"
  )
  BasCatTree getParentNode(
      @Param("id") Long id, @Param("catId") Long catId, @Param("entId") Long entId);

  /**
   * 获取节点的所有祖先节点，按距离由大到小的顺序返回
   *
   * @param id 节点id
   * @param distance =0时返回节点自身，>0不包含节点自身
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "getParents",
    sql =
        "SELECT * FROM `bas_cat_tree` t WHERE t.cid=:id AND t.cat_id=:catId AND t.distance>= :distance {{#entId}} AND t.ent_id=:entId{{/entId}} ORDER BY t.distance DESC"
  )
  List<BasCatTree> getParents(
      @Param("id") Long id,
      @Param("distance") Long distance,
      @Param("catId") Long catId,
      @Param("entId") Long entId);

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
        "SELECT * FROM `bas_cat_tree` t WHERE t.pid=:id AND t.distance=1 AND t.cat_id=:catId {{#entId}} AND t.ent_id=:entId{{/entId}}"
  )
  List<BasCatTree> getChildren(
      @Param("id") Long id, @Param("catId") Long catId, @Param("entId") Long entId);

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
        "SELECT * FROM `bas_cat_tree` t WHERE t.pid=:id AND t.distance=1 AND t.cat_id=:catId {{#entId}} AND t.ent_id=:entId{{/entId}}"
  )
  Page<BasCatTree> getChildren(
      @Param("id") Long id,
      @Param("catId") Long catId,
      @Param("entId") Long entId,
      @Param("pageable") Pageable pageable);

  /**
   * 查询多个节点的直接子节点
   *
   * @param idList 节点id集合
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "getChildren",
    sql =
        "SELECT * FROM `bas_cat_tree` t WHERE t.pid IN ({{#idList}}{{^-first}}, {{/-first}}{{.}}{{/idList}}) AND t.distance=1 AND t.cat_id=:catId {{#entId}} AND t.ent_id=:entId{{/entId}}"
  )
  List<BasCatTree> getChildren(
      @Param("idList") List<Long> idList, @Param("catId") Long catId, @Param("entId") Long entId);

  /**
   * 查询子树上的所有节点，不包括节点id本身
   *
   * @param id 节点id
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "getTreeNodes",
    sql =
        "SELECT * FROM `bas_cat_tree` t WHERE t.pid=:id AND t.distance > 0 AND t.cat_id=:catId {{#entId}} AND t.ent_id=:entId{{/entId}} ORDER BY t.distance ASC"
  )
  List<BasCatTree> getTreeNodes(
      @Param("id") Long id, @Param("catId") Long catId, @Param("entId") Long entId);

  /**
   * 查询idList中节点的父节点
   *
   * @param idList
   * @param catId
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "getParentChild",
    sql =
        "SELECT * FROM `bas_cat_tree` t WHERE t.cid in ({{#idList}}{{^-first}}, {{/-first}}{{.}}{{/idList}}) AND t.distance = 1 AND t.cat_id=:catId {{#entId}} AND t.ent_id=:entId{{/entId}}"
  )
  List<BasCatTree> getParentChild(
      @Param("idList") Collection<Long> idList,
      @Param("catId") Long catId,
      @Param("entId") Long entId);
}
