package com.pagoda.repo.cat.custom;

import com.pagoda.api.dto.cat.*;
import com.pagoda.domain.cat.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasCatClassRel扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasCatClassRelRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param objId
   * @param objCode
   * @param objName
   * @param catClassId
   * @param catClassCode
   * @param catClassName
   * @param uniqueId
   * @param entId
   * @param path
   * @param catId
   * @param tableId
   * @param pageable
   * @return
   */
  Page<BasCatClassRelDTO> findBy(
      @Param("objId") Long objId,
      @Param("objCode") String objCode,
      @Param("objName") String objName,
      @Param("catClassId") Long catClassId,
      @Param("catClassCode") String catClassCode,
      @Param("catClassName") String catClassName,
      @Param("uniqueId") Long uniqueId,
      @Param("entId") Long entId,
      @Param("path") String path,
      @Param("catId") Long catId,
      @Param("tableId") Long tableId,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param objId
   * @param objCode
   * @param objName
   * @param catClassId
   * @param catClassCode
   * @param catClassName
   * @param uniqueId
   * @param entId
   * @param path
   * @param catId
   * @param tableId
   * @return
   */
  List<BasCatClassRelDTO> findBy(
      @Param("objId") Long objId,
      @Param("objCode") String objCode,
      @Param("objName") String objName,
      @Param("catClassId") Long catClassId,
      @Param("catClassCode") String catClassCode,
      @Param("catClassName") String catClassName,
      @Param("uniqueId") Long uniqueId,
      @Param("entId") Long entId,
      @Param("path") String path,
      @Param("catId") Long catId,
      @Param("tableId") Long tableId);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasCatClassRelDTO> findByExample(
      @Param("example") BasCatClassRel example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasCatClassRelDTO> findByExample(@Param("example") BasCatClassRel example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasCatClassRelDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasCatClassRelDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasCatClassRelDTO> findByFuzzySearch(
      @Param("example") BasCatClassRel example,
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
  Page<BasCatClassRelDTO> findByField(
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
  List<BasCatClassRelDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
