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
      @Param("applyPrice") java.math.BigDecimal applyPrice,
      @Param("applyQty") Integer applyQty,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitName") String basUnitName,
      @Param("calCusOrderQty") Double calCusOrderQty,
      @Param("calCusSalQty") Double calCusSalQty,
      @Param("calInvQty") Double calInvQty,
      @Param("calOnWayQty") Double calOnWayQty,
      @Param("calOuterFerQty") Double calOuterFerQty,
      @Param("calPurRate") Double calPurRate,
      @Param("calReplenishmentQty") Double calReplenishmentQty,
      @Param("calStockUpQty") Double calStockUpQty,
      @Param("confirmQty") Integer confirmQty,
      @Param("dealPurQty") Integer dealPurQty,
      @Param("dealSalOrgId") String dealSalOrgId,
      @Param("dealSalQty") Integer dealSalQty,
      @Param("dealStatus") Integer dealStatus,
      @Param("delId") Integer delId,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsOrion") String goodsOrion,
      @Param("invPrice") java.math.BigDecimal invPrice,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitName") String purUnitName,
      @Param("purUnitRate") Double purUnitRate,
      @Param("requestQty") Integer requestQty,
      @Param("pageable") Pageable pageable) {
    PurApplyDetail obj = PurApplyDetail.toExample();
    obj.setApplyId(applyId);
    obj.setApplyPrice(applyPrice);
    obj.setApplyQty(applyQty);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitName(basUnitName);
    obj.setCalCusOrderQty(calCusOrderQty);
    obj.setCalCusSalQty(calCusSalQty);
    obj.setCalInvQty(calInvQty);
    obj.setCalOnWayQty(calOnWayQty);
    obj.setCalOuterFerQty(calOuterFerQty);
    obj.setCalPurRate(calPurRate);
    obj.setCalReplenishmentQty(calReplenishmentQty);
    obj.setCalStockUpQty(calStockUpQty);
    obj.setConfirmQty(confirmQty);
    obj.setDealPurQty(dealPurQty);
    obj.setDealSalOrgId(dealSalOrgId);
    obj.setDealSalQty(dealSalQty);
    obj.setDealStatus(dealStatus);
    obj.setDelId(delId);
    obj.setGoodsLevel(goodsLevel);
    obj.setGoodsOrion(goodsOrion);
    obj.setInvPrice(invPrice);
    obj.setPurUnitCode(purUnitCode);
    obj.setPurUnitId(purUnitId);
    obj.setPurUnitName(purUnitName);
    obj.setPurUnitRate(purUnitRate);
    obj.setRequestQty(requestQty);
    Example<PurApplyDetail> example = Example.of(obj);

    return findAll(example, pageable).map(PurApplyDetail.DTO_CONVERTER);
  }

  @Override
  public List<PurApplyDetailDTO> findBy(
      @Param("applyId") Long applyId,
      @Param("applyPrice") java.math.BigDecimal applyPrice,
      @Param("applyQty") Integer applyQty,
      @Param("basUnitCode") String basUnitCode,
      @Param("basUnitId") Long basUnitId,
      @Param("basUnitName") String basUnitName,
      @Param("calCusOrderQty") Double calCusOrderQty,
      @Param("calCusSalQty") Double calCusSalQty,
      @Param("calInvQty") Double calInvQty,
      @Param("calOnWayQty") Double calOnWayQty,
      @Param("calOuterFerQty") Double calOuterFerQty,
      @Param("calPurRate") Double calPurRate,
      @Param("calReplenishmentQty") Double calReplenishmentQty,
      @Param("calStockUpQty") Double calStockUpQty,
      @Param("confirmQty") Integer confirmQty,
      @Param("dealPurQty") Integer dealPurQty,
      @Param("dealSalOrgId") String dealSalOrgId,
      @Param("dealSalQty") Integer dealSalQty,
      @Param("dealStatus") Integer dealStatus,
      @Param("delId") Integer delId,
      @Param("goodsLevel") Integer goodsLevel,
      @Param("goodsOrion") String goodsOrion,
      @Param("invPrice") java.math.BigDecimal invPrice,
      @Param("purUnitCode") String purUnitCode,
      @Param("purUnitId") Long purUnitId,
      @Param("purUnitName") String purUnitName,
      @Param("purUnitRate") Double purUnitRate,
      @Param("requestQty") Integer requestQty) {
    PurApplyDetail obj = PurApplyDetail.toExample();
    obj.setApplyId(applyId);
    obj.setApplyPrice(applyPrice);
    obj.setApplyQty(applyQty);
    obj.setBasUnitCode(basUnitCode);
    obj.setBasUnitId(basUnitId);
    obj.setBasUnitName(basUnitName);
    obj.setCalCusOrderQty(calCusOrderQty);
    obj.setCalCusSalQty(calCusSalQty);
    obj.setCalInvQty(calInvQty);
    obj.setCalOnWayQty(calOnWayQty);
    obj.setCalOuterFerQty(calOuterFerQty);
    obj.setCalPurRate(calPurRate);
    obj.setCalReplenishmentQty(calReplenishmentQty);
    obj.setCalStockUpQty(calStockUpQty);
    obj.setConfirmQty(confirmQty);
    obj.setDealPurQty(dealPurQty);
    obj.setDealSalOrgId(dealSalOrgId);
    obj.setDealSalQty(dealSalQty);
    obj.setDealStatus(dealStatus);
    obj.setDelId(delId);
    obj.setGoodsLevel(goodsLevel);
    obj.setGoodsOrion(goodsOrion);
    obj.setInvPrice(invPrice);
    obj.setPurUnitCode(purUnitCode);
    obj.setPurUnitId(purUnitId);
    obj.setPurUnitName(purUnitName);
    obj.setPurUnitRate(purUnitRate);
    obj.setRequestQty(requestQty);
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
