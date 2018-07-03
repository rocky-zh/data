package com.pagoda.repo.purorder;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.purorder.*;
import com.pagoda.domain.purorder.*;
import com.pagoda.repo.purorder.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * PurOrderHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PurOrderHeadRepository
    extends PurOrderHeadRepositoryCustom, PagodaJpaRepository<PurOrderHead, Long> {

  /**
   * 采购单列表查询
   *
   * @param orderNo
   * @param venOrgCode
   * @param venOrgName
   * @param recOrgCode
   * @param recOrgName
   * @param arrOrgCode
   * @param arrOrgName
   * @param goodsCode
   * @param goodsName
   * @param creatorCode
   * @param creatorName
   * @param createdAt
   * @param planRecDate
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param orderStatus
   * @param seqno
   * @param aimOrgCode
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findHeadByParams",
    sql =
        "select h.* from pur_order_head h left join pur_order_detail d where 1=1 and h.deleted = d.eleted and h.deleted = 0 {{#orderNo}}AND h.seqno= :seqno{{/orderNo}} {{#venOrgCode}}AND h.venOrgCode= :venOrgCode{{/venOrgCode}} {{#venOrgName}}AND h.ven_orgName= :venOrgName{{/venOrgName}} {{#recOrgCode}}AND d.rec_org_code= :recOrgCode{{/recOrgCode}} {{#recOrgName}}AND d.rec_org_name= :recOrgName{{/recOrgName}} {{#arrOrgCode}}AND d.arr_org_code= :aimOrgCode{{/arrOrgCode}} {{#arrOrgName}}AND d.arr_org_name= :arrOrgName{{/arrOrgName}} {{#goodsCode}}AND d.goods_code= :goodsCode{{/goodsCode}} {{#goodsName}}AND d.goods_name= :goodsName{{/goodsName}} {{#creatorCode}}AND h.creator_code= :creatorCode{{/creatorCode}} {{#creatorName}}AND h.creator_name= :creatorName{{/creatorName}} {{#createdAt}}AND h.created_at= :createdAt{{/createdAt}} {{#planRecDate}}AND d.plan_rec_date= :planRecDate{{/planRecDate}} {{#auditorCode}}AND h.auditor_code= :auditorCode{{/auditorCode}} {{#auditorName}}AND h.auditor_name= :auditorName{{/auditorName}} {{#auditTime}}AND h.audit_time= :auditTime{{/auditTime}} {{#orderStatus}}AND h.order_status= :orderStatus{{/orderStatus}}"
  )
  Page<FindHeadByParamsDTO> findHeadByParams(
      @Param("orderNo") String orderNo,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("recOrgCode") String recOrgCode,
      @Param("recOrgName") String recOrgName,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("creatorCode") String creatorCode,
      @Param("creatorName") String creatorName,
      @Param("createdAt") String createdAt,
      @Param("planRecDate") String planRecDate,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") String auditTime,
      @Param("orderStatus") String orderStatus,
      @Param("seqno") String seqno,
      @Param("aimOrgCode") String aimOrgCode,
      @Param("pageable") Pageable pageable);

  /**
   * 采购单列表查询
   *
   * @param orderNo
   * @param venOrgCode
   * @param venOrgName
   * @param recOrgCode
   * @param recOrgName
   * @param arrOrgCode
   * @param arrOrgName
   * @param goodsCode
   * @param goodsName
   * @param creatorCode
   * @param creatorName
   * @param createdAt
   * @param planRecDate
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param orderStatus
   * @param seqno
   * @param aimOrgCode
   * @return
   */
  @SqlTemplate(
    name = "findHeadByParams",
    sql =
        "select h.* from pur_order_head h left join pur_order_detail d where 1=1 and h.deleted = d.eleted and h.deleted = 0 {{#orderNo}}AND h.seqno= :seqno{{/orderNo}} {{#venOrgCode}}AND h.venOrgCode= :venOrgCode{{/venOrgCode}} {{#venOrgName}}AND h.ven_orgName= :venOrgName{{/venOrgName}} {{#recOrgCode}}AND d.rec_org_code= :recOrgCode{{/recOrgCode}} {{#recOrgName}}AND d.rec_org_name= :recOrgName{{/recOrgName}} {{#arrOrgCode}}AND d.arr_org_code= :aimOrgCode{{/arrOrgCode}} {{#arrOrgName}}AND d.arr_org_name= :arrOrgName{{/arrOrgName}} {{#goodsCode}}AND d.goods_code= :goodsCode{{/goodsCode}} {{#goodsName}}AND d.goods_name= :goodsName{{/goodsName}} {{#creatorCode}}AND h.creator_code= :creatorCode{{/creatorCode}} {{#creatorName}}AND h.creator_name= :creatorName{{/creatorName}} {{#createdAt}}AND h.created_at= :createdAt{{/createdAt}} {{#planRecDate}}AND d.plan_rec_date= :planRecDate{{/planRecDate}} {{#auditorCode}}AND h.auditor_code= :auditorCode{{/auditorCode}} {{#auditorName}}AND h.auditor_name= :auditorName{{/auditorName}} {{#auditTime}}AND h.audit_time= :auditTime{{/auditTime}} {{#orderStatus}}AND h.order_status= :orderStatus{{/orderStatus}}"
  )
  List<FindHeadByParamsDTO> findHeadByParams(
      @Param("orderNo") String orderNo,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("recOrgCode") String recOrgCode,
      @Param("recOrgName") String recOrgName,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("creatorCode") String creatorCode,
      @Param("creatorName") String creatorName,
      @Param("createdAt") String createdAt,
      @Param("planRecDate") String planRecDate,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") String auditTime,
      @Param("orderStatus") String orderStatus,
      @Param("seqno") String seqno,
      @Param("aimOrgCode") String aimOrgCode);

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
