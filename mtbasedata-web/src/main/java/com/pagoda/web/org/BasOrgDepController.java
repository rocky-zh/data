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
import static com.pagoda.api.dto.org.BasOrgDepDTO.Getters.*;

/**
 * 模型BasOrgDep对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgDepService")
@Slf4j
public class BasOrgDepController implements InitializingBean {
  @Autowired private BasOrgDepService basOrgDepService;

  @Autowired private BasOrgDepValidator basOrgDepValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgDepValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgDepValidator);
    }
  }

  /**
   * 插入一条BasOrgDep记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasOrgDep记录")
  @PostMapping(value = "/create")
  public BasOrgDepDTO create(@Valid @RequestBody BasOrgDepDTO dto) {
    return basOrgDepService.create(dto);
  }

  /**
   * 删除一条BasOrgDep记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasOrgDep记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgDepService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrgDep记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasOrgDep记录")
  @PostMapping(value = "/update")
  public BasOrgDepDTO update(@RequestBody BasOrgDepDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgDepService.update(dto);
  }

  /**
   * 根据主键查询BasOrgDep记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasOrgDep记录")
  @GetMapping(value = "/getById")
  public BasOrgDepDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgDepService.getById(id);
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
  public Iterable<BasOrgDepDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgDepService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param ownerDepId
   * @param relCatClassId
   * @param isDepEnabled
   * @param orgId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasOrgDepDTO> findBy(
      @RequestParam(required = false, value = "ownerDepId") Long ownerDepId,
      @RequestParam(required = false, value = "relCatClassId") Long relCatClassId,
      @RequestParam(required = false, value = "isDepEnabled") Integer isDepEnabled,
      @RequestParam(required = false, value = "orgId") Long orgId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgDepService.findBy(ownerDepId, relCatClassId, isDepEnabled, orgId, pageable);
  }
}
