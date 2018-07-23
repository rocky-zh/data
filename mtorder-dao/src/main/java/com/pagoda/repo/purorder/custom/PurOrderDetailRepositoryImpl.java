package com.pagoda.repo.purorder.custom;

import com.pagoda.api.dto.purorder.*;
import com.pagoda.domain.purorder.*;
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
 * PurOrderDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurOrderDetailRepositoryImpl extends BaseRepositoryCustomImpl<PurOrderDetail, Long>
    implements PurOrderDetailRepositoryCustom {

  @Override
  protected Class<PurOrderDetail> getDomainClass() {
    return PurOrderDetail.class;
  }

  @Override
  public Page<PurOrderDetailDTO> findBy(
      @Param("recOrgId") Long recOrgId,
      @Param("recOrgCode") String recOrgCode,
      @Param("recOrgName") String recOrgName,
      @Param("isPrePrice") Integer isPrePrice,
      @Param("purQty") java.math.BigDecimal purQty,
      @Param("discountType") Integer discountType,
      @Param("isRec") Integer isRec,
      @Param("recQty") java.math.BigDecimal recQty,
      @Param("isRecInv") Integer isRecInv,
      @Param("billStatus") Integer billStatus,
      @Param("billQty") java.math.BigDecimal billQty,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsOrion") String goodsOrion,
      @Param("applyQty") java.math.BigDecimal applyQty,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("purUnitRate") java.math.BigDecimal purUnitRate,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("sourceType") Integer sourceType,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("purPrice") java.math.BigDecimal purPrice,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("discountAmt") java.math.BigDecimal discountAmt,
      @Param("isReturn") Integer isReturn,
      @Param("returnQty") java.math.BigDecimal returnQty,
      @Param("applyId") Long applyId,
      @Param("applySeqno") String applySeqno,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("remark") String remark,
      @Param("stockinQty") java.math.BigDecimal stockinQty,
      @Param("pageable") Pageable pageable) {
    PurOrderDetail obj = PurOrderDetail.toExample();
    obj.setRecOrgId(recOrgId);
    obj.setRecOrgCode(recOrgCode);
    obj.setRecOrgName(recOrgName);
    obj.setIsPrePrice(isPrePrice);
    obj.setPurQty(purQty);
    obj.setDiscountType(discountType);
    obj.setIsRec(isRec);
    obj.setRecQty(recQty);
    obj.setIsRecInv(isRecInv);
    obj.setBillStatus(billStatus);
    obj.setBillQty(billQty);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsLevel(goodsLevel);
    obj.setGoodsOrion(goodsOrion);
    obj.setApplyQty(applyQty);
    obj.setPurUnitId(purUnitId);
    obj.setPurUnitCode(purUnitCode);
    obj.setPurUnitName(purUnitName);
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitName(basUnitName);
    obj.setPurUnitRate(purUnitRate);
    obj.setArrOrgId(arrOrgId);
    obj.setArrOrgCode(arrOrgCode);
    obj.setArrOrgName(arrOrgName);
    obj.setSourceType(sourceType);
    obj.setRequestQty(requestQty);
    obj.setPlanRecDate(planRecDate);
    obj.setPurPrice(purPrice);
    obj.setTaxRate(taxRate);
    obj.setDiscountAmt(discountAmt);
    obj.setIsReturn(isReturn);
    obj.setReturnQty(returnQty);
    obj.setApplyId(applyId);
    obj.setApplySeqno(applySeqno);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setRemark(remark);
    obj.setStockinQty(stockinQty);
    Example<PurOrderDetail> example = Example.of(obj);

    return findAll(example, pageable).map(PurOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<PurOrderDetailDTO> findBy(
      @Param("recOrgId") Long recOrgId,
      @Param("recOrgCode") String recOrgCode,
      @Param("recOrgName") String recOrgName,
      @Param("isPrePrice") Integer isPrePrice,
      @Param("purQty") java.math.BigDecimal purQty,
      @Param("discountType") Integer discountType,
      @Param("isRec") Integer isRec,
      @Param("recQty") java.math.BigDecimal recQty,
      @Param("isRecInv") Integer isRecInv,
      @Param("billStatus") Integer billStatus,
      @Param("billQty") java.math.BigDecimal billQty,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsOrion") String goodsOrion,
      @Param("applyQty") java.math.BigDecimal applyQty,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("purUnitRate") java.math.BigDecimal purUnitRate,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("sourceType") Integer sourceType,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("purPrice") java.math.BigDecimal purPrice,
      @Param("taxRate") java.math.BigDecimal taxRate,
      @Param("discountAmt") java.math.BigDecimal discountAmt,
      @Param("isReturn") Integer isReturn,
      @Param("returnQty") java.math.BigDecimal returnQty,
      @Param("applyId") Long applyId,
      @Param("applySeqno") String applySeqno,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("remark") String remark,
      @Param("stockinQty") java.math.BigDecimal stockinQty) {
    PurOrderDetail obj = PurOrderDetail.toExample();
    obj.setRecOrgId(recOrgId);
    obj.setRecOrgCode(recOrgCode);
    obj.setRecOrgName(recOrgName);
    obj.setIsPrePrice(isPrePrice);
    obj.setPurQty(purQty);
    obj.setDiscountType(discountType);
    obj.setIsRec(isRec);
    obj.setRecQty(recQty);
    obj.setIsRecInv(isRecInv);
    obj.setBillStatus(billStatus);
    obj.setBillQty(billQty);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setGoodsLevel(goodsLevel);
    obj.setGoodsOrion(goodsOrion);
    obj.setApplyQty(applyQty);
    obj.setPurUnitId(purUnitId);
    obj.setPurUnitCode(purUnitCode);
    obj.setPurUnitName(purUnitName);
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitName(basUnitName);
    obj.setPurUnitRate(purUnitRate);
    obj.setArrOrgId(arrOrgId);
    obj.setArrOrgCode(arrOrgCode);
    obj.setArrOrgName(arrOrgName);
    obj.setSourceType(sourceType);
    obj.setRequestQty(requestQty);
    obj.setPlanRecDate(planRecDate);
    obj.setPurPrice(purPrice);
    obj.setTaxRate(taxRate);
    obj.setDiscountAmt(discountAmt);
    obj.setIsReturn(isReturn);
    obj.setReturnQty(returnQty);
    obj.setApplyId(applyId);
    obj.setApplySeqno(applySeqno);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setRemark(remark);
    obj.setStockinQty(stockinQty);
    Example<PurOrderDetail> example = Example.of(obj);
    return findAll(example, null).map(PurOrderDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PurOrderDetailDTO> findByExample(
      @Param("example") PurOrderDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PurOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<PurOrderDetailDTO> findByExample(@Param("example") PurOrderDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PurOrderDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PurOrderDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PurOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<PurOrderDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PurOrderDetail.DTO_CONVERTER)
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
  public Page<PurOrderDetailDTO> findByFuzzySearch(
      @Param("example") PurOrderDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(PurOrderDetail.DTO_CONVERTER);
  }

  @Override
  public Page<PurOrderDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PurOrderDetail example = PurOrderDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PurOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<PurOrderDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
