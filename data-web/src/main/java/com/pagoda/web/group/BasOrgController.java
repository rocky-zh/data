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
 * 模型BasOrg对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgService")
@Slf4j
public class BasOrgController {
  @Autowired private BasOrgService basOrgService;

  @Autowired private BasOrgValidator basOrgValidator;

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgValidator);
    }
  }

  /**
   * 插入一条BasOrg记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public BasOrgDTO create(@Valid @RequestBody BasOrgDTO dto) {
    return basOrgService.create(dto);
  }

  /**
   * 删除一条BasOrg记录
   *
   * @param id
   * @return
   */
  @Timed
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrg记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/update")
  public BasOrgDTO update(@RequestBody BasOrgDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public BasOrgDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @GetMapping(value = "/batchGetByIds")
  public Iterable<BasOrgDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param balOrgName
   * @param contactPerson
   * @param depCode
   * @param depId
   * @param depName
   * @param email
   * @param isBal
   * @param isCus
   * @param isDep
   * @param isOrg
   * @param isOrgGroup
   * @param isOut
   * @param isVen
   * @param mobilePhone
   * @param registerAddress
   * @param telephone
   * @param code
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<BasOrgDTO> findBy(
      @RequestParam(required = false, value = "balOrgName") String balOrgName,
      @RequestParam(required = false, value = "contactPerson") String contactPerson,
      @RequestParam(required = false, value = "depCode") String depCode,
      @RequestParam(required = false, value = "depId") Long depId,
      @RequestParam(required = false, value = "depName") String depName,
      @RequestParam(required = false, value = "email") String email,
      @RequestParam(required = false, value = "isBal") Integer isBal,
      @RequestParam(required = false, value = "isCus") Integer isCus,
      @RequestParam(required = false, value = "isDep") Integer isDep,
      @RequestParam(required = false, value = "isOrg") Integer isOrg,
      @RequestParam(required = false, value = "isOrgGroup") Integer isOrgGroup,
      @RequestParam(required = false, value = "isOut") Integer isOut,
      @RequestParam(required = false, value = "isVen") Integer isVen,
      @RequestParam(required = false, value = "mobilePhone") String mobilePhone,
      @RequestParam(required = false, value = "registerAddress") String registerAddress,
      @RequestParam(required = false, value = "telephone") String telephone,
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgService.findBy(
        balOrgName,
        contactPerson,
        depCode,
        depId,
        depName,
        email,
        isBal,
        isCus,
        isDep,
        isOrg,
        isOrgGroup,
        isOut,
        isVen,
        mobilePhone,
        registerAddress,
        telephone,
        code,
        pageable);
  }
}
