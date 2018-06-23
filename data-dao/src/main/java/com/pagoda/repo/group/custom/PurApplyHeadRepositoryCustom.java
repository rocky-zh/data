package com.pagoda.repo.group.custom;

import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * PurApplyHead扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PurApplyHeadRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param apply_no
   * @param apply_org_code
   * @param apply_org_id
   * @param apply_org_name
   * @param apply_status
   * @param cal_pur_rate
   * @param cal_type
   * @param check_user_code
   * @param check_user_id
   * @param check_user_name
   * @param checkdatetime
   * @param del_id
   * @param plan_rec_date
   * @param rec_org_code
   * @param rec_org_id
   * @param rec_org_name
   * @param source_type
   * @param active
   * @param pageable
   * @return
   */
  Page<PurApplyHeadDTO> findBy(
      @Param("applyNo") String applyNo,
      @Param("applyOrgCode") String applyOrgCode,
      @Param("applyOrgId") Integer applyOrgId,
      @Param("applyOrgName") String applyOrgName,
      @Param("applyStatus") Integer applyStatus,
      @Param("calPurRate") Double calPurRate,
      @Param("calType") Integer calType,
      @Param("checkUserCode") String checkUserCode,
      @Param("checkUserId") Integer checkUserId,
      @Param("checkUserName") String checkUserName,
      @Param("checkdatetime") java.sql.Timestamp checkdatetime,
      @Param("delId") Integer delId,
      @Param("planRecDate") java.sql.Timestamp planRecDate,
      @Param("recOrgCode") String recOrgCode,
      @Param("recOrgId") Integer recOrgId,
      @Param("recOrgName") String recOrgName,
      @Param("sourceType") Integer sourceType,
      @Param("active") Boolean active,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param apply_no
   * @param apply_org_code
   * @param apply_org_id
   * @param apply_org_name
   * @param apply_status
   * @param cal_pur_rate
   * @param cal_type
   * @param check_user_code
   * @param check_user_id
   * @param check_user_name
   * @param checkdatetime
   * @param del_id
   * @param plan_rec_date
   * @param rec_org_code
   * @param rec_org_id
   * @param rec_org_name
   * @param source_type
   * @param active
   * @return
   */
  List<PurApplyHeadDTO> findBy(
      @Param("applyNo") String applyNo,
      @Param("applyOrgCode") String applyOrgCode,
      @Param("applyOrgId") Integer applyOrgId,
      @Param("applyOrgName") String applyOrgName,
      @Param("applyStatus") Integer applyStatus,
      @Param("calPurRate") Double calPurRate,
      @Param("calType") Integer calType,
      @Param("checkUserCode") String checkUserCode,
      @Param("checkUserId") Integer checkUserId,
      @Param("checkUserName") String checkUserName,
      @Param("checkdatetime") java.sql.Timestamp checkdatetime,
      @Param("delId") Integer delId,
      @Param("planRecDate") java.sql.Timestamp planRecDate,
      @Param("recOrgCode") String recOrgCode,
      @Param("recOrgId") Integer recOrgId,
      @Param("recOrgName") String recOrgName,
      @Param("sourceType") Integer sourceType,
      @Param("active") Boolean active);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<PurApplyHeadDTO> findByExample(
      @Param("example") PurApplyHead example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<PurApplyHeadDTO> findByExample(@Param("example") PurApplyHead example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<PurApplyHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<PurApplyHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

  /**
   * 复杂条件更新
   *
   * @param builder
   * @return
   */
  // int updateByBuilder(@Param("builder") JpaUpdateBuilder builder);

  /**
   * 使用模糊查找方式，注意可能导致全表扫描
   *
   * @param example
   * @param fields, 模糊查找的字段（字符串类型）
   * @param stringMatcher，模糊查找方式，
   *     STARTING表示字符串前缀匹配类似str%，ENDING表示字符串后缀匹配类似%str，CONTAINING表示完全模糊匹配类似%str%
   * @param pageable
   * @return
   */
  Page<PurApplyHeadDTO> findByFuzzySearch(
      @Param("example") PurApplyHead example,
      @Param("fields") List<String> fields,
      @Param("stringMatcher") ExampleMatcher.StringMatcher stringMatcher,
      @Param("pageable") Pageable pageable);

  /**
   * 查询某个字段的取值查询一组对象，通常用于查询匹配父表主键id的一组对象
   *
   * @param fieldName 模型字段名字（表字段，通常是外键，与父表的主键id匹配）
   * @param value 字段取值
   * @param pageable
   * @return
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  Page<PurApplyHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException;

  /**
   * 查询某个字段的取值查询一组对象，通常用于查询匹配父表主键id的一组对象
   *
   * @param fieldName 模型字段名字（表字段，通常是外键，与父表的主键id匹配）
   * @param value 字段取值
   * @param pageable
   * @return
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  List<PurApplyHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
