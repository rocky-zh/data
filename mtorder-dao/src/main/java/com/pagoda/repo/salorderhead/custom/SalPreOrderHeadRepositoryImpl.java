package com.pagoda.repo.salorderhead.custom;

import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.domain.salorderhead.*;
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
 * SalPreOrderHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalPreOrderHeadRepositoryImpl extends BaseRepositoryCustomImpl<SalPreOrderHead, Long>
    implements SalPreOrderHeadRepositoryCustom {

  @Override
  protected Class<SalPreOrderHead> getDomainClass() {
    return SalPreOrderHead.class;
  }

  @Override
  public Page<SalPreOrderHeadDTO> findBy(
      @Param("preOrderType") Integer preOrderType,
      @Param("preOrderStatus") Integer preOrderStatus,
      @Param("entId") Long entId,
      @Param("seqno") String seqno,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("remark") String remark,
      @Param("entryDate") java.sql.Timestamp entryDate,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("totalRequestQty") java.math.BigDecimal totalRequestQty,
      @Param("pageable") Pageable pageable) {
    SalPreOrderHead obj = SalPreOrderHead.toExample();
    obj.setPreOrderType(preOrderType);
    obj.setPreOrderStatus(preOrderStatus);
    obj.setEntId(entId);
    obj.setSeqno(seqno);
    obj.setConOrgId(conOrgId);
    obj.setConOrgCode(conOrgCode);
    obj.setConOrgName(conOrgName);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setRemark(remark);
    obj.setEntryDate(entryDate);
    obj.setTotalAmt(totalAmt);
    obj.setTotalRequestQty(totalRequestQty);
    Example<SalPreOrderHead> example = Example.of(obj);

    return findAll(example, pageable).map(SalPreOrderHead.DTO_CONVERTER);
  }

  @Override
  public List<SalPreOrderHeadDTO> findBy(
      @Param("preOrderType") Integer preOrderType,
      @Param("preOrderStatus") Integer preOrderStatus,
      @Param("entId") Long entId,
      @Param("seqno") String seqno,
      @Param("conOrgId") Long conOrgId,
      @Param("conOrgCode") String conOrgCode,
      @Param("conOrgName") String conOrgName,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("remark") String remark,
      @Param("entryDate") java.sql.Timestamp entryDate,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("totalRequestQty") java.math.BigDecimal totalRequestQty) {
    SalPreOrderHead obj = SalPreOrderHead.toExample();
    obj.setPreOrderType(preOrderType);
    obj.setPreOrderStatus(preOrderStatus);
    obj.setEntId(entId);
    obj.setSeqno(seqno);
    obj.setConOrgId(conOrgId);
    obj.setConOrgCode(conOrgCode);
    obj.setConOrgName(conOrgName);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setRemark(remark);
    obj.setEntryDate(entryDate);
    obj.setTotalAmt(totalAmt);
    obj.setTotalRequestQty(totalRequestQty);
    Example<SalPreOrderHead> example = Example.of(obj);
    return findAll(example, null).map(SalPreOrderHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalPreOrderHeadDTO> findByExample(
      @Param("example") SalPreOrderHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalPreOrderHead.DTO_CONVERTER);
  }

  @Override
  public List<SalPreOrderHeadDTO> findByExample(@Param("example") SalPreOrderHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalPreOrderHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalPreOrderHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalPreOrderHead.DTO_CONVERTER);
  }

  @Override
  public List<SalPreOrderHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalPreOrderHead.DTO_CONVERTER)
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
  public Page<SalPreOrderHeadDTO> findByFuzzySearch(
      @Param("example") SalPreOrderHead example,
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
    return findAll(Example.of(example, matcher), pageable).map(SalPreOrderHead.DTO_CONVERTER);
  }

  @Override
  public Page<SalPreOrderHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalPreOrderHead example = SalPreOrderHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalPreOrderHead.DTO_CONVERTER);
  }

  @Override
  public List<SalPreOrderHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
