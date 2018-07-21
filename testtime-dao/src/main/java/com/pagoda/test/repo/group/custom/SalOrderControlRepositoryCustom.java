package com.pagoda.test.repo.group.custom;

import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.domain.group.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalOrderControl扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalOrderControlRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param isCtrlDep
   * @param beforeDays
   * @param allowPosGapD
   * @param allowPosGapM
   * @param isCtrlDepInput
   * @param isCtrlAccnt
   * @param isCtrlDuty
   * @param isCtrlVrfyTrans
   * @param isCtrlDistCyc
   * @param isCtrlMustSell
   * @param isCtrlRouteSplit
   * @param isCtrlSafetyStock
   * @param allowSafetyStockTimes
   * @param isCtrlExeBatchPolicy
   * @param isCtrlOneOrder
   * @param placeOrderTime1
   * @param placeOrderTime2
   * @param isCtrlReturn
   * @param returnGoodsTime1
   * @param returnGoodsTime2
   * @param enabled
   * @param remark
   * @param pageable
   * @return
   */
  Page<SalOrderControlDTO> findBy(
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("isCtrlDep") Integer isCtrlDep,
      @Param("beforeDays") Integer beforeDays,
      @Param("allowPosGapD") Integer allowPosGapD,
      @Param("allowPosGapM") Integer allowPosGapM,
      @Param("isCtrlDepInput") Integer isCtrlDepInput,
      @Param("isCtrlAccnt") Integer isCtrlAccnt,
      @Param("isCtrlDuty") Integer isCtrlDuty,
      @Param("isCtrlVrfyTrans") Integer isCtrlVrfyTrans,
      @Param("isCtrlDistCyc") Integer isCtrlDistCyc,
      @Param("isCtrlMustSell") Integer isCtrlMustSell,
      @Param("isCtrlRouteSplit") Integer isCtrlRouteSplit,
      @Param("isCtrlSafetyStock") Integer isCtrlSafetyStock,
      @Param("allowSafetyStockTimes") java.math.BigDecimal allowSafetyStockTimes,
      @Param("isCtrlExeBatchPolicy") Integer isCtrlExeBatchPolicy,
      @Param("isCtrlOneOrder") Integer isCtrlOneOrder,
      @Param("placeOrderTime1") java.sql.Time placeOrderTime1,
      @Param("placeOrderTime2") java.sql.Time placeOrderTime2,
      @Param("isCtrlReturn") Integer isCtrlReturn,
      @Param("returnGoodsTime1") java.sql.Time returnGoodsTime1,
      @Param("returnGoodsTime2") java.sql.Time returnGoodsTime2,
      @Param("enabled") Integer enabled,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param isCtrlDep
   * @param beforeDays
   * @param allowPosGapD
   * @param allowPosGapM
   * @param isCtrlDepInput
   * @param isCtrlAccnt
   * @param isCtrlDuty
   * @param isCtrlVrfyTrans
   * @param isCtrlDistCyc
   * @param isCtrlMustSell
   * @param isCtrlRouteSplit
   * @param isCtrlSafetyStock
   * @param allowSafetyStockTimes
   * @param isCtrlExeBatchPolicy
   * @param isCtrlOneOrder
   * @param placeOrderTime1
   * @param placeOrderTime2
   * @param isCtrlReturn
   * @param returnGoodsTime1
   * @param returnGoodsTime2
   * @param enabled
   * @param remark
   * @return
   */
  List<SalOrderControlDTO> findBy(
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("isCtrlDep") Integer isCtrlDep,
      @Param("beforeDays") Integer beforeDays,
      @Param("allowPosGapD") Integer allowPosGapD,
      @Param("allowPosGapM") Integer allowPosGapM,
      @Param("isCtrlDepInput") Integer isCtrlDepInput,
      @Param("isCtrlAccnt") Integer isCtrlAccnt,
      @Param("isCtrlDuty") Integer isCtrlDuty,
      @Param("isCtrlVrfyTrans") Integer isCtrlVrfyTrans,
      @Param("isCtrlDistCyc") Integer isCtrlDistCyc,
      @Param("isCtrlMustSell") Integer isCtrlMustSell,
      @Param("isCtrlRouteSplit") Integer isCtrlRouteSplit,
      @Param("isCtrlSafetyStock") Integer isCtrlSafetyStock,
      @Param("allowSafetyStockTimes") java.math.BigDecimal allowSafetyStockTimes,
      @Param("isCtrlExeBatchPolicy") Integer isCtrlExeBatchPolicy,
      @Param("isCtrlOneOrder") Integer isCtrlOneOrder,
      @Param("placeOrderTime1") java.sql.Time placeOrderTime1,
      @Param("placeOrderTime2") java.sql.Time placeOrderTime2,
      @Param("isCtrlReturn") Integer isCtrlReturn,
      @Param("returnGoodsTime1") java.sql.Time returnGoodsTime1,
      @Param("returnGoodsTime2") java.sql.Time returnGoodsTime2,
      @Param("enabled") Integer enabled,
      @Param("remark") String remark);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalOrderControlDTO> findByExample(
      @Param("example") SalOrderControl example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalOrderControlDTO> findByExample(@Param("example") SalOrderControl example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalOrderControlDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalOrderControlDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

  /**
   * 复杂条件更新
   *
   * @param builder
   * @return
   */
  int updateByBuilder(@Param("builder") JpaUpdateBuilder builder);

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
  Page<SalOrderControlDTO> findByFuzzySearch(
      @Param("example") SalOrderControl example,
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
  Page<SalOrderControlDTO> findByField(
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
  List<SalOrderControlDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
