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
 * 模型BasOrgBalBank对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgBalBankService")
@Slf4j
public class BasOrgBalBankController {
  @Autowired private BasOrgBalBankService basOrgBalBankService;

  @Autowired private BasOrgBalBankValidator basOrgBalBankValidator;

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
  @PostMapping(value = "/update")
  public BasOrgBalBankDTO update(@RequestBody BasOrgBalBankDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgBalBankService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public BasOrgBalBankDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgBalBankService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
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
   * @param accountName
   * @param bank
   * @param bankAccountNo
   * @param cityCode
   * @param cityName
   * @param provinceCode
   * @param provinceName
   * @param registerBank
   * @param active
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<BasOrgBalBankDTO> findBy(
      @RequestParam(required = false, value = "accountName") String accountName,
      @RequestParam(required = false, value = "bank") String bank,
      @RequestParam(required = false, value = "bankAccountNo") String bankAccountNo,
      @RequestParam(required = false, value = "cityCode") String cityCode,
      @RequestParam(required = false, value = "cityName") String cityName,
      @RequestParam(required = false, value = "provinceCode") String provinceCode,
      @RequestParam(required = false, value = "provinceName") String provinceName,
      @RequestParam(required = false, value = "registerBank") String registerBank,
      @RequestParam(required = false, value = "active") Boolean active,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgBalBankService.findBy(
        accountName,
        bank,
        bankAccountNo,
        cityCode,
        cityName,
        provinceCode,
        provinceName,
        registerBank,
        active,
        pageable);
  }
}
