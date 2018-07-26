package com.pagoda.test.repo.group.custom;

import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.domain.group.*;
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
 * PurOrgVen扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurOrgVenRepositoryImpl extends BaseRepositoryCustomImpl<PurOrgVen, Long>
    implements PurOrgVenRepositoryCustom {

  @Override
  protected Class<PurOrgVen> getDomainClass() {
    return PurOrgVen.class;
  }

  @Override
  public Page<PurOrgVenDTO> findBy(
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("venOrgId") Long venOrgId,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("isAllowOrder") Integer isAllowOrder,
      @Param("isAllowRec") Integer isAllowRec,
      @Param("isReturnable") Integer isReturnable,
      @Param("isPausePay") Integer isPausePay,
      @Param("isOrderCheck") Integer isOrderCheck,
      @Param("isRecCheck") Integer isRecCheck,
      @Param("isReturnCheck") Integer isReturnCheck,
      @Param("isInvCheck") Integer isInvCheck,
      @Param("settlementType") Integer settlementType,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    PurOrgVen obj = PurOrgVen.toExample();
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setVenOrgId(venOrgId);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setIsAllowOrder(isAllowOrder);
    obj.setIsAllowRec(isAllowRec);
    obj.setIsReturnable(isReturnable);
    obj.setIsPausePay(isPausePay);
    obj.setIsOrderCheck(isOrderCheck);
    obj.setIsRecCheck(isRecCheck);
    obj.setIsReturnCheck(isReturnCheck);
    obj.setIsInvCheck(isInvCheck);
    obj.setSettlementType(settlementType);
    obj.setRemark(remark);
    Example<PurOrgVen> example = Example.of(obj);

    return findAll(example, pageable).map(PurOrgVen.DTO_CONVERTER);
  }

  @Override
  public List<PurOrgVenDTO> findBy(
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("venOrgId") Long venOrgId,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("isAllowOrder") Integer isAllowOrder,
      @Param("isAllowRec") Integer isAllowRec,
      @Param("isReturnable") Integer isReturnable,
      @Param("isPausePay") Integer isPausePay,
      @Param("isOrderCheck") Integer isOrderCheck,
      @Param("isRecCheck") Integer isRecCheck,
      @Param("isReturnCheck") Integer isReturnCheck,
      @Param("isInvCheck") Integer isInvCheck,
      @Param("settlementType") Integer settlementType,
      @Param("remark") String remark) {
    PurOrgVen obj = PurOrgVen.toExample();
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setVenOrgId(venOrgId);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setIsAllowOrder(isAllowOrder);
    obj.setIsAllowRec(isAllowRec);
    obj.setIsReturnable(isReturnable);
    obj.setIsPausePay(isPausePay);
    obj.setIsOrderCheck(isOrderCheck);
    obj.setIsRecCheck(isRecCheck);
    obj.setIsReturnCheck(isReturnCheck);
    obj.setIsInvCheck(isInvCheck);
    obj.setSettlementType(settlementType);
    obj.setRemark(remark);
    Example<PurOrgVen> example = Example.of(obj);
    return findAll(example, null).map(PurOrgVen.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PurOrgVenDTO> findByExample(
      @Param("example") PurOrgVen example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PurOrgVen.DTO_CONVERTER);
  }

  @Override
  public List<PurOrgVenDTO> findByExample(@Param("example") PurOrgVen example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PurOrgVen.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PurOrgVenDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(PurOrgVen.DTO_CONVERTER);
  }

  @Override
  public List<PurOrgVenDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PurOrgVen.DTO_CONVERTER)
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
  public Page<PurOrgVenDTO> findByFuzzySearch(
      @Param("example") PurOrgVen example,
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
    return findAll(Example.of(example, matcher), pageable).map(PurOrgVen.DTO_CONVERTER);
  }

  @Override
  public Page<PurOrgVenDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PurOrgVen example = PurOrgVen.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PurOrgVen.DTO_CONVERTER);
  }

  @Override
  public List<PurOrgVenDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
