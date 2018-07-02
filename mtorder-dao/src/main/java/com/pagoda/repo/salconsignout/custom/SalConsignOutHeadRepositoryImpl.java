package com.pagoda.repo.salconsignout.custom;

import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.domain.salconsignout.*;
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
 * SalConsignOutHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignOutHeadRepositoryImpl
    extends BaseRepositoryCustomImpl<SalConsignOutHead, Long>
    implements SalConsignOutHeadRepositoryCustom {

  @Override
  protected Class<SalConsignOutHead> getDomainClass() {
    return SalConsignOutHead.class;
  }

  @Override
  public Page<SalConsignOutHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("transitLineNo") String transitLineNo,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("remark") String remark,
      @Param("confirmUserCode") String confirmUserCode,
      @Param("confirmUserName") String confirmUserName,
      @Param("confirmTime") java.sql.Timestamp confirmTime,
      @Param("pageable") Pageable pageable) {
    SalConsignOutHead obj = SalConsignOutHead.toExample();
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setConId(conId);
    obj.setConSeqno(conSeqno);
    obj.setPreArrivalDate(preArrivalDate);
    obj.setConOrgId(conOrgId);
    obj.setConOrgCode(conOrgCode);
    obj.setConOrgName(conOrgName);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setTransitLineNo(transitLineNo);
    obj.setShippedQty(shippedQty);
    obj.setShippedGrossWeight(shippedGrossWeight);
    obj.setShippedNetWeight(shippedNetWeight);
    obj.setShippedVolume(shippedVolume);
    obj.setShippedAmt(shippedAmt);
    obj.setTaxAmt(taxAmt);
    obj.setStockoutStatus(stockoutStatus);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setAuditTime(auditTime);
    obj.setRemark(remark);
    obj.setConfirmUserCode(confirmUserCode);
    obj.setConfirmUserName(confirmUserName);
    obj.setConfirmTime(confirmTime);
    Example<SalConsignOutHead> example = Example.of(obj);

    return findAll(example, pageable).map(SalConsignOutHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("transitLineNo") String transitLineNo,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("remark") String remark,
      @Param("confirmUserCode") String confirmUserCode,
      @Param("confirmUserName") String confirmUserName,
      @Param("confirmTime") java.sql.Timestamp confirmTime) {
    SalConsignOutHead obj = SalConsignOutHead.toExample();
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setConId(conId);
    obj.setConSeqno(conSeqno);
    obj.setPreArrivalDate(preArrivalDate);
    obj.setConOrgId(conOrgId);
    obj.setConOrgCode(conOrgCode);
    obj.setConOrgName(conOrgName);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setTransitLineNo(transitLineNo);
    obj.setShippedQty(shippedQty);
    obj.setShippedGrossWeight(shippedGrossWeight);
    obj.setShippedNetWeight(shippedNetWeight);
    obj.setShippedVolume(shippedVolume);
    obj.setShippedAmt(shippedAmt);
    obj.setTaxAmt(taxAmt);
    obj.setStockoutStatus(stockoutStatus);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setAuditTime(auditTime);
    obj.setRemark(remark);
    obj.setConfirmUserCode(confirmUserCode);
    obj.setConfirmUserName(confirmUserName);
    obj.setConfirmTime(confirmTime);
    Example<SalConsignOutHead> example = Example.of(obj);
    return findAll(example, null).map(SalConsignOutHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalConsignOutHeadDTO> findByExample(
      @Param("example") SalConsignOutHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalConsignOutHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutHeadDTO> findByExample(@Param("example") SalConsignOutHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalConsignOutHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalConsignOutHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalConsignOutHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalConsignOutHead.DTO_CONVERTER)
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
  public Page<SalConsignOutHeadDTO> findByFuzzySearch(
      @Param("example") SalConsignOutHead example,
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
    return findAll(Example.of(example, matcher), pageable).map(SalConsignOutHead.DTO_CONVERTER);
  }

  @Override
  public Page<SalConsignOutHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalConsignOutHead example = SalConsignOutHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalConsignOutHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
