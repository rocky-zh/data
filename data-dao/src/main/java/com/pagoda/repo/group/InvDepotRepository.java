package com.pagoda.repo.group;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.repo.group.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * InvDepot 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface InvDepotRepository
    extends InvDepotRepositoryCustom, PagodaJpaRepository<InvDepot, Long> {

  /**
   * 根据目录或者目录分类查找库房
   *
   * @param catId
   * @param path
   * @param tableId
   * @param version
   * @param id
   * @param adCode
   * @param adLat
   * @param adLng
   * @param depotCenterId
   * @param entId
   * @param turnDateTime
   * @param orgId
   * @param isEnabled
   * @param name
   * @param code
   * @param currentPeriod
   * @param deleted
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findInvDepotByCatClass",
    sql =
        "select distinct a.id,ad_code,ad_lat,ad_lng,address,bal_org_id,code,current_period,depot_center_id,a.ent_id,is_allow_inv_out,is_allow_post_return,is_check_by_add,is_check_by_negative,is_check_by_post,is_check_input_need_check,is_check_qty_zero,is_check_show_fin_qty,is_dual_depot,is_enabled,is_pick_allocation,is_post_check_all,is_post_daily,is_post_daily_detail,is_pur_rec_in,is_pur_ret_out,is_sal_con_in,is_sal_con_out,is_sal_ret_in,is_sal_ret_out,is_sto_enabled,is_turn_exist_no_post,manage_type,measure_type,name,org_id,phone,sto_current_period,turn_date_time,turn_user_code,turn_user_name,a.last_modified_at,a.modifier_name,a.modifier_code,a.modifier_org_code,a.created_at,a.creator_code,a.creator_name,a.creator_org_code,a.version from inv_depot a {{#cat_id}} inner join bas_cat_class_rel cat on a.id=cat.obj_id and a.deleted=cat.deleted and a.ent_id=cat.ent_id {{#path}} and cat.path like '{{path}}%' {{/path}} and cat.cat_id=:cat_id {{#table_id}} and cat.table_id=:table_id {{/table_id}} {{/cat_id}} where {{#version}}a.version=:version and{{/version}}  {{#id}}a.id=:id and{{/id}} {{#ad_code}}ad_code=:ad_code and {{/ad_code}} {{#ad_lat}}ad_lat=:ad_lat and {{/ad_lat}} {{#ad_lng}}ad_lng=:ad_lng and {{/ad_lng}} {{#depot_center_id}}depot_center_id=:depot_center_id and {{/depot_center_id}} {{#ent_id}}a.ent_id=:ent_id and {{/ent_id}} {{#turn_date_time}}turn_date_time=:turn_date_time and {{/turn_date_time}} {{#org_id}}'org_id'=:org_id and {{/org_id}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}}  {{#name}}name like '%{{name}}%' and{{/name}} {{#code}}code like '%{{code}}%' and{{/code}} {{#current_period}}current_period like '%{{current_period}}%' and{{/current_period}} {{#deleted}}a.deleted=:deleted and{{/deleted}} {{#code_list}} code in ({{#code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/code_list}}) {{/code_list}}"
  )
  Page<FindInvDepotByCatClassDTO> findInvDepotByCatClass(
      @Param("cat_id") Long catId,
      @Param("path") String path,
      @Param("table_id") Integer tableId,
      @Param("version") Integer version,
      @Param("id") Long id,
      @Param("ad_code") String adCode,
      @Param("ad_lat") String adLat,
      @Param("ad_lng") String adLng,
      @Param("depot_center_id") Integer depotCenterId,
      @Param("ent_id") Long entId,
      @Param("turn_date_time") java.sql.Timestamp turnDateTime,
      @Param("org_id") Long orgId,
      @Param("is_enabled") Integer isEnabled,
      @Param("name") String name,
      @Param("code") String code,
      @Param("current_period") String currentPeriod,
      @Param("deleted") Long deleted,
      @Param("code_list") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 根据目录或者目录分类查找库房
   *
   * @param catId
   * @param path
   * @param tableId
   * @param version
   * @param id
   * @param adCode
   * @param adLat
   * @param adLng
   * @param depotCenterId
   * @param entId
   * @param turnDateTime
   * @param orgId
   * @param isEnabled
   * @param name
   * @param code
   * @param currentPeriod
   * @param deleted
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findInvDepotByCatClass",
    sql =
        "select distinct a.id,ad_code,ad_lat,ad_lng,address,bal_org_id,code,current_period,depot_center_id,a.ent_id,is_allow_inv_out,is_allow_post_return,is_check_by_add,is_check_by_negative,is_check_by_post,is_check_input_need_check,is_check_qty_zero,is_check_show_fin_qty,is_dual_depot,is_enabled,is_pick_allocation,is_post_check_all,is_post_daily,is_post_daily_detail,is_pur_rec_in,is_pur_ret_out,is_sal_con_in,is_sal_con_out,is_sal_ret_in,is_sal_ret_out,is_sto_enabled,is_turn_exist_no_post,manage_type,measure_type,name,org_id,phone,sto_current_period,turn_date_time,turn_user_code,turn_user_name,a.last_modified_at,a.modifier_name,a.modifier_code,a.modifier_org_code,a.created_at,a.creator_code,a.creator_name,a.creator_org_code,a.version from inv_depot a {{#cat_id}} inner join bas_cat_class_rel cat on a.id=cat.obj_id and a.deleted=cat.deleted and a.ent_id=cat.ent_id {{#path}} and cat.path like '{{path}}%' {{/path}} and cat.cat_id=:cat_id {{#table_id}} and cat.table_id=:table_id {{/table_id}} {{/cat_id}} where {{#version}}a.version=:version and{{/version}}  {{#id}}a.id=:id and{{/id}} {{#ad_code}}ad_code=:ad_code and {{/ad_code}} {{#ad_lat}}ad_lat=:ad_lat and {{/ad_lat}} {{#ad_lng}}ad_lng=:ad_lng and {{/ad_lng}} {{#depot_center_id}}depot_center_id=:depot_center_id and {{/depot_center_id}} {{#ent_id}}a.ent_id=:ent_id and {{/ent_id}} {{#turn_date_time}}turn_date_time=:turn_date_time and {{/turn_date_time}} {{#org_id}}'org_id'=:org_id and {{/org_id}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}}  {{#name}}name like '%{{name}}%' and{{/name}} {{#code}}code like '%{{code}}%' and{{/code}} {{#current_period}}current_period like '%{{current_period}}%' and{{/current_period}} {{#deleted}}a.deleted=:deleted and{{/deleted}} {{#code_list}} code in ({{#code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/code_list}}) {{/code_list}}"
  )
  List<FindInvDepotByCatClassDTO> findInvDepotByCatClass(
      @Param("cat_id") Long catId,
      @Param("path") String path,
      @Param("table_id") Integer tableId,
      @Param("version") Integer version,
      @Param("id") Long id,
      @Param("ad_code") String adCode,
      @Param("ad_lat") String adLat,
      @Param("ad_lng") String adLng,
      @Param("depot_center_id") Integer depotCenterId,
      @Param("ent_id") Long entId,
      @Param("turn_date_time") java.sql.Timestamp turnDateTime,
      @Param("org_id") Long orgId,
      @Param("is_enabled") Integer isEnabled,
      @Param("name") String name,
      @Param("code") String code,
      @Param("current_period") String currentPeriod,
      @Param("deleted") Long deleted,
      @Param("code_list") String codeList);

  /**
   * 下拉模糊查询库房信息
   *
   * @param deleted
   * @param isEnabled
   * @param entId
   * @param name
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectInvByCodeOrName",
    sql =
        "select id, code, name from inv_depot where {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} (code like '{{name}}%' or name like '{{name}}%')"
  )
  Page<InvDepotDTO> selectInvByCodeOrName(
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled,
      @Param("ent_id") Long entId,
      @Param("name") String name,
      @Param("pageable") Pageable pageable);

  /**
   * 下拉模糊查询库房信息
   *
   * @param deleted
   * @param isEnabled
   * @param entId
   * @param name
   * @return
   */
  @SqlTemplate(
    name = "selectInvByCodeOrName",
    sql =
        "select id, code, name from inv_depot where {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} (code like '{{name}}%' or name like '{{name}}%')"
  )
  List<InvDepotDTO> selectInvByCodeOrName(
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled,
      @Param("ent_id") Long entId,
      @Param("name") String name);

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
