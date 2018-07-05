package com.pagoda.repo.org;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
import com.pagoda.repo.org.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * BasOrgBalBank 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasOrgBalBankRepository
    extends BasOrgBalBankRepositoryCustom, PagodaJpaRepository<BasOrgBalBank, Long> {

  /**
   * 将改结算单位的所有默认开户行改为否
   *
   * @param balOrgId
   * @return
   */
  @SqlTemplate(
    name = "updateDefByBalOrgId",
    sql = "update bas_org_bal_bank set is_default = 0 where bal_org_id=:bal_org_id"
  )
  @Modifying
  Integer updateDefByBalOrgId(@Param("bal_org_id") Long balOrgId);

  /**
   * 修改开户行的是否默认
   *
   * @param id
   * @return
   */
  @SqlTemplate(
    name = "updateDefById",
    sql = "update bas_org_bal_bank set is_default = 1 where id=:id"
  )
  @Modifying
  Integer updateDefById(@Param("id") Long id);

  /**
   * 通过结算单位Id删除开户行信息
   *
   * @param balOrgId
   * @return
   */
  @SqlTemplate(
    name = "deleteByBalOrgId",
    sql = "update bas_org_bal_bank set deleted=id where bal_org_id=:bal_org_id"
  )
  @Modifying
  Integer deleteByBalOrgId(@Param("bal_org_id") Long balOrgId);

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
