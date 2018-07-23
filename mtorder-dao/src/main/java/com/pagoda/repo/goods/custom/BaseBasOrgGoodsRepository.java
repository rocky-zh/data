package com.pagoda.repo.goods.custom;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
import com.pagoda.repo.goods.custom.*;

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
 * BasOrgGoods 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BaseBasOrgGoodsRepository
    extends BasOrgGoodsRepositoryCustom, PagodaJpaRepository<BasOrgGoods, Long> {

  /**
   * 机构商品的批量授权
   *
   * @param orgId
   * @param orgCode
   * @param orgName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param entId
   * @param deleted
   * @param goodsIdList
   * @param orgIdList
   * @param isPur
   * @param isSale
   * @param isRet
   * @param isEnabled
   * @param isReturn
   * @param isTrans
   * @param taxRate
   * @param isStockInv
   * @return
   */
  @SqlTemplate(
    name = "basOrgGoodsBatchImpower",
    sql =
        "update bas_org_goods set is_pur=:is_pur,is_sale=:is_sale, is_ret=:is_ret, is_enabled=:is_enabled,  is_return=:is_return, is_trans=:is_trans, tax_rate=:tax_rate, is_stock_inv=:is_stock_inv where {{#org_id}}org_id=:org_id AND {{/org_id}} {{#org_code}}org_code=:org_code AND {{/org_code}} {{#org_name}}org_name=:org_name AND {{/org_name}} {{#goods_id}}goods_id=:goods_id AND {{/goods_id}} {{#goods_code}}goods_code=:goods_code AND {{/goods_code}} {{#goods_name}}goods_name=:goods_name AND {{/goods_name}} {{#ent_id}}ent_id=:ent_id AND {{/ent_id}} {{#deleted}}deleted=:deleted AND {{/deleted}} {{#goods_id_list}}goods_id in ({{^-first}}, {{/-first}}{{this}}) AND {{/goods_id_list}} {{#org_id_list}}org_id in ({{^-first}}, {{/-first}}{{this}}) AND {{/org_id_list}} 1=1"
  )
  @Modifying
  Integer basOrgGoodsBatchImpower(
      @Param("org_id") Long orgId,
      @Param("org_code") String orgCode,
      @Param("org_name") String orgName,
      @Param("goods_id") Long goodsId,
      @Param("goods_code") String goodsCode,
      @Param("goods_name") String goodsName,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("goods_id_list") List<Long> goodsIdList,
      @Param("org_id_list") List<Long> orgIdList,
      @Param("is_pur") Integer isPur,
      @Param("is_sale") Integer isSale,
      @Param("is_ret") Integer isRet,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_return") Integer isReturn,
      @Param("is_trans") Integer isTrans,
      @Param("tax_rate") java.math.BigDecimal taxRate,
      @Param("is_stock_inv") Integer isStockInv);

  /**
   * 机构商品管理的查询
   *
   * @param orgIdList
   * @param goodsIdList
   * @param goodsCodeList
   * @param goodsName
   * @param isSale
   * @param isReturn
   * @param isTrans
   * @param isStockInv
   * @param isRet
   * @param isEnabled
   * @param isPur
   * @param batchPolicy
   * @param createdAt1
   * @param createdAt2
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findBasOrgGoodsOnManager",
    sql =
        "select id,org_id,org_code,org_name,goods_id,goods_code,goods_name,ent_id,is_org_lot,tax_rate,is_enabled,is_pur,pur_ret_out_depot_code,pur_ret_out_depot_name,pur_ret_out_depot_id,pur_rec_in_depot_id,pur_rec_in_depot_code,pur_rec_in_depot_name,sal_con_in_depot_id,sal_con_in_depot_code,sal_con_in_depot_name,sal_con_out_depot_id,sal_con_out_depot_code,sal_con_out_depot_name,sal_ret_in_depot_id,sal_ret_in_depot_code,sal_ret_in_depot_name,sal_ret_out_depot_id,sal_ret_out_depot_code,sal_ret_out_depot_name,is_data_detail,batch_qty,batch_policy,is_sale,is_return,is_trans,con_cycle,is_stock_inv,is_ret,is_must_ret,pur_exc_ratio,is_def_depot,deleted,creator_code,creator_name,created_at,creator_org_code,modifier_code,modifier_name,last_modified_at,modifier_org_code,concat(org_id,',',goods_id) as org_goods_key from bas_org_goods where {{#org_id_list}}org_id in ({{^-first}}, {{/-first}}{{this}}) AND {{/org_id_list}} {{#goods_id_list}}goods_id in ({{^-first}}, {{/-first}}{{this}}) AND {{/goods_id_list}} {{#goods_code_list}}goods_code in ({{^-first}}, {{/-first}}{{this}}) AND {{/goods_code_list}} {{#goods_name}}goods_name=:goods_name AND {{/goods_name}} {{#is_sale}}is_sale=:is_sale AND {{/is_sale}} {{#is_return}}is_return=:is_return AND {{/is_return}} {{#is_trans}}is_trans=:is_trans AND {{/is_trans}} {{#is_stock_inv}}is_stock_inv=:is_stock_inv AND {{/is_stock_inv}} {{#is_ret}}is_ret=:is_ret AND {{/is_ret}} {{#is_enabled}}is_enabled=:is_enabled AND {{/is_enabled}} {{#is_pur}}is_pur=:is_pur AND {{/is_pur}} {{#batch_policy}}batch_policy=:batch_policy AND {{/batch_policy}} {{#created_at1}} created_at>=:created_at1 AND {{/created_at1}} {{#created_at2}} created_at<=:created_at2 AND {{/created_at2}} 1=1"
  )
  Page<FindBasOrgGoodsOnManagerDTO> findBasOrgGoodsOnManager(
      @Param("org_id_list") String orgIdList,
      @Param("goods_id_list") String goodsIdList,
      @Param("goods_code_list") String goodsCodeList,
      @Param("goods_name") String goodsName,
      @Param("is_sale") Integer isSale,
      @Param("is_return") Integer isReturn,
      @Param("is_trans") Integer isTrans,
      @Param("is_stock_inv") Integer isStockInv,
      @Param("is_ret") Integer isRet,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_pur") Integer isPur,
      @Param("batch_policy") Integer batchPolicy,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2,
      @Param("pageable") Pageable pageable);

  /**
   * 机构商品管理的查询
   *
   * @param orgIdList
   * @param goodsIdList
   * @param goodsCodeList
   * @param goodsName
   * @param isSale
   * @param isReturn
   * @param isTrans
   * @param isStockInv
   * @param isRet
   * @param isEnabled
   * @param isPur
   * @param batchPolicy
   * @param createdAt1
   * @param createdAt2
   * @return
   */
  @SqlTemplate(
    name = "findBasOrgGoodsOnManager",
    sql =
        "select id,org_id,org_code,org_name,goods_id,goods_code,goods_name,ent_id,is_org_lot,tax_rate,is_enabled,is_pur,pur_ret_out_depot_code,pur_ret_out_depot_name,pur_ret_out_depot_id,pur_rec_in_depot_id,pur_rec_in_depot_code,pur_rec_in_depot_name,sal_con_in_depot_id,sal_con_in_depot_code,sal_con_in_depot_name,sal_con_out_depot_id,sal_con_out_depot_code,sal_con_out_depot_name,sal_ret_in_depot_id,sal_ret_in_depot_code,sal_ret_in_depot_name,sal_ret_out_depot_id,sal_ret_out_depot_code,sal_ret_out_depot_name,is_data_detail,batch_qty,batch_policy,is_sale,is_return,is_trans,con_cycle,is_stock_inv,is_ret,is_must_ret,pur_exc_ratio,is_def_depot,deleted,creator_code,creator_name,created_at,creator_org_code,modifier_code,modifier_name,last_modified_at,modifier_org_code,concat(org_id,',',goods_id) as org_goods_key from bas_org_goods where {{#org_id_list}}org_id in ({{^-first}}, {{/-first}}{{this}}) AND {{/org_id_list}} {{#goods_id_list}}goods_id in ({{^-first}}, {{/-first}}{{this}}) AND {{/goods_id_list}} {{#goods_code_list}}goods_code in ({{^-first}}, {{/-first}}{{this}}) AND {{/goods_code_list}} {{#goods_name}}goods_name=:goods_name AND {{/goods_name}} {{#is_sale}}is_sale=:is_sale AND {{/is_sale}} {{#is_return}}is_return=:is_return AND {{/is_return}} {{#is_trans}}is_trans=:is_trans AND {{/is_trans}} {{#is_stock_inv}}is_stock_inv=:is_stock_inv AND {{/is_stock_inv}} {{#is_ret}}is_ret=:is_ret AND {{/is_ret}} {{#is_enabled}}is_enabled=:is_enabled AND {{/is_enabled}} {{#is_pur}}is_pur=:is_pur AND {{/is_pur}} {{#batch_policy}}batch_policy=:batch_policy AND {{/batch_policy}} {{#created_at1}} created_at>=:created_at1 AND {{/created_at1}} {{#created_at2}} created_at<=:created_at2 AND {{/created_at2}} 1=1"
  )
  List<FindBasOrgGoodsOnManagerDTO> findBasOrgGoodsOnManager(
      @Param("org_id_list") String orgIdList,
      @Param("goods_id_list") String goodsIdList,
      @Param("goods_code_list") String goodsCodeList,
      @Param("goods_name") String goodsName,
      @Param("is_sale") Integer isSale,
      @Param("is_return") Integer isReturn,
      @Param("is_trans") Integer isTrans,
      @Param("is_stock_inv") Integer isStockInv,
      @Param("is_ret") Integer isRet,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_pur") Integer isPur,
      @Param("batch_policy") Integer batchPolicy,
      @Param("created_at1") java.util.Date createdAt1,
      @Param("created_at2") java.util.Date createdAt2);

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
