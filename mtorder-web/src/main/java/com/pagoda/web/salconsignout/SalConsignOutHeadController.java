package com.pagoda.web.salconsignout;

import com.pagoda.api.*;
import com.pagoda.api.salconsignout.*;
import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.validator.salconsignout.*;

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
import static com.pagoda.api.dto.salconsignout.SalConsignOutHeadDTO.Getters.*;

/**
 * 模型SalConsignOutHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalConsignOutHeadService")
@Slf4j
public class SalConsignOutHeadController implements InitializingBean {
  @Autowired private SalConsignOutHeadService salConsignOutHeadService;

  @Autowired private SalConsignOutHeadValidator salConsignOutHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salConsignOutHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salConsignOutHeadValidator);
    }
  }

  /**
   * 插入一条SalConsignOutHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalConsignOutHead记录")
  @PostMapping(value = "/create")
  public SalConsignOutHeadDTO create(@Valid @RequestBody SalConsignOutHeadDTO dto) {
    return salConsignOutHeadService.create(dto);
  }

  /**
   * 删除一条SalConsignOutHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalConsignOutHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salConsignOutHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条SalConsignOutHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalConsignOutHead记录")
  @PostMapping(value = "/update")
  public SalConsignOutHeadDTO update(@RequestBody SalConsignOutHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salConsignOutHeadService.update(dto);
  }

  /**
   * 根据主键查询SalConsignOutHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalConsignOutHead记录")
  @GetMapping(value = "/getById")
  public SalConsignOutHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salConsignOutHeadService.getById(id);
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
  public Iterable<SalConsignOutHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salConsignOutHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param seqno
   * @param entId
   * @param conId
   * @param conSeqno
   * @param preArrivalDate
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param transitLineNo
   * @param shippedQty
   * @param shippedGrossWeight
   * @param shippedNetWeight
   * @param shippedVolume
   * @param shippedAmt
   * @param taxAmt
   * @param stockoutStatus
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param remark
   * @param confirmUserCode
   * @param confirmUserName
   * @param confirmTime
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalConsignOutHeadDTO> findBy(
      @RequestParam(required = false, value = "seqno") String seqno,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "conId") Long conId,
      @RequestParam(required = false, value = "conSeqno") String conSeqno,
      @RequestParam(required = false, value = "preArrivalDate") java.util.Date preArrivalDate,
      @RequestParam(required = false, value = "conOrgId") Long conOrgId,
      @RequestParam(required = false, value = "conOrgCode") String conOrgCode,
      @RequestParam(required = false, value = "conOrgName") String conOrgName,
      @RequestParam(required = false, value = "cusOrgId") Long cusOrgId,
      @RequestParam(required = false, value = "cusOrgCode") String cusOrgCode,
      @RequestParam(required = false, value = "cusOrgName") String cusOrgName,
      @RequestParam(required = false, value = "transitLineNo") String transitLineNo,
      @RequestParam(required = false, value = "shippedQty") java.math.BigDecimal shippedQty,
      @RequestParam(required = false, value = "shippedGrossWeight")
          java.math.BigDecimal shippedGrossWeight,
      @RequestParam(required = false, value = "shippedNetWeight")
          java.math.BigDecimal shippedNetWeight,
      @RequestParam(required = false, value = "shippedVolume") java.math.BigDecimal shippedVolume,
      @RequestParam(required = false, value = "shippedAmt") java.math.BigDecimal shippedAmt,
      @RequestParam(required = false, value = "taxAmt") java.math.BigDecimal taxAmt,
      @RequestParam(required = false, value = "stockoutStatus") Integer stockoutStatus,
      @RequestParam(required = false, value = "auditorCode") String auditorCode,
      @RequestParam(required = false, value = "auditorName") String auditorName,
      @RequestParam(required = false, value = "auditTime") java.util.Date auditTime,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "confirmUserCode") String confirmUserCode,
      @RequestParam(required = false, value = "confirmUserName") String confirmUserName,
      @RequestParam(required = false, value = "confirmTime") java.util.Date confirmTime,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salConsignOutHeadService.findBy(
        seqno,
        entId,
        conId,
        conSeqno,
        preArrivalDate,
        conOrgId,
        conOrgCode,
        conOrgName,
        cusOrgId,
        cusOrgCode,
        cusOrgName,
        transitLineNo,
        shippedQty,
        shippedGrossWeight,
        shippedNetWeight,
        shippedVolume,
        shippedAmt,
        taxAmt,
        stockoutStatus,
        auditorCode,
        auditorName,
        auditTime,
        remark,
        confirmUserCode,
        confirmUserName,
        confirmTime,
        pageable);
  }
}
