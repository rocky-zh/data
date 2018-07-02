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
 * SalConsignDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignDetailRepository
    extends SalConsignDetailRepositoryCustom, PagodaJpaRepository<SalConsignDetail, Long> {

  /**
   * 根据发货单id查询明细,用于发货时操作
   *
   * @param conId
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignDetail",
    sql =
        "select con_seqno,con_id,goods_id,order_seqno,goods_code,goods_name,goods_spec,sal_unit_name,net_weight, shipped_net_weight,qty,shipped_qty,tax_rate,tax_amt,price,total_amt,discount_rate,discount_price, actual_amt,shipped_price,shipped_count,shipped_amt,remark,shipped_gross_weight,gross_weight, version from sal_consign_detail where deleted = 0 {{#con_id}} and con_id=:con_id {{/con_id}} {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}} "
  )
  Page<SalConsignDetailDTO> findSalConsignDetail(
      @Param("con_id") Long conId,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 根据发货单id查询明细,用于发货时操作
   *
   * @param conId
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignDetail",
    sql =
        "select con_seqno,con_id,goods_id,order_seqno,goods_code,goods_name,goods_spec,sal_unit_name,net_weight, shipped_net_weight,qty,shipped_qty,tax_rate,tax_amt,price,total_amt,discount_rate,discount_price, actual_amt,shipped_price,shipped_count,shipped_amt,remark,shipped_gross_weight,gross_weight, version from sal_consign_detail where deleted = 0 {{#con_id}} and con_id=:con_id {{/con_id}} {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}} "
  )
  List<SalConsignDetailDTO> findSalConsignDetail(
      @Param("con_id") Long conId,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList);

  /**
   * 通过发货单id查看明细商品更多信息
   *
   * @param conId
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignAllDetails",
    sql =
        "select con_seqno,con_id,goods_id,order_seqno,goods_code,goods_name,goods_spec,sal_unit_name, net_weight,shipped_net_weight,qty,shipped_qty,tax_rate,tax_amt,price,total_amt,discount_rate, discount_price,actual_amt,shipped_price,shipped_count, shipped_amt,remark,shipped_gross_weight,gross_weight,version  from sal_consign_detail where deleted = 0 {{#con_id}} and con_id=:con_id {{/con_id}} {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}} "
  )
  Page<SalConsignDetailDTO> findSalConsignAllDetails(
      @Param("con_id") Long conId,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 通过发货单id查看明细商品更多信息
   *
   * @param conId
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findSalConsignAllDetails",
    sql =
        "select con_seqno,con_id,goods_id,order_seqno,goods_code,goods_name,goods_spec,sal_unit_name, net_weight,shipped_net_weight,qty,shipped_qty,tax_rate,tax_amt,price,total_amt,discount_rate, discount_price,actual_amt,shipped_price,shipped_count, shipped_amt,remark,shipped_gross_weight,gross_weight,version  from sal_consign_detail where deleted = 0 {{#con_id}} and con_id=:con_id {{/con_id}} {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}} "
  )
  List<SalConsignDetailDTO> findSalConsignAllDetails(
      @Param("con_id") Long conId,
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
