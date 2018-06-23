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
 * BasCatClassRel扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasCatClassRelRepositoryImpl extends BaseRepositoryCustomImpl<BasCatClassRel, Long>
    implements BasCatClassRelRepositoryCustom {

  @Override
  protected Class<BasCatClassRel> getDomainClass() {
    return BasCatClassRel.class;
  }

  @Override
  public Page<BasCatClassRelDTO> findBy(
      @Param("catClassCode") String catClassCode,
      @Param("catClassId") Integer catClassId,
      @Param("catClassName") String catClassName,
      @Param("objCode") String objCode,
      @Param("objId") Integer objId,
      @Param("objName") String objName,
      @Param("uniqueId") Integer uniqueId,
      @Param("active") Integer active,
      @Param("pageable") Pageable pageable) {
    BasCatClassRel obj = BasCatClassRel.toExample();
    obj.setCatClassCode(catClassCode);
    obj.setCatClassId(catClassId);
    obj.setCatClassName(catClassName);
    obj.setObjCode(objCode);
    obj.setObjId(objId);
    obj.setObjName(objName);
    obj.setUniqueId(uniqueId);
    obj.setActive(active);
    Example<BasCatClassRel> example = Example.of(obj);

    return findAll(example, pageable).map(BasCatClassRel.DTO_CONVERTER);
  }

  @Override
  public List<BasCatClassRelDTO> findBy(
      @Param("catClassCode") String catClassCode,
      @Param("catClassId") Integer catClassId,
      @Param("catClassName") String catClassName,
      @Param("objCode") String objCode,
      @Param("objId") Integer objId,
      @Param("objName") String objName,
      @Param("uniqueId") Integer uniqueId,
      @Param("active") Integer active) {
    BasCatClassRel obj = BasCatClassRel.toExample();
    obj.setCatClassCode(catClassCode);
    obj.setCatClassId(catClassId);
    obj.setCatClassName(catClassName);
    obj.setObjCode(objCode);
    obj.setObjId(objId);
    obj.setObjName(objName);
    obj.setUniqueId(uniqueId);
    obj.setActive(active);
    Example<BasCatClassRel> example = Example.of(obj);
    return findAll(example, null).map(BasCatClassRel.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasCatClassRelDTO> findByExample(
      @Param("example") BasCatClassRel example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasCatClassRel.DTO_CONVERTER);
  }

  @Override
  public List<BasCatClassRelDTO> findByExample(@Param("example") BasCatClassRel example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasCatClassRel.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasCatClassRelDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasCatClassRel.DTO_CONVERTER);
  }

  @Override
  public List<BasCatClassRelDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasCatClassRel.DTO_CONVERTER)
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
  public Page<BasCatClassRelDTO> findByFuzzySearch(
      @Param("example") BasCatClassRel example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasCatClassRel.DTO_CONVERTER);
  }

  @Override
  public Page<BasCatClassRelDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasCatClassRel example = BasCatClassRel.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasCatClassRel.DTO_CONVERTER);
  }

  @Override
  public List<BasCatClassRelDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
