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
 * 模型SalConsignHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalConsignHeadService")
@Slf4j
public class SalConsignHeadController {
  @Autowired private SalConsignHeadService salConsignHeadService;

  @Autowired private SalConsignHeadValidator salConsignHeadValidator;

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
  @PostMapping(value = "/update")
  public SalConsignHeadDTO update(@RequestBody SalConsignHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salConsignHeadService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public SalConsignHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salConsignHeadService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
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
   * @param conOrgCode
   * @param conOrgId
   * @param conOrgName
   * @param conStatus
   * @param cusOrgCode
   * @param cusOrgId
   * @param cusOrgName
   * @param entryDate
   * @param no
   * @param orderId
   * @param orderNo
   * @param preArrivalDate
   * @param printCount
   * @param printStatus
   * @param shippedAmt
   * @param shippedQty
   * @param tatalQty
   * @param taxAmt
   * @param totalAmt
   * @param totalWeight
   * @param transitLineNo
   * @param waveNo
   * @param active
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<SalConsignHeadDTO> findBy(
      @RequestParam(required = false, value = "conOrgCode") String conOrgCode,
      @RequestParam(required = false, value = "conOrgId") Long conOrgId,
      @RequestParam(required = false, value = "conOrgName") String conOrgName,
      @RequestParam(required = false, value = "conStatus") Integer conStatus,
      @RequestParam(required = false, value = "cusOrgCode") String cusOrgCode,
      @RequestParam(required = false, value = "cusOrgId") Long cusOrgId,
      @RequestParam(required = false, value = "cusOrgName") String cusOrgName,
      @RequestParam(required = false, value = "entryDate") java.sql.Timestamp entryDate,
      @RequestParam(required = false, value = "no") String no,
      @RequestParam(required = false, value = "orderId") Long orderId,
      @RequestParam(required = false, value = "orderNo") String orderNo,
      @RequestParam(required = false, value = "preArrivalDate") java.util.Date preArrivalDate,
      @RequestParam(required = false, value = "printCount") Integer printCount,
      @RequestParam(required = false, value = "printStatus") Integer printStatus,
      @RequestParam(required = false, value = "shippedAmt") java.math.BigDecimal shippedAmt,
      @RequestParam(required = false, value = "shippedQty") java.math.BigDecimal shippedQty,
      @RequestParam(required = false, value = "tatalQty") java.math.BigDecimal tatalQty,
      @RequestParam(required = false, value = "taxAmt") java.math.BigDecimal taxAmt,
      @RequestParam(required = false, value = "totalAmt") java.math.BigDecimal totalAmt,
      @RequestParam(required = false, value = "totalWeight") java.math.BigDecimal totalWeight,
      @RequestParam(required = false, value = "transitLineNo") String transitLineNo,
      @RequestParam(required = false, value = "waveNo") String waveNo,
      @RequestParam(required = false, value = "active") Boolean active,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salConsignHeadService.findBy(
        conOrgCode,
        conOrgId,
        conOrgName,
        conStatus,
        cusOrgCode,
        cusOrgId,
        cusOrgName,
        entryDate,
        no,
        orderId,
        orderNo,
        preArrivalDate,
        printCount,
        printStatus,
        shippedAmt,
        shippedQty,
        tatalQty,
        taxAmt,
        totalAmt,
        totalWeight,
        transitLineNo,
        waveNo,
        active,
        pageable);
  }
}
