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
 * BasOrgGoods扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgGoodsRepositoryImpl extends BaseRepositoryCustomImpl<BasOrgGoods, Long>
    implements BasOrgGoodsRepositoryCustom {

  @Override
  protected Class<BasOrgGoods> getDomainClass() {
    return BasOrgGoods.class;
  }

  @Override
  public Page<BasOrgGoodsDTO> findBy(
      @Param("orgId") Long orgId,
      @Param("orgCode") String orgCode,
      @Param("orgName") String orgName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("entId") Long entId,
      @Param("isOrgLot") Integer isOrgLot,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("isEnabled") Integer isEnabled,
      @Param("isPur") Integer isPur,
      @Param("purRetOutDepotCode") String purRetOutDepotCode,
      @Param("purRetOutDepotName") String purRetOutDepotName,
      @Param("purRetOutDepotId") Long purRetOutDepotId,
      @Param("purRecInDepotId") Long purRecInDepotId,
      @Param("purRecInDepotCode") String purRecInDepotCode,
      @Param("purRecInDepotName") String purRecInDepotName,
      @Param("salConInDepotId") Long salConInDepotId,
      @Param("salConInDepotCode") String salConInDepotCode,
      @Param("salConInDepotName") String salConInDepotName,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("salRetInDepotId") Long salRetInDepotId,
      @Param("salRetInDepotCode") String salRetInDepotCode,
      @Param("salRetInDepotName") String salRetInDepotName,
      @Param("salRetOutDepotId") Long salRetOutDepotId,
      @Param("salRetOutDepotCode") String salRetOutDepotCode,
      @Param("salRetOutDepotName") String salRetOutDepotName,
      @Param("isDataDetail") Integer isDataDetail,
      @Param("batchQty") java.math.BigDecimal batchQty,
      @Param("batchPolicy") Integer batchPolicy,
      @Param("isSale") Integer isSale,
      @Param("isReturn") Integer isReturn,
      @Param("isTrans") Integer isTrans,
      @Param("conCycle") java.math.BigDecimal conCycle,
      @Param("isStockInv") Integer isStockInv,
      @Param("isRet") Integer isRet,
      @Param("isMustRet") Integer isMustRet,
      @Param("purExcRatio") java.math.BigDecimal purExcRatio,
      @Param("isDefDepot") Integer isDefDepot,
      @Param("pageable") Pageable pageable) {
    BasOrgGoods obj = BasOrgGoods.toExample();
    obj.setOrgId(orgId);
    obj.setOrgCode(orgCode);
    obj.setOrgName(orgName);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setEntId(entId);
    obj.setIsOrgLot(isOrgLot);
    obj.setTaxRate(taxRate);
    obj.setIsEnabled(isEnabled);
    obj.setIsPur(isPur);
    obj.setPurRetOutDepotCode(purRetOutDepotCode);
    obj.setPurRetOutDepotName(purRetOutDepotName);
    obj.setPurRetOutDepotId(purRetOutDepotId);
    obj.setPurRecInDepotId(purRecInDepotId);
    obj.setPurRecInDepotCode(purRecInDepotCode);
    obj.setPurRecInDepotName(purRecInDepotName);
    obj.setSalConInDepotId(salConInDepotId);
    obj.setSalConInDepotCode(salConInDepotCode);
    obj.setSalConInDepotName(salConInDepotName);
    obj.setSalConOutDepotId(salConOutDepotId);
    obj.setSalConOutDepotCode(salConOutDepotCode);
    obj.setSalConOutDepotName(salConOutDepotName);
    obj.setSalRetInDepotId(salRetInDepotId);
    obj.setSalRetInDepotCode(salRetInDepotCode);
    obj.setSalRetInDepotName(salRetInDepotName);
    obj.setSalRetOutDepotId(salRetOutDepotId);
    obj.setSalRetOutDepotCode(salRetOutDepotCode);
    obj.setSalRetOutDepotName(salRetOutDepotName);
    obj.setIsDataDetail(isDataDetail);
    obj.setBatchQty(batchQty);
    obj.setBatchPolicy(batchPolicy);
    obj.setIsSale(isSale);
    obj.setIsReturn(isReturn);
    obj.setIsTrans(isTrans);
    obj.setConCycle(conCycle);
    obj.setIsStockInv(isStockInv);
    obj.setIsRet(isRet);
    obj.setIsMustRet(isMustRet);
    obj.setPurExcRatio(purExcRatio);
    obj.setIsDefDepot(isDefDepot);
    Example<BasOrgGoods> example = Example.of(obj);

    return findAll(example, pageable).map(BasOrgGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGoodsDTO> findBy(
      @Param("orgId") Long orgId,
      @Param("orgCode") String orgCode,
      @Param("orgName") String orgName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("entId") Long entId,
      @Param("isOrgLot") Integer isOrgLot,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("isEnabled") Integer isEnabled,
      @Param("isPur") Integer isPur,
      @Param("purRetOutDepotCode") String purRetOutDepotCode,
      @Param("purRetOutDepotName") String purRetOutDepotName,
      @Param("purRetOutDepotId") Long purRetOutDepotId,
      @Param("purRecInDepotId") Long purRecInDepotId,
      @Param("purRecInDepotCode") String purRecInDepotCode,
      @Param("purRecInDepotName") String purRecInDepotName,
      @Param("salConInDepotId") Long salConInDepotId,
      @Param("salConInDepotCode") String salConInDepotCode,
      @Param("salConInDepotName") String salConInDepotName,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("salRetInDepotId") Long salRetInDepotId,
      @Param("salRetInDepotCode") String salRetInDepotCode,
      @Param("salRetInDepotName") String salRetInDepotName,
      @Param("salRetOutDepotId") Long salRetOutDepotId,
      @Param("salRetOutDepotCode") String salRetOutDepotCode,
      @Param("salRetOutDepotName") String salRetOutDepotName,
      @Param("isDataDetail") Integer isDataDetail,
      @Param("batchQty") java.math.BigDecimal batchQty,
      @Param("batchPolicy") Integer batchPolicy,
      @Param("isSale") Integer isSale,
      @Param("isReturn") Integer isReturn,
      @Param("isTrans") Integer isTrans,
      @Param("conCycle") java.math.BigDecimal conCycle,
      @Param("isStockInv") Integer isStockInv,
      @Param("isRet") Integer isRet,
      @Param("isMustRet") Integer isMustRet,
      @Param("purExcRatio") java.math.BigDecimal purExcRatio,
      @Param("isDefDepot") Integer isDefDepot) {
    BasOrgGoods obj = BasOrgGoods.toExample();
    obj.setOrgId(orgId);
    obj.setOrgCode(orgCode);
    obj.setOrgName(orgName);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setEntId(entId);
    obj.setIsOrgLot(isOrgLot);
    obj.setTaxRate(taxRate);
    obj.setIsEnabled(isEnabled);
    obj.setIsPur(isPur);
    obj.setPurRetOutDepotCode(purRetOutDepotCode);
    obj.setPurRetOutDepotName(purRetOutDepotName);
    obj.setPurRetOutDepotId(purRetOutDepotId);
    obj.setPurRecInDepotId(purRecInDepotId);
    obj.setPurRecInDepotCode(purRecInDepotCode);
    obj.setPurRecInDepotName(purRecInDepotName);
    obj.setSalConInDepotId(salConInDepotId);
    obj.setSalConInDepotCode(salConInDepotCode);
    obj.setSalConInDepotName(salConInDepotName);
    obj.setSalConOutDepotId(salConOutDepotId);
    obj.setSalConOutDepotCode(salConOutDepotCode);
    obj.setSalConOutDepotName(salConOutDepotName);
    obj.setSalRetInDepotId(salRetInDepotId);
    obj.setSalRetInDepotCode(salRetInDepotCode);
    obj.setSalRetInDepotName(salRetInDepotName);
    obj.setSalRetOutDepotId(salRetOutDepotId);
    obj.setSalRetOutDepotCode(salRetOutDepotCode);
    obj.setSalRetOutDepotName(salRetOutDepotName);
    obj.setIsDataDetail(isDataDetail);
    obj.setBatchQty(batchQty);
    obj.setBatchPolicy(batchPolicy);
    obj.setIsSale(isSale);
    obj.setIsReturn(isReturn);
    obj.setIsTrans(isTrans);
    obj.setConCycle(conCycle);
    obj.setIsStockInv(isStockInv);
    obj.setIsRet(isRet);
    obj.setIsMustRet(isMustRet);
    obj.setPurExcRatio(purExcRatio);
    obj.setIsDefDepot(isDefDepot);
    Example<BasOrgGoods> example = Example.of(obj);
    return findAll(example, null).map(BasOrgGoods.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasOrgGoodsDTO> findByExample(
      @Param("example") BasOrgGoods example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasOrgGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGoodsDTO> findByExample(@Param("example") BasOrgGoods example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasOrgGoods.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasOrgGoodsDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(BasOrgGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGoodsDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasOrgGoods.DTO_CONVERTER)
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
  public Page<BasOrgGoodsDTO> findByFuzzySearch(
      @Param("example") BasOrgGoods example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasOrgGoods.DTO_CONVERTER);
  }

  @Override
  public Page<BasOrgGoodsDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasOrgGoods example = BasOrgGoods.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasOrgGoods.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGoodsDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
