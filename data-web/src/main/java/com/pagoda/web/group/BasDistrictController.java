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
 * 模型BasDistrict对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasDistrictService")
@Slf4j
public class BasDistrictController {
  @Autowired private BasDistrictService basDistrictService;

  @Autowired private BasDistrictValidator basDistrictValidator;

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basDistrictValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basDistrictValidator);
    }
  }

  /**
   * 插入一条BasDistrict记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public BasDistrictDTO create(@Valid @RequestBody BasDistrictDTO dto) {
    return basDistrictService.create(dto);
  }

  /**
   * 删除一条BasDistrict记录
   *
   * @param id
   * @return
   */
  @Timed
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basDistrictService.delete(id);
    return true;
  }

  /**
   * 更新一条BasDistrict记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/update")
  public BasDistrictDTO update(@RequestBody BasDistrictDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basDistrictService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public BasDistrictDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basDistrictService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @GetMapping(value = "/batchGetByIds")
  public Iterable<BasDistrictDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basDistrictService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param active
   * @param code
   * @param enabled
   * @param levelType
   * @param name
   * @param pid
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<BasDistrictDTO> findBy(
      @RequestParam(required = false, value = "active") Boolean active,
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "enabled") Boolean enabled,
      @RequestParam(required = false, value = "levelType") Integer levelType,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "pid") Long pid,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basDistrictService.findBy(active, code, enabled, levelType, name, pid, pageable);
  }
}
