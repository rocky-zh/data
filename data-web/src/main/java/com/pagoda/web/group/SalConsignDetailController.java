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
 * 模型SalConsignDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalConsignDetailService")
@Slf4j
public class SalConsignDetailController {
  @Autowired private SalConsignDetailService salConsignDetailService;

  @Autowired private SalConsignDetailValidator salConsignDetailValidator;

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salConsignDetailValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salConsignDetailValidator);
    }
  }

  /**
   * 插入一条SalConsignDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public SalConsignDetailDTO create(@Valid @RequestBody SalConsignDetailDTO dto) {
    return salConsignDetailService.create(dto);
  }

  /**
   * 删除一条SalConsignDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salConsignDetailService.delete(id);
    return true;
  }

  /**
   * 更新一条SalConsignDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/update")
  public SalConsignDetailDTO update(@RequestBody SalConsignDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salConsignDetailService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public SalConsignDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salConsignDetailService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @GetMapping(value = "/batchGetByIds")
  public Iterable<SalConsignDetailDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salConsignDetailService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param actualAmt
   * @param conId
   * @param conNo
   * @param discountPrice
   * @param discountRate
   * @param enabled
   * @param goodsCode
   * @param goodsId
   * @param goodsName
   * @param goodsSpec
   * @param grossWeight
   * @param netWeight
   * @param orderId
   * @param orderNo
   * @param price
   * @param qty
   * @param salConOutDepotCode
   * @param salConOutDepotId
   * @param salConOutDepotName
   * @param salUnitCode
   * @param salUnitId
   * @param salUnitName
   * @param salUnitRate
   * @param shippedAmt
   * @param shippedCount
   * @param shippedGrossWeight
   * @param shippedNetWeight
   * @param shippedPrice
   * @param shippedQty
   * @param shippedVolume
   * @param taxAmt
   * @param taxRate
   * @param totalAmt
   * @param volume
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<SalConsignDetailDTO> findBy(
      @RequestParam(required = false, value = "actualAmt") java.math.BigDecimal actualAmt,
      @RequestParam(required = false, value = "conId") Long conId,
      @RequestParam(required = false, value = "conNo") String conNo,
      @RequestParam(required = false, value = "discountPrice") java.math.BigDecimal discountPrice,
      @RequestParam(required = false, value = "discountRate") java.math.BigDecimal discountRate,
      @RequestParam(required = false, value = "enabled") Boolean enabled,
      @RequestParam(required = false, value = "goodsCode") String goodsCode,
      @RequestParam(required = false, value = "goodsId") Long goodsId,
      @RequestParam(required = false, value = "goodsName") String goodsName,
      @RequestParam(required = false, value = "goodsSpec") String goodsSpec,
      @RequestParam(required = false, value = "grossWeight") java.math.BigDecimal grossWeight,
      @RequestParam(required = false, value = "netWeight") java.math.BigDecimal netWeight,
      @RequestParam(required = false, value = "orderId") Long orderId,
      @RequestParam(required = false, value = "orderNo") String orderNo,
      @RequestParam(required = false, value = "price") java.math.BigDecimal price,
      @RequestParam(required = false, value = "qty") java.math.BigDecimal qty,
      @RequestParam(required = false, value = "salConOutDepotCode") String salConOutDepotCode,
      @RequestParam(required = false, value = "salConOutDepotId") Long salConOutDepotId,
      @RequestParam(required = false, value = "salConOutDepotName") String salConOutDepotName,
      @RequestParam(required = false, value = "salUnitCode") String salUnitCode,
      @RequestParam(required = false, value = "salUnitId") Long salUnitId,
      @RequestParam(required = false, value = "salUnitName") String salUnitName,
      @RequestParam(required = false, value = "salUnitRate") java.math.BigDecimal salUnitRate,
      @RequestParam(required = false, value = "shippedAmt") java.math.BigDecimal shippedAmt,
      @RequestParam(required = false, value = "shippedCount") Integer shippedCount,
      @RequestParam(required = false, value = "shippedGrossWeight")
          java.math.BigDecimal shippedGrossWeight,
      @RequestParam(required = false, value = "shippedNetWeight")
          java.math.BigDecimal shippedNetWeight,
      @RequestParam(required = false, value = "shippedPrice") java.math.BigDecimal shippedPrice,
      @RequestParam(required = false, value = "shippedQty") java.math.BigDecimal shippedQty,
      @RequestParam(required = false, value = "shippedVolume") java.math.BigDecimal shippedVolume,
      @RequestParam(required = false, value = "taxAmt") java.math.BigDecimal taxAmt,
      @RequestParam(required = false, value = "taxRate") java.math.BigDecimal taxRate,
      @RequestParam(required = false, value = "totalAmt") java.math.BigDecimal totalAmt,
      @RequestParam(required = false, value = "volume") java.math.BigDecimal volume,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salConsignDetailService.findBy(
        actualAmt,
        conId,
        conNo,
        discountPrice,
        discountRate,
        enabled,
        goodsCode,
        goodsId,
        goodsName,
        goodsSpec,
        grossWeight,
        netWeight,
        orderId,
        orderNo,
        price,
        qty,
        salConOutDepotCode,
        salConOutDepotId,
        salConOutDepotName,
        salUnitCode,
        salUnitId,
        salUnitName,
        salUnitRate,
        shippedAmt,
        shippedCount,
        shippedGrossWeight,
        shippedNetWeight,
        shippedPrice,
        shippedQty,
        shippedVolume,
        taxAmt,
        taxRate,
        totalAmt,
        volume,
        pageable);
  }
}
