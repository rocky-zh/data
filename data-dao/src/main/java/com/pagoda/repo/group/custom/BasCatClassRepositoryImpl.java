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
 * BasCatClass扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasCatClassRepositoryImpl extends BaseRepositoryCustomImpl<BasCatClass, Long>
    implements BasCatClassRepositoryCustom {

  @Override
  protected Class<BasCatClass> getDomainClass() {
    return BasCatClass.class;
  }

  @Override
  public Page<BasCatClassDTO> findBy(
      @Param("catId") Long catId,
      @Param("code") String code,
      @Param("entId") Long entId,
      @Param("fullName") String fullName,
      @Param("isEnabled") Integer isEnabled,
      @Param("isLeaf") Integer isLeaf,
      @Param("levelNum") Integer levelNum,
      @Param("name") String name,
      @Param("parentCatClassCode") String parentCatClassCode,
      @Param("parentCatClassId") Long parentCatClassId,
      @Param("parentCatClassName") String parentCatClassName,
      @Param("path") String path,
      @Param("remark") String remark,
      @Param("showOrder") Integer showOrder,
      @Param("sourceId") Long sourceId,
      @Param("tableId") Integer tableId,
      @Param("pageable") Pageable pageable) {
    BasCatClass obj = BasCatClass.toExample();
    obj.setCatId(catId);
    obj.setCode(code);
    obj.setEntId(entId);
    obj.setFullName(fullName);
    obj.setIsEnabled(isEnabled);
    obj.setIsLeaf(isLeaf);
    obj.setLevelNum(levelNum);
    obj.setName(name);
    obj.setParentCatClassCode(parentCatClassCode);
    obj.setParentCatClassId(parentCatClassId);
    obj.setParentCatClassName(parentCatClassName);
    obj.setPath(path);
    obj.setRemark(remark);
    obj.setShowOrder(showOrder);
    obj.setSourceId(sourceId);
    obj.setTableId(tableId);
    Example<BasCatClass> example = Example.of(obj);

    return findAll(example, pageable).map(BasCatClass.DTO_CONVERTER);
  }

  @Override
  public List<BasCatClassDTO> findBy(
      @Param("catId") Long catId,
      @Param("code") String code,
      @Param("entId") Long entId,
      @Param("fullName") String fullName,
      @Param("isEnabled") Integer isEnabled,
      @Param("isLeaf") Integer isLeaf,
      @Param("levelNum") Integer levelNum,
      @Param("name") String name,
      @Param("parentCatClassCode") String parentCatClassCode,
      @Param("parentCatClassId") Long parentCatClassId,
      @Param("parentCatClassName") String parentCatClassName,
      @Param("path") String path,
      @Param("remark") String remark,
      @Param("showOrder") Integer showOrder,
      @Param("sourceId") Long sourceId,
      @Param("tableId") Integer tableId) {
    BasCatClass obj = BasCatClass.toExample();
    obj.setCatId(catId);
    obj.setCode(code);
    obj.setEntId(entId);
    obj.setFullName(fullName);
    obj.setIsEnabled(isEnabled);
    obj.setIsLeaf(isLeaf);
    obj.setLevelNum(levelNum);
    obj.setName(name);
    obj.setParentCatClassCode(parentCatClassCode);
    obj.setParentCatClassId(parentCatClassId);
    obj.setParentCatClassName(parentCatClassName);
    obj.setPath(path);
    obj.setRemark(remark);
    obj.setShowOrder(showOrder);
    obj.setSourceId(sourceId);
    obj.setTableId(tableId);
    Example<BasCatClass> example = Example.of(obj);
    return findAll(example, null).map(BasCatClass.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasCatClassDTO> findByExample(
      @Param("example") BasCatClass example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasCatClass.DTO_CONVERTER);
  }

  @Override
  public List<BasCatClassDTO> findByExample(@Param("example") BasCatClass example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasCatClass.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasCatClassDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(BasCatClass.DTO_CONVERTER);
  }

  @Override
  public List<BasCatClassDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasCatClass.DTO_CONVERTER)
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
  public Page<BasCatClassDTO> findByFuzzySearch(
      @Param("example") BasCatClass example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasCatClass.DTO_CONVERTER);
  }

  @Override
  public Page<BasCatClassDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasCatClass example = BasCatClass.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasCatClass.DTO_CONVERTER);
  }

  @Override
  public List<BasCatClassDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
