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
 * SalConsignOutDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignOutDetailRepository
    extends SalConsignOutDetailRepositoryCustom, PagodaJpaRepository<SalConsignOutDetail, Long> {

  /**
   * 查询发货出库单详情
   *
   * @param stockoutSeqno
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignOutDetail",
    sql =
        "select order_seqno,goods_code,goods_name,goods_spec,sal_con_out_depot_name,sal_unit_name,shipped_net_weight,shipped_qty,  shipped_gross_weight,tax_rate,tax_amt,shipped_price,shipped_amt,stockout_status,remark,note,version  from sal_consign_out_detail where deleted = 0  {{#stockout_seqno}} and stockout_seqno=:stockout_seqno{{/stockout_seqno}}  {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  Page<SalConsignOutDetailDTO> findSalConsignOutDetail(
      @Param("stockout_seqno") String stockoutSeqno,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 查询发货出库单详情
   *
   * @param stockoutSeqno
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignOutDetail",
    sql =
        "select order_seqno,goods_code,goods_name,goods_spec,sal_con_out_depot_name,sal_unit_name,shipped_net_weight,shipped_qty,  shipped_gross_weight,tax_rate,tax_amt,shipped_price,shipped_amt,stockout_status,remark,note,version  from sal_consign_out_detail where deleted = 0  {{#stockout_seqno}} and stockout_seqno=:stockout_seqno{{/stockout_seqno}}  {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  List<SalConsignOutDetailDTO> findSalConsignOutDetail(
      @Param("stockout_seqno") String stockoutSeqno,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList);

  /**
   * 查询单个商品发货详情
   *
   * @param conId
   * @param goodsId
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findGoodsOutDetail",
    sql =
        "select stockout_seqno,shipped_net_weight,shipped_amt,shipped_gross_weight,shipped_price, ship_seq,consigner_name,consign_time,stockout_status,audit_time,auditor_name,remark,note,version  from sal_consign_out_detail where deleted= 0  {{#con_id}} and con_id=:con_id{{/con_id}}  {{#goods_id}} and goods_id=:goods_id{{/goods_id}}  {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  Page<SalConsignOutDetailDTO> findGoodsOutDetail(
      @Param("con_id") Long conId,
      @Param("goods_id") Long goodsId,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 查询单个商品发货详情
   *
   * @param conId
   * @param goodsId
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findGoodsOutDetail",
    sql =
        "select stockout_seqno,shipped_net_weight,shipped_amt,shipped_gross_weight,shipped_price, ship_seq,consigner_name,consign_time,stockout_status,audit_time,auditor_name,remark,note,version  from sal_consign_out_detail where deleted= 0  {{#con_id}} and con_id=:con_id{{/con_id}}  {{#goods_id}} and goods_id=:goods_id{{/goods_id}}  {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  List<SalConsignOutDetailDTO> findGoodsOutDetail(
      @Param("con_id") Long conId,
      @Param("goods_id") Long goodsId,
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
