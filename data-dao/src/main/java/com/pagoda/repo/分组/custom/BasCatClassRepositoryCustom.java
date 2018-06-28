package com.pagoda.repo.分组.custom;

import com.pagoda.api.dto.分组.*;
import com.pagoda.domain.分组.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasCatClass扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasCatClassRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param catId
   * @param code
   * @param entId
   * @param fullName
   * @param isEnabled
   * @param isLeaf
   * @param levelNum
   * @param name
   * @param parentCatClassCode
   * @param parentCatClassId
   * @param parentCatClassName
   * @param path
   * @param remark
   * @param showOrder
   * @param sourceId
   * @param tableId
   * @param pageable
   * @return
   */
  Page<BasCatClassDTO> findBy(
      @Param("catId") Long catId,
      @Param("code") String code,
      @Param("entId") Long entId,
      @Param("fullName") String fullName,
      @Param("isEnabled") Integer isEnabled,
      @Param("isLeaf") Integer isLeaf,
      @Param("levelNum") Integer levelNum,
      @Param("name") String name,
      @Param("parentCatClassCode") String parentCatClassCode,
      @Param("parentCatClassId") Long parentCatClassId,
      @Param("parentCatClassName") String parentCatClassName,
      @Param("path") String path,
      @Param("remark") String remark,
      @Param("showOrder") Integer showOrder,
      @Param("sourceId") Long sourceId,
      @Param("tableId") Integer tableId,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param catId
   * @param code
   * @param entId
   * @param fullName
   * @param isEnabled
   * @param isLeaf
   * @param levelNum
   * @param name
   * @param parentCatClassCode
   * @param parentCatClassId
   * @param parentCatClassName
   * @param path
   * @param remark
   * @param showOrder
   * @param sourceId
   * @param tableId
   * @return
   */
  List<BasCatClassDTO> findBy(
      @Param("catId") Long catId,
      @Param("code") String code,
      @Param("entId") Long entId,
      @Param("fullName") String fullName,
      @Param("isEnabled") Integer isEnabled,
      @Param("isLeaf") Integer isLeaf,
      @Param("levelNum") Integer levelNum,
      @Param("name") String name,
      @Param("parentCatClassCode") String parentCatClassCode,
      @Param("parentCatClassId") Long parentCatClassId,
      @Param("parentCatClassName") String parentCatClassName,
      @Param("path") String path,
      @Param("remark") String remark,
      @Param("showOrder") Integer showOrder,
      @Param("sourceId") Long sourceId,
      @Param("tableId") Integer tableId);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasCatClassDTO> findByExample(
      @Param("example") BasCatClass example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasCatClassDTO> findByExample(@Param("example") BasCatClass example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasCatClassDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasCatClassDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasCatClassDTO> findByFuzzySearch(
      @Param("example") BasCatClass example,
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
  Page<BasCatClassDTO> findByField(
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
  List<BasCatClassDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
