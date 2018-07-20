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
import static com.pagoda.api.dto.salorderhead.SalOrderDetailGoodsQtyDTO.Getters.*;

/**
 * 模型SalOrderDetailGoodsQty对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalOrderDetailGoodsQtyService")
@Slf4j
public class SalOrderDetailGoodsQtyController implements InitializingBean {
  @Autowired private SalOrderDetailGoodsQtyService salOrderDetailGoodsQtyService;

  @Autowired private SalOrderDetailGoodsQtyValidator salOrderDetailGoodsQtyValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salOrderDetailGoodsQtyValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salOrderDetailGoodsQtyValidator);
    }
  }

  /**
   * 插入一条SalOrderDetailGoodsQty记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalOrderDetailGoodsQty记录")
  @PostMapping(value = "/create")
  public SalOrderDetailGoodsQtyDTO create(@Valid @RequestBody SalOrderDetailGoodsQtyDTO dto) {
    return salOrderDetailGoodsQtyService.create(dto);
  }

  /**
   * 删除一条SalOrderDetailGoodsQty记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalOrderDetailGoodsQty记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salOrderDetailGoodsQtyService.delete(id);
    return true;
  }

  /**
   * 更新一条SalOrderDetailGoodsQty记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalOrderDetailGoodsQty记录")
  @PostMapping(value = "/update")
  public SalOrderDetailGoodsQtyDTO update(@RequestBody SalOrderDetailGoodsQtyDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salOrderDetailGoodsQtyService.update(dto);
  }

  /**
   * 根据主键查询SalOrderDetailGoodsQty记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalOrderDetailGoodsQty记录")
  @GetMapping(value = "/getById")
  public SalOrderDetailGoodsQtyDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salOrderDetailGoodsQtyService.getById(id);
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
  public Iterable<SalOrderDetailGoodsQtyDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salOrderDetailGoodsQtyService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param orderDetailId
   * @param sourceId
   * @param sourceNo
   * @param orderId
   * @param orderSeqno
   * @param entId
   * @param sourceType
   * @param requestQty
   * @param remark
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalOrderDetailGoodsQtyDTO> findBy(
      @RequestParam(required = false, value = "orderDetailId") Long orderDetailId,
      @RequestParam(required = false, value = "sourceId") Long sourceId,
      @RequestParam(required = false, value = "sourceNo") String sourceNo,
      @RequestParam(required = false, value = "orderId") Long orderId,
      @RequestParam(required = false, value = "orderSeqno") String orderSeqno,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "sourceType") Integer sourceType,
      @RequestParam(required = false, value = "requestQty") java.math.BigDecimal requestQty,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salOrderDetailGoodsQtyService.findBy(
        orderDetailId,
        sourceId,
        sourceNo,
        orderId,
        orderSeqno,
        entId,
        sourceType,
        requestQty,
        remark,
        pageable);
  }
}
