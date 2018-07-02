package com.pagoda.web.purapplyorder;

import com.pagoda.api.*;
import com.pagoda.api.purapplyorder.*;
import com.pagoda.api.dto.purapplyorder.*;
import com.pagoda.validator.purapplyorder.*;

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
import static com.pagoda.api.dto.purapplyorder.PurApplyHeadDTO.Getters.*;

/**
 * 模型PurApplyHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PurApplyHeadService")
@Slf4j
public class PurApplyHeadController implements InitializingBean {
  @Autowired private PurApplyHeadService purApplyHeadService;

  @Autowired private PurApplyHeadValidator purApplyHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (purApplyHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(purApplyHeadValidator);
    }
  }

  /**
   * 插入一条PurApplyHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条PurApplyHead记录")
  @PostMapping(value = "/create")
  public PurApplyHeadDTO create(@Valid @RequestBody PurApplyHeadDTO dto) {
    return purApplyHeadService.create(dto);
  }

  /**
   * 删除一条PurApplyHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条PurApplyHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    purApplyHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条PurApplyHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条PurApplyHead记录")
  @PostMapping(value = "/update")
  public PurApplyHeadDTO update(@RequestBody PurApplyHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return purApplyHeadService.update(dto);
  }

  /**
   * 根据主键查询PurApplyHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录PurApplyHead记录")
  @GetMapping(value = "/getById")
  public PurApplyHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return purApplyHeadService.getById(id);
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
  public Iterable<PurApplyHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return purApplyHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param seqno
   * @param entId
   * @param sourceType
   * @param applyOrgId
   * @param applyOrgCode
   * @param applyOrgName
   * @param arrOrgId
   * @param arrOrgCode
   * @param arrOrgName
   * @param planRecDate
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param applyStatus
   * @param calType
   * @param calPurRate
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<PurApplyHeadDTO> findBy(
      @RequestParam(required = false, value = "seqno") String seqno,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "sourceType") Integer sourceType,
      @RequestParam(required = false, value = "applyOrgId") Long applyOrgId,
      @RequestParam(required = false, value = "applyOrgCode") String applyOrgCode,
      @RequestParam(required = false, value = "applyOrgName") String applyOrgName,
      @RequestParam(required = false, value = "arrOrgId") Long arrOrgId,
      @RequestParam(required = false, value = "arrOrgCode") String arrOrgCode,
      @RequestParam(required = false, value = "arrOrgName") String arrOrgName,
      @RequestParam(required = false, value = "planRecDate") java.util.Date planRecDate,
      @RequestParam(required = false, value = "auditorCode") String auditorCode,
      @RequestParam(required = false, value = "auditorName") String auditorName,
      @RequestParam(required = false, value = "auditTime") java.sql.Timestamp auditTime,
      @RequestParam(required = false, value = "applyStatus") Integer applyStatus,
      @RequestParam(required = false, value = "calType") Integer calType,
      @RequestParam(required = false, value = "calPurRate") java.math.BigDecimal calPurRate,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return purApplyHeadService.findBy(
        seqno,
        entId,
        sourceType,
        applyOrgId,
        applyOrgCode,
        applyOrgName,
        arrOrgId,
        arrOrgCode,
        arrOrgName,
        planRecDate,
        auditorCode,
        auditorName,
        auditTime,
        applyStatus,
        calType,
        calPurRate,
        pageable);
  }
}
