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
 * SalOrderControl扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalOrderControlRepositoryImpl extends BaseRepositoryCustomImpl<SalOrderControl, Long>
    implements SalOrderControlRepositoryCustom {

  @Override
  protected Class<SalOrderControl> getDomainClass() {
    return SalOrderControl.class;
  }

  @Override
  public Page<SalOrderControlDTO> findBy(
      @Param("isCtrlDep") Integer isCtrlDep,
      @Param("beforeDays") Integer beforeDays,
      @Param("allowPosGapD") Integer allowPosGapD,
      @Param("allowPosGapM") Integer allowPosGapM,
      @Param("isCtrlDepInput") Integer isCtrlDepInput,
      @Param("isCtrlAccnt") Integer isCtrlAccnt,
      @Param("isCtrlDuty") Integer isCtrlDuty,
      @Param("isCtrlVrfyTrans") Integer isCtrlVrfyTrans,
      @Param("isCtrlDistCyc") Integer isCtrlDistCyc,
      @Param("isCtrlMustSell") Integer isCtrlMustSell,
      @Param("isCtrlRouteSplit") Integer isCtrlRouteSplit,
      @Param("isCtrlSafetyStock") Integer isCtrlSafetyStock,
      @Param("allowSafetyStockTimes") java.math.BigDecimal allowSafetyStockTimes,
      @Param("isCtrlExeBatchPolicy") Integer isCtrlExeBatchPolicy,
      @Param("isCtrlOneOrder") Integer isCtrlOneOrder,
      @Param("placeOrderTime") java.util.Date placeOrderTime,
      @Param("placeOrderTime2") java.util.Date placeOrderTime2,
      @Param("isCtrlReturn") Integer isCtrlReturn,
      @Param("returnGoodsTime1") java.util.Date returnGoodsTime1,
      @Param("returnGoodsTime2") java.util.Date returnGoodsTime2,
      @Param("enabled") Integer enabled,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    SalOrderControl obj = SalOrderControl.toExample();
    obj.setIsCtrlDep(isCtrlDep);
    obj.setBeforeDays(beforeDays);
    obj.setAllowPosGapD(allowPosGapD);
    obj.setAllowPosGapM(allowPosGapM);
    obj.setIsCtrlDepInput(isCtrlDepInput);
    obj.setIsCtrlAccnt(isCtrlAccnt);
    obj.setIsCtrlDuty(isCtrlDuty);
    obj.setIsCtrlVrfyTrans(isCtrlVrfyTrans);
    obj.setIsCtrlDistCyc(isCtrlDistCyc);
    obj.setIsCtrlMustSell(isCtrlMustSell);
    obj.setIsCtrlRouteSplit(isCtrlRouteSplit);
    obj.setIsCtrlSafetyStock(isCtrlSafetyStock);
    obj.setAllowSafetyStockTimes(allowSafetyStockTimes);
    obj.setIsCtrlExeBatchPolicy(isCtrlExeBatchPolicy);
    obj.setIsCtrlOneOrder(isCtrlOneOrder);
    obj.setPlaceOrderTime(placeOrderTime);
    obj.setPlaceOrderTime2(placeOrderTime2);
    obj.setIsCtrlReturn(isCtrlReturn);
    obj.setReturnGoodsTime1(returnGoodsTime1);
    obj.setReturnGoodsTime2(returnGoodsTime2);
    obj.setEnabled(enabled);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setRemark(remark);
    Example<SalOrderControl> example = Example.of(obj);

    return findAll(example, pageable).map(SalOrderControl.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderControlDTO> findBy(
      @Param("isCtrlDep") Integer isCtrlDep,
      @Param("beforeDays") Integer beforeDays,
      @Param("allowPosGapD") Integer allowPosGapD,
      @Param("allowPosGapM") Integer allowPosGapM,
      @Param("isCtrlDepInput") Integer isCtrlDepInput,
      @Param("isCtrlAccnt") Integer isCtrlAccnt,
      @Param("isCtrlDuty") Integer isCtrlDuty,
      @Param("isCtrlVrfyTrans") Integer isCtrlVrfyTrans,
      @Param("isCtrlDistCyc") Integer isCtrlDistCyc,
      @Param("isCtrlMustSell") Integer isCtrlMustSell,
      @Param("isCtrlRouteSplit") Integer isCtrlRouteSplit,
      @Param("isCtrlSafetyStock") Integer isCtrlSafetyStock,
      @Param("allowSafetyStockTimes") java.math.BigDecimal allowSafetyStockTimes,
      @Param("isCtrlExeBatchPolicy") Integer isCtrlExeBatchPolicy,
      @Param("isCtrlOneOrder") Integer isCtrlOneOrder,
      @Param("placeOrderTime") java.util.Date placeOrderTime,
      @Param("placeOrderTime2") java.util.Date placeOrderTime2,
      @Param("isCtrlReturn") Integer isCtrlReturn,
      @Param("returnGoodsTime1") java.util.Date returnGoodsTime1,
      @Param("returnGoodsTime2") java.util.Date returnGoodsTime2,
      @Param("enabled") Integer enabled,
      @Param("cusOrgId") Long cusOrgId,
      @Param("cusOrgCode") String cusOrgCode,
      @Param("cusOrgName") String cusOrgName,
      @Param("remark") String remark) {
    SalOrderControl obj = SalOrderControl.toExample();
    obj.setIsCtrlDep(isCtrlDep);
    obj.setBeforeDays(beforeDays);
    obj.setAllowPosGapD(allowPosGapD);
    obj.setAllowPosGapM(allowPosGapM);
    obj.setIsCtrlDepInput(isCtrlDepInput);
    obj.setIsCtrlAccnt(isCtrlAccnt);
    obj.setIsCtrlDuty(isCtrlDuty);
    obj.setIsCtrlVrfyTrans(isCtrlVrfyTrans);
    obj.setIsCtrlDistCyc(isCtrlDistCyc);
    obj.setIsCtrlMustSell(isCtrlMustSell);
    obj.setIsCtrlRouteSplit(isCtrlRouteSplit);
    obj.setIsCtrlSafetyStock(isCtrlSafetyStock);
    obj.setAllowSafetyStockTimes(allowSafetyStockTimes);
    obj.setIsCtrlExeBatchPolicy(isCtrlExeBatchPolicy);
    obj.setIsCtrlOneOrder(isCtrlOneOrder);
    obj.setPlaceOrderTime(placeOrderTime);
    obj.setPlaceOrderTime2(placeOrderTime2);
    obj.setIsCtrlReturn(isCtrlReturn);
    obj.setReturnGoodsTime1(returnGoodsTime1);
    obj.setReturnGoodsTime2(returnGoodsTime2);
    obj.setEnabled(enabled);
    obj.setCusOrgId(cusOrgId);
    obj.setCusOrgCode(cusOrgCode);
    obj.setCusOrgName(cusOrgName);
    obj.setRemark(remark);
    Example<SalOrderControl> example = Example.of(obj);
    return findAll(example, null).map(SalOrderControl.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalOrderControlDTO> findByExample(
      @Param("example") SalOrderControl example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalOrderControl.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderControlDTO> findByExample(@Param("example") SalOrderControl example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(SalOrderControl.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<SalOrderControlDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalOrderControl.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderControlDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalOrderControl.DTO_CONVERTER)
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
  public Page<SalOrderControlDTO> findByFuzzySearch(
      @Param("example") SalOrderControl example,
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
    return findAll(Example.of(example, matcher), pageable).map(SalOrderControl.DTO_CONVERTER);
  }

  @Override
  public Page<SalOrderControlDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalOrderControl example = SalOrderControl.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalOrderControl.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderControlDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
