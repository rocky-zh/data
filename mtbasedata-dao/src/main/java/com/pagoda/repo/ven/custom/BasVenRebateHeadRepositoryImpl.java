package com.pagoda.repo.ven.custom;

import com.pagoda.api.dto.ven.*;
import com.pagoda.domain.ven.*;
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
 * BasVenRebateHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasVenRebateHeadRepositoryImpl extends BaseRepositoryCustomImpl<BasVenRebateHead, Long>
    implements BasVenRebateHeadRepositoryCustom {

  @Override
  protected Class<BasVenRebateHead> getDomainClass() {
    return BasVenRebateHead.class;
  }

  @Override
  public Page<BasVenRebateHeadDTO> findBy(
      @Param("no") String no,
      @Param("balOrgCode") String balOrgCode,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("rebateMode") Integer rebateMode,
      @Param("rebateRate") java.math.BigDecimal rebateRate,
      @Param("isAllEffect") Integer isAllEffect,
      @Param("beginDate") java.util.Date beginDate,
      @Param("endDate") java.util.Date endDate,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("status") Integer status,
      @Param("effectDate") java.util.Date effectDate,
      @Param("expiryDate") java.util.Date expiryDate,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    BasVenRebateHead obj = BasVenRebateHead.toExample();
    obj.setNo(no);
    obj.setBalOrgCode(balOrgCode);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setRebateMode(rebateMode);
    obj.setRebateRate(rebateRate);
    obj.setIsAllEffect(isAllEffect);
    obj.setBeginDate(beginDate);
    obj.setEndDate(endDate);
    obj.setBalOrgId(balOrgId);
    obj.setBalOrgName(balOrgName);
    obj.setStatus(status);
    obj.setEffectDate(effectDate);
    obj.setExpiryDate(expiryDate);
    obj.setRemark(remark);
    Example<BasVenRebateHead> example = Example.of(obj);

    return findAll(example, pageable).map(BasVenRebateHead.DTO_CONVERTER);
  }

  @Override
  public List<BasVenRebateHeadDTO> findBy(
      @Param("no") String no,
      @Param("balOrgCode") String balOrgCode,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("rebateMode") Integer rebateMode,
      @Param("rebateRate") java.math.BigDecimal rebateRate,
      @Param("isAllEffect") Integer isAllEffect,
      @Param("beginDate") java.util.Date beginDate,
      @Param("endDate") java.util.Date endDate,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("status") Integer status,
      @Param("effectDate") java.util.Date effectDate,
      @Param("expiryDate") java.util.Date expiryDate,
      @Param("remark") String remark) {
    BasVenRebateHead obj = BasVenRebateHead.toExample();
    obj.setNo(no);
    obj.setBalOrgCode(balOrgCode);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setRebateMode(rebateMode);
    obj.setRebateRate(rebateRate);
    obj.setIsAllEffect(isAllEffect);
    obj.setBeginDate(beginDate);
    obj.setEndDate(endDate);
    obj.setBalOrgId(balOrgId);
    obj.setBalOrgName(balOrgName);
    obj.setStatus(status);
    obj.setEffectDate(effectDate);
    obj.setExpiryDate(expiryDate);
    obj.setRemark(remark);
    Example<BasVenRebateHead> example = Example.of(obj);
    return findAll(example, null).map(BasVenRebateHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasVenRebateHeadDTO> findByExample(
      @Param("example") BasVenRebateHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasVenRebateHead.DTO_CONVERTER);
  }

  @Override
  public List<BasVenRebateHeadDTO> findByExample(@Param("example") BasVenRebateHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasVenRebateHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasVenRebateHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasVenRebateHead.DTO_CONVERTER);
  }

  @Override
  public List<BasVenRebateHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasVenRebateHead.DTO_CONVERTER)
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
  public Page<BasVenRebateHeadDTO> findByFuzzySearch(
      @Param("example") BasVenRebateHead example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasVenRebateHead.DTO_CONVERTER);
  }

  @Override
  public Page<BasVenRebateHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasVenRebateHead example = BasVenRebateHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasVenRebateHead.DTO_CONVERTER);
  }

  @Override
  public List<BasVenRebateHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
