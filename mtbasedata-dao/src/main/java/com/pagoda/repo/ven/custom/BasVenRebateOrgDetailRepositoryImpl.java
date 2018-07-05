package com.pagoda.repo.ven.custom;

import com.pagoda.api.dto.ven.*;
import com.pagoda.domain.ven.*;
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
 * BasVenRebateOrgDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasVenRebateOrgDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<BasVenRebateOrgDetail, Long>
    implements BasVenRebateOrgDetailRepositoryCustom {

  @Override
  protected Class<BasVenRebateOrgDetail> getDomainClass() {
    return BasVenRebateOrgDetail.class;
  }

  @Override
  public Page<BasVenRebateOrgDetailDTO> findBy(
      @Param("rebateId") Long rebateId,
      @Param("rebateNo") String rebateNo,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("entId") Long entId,
      @Param("effectDate") java.util.Date effectDate,
      @Param("expiryDate") java.util.Date expiryDate,
      @Param("status") Integer status,
      @Param("remark") String remark,
      @Param("pageable") Pageable pageable) {
    BasVenRebateOrgDetail obj = BasVenRebateOrgDetail.toExample();
    obj.setRebateId(rebateId);
    obj.setRebateNo(rebateNo);
    obj.setArrOrgId(arrOrgId);
    obj.setArrOrgCode(arrOrgCode);
    obj.setArrOrgName(arrOrgName);
    obj.setEntId(entId);
    obj.setEffectDate(effectDate);
    obj.setExpiryDate(expiryDate);
    obj.setStatus(status);
    obj.setRemark(remark);
    Example<BasVenRebateOrgDetail> example = Example.of(obj);

    return findAll(example, pageable).map(BasVenRebateOrgDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasVenRebateOrgDetailDTO> findBy(
      @Param("rebateId") Long rebateId,
      @Param("rebateNo") String rebateNo,
      @Param("arrOrgId") Long arrOrgId,
      @Param("arrOrgCode") String arrOrgCode,
      @Param("arrOrgName") String arrOrgName,
      @Param("entId") Long entId,
      @Param("effectDate") java.util.Date effectDate,
      @Param("expiryDate") java.util.Date expiryDate,
      @Param("status") Integer status,
      @Param("remark") String remark) {
    BasVenRebateOrgDetail obj = BasVenRebateOrgDetail.toExample();
    obj.setRebateId(rebateId);
    obj.setRebateNo(rebateNo);
    obj.setArrOrgId(arrOrgId);
    obj.setArrOrgCode(arrOrgCode);
    obj.setArrOrgName(arrOrgName);
    obj.setEntId(entId);
    obj.setEffectDate(effectDate);
    obj.setExpiryDate(expiryDate);
    obj.setStatus(status);
    obj.setRemark(remark);
    Example<BasVenRebateOrgDetail> example = Example.of(obj);
    return findAll(example, null).map(BasVenRebateOrgDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasVenRebateOrgDetailDTO> findByExample(
      @Param("example") BasVenRebateOrgDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasVenRebateOrgDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasVenRebateOrgDetailDTO> findByExample(
      @Param("example") BasVenRebateOrgDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasVenRebateOrgDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasVenRebateOrgDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasVenRebateOrgDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasVenRebateOrgDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasVenRebateOrgDetail.DTO_CONVERTER)
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
  public Page<BasVenRebateOrgDetailDTO> findByFuzzySearch(
      @Param("example") BasVenRebateOrgDetail example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasVenRebateOrgDetail.DTO_CONVERTER);
  }

  @Override
  public Page<BasVenRebateOrgDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasVenRebateOrgDetail example = BasVenRebateOrgDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasVenRebateOrgDetail.DTO_CONVERTER);
  }

  @Override
  public List<BasVenRebateOrgDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
