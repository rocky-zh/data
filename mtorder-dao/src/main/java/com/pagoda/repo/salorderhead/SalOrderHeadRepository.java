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
 * SalOrderHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalOrderHeadRepository
    extends SalOrderHeadRepositoryCustom, PagodaJpaRepository<SalOrderHead, Long> {

  /**
   * 查询出录入日期为当天的订单List
   *
   * @param version
   * @param calDateTimeSub
   * @param calDateTimeAdd
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findSalOrderHeadBetween",
    sql =
        "select * from sal_order_head where {{#version}} version=:version and {{/version}}{{#calDateTimeSub}} entry_date>=:calDateTimeSub and {{/calDateTimeSub}} {{#calDateTimeAdd}} entry_date<=:calDateTimeAdd {{/calDateTimeAdd}}"
  )
  Page<SalOrderHeadDTO> findSalOrderHeadBetween(
      @Param("version") Integer version,
      @Param("calDateTimeSub") java.sql.Timestamp calDateTimeSub,
      @Param("calDateTimeAdd") java.sql.Timestamp calDateTimeAdd,
      @Param("pageable") Pageable pageable);

  /**
   * 查询出录入日期为当天的订单List
   *
   * @param version
   * @param calDateTimeSub
   * @param calDateTimeAdd
   * @return
   */
  @SqlTemplate(
    name = "findSalOrderHeadBetween",
    sql =
        "select * from sal_order_head where {{#version}} version=:version and {{/version}}{{#calDateTimeSub}} entry_date>=:calDateTimeSub and {{/calDateTimeSub}} {{#calDateTimeAdd}} entry_date<=:calDateTimeAdd {{/calDateTimeAdd}}"
  )
  List<SalOrderHeadDTO> findSalOrderHeadBetween(
      @Param("version") Integer version,
      @Param("calDateTimeSub") java.sql.Timestamp calDateTimeSub,
      @Param("calDateTimeAdd") java.sql.Timestamp calDateTimeAdd);

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
