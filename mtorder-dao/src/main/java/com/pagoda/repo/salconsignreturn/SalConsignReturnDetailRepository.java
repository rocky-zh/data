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
 * SalConsignReturnDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignReturnDetailRepository
    extends SalConsignReturnDetailRepositoryCustom,
        PagodaJpaRepository<SalConsignReturnDetail, Long> {

  /**
   * 通过退货单头表id获取退货单明细
   *
   * @param returnId
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "getSCRDetailsByReturnId",
    sql =
        "select id,goods_code,goods_name,goods_spec,sal_unit_name,return_qty,stockin_qty, return_price,tax_rate,tax_amt,total_return_amt,total_stockin_amt,remark,sal_ret_in_depot_name,stockin_net_weight, stockin_gross_weight,version from sal_consign_return_detail  where deleted = 0 {{#return_id}} and return_id=:return_id{{/return_id}} {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  Page<SalConsignReturnDetailDTO> getSCRDetailsByReturnId(
      @Param("return_id") Long returnId,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 通过退货单头表id获取退货单明细
   *
   * @param returnId
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "getSCRDetailsByReturnId",
    sql =
        "select id,goods_code,goods_name,goods_spec,sal_unit_name,return_qty,stockin_qty, return_price,tax_rate,tax_amt,total_return_amt,total_stockin_amt,remark,sal_ret_in_depot_name,stockin_net_weight, stockin_gross_weight,version from sal_consign_return_detail  where deleted = 0 {{#return_id}} and return_id=:return_id{{/return_id}} {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  List<SalConsignReturnDetailDTO> getSCRDetailsByReturnId(
      @Param("return_id") Long returnId,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList);

  /**
   * 根据returnId删除退货单明细
   *
   * @param returnId
   * @return
   */
  @SqlTemplate(
    name = "deleteDetailByReturnId",
    sql = "update sal_consign_return_detail set deleted = 1 where return_id=:return_id"
  )
  @Modifying
  Integer deleteDetailByReturnId(@Param("return_id") Long returnId);

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
