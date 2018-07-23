package com.pagoda.repo.pridistribution.custom;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.domain.pridistribution.*;
import com.pagoda.repo.pridistribution.custom.*;

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
 * SalOrgCus 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BaseSalOrgCusRepository
    extends SalOrgCusRepositoryCustom, PagodaJpaRepository<SalOrgCus, Long> {

  /**
   * 查询已设置价格目录的机构客户
   *
   * @param orgOrgCode
   * @param cusOrgCodeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findIsSetSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name FROM sal_org_cus where price_cat_id > 0 and deleted = 0{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#cus_org_code_list_exists}} and cus_org_code in ({{#cus_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/cus_org_code_list}}){{/cus_org_code_list_exists}}"
  )
  Page<SalOrgCusDTO> findIsSetSalOrgCusList(
      @Param("org_org_code") String orgOrgCode,
      @Param("cus_org_code_list") List<String> cusOrgCodeList,
      @Param("pageable") Pageable pageable);

  /**
   * 查询已设置价格目录的机构客户
   *
   * @param orgOrgCode
   * @param cusOrgCodeList
   * @return
   */
  @SqlTemplate(
    name = "findIsSetSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name FROM sal_org_cus where price_cat_id > 0 and deleted = 0{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#cus_org_code_list_exists}} and cus_org_code in ({{#cus_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/cus_org_code_list}}){{/cus_org_code_list_exists}}"
  )
  List<SalOrgCusDTO> findIsSetSalOrgCusList(
      @Param("org_org_code") String orgOrgCode,
      @Param("cus_org_code_list") List<String> cusOrgCodeList);

  /**
   * 查询所有发货机构客户
   *
   * @param orgOrgCode
   * @param cusOrgCodeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findAllSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name,price_cat_id FROM sal_org_cus WHERE and deleted = 0 {{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#cus_org_code_list_exists}} and cus_org_code in ({{#cus_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/cus_org_code_list}}){{/cus_org_code_list_exists}}"
  )
  Page<SalOrgCusDTO> findAllSalOrgCusList(
      @Param("org_org_code") String orgOrgCode,
      @Param("cus_org_code_list") List<String> cusOrgCodeList,
      @Param("pageable") Pageable pageable);

  /**
   * 查询所有发货机构客户
   *
   * @param orgOrgCode
   * @param cusOrgCodeList
   * @return
   */
  @SqlTemplate(
    name = "findAllSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name,price_cat_id FROM sal_org_cus WHERE and deleted = 0 {{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#cus_org_code_list_exists}} and cus_org_code in ({{#cus_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/cus_org_code_list}}){{/cus_org_code_list_exists}}"
  )
  List<SalOrgCusDTO> findAllSalOrgCusList(
      @Param("org_org_code") String orgOrgCode,
      @Param("cus_org_code_list") List<String> cusOrgCodeList);

  /**
   * 查询没有设置价格目录的机构客户
   *
   * @param orgOrgCode
   * @param cusOrgCodeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findNoSetSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name FROM sal_org_cus WHERE price_cat_id = 0 and deleted = 0{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#cus_org_code_list_exists}} and cus_org_code in ({{#cus_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/cus_org_code_list}}){{/cus_org_code_list_exists}}"
  )
  Page<SalOrgCusDTO> findNoSetSalOrgCusList(
      @Param("org_org_code") String orgOrgCode,
      @Param("cus_org_code_list") List<String> cusOrgCodeList,
      @Param("pageable") Pageable pageable);

  /**
   * 查询没有设置价格目录的机构客户
   *
   * @param orgOrgCode
   * @param cusOrgCodeList
   * @return
   */
  @SqlTemplate(
    name = "findNoSetSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name FROM sal_org_cus WHERE price_cat_id = 0 and deleted = 0{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#cus_org_code_list_exists}} and cus_org_code in ({{#cus_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/cus_org_code_list}}){{/cus_org_code_list_exists}}"
  )
  List<SalOrgCusDTO> findNoSetSalOrgCusList(
      @Param("org_org_code") String orgOrgCode,
      @Param("cus_org_code_list") List<String> cusOrgCodeList);

  /**
   * 客户机构关系列表查询
   *
   * @param cusList
   * @param orgList
   * @param balOrgList
   * @param balCusList
   * @param priceList
   * @param dualOrgName
   * @param isEnabled
   * @param deleted
   * @param entId
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectCusOrgRelDetail",
    sql =
        "select id,cus_org_id,cus_org_code,cus_org_name,bal_cus_org_id,bal_cus_org_name,org_org_id,org_org_code,org_org_name,bal_org_id,bal_org_name,dual_org_name,price_cat_id,price_cat_code,price_cat_name,is_pick_auto_rec,is_pick_limit_con,bill_type,is_sto_back_price,is_create_bill,is_default_con,is_default_allot,is_enabled,version,deleted from sal_org_cus where {{#cusList_exists}}cus_org_id in ({{#cusList}}{{^-first}}, {{/-first}}{{this}}{{/cusList}}) and {{/cusList_exists}} {{#orgList_exists}} org_org_id in ({{#orgList}}{{^-first}}, {{/-first}}{{this}}{{/orgList}}) and {{/orgList_exists}} {{#balOrgList_exists}} bal_org_id in ({{#balOrgList}}{{^-first}}, {{/-first}}{{this}}{{/balOrgList}}) and {{/balOrgList_exists}} {{#balCusList_exists}} bal_cus_org_id in ({{#balCusList}}{{^-first}}, {{/-first}}{{this}}{{/balCusList}}) and {{/balCusList_exists}} {{#priceList_exists}} price_cat_id in ({{#priceList}}{{^-first}}, {{/-first}}{{this}}{{/priceList}}) and {{/priceList_exists}} {{#dual_org_name}} dual_org_name=:dual_org_name and {{/dual_org_name}} {{#is_enabled}} is_enabled=:is_enabled and {{/is_enabled}} {{#deleted}} deleted=:deleted and {{/deleted}} {{#ent_id}} ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  Page<SalOrgCusDTO> selectCusOrgRelDetail(
      @Param("cusList") List<Long> cusList,
      @Param("orgList") List<Long> orgList,
      @Param("balOrgList") List<Long> balOrgList,
      @Param("balCusList") List<Long> balCusList,
      @Param("priceList") List<Long> priceList,
      @Param("dual_org_name") String dualOrgName,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("pageable") Pageable pageable);

  /**
   * 客户机构关系列表查询
   *
   * @param cusList
   * @param orgList
   * @param balOrgList
   * @param balCusList
   * @param priceList
   * @param dualOrgName
   * @param isEnabled
   * @param deleted
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "selectCusOrgRelDetail",
    sql =
        "select id,cus_org_id,cus_org_code,cus_org_name,bal_cus_org_id,bal_cus_org_name,org_org_id,org_org_code,org_org_name,bal_org_id,bal_org_name,dual_org_name,price_cat_id,price_cat_code,price_cat_name,is_pick_auto_rec,is_pick_limit_con,bill_type,is_sto_back_price,is_create_bill,is_default_con,is_default_allot,is_enabled,version,deleted from sal_org_cus where {{#cusList_exists}}cus_org_id in ({{#cusList}}{{^-first}}, {{/-first}}{{this}}{{/cusList}}) and {{/cusList_exists}} {{#orgList_exists}} org_org_id in ({{#orgList}}{{^-first}}, {{/-first}}{{this}}{{/orgList}}) and {{/orgList_exists}} {{#balOrgList_exists}} bal_org_id in ({{#balOrgList}}{{^-first}}, {{/-first}}{{this}}{{/balOrgList}}) and {{/balOrgList_exists}} {{#balCusList_exists}} bal_cus_org_id in ({{#balCusList}}{{^-first}}, {{/-first}}{{this}}{{/balCusList}}) and {{/balCusList_exists}} {{#priceList_exists}} price_cat_id in ({{#priceList}}{{^-first}}, {{/-first}}{{this}}{{/priceList}}) and {{/priceList_exists}} {{#dual_org_name}} dual_org_name=:dual_org_name and {{/dual_org_name}} {{#is_enabled}} is_enabled=:is_enabled and {{/is_enabled}} {{#deleted}} deleted=:deleted and {{/deleted}} {{#ent_id}} ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  List<SalOrgCusDTO> selectCusOrgRelDetail(
      @Param("cusList") List<Long> cusList,
      @Param("orgList") List<Long> orgList,
      @Param("balOrgList") List<Long> balOrgList,
      @Param("balCusList") List<Long> balCusList,
      @Param("priceList") List<Long> priceList,
      @Param("dual_org_name") String dualOrgName,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId);

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
