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
 * BasGoodsProcessDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsProcessDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<BasGoodsProcessDetail, Long>
    implements BasGoodsProcessDetailRepositoryCustom {

  @Override
  protected Class<BasGoodsProcessDetail> getDomainClass() {
    return BasGoodsProcessDetail.class;
  }

  @Override
  public Page<BasGoodsProcessDetailDTO> findBy(
      @Param("goodsProcId") Long goodsProcId,
      @Param("goodsProcCode") String goodsProcCode,
      @Param("goodsProcName") String goodsProcName,
      @Param("feeCode") String feeCode,
      @Param("feeName") String feeName,
      @Param("feeAmt") java.math.BigDecimal feeAmt,
      @Param("remark") String remark,
      @Param("rankNum") Integer rankNum,
      @Param("entId") Long entId,
      @Param("pageable") Pageable pageable) {
    BasGoodsProcessDetail obj = BasGoodsProcessDetail.toExample();
    obj.setGoodsProcId(goodsProcId);
    obj.setGoodsProcCode(goodsProcCode);
    obj.setGoodsProcName(goodsProcName);
    obj.setFeeCode(feeCode);
    obj.setFeeName(feeName);
    obj.setFeeAmt(feeAmt);
    obj.setRemark(remark);
    obj.setRankNum(rankNum);
    obj.setEntId(entId);
    Example<BasGoodsProcessDetail> example = Example.of(obj);

    return findAll(example, pageable).map(BasGoodsProcessDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsProcessDetailDTO> findBy(
      @Param("goodsProcId") Long goodsProcId,
      @Param("goodsProcCode") String goodsProcCode,
      @Param("goodsProcName") String goodsProcName,
      @Param("feeCode") String feeCode,
      @Param("feeName") String feeName,
      @Param("feeAmt") java.math.BigDecimal feeAmt,
      @Param("remark") String remark,
      @Param("rankNum") Integer rankNum,
      @Param("entId") Long entId) {
    BasGoodsProcessDetail obj = BasGoodsProcessDetail.toExample();
    obj.setGoodsProcId(goodsProcId);
    obj.setGoodsProcCode(goodsProcCode);
    obj.setGoodsProcName(goodsProcName);
    obj.setFeeCode(feeCode);
    obj.setFeeName(feeName);
    obj.setFeeAmt(feeAmt);
    obj.setRemark(remark);
    obj.setRankNum(rankNum);
    obj.setEntId(entId);
    Example<BasGoodsProcessDetail> example = Example.of(obj);
    return findAll(example, null).map(BasGoodsProcessDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasGoodsProcessDetailDTO> findByExample(
      @Param("example") BasGoodsProcessDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasGoodsProcessDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsProcessDetailDTO> findByExample(
      @Param("example") BasGoodsProcessDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasGoodsProcessDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasGoodsProcessDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasGoodsProcessDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsProcessDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasGoodsProcessDetail.DTO_CONVERTER)
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
  public Page<BasGoodsProcessDetailDTO> findByFuzzySearch(
      @Param("example") BasGoodsProcessDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasGoodsProcessDetail.DTO_CONVERTER);
  }

  @Override
  public Page<BasGoodsProcessDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasGoodsProcessDetail example = BasGoodsProcessDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasGoodsProcessDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsProcessDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
