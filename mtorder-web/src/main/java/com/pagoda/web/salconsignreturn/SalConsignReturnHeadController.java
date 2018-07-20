package com.pagoda.web.salconsignreturn;

import com.pagoda.api.*;
import com.pagoda.api.salconsignreturn.*;
import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.validator.salconsignreturn.*;

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
import static com.pagoda.api.dto.salconsignreturn.SalConsignReturnHeadDTO.Getters.*;

/**
 * 模型SalConsignReturnHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalConsignReturnHeadService")
@Slf4j
public class SalConsignReturnHeadController implements InitializingBean {
  @Autowired private SalConsignReturnHeadService salConsignReturnHeadService;

  @Autowired private SalConsignReturnHeadValidator salConsignReturnHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salConsignReturnHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salConsignReturnHeadValidator);
    }
  }

  /**
   * 插入一条SalConsignReturnHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalConsignReturnHead记录")
  @PostMapping(value = "/create")
  public SalConsignReturnHeadDTO create(@Valid @RequestBody SalConsignReturnHeadDTO dto) {
    return salConsignReturnHeadService.create(dto);
  }

  /**
   * 删除一条SalConsignReturnHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalConsignReturnHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salConsignReturnHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条SalConsignReturnHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalConsignReturnHead记录")
  @PostMapping(value = "/update")
  public SalConsignReturnHeadDTO update(@RequestBody SalConsignReturnHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salConsignReturnHeadService.update(dto);
  }

  /**
   * 根据主键查询SalConsignReturnHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalConsignReturnHead记录")
  @GetMapping(value = "/getById")
  public SalConsignReturnHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salConsignReturnHeadService.getById(id);
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
  public Iterable<SalConsignReturnHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salConsignReturnHeadService.batchGetByIds(idList);
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
   * @param arrOrgId
   * @param arrOrgCode
   * @param arrOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param returnType
   * @param returnDate
   * @param returnQty
   * @param transitLineNo
   * @param stockinQty
   * @param stockinGrossWeight
   * @param stockinNetWeight
   * @param totalTaxAmt
   * @param totalReturnAmt
   * @param totalStockinAmt
   * @param status
   * @param printCount
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param remark
   * @param note
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalConsignReturnHeadDTO> findBy(
      @RequestParam(required = false, value = "seqno") String seqno,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "arrOrgId") Long arrOrgId,
      @RequestParam(required = false, value = "arrOrgCode") String arrOrgCode,
      @RequestParam(required = false, value = "arrOrgName") String arrOrgName,
      @RequestParam(required = false, value = "cusOrgId") Long cusOrgId,
      @RequestParam(required = false, value = "cusOrgCode") String cusOrgCode,
      @RequestParam(required = false, value = "cusOrgName") String cusOrgName,
      @RequestParam(required = false, value = "returnType") Integer returnType,
      @RequestParam(required = false, value = "returnDate") java.util.Date returnDate,
      @RequestParam(required = false, value = "returnQty") java.math.BigDecimal returnQty,
      @RequestParam(required = false, value = "transitLineNo") String transitLineNo,
      @RequestParam(required = false, value = "stockinQty") java.math.BigDecimal stockinQty,
      @RequestParam(required = false, value = "stockinGrossWeight")
          java.math.BigDecimal stockinGrossWeight,
      @RequestParam(required = false, value = "stockinNetWeight")
          java.math.BigDecimal stockinNetWeight,
      @RequestParam(required = false, value = "totalTaxAmt") java.math.BigDecimal totalTaxAmt,
      @RequestParam(required = false, value = "totalReturnAmt") java.math.BigDecimal totalReturnAmt,
      @RequestParam(required = false, value = "totalStockinAmt")
          java.math.BigDecimal totalStockinAmt,
      @RequestParam(required = false, value = "status") Integer status,
      @RequestParam(required = false, value = "printCount") Integer printCount,
      @RequestParam(required = false, value = "auditorCode") String auditorCode,
      @RequestParam(required = false, value = "auditorName") String auditorName,
      @RequestParam(required = false, value = "auditTime") java.util.Date auditTime,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "note") String note,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salConsignReturnHeadService.findBy(
        seqno,
        entId,
        arrOrgId,
        arrOrgCode,
        arrOrgName,
        cusOrgId,
        cusOrgCode,
        cusOrgName,
        returnType,
        returnDate,
        returnQty,
        transitLineNo,
        stockinQty,
        stockinGrossWeight,
        stockinNetWeight,
        totalTaxAmt,
        totalReturnAmt,
        totalStockinAmt,
        status,
        printCount,
        auditorCode,
        auditorName,
        auditTime,
        remark,
        note,
        pageable);
  }
}
