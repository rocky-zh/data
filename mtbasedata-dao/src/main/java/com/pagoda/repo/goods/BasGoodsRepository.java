package com.pagoda.repo.goods;

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
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * BasGoods 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasGoodsRepository
    extends BasGoodsRepositoryCustom, PagodaJpaRepository<BasGoods, Long> {

  /**
   * 商品定义->商品查询
   *
   * @param catId
   * @param path
   * @param isPur
   * @param tableId
   * @param isEnabled
   * @param deleted
   * @param entId
   * @param isSale
   * @param isRet
   * @param createdAt
   * @param name
   * @param barcode
   * @param code
   * @param goodsType
   * @param mnemWord
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findGoodsInDefine",
    sql =
        "select goods.id,goods.code,goods.name,goods.short_name,goods.tradit_name,goods.en_name,goods.ent_id,goods.goods_spec,goods.goods_origin,goods.goods_level,goods.goods_type,goods.search_word,goods.bas_unit_id,goods.bas_unit_code,goods.bas_unit_name,goods.inv_unit_id,goods.inv_unit_name,goods.inv_unit_code,goods.inv_rate,goods.sal_unit_id,goods.sal_unit_code,goods.sal_unit_name,goods.sal_rate,goods.pur_unit_id,goods.pur_unit_code,goods.pur_unit_name,goods.pur_rate,goods.ret_unit_id,goods.ret_unit_code,goods.ret_unit_name,goods.ret_rate,goods.unit_volume,goods.unit_weight,goods.barcode,goods.tax_rate,goods.is_ent_lot,goods.shelf_life_type,goods.shelf_life_qty,goods.is_enabled,goods.is_pur,goods.is_sale,goods.is_ret,goods.version,goods.deleted,goods.creator_code,goods.creator_name,goods.created_at,goods.creator_org_code,goods.modifier_code,goods.modifier_name,goods.last_modified_at,goods.modifier_org_code from bas_goods goods {{#cat_id}} inner join bas_cat_class_rel cat on goods.id=cat.obj_id AND goods.deleted=cat.deleted AND goods.ent_id=cat.ent_id {{/cat_id}} where {{#cat_id}}cat.cat_id=:cat_id AND {{/cat_id}} {{#path}} cat.path like '{{path}}%' AND {{/path}} {{#is_pur}}goods.is_pur=:is_pur AND {{/is_pur}}  {{#table_id}}cat.table_id=:table_id AND {{/table_id}} {{#is_enabled}}a.is_enabled=:is_enabled AND {{/is_enabled}} {{#deleted}}a.deleted=:deleted AND {{/deleted}} {{#ent_id}}goods.ent_id=:ent_id AND {{/ent_id}} {{#is_sale}}goods.is_sale=:is_sale AND {{/is_sale}}  {{#is_ret}}goods.is_ret=:is_ret AND {{/is_ret}}  {{#created_at}}goods.created_at=:created_at AND {{/created_at}} {{#name}}goods.name like '{{name}}%' AND {{/name}} {{#barcode}}goods.barcode like '{{barcode}}%' AND {{/barcode}}  {{#code}}goods.code like '{{code}}%' AND {{/code}} {{#goods_type}}goods.goods_type like '{{goods_type}}%' AND {{/goods_type}} {{#mnem_word}}goods.mnem_word like '{{mnem_word}}%' AND {{/mnem_word}} 1=1"
  )
  Page<FindGoodsInDefineDTO> findGoodsInDefine(
      @Param("cat_id") Long catId,
      @Param("path") String path,
      @Param("is_pur") Integer isPur,
      @Param("table_id") Long tableId,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("is_sale") Integer isSale,
      @Param("is_ret") Integer isRet,
      @Param("created_at") java.util.Date createdAt,
      @Param("name") String name,
      @Param("barcode") String barcode,
      @Param("code") String code,
      @Param("goods_type") Integer goodsType,
      @Param("mnem_word") String mnemWord,
      @Param("pageable") Pageable pageable);

  /**
   * 商品定义->商品查询
   *
   * @param catId
   * @param path
   * @param isPur
   * @param tableId
   * @param isEnabled
   * @param deleted
   * @param entId
   * @param isSale
   * @param isRet
   * @param createdAt
   * @param name
   * @param barcode
   * @param code
   * @param goodsType
   * @param mnemWord
   * @return
   */
  @SqlTemplate(
    name = "findGoodsInDefine",
    sql =
        "select goods.id,goods.code,goods.name,goods.short_name,goods.tradit_name,goods.en_name,goods.ent_id,goods.goods_spec,goods.goods_origin,goods.goods_level,goods.goods_type,goods.search_word,goods.bas_unit_id,goods.bas_unit_code,goods.bas_unit_name,goods.inv_unit_id,goods.inv_unit_name,goods.inv_unit_code,goods.inv_rate,goods.sal_unit_id,goods.sal_unit_code,goods.sal_unit_name,goods.sal_rate,goods.pur_unit_id,goods.pur_unit_code,goods.pur_unit_name,goods.pur_rate,goods.ret_unit_id,goods.ret_unit_code,goods.ret_unit_name,goods.ret_rate,goods.unit_volume,goods.unit_weight,goods.barcode,goods.tax_rate,goods.is_ent_lot,goods.shelf_life_type,goods.shelf_life_qty,goods.is_enabled,goods.is_pur,goods.is_sale,goods.is_ret,goods.version,goods.deleted,goods.creator_code,goods.creator_name,goods.created_at,goods.creator_org_code,goods.modifier_code,goods.modifier_name,goods.last_modified_at,goods.modifier_org_code from bas_goods goods {{#cat_id}} inner join bas_cat_class_rel cat on goods.id=cat.obj_id AND goods.deleted=cat.deleted AND goods.ent_id=cat.ent_id {{/cat_id}} where {{#cat_id}}cat.cat_id=:cat_id AND {{/cat_id}} {{#path}} cat.path like '{{path}}%' AND {{/path}} {{#is_pur}}goods.is_pur=:is_pur AND {{/is_pur}}  {{#table_id}}cat.table_id=:table_id AND {{/table_id}} {{#is_enabled}}a.is_enabled=:is_enabled AND {{/is_enabled}} {{#deleted}}a.deleted=:deleted AND {{/deleted}} {{#ent_id}}goods.ent_id=:ent_id AND {{/ent_id}} {{#is_sale}}goods.is_sale=:is_sale AND {{/is_sale}}  {{#is_ret}}goods.is_ret=:is_ret AND {{/is_ret}}  {{#created_at}}goods.created_at=:created_at AND {{/created_at}} {{#name}}goods.name like '{{name}}%' AND {{/name}} {{#barcode}}goods.barcode like '{{barcode}}%' AND {{/barcode}}  {{#code}}goods.code like '{{code}}%' AND {{/code}} {{#goods_type}}goods.goods_type like '{{goods_type}}%' AND {{/goods_type}} {{#mnem_word}}goods.mnem_word like '{{mnem_word}}%' AND {{/mnem_word}} 1=1"
  )
  List<FindGoodsInDefineDTO> findGoodsInDefine(
      @Param("cat_id") Long catId,
      @Param("path") String path,
      @Param("is_pur") Integer isPur,
      @Param("table_id") Long tableId,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("is_sale") Integer isSale,
      @Param("is_ret") Integer isRet,
      @Param("created_at") java.util.Date createdAt,
      @Param("name") String name,
      @Param("barcode") String barcode,
      @Param("code") String code,
      @Param("goods_type") Integer goodsType,
      @Param("mnem_word") String mnemWord);

  /**
   * 分类关系->根据目录分类查找商品
   *
   * @param path
   * @param catId
   * @param isPur
   * @param tableId
   * @param isEnabled
   * @param deleted
   * @param entId
   * @param isSale
   * @param isRet
   * @param createdAt
   * @param name
   * @param barcode
   * @param code
   * @param goodsType
   * @param mnemWord
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findGoodsOnCatClass",
    sql =
        "select goods.id,goods.code,goods.name,goods.short_name,goods.tradit_name,goods.en_name,goods.ent_id,goods.goods_spec,goods.goods_origin,goods.goods_level,goods.goods_type,goods.search_word,goods.bas_unit_id,goods.bas_unit_code,goods.bas_unit_name,goods.inv_unit_id,goods.inv_unit_name,goods.inv_unit_code,goods.inv_rate,goods.sal_unit_id,goods.sal_unit_code,goods.sal_unit_name,goods.sal_rate,goods.pur_unit_id,goods.pur_unit_code,goods.pur_unit_name,goods.pur_rate,goods.ret_unit_id,goods.ret_unit_code,goods.ret_unit_name,goods.ret_rate,goods.unit_volume,goods.unit_weight,goods.barcode,goods.tax_rate,goods.is_ent_lot,goods.shelf_life_type,goods.shelf_life_qty,goods.is_enabled,goods.is_pur,goods.is_sale,goods.is_ret,goods.version,goods.deleted,goods.creator_code,goods.creator_name,goods.created_at,goods.creator_org_code,goods.modifier_code,goods.modifier_name,goods.last_modified_at,goods.modifier_org_code,class.full_name from bas_cat_class class,bas_goods goods inner join bas_cat_class_rel cat on goods.id=cat.obj_id AND goods.deleted=cat.deleted AND goods.ent_id=cat.ent_id where class.id=cat.cat_class_id {{#path}} AND cat.path like '{{path}}%' {{/path}}  {{#cat_id}} AND cat.cat_id=:cat_id {{/cat_id}} {{#is_pur}} AND goods.is_pur=:is_pur {{/is_pur}} {{#table_id}} AND cat.table_id=:table_id{{/table_id}} {{#is_enabled}} AND a.is_enabled=:is_enabled{{/is_enabled}} {{#deleted}} AND a.deleted=:deleted{{/deleted}} {{#ent_id}} AND goods.ent_id=:ent_id{{/ent_id}} {{#is_sale}} AND goods.is_sale=:is_sale {{/is_sale}}  {{#is_ret}} AND goods.is_ret=:is_ret{{/is_ret}}  {{#created_at}} AND goods.created_at=:created_at{{/created_at}} {{#name}} AND goods.name like '{{name}}%'{{/name}} {{#barcode}} AND goods.barcode like '{{barcode}}%'{{/barcode}}  {{#code}} AND goods.code like '{{code}}%'{{/code}} {{#goods_type}} AND goods.goods_type like '{{goods_type}}%'{{/goods_type}} {{#mnem_word}} AND goods.mnem_word like '{{mnem_word}}%'{{/mnem_word}}"
  )
  Page<FindGoodsOnCatClassDTO> findGoodsOnCatClass(
      @Param("path") String path,
      @Param("cat_id") Long catId,
      @Param("is_pur") Integer isPur,
      @Param("table_id") Long tableId,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("is_sale") Integer isSale,
      @Param("is_ret") Integer isRet,
      @Param("created_at") java.util.Date createdAt,
      @Param("name") String name,
      @Param("barcode") String barcode,
      @Param("code") String code,
      @Param("goods_type") Integer goodsType,
      @Param("mnem_word") String mnemWord,
      @Param("pageable") Pageable pageable);

  /**
   * 分类关系->根据目录分类查找商品
   *
   * @param path
   * @param catId
   * @param isPur
   * @param tableId
   * @param isEnabled
   * @param deleted
   * @param entId
   * @param isSale
   * @param isRet
   * @param createdAt
   * @param name
   * @param barcode
   * @param code
   * @param goodsType
   * @param mnemWord
   * @return
   */
  @SqlTemplate(
    name = "findGoodsOnCatClass",
    sql =
        "select goods.id,goods.code,goods.name,goods.short_name,goods.tradit_name,goods.en_name,goods.ent_id,goods.goods_spec,goods.goods_origin,goods.goods_level,goods.goods_type,goods.search_word,goods.bas_unit_id,goods.bas_unit_code,goods.bas_unit_name,goods.inv_unit_id,goods.inv_unit_name,goods.inv_unit_code,goods.inv_rate,goods.sal_unit_id,goods.sal_unit_code,goods.sal_unit_name,goods.sal_rate,goods.pur_unit_id,goods.pur_unit_code,goods.pur_unit_name,goods.pur_rate,goods.ret_unit_id,goods.ret_unit_code,goods.ret_unit_name,goods.ret_rate,goods.unit_volume,goods.unit_weight,goods.barcode,goods.tax_rate,goods.is_ent_lot,goods.shelf_life_type,goods.shelf_life_qty,goods.is_enabled,goods.is_pur,goods.is_sale,goods.is_ret,goods.version,goods.deleted,goods.creator_code,goods.creator_name,goods.created_at,goods.creator_org_code,goods.modifier_code,goods.modifier_name,goods.last_modified_at,goods.modifier_org_code,class.full_name from bas_cat_class class,bas_goods goods inner join bas_cat_class_rel cat on goods.id=cat.obj_id AND goods.deleted=cat.deleted AND goods.ent_id=cat.ent_id where class.id=cat.cat_class_id {{#path}} AND cat.path like '{{path}}%' {{/path}}  {{#cat_id}} AND cat.cat_id=:cat_id {{/cat_id}} {{#is_pur}} AND goods.is_pur=:is_pur {{/is_pur}} {{#table_id}} AND cat.table_id=:table_id{{/table_id}} {{#is_enabled}} AND a.is_enabled=:is_enabled{{/is_enabled}} {{#deleted}} AND a.deleted=:deleted{{/deleted}} {{#ent_id}} AND goods.ent_id=:ent_id{{/ent_id}} {{#is_sale}} AND goods.is_sale=:is_sale {{/is_sale}}  {{#is_ret}} AND goods.is_ret=:is_ret{{/is_ret}}  {{#created_at}} AND goods.created_at=:created_at{{/created_at}} {{#name}} AND goods.name like '{{name}}%'{{/name}} {{#barcode}} AND goods.barcode like '{{barcode}}%'{{/barcode}}  {{#code}} AND goods.code like '{{code}}%'{{/code}} {{#goods_type}} AND goods.goods_type like '{{goods_type}}%'{{/goods_type}} {{#mnem_word}} AND goods.mnem_word like '{{mnem_word}}%'{{/mnem_word}}"
  )
  List<FindGoodsOnCatClassDTO> findGoodsOnCatClass(
      @Param("path") String path,
      @Param("cat_id") Long catId,
      @Param("is_pur") Integer isPur,
      @Param("table_id") Long tableId,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("is_sale") Integer isSale,
      @Param("is_ret") Integer isRet,
      @Param("created_at") java.util.Date createdAt,
      @Param("name") String name,
      @Param("barcode") String barcode,
      @Param("code") String code,
      @Param("goods_type") Integer goodsType,
      @Param("mnem_word") String mnemWord);

  /**
   * 分类关系->查找没有在当前目录下的商品
   *
   * @param catId
   * @param entId
   * @param deleted
   * @param tableId
   * @param isPur
   * @param isEnabled
   * @param isSale
   * @param isRet
   * @param createdAt
   * @param name
   * @param barcode
   * @param code
   * @param goodsType
   * @param mnemWord
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findNoClassGoodsOnCat",
    sql =
        "select goods.id,goods.code,goods.name,goods.short_name,goods.tradit_name,goods.en_name,goods.ent_id,goods.goods_spec,goods.goods_origin,goods.goods_level,goods.goods_type,goods.search_word,goods.bas_unit_id,goods.bas_unit_code,goods.bas_unit_name,goods.inv_unit_id,goods.inv_unit_name,goods.inv_unit_code,goods.inv_rate,goods.sal_unit_id,goods.sal_unit_code,goods.sal_unit_name,goods.sal_rate,goods.pur_unit_id,goods.pur_unit_code,goods.pur_unit_name,goods.pur_rate,goods.ret_unit_id,goods.ret_unit_code,goods.ret_unit_name,goods.ret_rate,goods.unit_volume,goods.unit_weight,goods.barcode,goods.tax_rate,goods.is_ent_lot,goods.shelf_life_type,goods.shelf_life_qty,goods.is_enabled,goods.is_pur,goods.is_sale,goods.is_ret,goods.version,goods.deleted,goods.creator_code,goods.creator_name,goods.created_at,goods.creator_org_code,goods.modifier_code,goods.modifier_name,goods.last_modified_at,goods.modifier_org_code from bas_goods goods left join (select obj_id from bas_cat_class_rel where {{#cat_id}}cat_id=:cat_id AND {{/cat_id}} {{#ent_id}}ent_id=:ent_id AND {{/ent_id}} {{#deleted}}deleted=:deleted AND {{/deleted}} {{#table_id}}table_id=:table_id AND {{/table_id}} 1=1) b on goods.id = b.obj_id where b.obj_id is null {{#is_pur}} AND goods.is_pur=:is_pur{{/is_pur}} {{#table_id}} AND cat.table_id=:table_id {{/table_id}} {{#is_enabled}} AND a.is_enabled=:is_enabled{{/is_enabled}} {{#deleted}} AND a.deleted=:deleted{{/deleted}} {{#ent_id}} AND goods.ent_id=:ent_id{{/ent_id}} {{#is_sale}} AND goods.is_sale=:is_sale{{/is_sale}}  {{#is_ret}} AND goods.is_ret=:is_ret{{/is_ret}} {{#created_at}} AND goods.created_at=:created_at{{/created_at}} {{#name}} AND goods.name like '{{name}}%'{{/name}} {{#barcode}} AND goods.barcode like '{{barcode}}%'{{/barcode}}  {{#code}} AND goods.code like '{{code}}%'{{/code}} {{#goods_type}} AND goods.goods_type like '{{goods_type}}%'{{/goods_type}} {{#mnem_word}} AND goods.mnem_word like '{{mnem_word}}%'{{/mnem_word}}"
  )
  Page<BasGoodsDTO> findNoClassGoodsOnCat(
      @Param("cat_id") Long catId,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("table_id") Long tableId,
      @Param("is_pur") Integer isPur,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_sale") Integer isSale,
      @Param("is_ret") Integer isRet,
      @Param("created_at") java.util.Date createdAt,
      @Param("name") String name,
      @Param("barcode") String barcode,
      @Param("code") String code,
      @Param("goods_type") Integer goodsType,
      @Param("mnem_word") String mnemWord,
      @Param("pageable") Pageable pageable);

  /**
   * 分类关系->查找没有在当前目录下的商品
   *
   * @param catId
   * @param entId
   * @param deleted
   * @param tableId
   * @param isPur
   * @param isEnabled
   * @param isSale
   * @param isRet
   * @param createdAt
   * @param name
   * @param barcode
   * @param code
   * @param goodsType
   * @param mnemWord
   * @return
   */
  @SqlTemplate(
    name = "findNoClassGoodsOnCat",
    sql =
        "select goods.id,goods.code,goods.name,goods.short_name,goods.tradit_name,goods.en_name,goods.ent_id,goods.goods_spec,goods.goods_origin,goods.goods_level,goods.goods_type,goods.search_word,goods.bas_unit_id,goods.bas_unit_code,goods.bas_unit_name,goods.inv_unit_id,goods.inv_unit_name,goods.inv_unit_code,goods.inv_rate,goods.sal_unit_id,goods.sal_unit_code,goods.sal_unit_name,goods.sal_rate,goods.pur_unit_id,goods.pur_unit_code,goods.pur_unit_name,goods.pur_rate,goods.ret_unit_id,goods.ret_unit_code,goods.ret_unit_name,goods.ret_rate,goods.unit_volume,goods.unit_weight,goods.barcode,goods.tax_rate,goods.is_ent_lot,goods.shelf_life_type,goods.shelf_life_qty,goods.is_enabled,goods.is_pur,goods.is_sale,goods.is_ret,goods.version,goods.deleted,goods.creator_code,goods.creator_name,goods.created_at,goods.creator_org_code,goods.modifier_code,goods.modifier_name,goods.last_modified_at,goods.modifier_org_code from bas_goods goods left join (select obj_id from bas_cat_class_rel where {{#cat_id}}cat_id=:cat_id AND {{/cat_id}} {{#ent_id}}ent_id=:ent_id AND {{/ent_id}} {{#deleted}}deleted=:deleted AND {{/deleted}} {{#table_id}}table_id=:table_id AND {{/table_id}} 1=1) b on goods.id = b.obj_id where b.obj_id is null {{#is_pur}} AND goods.is_pur=:is_pur{{/is_pur}} {{#table_id}} AND cat.table_id=:table_id {{/table_id}} {{#is_enabled}} AND a.is_enabled=:is_enabled{{/is_enabled}} {{#deleted}} AND a.deleted=:deleted{{/deleted}} {{#ent_id}} AND goods.ent_id=:ent_id{{/ent_id}} {{#is_sale}} AND goods.is_sale=:is_sale{{/is_sale}}  {{#is_ret}} AND goods.is_ret=:is_ret{{/is_ret}} {{#created_at}} AND goods.created_at=:created_at{{/created_at}} {{#name}} AND goods.name like '{{name}}%'{{/name}} {{#barcode}} AND goods.barcode like '{{barcode}}%'{{/barcode}}  {{#code}} AND goods.code like '{{code}}%'{{/code}} {{#goods_type}} AND goods.goods_type like '{{goods_type}}%'{{/goods_type}} {{#mnem_word}} AND goods.mnem_word like '{{mnem_word}}%'{{/mnem_word}}"
  )
  List<BasGoodsDTO> findNoClassGoodsOnCat(
      @Param("cat_id") Long catId,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("table_id") Long tableId,
      @Param("is_pur") Integer isPur,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_sale") Integer isSale,
      @Param("is_ret") Integer isRet,
      @Param("created_at") java.util.Date createdAt,
      @Param("name") String name,
      @Param("barcode") String barcode,
      @Param("code") String code,
      @Param("goods_type") Integer goodsType,
      @Param("mnem_word") String mnemWord);

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
