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
import static com.pagoda.api.dto.purorgven.BasVenRebateOrgDetailDTO.Getters.*;

/**
 * 模型BasVenRebateOrgDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasVenRebateOrgDetailService")
@Slf4j
public class BasVenRebateOrgDetailController implements InitializingBean {
  @Autowired private BasVenRebateOrgDetailService basVenRebateOrgDetailService;

  @Autowired private BasVenRebateOrgDetailValidator basVenRebateOrgDetailValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basVenRebateOrgDetailValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basVenRebateOrgDetailValidator);
    }
  }

  /**
   * 插入一条BasVenRebateOrgDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasVenRebateOrgDetail记录")
  @PostMapping(value = "/create")
  public BasVenRebateOrgDetailDTO create(@Valid @RequestBody BasVenRebateOrgDetailDTO dto) {
    return basVenRebateOrgDetailService.create(dto);
  }

  /**
   * 删除一条BasVenRebateOrgDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasVenRebateOrgDetail记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basVenRebateOrgDetailService.delete(id);
    return true;
  }

  /**
   * 更新一条BasVenRebateOrgDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasVenRebateOrgDetail记录")
  @PostMapping(value = "/update")
  public BasVenRebateOrgDetailDTO update(@RequestBody BasVenRebateOrgDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basVenRebateOrgDetailService.update(dto);
  }

  /**
   * 根据主键查询BasVenRebateOrgDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasVenRebateOrgDetail记录")
  @GetMapping(value = "/getById")
  public BasVenRebateOrgDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basVenRebateOrgDetailService.getById(id);
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
  public Iterable<BasVenRebateOrgDetailDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basVenRebateOrgDetailService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param rebateId
   * @param rebateNo
   * @param arrOrgId
   * @param arrOrgCode
   * @param arrOrgName
   * @param entId
   * @param effectDate
   * @param expiryDate
   * @param status
   * @param remark
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasVenRebateOrgDetailDTO> findBy(
      @RequestParam(required = false, value = "rebateId") Long rebateId,
      @RequestParam(required = false, value = "rebateNo") String rebateNo,
      @RequestParam(required = false, value = "arrOrgId") Long arrOrgId,
      @RequestParam(required = false, value = "arrOrgCode") String arrOrgCode,
      @RequestParam(required = false, value = "arrOrgName") String arrOrgName,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "effectDate") java.util.Date effectDate,
      @RequestParam(required = false, value = "expiryDate") java.util.Date expiryDate,
      @RequestParam(required = false, value = "status") Integer status,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basVenRebateOrgDetailService.findBy(
        rebateId,
        rebateNo,
        arrOrgId,
        arrOrgCode,
        arrOrgName,
        entId,
        effectDate,
        expiryDate,
        status,
        remark,
        pageable);
  }
}
