package com.pagoda.repo.purorgven.custom;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.purorgven.*;
import com.pagoda.domain.purorgven.*;
import com.pagoda.repo.purorgven.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * PurOrgVenGoods 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BasePurOrgVenGoodsRepository
    extends PurOrgVenGoodsRepositoryCustom, PagodaJpaRepository<PurOrgVenGoods, Long> {

  /**
   * 已授权供应商机构商品查询
   *
   * @param venOrgIdList
   * @param orgOrgIdList
   * @param goodsClassIdList
   * @param goodsIdList
   * @param billTaxRate
   * @param taxType
   * @param isDefault
   * @param isEnabled
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectOrgVenGoodsAuthored",
    sql =
        "select id,ven_org_id,ven_org_code,ven_org_name,org_org_id,org_org_code,org_org_name,goods_id,goods_code,goods_name,goods_spec,goods_class_name,bas_unit_name,unit_id,unit_code,unit_name,unit_rate,price,bill_tax_rate,discount_tax_rate,tax_type,is_default,is_enabled,is_allow_return,pur_depot_id,version,is_allow_order,is_allow_rec,deleted from pur_org_ven_goods where {{#ven_org_id_list_exists}}ven_org_id in ({{#ven_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/ven_org_id_list}}) and {{/ven_org_id_list_exists}} {{#org_org_id_list_exists}}org_org_id in ({{#org_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/org_org_id_list}}) and {{/org_org_id_list_exists}} {{#goods_class_id_list_exists}}goods_class_id in ({{#goods_class_id_list}}{{^-first}}, {{/-first}}{{this}}{{/goods_class_id_list}}) and {{/goods_class_id_list_exists}} {{#goods_id_list_exists}}goods_id in ({{#goods_id_list}}{{^-first}}, {{/-first}}{{this}}{{/goods_id_list}}) and {{/goods_id_list_exists}} {{#bill_tax_rate}}bill_tax_rate=:bill_tax_rate and {{/bill_tax_rate}} {{#tax_type}}tax_type=:tax_type and {{/tax_type}} {{#is_default}}is_default=:is_default and {{/is_default}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} 1=1"
  )
  Page<PurOrgVenGoodsDTO> selectOrgVenGoodsAuthored(
      @Param("ven_org_id_list") List<Long> venOrgIdList,
      @Param("org_org_id_list") List<Long> orgOrgIdList,
      @Param("goods_class_id_list") List<Long> goodsClassIdList,
      @Param("goods_id_list") List<Long> goodsIdList,
      @Param("bill_tax_rate") java.math.BigDecimal billTaxRate,
      @Param("tax_type") Integer taxType,
      @Param("is_default") Integer isDefault,
      @Param("is_enabled") Integer isEnabled,
      @Param("pageable") Pageable pageable);

  /**
   * 已授权供应商机构商品查询
   *
   * @param venOrgIdList
   * @param orgOrgIdList
   * @param goodsClassIdList
   * @param goodsIdList
   * @param billTaxRate
   * @param taxType
   * @param isDefault
   * @param isEnabled
   * @return
   */
  @SqlTemplate(
    name = "selectOrgVenGoodsAuthored",
    sql =
        "select id,ven_org_id,ven_org_code,ven_org_name,org_org_id,org_org_code,org_org_name,goods_id,goods_code,goods_name,goods_spec,goods_class_name,bas_unit_name,unit_id,unit_code,unit_name,unit_rate,price,bill_tax_rate,discount_tax_rate,tax_type,is_default,is_enabled,is_allow_return,pur_depot_id,version,is_allow_order,is_allow_rec,deleted from pur_org_ven_goods where {{#ven_org_id_list_exists}}ven_org_id in ({{#ven_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/ven_org_id_list}}) and {{/ven_org_id_list_exists}} {{#org_org_id_list_exists}}org_org_id in ({{#org_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/org_org_id_list}}) and {{/org_org_id_list_exists}} {{#goods_class_id_list_exists}}goods_class_id in ({{#goods_class_id_list}}{{^-first}}, {{/-first}}{{this}}{{/goods_class_id_list}}) and {{/goods_class_id_list_exists}} {{#goods_id_list_exists}}goods_id in ({{#goods_id_list}}{{^-first}}, {{/-first}}{{this}}{{/goods_id_list}}) and {{/goods_id_list_exists}} {{#bill_tax_rate}}bill_tax_rate=:bill_tax_rate and {{/bill_tax_rate}} {{#tax_type}}tax_type=:tax_type and {{/tax_type}} {{#is_default}}is_default=:is_default and {{/is_default}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} 1=1"
  )
  List<PurOrgVenGoodsDTO> selectOrgVenGoodsAuthored(
      @Param("ven_org_id_list") List<Long> venOrgIdList,
      @Param("org_org_id_list") List<Long> orgOrgIdList,
      @Param("goods_class_id_list") List<Long> goodsClassIdList,
      @Param("goods_id_list") List<Long> goodsIdList,
      @Param("bill_tax_rate") java.math.BigDecimal billTaxRate,
      @Param("tax_type") Integer taxType,
      @Param("is_default") Integer isDefault,
      @Param("is_enabled") Integer isEnabled);

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
