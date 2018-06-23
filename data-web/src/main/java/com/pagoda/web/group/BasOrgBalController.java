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
 * 模型BasOrgBal对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgBalService")
@Slf4j
public class BasOrgBalController {
  @Autowired private BasOrgBalService basOrgBalService;

  @Autowired private BasOrgBalValidator basOrgBalValidator;

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgBalValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgBalValidator);
    }
  }

  /**
   * 插入一条BasOrgBal记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public BasOrgBalDTO create(@Valid @RequestBody BasOrgBalDTO dto) {
    return basOrgBalService.create(dto);
  }

  /**
   * 删除一条BasOrgBal记录
   *
   * @param id
   * @return
   */
  @Timed
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgBalService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrgBal记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/update")
  public BasOrgBalDTO update(@RequestBody BasOrgBalDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgBalService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public BasOrgBalDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgBalService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @GetMapping(value = "/batchGetByIds")
  public Iterable<BasOrgBalDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgBalService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param billAddress
   * @param billName
   * @param billTelephone
   * @param isDetailPrior
   * @param isGoodsPrior
   * @param legalPerson
   * @param maxBillAmt
   * @param orgProperty
   * @param taxNumber
   * @param active
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<BasOrgBalDTO> findBy(
      @RequestParam(required = false, value = "billAddress") String billAddress,
      @RequestParam(required = false, value = "billName") String billName,
      @RequestParam(required = false, value = "billTelephone") String billTelephone,
      @RequestParam(required = false, value = "isDetailPrior") Integer isDetailPrior,
      @RequestParam(required = false, value = "isGoodsPrior") Integer isGoodsPrior,
      @RequestParam(required = false, value = "legalPerson") String legalPerson,
      @RequestParam(required = false, value = "maxBillAmt") java.math.BigDecimal maxBillAmt,
      @RequestParam(required = false, value = "orgProperty") Integer orgProperty,
      @RequestParam(required = false, value = "taxNumber") String taxNumber,
      @RequestParam(required = false, value = "active") Boolean active,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgBalService.findBy(
        billAddress,
        billName,
        billTelephone,
        isDetailPrior,
        isGoodsPrior,
        legalPerson,
        maxBillAmt,
        orgProperty,
        taxNumber,
        active,
        pageable);
  }
}
