package com.pagoda.repo.group.custom;

import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

/**
 * InvDepot扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface InvDepotRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param adCode
   * @param adLat
   * @param adLng
   * @param address
   * @param balOrgId
   * @param currentPeriod
   * @param depotCenterId
   * @param isAllowInvOut
   * @param isAllowPostReturn
   * @param isCheckByAdd
   * @param isCheckByNegative
   * @param isCheckByPost
   * @param isCheckInputNeedCheck
   * @param isCheckQtyZero
   * @param isCheckShowFinQty
   * @param isDualDepot
   * @param isPickAllocation
   * @param isPostCheckAll
   * @param isPostDaily
   * @param isPostDailyDetail
   * @param isPurRecIn
   * @param isPurRetOut
   * @param isSalConIn
   * @param isSalConOut
   * @param isSalRetIn
   * @param isSalRetOut
   * @param isStoEnabled
   * @param isTurnExistNoPost
   * @param manageType
   * @param measureType
   * @param phone
   * @param stoCurrentPeriod
   * @param turnDateTime
   * @param turnUserCode
   * @param turnUserName
   * @param active
   * @param code
   * @param enabled
   * @param entId
   * @param name
   * @param orgId
   * @param searchWord
   * @param pageable
   * @return
   */
  Page<InvDepotDTO> findBy(
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
      @Param("phone") String phone,
      @Param("stoCurrentPeriod") Integer stoCurrentPeriod,
      @Param("turnDateTime") java.sql.Timestamp turnDateTime,
      @Param("turnUserCode") String turnUserCode,
      @Param("turnUserName") String turnUserName,
      @Param("active") Boolean active,
      @Param("code") String code,
      @Param("enabled") Boolean enabled,
      @Param("entId") Long entId,
      @Param("name") String name,
      @Param("orgId") Long orgId,
      @Param("searchWord") String searchWord,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param adCode
   * @param adLat
   * @param adLng
   * @param address
   * @param balOrgId
   * @param currentPeriod
   * @param depotCenterId
   * @param isAllowInvOut
   * @param isAllowPostReturn
   * @param isCheckByAdd
   * @param isCheckByNegative
   * @param isCheckByPost
   * @param isCheckInputNeedCheck
   * @param isCheckQtyZero
   * @param isCheckShowFinQty
   * @param isDualDepot
   * @param isPickAllocation
   * @param isPostCheckAll
   * @param isPostDaily
   * @param isPostDailyDetail
   * @param isPurRecIn
   * @param isPurRetOut
   * @param isSalConIn
   * @param isSalConOut
   * @param isSalRetIn
   * @param isSalRetOut
   * @param isStoEnabled
   * @param isTurnExistNoPost
   * @param manageType
   * @param measureType
   * @param phone
   * @param stoCurrentPeriod
   * @param turnDateTime
   * @param turnUserCode
   * @param turnUserName
   * @param active
   * @param code
   * @param enabled
   * @param entId
   * @param name
   * @param orgId
   * @param searchWord
   * @return
   */
  List<InvDepotDTO> findBy(
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
      @Param("phone") String phone,
      @Param("stoCurrentPeriod") Integer stoCurrentPeriod,
      @Param("turnDateTime") java.sql.Timestamp turnDateTime,
      @Param("turnUserCode") String turnUserCode,
      @Param("turnUserName") String turnUserName,
      @Param("active") Boolean active,
      @Param("code") String code,
      @Param("enabled") Boolean enabled,
      @Param("entId") Long entId,
      @Param("name") String name,
      @Param("orgId") Long orgId,
      @Param("searchWord") String searchWord);

  /**
   * 通用分页查询，用于后台查询
   *
   * @param example
   * @param pageable
   * @return
   */
  Page<InvDepotDTO> findByExample(
      @Param("example") InvDepot example, @Param("pageable") Pageable pageable);

  /**
   * 通用查询，用于后台查询
   *
   * @param example
   * @return
   */
  List<InvDepotDTO> findByExample(@Param("example") InvDepot example);

  /**
   * 复杂条件分页查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  Page<InvDepotDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable);

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @return
   */
  List<InvDepotDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder);

  /**
   * 复杂条件更新
   *
   * @param builder
   * @return
   */
  // int updateByBuilder(@Param("builder") JpaUpdateBuilder builder);

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
  Page<InvDepotDTO> findByFuzzySearch(
      @Param("example") InvDepot example,
      @Param("fields") List<String> fields,
      @Param("stringMatcher") ExampleMatcher.StringMatcher stringMatcher,
      @Param("pageable") Pageable pageable);

  /**
   * 查询某个字段的取值查询一组对象，通常用于查询匹配父表主键id的一组对象
   *
   * @param fieldName 模型字段名字（表字段，通常是外键，与父表的主键id匹配）
   * @param value 字段取值
   * @param pageable
   * @return
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  Page<InvDepotDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException;

  /**
   * 查询某个字段的取值查询一组对象，通常用于查询匹配父表主键id的一组对象
   *
   * @param fieldName 模型字段名字（表字段，通常是外键，与父表的主键id匹配）
   * @param value 字段取值
   * @param pageable
   * @return
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  List<InvDepotDTO> findByField(@Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
