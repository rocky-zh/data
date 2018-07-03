package com.pagoda.repo.purorder.custom;

import com.pagoda.api.dto.purorder.*;
import com.pagoda.domain.purorder.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * PurOrderHead扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PurOrderHeadRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param entId
   * @param seqno
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param venComfirmStatus
   * @param venComfirmUserCode
   * @param venComfirmUserName
   * @param orderStatus
   * @param planRecDate
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param bpmnStatus
   * @param bpmnRemark
   * @param pageable
   * @return
   */
  Page<PurOrderHeadDTO> findBy(
      @Param("entId") Long entId,
      @Param("seqno") String seqno,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("venComfirmStatus") Integer venComfirmStatus,
      @Param("venComfirmUserCode") String venComfirmUserCode,
      @Param("venComfirmUserName") String venComfirmUserName,
      @Param("orderStatus") Integer orderStatus,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("bpmnStatus") Integer bpmnStatus,
      @Param("bpmnRemark") String bpmnRemark,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param entId
   * @param seqno
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param venComfirmStatus
   * @param venComfirmUserCode
   * @param venComfirmUserName
   * @param orderStatus
   * @param planRecDate
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param bpmnStatus
   * @param bpmnRemark
   * @return
   */
  List<PurOrderHeadDTO> findBy(
      @Param("entId") Long entId,
      @Param("seqno") String seqno,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("venComfirmStatus") Integer venComfirmStatus,
      @Param("venComfirmUserCode") String venComfirmUserCode,
      @Param("venComfirmUserName") String venComfirmUserName,
      @Param("orderStatus") Integer orderStatus,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("bpmnStatus") Integer bpmnStatus,
      @Param("bpmnRemark") String bpmnRemark);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<PurOrderHeadDTO> findByExample(
      @Param("example") PurOrderHead example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<PurOrderHeadDTO> findByExample(@Param("example") PurOrderHead example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<PurOrderHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<PurOrderHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<PurOrderHeadDTO> findByFuzzySearch(
      @Param("example") PurOrderHead example,
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
  Page<PurOrderHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException;

  /**
   * 查询某个字段的取值查询一组对象，通常用于查询匹配父表主键id的一组对象
   *
   * @param fieldName 模型字段名字（表字段，通常是外键，与父表的主键id匹配）
   * @param value 字段取值
   * @return
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  List<PurOrderHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
