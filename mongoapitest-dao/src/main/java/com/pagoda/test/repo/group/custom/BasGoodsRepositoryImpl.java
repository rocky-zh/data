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
 * BasGoods扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsRepositoryImpl extends BaseRepositoryCustomImpl<BasGoods, Long>
    implements BasGoodsRepositoryCustom {

  @Override
  protected Class<BasGoods> getDomainClass() {
    return BasGoods.class;
  }

  @Override
  public Page<BasGoodsDTO> findBy(
      @Param("code") String code,
      @Param("name") String name,
      @Param("shortName") String shortName,
      @Param("traditName") String traditName,
      @Param("enName") String enName,
      @Param("entId") Long entId,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsOrigin") String goodsOrigin,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsType") Integer goodsType,
      @Param("searchWord") String searchWord,
      @Param("mnemWord") String mnemWord,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("invUnitId") Long invUnitId,
      @Param("invUnitName") String invUnitName,
      @Param("invUnitCode") String invUnitCode,
      @Param("invRate") java.math.BigDecimal invRate,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salRate") java.math.BigDecimal salRate,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("purRate") java.math.BigDecimal purRate,
      @Param("retUnitId") Long retUnitId,
      @Param("retUnitCode") String retUnitCode,
      @Param("retUnitName") String retUnitName,
      @Param("retRate") java.math.BigDecimal retRate,
      @Param("unitVolume") java.math.BigDecimal unitVolume,
      @Param("unitWeight") java.math.BigDecimal unitWeight,
      @Param("barcode") String barcode,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("isEntLot") Integer isEntLot,
      @Param("shelfLifeType") Integer shelfLifeType,
      @Param("shelfLifeQty") java.math.BigDecimal shelfLifeQty,
      @Param("isEnabled") Integer isEnabled,
      @Param("isPur") Integer isPur,
      @Param("isSale") Integer isSale,
      @Param("isRet") Integer isRet,
      @Param("pageable") Pageable pageable) {
    BasGoods obj = BasGoods.toExample();
    obj.setCode(code);
    obj.setName(name);
    obj.setShortName(shortName);
    obj.setTraditName(traditName);
    obj.setEnName(enName);
    obj.setEntId(entId);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsOrigin(goodsOrigin);
    obj.setGoodsLevel(goodsLevel);
    obj.setGoodsType(goodsType);
    obj.setSearchWord(searchWord);
    obj.setMnemWord(mnemWord);
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitName(basUnitName);
    obj.setInvUnitId(invUnitId);
    obj.setInvUnitName(invUnitName);
    obj.setInvUnitCode(invUnitCode);
    obj.setInvRate(invRate);
    obj.setSalUnitId(salUnitId);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitName(salUnitName);
    obj.setSalRate(salRate);
    obj.setPurUnitId(purUnitId);
    obj.setPurUnitCode(purUnitCode);
    obj.setPurUnitName(purUnitName);
    obj.setPurRate(purRate);
    obj.setRetUnitId(retUnitId);
    obj.setRetUnitCode(retUnitCode);
    obj.setRetUnitName(retUnitName);
    obj.setRetRate(retRate);
    obj.setUnitVolume(unitVolume);
    obj.setUnitWeight(unitWeight);
    obj.setBarcode(barcode);
    obj.setTaxRate(taxRate);
    obj.setIsEntLot(isEntLot);
    obj.setShelfLifeType(shelfLifeType);
    obj.setShelfLifeQty(shelfLifeQty);
    obj.setIsEnabled(isEnabled);
    obj.setIsPur(isPur);
    obj.setIsSale(isSale);
    obj.setIsRet(isRet);
    Example<BasGoods> example = Example.of(obj);

    return findAll(example, pageable).map(BasGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsDTO> findBy(
      @Param("code") String code,
      @Param("name") String name,
      @Param("shortName") String shortName,
      @Param("traditName") String traditName,
      @Param("enName") String enName,
      @Param("entId") Long entId,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsOrigin") String goodsOrigin,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsType") Integer goodsType,
      @Param("searchWord") String searchWord,
      @Param("mnemWord") String mnemWord,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("invUnitId") Long invUnitId,
      @Param("invUnitName") String invUnitName,
      @Param("invUnitCode") String invUnitCode,
      @Param("invRate") java.math.BigDecimal invRate,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salRate") java.math.BigDecimal salRate,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("purRate") java.math.BigDecimal purRate,
      @Param("retUnitId") Long retUnitId,
      @Param("retUnitCode") String retUnitCode,
      @Param("retUnitName") String retUnitName,
      @Param("retRate") java.math.BigDecimal retRate,
      @Param("unitVolume") java.math.BigDecimal unitVolume,
      @Param("unitWeight") java.math.BigDecimal unitWeight,
      @Param("barcode") String barcode,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("isEntLot") Integer isEntLot,
      @Param("shelfLifeType") Integer shelfLifeType,
      @Param("shelfLifeQty") java.math.BigDecimal shelfLifeQty,
      @Param("isEnabled") Integer isEnabled,
      @Param("isPur") Integer isPur,
      @Param("isSale") Integer isSale,
      @Param("isRet") Integer isRet) {
    BasGoods obj = BasGoods.toExample();
    obj.setCode(code);
    obj.setName(name);
    obj.setShortName(shortName);
    obj.setTraditName(traditName);
    obj.setEnName(enName);
    obj.setEntId(entId);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsOrigin(goodsOrigin);
    obj.setGoodsLevel(goodsLevel);
    obj.setGoodsType(goodsType);
    obj.setSearchWord(searchWord);
    obj.setMnemWord(mnemWord);
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitName(basUnitName);
    obj.setInvUnitId(invUnitId);
    obj.setInvUnitName(invUnitName);
    obj.setInvUnitCode(invUnitCode);
    obj.setInvRate(invRate);
    obj.setSalUnitId(salUnitId);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitName(salUnitName);
    obj.setSalRate(salRate);
    obj.setPurUnitId(purUnitId);
    obj.setPurUnitCode(purUnitCode);
    obj.setPurUnitName(purUnitName);
    obj.setPurRate(purRate);
    obj.setRetUnitId(retUnitId);
    obj.setRetUnitCode(retUnitCode);
    obj.setRetUnitName(retUnitName);
    obj.setRetRate(retRate);
    obj.setUnitVolume(unitVolume);
    obj.setUnitWeight(unitWeight);
    obj.setBarcode(barcode);
    obj.setTaxRate(taxRate);
    obj.setIsEntLot(isEntLot);
    obj.setShelfLifeType(shelfLifeType);
    obj.setShelfLifeQty(shelfLifeQty);
    obj.setIsEnabled(isEnabled);
    obj.setIsPur(isPur);
    obj.setIsSale(isSale);
    obj.setIsRet(isRet);
    Example<BasGoods> example = Example.of(obj);
    return findAll(example, null).map(BasGoods.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasGoodsDTO> findByExample(
      @Param("example") BasGoods example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsDTO> findByExample(@Param("example") BasGoods example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasGoods.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasGoodsDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(BasGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasGoods.DTO_CONVERTER)
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
  public Page<BasGoodsDTO> findByFuzzySearch(
      @Param("example") BasGoods example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasGoods.DTO_CONVERTER);
  }

  @Override
  public Page<BasGoodsDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasGoods example = BasGoods.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
