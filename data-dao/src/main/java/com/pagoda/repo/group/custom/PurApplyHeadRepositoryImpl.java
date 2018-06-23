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
 * PurApplyHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurApplyHeadRepositoryImpl extends BaseRepositoryCustomImpl<PurApplyHead, Long>
    implements PurApplyHeadRepositoryCustom {

  @Override
  protected Class<PurApplyHead> getDomainClass() {
    return PurApplyHead.class;
  }

  @Override
  public Page<PurApplyHeadDTO> findBy(
      @Param("applyNo") String applyNo,
      @Param("applyOrgCode") String applyOrgCode,
      @Param("applyOrgId") Integer applyOrgId,
      @Param("applyOrgName") String applyOrgName,
      @Param("applyStatus") Integer applyStatus,
      @Param("calPurRate") Double calPurRate,
      @Param("calType") Integer calType,
      @Param("checkUserCode") String checkUserCode,
      @Param("checkUserId") Integer checkUserId,
      @Param("checkUserName") String checkUserName,
      @Param("checkdatetime") java.sql.Timestamp checkdatetime,
      @Param("delId") Integer delId,
      @Param("planRecDate") java.sql.Timestamp planRecDate,
      @Param("recOrgCode") String recOrgCode,
      @Param("recOrgId") Integer recOrgId,
      @Param("recOrgName") String recOrgName,
      @Param("sourceType") Integer sourceType,
      @Param("active") Boolean active,
      @Param("pageable") Pageable pageable) {
    PurApplyHead obj = PurApplyHead.toExample();
    obj.setApplyNo(applyNo);
    obj.setApplyOrgCode(applyOrgCode);
    obj.setApplyOrgId(applyOrgId);
    obj.setApplyOrgName(applyOrgName);
    obj.setApplyStatus(applyStatus);
    obj.setCalPurRate(calPurRate);
    obj.setCalType(calType);
    obj.setCheckUserCode(checkUserCode);
    obj.setCheckUserId(checkUserId);
    obj.setCheckUserName(checkUserName);
    obj.setCheckdatetime(checkdatetime);
    obj.setDelId(delId);
    obj.setPlanRecDate(planRecDate);
    obj.setRecOrgCode(recOrgCode);
    obj.setRecOrgId(recOrgId);
    obj.setRecOrgName(recOrgName);
    obj.setSourceType(sourceType);
    obj.setActive(active);
    Example<PurApplyHead> example = Example.of(obj);

    return findAll(example, pageable).map(PurApplyHead.DTO_CONVERTER);
  }

  @Override
  public List<PurApplyHeadDTO> findBy(
      @Param("applyNo") String applyNo,
      @Param("applyOrgCode") String applyOrgCode,
      @Param("applyOrgId") Integer applyOrgId,
      @Param("applyOrgName") String applyOrgName,
      @Param("applyStatus") Integer applyStatus,
      @Param("calPurRate") Double calPurRate,
      @Param("calType") Integer calType,
      @Param("checkUserCode") String checkUserCode,
      @Param("checkUserId") Integer checkUserId,
      @Param("checkUserName") String checkUserName,
      @Param("checkdatetime") java.sql.Timestamp checkdatetime,
      @Param("delId") Integer delId,
      @Param("planRecDate") java.sql.Timestamp planRecDate,
      @Param("recOrgCode") String recOrgCode,
      @Param("recOrgId") Integer recOrgId,
      @Param("recOrgName") String recOrgName,
      @Param("sourceType") Integer sourceType,
      @Param("active") Boolean active) {
    PurApplyHead obj = PurApplyHead.toExample();
    obj.setApplyNo(applyNo);
    obj.setApplyOrgCode(applyOrgCode);
    obj.setApplyOrgId(applyOrgId);
    obj.setApplyOrgName(applyOrgName);
    obj.setApplyStatus(applyStatus);
    obj.setCalPurRate(calPurRate);
    obj.setCalType(calType);
    obj.setCheckUserCode(checkUserCode);
    obj.setCheckUserId(checkUserId);
    obj.setCheckUserName(checkUserName);
    obj.setCheckdatetime(checkdatetime);
    obj.setDelId(delId);
    obj.setPlanRecDate(planRecDate);
    obj.setRecOrgCode(recOrgCode);
    obj.setRecOrgId(recOrgId);
    obj.setRecOrgName(recOrgName);
    obj.setSourceType(sourceType);
    obj.setActive(active);
    Example<PurApplyHead> example = Example.of(obj);
    return findAll(example, null).map(PurApplyHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PurApplyHeadDTO> findByExample(
      @Param("example") PurApplyHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PurApplyHead.DTO_CONVERTER);
  }

  @Override
  public List<PurApplyHeadDTO> findByExample(@Param("example") PurApplyHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PurApplyHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PurApplyHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(PurApplyHead.DTO_CONVERTER);
  }

  @Override
  public List<PurApplyHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PurApplyHead.DTO_CONVERTER)
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
  public Page<PurApplyHeadDTO> findByFuzzySearch(
      @Param("example") PurApplyHead example,
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
    return findAll(Example.of(example, matcher), pageable).map(PurApplyHead.DTO_CONVERTER);
  }

  @Override
  public Page<PurApplyHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PurApplyHead example = PurApplyHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PurApplyHead.DTO_CONVERTER);
  }

  @Override
  public List<PurApplyHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
