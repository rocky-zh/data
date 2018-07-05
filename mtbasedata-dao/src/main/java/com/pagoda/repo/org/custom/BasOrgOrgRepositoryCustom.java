package com.pagoda.repo.org.custom;

import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasOrgOrg扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasOrgOrgRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param dualDepotId
   * @param dualOrgId
   * @param isOrgTaxRate
   * @param isOrgEnabled
   * @param isUsedWms
   * @param orgId
   * @param salConOutDepotId
   * @param salRetInDepotId
   * @param purRecInDepotId
   * @param purRetOutDepotId
   * @param pageable
   * @return
   */
  Page<BasOrgOrgDTO> findBy(
      @Param("dualDepotId") Long dualDepotId,
      @Param("dualOrgId") Long dualOrgId,
      @Param("isOrgTaxRate") Integer isOrgTaxRate,
      @Param("isOrgEnabled") Integer isOrgEnabled,
      @Param("isUsedWms") Integer isUsedWms,
      @Param("orgId") Long orgId,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salRetInDepotId") Long salRetInDepotId,
      @Param("purRecInDepotId") Long purRecInDepotId,
      @Param("purRetOutDepotId") Long purRetOutDepotId,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param dualDepotId
   * @param dualOrgId
   * @param isOrgTaxRate
   * @param isOrgEnabled
   * @param isUsedWms
   * @param orgId
   * @param salConOutDepotId
   * @param salRetInDepotId
   * @param purRecInDepotId
   * @param purRetOutDepotId
   * @return
   */
  List<BasOrgOrgDTO> findBy(
      @Param("dualDepotId") Long dualDepotId,
      @Param("dualOrgId") Long dualOrgId,
      @Param("isOrgTaxRate") Integer isOrgTaxRate,
      @Param("isOrgEnabled") Integer isOrgEnabled,
      @Param("isUsedWms") Integer isUsedWms,
      @Param("orgId") Long orgId,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salRetInDepotId") Long salRetInDepotId,
      @Param("purRecInDepotId") Long purRecInDepotId,
      @Param("purRetOutDepotId") Long purRetOutDepotId);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasOrgOrgDTO> findByExample(
      @Param("example") BasOrgOrg example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasOrgOrgDTO> findByExample(@Param("example") BasOrgOrg example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasOrgOrgDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasOrgOrgDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasOrgOrgDTO> findByFuzzySearch(
      @Param("example") BasOrgOrg example,
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
  Page<BasOrgOrgDTO> findByField(
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
  List<BasOrgOrgDTO> findByField(@Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
