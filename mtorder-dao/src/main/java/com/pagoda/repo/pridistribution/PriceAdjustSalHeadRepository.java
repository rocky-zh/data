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
 * PriceAdjustSalHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PriceAdjustSalHeadRepository
    extends PriceAdjustSalHeadRepositoryCustom, PagodaJpaRepository<PriceAdjustSalHead, Long> {

  /**
   * 配送调价单列表
   *
   * @param effectDate1
   * @param effectDate2
   * @param priceCatCode
   * @param priceCatName
   * @param status
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorOrgCode
   * @param creatorOrgCodeList
   * @param seqno
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findAdjusNoList",
    sql =
        "SELECT id,seqno,price_cat_id,price_cat_code,price_cat_name,ph.status, creator_code,creator_name,created_at,remark from price_adjust_sal_head ph WHERE {{ #seqno}} seqno =:seqno{{/seqno}} {{#effect_date1}} and effect_date>=:effect_date1{{/effect_date1}} {{#effect_date2}} and effect_date<=:effect_date2{{/effect_date2}} {{#price_cat_code}} and price_cat_code=:price_cat_code{{/price_cat_code}} {{#price_cat_name}} and price_cat_name like '%{{price_cat_name}}%'{{/price_cat_name}} {{#status}} and ph.status=:status{{/status}} {{#created_at1}} and created_at>=:created_at1{{/created_at1}} {{#created_at2}} and created_at<=:created_at2{{/created_at2}} {{#last_modified_at1}} and last_modified_at>=:last_modified_at1{{/last_modified_at1}} {{#last_modified_at2}} and last_modified_at <=:last_modified_at2{{/last_modified_at2}}{{#creator_org_code}} and creator_org_code in ({{#creator_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/creator_org_code_list}}){{/creator_org_code}}  "
  )
  Page<PriceAdjustSalHeadDTO> findAdjusNoList(
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("price_cat_code") String priceCatCode,
      @Param("price_cat_name") String priceCatName,
      @Param("status") Integer status,
      @Param("created_at1") java.sql.Timestamp createdAt1,
      @Param("created_at2") java.sql.Timestamp createdAt2,
      @Param("last_modified_at1") java.sql.Timestamp lastModifiedAt1,
      @Param("last_modified_at2") java.sql.Timestamp lastModifiedAt2,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("creator_org_code_list") String creatorOrgCodeList,
      @Param("seqno") String seqno,
      @Param("pageable") Pageable pageable);

  /**
   * 配送调价单列表
   *
   * @param effectDate1
   * @param effectDate2
   * @param priceCatCode
   * @param priceCatName
   * @param status
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorOrgCode
   * @param creatorOrgCodeList
   * @param seqno
   * @return
   */
  @SqlTemplate(
    name = "findAdjusNoList",
    sql =
        "SELECT id,seqno,price_cat_id,price_cat_code,price_cat_name,ph.status, creator_code,creator_name,created_at,remark from price_adjust_sal_head ph WHERE {{ #seqno}} seqno =:seqno{{/seqno}} {{#effect_date1}} and effect_date>=:effect_date1{{/effect_date1}} {{#effect_date2}} and effect_date<=:effect_date2{{/effect_date2}} {{#price_cat_code}} and price_cat_code=:price_cat_code{{/price_cat_code}} {{#price_cat_name}} and price_cat_name like '%{{price_cat_name}}%'{{/price_cat_name}} {{#status}} and ph.status=:status{{/status}} {{#created_at1}} and created_at>=:created_at1{{/created_at1}} {{#created_at2}} and created_at<=:created_at2{{/created_at2}} {{#last_modified_at1}} and last_modified_at>=:last_modified_at1{{/last_modified_at1}} {{#last_modified_at2}} and last_modified_at <=:last_modified_at2{{/last_modified_at2}}{{#creator_org_code}} and creator_org_code in ({{#creator_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/creator_org_code_list}}){{/creator_org_code}}  "
  )
  List<PriceAdjustSalHeadDTO> findAdjusNoList(
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("price_cat_code") String priceCatCode,
      @Param("price_cat_name") String priceCatName,
      @Param("status") Integer status,
      @Param("created_at1") java.sql.Timestamp createdAt1,
      @Param("created_at2") java.sql.Timestamp createdAt2,
      @Param("last_modified_at1") java.sql.Timestamp lastModifiedAt1,
      @Param("last_modified_at2") java.sql.Timestamp lastModifiedAt2,
      @Param("creator_org_code") String creatorOrgCode,
      @Param("creator_org_code_list") String creatorOrgCodeList,
      @Param("seqno") String seqno);

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
