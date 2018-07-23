package com.pagoda.repo.pripurchase.custom;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.pripurchase.*;
import com.pagoda.domain.pripurchase.*;
import com.pagoda.repo.pripurchase.custom.*;

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
 * PriceAdjustPurDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BasePriceAdjustPurDetailRepository
    extends PriceAdjustPurDetailRepositoryCustom, PagodaJpaRepository<PriceAdjustPurDetail, Long> {

  /**
   * 商品最新调价单查询
   *
   * @param seqno
   * @param arrOrgId
   * @param venOrgId
   * @param goodsId
   * @param effectDate1
   * @param effectDate2
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorCode
   * @param entId
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findGoodsLastPriceAdjust",
    sql =
        "select h.seqno,arr_org_name,ven_org_code,ven_org_name,max(h.effect_date) effect_date,goods_id,goods_code,goods_name,goods_spec,goods_class_name,unit_name,pur_price,d.id,d.creator_name,d.created_at,h.auditor_name,h.audit_time,d.remark,h.note  from price_adjust_pur_head h,price_adjust_pur_detail d where h.id=d.adjust_id and status=40 and h.deleted=0{{#seqno}} and h.seqno=:seqno{{/seqno}}{{#arr_org_id_exists}} and h.arr_org_id in ({{#arr_org_id}}{{^-first}}, {{/-first}}{{this}}{{/arr_org_id}}){{/arr_org_id_exists}}{{#ven_org_id_exists}} and h.ven_org_id in ({{#ven_org_id}}{{^-first}}, {{/-first}}{{this}}{{/ven_org_id}}){{/ven_org_id_exists}}{{#goods_id_exists}} and d.goods_id in ({{#goods_id}}{{^-first}}, {{/-first}}{{this}}{{/goods_id}}){{/goods_id_exists}}{{#effect_date1}} and effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and effect_date<=:effect_date2{{/effect_date2}}{{#created_at1}} and d.created_at>=:created_at1{{/created_at1}}{{#created_at2}} and d.created_at<=:created_at2{{/created_at2}}{{#last_modified_at1}} and d.last_modified_at>=:last_modified_at1{{/last_modified_at1}}{{#last_modified_at2}} and d.last_modified_at<=:last_modified_at2{{/last_modified_at2}}{{#creator_code}} and creator_code=:creator_code{{/creator_code}}{{#ent_id}} and h.ent_id=:ent_id{{/ent_id}} group by d.goods_id"
  )
  Page<FindGoodsLastPriceAdjustDTO> findGoodsLastPriceAdjust(
      @Param("seqno") String seqno,
      @Param("arr_org_id") List<Long> arrOrgId,
      @Param("ven_org_id") List<Long> venOrgId,
      @Param("goods_id") List<Long> goodsId,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2,
      @Param("last_modified_at1") java.util.Date lastModifiedAt1,
      @Param("last_modified_at2") java.util.Date lastModifiedAt2,
      @Param("creator_code") String creatorCode,
      @Param("ent_id") Long entId,
      @Param("pageable") Pageable pageable);

  /**
   * 商品最新调价单查询
   *
   * @param seqno
   * @param arrOrgId
   * @param venOrgId
   * @param goodsId
   * @param effectDate1
   * @param effectDate2
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param creatorCode
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "findGoodsLastPriceAdjust",
    sql =
        "select h.seqno,arr_org_name,ven_org_code,ven_org_name,max(h.effect_date) effect_date,goods_id,goods_code,goods_name,goods_spec,goods_class_name,unit_name,pur_price,d.id,d.creator_name,d.created_at,h.auditor_name,h.audit_time,d.remark,h.note  from price_adjust_pur_head h,price_adjust_pur_detail d where h.id=d.adjust_id and status=40 and h.deleted=0{{#seqno}} and h.seqno=:seqno{{/seqno}}{{#arr_org_id_exists}} and h.arr_org_id in ({{#arr_org_id}}{{^-first}}, {{/-first}}{{this}}{{/arr_org_id}}){{/arr_org_id_exists}}{{#ven_org_id_exists}} and h.ven_org_id in ({{#ven_org_id}}{{^-first}}, {{/-first}}{{this}}{{/ven_org_id}}){{/ven_org_id_exists}}{{#goods_id_exists}} and d.goods_id in ({{#goods_id}}{{^-first}}, {{/-first}}{{this}}{{/goods_id}}){{/goods_id_exists}}{{#effect_date1}} and effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and effect_date<=:effect_date2{{/effect_date2}}{{#created_at1}} and d.created_at>=:created_at1{{/created_at1}}{{#created_at2}} and d.created_at<=:created_at2{{/created_at2}}{{#last_modified_at1}} and d.last_modified_at>=:last_modified_at1{{/last_modified_at1}}{{#last_modified_at2}} and d.last_modified_at<=:last_modified_at2{{/last_modified_at2}}{{#creator_code}} and creator_code=:creator_code{{/creator_code}}{{#ent_id}} and h.ent_id=:ent_id{{/ent_id}} group by d.goods_id"
  )
  List<FindGoodsLastPriceAdjustDTO> findGoodsLastPriceAdjust(
      @Param("seqno") String seqno,
      @Param("arr_org_id") List<Long> arrOrgId,
      @Param("ven_org_id") List<Long> venOrgId,
      @Param("goods_id") List<Long> goodsId,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2,
      @Param("last_modified_at1") java.util.Date lastModifiedAt1,
      @Param("last_modified_at2") java.util.Date lastModifiedAt2,
      @Param("creator_code") String creatorCode,
      @Param("ent_id") Long entId);

  /**
   * @param goodsId
   * @param venOrgName
   * @param arrOrgName
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findGoodsHistoryPrice",
    sql =
        "SELECT d.id,pur_price,unit_rate,unit_name,effect_date,seqno,h.creator_name,h.created_at,h.modifier_name,h.last_modified_at,d.remark FROM price_adjust_pur_detail d LEFT JOIN price_adjust_pur_head h ON d.adjust_id=h.id  WHERE STATUS=40 AND h.deleted=0 AND d.deleted=0 AND goods_id=:goods_id AND ven_org_name=:ven_org_name AND arr_org_name=:arr_org_name"
  )
  Page<FindGoodsHistoryPriceDTO> findGoodsHistoryPrice(
      @Param("goods_id") Long goodsId,
      @Param("ven_org_name") String venOrgName,
      @Param("arr_org_name") String arrOrgName,
      @Param("pageable") Pageable pageable);

  /**
   * @param goodsId
   * @param venOrgName
   * @param arrOrgName
   * @return
   */
  @SqlTemplate(
    name = "findGoodsHistoryPrice",
    sql =
        "SELECT d.id,pur_price,unit_rate,unit_name,effect_date,seqno,h.creator_name,h.created_at,h.modifier_name,h.last_modified_at,d.remark FROM price_adjust_pur_detail d LEFT JOIN price_adjust_pur_head h ON d.adjust_id=h.id  WHERE STATUS=40 AND h.deleted=0 AND d.deleted=0 AND goods_id=:goods_id AND ven_org_name=:ven_org_name AND arr_org_name=:arr_org_name"
  )
  List<FindGoodsHistoryPriceDTO> findGoodsHistoryPrice(
      @Param("goods_id") Long goodsId,
      @Param("ven_org_name") String venOrgName,
      @Param("arr_org_name") String arrOrgName);

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
