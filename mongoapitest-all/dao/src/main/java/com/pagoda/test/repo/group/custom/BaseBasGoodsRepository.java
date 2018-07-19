package com.pagoda.test.repo.group.custom;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.domain.group.*;
import com.pagoda.test.repo.group.custom.*;

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
 * BasGoods 数据访问接口
 * @author PagodaGenerator
 * @generated
 */
@NoRepositoryBean
public interface BaseBasGoodsRepository extends BasGoodsRepositoryCustom, PagodaJpaRepository<BasGoods,Long>  {

    /**
     * 简单的带list的查询
     * @param idList
     * @param pageable
     * @return
     */
    @SqlTemplate(name="simpleListQuery" , sql="select * from bas_goods where id in ({{#idList}}{{^-first}}, {{/-first}}{{this}}{{/idList}})")
    Page<BasGoodsDTO> simpleListQuery(@Param("idList") List<Long> idList,  @Param("pageable") Pageable pageable);

        /**
        * 简单的带list的查询
            * @param idList
        * @return
        */
        @SqlTemplate(name="simpleListQuery" , sql="select * from bas_goods where id in ({{#idList}}{{^-first}}, {{/-first}}{{this}}{{/idList}})")
        List<BasGoodsDTO> simpleListQuery(@Param("idList") List<Long> idList );

    /**
     * 链接分类关系和商品明细关系 用于供应商返利商品明细
     * @param tableId
     * @param catClassId
     * @param catId
     * @param goodsIds
     * @param goodsId
     * @param isEnabled
     * @param deleted
     * @param entId
     * @param pageable
     * @return
     */
    @SqlTemplate(name="selectVenGoodsDetailUnSet" , sql="select goods.id as goods_id, goods.code, goods.name, goods.bas_unit_name, goods.bas_unit_code, goods.bas_unit_id, cat.cat_class_id, cat.cat_class_code, cat.cat_class_name, goods.goods_spec from bas_goods goods inner join bas_cat_class_rel cat on goods.id=cat.obj_id {{#table_id}}and cat.table_id=:table_id {{/table_id}} {{#cat_class_id}} and cat.cat_class_id=:cat_class_id {{/cat_class_id}} {{#cat_id}} and cat.cat_id=:cat_id {{/cat_id}} {{#goodsIds_exists}} and goods.id not in ({{#goodsIds}}{{^-first}}, {{/-first}}{{this}}{{/goodsIds}}){{/goodsIds_exists}} {{#goods_id}} and goods.id=:goods_id {{/goods_id}} {{#is_enabled}} and goods.is_enabled=:is_enabled {{/is_enabled}} {{#is_enabled}} and cat.is_enabled=:is_enabled {{/is_enabled}}  {{#deleted}} and goods.deleted=:deleted {{/deleted}} {{#deleted}} and cat.deleted=:deleted {{/deleted}} {{#ent_id}} and goods.ent_id=:ent_id {{/ent_id}} {{#ent_id}} and cat.ent_id=:ent_id {{/ent_id}}")
    Page<SelectVenGoodsDetailUnSetDTO> selectVenGoodsDetailUnSet(@Param("table_id") Long tableId, @Param("cat_class_id") String catClassId, @Param("cat_id") Long catId, @Param("goodsIds") List<Long> goodsIds, @Param("goods_id") String goodsId, @Param("is_enabled") Integer isEnabled, @Param("deleted") Long deleted, @Param("ent_id") Long entId,  @Param("pageable") Pageable pageable);

        /**
        * 链接分类关系和商品明细关系 用于供应商返利商品明细
            * @param tableId
            * @param catClassId
            * @param catId
            * @param goodsIds
            * @param goodsId
            * @param isEnabled
            * @param deleted
            * @param entId
        * @return
        */
        @SqlTemplate(name="selectVenGoodsDetailUnSet" , sql="select goods.id as goods_id, goods.code, goods.name, goods.bas_unit_name, goods.bas_unit_code, goods.bas_unit_id, cat.cat_class_id, cat.cat_class_code, cat.cat_class_name, goods.goods_spec from bas_goods goods inner join bas_cat_class_rel cat on goods.id=cat.obj_id {{#table_id}}and cat.table_id=:table_id {{/table_id}} {{#cat_class_id}} and cat.cat_class_id=:cat_class_id {{/cat_class_id}} {{#cat_id}} and cat.cat_id=:cat_id {{/cat_id}} {{#goodsIds_exists}} and goods.id not in ({{#goodsIds}}{{^-first}}, {{/-first}}{{this}}{{/goodsIds}}){{/goodsIds_exists}} {{#goods_id}} and goods.id=:goods_id {{/goods_id}} {{#is_enabled}} and goods.is_enabled=:is_enabled {{/is_enabled}} {{#is_enabled}} and cat.is_enabled=:is_enabled {{/is_enabled}}  {{#deleted}} and goods.deleted=:deleted {{/deleted}} {{#deleted}} and cat.deleted=:deleted {{/deleted}} {{#ent_id}} and goods.ent_id=:ent_id {{/ent_id}} {{#ent_id}} and cat.ent_id=:ent_id {{/ent_id}}")
        List<SelectVenGoodsDetailUnSetDTO> selectVenGoodsDetailUnSet(@Param("table_id") Long tableId, @Param("cat_class_id") String catClassId, @Param("cat_id") Long catId, @Param("goodsIds") List<Long> goodsIds, @Param("goods_id") String goodsId, @Param("is_enabled") Integer isEnabled, @Param("deleted") Long deleted, @Param("ent_id") Long entId );

    /**
     * 带List的查询
     * @param pageable
     * @return
     */
    @SqlTemplate(name="selectWithList" , sql="select * from bas_goods where {{#idList_exists}}id in ({{#idList}}{{^-first}}, {{/-first}}{{this}}{{/idList}}){{/idList_exists}}{{#code}} and code= :code{{/code}}")
    Page<> selectWithList( @Param("pageable") Pageable pageable);

        /**
        * 带List的查询
        * @return
        */
        @SqlTemplate(name="selectWithList" , sql="select * from bas_goods where {{#idList_exists}}id in ({{#idList}}{{^-first}}, {{/-first}}{{this}}{{/idList}}){{/idList_exists}}{{#code}} and code= :code{{/code}}")
        List<> selectWithList();


    /**
     * 动态执行一个无参数的sql,返回分页的结果
     *
     * @param selectProvider   通过SqlWrapper.asSelect封装sql
     * @param pageable     分页，排序参数
     * @param returnType 返回对象的class类型
     * @param <T>
     * @return 分页的查询结果列表
     */
    @SqlTemplate(name="dynamicSelectPage", dynamic=true)
    public <T> Page<T> dynamicSelectPage(@Param("selectProvider") SelectStatementProvider selectProvider, @Param("pageable") Pageable pageable, @Param("returnType") Class<T> returnType);


   /**
    * 动态执行一个无参数的sql,返回单个结果
    *
    * @param selectProvider   通过SqlWrapper.asSelect封装sql
    * @param returnType 返回对象的class类型
    * @param <T>
    * @return 单个查询结果
    */
    @SqlTemplate(name="dynamicSelectOne", dynamic=true, multiple=false)
    public <T> T dynamicSelectOne(@Param("selectProvider") SelectStatementProvider selectProvider, @Param("returnType") Class<T> returnType);

    /**
     * 动态执行一个无参数的sql update 语句
     *
     * @param updateProvider
     * @return 修改的记录条数
     */
    @SqlTemplate(name="dynamicUpdate", dynamic=true)
    @Modifying
    public int dynamicUpdate(@Param("updateProvider")UpdateStatementProvider updateProvider);

}