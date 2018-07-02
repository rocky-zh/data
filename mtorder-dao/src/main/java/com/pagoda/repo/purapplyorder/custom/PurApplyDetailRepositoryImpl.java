package com.pagoda.repo.purapplyorder.custom;

import com.pagoda.api.dto.purapplyorder.*;
import com.pagoda.domain.purapplyorder.*;
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
 * PurApplyDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurApplyDetailRepositoryImpl extends BaseRepositoryCustomImpl<PurApplyDetail, Long>
    implements PurApplyDetailRepositoryCustom {

  @Override
  protected Class<PurApplyDetail> getDomainClass() {
    return PurApplyDetail.class;
  }

  @Override
  public Page<PurApplyDetailDTO> findBy(
      @Param("applyId") Long applyId,
      @Param("applySeqno") String applySeqno,
      @Param("goodsOrion") String goodsOrion,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("purUnitRate") java.math.BigDecimal purUnitRate,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("applyQty") java.math.BigDecimal applyQty,
      @Param("confirmQty") java.math.BigDecimal confirmQty,
      @Param("invPrice") java.math.BigDecimal invPrice,
      @Param("dealPurQty") java.math.BigDecimal dealPurQty,
      @Param("dealSalQty") java.math.BigDecimal dealSalQty,
      @Param("dealStatus") Integer dealStatus,
      @Param("dealSalOrgId") Long dealSalOrgId,
      @Param("calCusOrderQty") java.math.BigDecimal calCusOrderQty,
      @Param("calOuterFerQty") java.math.BigDecimal calOuterFerQty,
      @Param("calCusSalQty") java.math.BigDecimal calCusSalQty,
      @Param("calInvQty") java.math.BigDecimal calInvQty,
      @Param("calOnWayQty") java.math.BigDecimal calOnWayQty,
      @Param("calStockUpQty") java.math.BigDecimal calStockUpQty,
      @Param("calReplenishmentQty") java.math.BigDecimal calReplenishmentQty,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("remark") String remark,
      @Param("calPurRate") java.math.BigDecimal calPurRate,
      @Param("pageable") Pageable pageable) {
    PurApplyDetail obj = PurApplyDetail.toExample();
    obj.setApplyId(applyId);
    obj.setApplySeqno(applySeqno);
    obj.setGoodsOrion(goodsOrion);
    obj.setPurUnitId(purUnitId);
    obj.setPurUnitCode(purUnitCode);
    obj.setPurUnitName(purUnitName);
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitName(basUnitName);
    obj.setPurUnitRate(purUnitRate);
    obj.setRequestQty(requestQty);
    obj.setApplyQty(applyQty);
    obj.setConfirmQty(confirmQty);
    obj.setInvPrice(invPrice);
    obj.setDealPurQty(dealPurQty);
    obj.setDealSalQty(dealSalQty);
    obj.setDealStatus(dealStatus);
    obj.setDealSalOrgId(dealSalOrgId);
    obj.setCalCusOrderQty(calCusOrderQty);
    obj.setCalOuterFerQty(calOuterFerQty);
    obj.setCalCusSalQty(calCusSalQty);
    obj.setCalInvQty(calInvQty);
    obj.setCalOnWayQty(calOnWayQty);
    obj.setCalStockUpQty(calStockUpQty);
    obj.setCalReplenishmentQty(calReplenishmentQty);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setPlanRecDate(planRecDate);
    obj.setRemark(remark);
    obj.setCalPurRate(calPurRate);
    Example<PurApplyDetail> example = Example.of(obj);

    return findAll(example, pageable).map(PurApplyDetail.DTO_CONVERTER);
  }

  @Override
  public List<PurApplyDetailDTO> findBy(
      @Param("applyId") Long applyId,
      @Param("applySeqno") String applySeqno,
      @Param("goodsOrion") String goodsOrion,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitName") String purUnitName,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitName") String basUnitName,
      @Param("purUnitRate") java.math.BigDecimal purUnitRate,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("applyQty") java.math.BigDecimal applyQty,
      @Param("confirmQty") java.math.BigDecimal confirmQty,
      @Param("invPrice") java.math.BigDecimal invPrice,
      @Param("dealPurQty") java.math.BigDecimal dealPurQty,
      @Param("dealSalQty") java.math.BigDecimal dealSalQty,
      @Param("dealStatus") Integer dealStatus,
      @Param("dealSalOrgId") Long dealSalOrgId,
      @Param("calCusOrderQty") java.math.BigDecimal calCusOrderQty,
      @Param("calOuterFerQty") java.math.BigDecimal calOuterFerQty,
      @Param("calCusSalQty") java.math.BigDecimal calCusSalQty,
      @Param("calInvQty") java.math.BigDecimal calInvQty,
      @Param("calOnWayQty") java.math.BigDecimal calOnWayQty,
      @Param("calStockUpQty") java.math.BigDecimal calStockUpQty,
      @Param("calReplenishmentQty") java.math.BigDecimal calReplenishmentQty,
      @Param("goodsId") Long goodsId,
      @Param("goodsCode") String goodsCode,
      @Param("goodsName") String goodsName,
      @Param("goodsSpec") String goodsSpec,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("remark") String remark,
      @Param("calPurRate") java.math.BigDecimal calPurRate) {
    PurApplyDetail obj = PurApplyDetail.toExample();
    obj.setApplyId(applyId);
    obj.setApplySeqno(applySeqno);
    obj.setGoodsOrion(goodsOrion);
    obj.setPurUnitId(purUnitId);
    obj.setPurUnitCode(purUnitCode);
    obj.setPurUnitName(purUnitName);
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitName(basUnitName);
    obj.setPurUnitRate(purUnitRate);
    obj.setRequestQty(requestQty);
    obj.setApplyQty(applyQty);
    obj.setConfirmQty(confirmQty);
    obj.setInvPrice(invPrice);
    obj.setDealPurQty(dealPurQty);
    obj.setDealSalQty(dealSalQty);
    obj.setDealStatus(dealStatus);
    obj.setDealSalOrgId(dealSalOrgId);
    obj.setCalCusOrderQty(calCusOrderQty);
    obj.setCalOuterFerQty(calOuterFerQty);
    obj.setCalCusSalQty(calCusSalQty);
    obj.setCalInvQty(calInvQty);
    obj.setCalOnWayQty(calOnWayQty);
    obj.setCalStockUpQty(calStockUpQty);
    obj.setCalReplenishmentQty(calReplenishmentQty);
    obj.setGoodsId(goodsId);
    obj.setGoodsCode(goodsCode);
    obj.setGoodsName(goodsName);
    obj.setGoodsSpec(goodsSpec);
    obj.setPlanRecDate(planRecDate);
    obj.setRemark(remark);
    obj.setCalPurRate(calPurRate);
    Example<PurApplyDetail> example = Example.of(obj);
    return findAll(example, null).map(PurApplyDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PurApplyDetailDTO> findByExample(
      @Param("example") PurApplyDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PurApplyDetail.DTO_CONVERTER);
  }

  @Override
  public List<PurApplyDetailDTO> findByExample(@Param("example") PurApplyDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PurApplyDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PurApplyDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PurApplyDetail.DTO_CONVERTER);
  }

  @Override
  public List<PurApplyDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PurApplyDetail.DTO_CONVERTER)
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
  public Page<PurApplyDetailDTO> findByFuzzySearch(
      @Param("example") PurApplyDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(PurApplyDetail.DTO_CONVERTER);
  }

  @Override
  public Page<PurApplyDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PurApplyDetail example = PurApplyDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PurApplyDetail.DTO_CONVERTER);
  }

  @Override
  public List<PurApplyDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
