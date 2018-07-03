package com.pagoda.repo.purapply.custom;

import com.pagoda.api.dto.purapply.*;
import com.pagoda.domain.purapply.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * PurApplyDetail扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PurApplyDetailRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param applyId
   * @param applySeqno
   * @param goodsOrion
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param purUnitRate
   * @param requestQty
   * @param applyQty
   * @param confirmQty
   * @param invPrice
   * @param dealPurQty
   * @param dealSalQty
   * @param dealStatus
   * @param dealSalOrgId
   * @param calCusOrderQty
   * @param calOuterFerQty
   * @param calCusSalQty
   * @param calInvQty
   * @param calOnWayQty
   * @param calStockUpQty
   * @param calReplenishmentQty
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param planRecDate
   * @param remark
   * @param calPurRate
   * @param pageable
   * @return
   */
  Page<PurApplyDetailDTO> findBy(
      @Param("applyId") Long applyId,
      @Param("applySeqno") String applySeqno,
      @Param("goodsOrion") String goodsOrion,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("purUnitRate") java.math.BigDecimal purUnitRate,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("applyQty") java.math.BigDecimal applyQty,
      @Param("confirmQty") java.math.BigDecimal confirmQty,
      @Param("invPrice") java.math.BigDecimal invPrice,
      @Param("dealPurQty") java.math.BigDecimal dealPurQty,
      @Param("dealSalQty") java.math.BigDecimal dealSalQty,
      @Param("dealStatus") Integer dealStatus,
      @Param("dealSalOrgId") Long dealSalOrgId,
      @Param("calCusOrderQty") java.math.BigDecimal calCusOrderQty,
      @Param("calOuterFerQty") java.math.BigDecimal calOuterFerQty,
      @Param("calCusSalQty") java.math.BigDecimal calCusSalQty,
      @Param("calInvQty") java.math.BigDecimal calInvQty,
      @Param("calOnWayQty") java.math.BigDecimal calOnWayQty,
      @Param("calStockUpQty") java.math.BigDecimal calStockUpQty,
      @Param("calReplenishmentQty") java.math.BigDecimal calReplenishmentQty,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("remark") String remark,
      @Param("calPurRate") java.math.BigDecimal calPurRate,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param applyId
   * @param applySeqno
   * @param goodsOrion
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param purUnitRate
   * @param requestQty
   * @param applyQty
   * @param confirmQty
   * @param invPrice
   * @param dealPurQty
   * @param dealSalQty
   * @param dealStatus
   * @param dealSalOrgId
   * @param calCusOrderQty
   * @param calOuterFerQty
   * @param calCusSalQty
   * @param calInvQty
   * @param calOnWayQty
   * @param calStockUpQty
   * @param calReplenishmentQty
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param planRecDate
   * @param remark
   * @param calPurRate
   * @return
   */
  List<PurApplyDetailDTO> findBy(
      @Param("applyId") Long applyId,
      @Param("applySeqno") String applySeqno,
      @Param("goodsOrion") String goodsOrion,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("purUnitRate") java.math.BigDecimal purUnitRate,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("applyQty") java.math.BigDecimal applyQty,
      @Param("confirmQty") java.math.BigDecimal confirmQty,
      @Param("invPrice") java.math.BigDecimal invPrice,
      @Param("dealPurQty") java.math.BigDecimal dealPurQty,
      @Param("dealSalQty") java.math.BigDecimal dealSalQty,
      @Param("dealStatus") Integer dealStatus,
      @Param("dealSalOrgId") Long dealSalOrgId,
      @Param("calCusOrderQty") java.math.BigDecimal calCusOrderQty,
      @Param("calOuterFerQty") java.math.BigDecimal calOuterFerQty,
      @Param("calCusSalQty") java.math.BigDecimal calCusSalQty,
      @Param("calInvQty") java.math.BigDecimal calInvQty,
      @Param("calOnWayQty") java.math.BigDecimal calOnWayQty,
      @Param("calStockUpQty") java.math.BigDecimal calStockUpQty,
      @Param("calReplenishmentQty") java.math.BigDecimal calReplenishmentQty,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("remark") String remark,
      @Param("calPurRate") java.math.BigDecimal calPurRate);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<PurApplyDetailDTO> findByExample(
      @Param("example") PurApplyDetail example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<PurApplyDetailDTO> findByExample(@Param("example") PurApplyDetail example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<PurApplyDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<PurApplyDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<PurApplyDetailDTO> findByFuzzySearch(
      @Param("example") PurApplyDetail example,
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
  Page<PurApplyDetailDTO> findByField(
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
  List<PurApplyDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
