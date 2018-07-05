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
 * PurOrgVenGoods扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurOrgVenGoodsRepositoryImpl extends BaseRepositoryCustomImpl<PurOrgVenGoods, Long>
    implements PurOrgVenGoodsRepositoryCustom {

  @Override
  protected Class<PurOrgVenGoods> getDomainClass() {
    return PurOrgVenGoods.class;
  }

  @Override
  public Page<PurOrgVenGoodsDTO> findBy(
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("billTaxRate") java.math.BigDecimal billTaxRate,
      @Param("discountTaxRate") java.math.BigDecimal discountTaxRate,
      @Param("taxType") Integer taxType,
      @Param("isAllowReturn") Integer isAllowReturn,
      @Param("purDepotId") Long purDepotId,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsClassName") String goodsClassName,
      @Param("basUnitName") String basUnitName,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("price") java.math.BigDecimal price,
      @Param("isDefault") Integer isDefault,
      @Param("isEnabled") Integer isEnabled,
      @Param("isAllowOrder") Integer isAllowOrder,
      @Param("isAllowRec") Integer isAllowRec,
      @Param("pageable") Pageable pageable) {
    PurOrgVenGoods obj = PurOrgVenGoods.toExample();
    obj.setUnitRate(unitRate);
    obj.setBillTaxRate(billTaxRate);
    obj.setDiscountTaxRate(discountTaxRate);
    obj.setTaxType(taxType);
    obj.setIsAllowReturn(isAllowReturn);
    obj.setPurDepotId(purDepotId);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsClassName(goodsClassName);
    obj.setBasUnitName(basUnitName);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setPrice(price);
    obj.setIsDefault(isDefault);
    obj.setIsEnabled(isEnabled);
    obj.setIsAllowOrder(isAllowOrder);
    obj.setIsAllowRec(isAllowRec);
    Example<PurOrgVenGoods> example = Example.of(obj);

    return findAll(example, pageable).map(PurOrgVenGoods.DTO_CONVERTER);
  }

  @Override
  public List<PurOrgVenGoodsDTO> findBy(
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("billTaxRate") java.math.BigDecimal billTaxRate,
      @Param("discountTaxRate") java.math.BigDecimal discountTaxRate,
      @Param("taxType") Integer taxType,
      @Param("isAllowReturn") Integer isAllowReturn,
      @Param("purDepotId") Long purDepotId,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsClassName") String goodsClassName,
      @Param("basUnitName") String basUnitName,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("price") java.math.BigDecimal price,
      @Param("isDefault") Integer isDefault,
      @Param("isEnabled") Integer isEnabled,
      @Param("isAllowOrder") Integer isAllowOrder,
      @Param("isAllowRec") Integer isAllowRec) {
    PurOrgVenGoods obj = PurOrgVenGoods.toExample();
    obj.setUnitRate(unitRate);
    obj.setBillTaxRate(billTaxRate);
    obj.setDiscountTaxRate(discountTaxRate);
    obj.setTaxType(taxType);
    obj.setIsAllowReturn(isAllowReturn);
    obj.setPurDepotId(purDepotId);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsClassName(goodsClassName);
    obj.setBasUnitName(basUnitName);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setPrice(price);
    obj.setIsDefault(isDefault);
    obj.setIsEnabled(isEnabled);
    obj.setIsAllowOrder(isAllowOrder);
    obj.setIsAllowRec(isAllowRec);
    Example<PurOrgVenGoods> example = Example.of(obj);
    return findAll(example, null).map(PurOrgVenGoods.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PurOrgVenGoodsDTO> findByExample(
      @Param("example") PurOrgVenGoods example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PurOrgVenGoods.DTO_CONVERTER);
  }

  @Override
  public List<PurOrgVenGoodsDTO> findByExample(@Param("example") PurOrgVenGoods example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PurOrgVenGoods.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PurOrgVenGoodsDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PurOrgVenGoods.DTO_CONVERTER);
  }

  @Override
  public List<PurOrgVenGoodsDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PurOrgVenGoods.DTO_CONVERTER)
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
  public Page<PurOrgVenGoodsDTO> findByFuzzySearch(
      @Param("example") PurOrgVenGoods example,
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
    return findAll(Example.of(example, matcher), pageable).map(PurOrgVenGoods.DTO_CONVERTER);
  }

  @Override
  public Page<PurOrgVenGoodsDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PurOrgVenGoods example = PurOrgVenGoods.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PurOrgVenGoods.DTO_CONVERTER);
  }

  @Override
  public List<PurOrgVenGoodsDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
