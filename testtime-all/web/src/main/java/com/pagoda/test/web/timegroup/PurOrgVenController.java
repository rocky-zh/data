package com.pagoda.test.web.timegroup;

import com.pagoda.test.api.*;
import com.pagoda.test.api.timegroup.*;
import com.pagoda.test.api.dto.timegroup.*;
import com.pagoda.test.validator.timegroup.*;

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

import static com.pagoda.test.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.test.api.dto.timegroup.PurOrgVenDTO.Getters.*;

/**
 * 模型PurOrgVen对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PurOrgVenService")
@Slf4j
public class PurOrgVenController implements InitializingBean {
  @Autowired private PurOrgVenService purOrgVenService;

  @Autowired private PurOrgVenValidator purOrgVenValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (purOrgVenValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(purOrgVenValidator);
    }
  }

  /**
   * 插入一条PurOrgVen记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条PurOrgVen记录")
  @PostMapping(value = "/create")
  public PurOrgVenDTO create(@Valid @RequestBody PurOrgVenDTO dto) {
    return purOrgVenService.create(dto);
  }

  /**
   * 删除一条PurOrgVen记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条PurOrgVen记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    purOrgVenService.delete(id);
    return true;
  }

  /**
   * 更新一条PurOrgVen记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条PurOrgVen记录")
  @PostMapping(value = "/update")
  public PurOrgVenDTO update(@RequestBody PurOrgVenDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return purOrgVenService.update(dto);
  }

  /**
   * 根据主键查询PurOrgVen记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录PurOrgVen记录")
  @GetMapping(value = "/getById")
  public PurOrgVenDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return purOrgVenService.getById(id);
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
  public Iterable<PurOrgVenDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return purOrgVenService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param shortNum
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<PurOrgVenDTO> findBy(
      @RequestParam(required = false, value = "shortNum") String shortNum,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return purOrgVenService.findBy(shortNum, pageable);
  }
}