package com.pagoda.repo.salconsignreturn.custom;

import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.domain.salconsignreturn.*;
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
 * SalConsignReturnDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignReturnDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<SalConsignReturnDetail, Long>
    implements SalConsignReturnDetailRepositoryCustom {

  @Override
  protected Class<SalConsignReturnDetail> getDomainClass() {
    return SalConsignReturnDetail.class;
  }

  @Override
  public Page<SalConsignReturnDetailDTO> findBy(
      @Param("returnId") Long returnId,
      @Param("returnSeqno") String returnSeqno,
      @Param("salRate") java.math.BigDecimal salRate,
      @Param("salRetInDepotId") Long salRetInDepotId,
      @Param("salRetInDepotCode") String salRetInDepotCode,
      @Param("salRetInDepotName") String salRetInDepotName,
      @Param("returnPrice") java.math.BigDecimal returnPrice,
      @Param("pageable") Pageable pageable) {
    SalConsignReturnDetail obj = SalConsignReturnDetail.toExample();
    obj.setReturnId(returnId);
    obj.setReturnSeqno(returnSeqno);
    obj.setSalRate(salRate);
    obj.setSalRetInDepotId(salRetInDepotId);
    obj.setSalRetInDepotCode(salRetInDepotCode);
    obj.setSalRetInDepotName(salRetInDepotName);
    obj.setReturnPrice(returnPrice);
    Example<SalConsignReturnDetail> example = Example.of(obj);

    return findAll(example, pageable).map(SalConsignReturnDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignReturnDetailDTO> findBy(
      @Param("returnId") Long returnId,
      @Param("returnSeqno") String returnSeqno,
      @Param("salRate") java.math.BigDecimal salRate,
      @Param("salRetInDepotId") Long salRetInDepotId,
      @Param("salRetInDepotCode") String salRetInDepotCode,
      @Param("salRetInDepotName") String salRetInDepotName,
      @Param("returnPrice") java.math.BigDecimal returnPrice) {
    SalConsignReturnDetail obj = SalConsignReturnDetail.toExample();
    obj.setReturnId(returnId);
    obj.setReturnSeqno(returnSeqno);
    obj.setSalRate(salRate);
    obj.setSalRetInDepotId(salRetInDepotId);
    obj.setSalRetInDepotCode(salRetInDepotCode);
    obj.setSalRetInDepotName(salRetInDepotName);
    obj.setReturnPrice(returnPrice);
    Example<SalConsignReturnDetail> example = Example.of(obj);
    return findAll(example, null).map(SalConsignReturnDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<SalConsignReturnDetailDTO> findByExample(
      @Param("example") SalConsignReturnDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(SalConsignReturnDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignReturnDetailDTO> findByExample(
      @Param("example") SalConsignReturnDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null)
        .map(SalConsignReturnDetail.DTO_CONVERTER)
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
  public Page<SalConsignReturnDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(SalConsignReturnDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignReturnDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(SalConsignReturnDetail.DTO_CONVERTER)
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
  public Page<SalConsignReturnDetailDTO> findByFuzzySearch(
      @Param("example") SalConsignReturnDetail example,
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
        .map(SalConsignReturnDetail.DTO_CONVERTER);
  }

  @Override
  public Page<SalConsignReturnDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    SalConsignReturnDetail example = SalConsignReturnDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(SalConsignReturnDetail.DTO_CONVERTER);
  }

  @Override
  public List<SalConsignReturnDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
