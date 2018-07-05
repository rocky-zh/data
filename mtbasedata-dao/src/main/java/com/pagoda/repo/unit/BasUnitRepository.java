package com.pagoda.repo.unit;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.unit.*;
import com.pagoda.domain.unit.*;
import com.pagoda.repo.unit.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * BasUnit 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasUnitRepository
    extends BasUnitRepositoryCustom, PagodaJpaRepository<BasUnit, Long> {

  /**
   * 分页查询计量单位列表信息
   *
   * @param name
   * @param code
   * @param isEnabled
   * @param deleted
   * @param entId
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectUnitByCodeAndName",
    sql =
        "select * from bas_unit where {{#name}}name like '{{name}}%' and {{/name}} {{#code}}code like '{{code}}%' and {{/code}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id{{/ent_id}}"
  )
  Page<BasUnitDTO> selectUnitByCodeAndName(
      @Param("name") String name,
      @Param("code") String code,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("pageable") Pageable pageable);

  /**
   * 分页查询计量单位列表信息
   *
   * @param name
   * @param code
   * @param isEnabled
   * @param deleted
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "selectUnitByCodeAndName",
    sql =
        "select * from bas_unit where {{#name}}name like '{{name}}%' and {{/name}} {{#code}}code like '{{code}}%' and {{/code}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id{{/ent_id}}"
  )
  List<BasUnitDTO> selectUnitByCodeAndName(
      @Param("name") String name,
      @Param("code") String code,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId);

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
