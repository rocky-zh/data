package com.pagoda.web.purorgven;

import com.pagoda.api.*;
import com.pagoda.api.purorgven.*;
import com.pagoda.api.dto.purorgven.*;
import com.pagoda.validator.purorgven.*;

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
import static com.pagoda.api.dto.purorgven.BasVenRebateHeadDTO.Getters.*;

/**
 * 模型BasVenRebateHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasVenRebateHeadService")
@Slf4j
public class BasVenRebateHeadController implements InitializingBean {
  @Autowired private BasVenRebateHeadService basVenRebateHeadService;

  @Autowired private BasVenRebateHeadValidator basVenRebateHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basVenRebateHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basVenRebateHeadValidator);
    }
  }

  /**
   * 插入一条BasVenRebateHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasVenRebateHead记录")
  @PostMapping(value = "/create")
  public BasVenRebateHeadDTO create(@Valid @RequestBody BasVenRebateHeadDTO dto) {
    return basVenRebateHeadService.create(dto);
  }

  /**
   * 删除一条BasVenRebateHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasVenRebateHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basVenRebateHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条BasVenRebateHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasVenRebateHead记录")
  @PostMapping(value = "/update")
  public BasVenRebateHeadDTO update(@RequestBody BasVenRebateHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basVenRebateHeadService.update(dto);
  }

  /**
   * 根据主键查询BasVenRebateHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasVenRebateHead记录")
  @GetMapping(value = "/getById")
  public BasVenRebateHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basVenRebateHeadService.getById(id);
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
  public Iterable<BasVenRebateHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basVenRebateHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param no
   * @param balOrgId
   * @param balOrgCode
   * @param balOrgName
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param status
   * @param rebateMode
   * @param rebateRate
   * @param effectDate
   * @param expiryDate
   * @param isAllEffect
   * @param beginDate
   * @param endDate
   * @param remark
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasVenRebateHeadDTO> findBy(
      @RequestParam(required = false, value = "no") String no,
      @RequestParam(required = false, value = "balOrgId") Long balOrgId,
      @RequestParam(required = false, value = "balOrgCode") String balOrgCode,
      @RequestParam(required = false, value = "balOrgName") String balOrgName,
      @RequestParam(required = false, value = "venOrgId") Long venOrgId,
      @RequestParam(required = false, value = "venOrgCode") String venOrgCode,
      @RequestParam(required = false, value = "venOrgName") String venOrgName,
      @RequestParam(required = false, value = "status") Integer status,
      @RequestParam(required = false, value = "rebateMode") Integer rebateMode,
      @RequestParam(required = false, value = "rebateRate") java.math.BigDecimal rebateRate,
      @RequestParam(required = false, value = "effectDate") java.util.Date effectDate,
      @RequestParam(required = false, value = "expiryDate") java.util.Date expiryDate,
      @RequestParam(required = false, value = "isAllEffect") Integer isAllEffect,
      @RequestParam(required = false, value = "beginDate") java.util.Date beginDate,
      @RequestParam(required = false, value = "endDate") java.util.Date endDate,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basVenRebateHeadService.findBy(
        no,
        balOrgId,
        balOrgCode,
        balOrgName,
        venOrgId,
        venOrgCode,
        venOrgName,
        status,
        rebateMode,
        rebateRate,
        effectDate,
        expiryDate,
        isAllEffect,
        beginDate,
        endDate,
        remark,
        entId,
        pageable);
  }
}
