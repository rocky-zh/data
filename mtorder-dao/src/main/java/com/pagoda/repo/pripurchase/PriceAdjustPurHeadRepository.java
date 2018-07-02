package com.pagoda.repo.pripurchase;

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
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * PriceAdjustPurHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PriceAdjustPurHeadRepository
    extends PriceAdjustPurHeadRepositoryCustom, PagodaJpaRepository<PriceAdjustPurHead, Long> {

  /**
   * 查询调价单
   *
   * @param seqno
   * @param arrOrgName
   * @param venOrgCode
   * @param approveStatus
   * @param effectDate1
   * @param effectDate2
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param goodsName
   * @param goodsCode
   * @param creatorCode
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findPriceAdjustPurList",
    sql =
        "select seqno,arr_org_name,ven_org_code,ven_org_name,effect_date,status,h.creator_name creator_name,h.created_at created_at,h.modifier_name modifier_name,h.last_modified_at last_modified_at,h.remark remark,h.note note from price_adjust_pur_head h left join price_adjust_pur_detail d on h.id=d.adjust_id where {{#seqno}}h.seqno=:seqno{{/seqno}}{{#arr_org_name}} and h.arr_org_name=:arr_org_name{{/arr_org_name}}{{#ven_org_code}} and h.ven_org_code=:ven_org_code{{/ven_org_code}}{{#approve_status}} and h.status=:approve_status{{/approve_status}}{{#effect_date1}} and h.effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and h.effect_date <=:effect_date2{{/effect_date2}}{{#created_at1}} and h.created_at >= :created_at1 {{/created_at1}} {{#created_at2}} and h.created_at <= :created_at2 {{/created_at2}}{{#last_modified_at1}} and h.last_modified_at>=:last_modified_at1 {{/last_modified_at1}}{{#last_modified_at2}} and h.last_modified_at<=:last_modified_at2 {{/last_modified_at2}}{{#goods_name}} and d.goods_name like '%{{goods_name}}%'{{/goods_name}} {{#goods_code}} and d.goods_code=:goods_code{{/goods_code}}{{#creator_code}} and h.creator_code=:creator_code{{/creator_code}}"
  )
  Page<FindPriceAdjustPurListDTO> findPriceAdjustPurList(
      @Param("seqno") String seqno,
      @Param("arr_org_name") String arrOrgName,
      @Param("ven_org_code") String venOrgCode,
      @Param("approve_status") Integer approveStatus,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("created_at1") java.sql.Timestamp createdAt1,
      @Param("created_at2") java.sql.Timestamp createdAt2,
      @Param("last_modified_at1") java.sql.Timestamp lastModifiedAt1,
      @Param("last_modified_at2") java.sql.Timestamp lastModifiedAt2,
      @Param("goods_name") String goodsName,
      @Param("goods_code") String goodsCode,
      @Param("creator_code") String creatorCode,
      @Param("pageable") Pageable pageable);

  /**
   * 查询调价单
   *
   * @param seqno
   * @param arrOrgName
   * @param venOrgCode
   * @param approveStatus
   * @param effectDate1
   * @param effectDate2
   * @param createdAt1
   * @param createdAt2
   * @param lastModifiedAt1
   * @param lastModifiedAt2
   * @param goodsName
   * @param goodsCode
   * @param creatorCode
   * @return
   */
  @SqlTemplate(
    name = "findPriceAdjustPurList",
    sql =
        "select seqno,arr_org_name,ven_org_code,ven_org_name,effect_date,status,h.creator_name creator_name,h.created_at created_at,h.modifier_name modifier_name,h.last_modified_at last_modified_at,h.remark remark,h.note note from price_adjust_pur_head h left join price_adjust_pur_detail d on h.id=d.adjust_id where {{#seqno}}h.seqno=:seqno{{/seqno}}{{#arr_org_name}} and h.arr_org_name=:arr_org_name{{/arr_org_name}}{{#ven_org_code}} and h.ven_org_code=:ven_org_code{{/ven_org_code}}{{#approve_status}} and h.status=:approve_status{{/approve_status}}{{#effect_date1}} and h.effect_date>=:effect_date1{{/effect_date1}}{{#effect_date2}} and h.effect_date <=:effect_date2{{/effect_date2}}{{#created_at1}} and h.created_at >= :created_at1 {{/created_at1}} {{#created_at2}} and h.created_at <= :created_at2 {{/created_at2}}{{#last_modified_at1}} and h.last_modified_at>=:last_modified_at1 {{/last_modified_at1}}{{#last_modified_at2}} and h.last_modified_at<=:last_modified_at2 {{/last_modified_at2}}{{#goods_name}} and d.goods_name like '%{{goods_name}}%'{{/goods_name}} {{#goods_code}} and d.goods_code=:goods_code{{/goods_code}}{{#creator_code}} and h.creator_code=:creator_code{{/creator_code}}"
  )
  List<FindPriceAdjustPurListDTO> findPriceAdjustPurList(
      @Param("seqno") String seqno,
      @Param("arr_org_name") String arrOrgName,
      @Param("ven_org_code") String venOrgCode,
      @Param("approve_status") Integer approveStatus,
      @Param("effect_date1") java.util.Date effectDate1,
      @Param("effect_date2") java.util.Date effectDate2,
      @Param("created_at1") java.sql.Timestamp createdAt1,
      @Param("created_at2") java.sql.Timestamp createdAt2,
      @Param("last_modified_at1") java.sql.Timestamp lastModifiedAt1,
      @Param("last_modified_at2") java.sql.Timestamp lastModifiedAt2,
      @Param("goods_name") String goodsName,
      @Param("goods_code") String goodsCode,
      @Param("creator_code") String creatorCode);

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
