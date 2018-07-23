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
 * BasVenRebateHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BaseBasVenRebateHeadRepository
    extends BasVenRebateHeadRepositoryCustom, PagodaJpaRepository<BasVenRebateHead, Long> {

  /**
   * 查询供应商返利列表查询
   *
   * @param no
   * @param venOrgId
   * @param rebateMode
   * @param beginDate
   * @param endDate
   * @param effectDate
   * @param expiryDate
   * @param status
   * @param balOrgId
   * @param entId
   * @param deleted
   * @param isEnabled
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectVenRebateHeadList",
    sql =
        "select id,no,ent_id,bal_org_id,bal_org_code,bal_org_name,ven_org_id,ven_org_code,ven_org_name,status,rebate_mode,rebate_rate,effect_date,expiry_date,is_all_effect,begin_date,end_date,remark,version,deleted from bas_ven_rebate_head where {{#no}}no like '{{no}}%' and {{/no}} {{#ven_org_id}}ven_org_id=:ven_org_id and {{/ven_org_id}} {{#rebate_mode}}rebate_mode=:rebate_mode and {{/rebate_mode}} {{#begin_date}}begin_date=:begin_date and {{/begin_date}} {{#end_date}}end_date=:end_date and {{/end_date}} {{#effect_date}}effect_date=:effect_date and {{/effect_date}}{{#expiry_date}}expiry_date=:expiry_date and {{/expiry_date}} {{#status}}status=:status and {{/status}}  {{#bal_org_id}}bal_org_id=:bal_org_id and {{/bal_org_id}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} 1=1"
  )
  Page<BasVenRebateHeadDTO> selectVenRebateHeadList(
      @Param("no") String no,
      @Param("ven_org_id") Long venOrgId,
      @Param("rebate_mode") Integer rebateMode,
      @Param("begin_date") java.util.Date beginDate,
      @Param("end_date") java.util.Date endDate,
      @Param("effect_date") java.util.Date effectDate,
      @Param("expiry_date") java.util.Date expiryDate,
      @Param("status") Integer status,
      @Param("bal_org_id") Long balOrgId,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled,
      @Param("pageable") Pageable pageable);

  /**
   * 查询供应商返利列表查询
   *
   * @param no
   * @param venOrgId
   * @param rebateMode
   * @param beginDate
   * @param endDate
   * @param effectDate
   * @param expiryDate
   * @param status
   * @param balOrgId
   * @param entId
   * @param deleted
   * @param isEnabled
   * @return
   */
  @SqlTemplate(
    name = "selectVenRebateHeadList",
    sql =
        "select id,no,ent_id,bal_org_id,bal_org_code,bal_org_name,ven_org_id,ven_org_code,ven_org_name,status,rebate_mode,rebate_rate,effect_date,expiry_date,is_all_effect,begin_date,end_date,remark,version,deleted from bas_ven_rebate_head where {{#no}}no like '{{no}}%' and {{/no}} {{#ven_org_id}}ven_org_id=:ven_org_id and {{/ven_org_id}} {{#rebate_mode}}rebate_mode=:rebate_mode and {{/rebate_mode}} {{#begin_date}}begin_date=:begin_date and {{/begin_date}} {{#end_date}}end_date=:end_date and {{/end_date}} {{#effect_date}}effect_date=:effect_date and {{/effect_date}}{{#expiry_date}}expiry_date=:expiry_date and {{/expiry_date}} {{#status}}status=:status and {{/status}}  {{#bal_org_id}}bal_org_id=:bal_org_id and {{/bal_org_id}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} 1=1"
  )
  List<BasVenRebateHeadDTO> selectVenRebateHeadList(
      @Param("no") String no,
      @Param("ven_org_id") Long venOrgId,
      @Param("rebate_mode") Integer rebateMode,
      @Param("begin_date") java.util.Date beginDate,
      @Param("end_date") java.util.Date endDate,
      @Param("effect_date") java.util.Date effectDate,
      @Param("expiry_date") java.util.Date expiryDate,
      @Param("status") Integer status,
      @Param("bal_org_id") Long balOrgId,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled);

  /**
   * 更新供应商返利协议状态
   *
   * @param effectDate
   * @param expiryDate
   * @param status
   * @param id
   * @return
   */
  @SqlTemplate(
    name = "updateHeadStatus",
    sql =
        "update bas_ven_rebate_head set status=:status {{#effect_date}} ,effect_date=:effect_date{{/effect_date}} {{#expiry_date}} , expiry_date=:expiry_date{{/expiry_date}} where id=:id"
  )
  @Modifying
  Integer updateHeadStatus(
      @Param("effect_date") java.util.Date effectDate,
      @Param("expiry_date") java.util.Date expiryDate,
      @Param("status") Integer status,
      @Param("id") Long id);

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
