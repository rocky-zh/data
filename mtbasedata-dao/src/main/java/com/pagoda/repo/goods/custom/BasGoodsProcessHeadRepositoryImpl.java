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
 * BasGoodsProcessHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasGoodsProcessHeadRepositoryImpl
    extends BaseRepositoryCustomImpl<BasGoodsProcessHead, Long>
    implements BasGoodsProcessHeadRepositoryCustom {

  @Override
  protected Class<BasGoodsProcessHead> getDomainClass() {
    return BasGoodsProcessHead.class;
  }

  @Override
  public Page<BasGoodsProcessHeadDTO> findBy(
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("isDefault") Integer isDefault,
      @Param("rankNum") Integer rankNum,
      @Param("code") String code,
      @Param("name") String name,
      @Param("isEnabled") Integer isEnabled,
      @Param("remark") String remark,
      @Param("entId") Long entId,
      @Param("pageable") Pageable pageable) {
    BasGoodsProcessHead obj = BasGoodsProcessHead.toExample();
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setIsDefault(isDefault);
    obj.setRankNum(rankNum);
    obj.setCode(code);
    obj.setName(name);
    obj.setIsEnabled(isEnabled);
    obj.setRemark(remark);
    obj.setEntId(entId);
    Example<BasGoodsProcessHead> example = Example.of(obj);

    return findAll(example, pageable).map(BasGoodsProcessHead.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsProcessHeadDTO> findBy(
      @Param("orgOrgId") Long orgOrgId,
      @Param("orgOrgCode") String orgOrgCode,
      @Param("orgOrgName") String orgOrgName,
      @Param("isDefault") Integer isDefault,
      @Param("rankNum") Integer rankNum,
      @Param("code") String code,
      @Param("name") String name,
      @Param("isEnabled") Integer isEnabled,
      @Param("remark") String remark,
      @Param("entId") Long entId) {
    BasGoodsProcessHead obj = BasGoodsProcessHead.toExample();
    obj.setOrgOrgId(orgOrgId);
    obj.setOrgOrgCode(orgOrgCode);
    obj.setOrgOrgName(orgOrgName);
    obj.setIsDefault(isDefault);
    obj.setRankNum(rankNum);
    obj.setCode(code);
    obj.setName(name);
    obj.setIsEnabled(isEnabled);
    obj.setRemark(remark);
    obj.setEntId(entId);
    Example<BasGoodsProcessHead> example = Example.of(obj);
    return findAll(example, null).map(BasGoodsProcessHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasGoodsProcessHeadDTO> findByExample(
      @Param("example") BasGoodsProcessHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasGoodsProcessHead.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsProcessHeadDTO> findByExample(@Param("example") BasGoodsProcessHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasGoodsProcessHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasGoodsProcessHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasGoodsProcessHead.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsProcessHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasGoodsProcessHead.DTO_CONVERTER)
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
  public Page<BasGoodsProcessHeadDTO> findByFuzzySearch(
      @Param("example") BasGoodsProcessHead example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasGoodsProcessHead.DTO_CONVERTER);
  }

  @Override
  public Page<BasGoodsProcessHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasGoodsProcessHead example = BasGoodsProcessHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasGoodsProcessHead.DTO_CONVERTER);
  }

  @Override
  public List<BasGoodsProcessHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
