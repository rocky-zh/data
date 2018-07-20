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
import static com.pagoda.api.dto.salconsignout.SalConsignOutDetailDTO.Getters.*;

/**
 * 模型SalConsignOutDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalConsignOutDetailService")
@Slf4j
public class SalConsignOutDetailController implements InitializingBean {
  @Autowired private SalConsignOutDetailService salConsignOutDetailService;

  @Autowired private SalConsignOutDetailValidator salConsignOutDetailValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salConsignOutDetailValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salConsignOutDetailValidator);
    }
  }

  /**
   * 插入一条SalConsignOutDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalConsignOutDetail记录")
  @PostMapping(value = "/create")
  public SalConsignOutDetailDTO create(@Valid @RequestBody SalConsignOutDetailDTO dto) {
    return salConsignOutDetailService.create(dto);
  }

  /**
   * 删除一条SalConsignOutDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalConsignOutDetail记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salConsignOutDetailService.delete(id);
    return true;
  }

  /**
   * 更新一条SalConsignOutDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalConsignOutDetail记录")
  @PostMapping(value = "/update")
  public SalConsignOutDetailDTO update(@RequestBody SalConsignOutDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salConsignOutDetailService.update(dto);
  }

  /**
   * 根据主键查询SalConsignOutDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalConsignOutDetail记录")
  @GetMapping(value = "/getById")
  public SalConsignOutDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salConsignOutDetailService.getById(id);
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
  public Iterable<SalConsignOutDetailDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salConsignOutDetailService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param stockoutId
   * @param stockoutSeqno
   * @param conId
   * @param conSeqno
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salUnitId
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param shippedQty
   * @param shippedNetWeight
   * @param shippedGrossWeight
   * @param shippedVolume
   * @param shippedPrice
   * @param shippedAmt
   * @param taxRate
   * @param taxAmt
   * @param shipSeq
   * @param consignTime
   * @param consignerId
   * @param consignerName
   * @param stockoutStatus
   * @param auditTime
   * @param auditorCode
   * @param auditorName
   * @param remark
   * @param note
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalConsignOutDetailDTO> findBy(
      @RequestParam(required = false, value = "stockoutId") Long stockoutId,
      @RequestParam(required = false, value = "stockoutSeqno") String stockoutSeqno,
      @RequestParam(required = false, value = "conId") Long conId,
      @RequestParam(required = false, value = "conSeqno") String conSeqno,
      @RequestParam(required = false, value = "orderId") Long orderId,
      @RequestParam(required = false, value = "orderSeqno") String orderSeqno,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "goodsId") Long goodsId,
      @RequestParam(required = false, value = "goodsCode") String goodsCode,
      @RequestParam(required = false, value = "goodsName") String goodsName,
      @RequestParam(required = false, value = "goodsSpec") String goodsSpec,
      @RequestParam(required = false, value = "salUnitId") Long salUnitId,
      @RequestParam(required = false, value = "salUnitCode") String salUnitCode,
      @RequestParam(required = false, value = "salUnitName") String salUnitName,
      @RequestParam(required = false, value = "salUnitRate") java.math.BigDecimal salUnitRate,
      @RequestParam(required = false, value = "salConOutDepotId") Long salConOutDepotId,
      @RequestParam(required = false, value = "salConOutDepotCode") String salConOutDepotCode,
      @RequestParam(required = false, value = "salConOutDepotName") String salConOutDepotName,
      @RequestParam(required = false, value = "shippedQty") java.math.BigDecimal shippedQty,
      @RequestParam(required = false, value = "shippedNetWeight")
          java.math.BigDecimal shippedNetWeight,
      @RequestParam(required = false, value = "shippedGrossWeight")
          java.math.BigDecimal shippedGrossWeight,
      @RequestParam(required = false, value = "shippedVolume") java.math.BigDecimal shippedVolume,
      @RequestParam(required = false, value = "shippedPrice") java.math.BigDecimal shippedPrice,
      @RequestParam(required = false, value = "shippedAmt") java.math.BigDecimal shippedAmt,
      @RequestParam(required = false, value = "taxRate") java.math.BigDecimal taxRate,
      @RequestParam(required = false, value = "taxAmt") java.math.BigDecimal taxAmt,
      @RequestParam(required = false, value = "shipSeq") Integer shipSeq,
      @RequestParam(required = false, value = "consignTime") java.util.Date consignTime,
      @RequestParam(required = false, value = "consignerId") Long consignerId,
      @RequestParam(required = false, value = "consignerName") String consignerName,
      @RequestParam(required = false, value = "stockoutStatus") Integer stockoutStatus,
      @RequestParam(required = false, value = "auditTime") java.util.Date auditTime,
      @RequestParam(required = false, value = "auditorCode") String auditorCode,
      @RequestParam(required = false, value = "auditorName") String auditorName,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "note") String note,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salConsignOutDetailService.findBy(
        stockoutId,
        stockoutSeqno,
        conId,
        conSeqno,
        orderId,
        orderSeqno,
        entId,
        goodsId,
        goodsCode,
        goodsName,
        goodsSpec,
        salUnitId,
        salUnitCode,
        salUnitName,
        salUnitRate,
        salConOutDepotId,
        salConOutDepotCode,
        salConOutDepotName,
        shippedQty,
        shippedNetWeight,
        shippedGrossWeight,
        shippedVolume,
        shippedPrice,
        shippedAmt,
        taxRate,
        taxAmt,
        shipSeq,
        consignTime,
        consignerId,
        consignerName,
        stockoutStatus,
        auditTime,
        auditorCode,
        auditorName,
        remark,
        note,
        pageable);
  }
}
