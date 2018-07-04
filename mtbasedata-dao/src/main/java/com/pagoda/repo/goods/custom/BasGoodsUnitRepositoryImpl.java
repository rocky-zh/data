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
 * BasGoodsUnit扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsUnitRepositoryImpl extends BaseRepositoryCustomImpl<BasGoodsUnit, Long>
    implements BasGoodsUnitRepositoryCustom {

  @Override
  protected Class<BasGoodsUnit> getDomainClass() {
    return BasGoodsUnit.class;
  }

  @Override
  public Page<BasGoodsUnitDTO> findBy(
      @Param("isPermitDecimal") Integer isPermitDecimal,
      @Param("isUsedPur") Integer isUsedPur,
      @Param("isUsedSal") Integer isUsedSal,
      @Param("isUsedRet") Integer isUsedRet,
      @Param("goodsId") Long goodsId,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("entId") Long entId,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("sourceType") Integer sourceType,
      @Param("pageable") Pageable pageable) {
    BasGoodsUnit obj = BasGoodsUnit.toExample();
    obj.setIsPermitDecimal(isPermitDecimal);
    obj.setIsUsedPur(isUsedPur);
    obj.setIsUsedSal(isUsedSal);
    obj.setIsUsedRet(isUsedRet);
    obj.setGoodsId(goodsId);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setEntId(entId);
    obj.setUnitRate(unitRate);
    obj.setSourceType(sourceType);
    Example<BasGoodsUnit> example = Example.of(obj);

    return findAll(example, pageable).map(BasGoodsUnit.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsUnitDTO> findBy(
      @Param("isPermitDecimal") Integer isPermitDecimal,
      @Param("isUsedPur") Integer isUsedPur,
      @Param("isUsedSal") Integer isUsedSal,
      @Param("isUsedRet") Integer isUsedRet,
      @Param("goodsId") Long goodsId,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("entId") Long entId,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("sourceType") Integer sourceType) {
    BasGoodsUnit obj = BasGoodsUnit.toExample();
    obj.setIsPermitDecimal(isPermitDecimal);
    obj.setIsUsedPur(isUsedPur);
    obj.setIsUsedSal(isUsedSal);
    obj.setIsUsedRet(isUsedRet);
    obj.setGoodsId(goodsId);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setEntId(entId);
    obj.setUnitRate(unitRate);
    obj.setSourceType(sourceType);
    Example<BasGoodsUnit> example = Example.of(obj);
    return findAll(example, null).map(BasGoodsUnit.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasGoodsUnitDTO> findByExample(
      @Param("example") BasGoodsUnit example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasGoodsUnit.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsUnitDTO> findByExample(@Param("example") BasGoodsUnit example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasGoodsUnit.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasGoodsUnitDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(BasGoodsUnit.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsUnitDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasGoodsUnit.DTO_CONVERTER)
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
  public Page<BasGoodsUnitDTO> findByFuzzySearch(
      @Param("example") BasGoodsUnit example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasGoodsUnit.DTO_CONVERTER);
  }

  @Override
  public Page<BasGoodsUnitDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasGoodsUnit example = BasGoodsUnit.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasGoodsUnit.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsUnitDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
