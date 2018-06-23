package com.pagoda.repo.group.custom;

import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalConsignDetail扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignDetailRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param actual_amt
   * @param con_id
   * @param con_no
   * @param discount_price
   * @param discount_rate
   * @param enabled
   * @param goods_code
   * @param goods_id
   * @param goods_name
   * @param goods_spec
   * @param gross_weight
   * @param net_weight
   * @param order_id
   * @param order_no
   * @param price
   * @param qty
   * @param sal_con_out_depot_code
   * @param sal_con_out_depot_id
   * @param sal_con_out_depot_name
   * @param sal_unit_code
   * @param sal_unit_id
   * @param sal_unit_name
   * @param sal_unit_rate
   * @param shipped_amt
   * @param shipped_count
   * @param shipped_gross_weight
   * @param shipped_net_weight
   * @param shipped_price
   * @param shipped_qty
   * @param shipped_volume
   * @param tax_amt
   * @param tax_rate
   * @param total_amt
   * @param volume
   * @param pageable
   * @return
   */
  Page<SalConsignDetailDTO> findBy(
      @Param("actualAmt") java.math.BigDecimal actualAmt,
      @Param("conId") Long conId,
      @Param("conNo") String conNo,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("enabled") Boolean enabled,
      @Param("goodsCode") String goodsCode,
      @Param("goodsId") Long goodsId,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("grossWeight") java.math.BigDecimal grossWeight,
      @Param("netWeight") java.math.BigDecimal netWeight,
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("price") java.math.BigDecimal price,
      @Param("qty") java.math.BigDecimal qty,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("shippedCount") Integer shippedCount,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("volume") java.math.BigDecimal volume,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param actual_amt
   * @param con_id
   * @param con_no
   * @param discount_price
   * @param discount_rate
   * @param enabled
   * @param goods_code
   * @param goods_id
   * @param goods_name
   * @param goods_spec
   * @param gross_weight
   * @param net_weight
   * @param order_id
   * @param order_no
   * @param price
   * @param qty
   * @param sal_con_out_depot_code
   * @param sal_con_out_depot_id
   * @param sal_con_out_depot_name
   * @param sal_unit_code
   * @param sal_unit_id
   * @param sal_unit_name
   * @param sal_unit_rate
   * @param shipped_amt
   * @param shipped_count
   * @param shipped_gross_weight
   * @param shipped_net_weight
   * @param shipped_price
   * @param shipped_qty
   * @param shipped_volume
   * @param tax_amt
   * @param tax_rate
   * @param total_amt
   * @param volume
   * @return
   */
  List<SalConsignDetailDTO> findBy(
      @Param("actualAmt") java.math.BigDecimal actualAmt,
      @Param("conId") Long conId,
      @Param("conNo") String conNo,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("enabled") Boolean enabled,
      @Param("goodsCode") String goodsCode,
      @Param("goodsId") Long goodsId,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("grossWeight") java.math.BigDecimal grossWeight,
      @Param("netWeight") java.math.BigDecimal netWeight,
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("price") java.math.BigDecimal price,
      @Param("qty") java.math.BigDecimal qty,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("shippedCount") Integer shippedCount,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("volume") java.math.BigDecimal volume);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalConsignDetailDTO> findByExample(
      @Param("example") SalConsignDetail example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalConsignDetailDTO> findByExample(@Param("example") SalConsignDetail example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalConsignDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalConsignDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<SalConsignDetailDTO> findByFuzzySearch(
      @Param("example") SalConsignDetail example,
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
  Page<SalConsignDetailDTO> findByField(
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
  List<SalConsignDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
