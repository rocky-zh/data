package com.pagoda.web.salconsign;

import com.pagoda.api.*;
import com.pagoda.api.salconsign.*;
import com.pagoda.api.dto.salconsign.*;
import com.pagoda.validator.salconsign.*;

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
import static com.pagoda.api.dto.salconsign.SalConsignHeadDTO.Getters.*;

/**
 * 模型SalConsignHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalConsignHeadService")
@Slf4j
public class SalConsignHeadController implements InitializingBean {
  @Autowired private SalConsignHeadService salConsignHeadService;

  @Autowired private SalConsignHeadValidator salConsignHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salConsignHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salConsignHeadValidator);
    }
  }

  /**
   * 插入一条SalConsignHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalConsignHead记录")
  @PostMapping(value = "/create")
  public SalConsignHeadDTO create(@Valid @RequestBody SalConsignHeadDTO dto) {
    return salConsignHeadService.create(dto);
  }

  /**
   * 删除一条SalConsignHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalConsignHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salConsignHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条SalConsignHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalConsignHead记录")
  @PostMapping(value = "/update")
  public SalConsignHeadDTO update(@RequestBody SalConsignHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salConsignHeadService.update(dto);
  }

  /**
   * 根据主键查询SalConsignHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalConsignHead记录")
  @GetMapping(value = "/getById")
  public SalConsignHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salConsignHeadService.getById(id);
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
  public Iterable<SalConsignHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salConsignHeadService.batchGetByIds(idList);
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
   * @param orderId
   * @param orderNo
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param waveNo
   * @param transitLineNo
   * @param taxAmt
   * @param totalAmt
   * @param shippedQty
   * @param shippedAmt
   * @param preArrivalDate
   * @param conStatus
   * @param printStatus
   * @param printCount
   * @param remark
   * @param totalQty
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalConsignHeadDTO> findBy(
      @RequestParam(required = false, value = "seqno") String seqno,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "orderId") Long orderId,
      @RequestParam(required = false, value = "orderNo") String orderNo,
      @RequestParam(required = false, value = "conOrgId") Long conOrgId,
      @RequestParam(required = false, value = "conOrgCode") String conOrgCode,
      @RequestParam(required = false, value = "conOrgName") String conOrgName,
      @RequestParam(required = false, value = "cusOrgId") Long cusOrgId,
      @RequestParam(required = false, value = "cusOrgCode") String cusOrgCode,
      @RequestParam(required = false, value = "cusOrgName") String cusOrgName,
      @RequestParam(required = false, value = "waveNo") String waveNo,
      @RequestParam(required = false, value = "transitLineNo") String transitLineNo,
      @RequestParam(required = false, value = "taxAmt") java.math.BigDecimal taxAmt,
      @RequestParam(required = false, value = "totalAmt") java.math.BigDecimal totalAmt,
      @RequestParam(required = false, value = "shippedQty") java.math.BigDecimal shippedQty,
      @RequestParam(required = false, value = "shippedAmt") java.math.BigDecimal shippedAmt,
      @RequestParam(required = false, value = "preArrivalDate") java.util.Date preArrivalDate,
      @RequestParam(required = false, value = "conStatus") Integer conStatus,
      @RequestParam(required = false, value = "printStatus") Integer printStatus,
      @RequestParam(required = false, value = "printCount") Integer printCount,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "totalQty") java.math.BigDecimal totalQty,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salConsignHeadService.findBy(
        seqno,
        entId,
        orderId,
        orderNo,
        conOrgId,
        conOrgCode,
        conOrgName,
        cusOrgId,
        cusOrgCode,
        cusOrgName,
        waveNo,
        transitLineNo,
        taxAmt,
        totalAmt,
        shippedQty,
        shippedAmt,
        preArrivalDate,
        conStatus,
        printStatus,
        printCount,
        remark,
        totalQty,
        pageable);
  }
}
