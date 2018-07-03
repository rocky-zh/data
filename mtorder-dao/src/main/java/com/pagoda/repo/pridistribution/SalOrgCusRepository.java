package com.pagoda.repo.pridistribution;

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
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * SalOrgCus 数据访问接口
 * @author PagodaGenerator
 * @generated
 */
public interface SalOrgCusRepository extends SalOrgCusRepositoryCustom, PagodaJpaRepository<SalOrgCus,Long>  {

    /**
     * 
     * @param pageable
     * @return
     */
    @SqlTemplate(name="findSalOrgCusList" , sql="SELECT id,org_org_id,org_org_code,org_org_name,cus_org_name FROM sal_org_cus where org_org_code IN ({{#orgOrgCodeList }}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList }}){{ #price_cat_id}} and price_cat_id > 0{{/price_cat_id}}")
    Page<> findSalOrgCusList( @Param("pageable") Pageable pageable);

        /**
        * 
        * @return
        */
        @SqlTemplate(name="findSalOrgCusList" , sql="SELECT id,org_org_id,org_org_code,org_org_name,cus_org_name FROM sal_org_cus where org_org_code IN ({{#orgOrgCodeList }}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList }}){{ #price_cat_id}} and price_cat_id > 0{{/price_cat_id}}")
        List<> findSalOrgCusList();

    /**
     * 去重查询价格目录和发货机构
     * @param pageable
     * @return
     */
    @SqlTemplate(name="findCatalogAndOrg" , sql="select distinct org_org_code,org_org_name,price_cat_code,price_cat_name  from sal_org_cus")
    Page<SalOrgCusDTO> findCatalogAndOrg( @Param("pageable") Pageable pageable);

        /**
        * 去重查询价格目录和发货机构
        * @return
        */
        @SqlTemplate(name="findCatalogAndOrg" , sql="select distinct org_org_code,org_org_name,price_cat_code,price_cat_name  from sal_org_cus")
        List<SalOrgCusDTO> findCatalogAndOrg();


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