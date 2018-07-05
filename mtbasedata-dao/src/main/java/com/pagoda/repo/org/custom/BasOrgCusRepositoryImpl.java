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
 * BasOrgCus扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgCusRepositoryImpl extends BaseRepositoryCustomImpl<BasOrgCus, Long>
    implements BasOrgCusRepositoryCustom {

  @Override
  protected Class<BasOrgCus> getDomainClass() {
    return BasOrgCus.class;
  }

  @Override
  public Page<BasOrgCusDTO> findBy(
      @Param("invLimitAmt") java.math.BigDecimal invLimitAmt,
      @Param("isInvLimitAmt") Integer isInvLimitAmt,
      @Param("checkMinAmt") Integer checkMinAmt,
      @Param("isOrderCheck") Integer isOrderCheck,
      @Param("isReturnCheck") Integer isReturnCheck,
      @Param("returnDealType") Integer returnDealType,
      @Param("isModifyPrice") Integer isModifyPrice,
      @Param("isModifyCheck") Integer isModifyCheck,
      @Param("isCusInv") Integer isCusInv,
      @Param("isAllotCheck") Integer isAllotCheck,
      @Param("isClosed") Integer isClosed,
      @Param("isOrderPaused") Integer isOrderPaused,
      @Param("shopOwnerName") String shopOwnerName,
      @Param("shopOwnerPhone") String shopOwnerPhone,
      @Param("openingDate") java.util.Date openingDate,
      @Param("isOuterLeague") Integer isOuterLeague,
      @Param("isAutoRecIn") Integer isAutoRecIn,
      @Param("enabledStatus") Integer enabledStatus,
      @Param("salConInDepotId") Long salConInDepotId,
      @Param("salRetOutDepotId") Long salRetOutDepotId,
      @Param("orgId") Long orgId,
      @Param("pageable") Pageable pageable) {
    BasOrgCus obj = BasOrgCus.toExample();
    obj.setInvLimitAmt(invLimitAmt);
    obj.setIsInvLimitAmt(isInvLimitAmt);
    obj.setCheckMinAmt(checkMinAmt);
    obj.setIsOrderCheck(isOrderCheck);
    obj.setIsReturnCheck(isReturnCheck);
    obj.setReturnDealType(returnDealType);
    obj.setIsModifyPrice(isModifyPrice);
    obj.setIsModifyCheck(isModifyCheck);
    obj.setIsCusInv(isCusInv);
    obj.setIsAllotCheck(isAllotCheck);
    obj.setIsClosed(isClosed);
    obj.setIsOrderPaused(isOrderPaused);
    obj.setShopOwnerName(shopOwnerName);
    obj.setShopOwnerPhone(shopOwnerPhone);
    obj.setOpeningDate(openingDate);
    obj.setIsOuterLeague(isOuterLeague);
    obj.setIsAutoRecIn(isAutoRecIn);
    obj.setEnabledStatus(enabledStatus);
    obj.setSalConInDepotId(salConInDepotId);
    obj.setSalRetOutDepotId(salRetOutDepotId);
    obj.setOrgId(orgId);
    Example<BasOrgCus> example = Example.of(obj);

    return findAll(example, pageable).map(BasOrgCus.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgCusDTO> findBy(
      @Param("invLimitAmt") java.math.BigDecimal invLimitAmt,
      @Param("isInvLimitAmt") Integer isInvLimitAmt,
      @Param("checkMinAmt") Integer checkMinAmt,
      @Param("isOrderCheck") Integer isOrderCheck,
      @Param("isReturnCheck") Integer isReturnCheck,
      @Param("returnDealType") Integer returnDealType,
      @Param("isModifyPrice") Integer isModifyPrice,
      @Param("isModifyCheck") Integer isModifyCheck,
      @Param("isCusInv") Integer isCusInv,
      @Param("isAllotCheck") Integer isAllotCheck,
      @Param("isClosed") Integer isClosed,
      @Param("isOrderPaused") Integer isOrderPaused,
      @Param("shopOwnerName") String shopOwnerName,
      @Param("shopOwnerPhone") String shopOwnerPhone,
      @Param("openingDate") java.util.Date openingDate,
      @Param("isOuterLeague") Integer isOuterLeague,
      @Param("isAutoRecIn") Integer isAutoRecIn,
      @Param("enabledStatus") Integer enabledStatus,
      @Param("salConInDepotId") Long salConInDepotId,
      @Param("salRetOutDepotId") Long salRetOutDepotId,
      @Param("orgId") Long orgId) {
    BasOrgCus obj = BasOrgCus.toExample();
    obj.setInvLimitAmt(invLimitAmt);
    obj.setIsInvLimitAmt(isInvLimitAmt);
    obj.setCheckMinAmt(checkMinAmt);
    obj.setIsOrderCheck(isOrderCheck);
    obj.setIsReturnCheck(isReturnCheck);
    obj.setReturnDealType(returnDealType);
    obj.setIsModifyPrice(isModifyPrice);
    obj.setIsModifyCheck(isModifyCheck);
    obj.setIsCusInv(isCusInv);
    obj.setIsAllotCheck(isAllotCheck);
    obj.setIsClosed(isClosed);
    obj.setIsOrderPaused(isOrderPaused);
    obj.setShopOwnerName(shopOwnerName);
    obj.setShopOwnerPhone(shopOwnerPhone);
    obj.setOpeningDate(openingDate);
    obj.setIsOuterLeague(isOuterLeague);
    obj.setIsAutoRecIn(isAutoRecIn);
    obj.setEnabledStatus(enabledStatus);
    obj.setSalConInDepotId(salConInDepotId);
    obj.setSalRetOutDepotId(salRetOutDepotId);
    obj.setOrgId(orgId);
    Example<BasOrgCus> example = Example.of(obj);
    return findAll(example, null).map(BasOrgCus.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<BasOrgCusDTO> findByExample(
      @Param("example") BasOrgCus example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(BasOrgCus.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgCusDTO> findByExample(@Param("example") BasOrgCus example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(BasOrgCus.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<BasOrgCusDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable).map(BasOrgCus.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgCusDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(BasOrgCus.DTO_CONVERTER)
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
  public Page<BasOrgCusDTO> findByFuzzySearch(
      @Param("example") BasOrgCus example,
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
    return findAll(Example.of(example, matcher), pageable).map(BasOrgCus.DTO_CONVERTER);
  }

  @Override
  public Page<BasOrgCusDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    BasOrgCus example = BasOrgCus.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(BasOrgCus.DTO_CONVERTER);
  }

  @Override
  public List<BasOrgCusDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
