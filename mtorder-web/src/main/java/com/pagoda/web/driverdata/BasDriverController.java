package com.pagoda.web.driverdata;

import com.pagoda.api.*;
import com.pagoda.api.driverdata.*;
import com.pagoda.api.dto.driverdata.*;
import com.pagoda.validator.driverdata.*;

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
import static com.pagoda.api.dto.driverdata.BasDriverDTO.Getters.*;

/**
 * 模型BasDriver对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasDriverService")
@Slf4j
public class BasDriverController implements InitializingBean {
  @Autowired private BasDriverService basDriverService;

  @Autowired private BasDriverValidator basDriverValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basDriverValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basDriverValidator);
    }
  }

  /**
   * 插入一条BasDriver记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasDriver记录")
  @PostMapping(value = "/create")
  public BasDriverDTO create(@Valid @RequestBody BasDriverDTO dto) {
    return basDriverService.create(dto);
  }

  /**
   * 删除一条BasDriver记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasDriver记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basDriverService.delete(id);
    return true;
  }

  /**
   * 更新一条BasDriver记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasDriver记录")
  @PostMapping(value = "/update")
  public BasDriverDTO update(@RequestBody BasDriverDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basDriverService.update(dto);
  }

  /**
   * 根据主键查询BasDriver记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasDriver记录")
  @GetMapping(value = "/getById")
  public BasDriverDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basDriverService.getById(id);
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
  public Iterable<BasDriverDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basDriverService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param code
   * @param name
   * @param mobile
   * @param shortNum
   * @param plateNum
   * @param loadingWeight
   * @param loadingVolume
   * @param payAcountNo
   * @param registeBank
   * @param driverIdNumber
   * @param conOrgCode
   * @param conOrgName
   * @param enabled
   * @param remark
   * @param entId
   * @param conOrgId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasDriverDTO> findBy(
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "mobile") String mobile,
      @RequestParam(required = false, value = "shortNum") String shortNum,
      @RequestParam(required = false, value = "plateNum") String plateNum,
      @RequestParam(required = false, value = "loadingWeight") java.math.BigDecimal loadingWeight,
      @RequestParam(required = false, value = "loadingVolume") java.math.BigDecimal loadingVolume,
      @RequestParam(required = false, value = "payAcountNo") String payAcountNo,
      @RequestParam(required = false, value = "registeBank") String registeBank,
      @RequestParam(required = false, value = "driverIdNumber") String driverIdNumber,
      @RequestParam(required = false, value = "conOrgCode") String conOrgCode,
      @RequestParam(required = false, value = "conOrgName") String conOrgName,
      @RequestParam(required = false, value = "enabled") Integer enabled,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "conOrgId") Long conOrgId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basDriverService.findBy(
        code,
        name,
        mobile,
        shortNum,
        plateNum,
        loadingWeight,
        loadingVolume,
        payAcountNo,
        registeBank,
        driverIdNumber,
        conOrgCode,
        conOrgName,
        enabled,
        remark,
        entId,
        conOrgId,
        pageable);
  }
}
