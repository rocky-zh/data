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
 * PriceAdjustSalDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceAdjustSalDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<PriceAdjustSalDetail, Long>
    implements PriceAdjustSalDetailRepositoryCustom {

  @Override
  protected Class<PriceAdjustSalDetail> getDomainClass() {
    return PriceAdjustSalDetail.class;
  }

  @Override
  public Page<PriceAdjustSalDetailDTO> findBy(
      @Param("adjustId") Long adjustId,
      @Param("adjustSeqno") String adjustSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsClassId") Long goodsClassId,
      @Param("goodsClassCode") String goodsClassCode,
      @Param("goodsClassName") String goodsClassName,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("salPrice") java.math.BigDecimal salPrice,
      @Param("returnPrice") java.math.BigDecimal returnPrice,
      @Param("remark") String remark,
      @Param("venOrgName") String venOrgName,
      @Param("status") Integer status,
      @Param("pageable") Pageable pageable) {
    PriceAdjustSalDetail obj = PriceAdjustSalDetail.toExample();
    obj.setAdjustId(adjustId);
    obj.setAdjustSeqno(adjustSeqno);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsClassId(goodsClassId);
    obj.setGoodsClassCode(goodsClassCode);
    obj.setGoodsClassName(goodsClassName);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setUnitRate(unitRate);
    obj.setSalPrice(salPrice);
    obj.setReturnPrice(returnPrice);
    obj.setRemark(remark);
    obj.setVenOrgName(venOrgName);
    obj.setStatus(status);
    Example<PriceAdjustSalDetail> example = Example.of(obj);

    return findAll(example, pageable).map(PriceAdjustSalDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustSalDetailDTO> findBy(
      @Param("adjustId") Long adjustId,
      @Param("adjustSeqno") String adjustSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsClassId") Long goodsClassId,
      @Param("goodsClassCode") String goodsClassCode,
      @Param("goodsClassName") String goodsClassName,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("salPrice") java.math.BigDecimal salPrice,
      @Param("returnPrice") java.math.BigDecimal returnPrice,
      @Param("remark") String remark,
      @Param("venOrgName") String venOrgName,
      @Param("status") Integer status) {
    PriceAdjustSalDetail obj = PriceAdjustSalDetail.toExample();
    obj.setAdjustId(adjustId);
    obj.setAdjustSeqno(adjustSeqno);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsClassId(goodsClassId);
    obj.setGoodsClassCode(goodsClassCode);
    obj.setGoodsClassName(goodsClassName);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setUnitRate(unitRate);
    obj.setSalPrice(salPrice);
    obj.setReturnPrice(returnPrice);
    obj.setRemark(remark);
    obj.setVenOrgName(venOrgName);
    obj.setStatus(status);
    Example<PriceAdjustSalDetail> example = Example.of(obj);
    return findAll(example, null).map(PriceAdjustSalDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PriceAdjustSalDetailDTO> findByExample(
      @Param("example") PriceAdjustSalDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PriceAdjustSalDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustSalDetailDTO> findByExample(
      @Param("example") PriceAdjustSalDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PriceAdjustSalDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PriceAdjustSalDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PriceAdjustSalDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustSalDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PriceAdjustSalDetail.DTO_CONVERTER)
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
  public Page<PriceAdjustSalDetailDTO> findByFuzzySearch(
      @Param("example") PriceAdjustSalDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(PriceAdjustSalDetail.DTO_CONVERTER);
  }

  @Override
  public Page<PriceAdjustSalDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PriceAdjustSalDetail example = PriceAdjustSalDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PriceAdjustSalDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustSalDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
