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
 * SalConsignOutExceptionLog扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignOutExceptionLogRepositoryImpl
    extends BaseRepositoryCustomImpl<SalConsignOutExceptionLog, Long>
    implements SalConsignOutExceptionLogRepositoryCustom {

  @Override
  protected Class<SalConsignOutExceptionLog> getDomainClass() {
    return SalConsignOutExceptionLog.class;
  }

  @Override
  public Page<SalConsignOutExceptionLogDTO> findBy(
      @Param("stockoutId") Long stockoutId,
      @Param("stockoutSeqno") String stockoutSeqno,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
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
      @Param("price") java.math.BigDecimal price,
      @Param("amount") java.math.BigDecimal amount,
      @Param("shipSeq") Integer shipSeq,
      @Param("consignTime") java.sql.Timestamp consignTime,
      @Param("consignerId") Long consignerId,
      @Param("consignerName") String consignerName,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("note") String note,
      @Param("pageable") Pageable pageable) {
    SalConsignOutExceptionLog obj = SalConsignOutExceptionLog.toExample();
    obj.setStockoutId(stockoutId);
    obj.setStockoutSeqno(stockoutSeqno);
    obj.setConId(conId);
    obj.setConSeqno(conSeqno);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
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
    obj.setPrice(price);
    obj.setAmount(amount);
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
    Example<SalConsignOutExceptionLog> example = Example.of(obj);

    return findAll(example, pageable).map(SalConsignOutExceptionLog.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutExceptionLogDTO> findBy(
      @Param("stockoutId") Long stockoutId,
      @Param("stockoutSeqno") String stockoutSeqno,
      @Param("conId") Long conId,
      @Param("conSeqno") String conSeqno,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
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
      @Param("price") java.math.BigDecimal price,
      @Param("amount") java.math.BigDecimal amount,
      @Param("shipSeq") Integer shipSeq,
      @Param("consignTime") java.sql.Timestamp consignTime,
      @Param("consignerId") Long consignerId,
      @Param("consignerName") String consignerName,
      @Param("stockoutStatus") Integer stockoutStatus,
      @Param("auditTime") java.sql.Timestamp auditTime,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("remark") String remark,
      @Param("note") String note) {
    SalConsignOutExceptionLog obj = SalConsignOutExceptionLog.toExample();
    obj.setStockoutId(stockoutId);
    obj.setStockoutSeqno(stockoutSeqno);
    obj.setConId(conId);
    obj.setConSeqno(conSeqno);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
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
    obj.setPrice(price);
    obj.setAmount(amount);
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
    Example<SalConsignOutExceptionLog> example = Example.of(obj);
    return findAll(example, null).map(SalConsignOutExceptionLog.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalConsignOutExceptionLogDTO> findByExample(
      @Param("example") SalConsignOutExceptionLog example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalConsignOutExceptionLog.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutExceptionLogDTO> findByExample(
      @Param("example") SalConsignOutExceptionLog example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null)
        .map(SalConsignOutExceptionLog.DTO_CONVERTER)
        .getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalConsignOutExceptionLogDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalConsignOutExceptionLog.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutExceptionLogDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalConsignOutExceptionLog.DTO_CONVERTER)
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
  public Page<SalConsignOutExceptionLogDTO> findByFuzzySearch(
      @Param("example") SalConsignOutExceptionLog example,
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
    return findAll(Example.of(example, matcher), pageable)
        .map(SalConsignOutExceptionLog.DTO_CONVERTER);
  }

  @Override
  public Page<SalConsignOutExceptionLogDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalConsignOutExceptionLog example = SalConsignOutExceptionLog.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalConsignOutExceptionLog.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignOutExceptionLogDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
