package com.pagoda.web.pripurchase;

import com.pagoda.api.*;
import com.pagoda.api.pripurchase.*;
import com.pagoda.api.dto.pripurchase.*;
import com.pagoda.validator.pripurchase.*;

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
import static com.pagoda.api.dto.pripurchase.PriceAdjustPurHeadDTO.Getters.*;

/**
 * 模型PriceAdjustPurHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PriceAdjustPurHeadService")
@Slf4j
public class PriceAdjustPurHeadController implements InitializingBean {
  @Autowired private PriceAdjustPurHeadService priceAdjustPurHeadService;

  @Autowired private PriceAdjustPurHeadValidator priceAdjustPurHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (priceAdjustPurHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(priceAdjustPurHeadValidator);
    }
  }

  /**
   * 插入一条PriceAdjustPurHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条PriceAdjustPurHead记录")
  @PostMapping(value = "/create")
  public PriceAdjustPurHeadDTO create(@Valid @RequestBody PriceAdjustPurHeadDTO dto) {
    return priceAdjustPurHeadService.create(dto);
  }

  /**
   * 删除一条PriceAdjustPurHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条PriceAdjustPurHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    priceAdjustPurHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条PriceAdjustPurHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条PriceAdjustPurHead记录")
  @PostMapping(value = "/update")
  public PriceAdjustPurHeadDTO update(@RequestBody PriceAdjustPurHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return priceAdjustPurHeadService.update(dto);
  }

  /**
   * 根据主键查询PriceAdjustPurHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录PriceAdjustPurHead记录")
  @GetMapping(value = "/getById")
  public PriceAdjustPurHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return priceAdjustPurHeadService.getById(id);
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
  public Iterable<PriceAdjustPurHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return priceAdjustPurHeadService.batchGetByIds(idList);
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
   * @param arrOrgId
   * @param arrOrgCode
   * @param arrOrgName
   * @param venOrgId
   * @param venOrgCode
   * @param status
   * @param effectDate
   * @param auditorCode
   * @param auditorName
   * @param remark
   * @param auditTime
   * @param note
   * @param venOrgName
   * @param commitTime
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<PriceAdjustPurHeadDTO> findBy(
      @RequestParam(required = false, value = "seqno") String seqno,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "arrOrgId") Long arrOrgId,
      @RequestParam(required = false, value = "arrOrgCode") String arrOrgCode,
      @RequestParam(required = false, value = "arrOrgName") String arrOrgName,
      @RequestParam(required = false, value = "venOrgId") Long venOrgId,
      @RequestParam(required = false, value = "venOrgCode") String venOrgCode,
      @RequestParam(required = false, value = "status") Integer status,
      @RequestParam(required = false, value = "effectDate") java.util.Date effectDate,
      @RequestParam(required = false, value = "auditorCode") String auditorCode,
      @RequestParam(required = false, value = "auditorName") String auditorName,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "auditTime") java.util.Date auditTime,
      @RequestParam(required = false, value = "note") String note,
      @RequestParam(required = false, value = "venOrgName") String venOrgName,
      @RequestParam(required = false, value = "commitTime") java.util.Date commitTime,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return priceAdjustPurHeadService.findBy(
        seqno,
        entId,
        arrOrgId,
        arrOrgCode,
        arrOrgName,
        venOrgId,
        venOrgCode,
        status,
        effectDate,
        auditorCode,
        auditorName,
        remark,
        auditTime,
        note,
        venOrgName,
        commitTime,
        pageable);
  }
}
