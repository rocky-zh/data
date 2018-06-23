package com.pagoda.repo.group.custom;

import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
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
   * @param apply_id
   * @param apply_price
   * @param apply_qty
   * @param bas_unit_code
   * @param bas_unit_id
   * @param bas_unit_name
   * @param cal_cus_order_qty
   * @param cal_cus_sal_qty
   * @param cal_inv_qty
   * @param cal_on_way_qty
   * @param cal_outer_fer_qty
   * @param cal_pur_rate
   * @param cal_replenishment_qty
   * @param cal_stock_up_qty
   * @param confirm_qty
   * @param deal_pur_qty
   * @param deal_sal_org_id
   * @param deal_sal_qty
   * @param deal_status
   * @param del_id
   * @param goods_level
   * @param goods_orion
   * @param inv_price
   * @param pur_unit_code
   * @param pur_unit_id
   * @param pur_unit_name
   * @param pur_unit_rate
   * @param request_qty
   * @param pageable
   * @return
   */
  Page<PurApplyDetailDTO> findBy(
      @Param("applyId") Long applyId,
      @Param("applyPrice") java.math.BigDecimal applyPrice,
      @Param("applyQty") Integer applyQty,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitName") String basUnitName,
      @Param("calCusOrderQty") Double calCusOrderQty,
      @Param("calCusSalQty") Double calCusSalQty,
      @Param("calInvQty") Double calInvQty,
      @Param("calOnWayQty") Double calOnWayQty,
      @Param("calOuterFerQty") Double calOuterFerQty,
      @Param("calPurRate") Double calPurRate,
      @Param("calReplenishmentQty") Double calReplenishmentQty,
      @Param("calStockUpQty") Double calStockUpQty,
      @Param("confirmQty") Integer confirmQty,
      @Param("dealPurQty") Integer dealPurQty,
      @Param("dealSalOrgId") String dealSalOrgId,
      @Param("dealSalQty") Integer dealSalQty,
      @Param("dealStatus") Integer dealStatus,
      @Param("delId") Integer delId,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsOrion") String goodsOrion,
      @Param("invPrice") java.math.BigDecimal invPrice,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitName") String purUnitName,
      @Param("purUnitRate") Double purUnitRate,
      @Param("requestQty") Integer requestQty,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param apply_id
   * @param apply_price
   * @param apply_qty
   * @param bas_unit_code
   * @param bas_unit_id
   * @param bas_unit_name
   * @param cal_cus_order_qty
   * @param cal_cus_sal_qty
   * @param cal_inv_qty
   * @param cal_on_way_qty
   * @param cal_outer_fer_qty
   * @param cal_pur_rate
   * @param cal_replenishment_qty
   * @param cal_stock_up_qty
   * @param confirm_qty
   * @param deal_pur_qty
   * @param deal_sal_org_id
   * @param deal_sal_qty
   * @param deal_status
   * @param del_id
   * @param goods_level
   * @param goods_orion
   * @param inv_price
   * @param pur_unit_code
   * @param pur_unit_id
   * @param pur_unit_name
   * @param pur_unit_rate
   * @param request_qty
   * @return
   */
  List<PurApplyDetailDTO> findBy(
      @Param("applyId") Long applyId,
      @Param("applyPrice") java.math.BigDecimal applyPrice,
      @Param("applyQty") Integer applyQty,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitName") String basUnitName,
      @Param("calCusOrderQty") Double calCusOrderQty,
      @Param("calCusSalQty") Double calCusSalQty,
      @Param("calInvQty") Double calInvQty,
      @Param("calOnWayQty") Double calOnWayQty,
      @Param("calOuterFerQty") Double calOuterFerQty,
      @Param("calPurRate") Double calPurRate,
      @Param("calReplenishmentQty") Double calReplenishmentQty,
      @Param("calStockUpQty") Double calStockUpQty,
      @Param("confirmQty") Integer confirmQty,
      @Param("dealPurQty") Integer dealPurQty,
      @Param("dealSalOrgId") String dealSalOrgId,
      @Param("dealSalQty") Integer dealSalQty,
      @Param("dealStatus") Integer dealStatus,
      @Param("delId") Integer delId,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsOrion") String goodsOrion,
      @Param("invPrice") java.math.BigDecimal invPrice,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitName") String purUnitName,
      @Param("purUnitRate") Double purUnitRate,
      @Param("requestQty") Integer requestQty);

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
   * @param pageable
   * @return
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  List<PurApplyDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
