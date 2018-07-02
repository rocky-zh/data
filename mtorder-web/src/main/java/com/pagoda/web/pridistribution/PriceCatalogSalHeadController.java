package com.pagoda.web.pridistribution;

import com.pagoda.api.*;
import com.pagoda.api.pridistribution.*;
import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.validator.pridistribution.*;

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
import static com.pagoda.api.dto.pridistribution.PriceCatalogSalHeadDTO.Getters.*;

/**
 * 模型PriceCatalogSalHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PriceCatalogSalHeadService")
@Slf4j
public class PriceCatalogSalHeadController implements InitializingBean {
  @Autowired private PriceCatalogSalHeadService priceCatalogSalHeadService;

  @Autowired private PriceCatalogSalHeadValidator priceCatalogSalHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (priceCatalogSalHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(priceCatalogSalHeadValidator);
    }
  }

  /**
   * 插入一条PriceCatalogSalHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条PriceCatalogSalHead记录")
  @PostMapping(value = "/create")
  public PriceCatalogSalHeadDTO create(@Valid @RequestBody PriceCatalogSalHeadDTO dto) {
    return priceCatalogSalHeadService.create(dto);
  }

  /**
   * 删除一条PriceCatalogSalHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条PriceCatalogSalHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    priceCatalogSalHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条PriceCatalogSalHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条PriceCatalogSalHead记录")
  @PostMapping(value = "/update")
  public PriceCatalogSalHeadDTO update(@RequestBody PriceCatalogSalHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return priceCatalogSalHeadService.update(dto);
  }

  /**
   * 根据主键查询PriceCatalogSalHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录PriceCatalogSalHead记录")
  @GetMapping(value = "/getById")
  public PriceCatalogSalHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return priceCatalogSalHeadService.getById(id);
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
  public Iterable<PriceCatalogSalHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return priceCatalogSalHeadService.batchGetByIds(idList);
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
   * @param balOrgOrgId
   * @param balOrgOrgCode
   * @param balOrgOrgName
   * @param entId
   * @param isEnable
   * @param isUsed
   * @param remark
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<PriceCatalogSalHeadDTO> findBy(
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "balOrgOrgId") Long balOrgOrgId,
      @RequestParam(required = false, value = "balOrgOrgCode") String balOrgOrgCode,
      @RequestParam(required = false, value = "balOrgOrgName") String balOrgOrgName,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "isEnable") Integer isEnable,
      @RequestParam(required = false, value = "isUsed") Integer isUsed,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return priceCatalogSalHeadService.findBy(
        code,
        name,
        balOrgOrgId,
        balOrgOrgCode,
        balOrgOrgName,
        entId,
        isEnable,
        isUsed,
        remark,
        pageable);
  }
}
