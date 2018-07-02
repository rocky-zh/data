package com.pagoda.repo.salorderhead.custom;

import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.domain.salorderhead.*;
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
 * SalOrderDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalOrderDetailRepositoryImpl extends BaseRepositoryCustomImpl<SalOrderDetail, Long>
    implements SalOrderDetailRepositoryCustom {

  @Override
  protected Class<SalOrderDetail> getDomainClass() {
    return SalOrderDetail.class;
  }

  @Override
  public Page<SalOrderDetailDTO> findBy(
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsVarId") Long goodsVarId,
      @Param("goodsVarName") String goodsVarName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitid") Long salUnitid,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("maxOrderQty") java.math.BigDecimal maxOrderQty,
      @Param("minOrderQty") java.math.BigDecimal minOrderQty,
      @Param("price") java.math.BigDecimal price,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("discountAmt") java.math.BigDecimal discountAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("goodsAmt") java.math.BigDecimal goodsAmt,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("remark") String remark,
      @Param("sourceType") Integer sourceType,
      @Param("sourceId") Long sourceId,
      @Param("sourceNo") String sourceNo,
      @Param("pageable") Pageable pageable) {
    SalOrderDetail obj = SalOrderDetail.toExample();
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setGoodsVarId(goodsVarId);
    obj.setGoodsVarName(goodsVarName);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setSalUnitid(salUnitid);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitName(salUnitName);
    obj.setSalUnitRate(salUnitRate);
    obj.setRequestQty(requestQty);
    obj.setMaxOrderQty(maxOrderQty);
    obj.setMinOrderQty(minOrderQty);
    obj.setPrice(price);
    obj.setDiscountPrice(discountPrice);
    obj.setDiscountRate(discountRate);
    obj.setDiscountAmt(discountAmt);
    obj.setTaxRate(taxRate);
    obj.setTaxAmt(taxAmt);
    obj.setGoodsAmt(goodsAmt);
    obj.setTotalAmt(totalAmt);
    obj.setRemark(remark);
    obj.setSourceType(sourceType);
    obj.setSourceId(sourceId);
    obj.setSourceNo(sourceNo);
    Example<SalOrderDetail> example = Example.of(obj);

    return findAll(example, pageable).map(SalOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderDetailDTO> findBy(
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsVarId") Long goodsVarId,
      @Param("goodsVarName") String goodsVarName,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitid") Long salUnitid,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("maxOrderQty") java.math.BigDecimal maxOrderQty,
      @Param("minOrderQty") java.math.BigDecimal minOrderQty,
      @Param("price") java.math.BigDecimal price,
      @Param("discountPrice") java.math.BigDecimal discountPrice,
      @Param("discountRate") java.math.BigDecimal discountRate,
      @Param("discountAmt") java.math.BigDecimal discountAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("goodsAmt") java.math.BigDecimal goodsAmt,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("remark") String remark,
      @Param("sourceType") Integer sourceType,
      @Param("sourceId") Long sourceId,
      @Param("sourceNo") String sourceNo) {
    SalOrderDetail obj = SalOrderDetail.toExample();
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setGoodsVarId(goodsVarId);
    obj.setGoodsVarName(goodsVarName);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setSalUnitid(salUnitid);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitName(salUnitName);
    obj.setSalUnitRate(salUnitRate);
    obj.setRequestQty(requestQty);
    obj.setMaxOrderQty(maxOrderQty);
    obj.setMinOrderQty(minOrderQty);
    obj.setPrice(price);
    obj.setDiscountPrice(discountPrice);
    obj.setDiscountRate(discountRate);
    obj.setDiscountAmt(discountAmt);
    obj.setTaxRate(taxRate);
    obj.setTaxAmt(taxAmt);
    obj.setGoodsAmt(goodsAmt);
    obj.setTotalAmt(totalAmt);
    obj.setRemark(remark);
    obj.setSourceType(sourceType);
    obj.setSourceId(sourceId);
    obj.setSourceNo(sourceNo);
    Example<SalOrderDetail> example = Example.of(obj);
    return findAll(example, null).map(SalOrderDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalOrderDetailDTO> findByExample(
      @Param("example") SalOrderDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderDetailDTO> findByExample(@Param("example") SalOrderDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalOrderDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalOrderDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalOrderDetail.DTO_CONVERTER)
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
  public Page<SalOrderDetailDTO> findByFuzzySearch(
      @Param("example") SalOrderDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(SalOrderDetail.DTO_CONVERTER);
  }

  @Override
  public Page<SalOrderDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalOrderDetail example = SalOrderDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
