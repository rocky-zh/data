package com.pagoda.test.web.timegroup;

import com.pagoda.test.api.*;
import com.pagoda.test.api.timegroup.*;
import com.pagoda.test.api.dto.timegroup.*;
import com.pagoda.test.validator.timegroup.*;

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

import static com.pagoda.test.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.test.api.dto.timegroup.SalConsignDetailDTO.Getters.*;

/**
 * 模型SalConsignDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/SalConsignDetailService")
@Slf4j
public class SalConsignDetailController implements InitializingBean {
  @Autowired private SalConsignDetailService salConsignDetailService;

  @Autowired private SalConsignDetailValidator salConsignDetailValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (salConsignDetailValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(salConsignDetailValidator);
    }
  }

  /**
   * 插入一条SalConsignDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条SalConsignDetail记录")
  @PostMapping(value = "/create")
  public SalConsignDetailDTO create(@Valid @RequestBody SalConsignDetailDTO dto) {
    return salConsignDetailService.create(dto);
  }

  /**
   * 删除一条SalConsignDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条SalConsignDetail记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    salConsignDetailService.delete(id);
    return true;
  }

  /**
   * 更新一条SalConsignDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条SalConsignDetail记录")
  @PostMapping(value = "/update")
  public SalConsignDetailDTO update(@RequestBody SalConsignDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return salConsignDetailService.update(dto);
  }

  /**
   * 根据主键查询SalConsignDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录SalConsignDetail记录")
  @GetMapping(value = "/getById")
  public SalConsignDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return salConsignDetailService.getById(id);
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
  public Iterable<SalConsignDetailDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return salConsignDetailService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param mnemWord
   * @param registeBank
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<SalConsignDetailDTO> findBy(
      @RequestParam(required = false, value = "mnemWord") String mnemWord,
      @RequestParam(required = false, value = "registeBank") String registeBank,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return salConsignDetailService.findBy(mnemWord, registeBank, pageable);
  }
}
