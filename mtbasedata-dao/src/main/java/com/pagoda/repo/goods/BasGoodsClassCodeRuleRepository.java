package com.pagoda.repo.goods;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
import com.pagoda.repo.goods.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * BasGoodsClassCodeRule 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasGoodsClassCodeRuleRepository
    extends BasGoodsClassCodeRuleRepositoryCustom,
        PagodaJpaRepository<BasGoodsClassCodeRule, Long> {

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
   */
  @SqlTemplate(
    name = "goodsClassCodeRuleFuzzyQuery",
    sql =
        "select id,name,goods_class_id,goods_class_code,goods_class_name,code_rule_id,is_enabled,is_default,remark,deleted,version,created_at,creator_code,creator_name,creator_org_code,last_modified_at,modifier_code,modifier_name,modifier_org_code from bas_goods_class_code_rule where {{#name}}name like '%{{name}}%' and {{/name}} {{#goods_class_id}}goods_class_id=:goods_class_id and {{/goods_class_id}} {{#goods_class_name}}goods_class_name like '%{{goods_class_name}}%' and {{/goods_class_name}} {{#remark}}remark like '%{{remark}}%' and {{/remark}} {{#creator_code}}creator_code like '%{{creator_code}}%' and {{/creator_code}} {{#creator_name}}creator_name like '%{{creator_name}}%' and {{/creator_name}} {{#creator_org_code}}creator_org_code like '%{{creator_org_code}}%' and {{/creator_org_code}} {{#modifier_code}}modifier_code like '%{{modifier_code}}%' and {{/modifier_code}} {{#modifier_name}}modifier_name like '%{{modifier_name}}%' and {{/modifier_name}} {{#modifier_org_code}}modifier_org_code like '%{{modifier_org_code}}%' and {{/modifier_org_code}} {{#deleted}} deleted=:deleted and {{/deleted}} 1=1"
  )
  Page<BasGoodsClassCodeRuleDTO> goodsClassCodeRuleFuzzyQuery(
      @Param("name") String name,
      @Param("goods_class_id") Long goodsClassId,
      @Param("goods_class_name") String goodsClassName,
      @Param("remark") String remark,
      @Param("creator_code") String creatorCode,
      @Param("creator_name") String creatorName,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("modifier_code") String modifierCode,
      @Param("modifier_name") String modifierName,
      @Param("modifier_org_code") String modifierOrgCode,
      @Param("deleted") Long deleted,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "goodsClassCodeRuleFuzzyQuery",
    sql =
        "select id,name,goods_class_id,goods_class_code,goods_class_name,code_rule_id,is_enabled,is_default,remark,deleted,version,created_at,creator_code,creator_name,creator_org_code,last_modified_at,modifier_code,modifier_name,modifier_org_code from bas_goods_class_code_rule where {{#name}}name like '%{{name}}%' and {{/name}} {{#goods_class_id}}goods_class_id=:goods_class_id and {{/goods_class_id}} {{#goods_class_name}}goods_class_name like '%{{goods_class_name}}%' and {{/goods_class_name}} {{#remark}}remark like '%{{remark}}%' and {{/remark}} {{#creator_code}}creator_code like '%{{creator_code}}%' and {{/creator_code}} {{#creator_name}}creator_name like '%{{creator_name}}%' and {{/creator_name}} {{#creator_org_code}}creator_org_code like '%{{creator_org_code}}%' and {{/creator_org_code}} {{#modifier_code}}modifier_code like '%{{modifier_code}}%' and {{/modifier_code}} {{#modifier_name}}modifier_name like '%{{modifier_name}}%' and {{/modifier_name}} {{#modifier_org_code}}modifier_org_code like '%{{modifier_org_code}}%' and {{/modifier_org_code}} {{#deleted}} deleted=:deleted and {{/deleted}} 1=1"
  )
  List<BasGoodsClassCodeRuleDTO> goodsClassCodeRuleFuzzyQuery(
      @Param("name") String name,
      @Param("goods_class_id") Long goodsClassId,
      @Param("goods_class_name") String goodsClassName,
      @Param("remark") String remark,
      @Param("creator_code") String creatorCode,
      @Param("creator_name") String creatorName,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("modifier_code") String modifierCode,
      @Param("modifier_name") String modifierName,
      @Param("modifier_org_code") String modifierOrgCode,
      @Param("deleted") Long deleted);

  /**
   * 重置默认属性，以保证只有一个默认
   *
   * @param isDefault
   * @param name
   * @return
   */
  @SqlTemplate(
    name = "resetDefaultValue",
    sql =
        "update bas_goods_class_code_rule set {{#is_default}}is_default=:is_default{{/is_default}} where {{#name}}name=:name AND{{/name}} 1=1"
  )
  @Modifying
  Integer resetDefaultValue(@Param("is_default") Integer isDefault, @Param("name") String name);

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
