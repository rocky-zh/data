package com.pagoda.repo.purorgven.custom;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.purorgven.*;
import com.pagoda.domain.purorgven.*;
import com.pagoda.repo.purorgven.custom.*;

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
 * BasVenRebateGoodsDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BaseBasVenRebateGoodsDetailRepository
    extends BasVenRebateGoodsDetailRepositoryCustom,
        PagodaJpaRepository<BasVenRebateGoodsDetail, Long> {

  /**
   * 查询已授权的供应商机构返利商品明细
   *
   * @param goodsClassId
   * @param goodsName
   * @param goodsCode
   * @param status
   * @param entId
   * @param deleted
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectVenRebateGoodsDetailAuthored",
    sql =
        "select id,rebate_id,rebate_no,ent_id,goods_id,goods_code,goods_name,goods_spec,goods_class_id,goods_class_code,goods_class_name,unit_id,unit_code,unit_name,effect_date,expiry_date,status,version,remark,deleted from bas_ven_rebate_goods_detail where {{#goods_class_id}}goods_class_id=:goods_class_id and {{/goods_class_id}} {{#goods_name}}goods_name like '{{goods_name}}%' and {{/goods_name}} {{#goods_code}}goods_code like '{{goods_code}}%' and {{/goods_code}} {{#status}}status=:status and {{/status}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1 "
  )
  Page<BasVenRebateGoodsDetailDTO> selectVenRebateGoodsDetailAuthored(
      @Param("goods_class_id") Long goodsClassId,
      @Param("goods_name") String goodsName,
      @Param("goods_code") String goodsCode,
      @Param("status") Integer status,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("pageable") Pageable pageable);

  /**
   * 查询已授权的供应商机构返利商品明细
   *
   * @param goodsClassId
   * @param goodsName
   * @param goodsCode
   * @param status
   * @param entId
   * @param deleted
   * @return
   */
  @SqlTemplate(
    name = "selectVenRebateGoodsDetailAuthored",
    sql =
        "select id,rebate_id,rebate_no,ent_id,goods_id,goods_code,goods_name,goods_spec,goods_class_id,goods_class_code,goods_class_name,unit_id,unit_code,unit_name,effect_date,expiry_date,status,version,remark,deleted from bas_ven_rebate_goods_detail where {{#goods_class_id}}goods_class_id=:goods_class_id and {{/goods_class_id}} {{#goods_name}}goods_name like '{{goods_name}}%' and {{/goods_name}} {{#goods_code}}goods_code like '{{goods_code}}%' and {{/goods_code}} {{#status}}status=:status and {{/status}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#deleted}}deleted=:deleted and {{/deleted}} 1=1 "
  )
  List<BasVenRebateGoodsDetailDTO> selectVenRebateGoodsDetailAuthored(
      @Param("goods_class_id") Long goodsClassId,
      @Param("goods_name") String goodsName,
      @Param("goods_code") String goodsCode,
      @Param("status") Integer status,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted);

  /**
   * 通过协议号id更新商品明细状态
   *
   * @param status
   * @param rebateId
   * @return
   */
  @SqlTemplate(
    name = "updateGoodsDetailStatusByRebateId",
    sql = "update bas_ven_rebate_goods_detail set status=:status where rebate_id=:rebate_id"
  )
  @Modifying
  Integer updateGoodsDetailStatusByRebateId(
      @Param("status") Integer status, @Param("rebate_id") Long rebateId);

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
