package com.pagoda.repo.salebasicdefinition.custom;

import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.domain.salebasicdefinition.*;
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
 * BasWrapperWithGoods扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasWrapperWithGoodsRepositoryImpl
    extends BaseRepositoryCustomImpl<BasWrapperWithGoods, Long>
    implements BasWrapperWithGoodsRepositoryCustom {

  @Override
  protected Class<BasWrapperWithGoods> getDomainClass() {
    return BasWrapperWithGoods.class;
  }

  @Override
  public Page<BasWrapperWithGoodsDTO> findBy(
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("mainGoodsId") Long mainGoodsId,
      @Param("mainGoodsCode") String mainGoodsCode,
      @Param("mainGoodsName") String mainGoodsName,
      @Param("mainUnitId") Long mainUnitId,
      @Param("mainUnitName") String mainUnitName,
      @Param("mainCardinal") java.math.BigDecimal mainCardinal,
      @Param("wrapGoodsId") Long wrapGoodsId,
      @Param("wrapGoodsCode") String wrapGoodsCode,
      @Param("wrapGoodsName") String wrapGoodsName,
      @Param("wrapUnitId") Long wrapUnitId,
      @Param("wrapUnitName") String wrapUnitName,
      @Param("wrapCardinal") java.math.BigDecimal wrapCardinal,
      @Param("isRound") Integer isRound,
      @Param("isEnabled") Integer isEnabled,
      @Param("pageable") Pageable pageable) {
    BasWrapperWithGoods obj = BasWrapperWithGoods.toExample();
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setMainGoodsId(mainGoodsId);
    obj.setMainGoodsCode(mainGoodsCode);
    obj.setMainGoodsName(mainGoodsName);
    obj.setMainUnitId(mainUnitId);
    obj.setMainUnitName(mainUnitName);
    obj.setMainCardinal(mainCardinal);
    obj.setWrapGoodsId(wrapGoodsId);
    obj.setWrapGoodsCode(wrapGoodsCode);
    obj.setWrapGoodsName(wrapGoodsName);
    obj.setWrapUnitId(wrapUnitId);
    obj.setWrapUnitName(wrapUnitName);
    obj.setWrapCardinal(wrapCardinal);
    obj.setIsRound(isRound);
    obj.setIsEnabled(isEnabled);
    Example<BasWrapperWithGoods> example = Example.of(obj);

    return findAll(example, pageable).map(BasWrapperWithGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasWrapperWithGoodsDTO> findBy(
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("mainGoodsId") Long mainGoodsId,
      @Param("mainGoodsCode") String mainGoodsCode,
      @Param("mainGoodsName") String mainGoodsName,
      @Param("mainUnitId") Long mainUnitId,
      @Param("mainUnitName") String mainUnitName,
      @Param("mainCardinal") java.math.BigDecimal mainCardinal,
      @Param("wrapGoodsId") Long wrapGoodsId,
      @Param("wrapGoodsCode") String wrapGoodsCode,
      @Param("wrapGoodsName") String wrapGoodsName,
      @Param("wrapUnitId") Long wrapUnitId,
      @Param("wrapUnitName") String wrapUnitName,
      @Param("wrapCardinal") java.math.BigDecimal wrapCardinal,
      @Param("isRound") Integer isRound,
      @Param("isEnabled") Integer isEnabled) {
    BasWrapperWithGoods obj = BasWrapperWithGoods.toExample();
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setMainGoodsId(mainGoodsId);
    obj.setMainGoodsCode(mainGoodsCode);
    obj.setMainGoodsName(mainGoodsName);
    obj.setMainUnitId(mainUnitId);
    obj.setMainUnitName(mainUnitName);
    obj.setMainCardinal(mainCardinal);
    obj.setWrapGoodsId(wrapGoodsId);
    obj.setWrapGoodsCode(wrapGoodsCode);
    obj.setWrapGoodsName(wrapGoodsName);
    obj.setWrapUnitId(wrapUnitId);
    obj.setWrapUnitName(wrapUnitName);
    obj.setWrapCardinal(wrapCardinal);
    obj.setIsRound(isRound);
    obj.setIsEnabled(isEnabled);
    Example<BasWrapperWithGoods> example = Example.of(obj);
    return findAll(example, null).map(BasWrapperWithGoods.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasWrapperWithGoodsDTO> findByExample(
      @Param("example") BasWrapperWithGoods example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasWrapperWithGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasWrapperWithGoodsDTO> findByExample(@Param("example") BasWrapperWithGoods example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasWrapperWithGoods.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasWrapperWithGoodsDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasWrapperWithGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasWrapperWithGoodsDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasWrapperWithGoods.DTO_CONVERTER)
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
  public Page<BasWrapperWithGoodsDTO> findByFuzzySearch(
      @Param("example") BasWrapperWithGoods example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasWrapperWithGoods.DTO_CONVERTER);
  }

  @Override
  public Page<BasWrapperWithGoodsDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasWrapperWithGoods example = BasWrapperWithGoods.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasWrapperWithGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasWrapperWithGoodsDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
