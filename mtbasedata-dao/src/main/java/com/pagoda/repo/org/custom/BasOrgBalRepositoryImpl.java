package com.pagoda.repo.org.custom;

import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
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
 * BasOrgBal扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgBalRepositoryImpl extends BaseRepositoryCustomImpl<BasOrgBal, Long>
    implements BasOrgBalRepositoryCustom {

  @Override
  protected Class<BasOrgBal> getDomainClass() {
    return BasOrgBal.class;
  }

  @Override
  public Page<BasOrgBalDTO> findBy(
      @Param("orgId") Long orgId,
      @Param("billName") String billName,
      @Param("maxBillAmt") java.math.BigDecimal maxBillAmt,
      @Param("isGoodsPrior") Integer isGoodsPrior,
      @Param("isDetailPrior") Integer isDetailPrior,
      @Param("legalPerson") String legalPerson,
      @Param("taxNumber") String taxNumber,
      @Param("orgProperty") Integer orgProperty,
      @Param("billAddress") String billAddress,
      @Param("billTelephone") String billTelephone,
      @Param("pageable") Pageable pageable) {
    BasOrgBal obj = BasOrgBal.toExample();
    obj.setOrgId(orgId);
    obj.setBillName(billName);
    obj.setMaxBillAmt(maxBillAmt);
    obj.setIsGoodsPrior(isGoodsPrior);
    obj.setIsDetailPrior(isDetailPrior);
    obj.setLegalPerson(legalPerson);
    obj.setTaxNumber(taxNumber);
    obj.setOrgProperty(orgProperty);
    obj.setBillAddress(billAddress);
    obj.setBillTelephone(billTelephone);
    Example<BasOrgBal> example = Example.of(obj);

    return findAll(example, pageable).map(BasOrgBal.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgBalDTO> findBy(
      @Param("orgId") Long orgId,
      @Param("billName") String billName,
      @Param("maxBillAmt") java.math.BigDecimal maxBillAmt,
      @Param("isGoodsPrior") Integer isGoodsPrior,
      @Param("isDetailPrior") Integer isDetailPrior,
      @Param("legalPerson") String legalPerson,
      @Param("taxNumber") String taxNumber,
      @Param("orgProperty") Integer orgProperty,
      @Param("billAddress") String billAddress,
      @Param("billTelephone") String billTelephone) {
    BasOrgBal obj = BasOrgBal.toExample();
    obj.setOrgId(orgId);
    obj.setBillName(billName);
    obj.setMaxBillAmt(maxBillAmt);
    obj.setIsGoodsPrior(isGoodsPrior);
    obj.setIsDetailPrior(isDetailPrior);
    obj.setLegalPerson(legalPerson);
    obj.setTaxNumber(taxNumber);
    obj.setOrgProperty(orgProperty);
    obj.setBillAddress(billAddress);
    obj.setBillTelephone(billTelephone);
    Example<BasOrgBal> example = Example.of(obj);
    return findAll(example, null).map(BasOrgBal.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasOrgBalDTO> findByExample(
      @Param("example") BasOrgBal example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasOrgBal.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgBalDTO> findByExample(@Param("example") BasOrgBal example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasOrgBal.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasOrgBalDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(BasOrgBal.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgBalDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasOrgBal.DTO_CONVERTER)
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
  public Page<BasOrgBalDTO> findByFuzzySearch(
      @Param("example") BasOrgBal example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasOrgBal.DTO_CONVERTER);
  }

  @Override
  public Page<BasOrgBalDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasOrgBal example = BasOrgBal.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasOrgBal.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgBalDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
