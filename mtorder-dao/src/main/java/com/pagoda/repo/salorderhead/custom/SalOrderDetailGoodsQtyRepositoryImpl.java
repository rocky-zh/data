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
 * SalOrderDetailGoodsQty扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalOrderDetailGoodsQtyRepositoryImpl
    extends BaseRepositoryCustomImpl<SalOrderDetailGoodsQty, Long>
    implements SalOrderDetailGoodsQtyRepositoryCustom {

  @Override
  protected Class<SalOrderDetailGoodsQty> getDomainClass() {
    return SalOrderDetailGoodsQty.class;
  }

  @Override
  public Page<SalOrderDetailGoodsQtyDTO> findBy(
      @Param("orderDetailId") Long orderDetailId,
      @Param("sourceId") Long sourceId,
      @Param("sourceNo") String sourceNo,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("sourceType") Integer sourceType,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    SalOrderDetailGoodsQty obj = SalOrderDetailGoodsQty.toExample();
    obj.setOrderDetailId(orderDetailId);
    obj.setSourceId(sourceId);
    obj.setSourceNo(sourceNo);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setSourceType(sourceType);
    obj.setRequestQty(requestQty);
    obj.setRemark(remark);
    Example<SalOrderDetailGoodsQty> example = Example.of(obj);

    return findAll(example, pageable).map(SalOrderDetailGoodsQty.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderDetailGoodsQtyDTO> findBy(
      @Param("orderDetailId") Long orderDetailId,
      @Param("sourceId") Long sourceId,
      @Param("sourceNo") String sourceNo,
      @Param("orderId") Long orderId,
      @Param("orderSeqno") String orderSeqno,
      @Param("entId") Long entId,
      @Param("sourceType") Integer sourceType,
      @Param("requestQty") java.math.BigDecimal requestQty,
      @Param("remark") String remark) {
    SalOrderDetailGoodsQty obj = SalOrderDetailGoodsQty.toExample();
    obj.setOrderDetailId(orderDetailId);
    obj.setSourceId(sourceId);
    obj.setSourceNo(sourceNo);
    obj.setOrderId(orderId);
    obj.setOrderSeqno(orderSeqno);
    obj.setEntId(entId);
    obj.setSourceType(sourceType);
    obj.setRequestQty(requestQty);
    obj.setRemark(remark);
    Example<SalOrderDetailGoodsQty> example = Example.of(obj);
    return findAll(example, null).map(SalOrderDetailGoodsQty.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalOrderDetailGoodsQtyDTO> findByExample(
      @Param("example") SalOrderDetailGoodsQty example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalOrderDetailGoodsQty.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderDetailGoodsQtyDTO> findByExample(
      @Param("example") SalOrderDetailGoodsQty example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null)
        .map(SalOrderDetailGoodsQty.DTO_CONVERTER)
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
  public Page<SalOrderDetailGoodsQtyDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalOrderDetailGoodsQty.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderDetailGoodsQtyDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalOrderDetailGoodsQty.DTO_CONVERTER)
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
  public Page<SalOrderDetailGoodsQtyDTO> findByFuzzySearch(
      @Param("example") SalOrderDetailGoodsQty example,
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
        .map(SalOrderDetailGoodsQty.DTO_CONVERTER);
  }

  @Override
  public Page<SalOrderDetailGoodsQtyDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalOrderDetailGoodsQty example = SalOrderDetailGoodsQty.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalOrderDetailGoodsQty.DTO_CONVERTER);
  }

  @Override
  public List<SalOrderDetailGoodsQtyDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
