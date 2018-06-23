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
 * BasOrgBalBank扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgBalBankRepositoryImpl extends BaseRepositoryCustomImpl<BasOrgBalBank, Long>
    implements BasOrgBalBankRepositoryCustom {

  @Override
  protected Class<BasOrgBalBank> getDomainClass() {
    return BasOrgBalBank.class;
  }

  @Override
  public Page<BasOrgBalBankDTO> findBy(
      @Param("accountName") String accountName,
      @Param("bank") String bank,
      @Param("bankAccountNo") String bankAccountNo,
      @Param("cityCode") String cityCode,
      @Param("cityName") String cityName,
      @Param("provinceCode") String provinceCode,
      @Param("provinceName") String provinceName,
      @Param("registerBank") String registerBank,
      @Param("active") Boolean active,
      @Param("pageable") Pageable pageable) {
    BasOrgBalBank obj = BasOrgBalBank.toExample();
    obj.setAccountName(accountName);
    obj.setBank(bank);
    obj.setBankAccountNo(bankAccountNo);
    obj.setCityCode(cityCode);
    obj.setCityName(cityName);
    obj.setProvinceCode(provinceCode);
    obj.setProvinceName(provinceName);
    obj.setRegisterBank(registerBank);
    obj.setActive(active);
    Example<BasOrgBalBank> example = Example.of(obj);

    return findAll(example, pageable).map(BasOrgBalBank.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgBalBankDTO> findBy(
      @Param("accountName") String accountName,
      @Param("bank") String bank,
      @Param("bankAccountNo") String bankAccountNo,
      @Param("cityCode") String cityCode,
      @Param("cityName") String cityName,
      @Param("provinceCode") String provinceCode,
      @Param("provinceName") String provinceName,
      @Param("registerBank") String registerBank,
      @Param("active") Boolean active) {
    BasOrgBalBank obj = BasOrgBalBank.toExample();
    obj.setAccountName(accountName);
    obj.setBank(bank);
    obj.setBankAccountNo(bankAccountNo);
    obj.setCityCode(cityCode);
    obj.setCityName(cityName);
    obj.setProvinceCode(provinceCode);
    obj.setProvinceName(provinceName);
    obj.setRegisterBank(registerBank);
    obj.setActive(active);
    Example<BasOrgBalBank> example = Example.of(obj);
    return findAll(example, null).map(BasOrgBalBank.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasOrgBalBankDTO> findByExample(
      @Param("example") BasOrgBalBank example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasOrgBalBank.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgBalBankDTO> findByExample(@Param("example") BasOrgBalBank example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasOrgBalBank.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasOrgBalBankDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(BasOrgBalBank.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgBalBankDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasOrgBalBank.DTO_CONVERTER)
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
  public Page<BasOrgBalBankDTO> findByFuzzySearch(
      @Param("example") BasOrgBalBank example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasOrgBalBank.DTO_CONVERTER);
  }

  @Override
  public Page<BasOrgBalBankDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasOrgBalBank example = BasOrgBalBank.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasOrgBalBank.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgBalBankDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
