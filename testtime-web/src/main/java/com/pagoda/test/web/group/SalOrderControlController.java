package com.pagoda.test.web.group;

import com.pagoda.test.api.*;
import com.pagoda.test.api.group.*;
import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.validator.group.*;

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

import static com.pagoda.test.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.test.api.dto.group.SalOrderControlDTO.Getters.*;

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
   * @param isCtrlDepInput
   * @param isCtrlAccnt
   * @param isCtrlDuty
   * @param isCtrlVrfyTrans
   * @param isCtrlDistCyc
   * @param isCtrlMustSell
   * @param isCtrlRouteSplit
   * @param isCtrlSafetyStock
   * @param allowSafetyStockTimes
   * @param isCtrlExeBatchPolicy
   * @param isCtrlOneOrder
   * @param placeOrderTime1
   * @param placeOrderTime2
   * @param isCtrlReturn
   * @param returnGoodsTime1
   * @param returnGoodsTime2
   * @param enabled
   * @param remark
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
      @RequestParam(required = false, value = "isCtrlDepInput") Integer isCtrlDepInput,
      @RequestParam(required = false, value = "isCtrlAccnt") Integer isCtrlAccnt,
      @RequestParam(required = false, value = "isCtrlDuty") Integer isCtrlDuty,
      @RequestParam(required = false, value = "isCtrlVrfyTrans") Integer isCtrlVrfyTrans,
      @RequestParam(required = false, value = "isCtrlDistCyc") Integer isCtrlDistCyc,
      @RequestParam(required = false, value = "isCtrlMustSell") Integer isCtrlMustSell,
      @RequestParam(required = false, value = "isCtrlRouteSplit") Integer isCtrlRouteSplit,
      @RequestParam(required = false, value = "isCtrlSafetyStock") Integer isCtrlSafetyStock,
      @RequestParam(required = false, value = "allowSafetyStockTimes")
          java.math.BigDecimal allowSafetyStockTimes,
      @RequestParam(required = false, value = "isCtrlExeBatchPolicy") Integer isCtrlExeBatchPolicy,
      @RequestParam(required = false, value = "isCtrlOneOrder") Integer isCtrlOneOrder,
      @RequestParam(required = false, value = "placeOrderTime1") java.sql.Time placeOrderTime1,
      @RequestParam(required = false, value = "placeOrderTime2") java.sql.Time placeOrderTime2,
      @RequestParam(required = false, value = "isCtrlReturn") Integer isCtrlReturn,
      @RequestParam(required = false, value = "returnGoodsTime1") java.sql.Time returnGoodsTime1,
      @RequestParam(required = false, value = "returnGoodsTime2") java.sql.Time returnGoodsTime2,
      @RequestParam(required = false, value = "enabled") Integer enabled,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salOrderControlService.findBy(
        cusOrgId,
        cusOrgCode,
        cusOrgName,
        isCtrlDep,
        beforeDays,
        allowPosGapD,
        allowPosGapM,
        isCtrlDepInput,
        isCtrlAccnt,
        isCtrlDuty,
        isCtrlVrfyTrans,
        isCtrlDistCyc,
        isCtrlMustSell,
        isCtrlRouteSplit,
        isCtrlSafetyStock,
        allowSafetyStockTimes,
        isCtrlExeBatchPolicy,
        isCtrlOneOrder,
        placeOrderTime1,
        placeOrderTime2,
        isCtrlReturn,
        returnGoodsTime1,
        returnGoodsTime2,
        enabled,
        remark,
        pageable);
  }
}
