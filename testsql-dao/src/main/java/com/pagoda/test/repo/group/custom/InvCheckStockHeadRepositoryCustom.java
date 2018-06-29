package com.pagoda.test.repo.group.custom;

import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.domain.group.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * InvCheckStockHead扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface InvCheckStockHeadRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param active
   * @param adjustDate
   * @param adjustUserId
   * @param billDate
   * @param billNo
   * @param billType
   * @param checkQty
   * @param checkStatus
   * @param checkType
   * @param depotCode
   * @param depotId
   * @param depotName
   * @param enabled
   * @param entId
   * @param periodNo
   * @param remark
   * @param ioLimit
   * @param pageable
   * @return
   */
  Page<InvCheckStockHeadDTO> findBy(
      @Param("active") Boolean active,
      @Param("adjustDate") java.sql.Timestamp adjustDate,
      @Param("adjustUserId") String adjustUserId,
      @Param("billDate") java.util.Date billDate,
      @Param("billNo") Long billNo,
      @Param("billType") String billType,
      @Param("checkQty") Long checkQty,
      @Param("checkStatus") Integer checkStatus,
      @Param("checkType") Integer checkType,
      @Param("depotCode") String depotCode,
      @Param("depotId") Long depotId,
      @Param("depotName") String depotName,
      @Param("enabled") Boolean enabled,
      @Param("entId") Long entId,
      @Param("periodNo") Long periodNo,
      @Param("remark") String remark,
      @Param("ioLimit") Boolean ioLimit,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param active
   * @param adjustDate
   * @param adjustUserId
   * @param billDate
   * @param billNo
   * @param billType
   * @param checkQty
   * @param checkStatus
   * @param checkType
   * @param depotCode
   * @param depotId
   * @param depotName
   * @param enabled
   * @param entId
   * @param periodNo
   * @param remark
   * @param ioLimit
   * @return
   */
  List<InvCheckStockHeadDTO> findBy(
      @Param("active") Boolean active,
      @Param("adjustDate") java.sql.Timestamp adjustDate,
      @Param("adjustUserId") String adjustUserId,
      @Param("billDate") java.util.Date billDate,
      @Param("billNo") Long billNo,
      @Param("billType") String billType,
      @Param("checkQty") Long checkQty,
      @Param("checkStatus") Integer checkStatus,
      @Param("checkType") Integer checkType,
      @Param("depotCode") String depotCode,
      @Param("depotId") Long depotId,
      @Param("depotName") String depotName,
      @Param("enabled") Boolean enabled,
      @Param("entId") Long entId,
      @Param("periodNo") Long periodNo,
      @Param("remark") String remark,
      @Param("ioLimit") Boolean ioLimit);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<InvCheckStockHeadDTO> findByExample(
      @Param("example") InvCheckStockHead example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<InvCheckStockHeadDTO> findByExample(@Param("example") InvCheckStockHead example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<InvCheckStockHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<InvCheckStockHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<InvCheckStockHeadDTO> findByFuzzySearch(
      @Param("example") InvCheckStockHead example,
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
  Page<InvCheckStockHeadDTO> findByField(
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
  List<InvCheckStockHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
