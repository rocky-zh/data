package com.pagoda.web.salorderhead;

import com.pagoda.api.*;
import com.pagoda.api.salorderhead.*;
import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.validator.salorderhead.*;

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
import static com.pagoda.api.dto.salorderhead.SalOrderDetailDTO.Getters.*;

/**
 * 模型SalOrderDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalOrderDetailService")
@Slf4j
public class SalOrderDetailController implements InitializingBean {
  @Autowired private SalOrderDetailService salOrderDetailService;

  @Autowired private SalOrderDetailValidator salOrderDetailValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salOrderDetailValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salOrderDetailValidator);
    }
  }

  /**
   * 插入一条SalOrderDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalOrderDetail记录")
  @PostMapping(value = "/create")
  public SalOrderDetailDTO create(@Valid @RequestBody SalOrderDetailDTO dto) {
    return salOrderDetailService.create(dto);
  }

  /**
   * 删除一条SalOrderDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalOrderDetail记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salOrderDetailService.delete(id);
    return true;
  }

  /**
   * 更新一条SalOrderDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalOrderDetail记录")
  @PostMapping(value = "/update")
  public SalOrderDetailDTO update(@RequestBody SalOrderDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salOrderDetailService.update(dto);
  }

  /**
   * 根据主键查询SalOrderDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalOrderDetail记录")
  @GetMapping(value = "/getById")
  public SalOrderDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salOrderDetailService.getById(id);
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
  public Iterable<SalOrderDetailDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salOrderDetailService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param goodsVarId
   * @param goodsVarName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param salUnitid
   * @param salUnitCode
   * @param salUnitName
   * @param salUnitRate
   * @param requestQty
   * @param maxOrderQty
   * @param minOrderQty
   * @param price
   * @param discountPrice
   * @param discountRate
   * @param discountAmt
   * @param taxRate
   * @param taxAmt
   * @param goodsAmt
   * @param totalAmt
   * @param remark
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param batchQty
   * @param batchPolicy
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalOrderDetailDTO> findBy(
      @RequestParam(required = false, value = "orderId") Long orderId,
      @RequestParam(required = false, value = "orderSeqno") String orderSeqno,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "goodsVarId") Long goodsVarId,
      @RequestParam(required = false, value = "goodsVarName") String goodsVarName,
      @RequestParam(required = false, value = "goodsId") Long goodsId,
      @RequestParam(required = false, value = "goodsCode") String goodsCode,
      @RequestParam(required = false, value = "goodsName") String goodsName,
      @RequestParam(required = false, value = "goodsSpec") String goodsSpec,
      @RequestParam(required = false, value = "salUnitid") Long salUnitid,
      @RequestParam(required = false, value = "salUnitCode") String salUnitCode,
      @RequestParam(required = false, value = "salUnitName") String salUnitName,
      @RequestParam(required = false, value = "salUnitRate") java.math.BigDecimal salUnitRate,
      @RequestParam(required = false, value = "requestQty") java.math.BigDecimal requestQty,
      @RequestParam(required = false, value = "maxOrderQty") java.math.BigDecimal maxOrderQty,
      @RequestParam(required = false, value = "minOrderQty") java.math.BigDecimal minOrderQty,
      @RequestParam(required = false, value = "price") java.math.BigDecimal price,
      @RequestParam(required = false, value = "discountPrice") java.math.BigDecimal discountPrice,
      @RequestParam(required = false, value = "discountRate") java.math.BigDecimal discountRate,
      @RequestParam(required = false, value = "discountAmt") java.math.BigDecimal discountAmt,
      @RequestParam(required = false, value = "taxRate") java.math.BigDecimal taxRate,
      @RequestParam(required = false, value = "taxAmt") java.math.BigDecimal taxAmt,
      @RequestParam(required = false, value = "goodsAmt") java.math.BigDecimal goodsAmt,
      @RequestParam(required = false, value = "totalAmt") java.math.BigDecimal totalAmt,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "conOrgId") Long conOrgId,
      @RequestParam(required = false, value = "conOrgCode") String conOrgCode,
      @RequestParam(required = false, value = "conOrgName") String conOrgName,
      @RequestParam(required = false, value = "batchQty") java.math.BigDecimal batchQty,
      @RequestParam(required = false, value = "batchPolicy") Integer batchPolicy,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salOrderDetailService.findBy(
        orderId,
        orderSeqno,
        entId,
        goodsVarId,
        goodsVarName,
        goodsId,
        goodsCode,
        goodsName,
        goodsSpec,
        salUnitid,
        salUnitCode,
        salUnitName,
        salUnitRate,
        requestQty,
        maxOrderQty,
        minOrderQty,
        price,
        discountPrice,
        discountRate,
        discountAmt,
        taxRate,
        taxAmt,
        goodsAmt,
        totalAmt,
        remark,
        conOrgId,
        conOrgCode,
        conOrgName,
        batchQty,
        batchPolicy,
        pageable);
  }
}
