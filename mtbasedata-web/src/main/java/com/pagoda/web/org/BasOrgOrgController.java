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
import static com.pagoda.api.dto.org.BasOrgOrgDTO.Getters.*;

/**
 * 模型BasOrgOrg对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgOrgService")
@Slf4j
public class BasOrgOrgController implements InitializingBean {
  @Autowired private BasOrgOrgService basOrgOrgService;

  @Autowired private BasOrgOrgValidator basOrgOrgValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgOrgValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgOrgValidator);
    }
  }

  /**
   * 插入一条BasOrgOrg记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasOrgOrg记录")
  @PostMapping(value = "/create")
  public BasOrgOrgDTO create(@Valid @RequestBody BasOrgOrgDTO dto) {
    return basOrgOrgService.create(dto);
  }

  /**
   * 删除一条BasOrgOrg记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasOrgOrg记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgOrgService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrgOrg记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasOrgOrg记录")
  @PostMapping(value = "/update")
  public BasOrgOrgDTO update(@RequestBody BasOrgOrgDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgOrgService.update(dto);
  }

  /**
   * 根据主键查询BasOrgOrg记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasOrgOrg记录")
  @GetMapping(value = "/getById")
  public BasOrgOrgDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgOrgService.getById(id);
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
  public Iterable<BasOrgOrgDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgOrgService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param dualDepotId
   * @param dualOrgId
   * @param isOrgTaxRate
   * @param isOrgEnabled
   * @param isUsedWms
   * @param orgId
   * @param salConOutDepotId
   * @param salRetInDepotId
   * @param purRecInDepotId
   * @param purRetOutDepotId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasOrgOrgDTO> findBy(
      @RequestParam(required = false, value = "dualDepotId") Long dualDepotId,
      @RequestParam(required = false, value = "dualOrgId") Long dualOrgId,
      @RequestParam(required = false, value = "isOrgTaxRate") Integer isOrgTaxRate,
      @RequestParam(required = false, value = "isOrgEnabled") Integer isOrgEnabled,
      @RequestParam(required = false, value = "isUsedWms") Integer isUsedWms,
      @RequestParam(required = false, value = "orgId") Long orgId,
      @RequestParam(required = false, value = "salConOutDepotId") Long salConOutDepotId,
      @RequestParam(required = false, value = "salRetInDepotId") Long salRetInDepotId,
      @RequestParam(required = false, value = "purRecInDepotId") Long purRecInDepotId,
      @RequestParam(required = false, value = "purRetOutDepotId") Long purRetOutDepotId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgOrgService.findBy(
        dualDepotId,
        dualOrgId,
        isOrgTaxRate,
        isOrgEnabled,
        isUsedWms,
        orgId,
        salConOutDepotId,
        salRetInDepotId,
        purRecInDepotId,
        purRetOutDepotId,
        pageable);
  }
}
