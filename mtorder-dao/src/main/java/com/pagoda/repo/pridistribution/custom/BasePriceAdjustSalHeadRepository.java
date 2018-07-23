package com.pagoda.repo.pridistribution.custom;

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
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * PriceAdjustSalHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BasePriceAdjustSalHeadRepository
    extends PriceAdjustSalHeadRepositoryCustom, PagodaJpaRepository<PriceAdjustSalHead, Long> {

  /**
   * 查询调价单表头
   *
   * @param phId
   * @param socId
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findPriceAdjustHead",
    sql =
        "SELECT DISTINCT ph.id,seqno,ph.price_cat_id,soc.org_org_code,soc.org_org_id,soc.org_org_name,ph.price_cat_code,ph.price_cat_name,ph.effect_date,ph.status,ph.creator_code,ph.creator_name,ph.created_at,ph.modifier_name,ph.last_modified_at,ph.note,ph.remark FROM price_adjust_sal_head ph,sal_org_cus soc where ph.price_cat_id = soc.price_cat_id AND ph.deleted = 0 AND soc.deleted = 0{{#ph_id}} and ph.id =:ph_id{{/ph_id}}{{#soc_id}} and soc.id =:soc_id{{/soc_id}}"
  )
  Page<FindPriceAdjustHeadDTO> findPriceAdjustHead(
      @Param("ph_id") String phId,
      @Param("soc_id") String socId,
      @Param("pageable") Pageable pageable);

  /**
   * 查询调价单表头
   *
   * @param phId
   * @param socId
   * @return
   */
  @SqlTemplate(
    name = "findPriceAdjustHead",
    sql =
        "SELECT DISTINCT ph.id,seqno,ph.price_cat_id,soc.org_org_code,soc.org_org_id,soc.org_org_name,ph.price_cat_code,ph.price_cat_name,ph.effect_date,ph.status,ph.creator_code,ph.creator_name,ph.created_at,ph.modifier_name,ph.last_modified_at,ph.note,ph.remark FROM price_adjust_sal_head ph,sal_org_cus soc where ph.price_cat_id = soc.price_cat_id AND ph.deleted = 0 AND soc.deleted = 0{{#ph_id}} and ph.id =:ph_id{{/ph_id}}{{#soc_id}} and soc.id =:soc_id{{/soc_id}}"
  )
  List<FindPriceAdjustHeadDTO> findPriceAdjustHead(
      @Param("ph_id") String phId, @Param("soc_id") String socId);

  /**
   * 查询调价日志表头
   *
   * @param socId
   * @param phId
   * @param pdId
   * @param goodsId
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findLogstableHead",
    sql =
        "SELECT soc.org_org_code,soc.org_org_id,soc.org_org_name,soc.cus_org_id,soc.cus_org_code,soc.cus_org_name,ph.price_cat_id,ph.price_cat_code,ph.price_cat_name,ph.creator_code,ph.creator_name,pd.goods_id,pd.goods_code,pd.goods_name,pd.goods_spec,pd.goods_class_name,pd.unit_id,pd.unit_code,pd.unit_name,pd.unit_rate FROM sal_org_cus soc,price_adjust_sal_head ph,price_adjust_sal_detail pd WHERE soc.price_cat_id = ph.price_cat_id AND ph.id = pd.adjust_id AND ph.deleted = 0 AND pd.deleted = 0{{#soc_id}} and soc.id =:soc_id{{/soc_id}}{{#ph_id}} and ph.id =:ph_id{{/ph_id}}{{#pd_id}} and pd.id =:pd_id{{/pd_id}}{{#goods_id}} and pd.goods_id =:goods_id{{/goods_id}}"
  )
  Page<FindLogstableHeadDTO> findLogstableHead(
      @Param("soc_id") String socId,
      @Param("ph_id") String phId,
      @Param("pd_id") String pdId,
      @Param("goods_id") Long goodsId,
      @Param("pageable") Pageable pageable);

  /**
   * 查询调价日志表头
   *
   * @param socId
   * @param phId
   * @param pdId
   * @param goodsId
   * @return
   */
  @SqlTemplate(
    name = "findLogstableHead",
    sql =
        "SELECT soc.org_org_code,soc.org_org_id,soc.org_org_name,soc.cus_org_id,soc.cus_org_code,soc.cus_org_name,ph.price_cat_id,ph.price_cat_code,ph.price_cat_name,ph.creator_code,ph.creator_name,pd.goods_id,pd.goods_code,pd.goods_name,pd.goods_spec,pd.goods_class_name,pd.unit_id,pd.unit_code,pd.unit_name,pd.unit_rate FROM sal_org_cus soc,price_adjust_sal_head ph,price_adjust_sal_detail pd WHERE soc.price_cat_id = ph.price_cat_id AND ph.id = pd.adjust_id AND ph.deleted = 0 AND pd.deleted = 0{{#soc_id}} and soc.id =:soc_id{{/soc_id}}{{#ph_id}} and ph.id =:ph_id{{/ph_id}}{{#pd_id}} and pd.id =:pd_id{{/pd_id}}{{#goods_id}} and pd.goods_id =:goods_id{{/goods_id}}"
  )
  List<FindLogstableHeadDTO> findLogstableHead(
      @Param("soc_id") String socId,
      @Param("ph_id") String phId,
      @Param("pd_id") String pdId,
      @Param("goods_id") Long goodsId);

  /**
   * 配送调价单列表
   *
   * @param seqno
   * @param conOrgCodeList
   * @param priceCatCodeList
   * @param effectDate1
   * @param effectDate2
   * @param status
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorOrgCode
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findAdjusNoList",
    sql =
        "SELECT ph.id ph_id,pch.id pch_id,seqno,pch.con_org_id,pch.con_org_code,pch.con_org_name,ph.price_cat_id,ph.price_cat_code,ph.price_cat_name,effect_date,ph.status,ph.creator_code,ph.creator_name,ph.created_at,ph.modifier_name,ph.last_modified_at,ph.remark,ph.note,ph.version FROM price_adjust_sal_head ph,price_catalog_sal_head pch WHERE ph.price_cat_id = pch.id and ph.deleted = 0 and pch.deleted = 0{{#seqno}} and seqno =:seqno{{/seqno}}{{#con_org_code_list_exists}} and pch.con_org_code in ({{#con_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/con_org_code_list}}){{/con_org_code_list_exists}}{{#price_cat_code_list_exists}} and ph.price_cat_code in ({{#price_cat_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/price_cat_code_list}}){{/price_cat_code_list_exists}}{{#effect_date1}} and ph.effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and effect_date<=:effect_date2{{/effect_date2}}{{#status}} and ph.status=:status{{/status}}{{#created_at1}} and ph.created_at>=:created_at1{{/created_at1}}{{#created_at2}} and ph.created_at<=:created_at2{{/created_at2}}{{#last_modified_at1}} and ph.last_modified_at>=:last_modified_at1{{/last_modified_at1}}{{#last_modified_at2}} and ph.last_modified_at <=:last_modified_at2{{/last_modified_at2}}{{#creator_org_code_exists}} and ph.creator_org_code in ({{#creator_org_code}}{{^-first}}, {{/-first}}\"{{this}}\"{{/creator_org_code}}){{/creator_org_code_exists}} "
  )
  Page<FindAdjusNoListDTO> findAdjusNoList(
      @Param("seqno") String seqno,
      @Param("con_org_code_list") List<String> conOrgCodeList,
      @Param("price_cat_code_list") List<String> priceCatCodeList,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("status") Integer status,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2,
      @Param("last_modified_at1") java.util.Date lastModifiedAt1,
      @Param("last_modified_at2") java.util.Date lastModifiedAt2,
      @Param("creator_org_code") List<String> creatorOrgCode,
      @Param("pageable") Pageable pageable);

  /**
   * 配送调价单列表
   *
   * @param seqno
   * @param conOrgCodeList
   * @param priceCatCodeList
   * @param effectDate1
   * @param effectDate2
   * @param status
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorOrgCode
   * @return
   */
  @SqlTemplate(
    name = "findAdjusNoList",
    sql =
        "SELECT ph.id ph_id,pch.id pch_id,seqno,pch.con_org_id,pch.con_org_code,pch.con_org_name,ph.price_cat_id,ph.price_cat_code,ph.price_cat_name,effect_date,ph.status,ph.creator_code,ph.creator_name,ph.created_at,ph.modifier_name,ph.last_modified_at,ph.remark,ph.note,ph.version FROM price_adjust_sal_head ph,price_catalog_sal_head pch WHERE ph.price_cat_id = pch.id and ph.deleted = 0 and pch.deleted = 0{{#seqno}} and seqno =:seqno{{/seqno}}{{#con_org_code_list_exists}} and pch.con_org_code in ({{#con_org_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/con_org_code_list}}){{/con_org_code_list_exists}}{{#price_cat_code_list_exists}} and ph.price_cat_code in ({{#price_cat_code_list}}{{^-first}}, {{/-first}}\"{{this}}\"{{/price_cat_code_list}}){{/price_cat_code_list_exists}}{{#effect_date1}} and ph.effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and effect_date<=:effect_date2{{/effect_date2}}{{#status}} and ph.status=:status{{/status}}{{#created_at1}} and ph.created_at>=:created_at1{{/created_at1}}{{#created_at2}} and ph.created_at<=:created_at2{{/created_at2}}{{#last_modified_at1}} and ph.last_modified_at>=:last_modified_at1{{/last_modified_at1}}{{#last_modified_at2}} and ph.last_modified_at <=:last_modified_at2{{/last_modified_at2}}{{#creator_org_code_exists}} and ph.creator_org_code in ({{#creator_org_code}}{{^-first}}, {{/-first}}\"{{this}}\"{{/creator_org_code}}){{/creator_org_code_exists}} "
  )
  List<FindAdjusNoListDTO> findAdjusNoList(
      @Param("seqno") String seqno,
      @Param("con_org_code_list") List<String> conOrgCodeList,
      @Param("price_cat_code_list") List<String> priceCatCodeList,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("status") Integer status,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2,
      @Param("last_modified_at1") java.util.Date lastModifiedAt1,
      @Param("last_modified_at2") java.util.Date lastModifiedAt2,
      @Param("creator_org_code") List<String> creatorOrgCode);

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
