package com.pagoda.repo.salconsign;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.salconsign.*;
import com.pagoda.domain.salconsign.*;
import com.pagoda.repo.salconsign.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * SalConsignHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignHeadRepository
    extends SalConsignHeadRepositoryCustom, PagodaJpaRepository<SalConsignHead, Long> {

  /**
   * 根据相关条件查询发货单头部数据
   *
   * @param seqno
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param waveNo
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param conStatus
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignHead",
    sql =
        "select id,seqno,ent_id,con_org_code,con_org_name,cus_org_code,cus_org_name,wave_no, transit_line_no,pre_arrival_date,tatal_qty,version, tax_amt,total_amt,shipped_qty, shipped_amt,con_status,print_count,creator_name,created_at,modifier_name,last_modified_at, remark from sal_consign_head where deleted = 0 {{#seqno}} and seqno like '{{seqno}}%'{{/seqno}}   {{#con_org_code}} and con_org_code=:con_org_code{{/con_org_code}}   {{#con_org_name}} and con_org_name=:con_org_name{{/con_org_name}}   {{#cus_org_code}} and cus_org_code=:cus_org_code{{/cus_org_code}}   {{#cus_org_name}} and cus_org_name=:cus_org_name{{/cus_org_name}}   {{#wave_no}} and wave_no=:wave_no{{/wave_no}}   {{#transit_line_no}} and transit_line_no=:transit_line_no{{/transit_line_no}}   {{#pre_arrival_date1}} and pre_arrival_date>=:pre_arrival_date1{{/pre_arrival_date1}}   {{#pre_arrival_date2}} and pre_arrival_date<=:pre_arrival_date2{{/pre_arrival_date2}}   {{#con_status}} and con_status=:con_status{{/con_status}}  {{#codeList}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/codeList}}"
  )
  Page<SalConsignHeadDTO> findSalConsignHead(
      @Param("seqno") String seqno,
      @Param("con_org_code") String conOrgCode,
      @Param("con_org_name") String conOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("wave_no") String waveNo,
      @Param("transit_line_no") String transitLineNo,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
      @Param("con_status") Integer conStatus,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 根据相关条件查询发货单头部数据
   *
   * @param seqno
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param waveNo
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param conStatus
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignHead",
    sql =
        "select id,seqno,ent_id,con_org_code,con_org_name,cus_org_code,cus_org_name,wave_no, transit_line_no,pre_arrival_date,tatal_qty,version, tax_amt,total_amt,shipped_qty, shipped_amt,con_status,print_count,creator_name,created_at,modifier_name,last_modified_at, remark from sal_consign_head where deleted = 0 {{#seqno}} and seqno like '{{seqno}}%'{{/seqno}}   {{#con_org_code}} and con_org_code=:con_org_code{{/con_org_code}}   {{#con_org_name}} and con_org_name=:con_org_name{{/con_org_name}}   {{#cus_org_code}} and cus_org_code=:cus_org_code{{/cus_org_code}}   {{#cus_org_name}} and cus_org_name=:cus_org_name{{/cus_org_name}}   {{#wave_no}} and wave_no=:wave_no{{/wave_no}}   {{#transit_line_no}} and transit_line_no=:transit_line_no{{/transit_line_no}}   {{#pre_arrival_date1}} and pre_arrival_date>=:pre_arrival_date1{{/pre_arrival_date1}}   {{#pre_arrival_date2}} and pre_arrival_date<=:pre_arrival_date2{{/pre_arrival_date2}}   {{#con_status}} and con_status=:con_status{{/con_status}}  {{#codeList}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/codeList}}"
  )
  List<SalConsignHeadDTO> findSalConsignHead(
      @Param("seqno") String seqno,
      @Param("con_org_code") String conOrgCode,
      @Param("con_org_name") String conOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("wave_no") String waveNo,
      @Param("transit_line_no") String transitLineNo,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
      @Param("con_status") Integer conStatus,
      @Param("codeList") String codeList);

  /**
   * 点击打印时符合条件的所有发货单打印次数加1
   *
   * @param conNo
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param waveNo
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param conStatus
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "updatePrintCount",
    sql =
        " update sal_consign_head set print_count=print_count+1 where deleted = 0    {{#con_no}} and con_no like '%{{con_no}}%'  {{/con_no}}   {{#con_org_code}} and con_org_code=:con_org_code {{/con_org_code}}   {{#con_org_name}} and con_org_name=:con_org_name  {{/con_org_name}}  {{#cus_org_code}} and cus_org_code=:cus_org_code {{/cus_org_code}}   {{#cus_org_name}} and cus_org_name=:cus_org_name  {{/cus_org_name}}   {{#wave_no}} and wave_no=:wave_no {{/wave_no}}   {{#transit_line_no}} and transit_line_no=:transit_line_no  {{/transit_line_no}}   {{#pre_arrival_date1}} and  pre_arrival_date>=:pre_arrival_date1 {{/pre_arrival_date1}}   {{#pre_arrival_date2}} and  pre_arrival_date<=:pre_arrival_date2 {{/pre_arrival_date2}}   {{#con_status}} and con_status=:con_status  {{/con_status}}   {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  @Modifying
  Integer updatePrintCount(
      @Param("con_no") String conNo,
      @Param("con_org_code") String conOrgCode,
      @Param("con_org_name") String conOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("wave_no") String waveNo,
      @Param("transit_line_no") String transitLineNo,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
      @Param("con_status") Integer conStatus,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList);

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
