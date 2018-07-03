package com.pagoda.web.purapply;

import com.pagoda.api.*;
import com.pagoda.api.purapply.*;
import com.pagoda.api.dto.purapply.*;
import com.pagoda.validator.purapply.*;

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
import static com.pagoda.api.dto.purapply.PurApplyDetailDTO.Getters.*;

/**
 * 模型PurApplyDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PurApplyDetailService")
@Slf4j
public class PurApplyDetailController implements InitializingBean {
  @Autowired private PurApplyDetailService purApplyDetailService;

  @Autowired private PurApplyDetailValidator purApplyDetailValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

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
  @ApiOperation(value = "create", notes = "插入一条PurApplyDetail记录")
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
  @ApiOperation(value = "delete", notes = "删除一条PurApplyDetail记录")
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
  @ApiOperation(value = "update", notes = "更新一条PurApplyDetail记录")
  @PostMapping(value = "/update")
  public PurApplyDetailDTO update(@RequestBody PurApplyDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return purApplyDetailService.update(dto);
  }

  /**
   * 根据主键查询PurApplyDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录PurApplyDetail记录")
  @GetMapping(value = "/getById")
  public PurApplyDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return purApplyDetailService.getById(id);
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
   * @param applySeqno
   * @param goodsOrion
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param purUnitRate
   * @param requestQty
   * @param applyQty
   * @param confirmQty
   * @param invPrice
   * @param dealPurQty
   * @param dealSalQty
   * @param dealStatus
   * @param dealSalOrgId
   * @param calCusOrderQty
   * @param calOuterFerQty
   * @param calCusSalQty
   * @param calInvQty
   * @param calOnWayQty
   * @param calStockUpQty
   * @param calReplenishmentQty
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param planRecDate
   * @param remark
   * @param calPurRate
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<PurApplyDetailDTO> findBy(
      @RequestParam(required = false, value = "applyId") Long applyId,
      @RequestParam(required = false, value = "applySeqno") String applySeqno,
      @RequestParam(required = false, value = "goodsOrion") String goodsOrion,
      @RequestParam(required = false, value = "purUnitId") Long purUnitId,
      @RequestParam(required = false, value = "purUnitCode") String purUnitCode,
      @RequestParam(required = false, value = "purUnitName") String purUnitName,
      @RequestParam(required = false, value = "basUnitId") Long basUnitId,
      @RequestParam(required = false, value = "basUnitCode") String basUnitCode,
      @RequestParam(required = false, value = "basUnitName") String basUnitName,
      @RequestParam(required = false, value = "purUnitRate") java.math.BigDecimal purUnitRate,
      @RequestParam(required = false, value = "requestQty") java.math.BigDecimal requestQty,
      @RequestParam(required = false, value = "applyQty") java.math.BigDecimal applyQty,
      @RequestParam(required = false, value = "confirmQty") java.math.BigDecimal confirmQty,
      @RequestParam(required = false, value = "invPrice") java.math.BigDecimal invPrice,
      @RequestParam(required = false, value = "dealPurQty") java.math.BigDecimal dealPurQty,
      @RequestParam(required = false, value = "dealSalQty") java.math.BigDecimal dealSalQty,
      @RequestParam(required = false, value = "dealStatus") Integer dealStatus,
      @RequestParam(required = false, value = "dealSalOrgId") Long dealSalOrgId,
      @RequestParam(required = false, value = "calCusOrderQty") java.math.BigDecimal calCusOrderQty,
      @RequestParam(required = false, value = "calOuterFerQty") java.math.BigDecimal calOuterFerQty,
      @RequestParam(required = false, value = "calCusSalQty") java.math.BigDecimal calCusSalQty,
      @RequestParam(required = false, value = "calInvQty") java.math.BigDecimal calInvQty,
      @RequestParam(required = false, value = "calOnWayQty") java.math.BigDecimal calOnWayQty,
      @RequestParam(required = false, value = "calStockUpQty") java.math.BigDecimal calStockUpQty,
      @RequestParam(required = false, value = "calReplenishmentQty")
          java.math.BigDecimal calReplenishmentQty,
      @RequestParam(required = false, value = "goodsId") Long goodsId,
      @RequestParam(required = false, value = "goodsCode") String goodsCode,
      @RequestParam(required = false, value = "goodsName") String goodsName,
      @RequestParam(required = false, value = "goodsSpec") String goodsSpec,
      @RequestParam(required = false, value = "planRecDate") java.util.Date planRecDate,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "calPurRate") java.math.BigDecimal calPurRate,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return purApplyDetailService.findBy(
        applyId,
        applySeqno,
        goodsOrion,
        purUnitId,
        purUnitCode,
        purUnitName,
        basUnitId,
        basUnitCode,
        basUnitName,
        purUnitRate,
        requestQty,
        applyQty,
        confirmQty,
        invPrice,
        dealPurQty,
        dealSalQty,
        dealStatus,
        dealSalOrgId,
        calCusOrderQty,
        calOuterFerQty,
        calCusSalQty,
        calInvQty,
        calOnWayQty,
        calStockUpQty,
        calReplenishmentQty,
        goodsId,
        goodsCode,
        goodsName,
        goodsSpec,
        planRecDate,
        remark,
        calPurRate,
        pageable);
  }
}
