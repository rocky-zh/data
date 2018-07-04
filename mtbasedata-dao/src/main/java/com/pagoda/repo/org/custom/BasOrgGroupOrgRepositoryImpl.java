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
 * BasOrgGroupOrg扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgGroupOrgRepositoryImpl extends BaseRepositoryCustomImpl<BasOrgGroupOrg, Long>
    implements BasOrgGroupOrgRepositoryCustom {

  @Override
  protected Class<BasOrgGroupOrg> getDomainClass() {
    return BasOrgGroupOrg.class;
  }

  @Override
  public Page<BasOrgGroupOrgDTO> findBy(
      @Param("orgGroupId") Long orgGroupId,
      @Param("orgGroupCode") String orgGroupCode,
      @Param("orgGroupName") String orgGroupName,
      @Param("entId") Long entId,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("showOrder") Integer showOrder,
      @Param("pageable") Pageable pageable) {
    BasOrgGroupOrg obj = BasOrgGroupOrg.toExample();
    obj.setOrgGroupId(orgGroupId);
    obj.setOrgGroupCode(orgGroupCode);
    obj.setOrgGroupName(orgGroupName);
    obj.setEntId(entId);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setShowOrder(showOrder);
    Example<BasOrgGroupOrg> example = Example.of(obj);

    return findAll(example, pageable).map(BasOrgGroupOrg.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGroupOrgDTO> findBy(
      @Param("orgGroupId") Long orgGroupId,
      @Param("orgGroupCode") String orgGroupCode,
      @Param("orgGroupName") String orgGroupName,
      @Param("entId") Long entId,
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("showOrder") Integer showOrder) {
    BasOrgGroupOrg obj = BasOrgGroupOrg.toExample();
    obj.setOrgGroupId(orgGroupId);
    obj.setOrgGroupCode(orgGroupCode);
    obj.setOrgGroupName(orgGroupName);
    obj.setEntId(entId);
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setShowOrder(showOrder);
    Example<BasOrgGroupOrg> example = Example.of(obj);
    return findAll(example, null).map(BasOrgGroupOrg.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasOrgGroupOrgDTO> findByExample(
      @Param("example") BasOrgGroupOrg example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasOrgGroupOrg.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGroupOrgDTO> findByExample(@Param("example") BasOrgGroupOrg example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasOrgGroupOrg.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasOrgGroupOrgDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasOrgGroupOrg.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGroupOrgDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasOrgGroupOrg.DTO_CONVERTER)
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
  public Page<BasOrgGroupOrgDTO> findByFuzzySearch(
      @Param("example") BasOrgGroupOrg example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasOrgGroupOrg.DTO_CONVERTER);
  }

  @Override
  public Page<BasOrgGroupOrgDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasOrgGroupOrg example = BasOrgGroupOrg.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasOrgGroupOrg.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgGroupOrgDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
