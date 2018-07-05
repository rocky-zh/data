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
import static com.pagoda.api.dto.org.BasOrgBalDTO.Getters.*;

/**
 * 模型BasOrgBal对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgBalService")
@Slf4j
public class BasOrgBalController implements InitializingBean {
  @Autowired private BasOrgBalService basOrgBalService;

  @Autowired private BasOrgBalValidator basOrgBalValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

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
  @ApiOperation(value = "create", notes = "插入一条BasOrgBal记录")
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
  @ApiOperation(value = "delete", notes = "删除一条BasOrgBal记录")
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
  @ApiOperation(value = "update", notes = "更新一条BasOrgBal记录")
  @PostMapping(value = "/update")
  public BasOrgBalDTO update(@RequestBody BasOrgBalDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgBalService.update(dto);
  }

  /**
   * 根据主键查询BasOrgBal记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasOrgBal记录")
  @GetMapping(value = "/getById")
  public BasOrgBalDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgBalService.getById(id);
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
   * @param orgId
   * @param billName
   * @param maxBillAmt
   * @param isGoodsPrior
   * @param isDetailPrior
   * @param legalPerson
   * @param taxNumber
   * @param orgProperty
   * @param billAddress
   * @param billTelephone
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasOrgBalDTO> findBy(
      @RequestParam(required = false, value = "orgId") Long orgId,
      @RequestParam(required = false, value = "billName") String billName,
      @RequestParam(required = false, value = "maxBillAmt") java.math.BigDecimal maxBillAmt,
      @RequestParam(required = false, value = "isGoodsPrior") Integer isGoodsPrior,
      @RequestParam(required = false, value = "isDetailPrior") Integer isDetailPrior,
      @RequestParam(required = false, value = "legalPerson") String legalPerson,
      @RequestParam(required = false, value = "taxNumber") String taxNumber,
      @RequestParam(required = false, value = "orgProperty") Integer orgProperty,
      @RequestParam(required = false, value = "billAddress") String billAddress,
      @RequestParam(required = false, value = "billTelephone") String billTelephone,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgBalService.findBy(
        orgId,
        billName,
        maxBillAmt,
        isGoodsPrior,
        isDetailPrior,
        legalPerson,
        taxNumber,
        orgProperty,
        billAddress,
        billTelephone,
        pageable);
  }
}
