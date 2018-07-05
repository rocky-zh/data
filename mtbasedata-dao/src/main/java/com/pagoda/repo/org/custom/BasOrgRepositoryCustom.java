package com.pagoda.repo.org.custom;

import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasOrg扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasOrgRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param isCus
   * @param isOrg
   * @param isVen
   * @param isOut
   * @param isDep
   * @param depCode
   * @param depId
   * @param depName
   * @param isBal
   * @param isOrgGroup
   * @param balOrgId
   * @param balOrgName
   * @param registerAddress
   * @param address
   * @param contactPerson
   * @param telephone
   * @param mobilephone
   * @param email
   * @param code
   * @param name
   * @param entId
   * @param isEnabled
   * @param remark
   * @param searchWord
   * @param showOrder
   * @param pageable
   * @return
   */
  Page<BasOrgDTO> findBy(
      @Param("isCus") Integer isCus,
      @Param("isOrg") Integer isOrg,
      @Param("isVen") Integer isVen,
      @Param("isOut") Integer isOut,
      @Param("isDep") Integer isDep,
      @Param("depCode") String depCode,
      @Param("depId") Long depId,
      @Param("depName") String depName,
      @Param("isBal") Integer isBal,
      @Param("isOrgGroup") Integer isOrgGroup,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("registerAddress") String registerAddress,
      @Param("address") String address,
      @Param("contactPerson") String contactPerson,
      @Param("telephone") String telephone,
      @Param("mobilephone") String mobilephone,
      @Param("email") String email,
      @Param("code") String code,
      @Param("name") String name,
      @Param("entId") Long entId,
      @Param("isEnabled") Integer isEnabled,
      @Param("remark") String remark,
      @Param("searchWord") String searchWord,
      @Param("showOrder") Integer showOrder,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param isCus
   * @param isOrg
   * @param isVen
   * @param isOut
   * @param isDep
   * @param depCode
   * @param depId
   * @param depName
   * @param isBal
   * @param isOrgGroup
   * @param balOrgId
   * @param balOrgName
   * @param registerAddress
   * @param address
   * @param contactPerson
   * @param telephone
   * @param mobilephone
   * @param email
   * @param code
   * @param name
   * @param entId
   * @param isEnabled
   * @param remark
   * @param searchWord
   * @param showOrder
   * @return
   */
  List<BasOrgDTO> findBy(
      @Param("isCus") Integer isCus,
      @Param("isOrg") Integer isOrg,
      @Param("isVen") Integer isVen,
      @Param("isOut") Integer isOut,
      @Param("isDep") Integer isDep,
      @Param("depCode") String depCode,
      @Param("depId") Long depId,
      @Param("depName") String depName,
      @Param("isBal") Integer isBal,
      @Param("isOrgGroup") Integer isOrgGroup,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("registerAddress") String registerAddress,
      @Param("address") String address,
      @Param("contactPerson") String contactPerson,
      @Param("telephone") String telephone,
      @Param("mobilephone") String mobilephone,
      @Param("email") String email,
      @Param("code") String code,
      @Param("name") String name,
      @Param("entId") Long entId,
      @Param("isEnabled") Integer isEnabled,
      @Param("remark") String remark,
      @Param("searchWord") String searchWord,
      @Param("showOrder") Integer showOrder);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasOrgDTO> findByExample(
      @Param("example") BasOrg example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasOrgDTO> findByExample(@Param("example") BasOrg example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasOrgDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasOrgDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasOrgDTO> findByFuzzySearch(
      @Param("example") BasOrg example,
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
  Page<BasOrgDTO> findByField(
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
  List<BasOrgDTO> findByField(@Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
