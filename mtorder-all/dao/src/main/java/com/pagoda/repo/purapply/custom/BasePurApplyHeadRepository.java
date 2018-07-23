package com.pagoda.repo.purapply.custom;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.purapply.*;
import com.pagoda.domain.purapply.*;
import com.pagoda.repo.purapply.custom.*;

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
 * PurApplyHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BasePurApplyHeadRepository
    extends PurApplyHeadRepositoryCustom, PagodaJpaRepository<PurApplyHead, Long> {

  /**
   * 采购请购单单头条件查询
   *
   * @param seqno
   * @param recOrgId
   * @param goodsId
   * @param creatorCode
   * @param applyStatus
   * @param auditorCode
   * @param createDateTimeBegin
   * @param createDateTimeEnd
   * @param updateDateTimeBegin
   * @param updateDateTimeEnd
   * @param planRecDateBegin
   * @param planRecDateEnd
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "queryPurApplyByCondition",
    sql =
        "select distinct h.* from pur_apply_head h left join pur_apply_detail d on h.id = d.apply_id where {{#seqno}}h.seqno = :seqno and {{/seqno}} {{#recOrgId}}h.apply_org_id = :recOrgId and {{/recOrgId}} {{#goodsId}}d.goods_id = :goodsId and {{/goodsId}} {{#creatorCode}}h.creator_code = :creatorCode and {{/creatorCode}} {{#applyStatus}}h.apply_status = :applyStatus and {{/applyStatus}} {{#auditorCode}}h.auditor_code = :auditorCode and {{/auditorCode}} {{#createDateTimeBegin}}h.created_at between :createDateTimeBegin and {{/createDateTimeBegin}} {{#createDateTimeEnd}}:createDateTimeEnd and {{/createDateTimeEnd}}  {{#updateDateTimeBegin}}h.last_modified_at between :updateDateTimeBegin and {{/updateDateTimeBegin}} {{#updateDateTimeEnd}}:updateDateTimeEnd and {{/updateDateTimeEnd}}  {{#planRecDateBegin}}d.plan_rec_date between :planRecDateBegin and {{/planRecDateBegin}} {{#planRecDateEnd}}:planRecDateEnd and {{/planRecDateEnd}} h.deleted = 0;"
  )
  Page<QueryPurApplyByConditionDTO> queryPurApplyByCondition(
      @Param("seqno") String seqno,
      @Param("recOrgId") String recOrgId,
      @Param("goodsId") String goodsId,
      @Param("creatorCode") String creatorCode,
      @Param("applyStatus") String applyStatus,
      @Param("auditorCode") String auditorCode,
      @Param("createDateTimeBegin") String createDateTimeBegin,
      @Param("createDateTimeEnd") String createDateTimeEnd,
      @Param("updateDateTimeBegin") String updateDateTimeBegin,
      @Param("updateDateTimeEnd") String updateDateTimeEnd,
      @Param("planRecDateBegin") String planRecDateBegin,
      @Param("planRecDateEnd") String planRecDateEnd,
      @Param("pageable") Pageable pageable);

  /**
   * 采购请购单单头条件查询
   *
   * @param seqno
   * @param recOrgId
   * @param goodsId
   * @param creatorCode
   * @param applyStatus
   * @param auditorCode
   * @param createDateTimeBegin
   * @param createDateTimeEnd
   * @param updateDateTimeBegin
   * @param updateDateTimeEnd
   * @param planRecDateBegin
   * @param planRecDateEnd
   * @return
   */
  @SqlTemplate(
    name = "queryPurApplyByCondition",
    sql =
        "select distinct h.* from pur_apply_head h left join pur_apply_detail d on h.id = d.apply_id where {{#seqno}}h.seqno = :seqno and {{/seqno}} {{#recOrgId}}h.apply_org_id = :recOrgId and {{/recOrgId}} {{#goodsId}}d.goods_id = :goodsId and {{/goodsId}} {{#creatorCode}}h.creator_code = :creatorCode and {{/creatorCode}} {{#applyStatus}}h.apply_status = :applyStatus and {{/applyStatus}} {{#auditorCode}}h.auditor_code = :auditorCode and {{/auditorCode}} {{#createDateTimeBegin}}h.created_at between :createDateTimeBegin and {{/createDateTimeBegin}} {{#createDateTimeEnd}}:createDateTimeEnd and {{/createDateTimeEnd}}  {{#updateDateTimeBegin}}h.last_modified_at between :updateDateTimeBegin and {{/updateDateTimeBegin}} {{#updateDateTimeEnd}}:updateDateTimeEnd and {{/updateDateTimeEnd}}  {{#planRecDateBegin}}d.plan_rec_date between :planRecDateBegin and {{/planRecDateBegin}} {{#planRecDateEnd}}:planRecDateEnd and {{/planRecDateEnd}} h.deleted = 0;"
  )
  List<QueryPurApplyByConditionDTO> queryPurApplyByCondition(
      @Param("seqno") String seqno,
      @Param("recOrgId") String recOrgId,
      @Param("goodsId") String goodsId,
      @Param("creatorCode") String creatorCode,
      @Param("applyStatus") String applyStatus,
      @Param("auditorCode") String auditorCode,
      @Param("createDateTimeBegin") String createDateTimeBegin,
      @Param("createDateTimeEnd") String createDateTimeEnd,
      @Param("updateDateTimeBegin") String updateDateTimeBegin,
      @Param("updateDateTimeEnd") String updateDateTimeEnd,
      @Param("planRecDateBegin") String planRecDateBegin,
      @Param("planRecDateEnd") String planRecDateEnd);

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
