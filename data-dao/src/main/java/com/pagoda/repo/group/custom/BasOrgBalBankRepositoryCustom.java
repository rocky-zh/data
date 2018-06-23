package com.pagoda.repo.group.custom;

import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * BasOrgBalBank扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasOrgBalBankRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param account_name
   * @param bank
   * @param bank_account_no
   * @param city_code
   * @param city_name
   * @param province_code
   * @param province_name
   * @param register_bank
   * @param active
   * @param pageable
   * @return
   */
  Page<BasOrgBalBankDTO> findBy(
      @Param("accountName") String accountName,
      @Param("bank") String bank,
      @Param("bankAccountNo") String bankAccountNo,
      @Param("cityCode") String cityCode,
      @Param("cityName") String cityName,
      @Param("provinceCode") String provinceCode,
      @Param("provinceName") String provinceName,
      @Param("registerBank") String registerBank,
      @Param("active") Boolean active,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param account_name
   * @param bank
   * @param bank_account_no
   * @param city_code
   * @param city_name
   * @param province_code
   * @param province_name
   * @param register_bank
   * @param active
   * @return
   */
  List<BasOrgBalBankDTO> findBy(
      @Param("accountName") String accountName,
      @Param("bank") String bank,
      @Param("bankAccountNo") String bankAccountNo,
      @Param("cityCode") String cityCode,
      @Param("cityName") String cityName,
      @Param("provinceCode") String provinceCode,
      @Param("provinceName") String provinceName,
      @Param("registerBank") String registerBank,
      @Param("active") Boolean active);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<BasOrgBalBankDTO> findByExample(
      @Param("example") BasOrgBalBank example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<BasOrgBalBankDTO> findByExample(@Param("example") BasOrgBalBank example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<BasOrgBalBankDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<BasOrgBalBankDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<BasOrgBalBankDTO> findByFuzzySearch(
      @Param("example") BasOrgBalBank example,
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
  Page<BasOrgBalBankDTO> findByField(
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
  List<BasOrgBalBankDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
