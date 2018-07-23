package com.pagoda.repo.driverdata.custom;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.driverdata.*;
import com.pagoda.domain.driverdata.*;
import com.pagoda.repo.driverdata.custom.*;

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
 * BasDriver 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BaseBasDriverRepository
    extends BasDriverRepositoryCustom, PagodaJpaRepository<BasDriver, Long> {

  /**
   * 查询司机定义列表
   *
   * @param code
   * @param name
   * @param enabled
   * @param conOrgId
   * @param mobile
   * @param creatorOrgCode
   * @param codeList
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findBasDriverList",
    sql =
        "select * from bas_driver where  deleted = 0 {{#code}} and code=:code{{/code}}  {{#name}} and name=:name{{/name}}  {{#enabled}} and enabled=:enabled{{/enabled}}  {{#conOrgId}} and conOrgId=:conOrgId{{/conOrgId}}  {{#mobile}} and mobile=:mobile{{/mobile}}  {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  Page<BasDriverDTO> findBasDriverList(
      @Param("code") String code,
      @Param("name") String name,
      @Param("enabled") Integer enabled,
      @Param("conOrgId") Long conOrgId,
      @Param("mobile") String mobile,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("codeList") String codeList,
      @Param("pageable") Pageable pageable);

  /**
   * 查询司机定义列表
   *
   * @param code
   * @param name
   * @param enabled
   * @param conOrgId
   * @param mobile
   * @param creatorOrgCode
   * @param codeList
   * @return
   */
  @SqlTemplate(
    name = "findBasDriverList",
    sql =
        "select * from bas_driver where  deleted = 0 {{#code}} and code=:code{{/code}}  {{#name}} and name=:name{{/name}}  {{#enabled}} and enabled=:enabled{{/enabled}}  {{#conOrgId}} and conOrgId=:conOrgId{{/conOrgId}}  {{#mobile}} and mobile=:mobile{{/mobile}}  {{#creator_org_code}} and creator_org_code in ({{#codeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/codeList}}) {{/creator_org_code}}"
  )
  List<BasDriverDTO> findBasDriverList(
      @Param("code") String code,
      @Param("name") String name,
      @Param("enabled") Integer enabled,
      @Param("conOrgId") Long conOrgId,
      @Param("mobile") String mobile,
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
