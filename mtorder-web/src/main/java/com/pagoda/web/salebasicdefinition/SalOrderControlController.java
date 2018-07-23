package com.pagoda.web.salebasicdefinition;

import com.pagoda.api.*;
import com.pagoda.api.salebasicdefinition.*;
import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.validator.salebasicdefinition.*;

import io.micrometer.core.annotation.*;
import io.swagger.annotations.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.*;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import static com.pagoda.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.api.dto.salebasicdefinition.SalOrderControlDTO.Getters.*;

/**
 * 模型SalOrderControl对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalOrderControlService")
@Slf4j
public class SalOrderControlController implements InitializingBean {
  @Autowired private SalOrderControlService salOrderControlService;

  @Autowired private SalOrderControlValidator salOrderControlValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salOrderControlValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salOrderControlValidator);
    }
  }

  /**
   * 插入一条SalOrderControl记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalOrderControl记录")
  @PostMapping(value = "/create")
  public SalOrderControlDTO create(@Valid @RequestBody SalOrderControlDTO dto) {
    return salOrderControlService.create(dto);
  }

  /**
   * 删除一条SalOrderControl记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalOrderControl记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salOrderControlService.delete(id);
    return true;
  }

  /**
   * 更新一条SalOrderControl记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalOrderControl记录")
  @PostMapping(value = "/update")
  public SalOrderControlDTO update(@RequestBody SalOrderControlDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salOrderControlService.update(dto);
  }

  /**
   * 根据主键查询SalOrderControl记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalOrderControl记录")
  @GetMapping(value = "/getById")
  public SalOrderControlDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salOrderControlService.getById(id);
  }

  /**
   * 根据主键批量查询{entity.upperCaseName}}记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @ApiOperation(value = "batchGetByIds", notes = "根据主键批量查询{entity.upperCaseName}}记录，不分页")
  @GetMapping(value = "/batchGetByIds")
  public Iterable<SalOrderControlDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salOrderControlService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param isCtrlDep
   * @param beforeDays
   * @param allowPosGapD
   * @param allowPosGapM
   * @param isDepInput
   * @param isAccnt
   * @param isDuty
   * @param isVrfyTrans
   * @param isDistCyc
   * @param isMustSell
   * @param isRouteSplit
   * @param isSafetyStock
   * @param safetyStockMultiple
   * @param isExeBatchPolicy
   * @param isOneOrder
   * @param beginOrderTime
   * @param endOrderTime
   * @param isCtrlReturn
   * @param beginReturnTime
   * @param endReturnTime
   * @param isEnabled
   * @param remark
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalOrderControlDTO> findBy(
      @RequestParam(required = false, value = "cusOrgId") Long cusOrgId,
      @RequestParam(required = false, value = "cusOrgCode") String cusOrgCode,
      @RequestParam(required = false, value = "cusOrgName") String cusOrgName,
      @RequestParam(required = false, value = "isCtrlDep") Integer isCtrlDep,
      @RequestParam(required = false, value = "beforeDays") Integer beforeDays,
      @RequestParam(required = false, value = "allowPosGapD") Integer allowPosGapD,
      @RequestParam(required = false, value = "allowPosGapM") Integer allowPosGapM,
      @RequestParam(required = false, value = "isDepInput") Integer isDepInput,
      @RequestParam(required = false, value = "isAccnt") Integer isAccnt,
      @RequestParam(required = false, value = "isDuty") Integer isDuty,
      @RequestParam(required = false, value = "isVrfyTrans") Integer isVrfyTrans,
      @RequestParam(required = false, value = "isDistCyc") Integer isDistCyc,
      @RequestParam(required = false, value = "isMustSell") Integer isMustSell,
      @RequestParam(required = false, value = "isRouteSplit") Integer isRouteSplit,
      @RequestParam(required = false, value = "isSafetyStock") Integer isSafetyStock,
      @RequestParam(required = false, value = "safetyStockMultiple")
          java.math.BigDecimal safetyStockMultiple,
      @RequestParam(required = false, value = "isExeBatchPolicy") Integer isExeBatchPolicy,
      @RequestParam(required = false, value = "isOneOrder") Integer isOneOrder,
      @RequestParam(required = false, value = "beginOrderTime") java.util.Date beginOrderTime,
      @RequestParam(required = false, value = "endOrderTime") java.util.Date endOrderTime,
      @RequestParam(required = false, value = "isCtrlReturn") Integer isCtrlReturn,
      @RequestParam(required = false, value = "beginReturnTime") java.util.Date beginReturnTime,
      @RequestParam(required = false, value = "endReturnTime") java.util.Date endReturnTime,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salOrderControlService.findBy(
        cusOrgId,
        cusOrgCode,
        cusOrgName,
        isCtrlDep,
        beforeDays,
        allowPosGapD,
        allowPosGapM,
        isDepInput,
        isAccnt,
        isDuty,
        isVrfyTrans,
        isDistCyc,
        isMustSell,
        isRouteSplit,
        isSafetyStock,
        safetyStockMultiple,
        isExeBatchPolicy,
        isOneOrder,
        beginOrderTime,
        endOrderTime,
        isCtrlReturn,
        beginReturnTime,
        endReturnTime,
        isEnabled,
        remark,
        entId,
        pageable);
  }
}
