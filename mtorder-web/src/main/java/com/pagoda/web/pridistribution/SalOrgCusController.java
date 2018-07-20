package com.pagoda.web.pridistribution;

import com.pagoda.api.*;
import com.pagoda.api.pridistribution.*;
import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.validator.pridistribution.*;

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
import static com.pagoda.api.dto.pridistribution.SalOrgCusDTO.Getters.*;

/**
 * 模型SalOrgCus对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalOrgCusService")
@Slf4j
public class SalOrgCusController implements InitializingBean {
  @Autowired private SalOrgCusService salOrgCusService;

  @Autowired private SalOrgCusValidator salOrgCusValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salOrgCusValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salOrgCusValidator);
    }
  }

  /**
   * 插入一条SalOrgCus记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalOrgCus记录")
  @PostMapping(value = "/create")
  public SalOrgCusDTO create(@Valid @RequestBody SalOrgCusDTO dto) {
    return salOrgCusService.create(dto);
  }

  /**
   * 删除一条SalOrgCus记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalOrgCus记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salOrgCusService.delete(id);
    return true;
  }

  /**
   * 更新一条SalOrgCus记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalOrgCus记录")
  @PostMapping(value = "/update")
  public SalOrgCusDTO update(@RequestBody SalOrgCusDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salOrgCusService.update(dto);
  }

  /**
   * 根据主键查询SalOrgCus记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalOrgCus记录")
  @GetMapping(value = "/getById")
  public SalOrgCusDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salOrgCusService.getById(id);
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
  public Iterable<SalOrgCusDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salOrgCusService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param balCusOrgId
   * @param balCusOrgName
   * @param dualOrgName
   * @param isPickAutoRec
   * @param isPickLimitCon
   * @param billType
   * @param isStoBackPrice
   * @param isCreateBill
   * @param isDefaultCon
   * @param isDefaultAllot
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param balOrgId
   * @param balOrgName
   * @param priceCatId
   * @param priceCatCode
   * @param priceCatName
   * @param isEnabled
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalOrgCusDTO> findBy(
      @RequestParam(required = false, value = "balCusOrgId") Long balCusOrgId,
      @RequestParam(required = false, value = "balCusOrgName") String balCusOrgName,
      @RequestParam(required = false, value = "dualOrgName") String dualOrgName,
      @RequestParam(required = false, value = "isPickAutoRec") Integer isPickAutoRec,
      @RequestParam(required = false, value = "isPickLimitCon") Integer isPickLimitCon,
      @RequestParam(required = false, value = "billType") Integer billType,
      @RequestParam(required = false, value = "isStoBackPrice") Integer isStoBackPrice,
      @RequestParam(required = false, value = "isCreateBill") Integer isCreateBill,
      @RequestParam(required = false, value = "isDefaultCon") Integer isDefaultCon,
      @RequestParam(required = false, value = "isDefaultAllot") Integer isDefaultAllot,
      @RequestParam(required = false, value = "cusOrgId") Long cusOrgId,
      @RequestParam(required = false, value = "cusOrgCode") String cusOrgCode,
      @RequestParam(required = false, value = "cusOrgName") String cusOrgName,
      @RequestParam(required = false, value = "orgOrgId") Long orgOrgId,
      @RequestParam(required = false, value = "orgOrgCode") String orgOrgCode,
      @RequestParam(required = false, value = "orgOrgName") String orgOrgName,
      @RequestParam(required = false, value = "balOrgId") Long balOrgId,
      @RequestParam(required = false, value = "balOrgName") String balOrgName,
      @RequestParam(required = false, value = "priceCatId") Long priceCatId,
      @RequestParam(required = false, value = "priceCatCode") String priceCatCode,
      @RequestParam(required = false, value = "priceCatName") String priceCatName,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salOrgCusService.findBy(
        balCusOrgId,
        balCusOrgName,
        dualOrgName,
        isPickAutoRec,
        isPickLimitCon,
        billType,
        isStoBackPrice,
        isCreateBill,
        isDefaultCon,
        isDefaultAllot,
        cusOrgId,
        cusOrgCode,
        cusOrgName,
        orgOrgId,
        orgOrgCode,
        orgOrgName,
        balOrgId,
        balOrgName,
        priceCatId,
        priceCatCode,
        priceCatName,
        isEnabled,
        entId,
        pageable);
  }
}
