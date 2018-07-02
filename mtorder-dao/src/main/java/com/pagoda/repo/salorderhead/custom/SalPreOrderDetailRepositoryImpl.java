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
 * SalPreOrderDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalPreOrderDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<SalPreOrderDetail, Long>
    implements SalPreOrderDetailRepositoryCustom {

  @Override
  protected Class<SalPreOrderDetail> getDomainClass() {
    return SalPreOrderDetail.class;
  }

  @Override
  public Page<SalPreOrderDetailDTO> findBy(
      @Param("preOrderId") Long preOrderId,
      @Param("preOrderSeqno") String preOrderSeqno,
      @Param("prePlanQty") java.math.BigDecimal prePlanQty,
      @Param("auditQty") java.math.BigDecimal auditQty,
      @Param("invQty") java.math.BigDecimal invQty,
      @Param("detailStatus") Integer detailStatus,
      @Param("areaId") Long areaId,
      @Param("areaCode") String areaCode,
      @Param("areaName") String areaName,
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
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("maxOrderQty") java.math.BigDecimal maxOrderQty,
      @Param("minOrderQty") java.math.BigDecimal minOrderQty,
      @Param("price") java.math.BigDecimal price,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    SalPreOrderDetail obj = SalPreOrderDetail.toExample();
    obj.setPreOrderId(preOrderId);
    obj.setPreOrderSeqno(preOrderSeqno);
    obj.setPrePlanQty(prePlanQty);
    obj.setAuditQty(auditQty);
    obj.setInvQty(invQty);
    obj.setDetailStatus(detailStatus);
    obj.setAreaId(areaId);
    obj.setAreaCode(areaCode);
    obj.setAreaName(areaName);
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
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitName(basUnitName);
    obj.setMaxOrderQty(maxOrderQty);
    obj.setMinOrderQty(minOrderQty);
    obj.setPrice(price);
    obj.setTotalAmt(totalAmt);
    obj.setPreArrivalDate(preArrivalDate);
    obj.setRemark(remark);
    Example<SalPreOrderDetail> example = Example.of(obj);

    return findAll(example, pageable).map(SalPreOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalPreOrderDetailDTO> findBy(
      @Param("preOrderId") Long preOrderId,
      @Param("preOrderSeqno") String preOrderSeqno,
      @Param("prePlanQty") java.math.BigDecimal prePlanQty,
      @Param("auditQty") java.math.BigDecimal auditQty,
      @Param("invQty") java.math.BigDecimal invQty,
      @Param("detailStatus") Integer detailStatus,
      @Param("areaId") Long areaId,
      @Param("areaCode") String areaCode,
      @Param("areaName") String areaName,
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
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("maxOrderQty") java.math.BigDecimal maxOrderQty,
      @Param("minOrderQty") java.math.BigDecimal minOrderQty,
      @Param("price") java.math.BigDecimal price,
      @Param("totalAmt") java.math.BigDecimal totalAmt,
      @Param("preArrivalDate") java.util.Date preArrivalDate,
      @Param("remark") String remark) {
    SalPreOrderDetail obj = SalPreOrderDetail.toExample();
    obj.setPreOrderId(preOrderId);
    obj.setPreOrderSeqno(preOrderSeqno);
    obj.setPrePlanQty(prePlanQty);
    obj.setAuditQty(auditQty);
    obj.setInvQty(invQty);
    obj.setDetailStatus(detailStatus);
    obj.setAreaId(areaId);
    obj.setAreaCode(areaCode);
    obj.setAreaName(areaName);
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
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitName(basUnitName);
    obj.setMaxOrderQty(maxOrderQty);
    obj.setMinOrderQty(minOrderQty);
    obj.setPrice(price);
    obj.setTotalAmt(totalAmt);
    obj.setPreArrivalDate(preArrivalDate);
    obj.setRemark(remark);
    Example<SalPreOrderDetail> example = Example.of(obj);
    return findAll(example, null).map(SalPreOrderDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalPreOrderDetailDTO> findByExample(
      @Param("example") SalPreOrderDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalPreOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalPreOrderDetailDTO> findByExample(@Param("example") SalPreOrderDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalPreOrderDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalPreOrderDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalPreOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalPreOrderDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalPreOrderDetail.DTO_CONVERTER)
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
  public Page<SalPreOrderDetailDTO> findByFuzzySearch(
      @Param("example") SalPreOrderDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(SalPreOrderDetail.DTO_CONVERTER);
  }

  @Override
  public Page<SalPreOrderDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalPreOrderDetail example = SalPreOrderDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalPreOrderDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalPreOrderDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
