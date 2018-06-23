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
 * BasCat扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasCatRepositoryImpl extends BaseRepositoryCustomImpl<BasCat, Long>
    implements BasCatRepositoryCustom {

  @Override
  protected Class<BasCat> getDomainClass() {
    return BasCat.class;
  }

  @Override
  public Page<BasCatDTO> findBy(
      @Param("active") Boolean active,
      @Param("code") String code,
      @Param("deleted1") Long deleted1,
      @Param("enabled1") Boolean enabled1,
      @Param("isDefault") String isDefault,
      @Param("isEnabled") String isEnabled,
      @Param("isMulti") String isMulti,
      @Param("name") String name,
      @Param("remark") String remark,
      @Param("searchWord") String searchWord,
      @Param("showOrder") Integer showOrder,
      @Param("tableId") Integer tableId,
      @Param("pageable") Pageable pageable) {
    BasCat obj = BasCat.toExample();
    obj.setActive(active);
    obj.setCode(code);
    obj.setDeleted1(deleted1);
    obj.setEnabled1(enabled1);
    obj.setIsDefault(isDefault);
    obj.setIsEnabled(isEnabled);
    obj.setIsMulti(isMulti);
    obj.setName(name);
    obj.setRemark(remark);
    obj.setSearchWord(searchWord);
    obj.setShowOrder(showOrder);
    obj.setTableId(tableId);
    Example<BasCat> example = Example.of(obj);

    return findAll(example, pageable).map(BasCat.DTO_CONVERTER);
  }

  @Override
  public List<BasCatDTO> findBy(
      @Param("active") Boolean active,
      @Param("code") String code,
      @Param("deleted1") Long deleted1,
      @Param("enabled1") Boolean enabled1,
      @Param("isDefault") String isDefault,
      @Param("isEnabled") String isEnabled,
      @Param("isMulti") String isMulti,
      @Param("name") String name,
      @Param("remark") String remark,
      @Param("searchWord") String searchWord,
      @Param("showOrder") Integer showOrder,
      @Param("tableId") Integer tableId) {
    BasCat obj = BasCat.toExample();
    obj.setActive(active);
    obj.setCode(code);
    obj.setDeleted1(deleted1);
    obj.setEnabled1(enabled1);
    obj.setIsDefault(isDefault);
    obj.setIsEnabled(isEnabled);
    obj.setIsMulti(isMulti);
    obj.setName(name);
    obj.setRemark(remark);
    obj.setSearchWord(searchWord);
    obj.setShowOrder(showOrder);
    obj.setTableId(tableId);
    Example<BasCat> example = Example.of(obj);
    return findAll(example, null).map(BasCat.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasCatDTO> findByExample(
      @Param("example") BasCat example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasCat.DTO_CONVERTER);
  }

  @Override
  public List<BasCatDTO> findByExample(@Param("example") BasCat example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasCat.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasCatDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(BasCat.DTO_CONVERTER);
  }

  @Override
  public List<BasCatDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasCat.DTO_CONVERTER)
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
  public Page<BasCatDTO> findByFuzzySearch(
      @Param("example") BasCat example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasCat.DTO_CONVERTER);
  }

  @Override
  public Page<BasCatDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasCat example = BasCat.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasCat.DTO_CONVERTER);
  }

  @Override
  public List<BasCatDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
