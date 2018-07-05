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
 * BasGoodsProcessHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasGoodsProcessHeadRepository
    extends BasGoodsProcessHeadRepositoryCustom, PagodaJpaRepository<BasGoodsProcessHead, Long> {

  /**
   * 获取生产工艺明细列表
   *
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "getBasGoodsProcessHeadDetails",
    sql =
        "SELECT h.org_org_id,h.org_org_code,h.org_org_name, h.code,h. name,h.is_enabled,h.is_default,h.remark,d.rank_num,d.fee_code,d.fee_name,d.fee_amt,d.remark dremark,d.last_modified_at,d.modifier_name FROM bas_goods_process_head h LEFT JOIN bas_goods_process_detail d ON h.id = d.goods_proc_id WHERE d.goods_proc_id=goods_proc_id"
  )
  Page<GetBasGoodsProcessHeadDetailsDTO> getBasGoodsProcessHeadDetails(
      @Param("pageable") Pageable pageable);

  /**
   * 获取生产工艺明细列表
   *
   * @return
   */
  @SqlTemplate(
    name = "getBasGoodsProcessHeadDetails",
    sql =
        "SELECT h.org_org_id,h.org_org_code,h.org_org_name, h.code,h. name,h.is_enabled,h.is_default,h.remark,d.rank_num,d.fee_code,d.fee_name,d.fee_amt,d.remark dremark,d.last_modified_at,d.modifier_name FROM bas_goods_process_head h LEFT JOIN bas_goods_process_detail d ON h.id = d.goods_proc_id WHERE d.goods_proc_id=goods_proc_id"
  )
  List<GetBasGoodsProcessHeadDetailsDTO> getBasGoodsProcessHeadDetails();

  /**
   * 查询生产工艺头表列表(模糊查询)
   *
   * @param name
   * @param orgOrgId
   * @param code
   * @param isEnabled
   * @param isDefault
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "getBasGoodsProcessHeadList",
    sql =
        "select id,name,code,org_org_id,org_org_code,org_org_name,is_enabled,is_default,remark,rank_num,search_word,ent_id,version,created_at,creator_code,creator_name,creator_org_code,last_modified_at,modifier_code,modifier_name,modifier_org_code from bas_goods_process_head where {{#name}}name like '%{{name}}%' and {{/name}} {{#org_org_id}}org_org_id=:org_org_id and {{/org_org_id}} {{#code}}code like '%{{code}}%' and {{/code}}{{#is_enabled}} is_enabled=:is_enabled and {{/is_enabled}}{{#is_default}} is_default=:is_default and {{/is_default}} deleted=0"
  )
  Page<BasGoodsProcessHeadDTO> getBasGoodsProcessHeadList(
      @Param("name") String name,
      @Param("org_org_id") Long orgOrgId,
      @Param("code") String code,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_default") Integer isDefault,
      @Param("pageable") Pageable pageable);

  /**
   * 查询生产工艺头表列表(模糊查询)
   *
   * @param name
   * @param orgOrgId
   * @param code
   * @param isEnabled
   * @param isDefault
   * @return
   */
  @SqlTemplate(
    name = "getBasGoodsProcessHeadList",
    sql =
        "select id,name,code,org_org_id,org_org_code,org_org_name,is_enabled,is_default,remark,rank_num,search_word,ent_id,version,created_at,creator_code,creator_name,creator_org_code,last_modified_at,modifier_code,modifier_name,modifier_org_code from bas_goods_process_head where {{#name}}name like '%{{name}}%' and {{/name}} {{#org_org_id}}org_org_id=:org_org_id and {{/org_org_id}} {{#code}}code like '%{{code}}%' and {{/code}}{{#is_enabled}} is_enabled=:is_enabled and {{/is_enabled}}{{#is_default}} is_default=:is_default and {{/is_default}} deleted=0"
  )
  List<BasGoodsProcessHeadDTO> getBasGoodsProcessHeadList(
      @Param("name") String name,
      @Param("org_org_id") Long orgOrgId,
      @Param("code") String code,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_default") Integer isDefault);

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
