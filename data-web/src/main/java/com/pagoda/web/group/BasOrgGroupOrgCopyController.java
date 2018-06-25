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
 * 模型BasOrgGroupOrgCopy对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgGroupOrgCopyService")
@Slf4j
public class BasOrgGroupOrgCopyController {
  @Autowired private BasOrgGroupOrgCopyService basOrgGroupOrgCopyService;

  @Autowired private BasOrgGroupOrgCopyValidator basOrgGroupOrgCopyValidator;

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgGroupOrgCopyValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgGroupOrgCopyValidator);
    }
  }

  /**
   * 插入一条BasOrgGroupOrgCopy记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public BasOrgGroupOrgCopyDTO create(@Valid @RequestBody BasOrgGroupOrgCopyDTO dto) {
    return basOrgGroupOrgCopyService.create(dto);
  }

  /**
   * 删除一条BasOrgGroupOrgCopy记录
   *
   * @param id
   * @return
   */
  @Timed
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgGroupOrgCopyService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrgGroupOrgCopy记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/update")
  public BasOrgGroupOrgCopyDTO update(@RequestBody BasOrgGroupOrgCopyDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgGroupOrgCopyService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public BasOrgGroupOrgCopyDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgGroupOrgCopyService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @GetMapping(value = "/batchGetByIds")
  public Iterable<BasOrgGroupOrgCopyDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgGroupOrgCopyService.batchGetByIds(idList);
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
  public Page<BasOrgGroupOrgCopyDTO> findBy(
      @RequestParam(required = false, value = "orgGroupCode") String orgGroupCode,
      @RequestParam(required = false, value = "orgGroupId") Long orgGroupId,
      @RequestParam(required = false, value = "orgGroupName") String orgGroupName,
      @RequestParam(required = false, value = "orgOrgCode") String orgOrgCode,
      @RequestParam(required = false, value = "orgOrgId") Long orgOrgId,
      @RequestParam(required = false, value = "orgOrgName") String orgOrgName,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgGroupOrgCopyService.findBy(
        orgGroupCode, orgGroupId, orgGroupName, orgOrgCode, orgOrgId, orgOrgName, pageable);
  }
}
