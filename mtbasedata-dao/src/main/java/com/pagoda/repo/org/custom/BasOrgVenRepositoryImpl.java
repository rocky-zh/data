package com.pagoda.repo.org.custom;

import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
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
 * BasOrgVen扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgVenRepositoryImpl extends BaseRepositoryCustomImpl<BasOrgVen, Long>
    implements BasOrgVenRepositoryCustom {

  @Override
  protected Class<BasOrgVen> getDomainClass() {
    return BasOrgVen.class;
  }

  @Override
  public Page<BasOrgVenDTO> findBy(
      @Param("isOpenSrm") Integer isOpenSrm,
      @Param("orgId") Long orgId,
      @Param("enabledStatus") Integer enabledStatus,
      @Param("pageable") Pageable pageable) {
    BasOrgVen obj = BasOrgVen.toExample();
    obj.setIsOpenSrm(isOpenSrm);
    obj.setOrgId(orgId);
    obj.setEnabledStatus(enabledStatus);
    Example<BasOrgVen> example = Example.of(obj);

    return findAll(example, pageable).map(BasOrgVen.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgVenDTO> findBy(
      @Param("isOpenSrm") Integer isOpenSrm,
      @Param("orgId") Long orgId,
      @Param("enabledStatus") Integer enabledStatus) {
    BasOrgVen obj = BasOrgVen.toExample();
    obj.setIsOpenSrm(isOpenSrm);
    obj.setOrgId(orgId);
    obj.setEnabledStatus(enabledStatus);
    Example<BasOrgVen> example = Example.of(obj);
    return findAll(example, null).map(BasOrgVen.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasOrgVenDTO> findByExample(
      @Param("example") BasOrgVen example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasOrgVen.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgVenDTO> findByExample(@Param("example") BasOrgVen example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasOrgVen.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasOrgVenDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(BasOrgVen.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgVenDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasOrgVen.DTO_CONVERTER)
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
  public Page<BasOrgVenDTO> findByFuzzySearch(
      @Param("example") BasOrgVen example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasOrgVen.DTO_CONVERTER);
  }

  @Override
  public Page<BasOrgVenDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasOrgVen example = BasOrgVen.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasOrgVen.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgVenDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
