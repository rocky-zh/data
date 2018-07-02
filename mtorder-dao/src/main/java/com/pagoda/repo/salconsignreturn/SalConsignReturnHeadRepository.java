package com.pagoda.repo.salconsignreturn;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.domain.salconsignreturn.*;
import com.pagoda.repo.salconsignreturn.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * SalConsignReturnHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignReturnHeadRepository
    extends SalConsignReturnHeadRepositoryCustom, PagodaJpaRepository<SalConsignReturnHead, Long> {

  /**
   * 退货单及退货单审核列表查询
   *
   * @param seqno
   * @param arrOrgCode
   * @param arrOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param returnType
   * @param status
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignReturnHead",
    sql =
        "select id,seqno,arr_org_code,arr_org_name,cus_org_code,cus_org_name,return_type,return_date,return_qty,total_tax_amt, total_return_amt,total_stockin_amt,status,creator_name,created_at,modifier_name,last_modified_at,remark,note, transit_line_no,print_count,version from sal_consign_return_head  where deleted = 0  {{#seqno}} and seqno like '{{seqno}}%'{{/seqno}}  {{#arr_org_code}} and arr_org_code=:arr_org_code{{/arr_org_code}}  {{#arr_org_name}} and arr_org_name=:arr_org_name{{/arr_org_name}}  {{#cus_org_code}}  and cus_org_code=:cus_org_code{{/cus_org_code}}  {{#cus_org_name}} and cus_org_name=:cus_org_name{{/cus_org_name}}  {{#return_type}} and return_type=:return_type{{/return_type}}  {{#status}} and status=:status{{/status}}  {{#transit_line_no}} and transit_line_no=:transit_line_no{{/transit_line_no}}  {{#pre_arrival_date1}} and pre_arrival_date>=:pre_arrival_date1{{/pre_arrival_date1}}  {{#pre_arrival_date2}} and pre_arrival_date<=:pre_arrival_date2{{/pre_arrival_date2}}  {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  Page<SalConsignReturnHeadDTO> findSalConsignReturnHead(
      @Param("seqno") String seqno,
      @Param("arr_org_code") String arrOrgCode,
      @Param("arr_org_name") String arrOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("return_type") Integer returnType,
      @Param("status") Integer status,
      @Param("transit_line_no") String transitLineNo,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 退货单及退货单审核列表查询
   *
   * @param seqno
   * @param arrOrgCode
   * @param arrOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param returnType
   * @param status
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignReturnHead",
    sql =
        "select id,seqno,arr_org_code,arr_org_name,cus_org_code,cus_org_name,return_type,return_date,return_qty,total_tax_amt, total_return_amt,total_stockin_amt,status,creator_name,created_at,modifier_name,last_modified_at,remark,note, transit_line_no,print_count,version from sal_consign_return_head  where deleted = 0  {{#seqno}} and seqno like '{{seqno}}%'{{/seqno}}  {{#arr_org_code}} and arr_org_code=:arr_org_code{{/arr_org_code}}  {{#arr_org_name}} and arr_org_name=:arr_org_name{{/arr_org_name}}  {{#cus_org_code}}  and cus_org_code=:cus_org_code{{/cus_org_code}}  {{#cus_org_name}} and cus_org_name=:cus_org_name{{/cus_org_name}}  {{#return_type}} and return_type=:return_type{{/return_type}}  {{#status}} and status=:status{{/status}}  {{#transit_line_no}} and transit_line_no=:transit_line_no{{/transit_line_no}}  {{#pre_arrival_date1}} and pre_arrival_date>=:pre_arrival_date1{{/pre_arrival_date1}}  {{#pre_arrival_date2}} and pre_arrival_date<=:pre_arrival_date2{{/pre_arrival_date2}}  {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  List<SalConsignReturnHeadDTO> findSalConsignReturnHead(
      @Param("seqno") String seqno,
      @Param("arr_org_code") String arrOrgCode,
      @Param("arr_org_name") String arrOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("return_type") Integer returnType,
      @Param("status") Integer status,
      @Param("transit_line_no") String transitLineNo,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList);

  /**
   * 修改打印次数
   *
   * @param seqno
   * @param arrOrgCode
   * @param arrOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param returnType
   * @param status
   * @param transitLineNo
   * @param preArrivalDate1
   * @param preArrivalDate2
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "updatePrintCount",
    sql =
        " update sal_consign_return_head set print_count = print_count+1   where  deleted = 0 {{#seqno}} and seqno=:seqno {{/seqno}}   {{#arr_org_code}} and arr_org_code=:arr_org_code {{/arr_org_code}}   {{#arr_org_name}} and arr_org_name=:arr_org_name  {{/arr_org_name}}   {{#cus_org_code}} and cus_org_code=:cus_org_code  {{/cus_org_code}}   {{#cus_org_name}} and cus_org_name=:cus_org_name  {{/cus_org_name}}   {{#return_type}} and return_type=:return_type  {{/return_type}}   {{#status}} and status=:status {{/status}}   {{#transit_line_no}} and transit_line_no=:transit_line_no  {{/transit_line_no}}   {{#pre_arrival_date1}} and pre_arrival_date>=:pre_arrival_date1  {{/pre_arrival_date1}}   {{#pre_arrival_date2}} and pre_arrival_date<=:pre_arrival_date2  {{/pre_arrival_date2}}  {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  @Modifying
  Integer updatePrintCount(
      @Param("seqno") String seqno,
      @Param("arr_org_code") String arrOrgCode,
      @Param("arr_org_name") String arrOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("return_type") Integer returnType,
      @Param("status") Integer status,
      @Param("transit_line_no") String transitLineNo,
      @Param("pre_arrival_date1") java.util.Date preArrivalDate1,
      @Param("pre_arrival_date2") java.util.Date preArrivalDate2,
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
