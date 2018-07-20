package com.pagoda.repo.prilimitmanage.custom;

import com.pagoda.api.dto.prilimitmanage.*;
import com.pagoda.domain.prilimitmanage.*;
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
 * PriceLimitGoodsDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceLimitGoodsDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<PriceLimitGoodsDetail, Long>
    implements PriceLimitGoodsDetailRepositoryCustom {

  @Override
  protected Class<PriceLimitGoodsDetail> getDomainClass() {
    return PriceLimitGoodsDetail.class;
  }

  @Override
  public Page<PriceLimitGoodsDetailDTO> findBy(
      @Param("entId") Long entId, @Param("pageable") Pageable pageable) {
    PriceLimitGoodsDetail obj = PriceLimitGoodsDetail.toExample();
    obj.setEntId(entId);
    Example<PriceLimitGoodsDetail> example = Example.of(obj);

    return findAll(example, pageable).map(PriceLimitGoodsDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceLimitGoodsDetailDTO> findBy(@Param("entId") Long entId) {
    PriceLimitGoodsDetail obj = PriceLimitGoodsDetail.toExample();
    obj.setEntId(entId);
    Example<PriceLimitGoodsDetail> example = Example.of(obj);
    return findAll(example, null).map(PriceLimitGoodsDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PriceLimitGoodsDetailDTO> findByExample(
      @Param("example") PriceLimitGoodsDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PriceLimitGoodsDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceLimitGoodsDetailDTO> findByExample(
      @Param("example") PriceLimitGoodsDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PriceLimitGoodsDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PriceLimitGoodsDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PriceLimitGoodsDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceLimitGoodsDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PriceLimitGoodsDetail.DTO_CONVERTER)
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
  public Page<PriceLimitGoodsDetailDTO> findByFuzzySearch(
      @Param("example") PriceLimitGoodsDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(PriceLimitGoodsDetail.DTO_CONVERTER);
  }

  @Override
  public Page<PriceLimitGoodsDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PriceLimitGoodsDetail example = PriceLimitGoodsDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PriceLimitGoodsDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceLimitGoodsDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
