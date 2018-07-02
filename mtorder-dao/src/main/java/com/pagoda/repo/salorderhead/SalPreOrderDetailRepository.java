package com.pagoda.repo.salorderhead;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.domain.salorderhead.*;
import com.pagoda.repo.salorderhead.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * SalPreOrderDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalPreOrderDetailRepository
    extends SalPreOrderDetailRepositoryCustom, PagodaJpaRepository<SalPreOrderDetail, Long> {

  /**
   * 查询追加预订单的明细
   *
   * @param preOrderId
   * @param detailStatus
   * @param preArrivalDate
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findDetailForAppend",
    sql =
        "select * from sal_pre_order_detail where pre_order_id in ({{#pre_order_id}}{{^-first}}, {{/-first}}{{this}}{{/pre_order_id}}) and detail_status in ({{#detail_status}}{{^-first}}, {{/-first}}{{this}}{{/detail_status}}) and pre_arrival_date=:pre_arrival_date"
  )
  Page<SalPreOrderDetailDTO> findDetailForAppend(
      @Param("pre_order_id") List<Long> preOrderId,
      @Param("detail_status") List<Integer> detailStatus,
      @Param("pre_arrival_date") java.util.Date preArrivalDate,
      @Param("pageable") Pageable pageable);

  /**
   * 查询追加预订单的明细
   *
   * @param preOrderId
   * @param detailStatus
   * @param preArrivalDate
   * @return
   */
  @SqlTemplate(
    name = "findDetailForAppend",
    sql =
        "select * from sal_pre_order_detail where pre_order_id in ({{#pre_order_id}}{{^-first}}, {{/-first}}{{this}}{{/pre_order_id}}) and detail_status in ({{#detail_status}}{{^-first}}, {{/-first}}{{this}}{{/detail_status}}) and pre_arrival_date=:pre_arrival_date"
  )
  List<SalPreOrderDetailDTO> findDetailForAppend(
      @Param("pre_order_id") List<Long> preOrderId,
      @Param("detail_status") List<Integer> detailStatus,
      @Param("pre_arrival_date") java.util.Date preArrivalDate);

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
