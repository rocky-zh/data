package com.pagoda.repo.org.custom;

import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasPost扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasPostRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param postLeader
   * @param isBusRelated
   * @param remak
   * @param code
   * @param name
   * @param entId
   * @param depId
   * @param showOrder
   * @param isEnabled
   * @param pageable
   * @return
   */
  Page<BasPostDTO> findBy(
      @Param("postLeader") Long postLeader,
      @Param("isBusRelated") Integer isBusRelated,
      @Param("remak") String remak,
      @Param("code") String code,
      @Param("name") String name,
      @Param("entId") Long entId,
      @Param("depId") Long depId,
      @Param("showOrder") Integer showOrder,
      @Param("isEnabled") Integer isEnabled,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param postLeader
   * @param isBusRelated
   * @param remak
   * @param code
   * @param name
   * @param entId
   * @param depId
   * @param showOrder
   * @param isEnabled
   * @return
   */
  List<BasPostDTO> findBy(
      @Param("postLeader") Long postLeader,
      @Param("isBusRelated") Integer isBusRelated,
      @Param("remak") String remak,
      @Param("code") String code,
      @Param("name") String name,
      @Param("entId") Long entId,
      @Param("depId") Long depId,
      @Param("showOrder") Integer showOrder,
      @Param("isEnabled") Integer isEnabled);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasPostDTO> findByExample(
      @Param("example") BasPost example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasPostDTO> findByExample(@Param("example") BasPost example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasPostDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasPostDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasPostDTO> findByFuzzySearch(
      @Param("example") BasPost example,
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
  Page<BasPostDTO> findByField(
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
  List<BasPostDTO> findByField(@Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
