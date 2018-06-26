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
 * 模型BasOrgGroupOrg对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgGroupOrgService")
@Slf4j
public class BasOrgGroupOrgController {
  @Autowired private BasOrgGroupOrgService basOrgGroupOrgService;

  @Autowired private BasOrgGroupOrgValidator basOrgGroupOrgValidator;

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
  @PostMapping(value = "/update")
  public BasOrgGroupOrgDTO update(@RequestBody BasOrgGroupOrgDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgGroupOrgService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public BasOrgGroupOrgDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgGroupOrgService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
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
   * @param orgGroupCode
   * @param orgGroupId
   * @param orgGroupName
   * @param orgOrgCode
   * @param orgOrgId
   * @param orgOrgName
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<BasOrgGroupOrgDTO> findBy(
      @RequestParam(required = false, value = "orgGroupCode") String orgGroupCode,
      @RequestParam(required = false, value = "orgGroupId") Long orgGroupId,
      @RequestParam(required = false, value = "orgGroupName") String orgGroupName,
      @RequestParam(required = false, value = "orgOrgCode") String orgOrgCode,
      @RequestParam(required = false, value = "orgOrgId") Long orgOrgId,
      @RequestParam(required = false, value = "orgOrgName") String orgOrgName,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgGroupOrgService.findBy(
        orgGroupCode, orgGroupId, orgGroupName, orgOrgCode, orgOrgId, orgOrgName, pageable);
  }
}
