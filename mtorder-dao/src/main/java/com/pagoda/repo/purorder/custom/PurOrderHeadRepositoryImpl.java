package com.pagoda.repo.purorder.custom;

import com.pagoda.api.dto.purorder.*;
import com.pagoda.domain.purorder.*;
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
 * PurOrderHead扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurOrderHeadRepositoryImpl extends BaseRepositoryCustomImpl<PurOrderHead, Long>
    implements PurOrderHeadRepositoryCustom {

  @Override
  protected Class<PurOrderHead> getDomainClass() {
    return PurOrderHead.class;
  }

  @Override
  public Page<PurOrderHeadDTO> findBy(
      @Param("entId") Long entId,
      @Param("seqno") String seqno,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("venComfirmStatus") Integer venComfirmStatus,
      @Param("venComfirmUserCode") String venComfirmUserCode,
      @Param("venComfirmUserName") String venComfirmUserName,
      @Param("orderStatus") Integer orderStatus,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.util.Date auditTime,
      @Param("bpmnStatus") Integer bpmnStatus,
      @Param("bpmnRemark") String bpmnRemark,
      @Param("pageable") Pageable pageable) {
    PurOrderHead obj = PurOrderHead.toExample();
    obj.setEntId(entId);
    obj.setSeqno(seqno);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setVenComfirmStatus(venComfirmStatus);
    obj.setVenComfirmUserCode(venComfirmUserCode);
    obj.setVenComfirmUserName(venComfirmUserName);
    obj.setOrderStatus(orderStatus);
    obj.setPlanRecDate(planRecDate);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setAuditTime(auditTime);
    obj.setBpmnStatus(bpmnStatus);
    obj.setBpmnRemark(bpmnRemark);
    Example<PurOrderHead> example = Example.of(obj);

    return findAll(example, pageable).map(PurOrderHead.DTO_CONVERTER);
  }

  @Override
  public List<PurOrderHeadDTO> findBy(
      @Param("entId") Long entId,
      @Param("seqno") String seqno,
      @Param("venOrgId") Long venOrgId,
      @Param("venOrgCode") String venOrgCode,
      @Param("venOrgName") String venOrgName,
      @Param("venComfirmStatus") Integer venComfirmStatus,
      @Param("venComfirmUserCode") String venComfirmUserCode,
      @Param("venComfirmUserName") String venComfirmUserName,
      @Param("orderStatus") Integer orderStatus,
      @Param("planRecDate") java.util.Date planRecDate,
      @Param("auditorCode") String auditorCode,
      @Param("auditorName") String auditorName,
      @Param("auditTime") java.util.Date auditTime,
      @Param("bpmnStatus") Integer bpmnStatus,
      @Param("bpmnRemark") String bpmnRemark) {
    PurOrderHead obj = PurOrderHead.toExample();
    obj.setEntId(entId);
    obj.setSeqno(seqno);
    obj.setVenOrgId(venOrgId);
    obj.setVenOrgCode(venOrgCode);
    obj.setVenOrgName(venOrgName);
    obj.setVenComfirmStatus(venComfirmStatus);
    obj.setVenComfirmUserCode(venComfirmUserCode);
    obj.setVenComfirmUserName(venComfirmUserName);
    obj.setOrderStatus(orderStatus);
    obj.setPlanRecDate(planRecDate);
    obj.setAuditorCode(auditorCode);
    obj.setAuditorName(auditorName);
    obj.setAuditTime(auditTime);
    obj.setBpmnStatus(bpmnStatus);
    obj.setBpmnRemark(bpmnRemark);
    Example<PurOrderHead> example = Example.of(obj);
    return findAll(example, null).map(PurOrderHead.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PurOrderHeadDTO> findByExample(
      @Param("example") PurOrderHead example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PurOrderHead.DTO_CONVERTER);
  }

  @Override
  public List<PurOrderHeadDTO> findByExample(@Param("example") PurOrderHead example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PurOrderHead.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PurOrderHeadDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(PurOrderHead.DTO_CONVERTER);
  }

  @Override
  public List<PurOrderHeadDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PurOrderHead.DTO_CONVERTER)
        .getContent();
  }

  @Override
  public int updateByBuilder(@Param("builder") JpaUpdateBuilder builder) {
    return executeUpdate(builder);
  }

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
  public Page<PurOrderHeadDTO> findByFuzzySearch(
      @Param("example") PurOrderHead example,
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
    return findAll(Example.of(example, matcher), pageable).map(PurOrderHead.DTO_CONVERTER);
  }

  @Override
  public Page<PurOrderHeadDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PurOrderHead example = PurOrderHead.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PurOrderHead.DTO_CONVERTER);
  }

  @Override
  public List<PurOrderHeadDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
