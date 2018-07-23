package com.pagoda.repo.salconsignout.custom;

import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.domain.salconsignout.*;
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
 * SalConsignOutDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignOutDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<SalConsignOutDetail, Long>
    implements SalConsignOutDetailRepositoryCustom {

  @Override
  protected Class<SalConsignOutDetail> getDomainClass() {
    return SalConsignOutDetail.class;
  }

  @Override
  public Page<SalConsignOutDetailDTO> findBy(
      @Param("stockoutId") Long stockoutId,
      @Param("stockoutSeqno") String stockoutSeqno,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("shipSeq") Integer shipSeq,
      @Param("consignTime") java.util.Date consignTime,
      @Param("consignerId") Long consignerId,
      @Param("consignerName") String consignerName,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditTime") java.util.Date auditTime,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("note") String note,
      @Param("pageable") Pageable pageable) {
    SalConsignOutDetail obj = SalConsignOutDetail.toExample();
    obj.setStockoutId(stockoutId);
    obj.setStockoutSeqno(stockoutSeqno);
    obj.setConId(conId);
    obj.setConSeqno(conSeqno);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setSalUnitId(salUnitId);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitName(salUnitName);
    obj.setSalUnitRate(salUnitRate);
    obj.setSalConOutDepotId(salConOutDepotId);
    obj.setSalConOutDepotCode(salConOutDepotCode);
    obj.setSalConOutDepotName(salConOutDepotName);
    obj.setShippedQty(shippedQty);
    obj.setShippedNetWeight(shippedNetWeight);
    obj.setShippedGrossWeight(shippedGrossWeight);
    obj.setShippedVolume(shippedVolume);
    obj.setShippedPrice(shippedPrice);
    obj.setShippedAmt(shippedAmt);
    obj.setTaxRate(taxRate);
    obj.setTaxAmt(taxAmt);
    obj.setShipSeq(shipSeq);
    obj.setConsignTime(consignTime);
    obj.setConsignerId(consignerId);
    obj.setConsignerName(consignerName);
    obj.setStockoutStatus(stockoutStatus);
    obj.setAuditTime(auditTime);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setRemark(remark);
    obj.setNote(note);
    Example<SalConsignOutDetail> example = Example.of(obj);

    return findAll(example, pageable).map(SalConsignOutDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutDetailDTO> findBy(
      @Param("stockoutId") Long stockoutId,
      @Param("stockoutSeqno") String stockoutSeqno,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("salUnitId") Long salUnitId,
      @Param("salUnitCode") String salUnitCode,
      @Param("salUnitName") String salUnitName,
      @Param("salUnitRate") java.math.BigDecimal salUnitRate,
      @Param("salConOutDepotId") Long salConOutDepotId,
      @Param("salConOutDepotCode") String salConOutDepotCode,
      @Param("salConOutDepotName") String salConOutDepotName,
      @Param("shippedQty") java.math.BigDecimal shippedQty,
      @Param("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @Param("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @Param("shippedVolume") java.math.BigDecimal shippedVolume,
      @Param("shippedPrice") java.math.BigDecimal shippedPrice,
      @Param("shippedAmt") java.math.BigDecimal shippedAmt,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("taxAmt") java.math.BigDecimal taxAmt,
      @Param("shipSeq") Integer shipSeq,
      @Param("consignTime") java.util.Date consignTime,
      @Param("consignerId") Long consignerId,
      @Param("consignerName") String consignerName,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditTime") java.util.Date auditTime,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("note") String note) {
    SalConsignOutDetail obj = SalConsignOutDetail.toExample();
    obj.setStockoutId(stockoutId);
    obj.setStockoutSeqno(stockoutSeqno);
    obj.setConId(conId);
    obj.setConSeqno(conSeqno);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setSalUnitId(salUnitId);
    obj.setSalUnitCode(salUnitCode);
    obj.setSalUnitName(salUnitName);
    obj.setSalUnitRate(salUnitRate);
    obj.setSalConOutDepotId(salConOutDepotId);
    obj.setSalConOutDepotCode(salConOutDepotCode);
    obj.setSalConOutDepotName(salConOutDepotName);
    obj.setShippedQty(shippedQty);
    obj.setShippedNetWeight(shippedNetWeight);
    obj.setShippedGrossWeight(shippedGrossWeight);
    obj.setShippedVolume(shippedVolume);
    obj.setShippedPrice(shippedPrice);
    obj.setShippedAmt(shippedAmt);
    obj.setTaxRate(taxRate);
    obj.setTaxAmt(taxAmt);
    obj.setShipSeq(shipSeq);
    obj.setConsignTime(consignTime);
    obj.setConsignerId(consignerId);
    obj.setConsignerName(consignerName);
    obj.setStockoutStatus(stockoutStatus);
    obj.setAuditTime(auditTime);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setRemark(remark);
    obj.setNote(note);
    Example<SalConsignOutDetail> example = Example.of(obj);
    return findAll(example, null).map(SalConsignOutDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalConsignOutDetailDTO> findByExample(
      @Param("example") SalConsignOutDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalConsignOutDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutDetailDTO> findByExample(@Param("example") SalConsignOutDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalConsignOutDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalConsignOutDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalConsignOutDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalConsignOutDetail.DTO_CONVERTER)
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
  public Page<SalConsignOutDetailDTO> findByFuzzySearch(
      @Param("example") SalConsignOutDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(SalConsignOutDetail.DTO_CONVERTER);
  }

  @Override
  public Page<SalConsignOutDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalConsignOutDetail example = SalConsignOutDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalConsignOutDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
