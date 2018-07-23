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
 * BasOrgGoodsvar扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgGoodsvarRepositoryImpl extends BaseRepositoryCustomImpl<BasOrgGoodsvar, Long>
    implements BasOrgGoodsvarRepositoryCustom {

  @Override
  protected Class<BasOrgGoodsvar> getDomainClass() {
    return BasOrgGoodsvar.class;
  }

  @Override
  public Page<BasOrgGoodsvarDTO> findBy(
      @Param("badGoodsRate") java.math.BigDecimal badGoodsRate,
      @Param("prodArea") String prodArea,
      @Param("qualSituDesc") String qualSituDesc,
      @Param("supplyStateDesc") String supplyStateDesc,
      @Param("supplyTrendDesc") String supplyTrendDesc,
      @Param("isMustSale") Integer isMustSale,
      @Param("mustSaleDesc") String mustSaleDesc,
      @Param("difference") String difference,
      @Param("goodsWrapDesc") String goodsWrapDesc,
      @Param("goodsEva") String goodsEva,
      @Param("techDesc") String techDesc,
      @Param("isBEnabledC") Integer isBEnabledC,
      @Param("isCEnabledA") Integer isCEnabledA,
      @Param("isCEnabledN") Integer isCEnabledN,
      @Param("isCEnabledM") Integer isCEnabledM,
      @Param("isCEnabledO") Integer isCEnabledO,
      @Param("isCEnabledP") Integer isCEnabledP,
      @Param("isCEnabledC") Integer isCEnabledC,
      @Param("isCEnabledE") Integer isCEnabledE,
      @Param("isCEnabledF") Integer isCEnabledF,
      @Param("entId") Long entId,
      @Param("orgId") Long orgId,
      @Param("goodsVarId") Long goodsVarId,
      @Param("goodsId") Long goodsId,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("isSale") Integer isSale,
      @Param("isReturn") Integer isReturn,
      @Param("isStockInv") Integer isStockInv,
      @Param("isRet") Integer isRet,
      @Param("pageable") Pageable pageable) {
    BasOrgGoodsvar obj = BasOrgGoodsvar.toExample();
    obj.setBadGoodsRate(badGoodsRate);
    obj.setProdArea(prodArea);
    obj.setQualSituDesc(qualSituDesc);
    obj.setSupplyStateDesc(supplyStateDesc);
    obj.setSupplyTrendDesc(supplyTrendDesc);
    obj.setIsMustSale(isMustSale);
    obj.setMustSaleDesc(mustSaleDesc);
    obj.setDifference(difference);
    obj.setGoodsWrapDesc(goodsWrapDesc);
    obj.setGoodsEva(goodsEva);
    obj.setTechDesc(techDesc);
    obj.setIsBEnabledC(isBEnabledC);
    obj.setIsCEnabledA(isCEnabledA);
    obj.setIsCEnabledN(isCEnabledN);
    obj.setIsCEnabledM(isCEnabledM);
    obj.setIsCEnabledO(isCEnabledO);
    obj.setIsCEnabledP(isCEnabledP);
    obj.setIsCEnabledC(isCEnabledC);
    obj.setIsCEnabledE(isCEnabledE);
    obj.setIsCEnabledF(isCEnabledF);
    obj.setEntId(entId);
    obj.setOrgId(orgId);
    obj.setGoodsVarId(goodsVarId);
    obj.setGoodsId(goodsId);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setUnitRate(unitRate);
    obj.setIsSale(isSale);
    obj.setIsReturn(isReturn);
    obj.setIsStockInv(isStockInv);
    obj.setIsRet(isRet);
    Example<BasOrgGoodsvar> example = Example.of(obj);

    return findAll(example, pageable).map(BasOrgGoodsvar.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGoodsvarDTO> findBy(
      @Param("badGoodsRate") java.math.BigDecimal badGoodsRate,
      @Param("prodArea") String prodArea,
      @Param("qualSituDesc") String qualSituDesc,
      @Param("supplyStateDesc") String supplyStateDesc,
      @Param("supplyTrendDesc") String supplyTrendDesc,
      @Param("isMustSale") Integer isMustSale,
      @Param("mustSaleDesc") String mustSaleDesc,
      @Param("difference") String difference,
      @Param("goodsWrapDesc") String goodsWrapDesc,
      @Param("goodsEva") String goodsEva,
      @Param("techDesc") String techDesc,
      @Param("isBEnabledC") Integer isBEnabledC,
      @Param("isCEnabledA") Integer isCEnabledA,
      @Param("isCEnabledN") Integer isCEnabledN,
      @Param("isCEnabledM") Integer isCEnabledM,
      @Param("isCEnabledO") Integer isCEnabledO,
      @Param("isCEnabledP") Integer isCEnabledP,
      @Param("isCEnabledC") Integer isCEnabledC,
      @Param("isCEnabledE") Integer isCEnabledE,
      @Param("isCEnabledF") Integer isCEnabledF,
      @Param("entId") Long entId,
      @Param("orgId") Long orgId,
      @Param("goodsVarId") Long goodsVarId,
      @Param("goodsId") Long goodsId,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("isSale") Integer isSale,
      @Param("isReturn") Integer isReturn,
      @Param("isStockInv") Integer isStockInv,
      @Param("isRet") Integer isRet) {
    BasOrgGoodsvar obj = BasOrgGoodsvar.toExample();
    obj.setBadGoodsRate(badGoodsRate);
    obj.setProdArea(prodArea);
    obj.setQualSituDesc(qualSituDesc);
    obj.setSupplyStateDesc(supplyStateDesc);
    obj.setSupplyTrendDesc(supplyTrendDesc);
    obj.setIsMustSale(isMustSale);
    obj.setMustSaleDesc(mustSaleDesc);
    obj.setDifference(difference);
    obj.setGoodsWrapDesc(goodsWrapDesc);
    obj.setGoodsEva(goodsEva);
    obj.setTechDesc(techDesc);
    obj.setIsBEnabledC(isBEnabledC);
    obj.setIsCEnabledA(isCEnabledA);
    obj.setIsCEnabledN(isCEnabledN);
    obj.setIsCEnabledM(isCEnabledM);
    obj.setIsCEnabledO(isCEnabledO);
    obj.setIsCEnabledP(isCEnabledP);
    obj.setIsCEnabledC(isCEnabledC);
    obj.setIsCEnabledE(isCEnabledE);
    obj.setIsCEnabledF(isCEnabledF);
    obj.setEntId(entId);
    obj.setOrgId(orgId);
    obj.setGoodsVarId(goodsVarId);
    obj.setGoodsId(goodsId);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setUnitRate(unitRate);
    obj.setIsSale(isSale);
    obj.setIsReturn(isReturn);
    obj.setIsStockInv(isStockInv);
    obj.setIsRet(isRet);
    Example<BasOrgGoodsvar> example = Example.of(obj);
    return findAll(example, null).map(BasOrgGoodsvar.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasOrgGoodsvarDTO> findByExample(
      @Param("example") BasOrgGoodsvar example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasOrgGoodsvar.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGoodsvarDTO> findByExample(@Param("example") BasOrgGoodsvar example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasOrgGoodsvar.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasOrgGoodsvarDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasOrgGoodsvar.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGoodsvarDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasOrgGoodsvar.DTO_CONVERTER)
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
  public Page<BasOrgGoodsvarDTO> findByFuzzySearch(
      @Param("example") BasOrgGoodsvar example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasOrgGoodsvar.DTO_CONVERTER);
  }

  @Override
  public Page<BasOrgGoodsvarDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasOrgGoodsvar example = BasOrgGoodsvar.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasOrgGoodsvar.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGoodsvarDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
