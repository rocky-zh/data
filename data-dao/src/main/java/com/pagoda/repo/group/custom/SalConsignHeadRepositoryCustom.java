package com.pagoda.repo.group.custom;

import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * SalConsignHead扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignHeadRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param con_org_code
   * @param con_org_id
   * @param con_org_name
   * @param con_status
   * @param cus_org_code
   * @param cus_org_id
   * @param cus_org_name
   * @param entry_date
   * @param no
   * @param order_id
   * @param order_no
   * @param pre_arrival_date
   * @param print_count
   * @param print_status
   * @param shipped_amt
   * @param shipped_qty
   * @param tatal_qty
   * @param tax_amt
   * @param total_amt
   * @param total_weight
   * @param transit_line_no
   * @param wave_no
   * @param active
   * @param pageable
   * @return
   */
  Page<SalConsignHeadDTO> findBy(
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgName") String conOrgName,
      @Param("conStatus") Integer conStatus,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgName") String cusOrgName,
      @Param("entryDate") java.sql.Timestamp entryDate,
      @Param("no") String no,
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("printCount") Integer printCount,
      @Param("printStatus") Integer printStatus,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("tatalQty") java.math.BigDecimal tatalQty,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("totalWeight") java.math.BigDecimal totalWeight,
      @Param("transitLineNo") String transitLineNo,
      @Param("waveNo") String waveNo,
      @Param("active") Boolean active,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param con_org_code
   * @param con_org_id
   * @param con_org_name
   * @param con_status
   * @param cus_org_code
   * @param cus_org_id
   * @param cus_org_name
   * @param entry_date
   * @param no
   * @param order_id
   * @param order_no
   * @param pre_arrival_date
   * @param print_count
   * @param print_status
   * @param shipped_amt
   * @param shipped_qty
   * @param tatal_qty
   * @param tax_amt
   * @param total_amt
   * @param total_weight
   * @param transit_line_no
   * @param wave_no
   * @param active
   * @return
   */
  List<SalConsignHeadDTO> findBy(
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgName") String conOrgName,
      @Param("conStatus") Integer conStatus,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgName") String cusOrgName,
      @Param("entryDate") java.sql.Timestamp entryDate,
      @Param("no") String no,
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("printCount") Integer printCount,
      @Param("printStatus") Integer printStatus,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("tatalQty") java.math.BigDecimal tatalQty,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("totalWeight") java.math.BigDecimal totalWeight,
      @Param("transitLineNo") String transitLineNo,
      @Param("waveNo") String waveNo,
      @Param("active") Boolean active);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<SalConsignHeadDTO> findByExample(
      @Param("example") SalConsignHead example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<SalConsignHeadDTO> findByExample(@Param("example") SalConsignHead example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<SalConsignHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<SalConsignHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

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
  Page<SalConsignHeadDTO> findByFuzzySearch(
      @Param("example") SalConsignHead example,
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
  Page<SalConsignHeadDTO> findByField(
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
  List<SalConsignHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
