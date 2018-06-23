package com.pagoda.repo.group.custom;

import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
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
 * SalConsignDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignDetailRepositoryImpl extends BaseRepositoryCustomImpl<SalConsignDetail, Long>
    implements SalConsignDetailRepositoryCustom {

  @Override
  protected Class<SalConsignDetail> getDomainClass() {
    return SalConsignDetail.class;
  }

  @Override
  public Page<SalConsignDetailDTO> findBy(
      @Param("actualAmt") java.math.BigDecimal actualAmt,
      @Param("conId") Long conId,
      @Param("conNo") String conNo,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("enabled") Boolean enabled,
      @Param("goodsCode") String goodsCode,
      @Param("goodsId") Long goodsId,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("grossWeight") java.math.BigDecimal grossWeight,
      @Param("netWeight") java.math.BigDecimal netWeight,
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("price") java.math.BigDecimal price,
      @Param("qty") java.math.BigDecimal qty,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("shippedCount") Integer shippedCount,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("volume") java.math.BigDecimal volume,
      @Param("pageable") Pageable pageable) {
    SalConsignDetail obj = SalConsignDetail.toExample();
    obj.setActualAmt(actualAmt);
    obj.setConId(conId);
    obj.setConNo(conNo);
    obj.setDiscountPrice(discountPrice);
    obj.setDiscountRate(discountRate);
    obj.setEnabled(enabled);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsId(goodsId);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setGrossWeight(grossWeight);
    obj.setNetWeight(netWeight);
    obj.setOrderId(orderId);
    obj.setOrderNo(orderNo);
    obj.setPrice(price);
    obj.setQty(qty);
    obj.setSalConOutDepotCode(salConOutDepotCode);
    obj.setSalConOutDepotId(salConOutDepotId);
    obj.setSalConOutDepotName(salConOutDepotName);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitId(salUnitId);
    obj.setSalUnitName(salUnitName);
    obj.setSalUnitRate(salUnitRate);
    obj.setShippedAmt(shippedAmt);
    obj.setShippedCount(shippedCount);
    obj.setShippedGrossWeight(shippedGrossWeight);
    obj.setShippedNetWeight(shippedNetWeight);
    obj.setShippedPrice(shippedPrice);
    obj.setShippedQty(shippedQty);
    obj.setShippedVolume(shippedVolume);
    obj.setTaxAmt(taxAmt);
    obj.setTaxRate(taxRate);
    obj.setTotalAmt(totalAmt);
    obj.setVolume(volume);
    Example<SalConsignDetail> example = Example.of(obj);

    return findAll(example, pageable).map(SalConsignDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignDetailDTO> findBy(
      @Param("actualAmt") java.math.BigDecimal actualAmt,
      @Param("conId") Long conId,
      @Param("conNo") String conNo,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("enabled") Boolean enabled,
      @Param("goodsCode") String goodsCode,
      @Param("goodsId") Long goodsId,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("grossWeight") java.math.BigDecimal grossWeight,
      @Param("netWeight") java.math.BigDecimal netWeight,
      @Param("orderId") Long orderId,
      @Param("orderNo") String orderNo,
      @Param("price") java.math.BigDecimal price,
      @Param("qty") java.math.BigDecimal qty,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("shippedCount") Integer shippedCount,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("volume") java.math.BigDecimal volume) {
    SalConsignDetail obj = SalConsignDetail.toExample();
    obj.setActualAmt(actualAmt);
    obj.setConId(conId);
    obj.setConNo(conNo);
    obj.setDiscountPrice(discountPrice);
    obj.setDiscountRate(discountRate);
    obj.setEnabled(enabled);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsId(goodsId);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setGrossWeight(grossWeight);
    obj.setNetWeight(netWeight);
    obj.setOrderId(orderId);
    obj.setOrderNo(orderNo);
    obj.setPrice(price);
    obj.setQty(qty);
    obj.setSalConOutDepotCode(salConOutDepotCode);
    obj.setSalConOutDepotId(salConOutDepotId);
    obj.setSalConOutDepotName(salConOutDepotName);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitId(salUnitId);
    obj.setSalUnitName(salUnitName);
    obj.setSalUnitRate(salUnitRate);
    obj.setShippedAmt(shippedAmt);
    obj.setShippedCount(shippedCount);
    obj.setShippedGrossWeight(shippedGrossWeight);
    obj.setShippedNetWeight(shippedNetWeight);
    obj.setShippedPrice(shippedPrice);
    obj.setShippedQty(shippedQty);
    obj.setShippedVolume(shippedVolume);
    obj.setTaxAmt(taxAmt);
    obj.setTaxRate(taxRate);
    obj.setTotalAmt(totalAmt);
    obj.setVolume(volume);
    Example<SalConsignDetail> example = Example.of(obj);
    return findAll(example, null).map(SalConsignDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalConsignDetailDTO> findByExample(
      @Param("example") SalConsignDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalConsignDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignDetailDTO> findByExample(@Param("example") SalConsignDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalConsignDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalConsignDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalConsignDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalConsignDetail.DTO_CONVERTER)
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
  public Page<SalConsignDetailDTO> findByFuzzySearch(
      @Param("example") SalConsignDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(SalConsignDetail.DTO_CONVERTER);
  }

  @Override
  public Page<SalConsignDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalConsignDetail example = SalConsignDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalConsignDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
