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
 * BasOrgGroupOrgCopyCopy扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgGroupOrgCopyCopyRepositoryImpl
    extends BaseRepositoryCustomImpl<BasOrgGroupOrgCopyCopy, Long>
    implements BasOrgGroupOrgCopyCopyRepositoryCustom {

  @Override
  protected Class<BasOrgGroupOrgCopyCopy> getDomainClass() {
    return BasOrgGroupOrgCopyCopy.class;
  }

  @Override
  public Page<BasOrgGroupOrgCopyCopyDTO> findBy(
      @Param("orgGroupCode") String orgGroupCode,
      @Param("orgGroupId") Long orgGroupId,
      @Param("orgGroupName") String orgGroupName,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgName") String orgOrgName,
      @Param("pageable") Pageable pageable) {
    BasOrgGroupOrgCopyCopy obj = BasOrgGroupOrgCopyCopy.toExample();
    obj.setOrgGroupCode(orgGroupCode);
    obj.setOrgGroupId(orgGroupId);
    obj.setOrgGroupName(orgGroupName);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgName(orgOrgName);
    Example<BasOrgGroupOrgCopyCopy> example = Example.of(obj);

    return findAll(example, pageable).map(BasOrgGroupOrgCopyCopy.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGroupOrgCopyCopyDTO> findBy(
      @Param("orgGroupCode") String orgGroupCode,
      @Param("orgGroupId") Long orgGroupId,
      @Param("orgGroupName") String orgGroupName,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgName") String orgOrgName) {
    BasOrgGroupOrgCopyCopy obj = BasOrgGroupOrgCopyCopy.toExample();
    obj.setOrgGroupCode(orgGroupCode);
    obj.setOrgGroupId(orgGroupId);
    obj.setOrgGroupName(orgGroupName);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgName(orgOrgName);
    Example<BasOrgGroupOrgCopyCopy> example = Example.of(obj);
    return findAll(example, null).map(BasOrgGroupOrgCopyCopy.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasOrgGroupOrgCopyCopyDTO> findByExample(
      @Param("example") BasOrgGroupOrgCopyCopy example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasOrgGroupOrgCopyCopy.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGroupOrgCopyCopyDTO> findByExample(
      @Param("example") BasOrgGroupOrgCopyCopy example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null)
        .map(BasOrgGroupOrgCopyCopy.DTO_CONVERTER)
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
  public Page<BasOrgGroupOrgCopyCopyDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasOrgGroupOrgCopyCopy.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGroupOrgCopyCopyDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasOrgGroupOrgCopyCopy.DTO_CONVERTER)
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
  public Page<BasOrgGroupOrgCopyCopyDTO> findByFuzzySearch(
      @Param("example") BasOrgGroupOrgCopyCopy example,
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
        .map(BasOrgGroupOrgCopyCopy.DTO_CONVERTER);
  }

  @Override
  public Page<BasOrgGroupOrgCopyCopyDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasOrgGroupOrgCopyCopy example = BasOrgGroupOrgCopyCopy.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasOrgGroupOrgCopyCopy.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGroupOrgCopyCopyDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
