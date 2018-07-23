package com.pagoda.web.salebasicdefinition;

import com.pagoda.api.*;
import com.pagoda.api.salebasicdefinition.*;
import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.validator.salebasicdefinition.*;

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
import static com.pagoda.api.dto.salebasicdefinition.BasRouteDTO.Getters.*;

/**
 * 模型BasRoute对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasRouteService")
@Slf4j
public class BasRouteController implements InitializingBean {
  @Autowired private BasRouteService basRouteService;

  @Autowired private BasRouteValidator basRouteValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basRouteValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basRouteValidator);
    }
  }

  /**
   * 插入一条BasRoute记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasRoute记录")
  @PostMapping(value = "/create")
  public BasRouteDTO create(@Valid @RequestBody BasRouteDTO dto) {
    return basRouteService.create(dto);
  }

  /**
   * 删除一条BasRoute记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasRoute记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basRouteService.delete(id);
    return true;
  }

  /**
   * 更新一条BasRoute记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasRoute记录")
  @PostMapping(value = "/update")
  public BasRouteDTO update(@RequestBody BasRouteDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basRouteService.update(dto);
  }

  /**
   * 根据主键查询BasRoute记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasRoute记录")
  @GetMapping(value = "/getById")
  public BasRouteDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basRouteService.getById(id);
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
  public Iterable<BasRouteDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basRouteService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param waveNum
   * @param sendPlace
   * @param receivePlace
   * @param transMode
   * @param code
   * @param name
   * @param conOrgId
   * @param conOrgCode
   * @param conOrgName
   * @param enabled
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasRouteDTO> findBy(
      @RequestParam(required = false, value = "waveNum") Integer waveNum,
      @RequestParam(required = false, value = "sendPlace") String sendPlace,
      @RequestParam(required = false, value = "receivePlace") String receivePlace,
      @RequestParam(required = false, value = "transMode") String transMode,
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "conOrgId") Long conOrgId,
      @RequestParam(required = false, value = "conOrgCode") String conOrgCode,
      @RequestParam(required = false, value = "conOrgName") String conOrgName,
      @RequestParam(required = false, value = "enabled") Integer enabled,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basRouteService.findBy(
        waveNum,
        sendPlace,
        receivePlace,
        transMode,
        code,
        name,
        conOrgId,
        conOrgCode,
        conOrgName,
        enabled,
        entId,
        pageable);
  }
}
