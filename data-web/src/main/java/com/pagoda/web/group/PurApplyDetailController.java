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
 * 模型PurApplyDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PurApplyDetailService")
@Slf4j
public class PurApplyDetailController {
  @Autowired private PurApplyDetailService purApplyDetailService;

  @Autowired private PurApplyDetailValidator purApplyDetailValidator;

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (purApplyDetailValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(purApplyDetailValidator);
    }
  }

  /**
   * 插入一条PurApplyDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public PurApplyDetailDTO create(@Valid @RequestBody PurApplyDetailDTO dto) {
    return purApplyDetailService.create(dto);
  }

  /**
   * 删除一条PurApplyDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    purApplyDetailService.delete(id);
    return true;
  }

  /**
   * 更新一条PurApplyDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/update")
  public PurApplyDetailDTO update(@RequestBody PurApplyDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return purApplyDetailService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public PurApplyDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return purApplyDetailService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @GetMapping(value = "/batchGetByIds")
  public Iterable<PurApplyDetailDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return purApplyDetailService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param applyId
   * @param applyPrice
   * @param applyQty
   * @param basUnitCode
   * @param basUnitId
   * @param basUnitName
   * @param calCusOrderQty
   * @param calCusSalQty
   * @param calInvQty
   * @param calOnWayQty
   * @param calOuterFerQty
   * @param calPurRate
   * @param calReplenishmentQty
   * @param calStockUpQty
   * @param confirmQty
   * @param dealPurQty
   * @param dealSalOrgId
   * @param dealSalQty
   * @param dealStatus
   * @param delId
   * @param goodsLevel
   * @param goodsOrion
   * @param invPrice
   * @param purUnitCode
   * @param purUnitId
   * @param purUnitName
   * @param purUnitRate
   * @param requestQty
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<PurApplyDetailDTO> findBy(
      @RequestParam(required = false, value = "applyId") Long applyId,
      @RequestParam(required = false, value = "applyPrice") java.math.BigDecimal applyPrice,
      @RequestParam(required = false, value = "applyQty") Integer applyQty,
      @RequestParam(required = false, value = "basUnitCode") String basUnitCode,
      @RequestParam(required = false, value = "basUnitId") Long basUnitId,
      @RequestParam(required = false, value = "basUnitName") String basUnitName,
      @RequestParam(required = false, value = "calCusOrderQty") Double calCusOrderQty,
      @RequestParam(required = false, value = "calCusSalQty") Double calCusSalQty,
      @RequestParam(required = false, value = "calInvQty") Double calInvQty,
      @RequestParam(required = false, value = "calOnWayQty") Double calOnWayQty,
      @RequestParam(required = false, value = "calOuterFerQty") Double calOuterFerQty,
      @RequestParam(required = false, value = "calPurRate") Double calPurRate,
      @RequestParam(required = false, value = "calReplenishmentQty") Double calReplenishmentQty,
      @RequestParam(required = false, value = "calStockUpQty") Double calStockUpQty,
      @RequestParam(required = false, value = "confirmQty") Integer confirmQty,
      @RequestParam(required = false, value = "dealPurQty") Integer dealPurQty,
      @RequestParam(required = false, value = "dealSalOrgId") String dealSalOrgId,
      @RequestParam(required = false, value = "dealSalQty") Integer dealSalQty,
      @RequestParam(required = false, value = "dealStatus") Integer dealStatus,
      @RequestParam(required = false, value = "delId") Integer delId,
      @RequestParam(required = false, value = "goodsLevel") Integer goodsLevel,
      @RequestParam(required = false, value = "goodsOrion") String goodsOrion,
      @RequestParam(required = false, value = "invPrice") java.math.BigDecimal invPrice,
      @RequestParam(required = false, value = "purUnitCode") String purUnitCode,
      @RequestParam(required = false, value = "purUnitId") Long purUnitId,
      @RequestParam(required = false, value = "purUnitName") String purUnitName,
      @RequestParam(required = false, value = "purUnitRate") Double purUnitRate,
      @RequestParam(required = false, value = "requestQty") Integer requestQty,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return purApplyDetailService.findBy(
        applyId,
        applyPrice,
        applyQty,
        basUnitCode,
        basUnitId,
        basUnitName,
        calCusOrderQty,
        calCusSalQty,
        calInvQty,
        calOnWayQty,
        calOuterFerQty,
        calPurRate,
        calReplenishmentQty,
        calStockUpQty,
        confirmQty,
        dealPurQty,
        dealSalOrgId,
        dealSalQty,
        dealStatus,
        delId,
        goodsLevel,
        goodsOrion,
        invPrice,
        purUnitCode,
        purUnitId,
        purUnitName,
        purUnitRate,
        requestQty,
        pageable);
  }
}
