package com.pagoda.repo.salconsignreturn.custom;

import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.domain.salconsignreturn.*;
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
 * SalConsignReturnHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignReturnHeadRepositoryImpl
    extends BaseRepositoryCustomImpl<SalConsignReturnHead, Long>
    implements SalConsignReturnHeadRepositoryCustom {

  @Override
  protected Class<SalConsignReturnHead> getDomainClass() {
    return SalConsignReturnHead.class;
  }

  @Override
  public Page<SalConsignReturnHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("returnType") Integer returnType,
      @Param("returnDate") java.util.Date returnDate,
      @Param("returnQty") java.math.BigDecimal returnQty,
      @Param("transitLineNo") String transitLineNo,
      @Param("stockinQty") java.math.BigDecimal stockinQty,
      @Param("stockinGrossWeight") java.math.BigDecimal stockinGrossWeight,
      @Param("stockinNetWeight") java.math.BigDecimal stockinNetWeight,
      @Param("totalTaxAmt") java.math.BigDecimal totalTaxAmt,
      @Param("totalReturnAmt") java.math.BigDecimal totalReturnAmt,
      @Param("totalStockinAmt") java.math.BigDecimal totalStockinAmt,
      @Param("status") Integer status,
      @Param("printCount") Integer printCount,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.util.Date auditTime,
      @Param("remark") String remark,
      @Param("note") String note,
      @Param("pageable") Pageable pageable) {
    SalConsignReturnHead obj = SalConsignReturnHead.toExample();
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setArrOrgId(arrOrgId);
    obj.setArrOrgCode(arrOrgCode);
    obj.setArrOrgName(arrOrgName);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setReturnType(returnType);
    obj.setReturnDate(returnDate);
    obj.setReturnQty(returnQty);
    obj.setTransitLineNo(transitLineNo);
    obj.setStockinQty(stockinQty);
    obj.setStockinGrossWeight(stockinGrossWeight);
    obj.setStockinNetWeight(stockinNetWeight);
    obj.setTotalTaxAmt(totalTaxAmt);
    obj.setTotalReturnAmt(totalReturnAmt);
    obj.setTotalStockinAmt(totalStockinAmt);
    obj.setStatus(status);
    obj.setPrintCount(printCount);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setAuditTime(auditTime);
    obj.setRemark(remark);
    obj.setNote(note);
    Example<SalConsignReturnHead> example = Example.of(obj);

    return findAll(example, pageable).map(SalConsignReturnHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignReturnHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("returnType") Integer returnType,
      @Param("returnDate") java.util.Date returnDate,
      @Param("returnQty") java.math.BigDecimal returnQty,
      @Param("transitLineNo") String transitLineNo,
      @Param("stockinQty") java.math.BigDecimal stockinQty,
      @Param("stockinGrossWeight") java.math.BigDecimal stockinGrossWeight,
      @Param("stockinNetWeight") java.math.BigDecimal stockinNetWeight,
      @Param("totalTaxAmt") java.math.BigDecimal totalTaxAmt,
      @Param("totalReturnAmt") java.math.BigDecimal totalReturnAmt,
      @Param("totalStockinAmt") java.math.BigDecimal totalStockinAmt,
      @Param("status") Integer status,
      @Param("printCount") Integer printCount,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.util.Date auditTime,
      @Param("remark") String remark,
      @Param("note") String note) {
    SalConsignReturnHead obj = SalConsignReturnHead.toExample();
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setArrOrgId(arrOrgId);
    obj.setArrOrgCode(arrOrgCode);
    obj.setArrOrgName(arrOrgName);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setReturnType(returnType);
    obj.setReturnDate(returnDate);
    obj.setReturnQty(returnQty);
    obj.setTransitLineNo(transitLineNo);
    obj.setStockinQty(stockinQty);
    obj.setStockinGrossWeight(stockinGrossWeight);
    obj.setStockinNetWeight(stockinNetWeight);
    obj.setTotalTaxAmt(totalTaxAmt);
    obj.setTotalReturnAmt(totalReturnAmt);
    obj.setTotalStockinAmt(totalStockinAmt);
    obj.setStatus(status);
    obj.setPrintCount(printCount);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setAuditTime(auditTime);
    obj.setRemark(remark);
    obj.setNote(note);
    Example<SalConsignReturnHead> example = Example.of(obj);
    return findAll(example, null).map(SalConsignReturnHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalConsignReturnHeadDTO> findByExample(
      @Param("example") SalConsignReturnHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalConsignReturnHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignReturnHeadDTO> findByExample(
      @Param("example") SalConsignReturnHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalConsignReturnHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalConsignReturnHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalConsignReturnHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignReturnHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalConsignReturnHead.DTO_CONVERTER)
        .getContent();
  }

  @Override
  public int updateByBuilder(@Param("builder") JpaUpdateBuilder builder) {
    return executeUpdate(builder);
  }

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
  public Page<SalConsignReturnHeadDTO> findByFuzzySearch(
      @Param("example") SalConsignReturnHead example,
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
    return findAll(Example.of(example, matcher), pageable).map(SalConsignReturnHead.DTO_CONVERTER);
  }

  @Override
  public Page<SalConsignReturnHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalConsignReturnHead example = SalConsignReturnHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalConsignReturnHead.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignReturnHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
