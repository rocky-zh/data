package com.pagoda.repo.goods.custom;

import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
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
 * BasGoodsBomDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsBomDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<BasGoodsBomDetail, Long>
    implements BasGoodsBomDetailRepositoryCustom {

  @Override
  protected Class<BasGoodsBomDetail> getDomainClass() {
    return BasGoodsBomDetail.class;
  }

  @Override
  public Page<BasGoodsBomDetailDTO> findBy(
      @Param("outputGoodsId") Long outputGoodsId,
      @Param("outputGoodsName") String outputGoodsName,
      @Param("feeId") Long feeId,
      @Param("inputGoodsId") Long inputGoodsId,
      @Param("inputGoodsName") String inputGoodsName,
      @Param("inputGoodsQty") java.math.BigDecimal inputGoodsQty,
      @Param("outDepotId") Long outDepotId,
      @Param("outDepotName") String outDepotName,
      @Param("feeName") String feeName,
      @Param("feeAmt") java.math.BigDecimal feeAmt,
      @Param("unitId") Long unitId,
      @Param("unitName") String unitName,
      @Param("isEnabled") Integer isEnabled,
      @Param("isDefault") Integer isDefault,
      @Param("rankNum") Integer rankNum,
      @Param("remark") String remark,
      @Param("entId") Long entId,
      @Param("pageable") Pageable pageable) {
    BasGoodsBomDetail obj = BasGoodsBomDetail.toExample();
    obj.setOutputGoodsId(outputGoodsId);
    obj.setOutputGoodsName(outputGoodsName);
    obj.setFeeId(feeId);
    obj.setInputGoodsId(inputGoodsId);
    obj.setInputGoodsName(inputGoodsName);
    obj.setInputGoodsQty(inputGoodsQty);
    obj.setOutDepotId(outDepotId);
    obj.setOutDepotName(outDepotName);
    obj.setFeeName(feeName);
    obj.setFeeAmt(feeAmt);
    obj.setUnitId(unitId);
    obj.setUnitName(unitName);
    obj.setIsEnabled(isEnabled);
    obj.setIsDefault(isDefault);
    obj.setRankNum(rankNum);
    obj.setRemark(remark);
    obj.setEntId(entId);
    Example<BasGoodsBomDetail> example = Example.of(obj);

    return findAll(example, pageable).map(BasGoodsBomDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsBomDetailDTO> findBy(
      @Param("outputGoodsId") Long outputGoodsId,
      @Param("outputGoodsName") String outputGoodsName,
      @Param("feeId") Long feeId,
      @Param("inputGoodsId") Long inputGoodsId,
      @Param("inputGoodsName") String inputGoodsName,
      @Param("inputGoodsQty") java.math.BigDecimal inputGoodsQty,
      @Param("outDepotId") Long outDepotId,
      @Param("outDepotName") String outDepotName,
      @Param("feeName") String feeName,
      @Param("feeAmt") java.math.BigDecimal feeAmt,
      @Param("unitId") Long unitId,
      @Param("unitName") String unitName,
      @Param("isEnabled") Integer isEnabled,
      @Param("isDefault") Integer isDefault,
      @Param("rankNum") Integer rankNum,
      @Param("remark") String remark,
      @Param("entId") Long entId) {
    BasGoodsBomDetail obj = BasGoodsBomDetail.toExample();
    obj.setOutputGoodsId(outputGoodsId);
    obj.setOutputGoodsName(outputGoodsName);
    obj.setFeeId(feeId);
    obj.setInputGoodsId(inputGoodsId);
    obj.setInputGoodsName(inputGoodsName);
    obj.setInputGoodsQty(inputGoodsQty);
    obj.setOutDepotId(outDepotId);
    obj.setOutDepotName(outDepotName);
    obj.setFeeName(feeName);
    obj.setFeeAmt(feeAmt);
    obj.setUnitId(unitId);
    obj.setUnitName(unitName);
    obj.setIsEnabled(isEnabled);
    obj.setIsDefault(isDefault);
    obj.setRankNum(rankNum);
    obj.setRemark(remark);
    obj.setEntId(entId);
    Example<BasGoodsBomDetail> example = Example.of(obj);
    return findAll(example, null).map(BasGoodsBomDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasGoodsBomDetailDTO> findByExample(
      @Param("example") BasGoodsBomDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasGoodsBomDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsBomDetailDTO> findByExample(@Param("example") BasGoodsBomDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasGoodsBomDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasGoodsBomDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasGoodsBomDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsBomDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasGoodsBomDetail.DTO_CONVERTER)
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
  public Page<BasGoodsBomDetailDTO> findByFuzzySearch(
      @Param("example") BasGoodsBomDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasGoodsBomDetail.DTO_CONVERTER);
  }

  @Override
  public Page<BasGoodsBomDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasGoodsBomDetail example = BasGoodsBomDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasGoodsBomDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsBomDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
