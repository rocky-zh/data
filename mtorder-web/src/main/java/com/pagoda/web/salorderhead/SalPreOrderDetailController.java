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
import static com.pagoda.api.dto.salorderhead.SalPreOrderDetailDTO.Getters.*;

/**
 * 模型SalPreOrderDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalPreOrderDetailService")
@Slf4j
public class SalPreOrderDetailController implements InitializingBean {
  @Autowired private SalPreOrderDetailService salPreOrderDetailService;

  @Autowired private SalPreOrderDetailValidator salPreOrderDetailValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salPreOrderDetailValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salPreOrderDetailValidator);
    }
  }

  /**
   * 插入一条SalPreOrderDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalPreOrderDetail记录")
  @PostMapping(value = "/create")
  public SalPreOrderDetailDTO create(@Valid @RequestBody SalPreOrderDetailDTO dto) {
    return salPreOrderDetailService.create(dto);
  }

  /**
   * 删除一条SalPreOrderDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalPreOrderDetail记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salPreOrderDetailService.delete(id);
    return true;
  }

  /**
   * 更新一条SalPreOrderDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalPreOrderDetail记录")
  @PostMapping(value = "/update")
  public SalPreOrderDetailDTO update(@RequestBody SalPreOrderDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salPreOrderDetailService.update(dto);
  }

  /**
   * 根据主键查询SalPreOrderDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalPreOrderDetail记录")
  @GetMapping(value = "/getById")
  public SalPreOrderDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salPreOrderDetailService.getById(id);
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
  public Iterable<SalPreOrderDetailDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salPreOrderDetailService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param preOrderId
   * @param preOrderSeqno
   * @param prePlanQty
   * @param auditQty
   * @param invQty
   * @param detailStatus
   * @param areaId
   * @param areaCode
   * @param areaName
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
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param maxOrderQty
   * @param minOrderQty
   * @param price
   * @param totalAmt
   * @param preArrivalDate
   * @param remark
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalPreOrderDetailDTO> findBy(
      @RequestParam(required = false, value = "preOrderId") Long preOrderId,
      @RequestParam(required = false, value = "preOrderSeqno") String preOrderSeqno,
      @RequestParam(required = false, value = "prePlanQty") java.math.BigDecimal prePlanQty,
      @RequestParam(required = false, value = "auditQty") java.math.BigDecimal auditQty,
      @RequestParam(required = false, value = "invQty") java.math.BigDecimal invQty,
      @RequestParam(required = false, value = "detailStatus") Integer detailStatus,
      @RequestParam(required = false, value = "areaId") Long areaId,
      @RequestParam(required = false, value = "areaCode") String areaCode,
      @RequestParam(required = false, value = "areaName") String areaName,
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
      @RequestParam(required = false, value = "basUnitId") Long basUnitId,
      @RequestParam(required = false, value = "basUnitCode") String basUnitCode,
      @RequestParam(required = false, value = "basUnitName") String basUnitName,
      @RequestParam(required = false, value = "maxOrderQty") java.math.BigDecimal maxOrderQty,
      @RequestParam(required = false, value = "minOrderQty") java.math.BigDecimal minOrderQty,
      @RequestParam(required = false, value = "price") java.math.BigDecimal price,
      @RequestParam(required = false, value = "totalAmt") java.math.BigDecimal totalAmt,
      @RequestParam(required = false, value = "preArrivalDate") java.util.Date preArrivalDate,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salPreOrderDetailService.findBy(
        preOrderId,
        preOrderSeqno,
        prePlanQty,
        auditQty,
        invQty,
        detailStatus,
        areaId,
        areaCode,
        areaName,
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
        basUnitId,
        basUnitCode,
        basUnitName,
        maxOrderQty,
        minOrderQty,
        price,
        totalAmt,
        preArrivalDate,
        remark,
        pageable);
  }
}
