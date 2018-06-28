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
   * @param orgId
   * @param phone
   * @param searchWord
   * @param stoCurrentPeriod
   * @param turnDateTime
   * @param turnUserCode
   * @param turnUserName
   * @param createDateTime
   * @param createOrgCode
   * @param createUserCode
   * @param createUserName
   * @param delId
   * @param depotAddress
   * @param depotPhone
   * @param orgCode
   * @param orgName
   * @param updateDateTime
   * @param updateOrgCode
   * @param updateUserCode
   * @param updateUserName
   * @param code
   * @param entId
   * @param isEnabled
   * @param name
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
   * @param orgId
   * @param phone
   * @param searchWord
   * @param stoCurrentPeriod
   * @param turnDateTime
   * @param turnUserCode
   * @param turnUserName
   * @param createDateTime
   * @param createOrgCode
   * @param createUserCode
   * @param createUserName
   * @param delId
   * @param depotAddress
   * @param depotPhone
   * @param orgCode
   * @param orgName
   * @param updateDateTime
   * @param updateOrgCode
   * @param updateUserCode
   * @param updateUserName
   * @param code
   * @param entId
   * @param isEnabled
   * @param name
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
      @Param("name") String name);

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
   * @return
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  List<InvDepotDTO> findByField(@Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException;
}
