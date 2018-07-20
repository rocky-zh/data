package com.pagoda.web.prilimitmanage;

import com.pagoda.api.*;
import com.pagoda.api.prilimitmanage.*;
import com.pagoda.api.dto.prilimitmanage.*;
import com.pagoda.validator.prilimitmanage.*;

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
import static com.pagoda.api.dto.prilimitmanage.PriceLimitOperaHeadDTO.Getters.*;

/**
 * 模型PriceLimitOperaHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PriceLimitOperaHeadService")
@Slf4j
public class PriceLimitOperaHeadController implements InitializingBean {
  @Autowired private PriceLimitOperaHeadService priceLimitOperaHeadService;

  @Autowired private PriceLimitOperaHeadValidator priceLimitOperaHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (priceLimitOperaHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(priceLimitOperaHeadValidator);
    }
  }

  /**
   * 插入一条PriceLimitOperaHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条PriceLimitOperaHead记录")
  @PostMapping(value = "/create")
  public PriceLimitOperaHeadDTO create(@Valid @RequestBody PriceLimitOperaHeadDTO dto) {
    return priceLimitOperaHeadService.create(dto);
  }

  /**
   * 删除一条PriceLimitOperaHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条PriceLimitOperaHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    priceLimitOperaHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条PriceLimitOperaHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条PriceLimitOperaHead记录")
  @PostMapping(value = "/update")
  public PriceLimitOperaHeadDTO update(@RequestBody PriceLimitOperaHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return priceLimitOperaHeadService.update(dto);
  }

  /**
   * 根据主键查询PriceLimitOperaHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录PriceLimitOperaHead记录")
  @GetMapping(value = "/getById")
  public PriceLimitOperaHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return priceLimitOperaHeadService.getById(id);
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
  public Iterable<PriceLimitOperaHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return priceLimitOperaHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<PriceLimitOperaHeadDTO> findBy(
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return priceLimitOperaHeadService.findBy(entId, pageable);
  }
}
