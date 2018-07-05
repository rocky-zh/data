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
 * BasOrg扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgRepositoryImpl extends BaseRepositoryCustomImpl<BasOrg, Long>
    implements BasOrgRepositoryCustom {

  @Override
  protected Class<BasOrg> getDomainClass() {
    return BasOrg.class;
  }

  @Override
  public Page<BasOrgDTO> findBy(
      @Param("isCus") Integer isCus,
      @Param("isOrg") Integer isOrg,
      @Param("isVen") Integer isVen,
      @Param("isOut") Integer isOut,
      @Param("isDep") Integer isDep,
      @Param("depCode") String depCode,
      @Param("depId") Long depId,
      @Param("depName") String depName,
      @Param("isBal") Integer isBal,
      @Param("isOrgGroup") Integer isOrgGroup,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("registerAddress") String registerAddress,
      @Param("address") String address,
      @Param("contactPerson") String contactPerson,
      @Param("telephone") String telephone,
      @Param("mobilephone") String mobilephone,
      @Param("email") String email,
      @Param("code") String code,
      @Param("name") String name,
      @Param("entId") Long entId,
      @Param("isEnabled") Integer isEnabled,
      @Param("remark") String remark,
      @Param("searchWord") String searchWord,
      @Param("showOrder") Integer showOrder,
      @Param("pageable") Pageable pageable) {
    BasOrg obj = BasOrg.toExample();
    obj.setIsCus(isCus);
    obj.setIsOrg(isOrg);
    obj.setIsVen(isVen);
    obj.setIsOut(isOut);
    obj.setIsDep(isDep);
    obj.setDepCode(depCode);
    obj.setDepId(depId);
    obj.setDepName(depName);
    obj.setIsBal(isBal);
    obj.setIsOrgGroup(isOrgGroup);
    obj.setBalOrgId(balOrgId);
    obj.setBalOrgName(balOrgName);
    obj.setRegisterAddress(registerAddress);
    obj.setAddress(address);
    obj.setContactPerson(contactPerson);
    obj.setTelephone(telephone);
    obj.setMobilephone(mobilephone);
    obj.setEmail(email);
    obj.setCode(code);
    obj.setName(name);
    obj.setEntId(entId);
    obj.setIsEnabled(isEnabled);
    obj.setRemark(remark);
    obj.setSearchWord(searchWord);
    obj.setShowOrder(showOrder);
    Example<BasOrg> example = Example.of(obj);

    return findAll(example, pageable).map(BasOrg.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgDTO> findBy(
      @Param("isCus") Integer isCus,
      @Param("isOrg") Integer isOrg,
      @Param("isVen") Integer isVen,
      @Param("isOut") Integer isOut,
      @Param("isDep") Integer isDep,
      @Param("depCode") String depCode,
      @Param("depId") Long depId,
      @Param("depName") String depName,
      @Param("isBal") Integer isBal,
      @Param("isOrgGroup") Integer isOrgGroup,
      @Param("balOrgId") Long balOrgId,
      @Param("balOrgName") String balOrgName,
      @Param("registerAddress") String registerAddress,
      @Param("address") String address,
      @Param("contactPerson") String contactPerson,
      @Param("telephone") String telephone,
      @Param("mobilephone") String mobilephone,
      @Param("email") String email,
      @Param("code") String code,
      @Param("name") String name,
      @Param("entId") Long entId,
      @Param("isEnabled") Integer isEnabled,
      @Param("remark") String remark,
      @Param("searchWord") String searchWord,
      @Param("showOrder") Integer showOrder) {
    BasOrg obj = BasOrg.toExample();
    obj.setIsCus(isCus);
    obj.setIsOrg(isOrg);
    obj.setIsVen(isVen);
    obj.setIsOut(isOut);
    obj.setIsDep(isDep);
    obj.setDepCode(depCode);
    obj.setDepId(depId);
    obj.setDepName(depName);
    obj.setIsBal(isBal);
    obj.setIsOrgGroup(isOrgGroup);
    obj.setBalOrgId(balOrgId);
    obj.setBalOrgName(balOrgName);
    obj.setRegisterAddress(registerAddress);
    obj.setAddress(address);
    obj.setContactPerson(contactPerson);
    obj.setTelephone(telephone);
    obj.setMobilephone(mobilephone);
    obj.setEmail(email);
    obj.setCode(code);
    obj.setName(name);
    obj.setEntId(entId);
    obj.setIsEnabled(isEnabled);
    obj.setRemark(remark);
    obj.setSearchWord(searchWord);
    obj.setShowOrder(showOrder);
    Example<BasOrg> example = Example.of(obj);
    return findAll(example, null).map(BasOrg.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasOrgDTO> findByExample(
      @Param("example") BasOrg example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasOrg.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgDTO> findByExample(@Param("example") BasOrg example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasOrg.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasOrgDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(BasOrg.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasOrg.DTO_CONVERTER)
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
  public Page<BasOrgDTO> findByFuzzySearch(
      @Param("example") BasOrg example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasOrg.DTO_CONVERTER);
  }

  @Override
  public Page<BasOrgDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasOrg example = BasOrg.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasOrg.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
