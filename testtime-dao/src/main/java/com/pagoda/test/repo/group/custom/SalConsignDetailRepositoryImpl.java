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
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("salunitId") Long salunitId,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("grossWeight") java.math.BigDecimal grossWeight,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("netWeight") java.math.BigDecimal netWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("qty") java.math.BigDecimal qty,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("volume") java.math.BigDecimal volume,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("price") java.math.BigDecimal price,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("actualAmt") java.math.BigDecimal actualAmt,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedCount") Integer shippedCount,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("entId") Long entId,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    SalConsignDetail obj = SalConsignDetail.toExample();
    obj.setConId(conId);
    obj.setConSeqno(conSeqno);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setSalunitId(salunitId);
    obj.setSalUnitRate(salUnitRate);
    obj.setSalConOutDepotId(salConOutDepotId);
    obj.setSalConOutDepotCode(salConOutDepotCode);
    obj.setSalConOutDepotName(salConOutDepotName);
    obj.setGrossWeight(grossWeight);
    obj.setShippedGrossWeight(shippedGrossWeight);
    obj.setNetWeight(netWeight);
    obj.setShippedNetWeight(shippedNetWeight);
    obj.setQty(qty);
    obj.setShippedQty(shippedQty);
    obj.setVolume(volume);
    obj.setShippedVolume(shippedVolume);
    obj.setTaxAmt(taxAmt);
    obj.setPrice(price);
    obj.setTotalAmt(totalAmt);
    obj.setDiscountRate(discountRate);
    obj.setActualAmt(actualAmt);
    obj.setDiscountPrice(discountPrice);
    obj.setShippedPrice(shippedPrice);
    obj.setShippedCount(shippedCount);
    obj.setShippedAmt(shippedAmt);
    obj.setEntId(entId);
    obj.setGoodsSpec(goodsSpec);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitName(salUnitName);
    obj.setTaxRate(taxRate);
    obj.setRemark(remark);
    Example<SalConsignDetail> example = Example.of(obj);

    return findAll(example, pageable).map(SalConsignDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignDetailDTO> findBy(
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("salunitId") Long salunitId,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("grossWeight") java.math.BigDecimal grossWeight,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("netWeight") java.math.BigDecimal netWeight,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("qty") java.math.BigDecimal qty,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("volume") java.math.BigDecimal volume,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("price") java.math.BigDecimal price,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("actualAmt") java.math.BigDecimal actualAmt,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedCount") Integer shippedCount,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("entId") Long entId,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("remark") String remark) {
    SalConsignDetail obj = SalConsignDetail.toExample();
    obj.setConId(conId);
    obj.setConSeqno(conSeqno);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setSalunitId(salunitId);
    obj.setSalUnitRate(salUnitRate);
    obj.setSalConOutDepotId(salConOutDepotId);
    obj.setSalConOutDepotCode(salConOutDepotCode);
    obj.setSalConOutDepotName(salConOutDepotName);
    obj.setGrossWeight(grossWeight);
    obj.setShippedGrossWeight(shippedGrossWeight);
    obj.setNetWeight(netWeight);
    obj.setShippedNetWeight(shippedNetWeight);
    obj.setQty(qty);
    obj.setShippedQty(shippedQty);
    obj.setVolume(volume);
    obj.setShippedVolume(shippedVolume);
    obj.setTaxAmt(taxAmt);
    obj.setPrice(price);
    obj.setTotalAmt(totalAmt);
    obj.setDiscountRate(discountRate);
    obj.setActualAmt(actualAmt);
    obj.setDiscountPrice(discountPrice);
    obj.setShippedPrice(shippedPrice);
    obj.setShippedCount(shippedCount);
    obj.setShippedAmt(shippedAmt);
    obj.setEntId(entId);
    obj.setGoodsSpec(goodsSpec);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitName(salUnitName);
    obj.setTaxRate(taxRate);
    obj.setRemark(remark);
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