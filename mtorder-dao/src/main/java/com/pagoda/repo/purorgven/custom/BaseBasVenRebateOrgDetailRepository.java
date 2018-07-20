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
 * BasVenRebateOrgDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BaseBasVenRebateOrgDetailRepository
    extends BasVenRebateOrgDetailRepositoryCustom,
        PagodaJpaRepository<BasVenRebateOrgDetail, Long> {

  /**
   * 查询供应商返利机构明细表
   *
   * @param arrOrgCode
   * @param arrOrgName
   * @param status
   * @param entId
   * @param deleted
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectVenRebateOrgDetailSetted",
    sql =
        "select id,rebate_id,rebate_no,arr_org_id,arr_org_code,arr_org_name,ent_id,effect_date,expiry_date,status,version,remark,deleted from bas_ven_rebate_org_detail where {{#arr_org_code}}arr_org_code like '{{arr_org_code}}%' and {{/arr_org_code}}  {{#arr_org_name}}arr_org_name like '{{arr_org_name}}%' and {{/arr_org_name}} {{#status}}status=:status and {{/status}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1"
  )
  Page<BasVenRebateOrgDetailDTO> selectVenRebateOrgDetailSetted(
      @Param("arr_org_code") String arrOrgCode,
      @Param("arr_org_name") String arrOrgName,
      @Param("status") Integer status,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("pageable") Pageable pageable);

  /**
   * 查询供应商返利机构明细表
   *
   * @param arrOrgCode
   * @param arrOrgName
   * @param status
   * @param entId
   * @param deleted
   * @return
   */
  @SqlTemplate(
    name = "selectVenRebateOrgDetailSetted",
    sql =
        "select id,rebate_id,rebate_no,arr_org_id,arr_org_code,arr_org_name,ent_id,effect_date,expiry_date,status,version,remark,deleted from bas_ven_rebate_org_detail where {{#arr_org_code}}arr_org_code like '{{arr_org_code}}%' and {{/arr_org_code}}  {{#arr_org_name}}arr_org_name like '{{arr_org_name}}%' and {{/arr_org_name}} {{#status}}status=:status and {{/status}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1"
  )
  List<BasVenRebateOrgDetailDTO> selectVenRebateOrgDetailSetted(
      @Param("arr_org_code") String arrOrgCode,
      @Param("arr_org_name") String arrOrgName,
      @Param("status") Integer status,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted);

  /**
   * 通过协议号id更新机构明细的状态
   *
   * @param status
   * @param rebateId
   * @return
   */
  @SqlTemplate(
    name = "updateOrgDetailStatusByRebateId",
    sql = "update bas_ven_rebate_org_detail set status=:status where rebate_id=:rebate_id"
  )
  @Modifying
  Integer updateOrgDetailStatusByRebateId(
      @Param("status") Integer status, @Param("rebate_id") Long rebateId);

  /**
   * 删除供应商返利的机构明细
   *
   * @param rebateId
   * @return
   */
  @SqlTemplate(
    name = "deleteOrgDetailByRebateId",
    sql = "update bas_ven_rebate_org_detail set deleted=id where rebate_id=:rebate_id"
  )
  @Modifying
  Integer deleteOrgDetailByRebateId(@Param("rebate_id") Long rebateId);

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
