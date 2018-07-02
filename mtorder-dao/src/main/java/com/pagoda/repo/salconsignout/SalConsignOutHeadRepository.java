package com.pagoda.repo.salconsignout;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.domain.salconsignout.*;
import com.pagoda.repo.salconsignout.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * SalConsignOutHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignOutHeadRepository
    extends SalConsignOutHeadRepositoryCustom, PagodaJpaRepository<SalConsignOutHead, Long> {

  /**
   * 根据相关条件查询发货出库单单头部数据
   *
   * @param conSeqno
   * @param seqno
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param goodsCode
   * @param goodsName
   * @param stockoutStatus
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignOutHead",
    sql =
        "select distinct scoh.id,scoh.con_seqno,scoh.seqno,scoh.pre_arrival_date,scoh.con_org_code,scoh.con_org_name, scoh.cus_org_code,scoh.cus_org_name,scoh.transit_line_no,scoh.shipped_qty,scoh.tax_amt,scoh.shipped_amt,scoh.stockout_status, scoh.creator_name,scoh.created_at,scoh.auditor_name,scoh.audit_time,scoh.remark,scoh.version from sal_consign_out_head scoh left join sal_consign_out_detail scod on scoh.id = scod.stockout_id  where scoh.deleted = 0 {{#con_seqno}} and scoh.con_seqno=:con_seqno {{/con_seqno}}  {{#seqno}} and scoh.seqno=:seqno {{/seqno}} {{#con_org_code}} and scoh.con_org_code=:con_org_code{{/con_org_code}}  {{#con_org_name}} and scoh.con_org_name=:con_org_name{{/con_org_name}}  {{#cus_org_code}} and scoh.cus_org_code=:cus_org_code{{/cus_org_code}}  {{#cus_org_name}} and scoh.cus_org_name=:cus_org_name{{/cus_org_name}}  {{#transit_line_no}} and scoh.transit_line_no=:transit_line_no{{/transit_line_no}}  {{#pre_arrival_date1}} and scoh.pre_arrival_date>=:pre_arrival_date1{{/pre_arrival_date1}}  {{#pre_arrival_date2}} and scoh.pre_arrival_date<=:pre_arrival_date2{{/pre_arrival_date2}}  {{#goods_code}} and scod.goods_code=:goods_code{{/goods_code}}  {{#goods_name}} and scod.goods_name=:goods_name{{/goods_name}}  {{#stockout_status}} and scoh.stockout_status=:stockout_status{{/stockout_status}}  {{#creator_org_code}} and scoh.creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  Page<FindSalConsignOutHeadDTO> findSalConsignOutHead(
      @Param("con_seqno") String conSeqno,
      @Param("seqno") String seqno,
      @Param("con_org_code") String conOrgCode,
      @Param("con_org_name") String conOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("transit_line_no") String transitLineNo,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
      @Param("goods_code") String goodsCode,
      @Param("goods_name") String goodsName,
      @Param("stockout_status") Integer stockoutStatus,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 根据相关条件查询发货出库单单头部数据
   *
   * @param conSeqno
   * @param seqno
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param goodsCode
   * @param goodsName
   * @param stockoutStatus
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignOutHead",
    sql =
        "select distinct scoh.id,scoh.con_seqno,scoh.seqno,scoh.pre_arrival_date,scoh.con_org_code,scoh.con_org_name, scoh.cus_org_code,scoh.cus_org_name,scoh.transit_line_no,scoh.shipped_qty,scoh.tax_amt,scoh.shipped_amt,scoh.stockout_status, scoh.creator_name,scoh.created_at,scoh.auditor_name,scoh.audit_time,scoh.remark,scoh.version from sal_consign_out_head scoh left join sal_consign_out_detail scod on scoh.id = scod.stockout_id  where scoh.deleted = 0 {{#con_seqno}} and scoh.con_seqno=:con_seqno {{/con_seqno}}  {{#seqno}} and scoh.seqno=:seqno {{/seqno}} {{#con_org_code}} and scoh.con_org_code=:con_org_code{{/con_org_code}}  {{#con_org_name}} and scoh.con_org_name=:con_org_name{{/con_org_name}}  {{#cus_org_code}} and scoh.cus_org_code=:cus_org_code{{/cus_org_code}}  {{#cus_org_name}} and scoh.cus_org_name=:cus_org_name{{/cus_org_name}}  {{#transit_line_no}} and scoh.transit_line_no=:transit_line_no{{/transit_line_no}}  {{#pre_arrival_date1}} and scoh.pre_arrival_date>=:pre_arrival_date1{{/pre_arrival_date1}}  {{#pre_arrival_date2}} and scoh.pre_arrival_date<=:pre_arrival_date2{{/pre_arrival_date2}}  {{#goods_code}} and scod.goods_code=:goods_code{{/goods_code}}  {{#goods_name}} and scod.goods_name=:goods_name{{/goods_name}}  {{#stockout_status}} and scoh.stockout_status=:stockout_status{{/stockout_status}}  {{#creator_org_code}} and scoh.creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  List<FindSalConsignOutHeadDTO> findSalConsignOutHead(
      @Param("con_seqno") String conSeqno,
      @Param("seqno") String seqno,
      @Param("con_org_code") String conOrgCode,
      @Param("con_org_name") String conOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("transit_line_no") String transitLineNo,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
      @Param("goods_code") String goodsCode,
      @Param("goods_name") String goodsName,
      @Param("stockout_status") Integer stockoutStatus,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList);

  /**
   * 确认到货页面查询
   *
   * @param seqno
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param stockoutStatus
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findConfirmGoodsList",
    sql =
        "select id,seqno,pre_arrival_date,con_org_code,con_org_name,cus_org_code,cus_org_name, shipped_qty,tax_amt,shipped_amt,stockout_status,creator_name, created_at,confirm_user_code,confirm_time,remark,version from sal_consign_out_head  where stockout_status >= 20 {{#seqno}} and seqno=:seqno{{/seqno}}  {{#con_org_code}} and con_org_code=:con_org_code{{/con_org_code}}  {{#con_org_name}} and con_org_name=:con_org_name{{/con_org_name}}  {{#cus_org_code}} and cus_org_code=:cus_org_code {{/cus_org_code}}  {{#cus_org_name}} and cus_org_name=:cus_org_name{{/cus_org_name}}  {{#pre_arrival_date1}} and pre_arrival_date>=:pre_arrival_date1{{/pre_arrival_date1}}  {{#pre_arrival_date2}} and pre_arrival_date<=:pre_arrival_date2{{/pre_arrival_date2}}  {{#stockout_status}} and stockout_status=:stockout_status{{/stockout_status}} {{#creator_org_code}} and scoh.creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  Page<SalConsignOutHeadDTO> findConfirmGoodsList(
      @Param("seqno") String seqno,
      @Param("con_org_code") String conOrgCode,
      @Param("con_org_name") String conOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
      @Param("stockout_status") Integer stockoutStatus,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 确认到货页面查询
   *
   * @param seqno
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param stockoutStatus
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findConfirmGoodsList",
    sql =
        "select id,seqno,pre_arrival_date,con_org_code,con_org_name,cus_org_code,cus_org_name, shipped_qty,tax_amt,shipped_amt,stockout_status,creator_name, created_at,confirm_user_code,confirm_time,remark,version from sal_consign_out_head  where stockout_status >= 20 {{#seqno}} and seqno=:seqno{{/seqno}}  {{#con_org_code}} and con_org_code=:con_org_code{{/con_org_code}}  {{#con_org_name}} and con_org_name=:con_org_name{{/con_org_name}}  {{#cus_org_code}} and cus_org_code=:cus_org_code {{/cus_org_code}}  {{#cus_org_name}} and cus_org_name=:cus_org_name{{/cus_org_name}}  {{#pre_arrival_date1}} and pre_arrival_date>=:pre_arrival_date1{{/pre_arrival_date1}}  {{#pre_arrival_date2}} and pre_arrival_date<=:pre_arrival_date2{{/pre_arrival_date2}}  {{#stockout_status}} and stockout_status=:stockout_status{{/stockout_status}} {{#creator_org_code}} and scoh.creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  List<SalConsignOutHeadDTO> findConfirmGoodsList(
      @Param("seqno") String seqno,
      @Param("con_org_code") String conOrgCode,
      @Param("con_org_name") String conOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
      @Param("stockout_status") Integer stockoutStatus,
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
