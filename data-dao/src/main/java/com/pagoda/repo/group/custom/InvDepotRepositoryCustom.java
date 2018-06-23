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
   * @param active
   * @param ad_code
   * @param ad_lat
   * @param ad_lng
   * @param address
   * @param bal_org_id
   * @param code
   * @param current_period
   * @param depot_center_id
   * @param enabled
   * @param is_allow_inv_out
   * @param is_allow_post_return
   * @param is_check_by_add
   * @param is_check_by_negative
   * @param is_check_by_post
   * @param is_check_input_need_check
   * @param is_check_qty_zero
   * @param is_check_show_fin_qty
   * @param is_dual_depot
   * @param is_enabled
   * @param is_pick_allocation
   * @param is_post_check_all
   * @param is_post_daily
   * @param is_post_daily_detail
   * @param is_pur_rec_in
   * @param is_pur_ret_out
   * @param is_sal_con_in
   * @param is_sal_con_out
   * @param is_sal_ret_in
   * @param is_sal_ret_out
   * @param is_sto_enabled
   * @param is_turn_exist_no_post
   * @param manage_type
   * @param measure_type
   * @param name
   * @param org_id
   * @param phone
   * @param search_word
   * @param sto_current_period
   * @param turn_date_time
   * @param turn_user_code
   * @param turn_user_name
   * @param pageable
   * @return
   */
  Page<InvDepotDTO> findBy(
      @Param("active") Boolean active,
      @Param("adCode") String adCode,
      @Param("adLat") String adLat,
      @Param("adLng") String adLng,
      @Param("address") String address,
      @Param("balOrgId") Long balOrgId,
      @Param("code") String code,
      @Param("currentPeriod") String currentPeriod,
      @Param("depotCenterId") Integer depotCenterId,
      @Param("enabled") Boolean enabled,
      @Param("isAllowInvOut") Integer isAllowInvOut,
      @Param("isAllowPostReturn") Integer isAllowPostReturn,
      @Param("isCheckByAdd") Integer isCheckByAdd,
      @Param("isCheckByNegative") Integer isCheckByNegative,
      @Param("isCheckByPost") Integer isCheckByPost,
      @Param("isCheckInputNeedCheck") Integer isCheckInputNeedCheck,
      @Param("isCheckQtyZero") Integer isCheckQtyZero,
      @Param("isCheckShowFinQty") Integer isCheckShowFinQty,
      @Param("isDualDepot") Integer isDualDepot,
      @Param("isEnabled") Integer isEnabled,
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
      @Param("name") String name,
      @Param("orgId") Long orgId,
      @Param("phone") String phone,
      @Param("searchWord") String searchWord,
      @Param("stoCurrentPeriod") Integer stoCurrentPeriod,
      @Param("turnDateTime") java.sql.Timestamp turnDateTime,
      @Param("turnUserCode") String turnUserCode,
      @Param("turnUserName") String turnUserName,
      @Param("pageable") Pageable pageable);

  /**
   * 包含所有可查询的字段
   *
   * @param active
   * @param ad_code
   * @param ad_lat
   * @param ad_lng
   * @param address
   * @param bal_org_id
   * @param code
   * @param current_period
   * @param depot_center_id
   * @param enabled
   * @param is_allow_inv_out
   * @param is_allow_post_return
   * @param is_check_by_add
   * @param is_check_by_negative
   * @param is_check_by_post
   * @param is_check_input_need_check
   * @param is_check_qty_zero
   * @param is_check_show_fin_qty
   * @param is_dual_depot
   * @param is_enabled
   * @param is_pick_allocation
   * @param is_post_check_all
   * @param is_post_daily
   * @param is_post_daily_detail
   * @param is_pur_rec_in
   * @param is_pur_ret_out
   * @param is_sal_con_in
   * @param is_sal_con_out
   * @param is_sal_ret_in
   * @param is_sal_ret_out
   * @param is_sto_enabled
   * @param is_turn_exist_no_post
   * @param manage_type
   * @param measure_type
   * @param name
   * @param org_id
   * @param phone
   * @param search_word
   * @param sto_current_period
   * @param turn_date_time
   * @param turn_user_code
   * @param turn_user_name
   * @return
   */
  List<InvDepotDTO> findBy(
      @Param("active") Boolean active,
      @Param("adCode") String adCode,
      @Param("adLat") String adLat,
      @Param("adLng") String adLng,
      @Param("address") String address,
      @Param("balOrgId") Long balOrgId,
      @Param("code") String code,
      @Param("currentPeriod") String currentPeriod,
      @Param("depotCenterId") Integer depotCenterId,
      @Param("enabled") Boolean enabled,
      @Param("isAllowInvOut") Integer isAllowInvOut,
      @Param("isAllowPostReturn") Integer isAllowPostReturn,
      @Param("isCheckByAdd") Integer isCheckByAdd,
      @Param("isCheckByNegative") Integer isCheckByNegative,
      @Param("isCheckByPost") Integer isCheckByPost,
      @Param("isCheckInputNeedCheck") Integer isCheckInputNeedCheck,
      @Param("isCheckQtyZero") Integer isCheckQtyZero,
      @Param("isCheckShowFinQty") Integer isCheckShowFinQty,
      @Param("isDualDepot") Integer isDualDepot,
      @Param("isEnabled") Integer isEnabled,
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
      @Param("name") String name,
      @Param("orgId") Long orgId,
      @Param("phone") String phone,
      @Param("searchWord") String searchWord,
      @Param("stoCurrentPeriod") Integer stoCurrentPeriod,
      @Param("turnDateTime") java.sql.Timestamp turnDateTime,
      @Param("turnUserCode") String turnUserCode,
      @Param("turnUserName") String turnUserName);

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
