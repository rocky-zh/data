package com.pagoda.repo.pridistribution;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.domain.pridistribution.*;
import com.pagoda.repo.pridistribution.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * PriceCatalogSalHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PriceCatalogSalHeadRepository
    extends PriceCatalogSalHeadRepositoryCustom, PagodaJpaRepository<PriceCatalogSalHead, Long> {

  /**
   * 多条件查询价格目录表头
   *
   * @param name
   * @param balOrgOrgCode
   * @param isEnable
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorOrgCode
   * @param creatorOrgCodeList
   * @param code
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findByMultipleCondititons",
    sql =
        "select ph.id,ph.code,ph.name,bal_org_org_code,bal_org_org_name,is_enable,is_used,creator_code,creator_name,created_at,modifier_code,modifier_name,last_modified_at FROM price_catalog_sal_head ph WHERE{{ #code}} ph.code=:code{{/code}} {{#name}} and ph.name like '%{{name}}%'{{/name}} {{#bal_org_org_code}} and bal_org_org_code=:bal_org_org_code{{/bal_org_org_code}} {{#is_enable}} and is_enable =:is_enable{{/is_enable}} {{#created_at1}} and created_at>=:created_at1{{/created_at1}} {{#created_at2}} and created_at<=:created_at2{{/created_at2}} {{#last_modified_at1}} and last_modified_at>=:last_modified_at1{{/last_modified_at1}} {{#last_modified_at2}} and last_modified_at <=:last_modified_at2{{/last_modified_at2}}{{#creator_org_code}} and creator_org_code in ({{#creator_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/creator_org_code_list}}){{/creator_org_code}}"
  )
  Page<PriceCatalogSalHeadDTO> findByMultipleCondititons(
      @Param("name") String name,
      @Param("bal_org_org_code") String balOrgOrgCode,
      @Param("is_enable") Integer isEnable,
      @Param("created_at1") java.sql.Timestamp createdAt1,
      @Param("created_at2") java.sql.Timestamp createdAt2,
      @Param("last_modified_at1") java.sql.Timestamp lastModifiedAt1,
      @Param("last_modified_at2") java.sql.Timestamp lastModifiedAt2,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("creator_org_code_list") String creatorOrgCodeList,
      @Param("code") String code,
      @Param("pageable") Pageable pageable);

  /**
   * 多条件查询价格目录表头
   *
   * @param name
   * @param balOrgOrgCode
   * @param isEnable
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorOrgCode
   * @param creatorOrgCodeList
   * @param code
   * @return
   */
  @SqlTemplate(
    name = "findByMultipleCondititons",
    sql =
        "select ph.id,ph.code,ph.name,bal_org_org_code,bal_org_org_name,is_enable,is_used,creator_code,creator_name,created_at,modifier_code,modifier_name,last_modified_at FROM price_catalog_sal_head ph WHERE{{ #code}} ph.code=:code{{/code}} {{#name}} and ph.name like '%{{name}}%'{{/name}} {{#bal_org_org_code}} and bal_org_org_code=:bal_org_org_code{{/bal_org_org_code}} {{#is_enable}} and is_enable =:is_enable{{/is_enable}} {{#created_at1}} and created_at>=:created_at1{{/created_at1}} {{#created_at2}} and created_at<=:created_at2{{/created_at2}} {{#last_modified_at1}} and last_modified_at>=:last_modified_at1{{/last_modified_at1}} {{#last_modified_at2}} and last_modified_at <=:last_modified_at2{{/last_modified_at2}}{{#creator_org_code}} and creator_org_code in ({{#creator_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/creator_org_code_list}}){{/creator_org_code}}"
  )
  List<PriceCatalogSalHeadDTO> findByMultipleCondititons(
      @Param("name") String name,
      @Param("bal_org_org_code") String balOrgOrgCode,
      @Param("is_enable") Integer isEnable,
      @Param("created_at1") java.sql.Timestamp createdAt1,
      @Param("created_at2") java.sql.Timestamp createdAt2,
      @Param("last_modified_at1") java.sql.Timestamp lastModifiedAt1,
      @Param("last_modified_at2") java.sql.Timestamp lastModifiedAt2,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("creator_org_code_list") String creatorOrgCodeList,
      @Param("code") String code);

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
