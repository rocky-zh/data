package com.pagoda.web.group;

import com.pagoda.api.*;
import com.pagoda.api.group.*;
import com.pagoda.api.dto.group.*;
import com.pagoda.validator.group.*;

import io.micrometer.core.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;

/**
 * 模型InvDepot对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/InvDepotService")
@Slf4j
public class InvDepotController {
  @Autowired private InvDepotService invDepotService;

  @Autowired private InvDepotValidator invDepotValidator;

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (invDepotValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(invDepotValidator);
    }
  }

  /**
   * 插入一条InvDepot记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public InvDepotDTO create(@Valid @RequestBody InvDepotDTO dto) {
    return invDepotService.create(dto);
  }

  /**
   * 删除一条InvDepot记录
   *
   * @param id
   * @return
   */
  @Timed
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    invDepotService.delete(id);
    return true;
  }

  /**
   * 更新一条InvDepot记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/update")
  public InvDepotDTO update(@RequestBody InvDepotDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return invDepotService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public InvDepotDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return invDepotService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @GetMapping(value = "/batchGetByIds")
  public Iterable<InvDepotDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return invDepotService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param active
   * @param adCode
   * @param adLat
   * @param adLng
   * @param address
   * @param balOrgId
   * @param code
   * @param currentPeriod
   * @param depotCenterId
   * @param enabled
   * @param isAllowInvOut
   * @param isAllowPostReturn
   * @param isCheckByAdd
   * @param isCheckByNegative
   * @param isCheckByPost
   * @param isCheckInputNeedCheck
   * @param isCheckQtyZero
   * @param isCheckShowFinQty
   * @param isDualDepot
   * @param isEnabled
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
   * @param name
   * @param orgId
   * @param phone
   * @param searchWord
   * @param stoCurrentPeriod
   * @param turnDateTime
   * @param turnUserCode
   * @param turnUserName
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<InvDepotDTO> findBy(
      @RequestParam(required = false, value = "active") Boolean active,
      @RequestParam(required = false, value = "adCode") String adCode,
      @RequestParam(required = false, value = "adLat") String adLat,
      @RequestParam(required = false, value = "adLng") String adLng,
      @RequestParam(required = false, value = "address") String address,
      @RequestParam(required = false, value = "balOrgId") Long balOrgId,
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "currentPeriod") String currentPeriod,
      @RequestParam(required = false, value = "depotCenterId") Integer depotCenterId,
      @RequestParam(required = false, value = "enabled") Boolean enabled,
      @RequestParam(required = false, value = "isAllowInvOut") Integer isAllowInvOut,
      @RequestParam(required = false, value = "isAllowPostReturn") Integer isAllowPostReturn,
      @RequestParam(required = false, value = "isCheckByAdd") Integer isCheckByAdd,
      @RequestParam(required = false, value = "isCheckByNegative") Integer isCheckByNegative,
      @RequestParam(required = false, value = "isCheckByPost") Integer isCheckByPost,
      @RequestParam(required = false, value = "isCheckInputNeedCheck")
          Integer isCheckInputNeedCheck,
      @RequestParam(required = false, value = "isCheckQtyZero") Integer isCheckQtyZero,
      @RequestParam(required = false, value = "isCheckShowFinQty") Integer isCheckShowFinQty,
      @RequestParam(required = false, value = "isDualDepot") Integer isDualDepot,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "isPickAllocation") Integer isPickAllocation,
      @RequestParam(required = false, value = "isPostCheckAll") Integer isPostCheckAll,
      @RequestParam(required = false, value = "isPostDaily") Integer isPostDaily,
      @RequestParam(required = false, value = "isPostDailyDetail") Integer isPostDailyDetail,
      @RequestParam(required = false, value = "isPurRecIn") Integer isPurRecIn,
      @RequestParam(required = false, value = "isPurRetOut") Integer isPurRetOut,
      @RequestParam(required = false, value = "isSalConIn") Integer isSalConIn,
      @RequestParam(required = false, value = "isSalConOut") Integer isSalConOut,
      @RequestParam(required = false, value = "isSalRetIn") Integer isSalRetIn,
      @RequestParam(required = false, value = "isSalRetOut") Integer isSalRetOut,
      @RequestParam(required = false, value = "isStoEnabled") Integer isStoEnabled,
      @RequestParam(required = false, value = "isTurnExistNoPost") Integer isTurnExistNoPost,
      @RequestParam(required = false, value = "manageType") Integer manageType,
      @RequestParam(required = false, value = "measureType") Integer measureType,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "orgId") Long orgId,
      @RequestParam(required = false, value = "phone") String phone,
      @RequestParam(required = false, value = "searchWord") String searchWord,
      @RequestParam(required = false, value = "stoCurrentPeriod") Integer stoCurrentPeriod,
      @RequestParam(required = false, value = "turnDateTime") java.sql.Timestamp turnDateTime,
      @RequestParam(required = false, value = "turnUserCode") String turnUserCode,
      @RequestParam(required = false, value = "turnUserName") String turnUserName,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return invDepotService.findBy(
        active,
        adCode,
        adLat,
        adLng,
        address,
        balOrgId,
        code,
        currentPeriod,
        depotCenterId,
        enabled,
        isAllowInvOut,
        isAllowPostReturn,
        isCheckByAdd,
        isCheckByNegative,
        isCheckByPost,
        isCheckInputNeedCheck,
        isCheckQtyZero,
        isCheckShowFinQty,
        isDualDepot,
        isEnabled,
        isPickAllocation,
        isPostCheckAll,
        isPostDaily,
        isPostDailyDetail,
        isPurRecIn,
        isPurRetOut,
        isSalConIn,
        isSalConOut,
        isSalRetIn,
        isSalRetOut,
        isStoEnabled,
        isTurnExistNoPost,
        manageType,
        measureType,
        name,
        orgId,
        phone,
        searchWord,
        stoCurrentPeriod,
        turnDateTime,
        turnUserCode,
        turnUserName,
        pageable);
  }
}
