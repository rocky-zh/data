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
import static com.pagoda.api.dto.salorderhead.SalOrderHeadDTO.Getters.*;

/**
 * 模型SalOrderHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalOrderHeadService")
@Slf4j
public class SalOrderHeadController implements InitializingBean {
  @Autowired private SalOrderHeadService salOrderHeadService;

  @Autowired private SalOrderHeadValidator salOrderHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salOrderHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salOrderHeadValidator);
    }
  }

  /**
   * 插入一条SalOrderHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalOrderHead记录")
  @PostMapping(value = "/create")
  public SalOrderHeadDTO create(@Valid @RequestBody SalOrderHeadDTO dto) {
    return salOrderHeadService.create(dto);
  }

  /**
   * 删除一条SalOrderHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalOrderHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salOrderHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条SalOrderHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalOrderHead记录")
  @PostMapping(value = "/update")
  public SalOrderHeadDTO update(@RequestBody SalOrderHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salOrderHeadService.update(dto);
  }

  /**
   * 根据主键查询SalOrderHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalOrderHead记录")
  @GetMapping(value = "/getById")
  public SalOrderHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salOrderHeadService.getById(id);
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
  public Iterable<SalOrderHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salOrderHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param entId
   * @param seqno
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param preArrivalDate
   * @param transitLineNo
   * @param totalAmt
   * @param goodsAmt
   * @param taxAmt
   * @param totalRequestQty
   * @param orderType
   * @param inputMode
   * @param orderStatus
   * @param isFinish
   * @param remark
   * @param entryDate
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalOrderHeadDTO> findBy(
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "seqno") String seqno,
      @RequestParam(required = false, value = "conOrgId") Long conOrgId,
      @RequestParam(required = false, value = "conOrgCode") String conOrgCode,
      @RequestParam(required = false, value = "conOrgName") String conOrgName,
      @RequestParam(required = false, value = "cusOrgId") Long cusOrgId,
      @RequestParam(required = false, value = "cusOrgCode") String cusOrgCode,
      @RequestParam(required = false, value = "cusOrgName") String cusOrgName,
      @RequestParam(required = false, value = "preArrivalDate") java.util.Date preArrivalDate,
      @RequestParam(required = false, value = "transitLineNo") String transitLineNo,
      @RequestParam(required = false, value = "totalAmt") java.math.BigDecimal totalAmt,
      @RequestParam(required = false, value = "goodsAmt") java.math.BigDecimal goodsAmt,
      @RequestParam(required = false, value = "taxAmt") java.math.BigDecimal taxAmt,
      @RequestParam(required = false, value = "totalRequestQty")
          java.math.BigDecimal totalRequestQty,
      @RequestParam(required = false, value = "orderType") Integer orderType,
      @RequestParam(required = false, value = "inputMode") Integer inputMode,
      @RequestParam(required = false, value = "orderStatus") Integer orderStatus,
      @RequestParam(required = false, value = "isFinish") Integer isFinish,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "entryDate") java.util.Date entryDate,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salOrderHeadService.findBy(
        entId,
        seqno,
        conOrgId,
        conOrgCode,
        conOrgName,
        cusOrgId,
        cusOrgCode,
        cusOrgName,
        preArrivalDate,
        transitLineNo,
        totalAmt,
        goodsAmt,
        taxAmt,
        totalRequestQty,
        orderType,
        inputMode,
        orderStatus,
        isFinish,
        remark,
        entryDate,
        pageable);
  }
}
