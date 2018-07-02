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
import static com.pagoda.api.dto.salorderhead.SalPreOrderHeadDTO.Getters.*;

/**
 * 模型SalPreOrderHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalPreOrderHeadService")
@Slf4j
public class SalPreOrderHeadController implements InitializingBean {
  @Autowired private SalPreOrderHeadService salPreOrderHeadService;

  @Autowired private SalPreOrderHeadValidator salPreOrderHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salPreOrderHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salPreOrderHeadValidator);
    }
  }

  /**
   * 插入一条SalPreOrderHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalPreOrderHead记录")
  @PostMapping(value = "/create")
  public SalPreOrderHeadDTO create(@Valid @RequestBody SalPreOrderHeadDTO dto) {
    return salPreOrderHeadService.create(dto);
  }

  /**
   * 删除一条SalPreOrderHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalPreOrderHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salPreOrderHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条SalPreOrderHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalPreOrderHead记录")
  @PostMapping(value = "/update")
  public SalPreOrderHeadDTO update(@RequestBody SalPreOrderHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salPreOrderHeadService.update(dto);
  }

  /**
   * 根据主键查询SalPreOrderHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalPreOrderHead记录")
  @GetMapping(value = "/getById")
  public SalPreOrderHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salPreOrderHeadService.getById(id);
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
  public Iterable<SalPreOrderHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salPreOrderHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param preOrderType
   * @param preOrderStatus
   * @param entId
   * @param seqno
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param cusOrgId
   * @param cusOrgCode
   * @param cusOrgName
   * @param remark
   * @param entryDate
   * @param totalAmt
   * @param totalRequestQty
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalPreOrderHeadDTO> findBy(
      @RequestParam(required = false, value = "preOrderType") Integer preOrderType,
      @RequestParam(required = false, value = "preOrderStatus") Integer preOrderStatus,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "seqno") String seqno,
      @RequestParam(required = false, value = "conOrgId") Long conOrgId,
      @RequestParam(required = false, value = "conOrgCode") String conOrgCode,
      @RequestParam(required = false, value = "conOrgName") String conOrgName,
      @RequestParam(required = false, value = "cusOrgId") Long cusOrgId,
      @RequestParam(required = false, value = "cusOrgCode") String cusOrgCode,
      @RequestParam(required = false, value = "cusOrgName") String cusOrgName,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "entryDate") java.sql.Timestamp entryDate,
      @RequestParam(required = false, value = "totalAmt") java.math.BigDecimal totalAmt,
      @RequestParam(required = false, value = "totalRequestQty")
          java.math.BigDecimal totalRequestQty,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salPreOrderHeadService.findBy(
        preOrderType,
        preOrderStatus,
        entId,
        seqno,
        conOrgId,
        conOrgCode,
        conOrgName,
        cusOrgId,
        cusOrgCode,
        cusOrgName,
        remark,
        entryDate,
        totalAmt,
        totalRequestQty,
        pageable);
  }
}
