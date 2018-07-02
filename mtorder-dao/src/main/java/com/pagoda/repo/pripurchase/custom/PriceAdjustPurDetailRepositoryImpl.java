package com.pagoda.repo.pripurchase.custom;

import com.pagoda.api.dto.pripurchase.*;
import com.pagoda.domain.pripurchase.*;
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
 * PriceAdjustPurDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceAdjustPurDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<PriceAdjustPurDetail, Long>
    implements PriceAdjustPurDetailRepositoryCustom {

  @Override
  protected Class<PriceAdjustPurDetail> getDomainClass() {
    return PriceAdjustPurDetail.class;
  }

  @Override
  public Page<PriceAdjustPurDetailDTO> findBy(
      @Param("adjustId") Long adjustId,
      @Param("adjustSeqno") String adjustSeqno,
      @Param("entId") Long entId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsId") Long goodsId,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsClassId") Long goodsClassId,
      @Param("goodsClassCode") String goodsClassCode,
      @Param("goodsClassName") String goodsClassName,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("purPrice") java.math.BigDecimal purPrice,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    PriceAdjustPurDetail obj = PriceAdjustPurDetail.toExample();
    obj.setAdjustId(adjustId);
    obj.setAdjustSeqno(adjustSeqno);
    obj.setEntId(entId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsId(goodsId);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsClassId(goodsClassId);
    obj.setGoodsClassCode(goodsClassCode);
    obj.setGoodsClassName(goodsClassName);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setUnitRate(unitRate);
    obj.setPurPrice(purPrice);
    obj.setRemark(remark);
    Example<PriceAdjustPurDetail> example = Example.of(obj);

    return findAll(example, pageable).map(PriceAdjustPurDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustPurDetailDTO> findBy(
      @Param("adjustId") Long adjustId,
      @Param("adjustSeqno") String adjustSeqno,
      @Param("entId") Long entId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsId") Long goodsId,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsClassId") Long goodsClassId,
      @Param("goodsClassCode") String goodsClassCode,
      @Param("goodsClassName") String goodsClassName,
      @Param("unitId") Long unitId,
      @Param("unitCode") String unitCode,
      @Param("unitName") String unitName,
      @Param("unitRate") java.math.BigDecimal unitRate,
      @Param("purPrice") java.math.BigDecimal purPrice,
      @Param("remark") String remark) {
    PriceAdjustPurDetail obj = PriceAdjustPurDetail.toExample();
    obj.setAdjustId(adjustId);
    obj.setAdjustSeqno(adjustSeqno);
    obj.setEntId(entId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsId(goodsId);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsClassId(goodsClassId);
    obj.setGoodsClassCode(goodsClassCode);
    obj.setGoodsClassName(goodsClassName);
    obj.setUnitId(unitId);
    obj.setUnitCode(unitCode);
    obj.setUnitName(unitName);
    obj.setUnitRate(unitRate);
    obj.setPurPrice(purPrice);
    obj.setRemark(remark);
    Example<PriceAdjustPurDetail> example = Example.of(obj);
    return findAll(example, null).map(PriceAdjustPurDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PriceAdjustPurDetailDTO> findByExample(
      @Param("example") PriceAdjustPurDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PriceAdjustPurDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustPurDetailDTO> findByExample(
      @Param("example") PriceAdjustPurDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PriceAdjustPurDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PriceAdjustPurDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PriceAdjustPurDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustPurDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PriceAdjustPurDetail.DTO_CONVERTER)
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
  public Page<PriceAdjustPurDetailDTO> findByFuzzySearch(
      @Param("example") PriceAdjustPurDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(PriceAdjustPurDetail.DTO_CONVERTER);
  }

  @Override
  public Page<PriceAdjustPurDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PriceAdjustPurDetail example = PriceAdjustPurDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PriceAdjustPurDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceAdjustPurDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
