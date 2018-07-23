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
 * PurOrgVen 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BasePurOrgVenRepository
    extends PurOrgVenRepositoryCustom, PagodaJpaRepository<PurOrgVen, Long> {

  /**
   * 已授权机构供应商查询
   *
   * @param venOrgIdList
   * @param orgOrgIdList
   * @param balOrgOrgIdList
   * @param venClassIdList
   * @param isEnabled
   * @param entId
   * @param deleted
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectOrgVenAuthored",
    sql =
        "select id,ent_id,ven_org_id,ven_org_code,ven_org_name,ven_class_id,ven_class_code,ven_class_name,org_org_id,org_org_code,org_org_name,bal_org_org_id,bal_org_org_code,bal_org_org_name,is_allow_order,is_allow_rec,is_returnable,is_pause_pay,is_enabled,is_order_check,is_rec_check,is_return_check,is_inv_check,settlement_type,remark,version,deleted from pur_org_ven where {{#ven_org_id_list_exists}}ven_org_id in ({{#ven_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/ven_org_id_list}}) and {{/ven_org_id_list_exists}}  {{#org_org_id_list_exists}}org_org_id in ({{#org_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/org_org_id_list}}) and {{/org_org_id_list_exists}} {{#bal_org_org_id_list_exists}}bal_org_org_id in ({{#bal_org_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/bal_org_org_id_list}}) and {{/bal_org_org_id_list_exists}} {{#ven_class_id_list_exists}}ven_class_id in ({{#ven_class_id_list}}{{^-first}}, {{/-first}}{{this}}{{/ven_class_id_list}}) and {{/ven_class_id_list_exists}}  {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1"
  )
  Page<PurOrgVenDTO> selectOrgVenAuthored(
      @Param("ven_org_id_list") List<Long> venOrgIdList,
      @Param("org_org_id_list") List<Long> orgOrgIdList,
      @Param("bal_org_org_id_list") List<Long> balOrgOrgIdList,
      @Param("ven_class_id_list") List<Long> venClassIdList,
      @Param("is_enabled") Integer isEnabled,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("pageable") Pageable pageable);

  /**
   * 已授权机构供应商查询
   *
   * @param venOrgIdList
   * @param orgOrgIdList
   * @param balOrgOrgIdList
   * @param venClassIdList
   * @param isEnabled
   * @param entId
   * @param deleted
   * @return
   */
  @SqlTemplate(
    name = "selectOrgVenAuthored",
    sql =
        "select id,ent_id,ven_org_id,ven_org_code,ven_org_name,ven_class_id,ven_class_code,ven_class_name,org_org_id,org_org_code,org_org_name,bal_org_org_id,bal_org_org_code,bal_org_org_name,is_allow_order,is_allow_rec,is_returnable,is_pause_pay,is_enabled,is_order_check,is_rec_check,is_return_check,is_inv_check,settlement_type,remark,version,deleted from pur_org_ven where {{#ven_org_id_list_exists}}ven_org_id in ({{#ven_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/ven_org_id_list}}) and {{/ven_org_id_list_exists}}  {{#org_org_id_list_exists}}org_org_id in ({{#org_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/org_org_id_list}}) and {{/org_org_id_list_exists}} {{#bal_org_org_id_list_exists}}bal_org_org_id in ({{#bal_org_org_id_list}}{{^-first}}, {{/-first}}{{this}}{{/bal_org_org_id_list}}) and {{/bal_org_org_id_list_exists}} {{#ven_class_id_list_exists}}ven_class_id in ({{#ven_class_id_list}}{{^-first}}, {{/-first}}{{this}}{{/ven_class_id_list}}) and {{/ven_class_id_list_exists}}  {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1"
  )
  List<PurOrgVenDTO> selectOrgVenAuthored(
      @Param("ven_org_id_list") List<Long> venOrgIdList,
      @Param("org_org_id_list") List<Long> orgOrgIdList,
      @Param("bal_org_org_id_list") List<Long> balOrgOrgIdList,
      @Param("ven_class_id_list") List<Long> venClassIdList,
      @Param("is_enabled") Integer isEnabled,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted);

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
