package com.pagoda.web.ent;

import com.pagoda.api.*;
import com.pagoda.api.ent.*;
import com.pagoda.api.dto.ent.*;
import com.pagoda.validator.ent.*;

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
import static com.pagoda.api.dto.ent.SysEntParamDTO.Getters.*;

/**
 * 模型SysEntParam对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SysEntParamService")
@Slf4j
public class SysEntParamController implements InitializingBean {
  @Autowired private SysEntParamService sysEntParamService;

  @Autowired private SysEntParamValidator sysEntParamValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (sysEntParamValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(sysEntParamValidator);
    }
  }

  /**
   * 插入一条SysEntParam记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SysEntParam记录")
  @PostMapping(value = "/create")
  public SysEntParamDTO create(@Valid @RequestBody SysEntParamDTO dto) {
    return sysEntParamService.create(dto);
  }

  /**
   * 删除一条SysEntParam记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SysEntParam记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    sysEntParamService.delete(id);
    return true;
  }

  /**
   * 更新一条SysEntParam记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SysEntParam记录")
  @PostMapping(value = "/update")
  public SysEntParamDTO update(@RequestBody SysEntParamDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return sysEntParamService.update(dto);
  }

  /**
   * 根据主键查询SysEntParam记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SysEntParam记录")
  @GetMapping(value = "/getById")
  public SysEntParamDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return sysEntParamService.getById(id);
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
  public Iterable<SysEntParamDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return sysEntParamService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param paramCode
   * @param paramName
   * @param paramValue
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SysEntParamDTO> findBy(
      @RequestParam(required = false, value = "paramCode") String paramCode,
      @RequestParam(required = false, value = "paramName") String paramName,
      @RequestParam(required = false, value = "paramValue") String paramValue,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return sysEntParamService.findBy(paramCode, paramName, paramValue, entId, pageable);
  }
}
