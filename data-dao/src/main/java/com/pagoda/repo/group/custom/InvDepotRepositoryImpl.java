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
 * InvDepot扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class InvDepotRepositoryImpl extends BaseRepositoryCustomImpl<InvDepot, Long>
    implements InvDepotRepositoryCustom {

  @Override
  protected Class<InvDepot> getDomainClass() {
    return InvDepot.class;
  }

  @Override
  public Page<InvDepotDTO> findBy(
      @Param("adCode") String adCode,
      @Param("adLat") String adLat,
      @Param("adLng") String adLng,
      @Param("address") String address,
      @Param("balOrgId") Long balOrgId,
      @Param("currentPeriod") String currentPeriod,
      @Param("depotCenterId") Integer depotCenterId,
      @Param("isAllowInvOut") Integer isAllowInvOut,
      @Param("isAllowPostReturn") Integer isAllowPostReturn,
      @Param("isCheckByAdd") Integer isCheckByAdd,
      @Param("isCheckByNegative") Integer isCheckByNegative,
      @Param("isCheckByPost") Integer isCheckByPost,
      @Param("isCheckInputNeedCheck") Integer isCheckInputNeedCheck,
      @Param("isCheckQtyZero") Integer isCheckQtyZero,
      @Param("isCheckShowFinQty") Integer isCheckShowFinQty,
      @Param("isDualDepot") Integer isDualDepot,
      @Param("isPickAllocation") Integer isPickAllocation,
      @Param("isPostCheckAll") Integer isPostCheckAll,
      @Param("isPostDaily") Integer isPostDaily,
      @Param("isPostDailyDetail") Integer isPostDailyDetail,
      @Param("isPurRecIn") Integer isPurRecIn,
      @Param("isPurRetOut") Integer isPurRetOut,
      @Param("isSalConIn") Integer isSalConIn,
      @Param("isSalConOut") Integer isSalConOut,
      @Param("isSalRetIn") Integer isSalRetIn,
      @Param("isSalRetOut") Integer isSalRetOut,
      @Param("isStoEnabled") Integer isStoEnabled,
      @Param("isTurnExistNoPost") Integer isTurnExistNoPost,
      @Param("manageType") Integer manageType,
      @Param("measureType") Integer measureType,
      @Param("orgId") Long orgId,
      @Param("phone") String phone,
      @Param("searchWord") String searchWord,
      @Param("stoCurrentPeriod") Integer stoCurrentPeriod,
      @Param("turnDateTime") java.sql.Timestamp turnDateTime,
      @Param("turnUserCode") String turnUserCode,
      @Param("turnUserName") String turnUserName,
      @Param("createDateTime") java.sql.Timestamp createDateTime,
      @Param("createOrgCode") String createOrgCode,
      @Param("createUserCode") String createUserCode,
      @Param("createUserName") String createUserName,
      @Param("delId") Integer delId,
      @Param("depotAddress") String depotAddress,
      @Param("depotPhone") String depotPhone,
      @Param("orgCode") String orgCode,
      @Param("orgName") String orgName,
      @Param("updateDateTime") java.sql.Timestamp updateDateTime,
      @Param("updateOrgCode") String updateOrgCode,
      @Param("updateUserCode") String updateUserCode,
      @Param("updateUserName") String updateUserName,
      @Param("code") String code,
      @Param("entId") Long entId,
      @Param("isEnabled") Integer isEnabled,
      @Param("name") String name,
      @Param("pageable") Pageable pageable) {
    InvDepot obj = InvDepot.toExample();
    obj.setAdCode(adCode);
    obj.setAdLat(adLat);
    obj.setAdLng(adLng);
    obj.setAddress(address);
    obj.setBalOrgId(balOrgId);
    obj.setCurrentPeriod(currentPeriod);
    obj.setDepotCenterId(depotCenterId);
    obj.setIsAllowInvOut(isAllowInvOut);
    obj.setIsAllowPostReturn(isAllowPostReturn);
    obj.setIsCheckByAdd(isCheckByAdd);
    obj.setIsCheckByNegative(isCheckByNegative);
    obj.setIsCheckByPost(isCheckByPost);
    obj.setIsCheckInputNeedCheck(isCheckInputNeedCheck);
    obj.setIsCheckQtyZero(isCheckQtyZero);
    obj.setIsCheckShowFinQty(isCheckShowFinQty);
    obj.setIsDualDepot(isDualDepot);
    obj.setIsPickAllocation(isPickAllocation);
    obj.setIsPostCheckAll(isPostCheckAll);
    obj.setIsPostDaily(isPostDaily);
    obj.setIsPostDailyDetail(isPostDailyDetail);
    obj.setIsPurRecIn(isPurRecIn);
    obj.setIsPurRetOut(isPurRetOut);
    obj.setIsSalConIn(isSalConIn);
    obj.setIsSalConOut(isSalConOut);
    obj.setIsSalRetIn(isSalRetIn);
    obj.setIsSalRetOut(isSalRetOut);
    obj.setIsStoEnabled(isStoEnabled);
    obj.setIsTurnExistNoPost(isTurnExistNoPost);
    obj.setManageType(manageType);
    obj.setMeasureType(measureType);
    obj.setOrgId(orgId);
    obj.setPhone(phone);
    obj.setSearchWord(searchWord);
    obj.setStoCurrentPeriod(stoCurrentPeriod);
    obj.setTurnDateTime(turnDateTime);
    obj.setTurnUserCode(turnUserCode);
    obj.setTurnUserName(turnUserName);
    obj.setCreateDateTime(createDateTime);
    obj.setCreateOrgCode(createOrgCode);
    obj.setCreateUserCode(createUserCode);
    obj.setCreateUserName(createUserName);
    obj.setDelId(delId);
    obj.setDepotAddress(depotAddress);
    obj.setDepotPhone(depotPhone);
    obj.setOrgCode(orgCode);
    obj.setOrgName(orgName);
    obj.setUpdateDateTime(updateDateTime);
    obj.setUpdateOrgCode(updateOrgCode);
    obj.setUpdateUserCode(updateUserCode);
    obj.setUpdateUserName(updateUserName);
    obj.setCode(code);
    obj.setEntId(entId);
    obj.setIsEnabled(isEnabled);
    obj.setName(name);
    Example<InvDepot> example = Example.of(obj);

    return findAll(example, pageable).map(InvDepot.DTO_CONVERTER);
  }

  @Override
  public List<InvDepotDTO> findBy(
      @Param("adCode") String adCode,
      @Param("adLat") String adLat,
      @Param("adLng") String adLng,
      @Param("address") String address,
      @Param("balOrgId") Long balOrgId,
      @Param("currentPeriod") String currentPeriod,
      @Param("depotCenterId") Integer depotCenterId,
      @Param("isAllowInvOut") Integer isAllowInvOut,
      @Param("isAllowPostReturn") Integer isAllowPostReturn,
      @Param("isCheckByAdd") Integer isCheckByAdd,
      @Param("isCheckByNegative") Integer isCheckByNegative,
      @Param("isCheckByPost") Integer isCheckByPost,
      @Param("isCheckInputNeedCheck") Integer isCheckInputNeedCheck,
      @Param("isCheckQtyZero") Integer isCheckQtyZero,
      @Param("isCheckShowFinQty") Integer isCheckShowFinQty,
      @Param("isDualDepot") Integer isDualDepot,
      @Param("isPickAllocation") Integer isPickAllocation,
      @Param("isPostCheckAll") Integer isPostCheckAll,
      @Param("isPostDaily") Integer isPostDaily,
      @Param("isPostDailyDetail") Integer isPostDailyDetail,
      @Param("isPurRecIn") Integer isPurRecIn,
      @Param("isPurRetOut") Integer isPurRetOut,
      @Param("isSalConIn") Integer isSalConIn,
      @Param("isSalConOut") Integer isSalConOut,
      @Param("isSalRetIn") Integer isSalRetIn,
      @Param("isSalRetOut") Integer isSalRetOut,
      @Param("isStoEnabled") Integer isStoEnabled,
      @Param("isTurnExistNoPost") Integer isTurnExistNoPost,
      @Param("manageType") Integer manageType,
      @Param("measureType") Integer measureType,
      @Param("orgId") Long orgId,
      @Param("phone") String phone,
      @Param("searchWord") String searchWord,
      @Param("stoCurrentPeriod") Integer stoCurrentPeriod,
      @Param("turnDateTime") java.sql.Timestamp turnDateTime,
      @Param("turnUserCode") String turnUserCode,
      @Param("turnUserName") String turnUserName,
      @Param("createDateTime") java.sql.Timestamp createDateTime,
      @Param("createOrgCode") String createOrgCode,
      @Param("createUserCode") String createUserCode,
      @Param("createUserName") String createUserName,
      @Param("delId") Integer delId,
      @Param("depotAddress") String depotAddress,
      @Param("depotPhone") String depotPhone,
      @Param("orgCode") String orgCode,
      @Param("orgName") String orgName,
      @Param("updateDateTime") java.sql.Timestamp updateDateTime,
      @Param("updateOrgCode") String updateOrgCode,
      @Param("updateUserCode") String updateUserCode,
      @Param("updateUserName") String updateUserName,
      @Param("code") String code,
      @Param("entId") Long entId,
      @Param("isEnabled") Integer isEnabled,
      @Param("name") String name) {
    InvDepot obj = InvDepot.toExample();
    obj.setAdCode(adCode);
    obj.setAdLat(adLat);
    obj.setAdLng(adLng);
    obj.setAddress(address);
    obj.setBalOrgId(balOrgId);
    obj.setCurrentPeriod(currentPeriod);
    obj.setDepotCenterId(depotCenterId);
    obj.setIsAllowInvOut(isAllowInvOut);
    obj.setIsAllowPostReturn(isAllowPostReturn);
    obj.setIsCheckByAdd(isCheckByAdd);
    obj.setIsCheckByNegative(isCheckByNegative);
    obj.setIsCheckByPost(isCheckByPost);
    obj.setIsCheckInputNeedCheck(isCheckInputNeedCheck);
    obj.setIsCheckQtyZero(isCheckQtyZero);
    obj.setIsCheckShowFinQty(isCheckShowFinQty);
    obj.setIsDualDepot(isDualDepot);
    obj.setIsPickAllocation(isPickAllocation);
    obj.setIsPostCheckAll(isPostCheckAll);
    obj.setIsPostDaily(isPostDaily);
    obj.setIsPostDailyDetail(isPostDailyDetail);
    obj.setIsPurRecIn(isPurRecIn);
    obj.setIsPurRetOut(isPurRetOut);
    obj.setIsSalConIn(isSalConIn);
    obj.setIsSalConOut(isSalConOut);
    obj.setIsSalRetIn(isSalRetIn);
    obj.setIsSalRetOut(isSalRetOut);
    obj.setIsStoEnabled(isStoEnabled);
    obj.setIsTurnExistNoPost(isTurnExistNoPost);
    obj.setManageType(manageType);
    obj.setMeasureType(measureType);
    obj.setOrgId(orgId);
    obj.setPhone(phone);
    obj.setSearchWord(searchWord);
    obj.setStoCurrentPeriod(stoCurrentPeriod);
    obj.setTurnDateTime(turnDateTime);
    obj.setTurnUserCode(turnUserCode);
    obj.setTurnUserName(turnUserName);
    obj.setCreateDateTime(createDateTime);
    obj.setCreateOrgCode(createOrgCode);
    obj.setCreateUserCode(createUserCode);
    obj.setCreateUserName(createUserName);
    obj.setDelId(delId);
    obj.setDepotAddress(depotAddress);
    obj.setDepotPhone(depotPhone);
    obj.setOrgCode(orgCode);
    obj.setOrgName(orgName);
    obj.setUpdateDateTime(updateDateTime);
    obj.setUpdateOrgCode(updateOrgCode);
    obj.setUpdateUserCode(updateUserCode);
    obj.setUpdateUserName(updateUserName);
    obj.setCode(code);
    obj.setEntId(entId);
    obj.setIsEnabled(isEnabled);
    obj.setName(name);
    Example<InvDepot> example = Example.of(obj);
    return findAll(example, null).map(InvDepot.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<InvDepotDTO> findByExample(
      @Param("example") InvDepot example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(InvDepot.DTO_CONVERTER);
  }

  @Override
  public List<InvDepotDTO> findByExample(@Param("example") InvDepot example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(InvDepot.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<InvDepotDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(InvDepot.DTO_CONVERTER);
  }

  @Override
  public List<InvDepotDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(InvDepot.DTO_CONVERTER)
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
  public Page<InvDepotDTO> findByFuzzySearch(
      @Param("example") InvDepot example,
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
    return findAll(Example.of(example, matcher), pageable).map(InvDepot.DTO_CONVERTER);
  }

  @Override
  public Page<InvDepotDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    InvDepot example = InvDepot.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(InvDepot.DTO_CONVERTER);
  }

  @Override
  public List<InvDepotDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
