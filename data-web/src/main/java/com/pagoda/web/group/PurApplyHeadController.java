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
 * 模型PurApplyHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PurApplyHeadService")
@Slf4j
public class PurApplyHeadController {
  @Autowired private PurApplyHeadService purApplyHeadService;

  @Autowired private PurApplyHeadValidator purApplyHeadValidator;

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
  @PostMapping(value = "/update")
  public PurApplyHeadDTO update(@RequestBody PurApplyHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return purApplyHeadService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public PurApplyHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return purApplyHeadService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
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
   * @param applyNo
   * @param applyOrgCode
   * @param applyOrgId
   * @param applyOrgName
   * @param applyStatus
   * @param calPurRate
   * @param calType
   * @param checkUserCode
   * @param checkUserId
   * @param checkUserName
   * @param checkdatetime
   * @param delId
   * @param planRecDate
   * @param recOrgCode
   * @param recOrgId
   * @param recOrgName
   * @param sourceType
   * @param active
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<PurApplyHeadDTO> findBy(
      @RequestParam(required = false, value = "applyNo") String applyNo,
      @RequestParam(required = false, value = "applyOrgCode") String applyOrgCode,
      @RequestParam(required = false, value = "applyOrgId") Integer applyOrgId,
      @RequestParam(required = false, value = "applyOrgName") String applyOrgName,
      @RequestParam(required = false, value = "applyStatus") Integer applyStatus,
      @RequestParam(required = false, value = "calPurRate") Double calPurRate,
      @RequestParam(required = false, value = "calType") Integer calType,
      @RequestParam(required = false, value = "checkUserCode") String checkUserCode,
      @RequestParam(required = false, value = "checkUserId") Integer checkUserId,
      @RequestParam(required = false, value = "checkUserName") String checkUserName,
      @RequestParam(required = false, value = "checkdatetime") java.sql.Timestamp checkdatetime,
      @RequestParam(required = false, value = "delId") Integer delId,
      @RequestParam(required = false, value = "planRecDate") java.sql.Timestamp planRecDate,
      @RequestParam(required = false, value = "recOrgCode") String recOrgCode,
      @RequestParam(required = false, value = "recOrgId") Integer recOrgId,
      @RequestParam(required = false, value = "recOrgName") String recOrgName,
      @RequestParam(required = false, value = "sourceType") Integer sourceType,
      @RequestParam(required = false, value = "active") Boolean active,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return purApplyHeadService.findBy(
        applyNo,
        applyOrgCode,
        applyOrgId,
        applyOrgName,
        applyStatus,
        calPurRate,
        calType,
        checkUserCode,
        checkUserId,
        checkUserName,
        checkdatetime,
        delId,
        planRecDate,
        recOrgCode,
        recOrgId,
        recOrgName,
        sourceType,
        active,
        pageable);
  }
}
