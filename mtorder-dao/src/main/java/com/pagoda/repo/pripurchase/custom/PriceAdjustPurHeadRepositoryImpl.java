package com.pagoda.repo.pripurchase.custom;

import com.pagoda.api.dto.pripurchase.*;
import com.pagoda.domain.pripurchase.*;
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
 * PriceAdjustPurHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceAdjustPurHeadRepositoryImpl
    extends BaseRepositoryCustomImpl<PriceAdjustPurHead, Long>
    implements PriceAdjustPurHeadRepositoryCustom {

  @Override
  protected Class<PriceAdjustPurHead> getDomainClass() {
    return PriceAdjustPurHead.class;
  }

  @Override
  public Page<PriceAdjustPurHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("status") Integer status,
      @Param("entryTime") java.sql.Timestamp entryTime,
      @Param("effectDate") java.util.Date effectDate,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("note") String note,
      @Param("pageable") Pageable pageable) {
    PriceAdjustPurHead obj = PriceAdjustPurHead.toExample();
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setArrOrgId(arrOrgId);
    obj.setArrOrgCode(arrOrgCode);
    obj.setArrOrgName(arrOrgName);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setStatus(status);
    obj.setEntryTime(entryTime);
    obj.setEffectDate(effectDate);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setRemark(remark);
    obj.setAuditTime(auditTime);
    obj.setNote(note);
    Example<PriceAdjustPurHead> example = Example.of(obj);

    return findAll(example, pageable).map(PriceAdjustPurHead.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustPurHeadDTO> findBy(
      @Param("seqno") String seqno,
      @Param("entId") Long entId,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("status") Integer status,
      @Param("entryTime") java.sql.Timestamp entryTime,
      @Param("effectDate") java.util.Date effectDate,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("note") String note) {
    PriceAdjustPurHead obj = PriceAdjustPurHead.toExample();
    obj.setSeqno(seqno);
    obj.setEntId(entId);
    obj.setArrOrgId(arrOrgId);
    obj.setArrOrgCode(arrOrgCode);
    obj.setArrOrgName(arrOrgName);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setStatus(status);
    obj.setEntryTime(entryTime);
    obj.setEffectDate(effectDate);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setRemark(remark);
    obj.setAuditTime(auditTime);
    obj.setNote(note);
    Example<PriceAdjustPurHead> example = Example.of(obj);
    return findAll(example, null).map(PriceAdjustPurHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PriceAdjustPurHeadDTO> findByExample(
      @Param("example") PriceAdjustPurHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PriceAdjustPurHead.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustPurHeadDTO> findByExample(@Param("example") PriceAdjustPurHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PriceAdjustPurHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PriceAdjustPurHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PriceAdjustPurHead.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustPurHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PriceAdjustPurHead.DTO_CONVERTER)
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
  public Page<PriceAdjustPurHeadDTO> findByFuzzySearch(
      @Param("example") PriceAdjustPurHead example,
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
    return findAll(Example.of(example, matcher), pageable).map(PriceAdjustPurHead.DTO_CONVERTER);
  }

  @Override
  public Page<PriceAdjustPurHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PriceAdjustPurHead example = PriceAdjustPurHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PriceAdjustPurHead.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustPurHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
