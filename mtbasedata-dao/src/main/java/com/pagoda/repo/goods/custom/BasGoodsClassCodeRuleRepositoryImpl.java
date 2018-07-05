package com.pagoda.repo.goods.custom;

import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
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
 * BasGoodsClassCodeRule扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsClassCodeRuleRepositoryImpl
    extends BaseRepositoryCustomImpl<BasGoodsClassCodeRule, Long>
    implements BasGoodsClassCodeRuleRepositoryCustom {

  @Override
  protected Class<BasGoodsClassCodeRule> getDomainClass() {
    return BasGoodsClassCodeRule.class;
  }

  @Override
  public Page<BasGoodsClassCodeRuleDTO> findBy(
      @Param("codeRuleId") Long codeRuleId,
      @Param("name") String name,
      @Param("goodsClassId") Long goodsClassId,
      @Param("goodsClassCode") String goodsClassCode,
      @Param("goodsClassName") String goodsClassName,
      @Param("isEnabled") Integer isEnabled,
      @Param("isDefault") Integer isDefault,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    BasGoodsClassCodeRule obj = BasGoodsClassCodeRule.toExample();
    obj.setCodeRuleId(codeRuleId);
    obj.setName(name);
    obj.setGoodsClassId(goodsClassId);
    obj.setGoodsClassCode(goodsClassCode);
    obj.setGoodsClassName(goodsClassName);
    obj.setIsEnabled(isEnabled);
    obj.setIsDefault(isDefault);
    obj.setRemark(remark);
    Example<BasGoodsClassCodeRule> example = Example.of(obj);

    return findAll(example, pageable).map(BasGoodsClassCodeRule.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsClassCodeRuleDTO> findBy(
      @Param("codeRuleId") Long codeRuleId,
      @Param("name") String name,
      @Param("goodsClassId") Long goodsClassId,
      @Param("goodsClassCode") String goodsClassCode,
      @Param("goodsClassName") String goodsClassName,
      @Param("isEnabled") Integer isEnabled,
      @Param("isDefault") Integer isDefault,
      @Param("remark") String remark) {
    BasGoodsClassCodeRule obj = BasGoodsClassCodeRule.toExample();
    obj.setCodeRuleId(codeRuleId);
    obj.setName(name);
    obj.setGoodsClassId(goodsClassId);
    obj.setGoodsClassCode(goodsClassCode);
    obj.setGoodsClassName(goodsClassName);
    obj.setIsEnabled(isEnabled);
    obj.setIsDefault(isDefault);
    obj.setRemark(remark);
    Example<BasGoodsClassCodeRule> example = Example.of(obj);
    return findAll(example, null).map(BasGoodsClassCodeRule.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasGoodsClassCodeRuleDTO> findByExample(
      @Param("example") BasGoodsClassCodeRule example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasGoodsClassCodeRule.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsClassCodeRuleDTO> findByExample(
      @Param("example") BasGoodsClassCodeRule example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasGoodsClassCodeRule.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasGoodsClassCodeRuleDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasGoodsClassCodeRule.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsClassCodeRuleDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasGoodsClassCodeRule.DTO_CONVERTER)
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
  public Page<BasGoodsClassCodeRuleDTO> findByFuzzySearch(
      @Param("example") BasGoodsClassCodeRule example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasGoodsClassCodeRule.DTO_CONVERTER);
  }

  @Override
  public Page<BasGoodsClassCodeRuleDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasGoodsClassCodeRule example = BasGoodsClassCodeRule.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasGoodsClassCodeRule.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsClassCodeRuleDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
