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
 * BasDistrict 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasDistrictRepository
    extends BasDistrictRepositoryCustom, PagodaJpaRepository<BasDistrict, Long> {

  /**
   * 模糊查询城市 省份信息
   *
   * @param districtLevel
   * @param name
   * @param pCode
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectDistrictByLikeName",
    sql =
        "select code, name from bas_district where 1=1 {{#district_level}}and name like '{{name}}%' and district_level=:district_level {{#p_code}}and p_code=:p_code {{/p_code}} {{/district_level}}"
  )
  Page<BasDistrictDTO> selectDistrictByLikeName(
      @Param("district_level") Integer districtLevel,
      @Param("name") String name,
      @Param("p_code") String pCode,
      @Param("pageable") Pageable pageable);

  /**
   * 模糊查询城市 省份信息
   *
   * @param districtLevel
   * @param name
   * @param pCode
   * @return
   */
  @SqlTemplate(
    name = "selectDistrictByLikeName",
    sql =
        "select code, name from bas_district where 1=1 {{#district_level}}and name like '{{name}}%' and district_level=:district_level {{#p_code}}and p_code=:p_code {{/p_code}} {{/district_level}}"
  )
  List<BasDistrictDTO> selectDistrictByLikeName(
      @Param("district_level") Integer districtLevel,
      @Param("name") String name,
      @Param("p_code") String pCode);

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
