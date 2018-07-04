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
import static com.pagoda.api.dto.org.BasOrgBalBankDTO.Getters.*;

/**
 * 模型BasOrgBalBank对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgBalBankService")
@Slf4j
public class BasOrgBalBankController implements InitializingBean {
  @Autowired private BasOrgBalBankService basOrgBalBankService;

  @Autowired private BasOrgBalBankValidator basOrgBalBankValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgBalBankValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgBalBankValidator);
    }
  }

  /**
   * 插入一条BasOrgBalBank记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasOrgBalBank记录")
  @PostMapping(value = "/create")
  public BasOrgBalBankDTO create(@Valid @RequestBody BasOrgBalBankDTO dto) {
    return basOrgBalBankService.create(dto);
  }

  /**
   * 删除一条BasOrgBalBank记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasOrgBalBank记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgBalBankService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrgBalBank记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasOrgBalBank记录")
  @PostMapping(value = "/update")
  public BasOrgBalBankDTO update(@RequestBody BasOrgBalBankDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgBalBankService.update(dto);
  }

  /**
   * 根据主键查询BasOrgBalBank记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasOrgBalBank记录")
  @GetMapping(value = "/getById")
  public BasOrgBalBankDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgBalBankService.getById(id);
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
  public Iterable<BasOrgBalBankDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgBalBankService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param bank
   * @param provinceName
   * @param cityName
   * @param registerBank
   * @param accountName
   * @param bankAccountNo
   * @param cityCode
   * @param provinceCode
   * @param balOrgId
   * @param isDefault
   * @param remark
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasOrgBalBankDTO> findBy(
      @RequestParam(required = false, value = "bank") String bank,
      @RequestParam(required = false, value = "provinceName") String provinceName,
      @RequestParam(required = false, value = "cityName") String cityName,
      @RequestParam(required = false, value = "registerBank") String registerBank,
      @RequestParam(required = false, value = "accountName") String accountName,
      @RequestParam(required = false, value = "bankAccountNo") String bankAccountNo,
      @RequestParam(required = false, value = "cityCode") String cityCode,
      @RequestParam(required = false, value = "provinceCode") String provinceCode,
      @RequestParam(required = false, value = "balOrgId") Long balOrgId,
      @RequestParam(required = false, value = "isDefault") Integer isDefault,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgBalBankService.findBy(
        bank,
        provinceName,
        cityName,
        registerBank,
        accountName,
        bankAccountNo,
        cityCode,
        provinceCode,
        balOrgId,
        isDefault,
        remark,
        pageable);
  }
}
