package com.pagoda.repo.pridistribution.custom;

import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.domain.pridistribution.*;
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
 * PriceAdjustSalHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceAdjustSalHeadRepositoryImpl
    extends BaseRepositoryCustomImpl<PriceAdjustSalHead, Long>
    implements PriceAdjustSalHeadRepositoryCustom {

  @Override
  protected Class<PriceAdjustSalHead> getDomainClass() {
    return PriceAdjustSalHead.class;
  }

  @Override
  public Page<PriceAdjustSalHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("priceCatName") String priceCatName,
      @Param("priceCatCode") String priceCatCode,
      @Param("priceCatId") Long priceCatId,
      @Param("status") Integer status,
      @Param("entryTime") java.sql.Timestamp entryTime,
      @Param("effectDate") java.util.Date effectDate,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("note") String note,
      @Param("pageable") Pageable pageable) {
    PriceAdjustSalHead obj = PriceAdjustSalHead.toExample();
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setPriceCatName(priceCatName);
    obj.setPriceCatCode(priceCatCode);
    obj.setPriceCatId(priceCatId);
    obj.setStatus(status);
    obj.setEntryTime(entryTime);
    obj.setEffectDate(effectDate);
    obj.setAuditTime(auditTime);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setRemark(remark);
    obj.setNote(note);
    Example<PriceAdjustSalHead> example = Example.of(obj);

    return findAll(example, pageable).map(PriceAdjustSalHead.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustSalHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("priceCatName") String priceCatName,
      @Param("priceCatCode") String priceCatCode,
      @Param("priceCatId") Long priceCatId,
      @Param("status") Integer status,
      @Param("entryTime") java.sql.Timestamp entryTime,
      @Param("effectDate") java.util.Date effectDate,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("note") String note) {
    PriceAdjustSalHead obj = PriceAdjustSalHead.toExample();
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setPriceCatName(priceCatName);
    obj.setPriceCatCode(priceCatCode);
    obj.setPriceCatId(priceCatId);
    obj.setStatus(status);
    obj.setEntryTime(entryTime);
    obj.setEffectDate(effectDate);
    obj.setAuditTime(auditTime);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setRemark(remark);
    obj.setNote(note);
    Example<PriceAdjustSalHead> example = Example.of(obj);
    return findAll(example, null).map(PriceAdjustSalHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PriceAdjustSalHeadDTO> findByExample(
      @Param("example") PriceAdjustSalHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PriceAdjustSalHead.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustSalHeadDTO> findByExample(@Param("example") PriceAdjustSalHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PriceAdjustSalHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PriceAdjustSalHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PriceAdjustSalHead.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustSalHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PriceAdjustSalHead.DTO_CONVERTER)
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
  public Page<PriceAdjustSalHeadDTO> findByFuzzySearch(
      @Param("example") PriceAdjustSalHead example,
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
    return findAll(Example.of(example, matcher), pageable).map(PriceAdjustSalHead.DTO_CONVERTER);
  }

  @Override
  public Page<PriceAdjustSalHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PriceAdjustSalHead example = PriceAdjustSalHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PriceAdjustSalHead.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustSalHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
