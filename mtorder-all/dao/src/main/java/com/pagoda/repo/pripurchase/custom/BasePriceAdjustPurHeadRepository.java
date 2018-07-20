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
 * PriceAdjustPurHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BasePriceAdjustPurHeadRepository
    extends PriceAdjustPurHeadRepositoryCustom, PagodaJpaRepository<PriceAdjustPurHead, Long> {

  /**
   * 查询调价单
   *
   * @param seqno
   * @param orgIdList
   * @param venIdList
   * @param goodsIdList
   * @param approveStatus
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
    name = "findPriceAdjustPurList",
    sql =
        " select h.id,seqno,arr_org_name,ven_org_code,ven_org_name,effect_date,status,h.creator_name creator_name,h.created_at created_at,h.modifier_name modifier_name,h.last_modified_at last_modified_at,h.remark remark,h.note note from price_adjust_pur_head h left join price_adjust_pur_detail d on h.id=d.adjust_id where h.deleted=0{{#seqno}} and h.seqno=:seqno{{/seqno}}{{#orgIdList_exists}} and h.arr_org_id in ({{#orgIdList}}{{^-first}}, {{/-first}}{{this}}{{/orgIdList}}){{/orgIdList_exists}}{{#venIdList_exists}} and h.ven_org_id in ({{#venIdList}}{{^-first}}, {{/-first}}{{this}}{{/venIdList}}){{/venIdList_exists}}{{#goodsIdList_exists}} and d.goods_id in ({{#goodsIdList}}{{^-first}}, {{/-first}}{{this}}{{/goodsIdList}}){{/goodsIdList_exists}}{{#approve_status}} and h.status=:approve_status{{/approve_status}}{{#effect_date1}} and h.effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and h.effect_date <=:effect_date2{{/effect_date2}}{{#created_at1}} and h.created_at >= :created_at1 {{/created_at1}} {{#created_at2}} and h.created_at <= :created_at2 {{/created_at2}}{{#last_modified_at1}} and h.last_modified_at>=:last_modified_at1 {{/last_modified_at1}}{{#last_modified_at2}} and h.last_modified_at<=:last_modified_at2 {{/last_modified_at2}}{{#creator_code}} and h.creator_code=:creator_code{{/creator_code}}{{#ent_id}} and h.ent_id=:ent_id{{/ent_id}} group by h.id"
  )
  Page<FindPriceAdjustPurListDTO> findPriceAdjustPurList(
      @Param("seqno") String seqno,
      @Param("orgIdList") List<Long> orgIdList,
      @Param("venIdList") List<Long> venIdList,
      @Param("goodsIdList") List<Long> goodsIdList,
      @Param("approve_status") Integer approveStatus,
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
   * 查询调价单
   *
   * @param seqno
   * @param orgIdList
   * @param venIdList
   * @param goodsIdList
   * @param approveStatus
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
    name = "findPriceAdjustPurList",
    sql =
        " select h.id,seqno,arr_org_name,ven_org_code,ven_org_name,effect_date,status,h.creator_name creator_name,h.created_at created_at,h.modifier_name modifier_name,h.last_modified_at last_modified_at,h.remark remark,h.note note from price_adjust_pur_head h left join price_adjust_pur_detail d on h.id=d.adjust_id where h.deleted=0{{#seqno}} and h.seqno=:seqno{{/seqno}}{{#orgIdList_exists}} and h.arr_org_id in ({{#orgIdList}}{{^-first}}, {{/-first}}{{this}}{{/orgIdList}}){{/orgIdList_exists}}{{#venIdList_exists}} and h.ven_org_id in ({{#venIdList}}{{^-first}}, {{/-first}}{{this}}{{/venIdList}}){{/venIdList_exists}}{{#goodsIdList_exists}} and d.goods_id in ({{#goodsIdList}}{{^-first}}, {{/-first}}{{this}}{{/goodsIdList}}){{/goodsIdList_exists}}{{#approve_status}} and h.status=:approve_status{{/approve_status}}{{#effect_date1}} and h.effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and h.effect_date <=:effect_date2{{/effect_date2}}{{#created_at1}} and h.created_at >= :created_at1 {{/created_at1}} {{#created_at2}} and h.created_at <= :created_at2 {{/created_at2}}{{#last_modified_at1}} and h.last_modified_at>=:last_modified_at1 {{/last_modified_at1}}{{#last_modified_at2}} and h.last_modified_at<=:last_modified_at2 {{/last_modified_at2}}{{#creator_code}} and h.creator_code=:creator_code{{/creator_code}}{{#ent_id}} and h.ent_id=:ent_id{{/ent_id}} group by h.id"
  )
  List<FindPriceAdjustPurListDTO> findPriceAdjustPurList(
      @Param("seqno") String seqno,
      @Param("orgIdList") List<Long> orgIdList,
      @Param("venIdList") List<Long> venIdList,
      @Param("goodsIdList") List<Long> goodsIdList,
      @Param("approve_status") Integer approveStatus,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2,
      @Param("last_modified_at1") java.util.Date lastModifiedAt1,
      @Param("last_modified_at2") java.util.Date lastModifiedAt2,
      @Param("creator_code") String creatorCode,
      @Param("ent_id") Long entId);

  /**
   * 查询录入完成的调价单
   *
   * @param seqno
   * @param arrOrgId
   * @param venOrgId
   * @param goodsId
   * @param approveStatus
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
    name = "findFinishedList",
    sql =
        "select h.id,seqno,arr_org_name,arr_org_code,ven_org_code,ven_org_name,effect_date,status,h.creator_name creator_name,h.created_at created_at,h.modifier_name modifier_name,h.last_modified_at last_modified_at,h.remark remark,h.note note from price_adjust_pur_head h left join price_adjust_pur_detail d on h.id=d.adjust_id where h.status!='10' and h.deleted=0{{#seqno}} and h.seqno=:seqno{{/seqno}}{{#arr_org_id_exists}} and h.arr_org_id in ({{#arr_org_id}}{{^-first}}, {{/-first}}{{this}}{{/arr_org_id}}){{/arr_org_id_exists}}{{#ven_org_id_exists}} and h.ven_org_id in ({{#ven_org_id}}{{^-first}}, {{/-first}}{{this}}{{/ven_org_id}}){{/ven_org_id_exists}}{{#goods_id_exists}} and d.goods_id in ({{#goods_id}}{{^-first}}, {{/-first}}{{this}}{{/goods_id}}){{/goods_id_exists}}{{#approve_status}} and h.status=:approve_status{{/approve_status}}{{#effect_date1}} and h.effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and h.effect_date <=:effect_date2{{/effect_date2}}{{#created_at1}} and h.created_at >= :created_at1 {{/created_at1}} {{#created_at2}} and h.created_at <= :created_at2 {{/created_at2}}{{#last_modified_at1}} and h.last_modified_at>=:last_modified_at1 {{/last_modified_at1}}{{#last_modified_at2}} and h.last_modified_at<=:last_modified_at2 {{/last_modified_at2}}{{#creator_code}} and h.creator_code=:creator_code{{/creator_code}}{{#ent_id}} and h.ent_id=:ent_id{{/ent_id}} group by h.id"
  )
  Page<FindFinishedListDTO> findFinishedList(
      @Param("seqno") String seqno,
      @Param("arr_org_id") List<Long> arrOrgId,
      @Param("ven_org_id") List<Long> venOrgId,
      @Param("goods_id") List<Long> goodsId,
      @Param("approve_status") Integer approveStatus,
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
   * 查询录入完成的调价单
   *
   * @param seqno
   * @param arrOrgId
   * @param venOrgId
   * @param goodsId
   * @param approveStatus
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
    name = "findFinishedList",
    sql =
        "select h.id,seqno,arr_org_name,arr_org_code,ven_org_code,ven_org_name,effect_date,status,h.creator_name creator_name,h.created_at created_at,h.modifier_name modifier_name,h.last_modified_at last_modified_at,h.remark remark,h.note note from price_adjust_pur_head h left join price_adjust_pur_detail d on h.id=d.adjust_id where h.status!='10' and h.deleted=0{{#seqno}} and h.seqno=:seqno{{/seqno}}{{#arr_org_id_exists}} and h.arr_org_id in ({{#arr_org_id}}{{^-first}}, {{/-first}}{{this}}{{/arr_org_id}}){{/arr_org_id_exists}}{{#ven_org_id_exists}} and h.ven_org_id in ({{#ven_org_id}}{{^-first}}, {{/-first}}{{this}}{{/ven_org_id}}){{/ven_org_id_exists}}{{#goods_id_exists}} and d.goods_id in ({{#goods_id}}{{^-first}}, {{/-first}}{{this}}{{/goods_id}}){{/goods_id_exists}}{{#approve_status}} and h.status=:approve_status{{/approve_status}}{{#effect_date1}} and h.effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and h.effect_date <=:effect_date2{{/effect_date2}}{{#created_at1}} and h.created_at >= :created_at1 {{/created_at1}} {{#created_at2}} and h.created_at <= :created_at2 {{/created_at2}}{{#last_modified_at1}} and h.last_modified_at>=:last_modified_at1 {{/last_modified_at1}}{{#last_modified_at2}} and h.last_modified_at<=:last_modified_at2 {{/last_modified_at2}}{{#creator_code}} and h.creator_code=:creator_code{{/creator_code}}{{#ent_id}} and h.ent_id=:ent_id{{/ent_id}} group by h.id"
  )
  List<FindFinishedListDTO> findFinishedList(
      @Param("seqno") String seqno,
      @Param("arr_org_id") List<Long> arrOrgId,
      @Param("ven_org_id") List<Long> venOrgId,
      @Param("goods_id") List<Long> goodsId,
      @Param("approve_status") Integer approveStatus,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2,
      @Param("last_modified_at1") java.util.Date lastModifiedAt1,
      @Param("last_modified_at2") java.util.Date lastModifiedAt2,
      @Param("creator_code") String creatorCode,
      @Param("ent_id") Long entId);

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
