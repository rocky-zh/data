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
import static com.pagoda.api.dto.org.BasOrgDTO.Getters.*;

/**
 * 模型BasOrg对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgService")
@Slf4j
public class BasOrgController implements InitializingBean {
  @Autowired private BasOrgService basOrgService;

  @Autowired private BasOrgValidator basOrgValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

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
  @ApiOperation(value = "create", notes = "插入一条BasOrg记录")
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
  @ApiOperation(value = "delete", notes = "删除一条BasOrg记录")
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
  @ApiOperation(value = "update", notes = "更新一条BasOrg记录")
  @PostMapping(value = "/update")
  public BasOrgDTO update(@RequestBody BasOrgDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgService.update(dto);
  }

  /**
   * 根据主键查询BasOrg记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasOrg记录")
  @GetMapping(value = "/getById")
  public BasOrgDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgService.getById(id);
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
   * @param isCus
   * @param isOrg
   * @param isVen
   * @param isOut
   * @param isDep
   * @param depCode
   * @param depId
   * @param depName
   * @param isBal
   * @param isOrgGroup
   * @param balOrgId
   * @param balOrgName
   * @param registerAddress
   * @param address
   * @param contactPerson
   * @param telephone
   * @param mobilephone
   * @param email
   * @param code
   * @param name
   * @param entId
   * @param isEnabled
   * @param remark
   * @param searchWord
   * @param showOrder
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasOrgDTO> findBy(
      @RequestParam(required = false, value = "isCus") Integer isCus,
      @RequestParam(required = false, value = "isOrg") Integer isOrg,
      @RequestParam(required = false, value = "isVen") Integer isVen,
      @RequestParam(required = false, value = "isOut") Integer isOut,
      @RequestParam(required = false, value = "isDep") Integer isDep,
      @RequestParam(required = false, value = "depCode") String depCode,
      @RequestParam(required = false, value = "depId") Long depId,
      @RequestParam(required = false, value = "depName") String depName,
      @RequestParam(required = false, value = "isBal") Integer isBal,
      @RequestParam(required = false, value = "isOrgGroup") Integer isOrgGroup,
      @RequestParam(required = false, value = "balOrgId") Long balOrgId,
      @RequestParam(required = false, value = "balOrgName") String balOrgName,
      @RequestParam(required = false, value = "registerAddress") String registerAddress,
      @RequestParam(required = false, value = "address") String address,
      @RequestParam(required = false, value = "contactPerson") String contactPerson,
      @RequestParam(required = false, value = "telephone") String telephone,
      @RequestParam(required = false, value = "mobilephone") String mobilephone,
      @RequestParam(required = false, value = "email") String email,
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "searchWord") String searchWord,
      @RequestParam(required = false, value = "showOrder") Integer showOrder,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgService.findBy(
        isCus,
        isOrg,
        isVen,
        isOut,
        isDep,
        depCode,
        depId,
        depName,
        isBal,
        isOrgGroup,
        balOrgId,
        balOrgName,
        registerAddress,
        address,
        contactPerson,
        telephone,
        mobilephone,
        email,
        code,
        name,
        entId,
        isEnabled,
        remark,
        searchWord,
        showOrder,
        pageable);
  }
}
