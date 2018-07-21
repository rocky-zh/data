package com.pagoda.test.repo.group.custom;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.domain.group.*;
import com.pagoda.test.repo.group.custom.*;

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
 * SalOrderControl 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BaseSalOrderControlRepository
    extends SalOrderControlRepositoryCustom, PagodaJpaRepository<SalOrderControl, Long> {

  /**
   * 根据时分秒查询
   *
   * @param placeOrderTime1
   * @param idList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectWithTime",
    sql =
        "select * from sal_order_control where {{#place_order_time1}}   place_order_time1 = :place_order_time1{{/place_order_time1}}{{#idList_exists}}    and id in ({{#idList}}{{^-first}}, {{/-first}}{{this}}{{/idList}}){{/idList_exists}}"
  )
  Page<SalOrderControlDTO> selectWithTime(
      @Param("place_order_time1") String placeOrderTime1,
      @Param("idList") List<Long> idList,
      @Param("pageable") Pageable pageable);

  /**
   * 根据时分秒查询
   *
   * @param placeOrderTime1
   * @param idList
   * @return
   */
  @SqlTemplate(
    name = "selectWithTime",
    sql =
        "select * from sal_order_control where {{#place_order_time1}}   place_order_time1 = :place_order_time1{{/place_order_time1}}{{#idList_exists}}    and id in ({{#idList}}{{^-first}}, {{/-first}}{{this}}{{/idList}}){{/idList_exists}}"
  )
  List<SalOrderControlDTO> selectWithTime(
      @Param("place_order_time1") String placeOrderTime1, @Param("idList") List<Long> idList);

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
