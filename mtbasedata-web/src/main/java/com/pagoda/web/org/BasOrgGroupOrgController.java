package com.pagoda.web.org;

import com.pagoda.api.*;
import com.pagoda.api.org.*;
import com.pagoda.api.dto.org.*;
import com.pagoda.validator.org.*;

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
import static com.pagoda.api.dto.org.BasOrgGroupOrgDTO.Getters.*;

/**
 * 模型BasOrgGroupOrg对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgGroupOrgService")
@Slf4j
public class BasOrgGroupOrgController implements InitializingBean {
  @Autowired private BasOrgGroupOrgService basOrgGroupOrgService;

  @Autowired private BasOrgGroupOrgValidator basOrgGroupOrgValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgGroupOrgValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgGroupOrgValidator);
    }
  }

  /**
   * 插入一条BasOrgGroupOrg记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasOrgGroupOrg记录")
  @PostMapping(value = "/create")
  public BasOrgGroupOrgDTO create(@Valid @RequestBody BasOrgGroupOrgDTO dto) {
    return basOrgGroupOrgService.create(dto);
  }

  /**
   * 删除一条BasOrgGroupOrg记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasOrgGroupOrg记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgGroupOrgService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrgGroupOrg记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasOrgGroupOrg记录")
  @PostMapping(value = "/update")
  public BasOrgGroupOrgDTO update(@RequestBody BasOrgGroupOrgDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgGroupOrgService.update(dto);
  }

  /**
   * 根据主键查询BasOrgGroupOrg记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasOrgGroupOrg记录")
  @GetMapping(value = "/getById")
  public BasOrgGroupOrgDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgGroupOrgService.getById(id);
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
  public Iterable<BasOrgGroupOrgDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgGroupOrgService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param orgGroupId
   * @param orgGroupCode
   * @param orgGroupName
   * @param entId
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param showOrder
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasOrgGroupOrgDTO> findBy(
      @RequestParam(required = false, value = "orgGroupId") Long orgGroupId,
      @RequestParam(required = false, value = "orgGroupCode") String orgGroupCode,
      @RequestParam(required = false, value = "orgGroupName") String orgGroupName,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "orgOrgId") Long orgOrgId,
      @RequestParam(required = false, value = "orgOrgCode") String orgOrgCode,
      @RequestParam(required = false, value = "orgOrgName") String orgOrgName,
      @RequestParam(required = false, value = "showOrder") Integer showOrder,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgGroupOrgService.findBy(
        orgGroupId,
        orgGroupCode,
        orgGroupName,
        entId,
        orgOrgId,
        orgOrgCode,
        orgOrgName,
        showOrder,
        pageable);
  }
}
