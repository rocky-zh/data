package com.pagoda.repo.group.custom;

import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.platform.jms.jpa.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.Field;
import java.util.List;

/**
 * SalConsignHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignHeadRepositoryImpl extends BaseRepositoryCustomImpl<SalConsignHead, Long>
    implements SalConsignHeadRepositoryCustom {

  @Override
  protected Class<SalConsignHead> getDomainClass() {
    return SalConsignHead.class;
  }

  @Override
  public Page<SalConsignHeadDTO> findBy(
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
      @Param("pageable") Pageable pageable) {
    SalConsignHead obj = SalConsignHead.toExample();
    obj.setConOrgCode(conOrgCode);
    obj.setConOrgId(conOrgId);
    obj.setConOrgName(conOrgName);
    obj.setConStatus(conStatus);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgName(cusOrgName);
    obj.setEntryDate(entryDate);
    obj.setNo(no);
    obj.setOrderId(orderId);
    obj.setOrderNo(orderNo);
    obj.setPreArrivalDate(preArrivalDate);
    obj.setPrintCount(printCount);
    obj.setPrintStatus(printStatus);
    obj.setShippedAmt(shippedAmt);
    obj.setShippedQty(shippedQty);
    obj.setTatalQty(tatalQty);
    obj.setTaxAmt(taxAmt);
    obj.setTotalAmt(totalAmt);
    obj.setTotalWeight(totalWeight);
    obj.setTransitLineNo(transitLineNo);
    obj.setWaveNo(waveNo);
    obj.setActive(active);
    Example<SalConsignHead> example = Example.of(obj);

    return findAll(example, pageable).map(SalConsignHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignHeadDTO> findBy(
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
      @Param("active") Boolean active) {
    SalConsignHead obj = SalConsignHead.toExample();
    obj.setConOrgCode(conOrgCode);
    obj.setConOrgId(conOrgId);
    obj.setConOrgName(conOrgName);
    obj.setConStatus(conStatus);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgName(cusOrgName);
    obj.setEntryDate(entryDate);
    obj.setNo(no);
    obj.setOrderId(orderId);
    obj.setOrderNo(orderNo);
    obj.setPreArrivalDate(preArrivalDate);
    obj.setPrintCount(printCount);
    obj.setPrintStatus(printStatus);
    obj.setShippedAmt(shippedAmt);
    obj.setShippedQty(shippedQty);
    obj.setTatalQty(tatalQty);
    obj.setTaxAmt(taxAmt);
    obj.setTotalAmt(totalAmt);
    obj.setTotalWeight(totalWeight);
    obj.setTransitLineNo(transitLineNo);
    obj.setWaveNo(waveNo);
    obj.setActive(active);
    Example<SalConsignHead> example = Example.of(obj);
    return findAll(example, null).map(SalConsignHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalConsignHeadDTO> findByExample(
      @Param("example") SalConsignHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalConsignHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignHeadDTO> findByExample(@Param("example") SalConsignHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalConsignHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalConsignHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalConsignHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalConsignHead.DTO_CONVERTER)
        .getContent();
  }

  //  @Override
  //  public int updateByBuilder(@Param("builder") JpaUpdateBuilder builder) {
  //    return executeUpdate(builder);
  //  }

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
  @Override
  public Page<SalConsignHeadDTO> findByFuzzySearch(
      @Param("example") SalConsignHead example,
      @Param("fields") List<String> fields,
      @Param("stringMatcher") ExampleMatcher.StringMatcher stringMatcher,
      @Param("pageable") Pageable pageable) {
    ExampleMatcher matcher = ExampleMatcher.matching();
    for (String field : fields) {
      switch (stringMatcher) {
        case STARTING:
          matcher = matcher.withMatcher(field, ExampleMatcher.GenericPropertyMatchers.startsWith());
          break;
        case ENDING:
          matcher = matcher.withMatcher(field, ExampleMatcher.GenericPropertyMatchers.endsWith());
          break;
        case CONTAINING:
          matcher = matcher.withMatcher(field, ExampleMatcher.GenericPropertyMatchers.contains());
          break;
        default:
          break;
      }
    }
    return findAll(Example.of(example, matcher), pageable).map(SalConsignHead.DTO_CONVERTER);
  }

  @Override
  public Page<SalConsignHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalConsignHead example = SalConsignHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalConsignHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
