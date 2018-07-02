package com.pagoda.repo.salconsign.custom;

import com.pagoda.api.dto.salconsign.*;
import com.pagoda.domain.salconsign.*;
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
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("waveNo") String waveNo,
      @Param("tatalQty") java.math.BigDecimal tatalQty,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("entryDate") java.sql.Timestamp entryDate,
      @Param("conStatus") Integer conStatus,
      @Param("printStatus") Integer printStatus,
      @Param("printCount") Integer printCount,
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("transitLineNo") String transitLineNo,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    SalConsignHead obj = SalConsignHead.toExample();
    obj.setOrderId(orderId);
    obj.setOrderNo(orderNo);
    obj.setWaveNo(waveNo);
    obj.setTatalQty(tatalQty);
    obj.setTotalAmt(totalAmt);
    obj.setEntryDate(entryDate);
    obj.setConStatus(conStatus);
    obj.setPrintStatus(printStatus);
    obj.setPrintCount(printCount);
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setConOrgId(conOrgId);
    obj.setConOrgCode(conOrgCode);
    obj.setConOrgName(conOrgName);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setTransitLineNo(transitLineNo);
    obj.setTaxAmt(taxAmt);
    obj.setShippedQty(shippedQty);
    obj.setShippedAmt(shippedAmt);
    obj.setPreArrivalDate(preArrivalDate);
    obj.setRemark(remark);
    Example<SalConsignHead> example = Example.of(obj);

    return findAll(example, pageable).map(SalConsignHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignHeadDTO> findBy(
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("waveNo") String waveNo,
      @Param("tatalQty") java.math.BigDecimal tatalQty,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("entryDate") java.sql.Timestamp entryDate,
      @Param("conStatus") Integer conStatus,
      @Param("printStatus") Integer printStatus,
      @Param("printCount") Integer printCount,
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("transitLineNo") String transitLineNo,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("remark") String remark) {
    SalConsignHead obj = SalConsignHead.toExample();
    obj.setOrderId(orderId);
    obj.setOrderNo(orderNo);
    obj.setWaveNo(waveNo);
    obj.setTatalQty(tatalQty);
    obj.setTotalAmt(totalAmt);
    obj.setEntryDate(entryDate);
    obj.setConStatus(conStatus);
    obj.setPrintStatus(printStatus);
    obj.setPrintCount(printCount);
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setConOrgId(conOrgId);
    obj.setConOrgCode(conOrgCode);
    obj.setConOrgName(conOrgName);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setTransitLineNo(transitLineNo);
    obj.setTaxAmt(taxAmt);
    obj.setShippedQty(shippedQty);
    obj.setShippedAmt(shippedAmt);
    obj.setPreArrivalDate(preArrivalDate);
    obj.setRemark(remark);
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
