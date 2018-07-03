package com.pagoda.web.purorder;

import com.pagoda.api.*;
import com.pagoda.api.purorder.*;
import com.pagoda.api.dto.purorder.*;
import com.pagoda.validator.purorder.*;

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
import static com.pagoda.api.dto.purorder.PurOrderDetailDTO.Getters.*;

/**
 * 模型PurOrderDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PurOrderDetailService")
@Slf4j
public class PurOrderDetailController implements InitializingBean {
  @Autowired private PurOrderDetailService purOrderDetailService;

  @Autowired private PurOrderDetailValidator purOrderDetailValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (purOrderDetailValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(purOrderDetailValidator);
    }
  }

  /**
   * 插入一条PurOrderDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条PurOrderDetail记录")
  @PostMapping(value = "/create")
  public PurOrderDetailDTO create(@Valid @RequestBody PurOrderDetailDTO dto) {
    return purOrderDetailService.create(dto);
  }

  /**
   * 删除一条PurOrderDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条PurOrderDetail记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    purOrderDetailService.delete(id);
    return true;
  }

  /**
   * 更新一条PurOrderDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条PurOrderDetail记录")
  @PostMapping(value = "/update")
  public PurOrderDetailDTO update(@RequestBody PurOrderDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return purOrderDetailService.update(dto);
  }

  /**
   * 根据主键查询PurOrderDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录PurOrderDetail记录")
  @GetMapping(value = "/getById")
  public PurOrderDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return purOrderDetailService.getById(id);
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
  public Iterable<PurOrderDetailDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return purOrderDetailService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param recOrgId
   * @param recOrgCode
   * @param recOrgName
   * @param isPrePrice
   * @param purQty
   * @param discountType
   * @param isRec
   * @param recQty
   * @param isRecInv
   * @param recInvQty
   * @param billStatus
   * @param billQty
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param goodsLevel
   * @param goodsOrion
   * @param applyQty
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param purUnitRate
   * @param arrOrgId
   * @param arrOrgCode
   * @param arrOrgName
   * @param sourceType
   * @param requestQty
   * @param planRecDate
   * @param purPrice
   * @param taxRate
   * @param discountAmt
   * @param isReturn
   * @param returnQty
   * @param applyId
   * @param applySeqno
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param remark
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<PurOrderDetailDTO> findBy(
      @RequestParam(required = false, value = "recOrgId") Long recOrgId,
      @RequestParam(required = false, value = "recOrgCode") String recOrgCode,
      @RequestParam(required = false, value = "recOrgName") String recOrgName,
      @RequestParam(required = false, value = "isPrePrice") Integer isPrePrice,
      @RequestParam(required = false, value = "purQty") java.math.BigDecimal purQty,
      @RequestParam(required = false, value = "discountType") Integer discountType,
      @RequestParam(required = false, value = "isRec") Integer isRec,
      @RequestParam(required = false, value = "recQty") java.math.BigDecimal recQty,
      @RequestParam(required = false, value = "isRecInv") Integer isRecInv,
      @RequestParam(required = false, value = "recInvQty") java.math.BigDecimal recInvQty,
      @RequestParam(required = false, value = "billStatus") Integer billStatus,
      @RequestParam(required = false, value = "billQty") java.math.BigDecimal billQty,
      @RequestParam(required = false, value = "orderId") Long orderId,
      @RequestParam(required = false, value = "orderSeqno") String orderSeqno,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "goodsId") Long goodsId,
      @RequestParam(required = false, value = "goodsCode") String goodsCode,
      @RequestParam(required = false, value = "goodsName") String goodsName,
      @RequestParam(required = false, value = "goodsSpec") String goodsSpec,
      @RequestParam(required = false, value = "goodsLevel") Integer goodsLevel,
      @RequestParam(required = false, value = "goodsOrion") String goodsOrion,
      @RequestParam(required = false, value = "applyQty") java.math.BigDecimal applyQty,
      @RequestParam(required = false, value = "purUnitId") Long purUnitId,
      @RequestParam(required = false, value = "purUnitCode") String purUnitCode,
      @RequestParam(required = false, value = "purUnitName") String purUnitName,
      @RequestParam(required = false, value = "basUnitId") Long basUnitId,
      @RequestParam(required = false, value = "basUnitCode") String basUnitCode,
      @RequestParam(required = false, value = "basUnitName") String basUnitName,
      @RequestParam(required = false, value = "purUnitRate") java.math.BigDecimal purUnitRate,
      @RequestParam(required = false, value = "arrOrgId") Long arrOrgId,
      @RequestParam(required = false, value = "arrOrgCode") String arrOrgCode,
      @RequestParam(required = false, value = "arrOrgName") String arrOrgName,
      @RequestParam(required = false, value = "sourceType") Integer sourceType,
      @RequestParam(required = false, value = "requestQty") java.math.BigDecimal requestQty,
      @RequestParam(required = false, value = "planRecDate") java.util.Date planRecDate,
      @RequestParam(required = false, value = "purPrice") java.math.BigDecimal purPrice,
      @RequestParam(required = false, value = "taxRate") java.math.BigDecimal taxRate,
      @RequestParam(required = false, value = "discountAmt") java.math.BigDecimal discountAmt,
      @RequestParam(required = false, value = "isReturn") Integer isReturn,
      @RequestParam(required = false, value = "returnQty") java.math.BigDecimal returnQty,
      @RequestParam(required = false, value = "applyId") Long applyId,
      @RequestParam(required = false, value = "applySeqno") String applySeqno,
      @RequestParam(required = false, value = "venOrgId") Long venOrgId,
      @RequestParam(required = false, value = "venOrgCode") String venOrgCode,
      @RequestParam(required = false, value = "venOrgName") String venOrgName,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return purOrderDetailService.findBy(
        recOrgId,
        recOrgCode,
        recOrgName,
        isPrePrice,
        purQty,
        discountType,
        isRec,
        recQty,
        isRecInv,
        recInvQty,
        billStatus,
        billQty,
        orderId,
        orderSeqno,
        entId,
        goodsId,
        goodsCode,
        goodsName,
        goodsSpec,
        goodsLevel,
        goodsOrion,
        applyQty,
        purUnitId,
        purUnitCode,
        purUnitName,
        basUnitId,
        basUnitCode,
        basUnitName,
        purUnitRate,
        arrOrgId,
        arrOrgCode,
        arrOrgName,
        sourceType,
        requestQty,
        planRecDate,
        purPrice,
        taxRate,
        discountAmt,
        isReturn,
        returnQty,
        applyId,
        applySeqno,
        venOrgId,
        venOrgCode,
        venOrgName,
        remark,
        pageable);
  }
}
