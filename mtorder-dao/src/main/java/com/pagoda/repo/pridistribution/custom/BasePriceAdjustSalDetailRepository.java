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
 * PriceAdjustSalDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BasePriceAdjustSalDetailRepository
    extends PriceAdjustSalDetailRepositoryCustom, PagodaJpaRepository<PriceAdjustSalDetail, Long> {

  /**
   * 查询配送退货价
   *
   * @param orgOrgCode
   * @param orgOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param priceCatCode
   * @param priceCatName
   * @param goodsCode
   * @param goodsName
   * @param seqno
   * @param effectDate1
   * @param effectDate2
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findSalPriceAndReturnPrice",
    sql =
        "SELECT MAX(ph.effect_date) effect_date,soc.id soc_id,ph.id ph_id,pd.id pd_id,soc.org_org_code,soc.org_org_id,soc.org_org_name,soc.cus_org_id,soc.cus_org_code,soc.cus_org_name,ph.price_cat_id,ph.price_cat_code,ph.price_cat_name,ph.seqno,ph.creator_code,ph.creator_name,ph.created_at,ph.modifier_code,ph.modifier_name,ph.last_modified_at,ph.remark,pd.goods_id,pd.goods_code,pd.goods_name,pd.goods_spec,pd.goods_class_name,pd.unit_id,pd.unit_code,pd.unit_name,pd.return_price,pd.sal_price FROM sal_org_cus soc,price_adjust_sal_head ph,price_adjust_sal_detail pd where soc.price_cat_id = ph.price_cat_id and ph.id = pd.adjust_id and ph.status = 50 and ph.deleted = 0 and pd.deleted = 0{{#org_org_code}} and soc.org_org_code=:org_org_code{{/org_org_code}}{{#org_org_name}} and soc.org_org_name like '%{{org_org_name}}%'{{/org_org_name}}{{#cus_org_code}} and soc.cus_org_code=:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and soc.cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#price_cat_code}} and ph.price_cat_code=:price_cat_code{{/price_cat_code}}{{#price_cat_name}} and ph.price_cat_name like '%{{price_cat_name}}%'{{/price_cat_name}}{{#goods_code}} and pd.goods_code=:goods_code{{/goods_code}}{{#goods_name}} and pd.goods_name like '%{{goods_name}}%'{{/goods_name}}{{#seqno}} and ph.seqno =:seqno{{/seqno}}{{#effect_date1}} and ph.effect_date>=:effect_date1{{/effect_date1}} {{#effect_date2}} and ph.effect_date<=:effect_date2{{/effect_date2}}{{#created_at1}} and ph.created_at>=:created_at1{{/created_at1}} {{#created_at2}} and ph.created_at<=:created_at2{{/created_at2}} {{#last_modified_at1}} and ph.last_modified_at>=:last_modified_at1{{/last_modified_at1}} {{#last_modified_at2}} and ph.last_modified_at <=:last_modified_at2 {{/last_modified_at2}}GROUP BY pd.goods_id,pd.unit_id"
  )
  Page<FindSalPriceAndReturnPriceDTO> findSalPriceAndReturnPrice(
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("price_cat_code") String priceCatCode,
      @Param("price_cat_name") String priceCatName,
      @Param("goods_code") String goodsCode,
      @Param("goods_name") String goodsName,
      @Param("seqno") String seqno,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2,
      @Param("last_modified_at1") java.util.Date lastModifiedAt1,
      @Param("last_modified_at2") java.util.Date lastModifiedAt2,
      @Param("pageable") Pageable pageable);

  /**
   * 查询配送退货价
   *
   * @param orgOrgCode
   * @param orgOrgName
   * @param cusOrgCode
   * @param cusOrgName
   * @param priceCatCode
   * @param priceCatName
   * @param goodsCode
   * @param goodsName
   * @param seqno
   * @param effectDate1
   * @param effectDate2
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @return
   */
  @SqlTemplate(
    name = "findSalPriceAndReturnPrice",
    sql =
        "SELECT MAX(ph.effect_date) effect_date,soc.id soc_id,ph.id ph_id,pd.id pd_id,soc.org_org_code,soc.org_org_id,soc.org_org_name,soc.cus_org_id,soc.cus_org_code,soc.cus_org_name,ph.price_cat_id,ph.price_cat_code,ph.price_cat_name,ph.seqno,ph.creator_code,ph.creator_name,ph.created_at,ph.modifier_code,ph.modifier_name,ph.last_modified_at,ph.remark,pd.goods_id,pd.goods_code,pd.goods_name,pd.goods_spec,pd.goods_class_name,pd.unit_id,pd.unit_code,pd.unit_name,pd.return_price,pd.sal_price FROM sal_org_cus soc,price_adjust_sal_head ph,price_adjust_sal_detail pd where soc.price_cat_id = ph.price_cat_id and ph.id = pd.adjust_id and ph.status = 50 and ph.deleted = 0 and pd.deleted = 0{{#org_org_code}} and soc.org_org_code=:org_org_code{{/org_org_code}}{{#org_org_name}} and soc.org_org_name like '%{{org_org_name}}%'{{/org_org_name}}{{#cus_org_code}} and soc.cus_org_code=:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and soc.cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#price_cat_code}} and ph.price_cat_code=:price_cat_code{{/price_cat_code}}{{#price_cat_name}} and ph.price_cat_name like '%{{price_cat_name}}%'{{/price_cat_name}}{{#goods_code}} and pd.goods_code=:goods_code{{/goods_code}}{{#goods_name}} and pd.goods_name like '%{{goods_name}}%'{{/goods_name}}{{#seqno}} and ph.seqno =:seqno{{/seqno}}{{#effect_date1}} and ph.effect_date>=:effect_date1{{/effect_date1}} {{#effect_date2}} and ph.effect_date<=:effect_date2{{/effect_date2}}{{#created_at1}} and ph.created_at>=:created_at1{{/created_at1}} {{#created_at2}} and ph.created_at<=:created_at2{{/created_at2}} {{#last_modified_at1}} and ph.last_modified_at>=:last_modified_at1{{/last_modified_at1}} {{#last_modified_at2}} and ph.last_modified_at <=:last_modified_at2 {{/last_modified_at2}}GROUP BY pd.goods_id,pd.unit_id"
  )
  List<FindSalPriceAndReturnPriceDTO> findSalPriceAndReturnPrice(
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("price_cat_code") String priceCatCode,
      @Param("price_cat_name") String priceCatName,
      @Param("goods_code") String goodsCode,
      @Param("goods_name") String goodsName,
      @Param("seqno") String seqno,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2,
      @Param("last_modified_at1") java.util.Date lastModifiedAt1,
      @Param("last_modified_at2") java.util.Date lastModifiedAt2);

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
