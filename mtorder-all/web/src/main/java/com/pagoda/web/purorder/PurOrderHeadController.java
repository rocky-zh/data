package com.pagoda.web.purorder;

import com.pagoda.api.*;
import com.pagoda.api.purorder.*;
import com.pagoda.api.dto.purorder.*;
import com.pagoda.validator.purorder.*;

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
import static com.pagoda.api.dto.purorder.PurOrderHeadDTO.Getters.*;

/**
 * 模型PurOrderHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PurOrderHeadService")
@Slf4j
public class PurOrderHeadController implements InitializingBean {
  @Autowired private PurOrderHeadService purOrderHeadService;

  @Autowired private PurOrderHeadValidator purOrderHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (purOrderHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(purOrderHeadValidator);
    }
  }

  /**
   * 插入一条PurOrderHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条PurOrderHead记录")
  @PostMapping(value = "/create")
  public PurOrderHeadDTO create(@Valid @RequestBody PurOrderHeadDTO dto) {
    return purOrderHeadService.create(dto);
  }

  /**
   * 删除一条PurOrderHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条PurOrderHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    purOrderHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条PurOrderHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条PurOrderHead记录")
  @PostMapping(value = "/update")
  public PurOrderHeadDTO update(@RequestBody PurOrderHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return purOrderHeadService.update(dto);
  }

  /**
   * 根据主键查询PurOrderHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录PurOrderHead记录")
  @GetMapping(value = "/getById")
  public PurOrderHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return purOrderHeadService.getById(id);
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
  public Iterable<PurOrderHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return purOrderHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param entId
   * @param seqno
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param venComfirmStatus
   * @param venComfirmUserCode
   * @param venComfirmUserName
   * @param orderStatus
   * @param planRecDate
   * @param auditorCode
   * @param auditorName
   * @param auditTime
   * @param bpmnStatus
   * @param bpmnRemark
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<PurOrderHeadDTO> findBy(
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "seqno") String seqno,
      @RequestParam(required = false, value = "venOrgId") Long venOrgId,
      @RequestParam(required = false, value = "venOrgCode") String venOrgCode,
      @RequestParam(required = false, value = "venOrgName") String venOrgName,
      @RequestParam(required = false, value = "venComfirmStatus") Integer venComfirmStatus,
      @RequestParam(required = false, value = "venComfirmUserCode") String venComfirmUserCode,
      @RequestParam(required = false, value = "venComfirmUserName") String venComfirmUserName,
      @RequestParam(required = false, value = "orderStatus") Integer orderStatus,
      @RequestParam(required = false, value = "planRecDate") java.util.Date planRecDate,
      @RequestParam(required = false, value = "auditorCode") String auditorCode,
      @RequestParam(required = false, value = "auditorName") String auditorName,
      @RequestParam(required = false, value = "auditTime") java.util.Date auditTime,
      @RequestParam(required = false, value = "bpmnStatus") Integer bpmnStatus,
      @RequestParam(required = false, value = "bpmnRemark") String bpmnRemark,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return purOrderHeadService.findBy(
        entId,
        seqno,
        venOrgId,
        venOrgCode,
        venOrgName,
        venComfirmStatus,
        venComfirmUserCode,
        venComfirmUserName,
        orderStatus,
        planRecDate,
        auditorCode,
        auditorName,
        auditTime,
        bpmnStatus,
        bpmnRemark,
        pageable);
  }
}
