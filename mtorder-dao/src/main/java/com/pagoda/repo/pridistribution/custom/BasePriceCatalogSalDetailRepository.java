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
 * PriceCatalogSalDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BasePriceCatalogSalDetailRepository
    extends PriceCatalogSalDetailRepositoryCustom,
        PagodaJpaRepository<PriceCatalogSalDetail, Long> {

  /**
   * @param priceCatId
   * @param goodsId
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findPriceAdjustLogs",
    sql =
        "SELECT pd.id,ph.id,pd.sal_price,pd.return_price,ph.effect_date,ph.seqno,ph.creator_code,ph.creator_name,ph.created_at,ph.modifier_code,ph.modifier_name,ph.last_modified_at,ph.remark FROM price_catalog_sal_detail pd,price_adjust_sal_head ph where pd.price_cat_id = ph.price_cat_id and ph.deleted = 0 and pd.deleted = 0{{#price_cat_id}} and pd.price_cat_id =:price_cat_id{{/price_cat_id}}{{#goods_id}} and pd.goods_id =:goods_id{{/goods_id}}"
  )
  Page<FindPriceAdjustLogsDTO> findPriceAdjustLogs(
      @Param("price_cat_id") Long priceCatId,
      @Param("goods_id") Long goodsId,
      @Param("pageable") Pageable pageable);

  /**
   * @param priceCatId
   * @param goodsId
   * @return
   */
  @SqlTemplate(
    name = "findPriceAdjustLogs",
    sql =
        "SELECT pd.id,ph.id,pd.sal_price,pd.return_price,ph.effect_date,ph.seqno,ph.creator_code,ph.creator_name,ph.created_at,ph.modifier_code,ph.modifier_name,ph.last_modified_at,ph.remark FROM price_catalog_sal_detail pd,price_adjust_sal_head ph where pd.price_cat_id = ph.price_cat_id and ph.deleted = 0 and pd.deleted = 0{{#price_cat_id}} and pd.price_cat_id =:price_cat_id{{/price_cat_id}}{{#goods_id}} and pd.goods_id =:goods_id{{/goods_id}}"
  )
  List<FindPriceAdjustLogsDTO> findPriceAdjustLogs(
      @Param("price_cat_id") Long priceCatId, @Param("goods_id") Long goodsId);

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
