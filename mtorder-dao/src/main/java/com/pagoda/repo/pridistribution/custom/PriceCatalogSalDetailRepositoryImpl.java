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
 * PriceCatalogSalDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceCatalogSalDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<PriceCatalogSalDetail, Long>
    implements PriceCatalogSalDetailRepositoryCustom {

  @Override
  protected Class<PriceCatalogSalDetail> getDomainClass() {
    return PriceCatalogSalDetail.class;
  }

  @Override
  public Page<PriceCatalogSalDetailDTO> findBy(
      @Param("priceCatId") Long priceCatId,
      @Param("priceCatCode") String priceCatCode,
      @Param("priceCatName") String priceCatName,
      @Param("salPrice") java.math.BigDecimal salPrice,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("returnPrice") java.math.BigDecimal returnPrice,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    PriceCatalogSalDetail obj = PriceCatalogSalDetail.toExample();
    obj.setPriceCatId(priceCatId);
    obj.setPriceCatCode(priceCatCode);
    obj.setPriceCatName(priceCatName);
    obj.setSalPrice(salPrice);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setUnitRate(unitRate);
    obj.setReturnPrice(returnPrice);
    obj.setRemark(remark);
    Example<PriceCatalogSalDetail> example = Example.of(obj);

    return findAll(example, pageable).map(PriceCatalogSalDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceCatalogSalDetailDTO> findBy(
      @Param("priceCatId") Long priceCatId,
      @Param("priceCatCode") String priceCatCode,
      @Param("priceCatName") String priceCatName,
      @Param("salPrice") java.math.BigDecimal salPrice,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("returnPrice") java.math.BigDecimal returnPrice,
      @Param("remark") String remark) {
    PriceCatalogSalDetail obj = PriceCatalogSalDetail.toExample();
    obj.setPriceCatId(priceCatId);
    obj.setPriceCatCode(priceCatCode);
    obj.setPriceCatName(priceCatName);
    obj.setSalPrice(salPrice);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setUnitRate(unitRate);
    obj.setReturnPrice(returnPrice);
    obj.setRemark(remark);
    Example<PriceCatalogSalDetail> example = Example.of(obj);
    return findAll(example, null).map(PriceCatalogSalDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PriceCatalogSalDetailDTO> findByExample(
      @Param("example") PriceCatalogSalDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PriceCatalogSalDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceCatalogSalDetailDTO> findByExample(
      @Param("example") PriceCatalogSalDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PriceCatalogSalDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PriceCatalogSalDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PriceCatalogSalDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceCatalogSalDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PriceCatalogSalDetail.DTO_CONVERTER)
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
  public Page<PriceCatalogSalDetailDTO> findByFuzzySearch(
      @Param("example") PriceCatalogSalDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(PriceCatalogSalDetail.DTO_CONVERTER);
  }

  @Override
  public Page<PriceCatalogSalDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PriceCatalogSalDetail example = PriceCatalogSalDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PriceCatalogSalDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceCatalogSalDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
