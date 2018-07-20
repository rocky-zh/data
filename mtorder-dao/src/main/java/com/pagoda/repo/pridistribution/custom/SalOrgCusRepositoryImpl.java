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
 * SalOrgCus扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalOrgCusRepositoryImpl extends BaseRepositoryCustomImpl<SalOrgCus, Long>
    implements SalOrgCusRepositoryCustom {

  @Override
  protected Class<SalOrgCus> getDomainClass() {
    return SalOrgCus.class;
  }

  @Override
  public Page<SalOrgCusDTO> findBy(
      @Param("balCusOrgId") Long balCusOrgId,
      @Param("balCusOrgName") String balCusOrgName,
      @Param("dualOrgName") String dualOrgName,
      @Param("isPickAutoRec") Integer isPickAutoRec,
      @Param("isPickLimitCon") Integer isPickLimitCon,
      @Param("billType") Integer billType,
      @Param("isStoBackPrice") Integer isStoBackPrice,
      @Param("isCreateBill") Integer isCreateBill,
      @Param("isDefaultCon") Integer isDefaultCon,
      @Param("isDefaultAllot") Integer isDefaultAllot,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("priceCatId") Long priceCatId,
      @Param("priceCatCode") String priceCatCode,
      @Param("priceCatName") String priceCatName,
      @Param("isEnabled") Integer isEnabled,
      @Param("entId") Long entId,
      @Param("pageable") Pageable pageable) {
    SalOrgCus obj = SalOrgCus.toExample();
    obj.setBalCusOrgId(balCusOrgId);
    obj.setBalCusOrgName(balCusOrgName);
    obj.setDualOrgName(dualOrgName);
    obj.setIsPickAutoRec(isPickAutoRec);
    obj.setIsPickLimitCon(isPickLimitCon);
    obj.setBillType(billType);
    obj.setIsStoBackPrice(isStoBackPrice);
    obj.setIsCreateBill(isCreateBill);
    obj.setIsDefaultCon(isDefaultCon);
    obj.setIsDefaultAllot(isDefaultAllot);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setBalOrgId(balOrgId);
    obj.setBalOrgName(balOrgName);
    obj.setPriceCatId(priceCatId);
    obj.setPriceCatCode(priceCatCode);
    obj.setPriceCatName(priceCatName);
    obj.setIsEnabled(isEnabled);
    obj.setEntId(entId);
    Example<SalOrgCus> example = Example.of(obj);

    return findAll(example, pageable).map(SalOrgCus.DTO_CONVERTER);
  }

  @Override
  public List<SalOrgCusDTO> findBy(
      @Param("balCusOrgId") Long balCusOrgId,
      @Param("balCusOrgName") String balCusOrgName,
      @Param("dualOrgName") String dualOrgName,
      @Param("isPickAutoRec") Integer isPickAutoRec,
      @Param("isPickLimitCon") Integer isPickLimitCon,
      @Param("billType") Integer billType,
      @Param("isStoBackPrice") Integer isStoBackPrice,
      @Param("isCreateBill") Integer isCreateBill,
      @Param("isDefaultCon") Integer isDefaultCon,
      @Param("isDefaultAllot") Integer isDefaultAllot,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("priceCatId") Long priceCatId,
      @Param("priceCatCode") String priceCatCode,
      @Param("priceCatName") String priceCatName,
      @Param("isEnabled") Integer isEnabled,
      @Param("entId") Long entId) {
    SalOrgCus obj = SalOrgCus.toExample();
    obj.setBalCusOrgId(balCusOrgId);
    obj.setBalCusOrgName(balCusOrgName);
    obj.setDualOrgName(dualOrgName);
    obj.setIsPickAutoRec(isPickAutoRec);
    obj.setIsPickLimitCon(isPickLimitCon);
    obj.setBillType(billType);
    obj.setIsStoBackPrice(isStoBackPrice);
    obj.setIsCreateBill(isCreateBill);
    obj.setIsDefaultCon(isDefaultCon);
    obj.setIsDefaultAllot(isDefaultAllot);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setBalOrgId(balOrgId);
    obj.setBalOrgName(balOrgName);
    obj.setPriceCatId(priceCatId);
    obj.setPriceCatCode(priceCatCode);
    obj.setPriceCatName(priceCatName);
    obj.setIsEnabled(isEnabled);
    obj.setEntId(entId);
    Example<SalOrgCus> example = Example.of(obj);
    return findAll(example, null).map(SalOrgCus.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalOrgCusDTO> findByExample(
      @Param("example") SalOrgCus example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalOrgCus.DTO_CONVERTER);
  }

  @Override
  public List<SalOrgCusDTO> findByExample(@Param("example") SalOrgCus example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalOrgCus.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalOrgCusDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(SalOrgCus.DTO_CONVERTER);
  }

  @Override
  public List<SalOrgCusDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalOrgCus.DTO_CONVERTER)
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
  public Page<SalOrgCusDTO> findByFuzzySearch(
      @Param("example") SalOrgCus example,
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
    return findAll(Example.of(example, matcher), pageable).map(SalOrgCus.DTO_CONVERTER);
  }

  @Override
  public Page<SalOrgCusDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalOrgCus example = SalOrgCus.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalOrgCus.DTO_CONVERTER);
  }

  @Override
  public List<SalOrgCusDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
