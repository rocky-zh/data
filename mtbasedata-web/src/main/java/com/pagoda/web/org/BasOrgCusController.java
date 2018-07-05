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
import static com.pagoda.api.dto.org.BasOrgCusDTO.Getters.*;

/**
 * 模型BasOrgCus对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgCusService")
@Slf4j
public class BasOrgCusController implements InitializingBean {
  @Autowired private BasOrgCusService basOrgCusService;

  @Autowired private BasOrgCusValidator basOrgCusValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgCusValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgCusValidator);
    }
  }

  /**
   * 插入一条BasOrgCus记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasOrgCus记录")
  @PostMapping(value = "/create")
  public BasOrgCusDTO create(@Valid @RequestBody BasOrgCusDTO dto) {
    return basOrgCusService.create(dto);
  }

  /**
   * 删除一条BasOrgCus记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasOrgCus记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgCusService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrgCus记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasOrgCus记录")
  @PostMapping(value = "/update")
  public BasOrgCusDTO update(@RequestBody BasOrgCusDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgCusService.update(dto);
  }

  /**
   * 根据主键查询BasOrgCus记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasOrgCus记录")
  @GetMapping(value = "/getById")
  public BasOrgCusDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgCusService.getById(id);
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
  public Iterable<BasOrgCusDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgCusService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param invLimitAmt
   * @param isInvLimitAmt
   * @param checkMinAmt
   * @param isOrderCheck
   * @param isReturnCheck
   * @param returnDealType
   * @param isModifyPrice
   * @param isModifyCheck
   * @param isCusInv
   * @param isAllotCheck
   * @param isClosed
   * @param isOrderPaused
   * @param shopOwnerName
   * @param shopOwnerPhone
   * @param openingDate
   * @param isOuterLeague
   * @param isAutoRecIn
   * @param enabledStatus
   * @param salConInDepotId
   * @param salRetOutDepotId
   * @param orgId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasOrgCusDTO> findBy(
      @RequestParam(required = false, value = "invLimitAmt") java.math.BigDecimal invLimitAmt,
      @RequestParam(required = false, value = "isInvLimitAmt") Integer isInvLimitAmt,
      @RequestParam(required = false, value = "checkMinAmt") Integer checkMinAmt,
      @RequestParam(required = false, value = "isOrderCheck") Integer isOrderCheck,
      @RequestParam(required = false, value = "isReturnCheck") Integer isReturnCheck,
      @RequestParam(required = false, value = "returnDealType") Integer returnDealType,
      @RequestParam(required = false, value = "isModifyPrice") Integer isModifyPrice,
      @RequestParam(required = false, value = "isModifyCheck") Integer isModifyCheck,
      @RequestParam(required = false, value = "isCusInv") Integer isCusInv,
      @RequestParam(required = false, value = "isAllotCheck") Integer isAllotCheck,
      @RequestParam(required = false, value = "isClosed") Integer isClosed,
      @RequestParam(required = false, value = "isOrderPaused") Integer isOrderPaused,
      @RequestParam(required = false, value = "shopOwnerName") String shopOwnerName,
      @RequestParam(required = false, value = "shopOwnerPhone") String shopOwnerPhone,
      @RequestParam(required = false, value = "openingDate") java.util.Date openingDate,
      @RequestParam(required = false, value = "isOuterLeague") Integer isOuterLeague,
      @RequestParam(required = false, value = "isAutoRecIn") Integer isAutoRecIn,
      @RequestParam(required = false, value = "enabledStatus") Integer enabledStatus,
      @RequestParam(required = false, value = "salConInDepotId") Long salConInDepotId,
      @RequestParam(required = false, value = "salRetOutDepotId") Long salRetOutDepotId,
      @RequestParam(required = false, value = "orgId") Long orgId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgCusService.findBy(
        invLimitAmt,
        isInvLimitAmt,
        checkMinAmt,
        isOrderCheck,
        isReturnCheck,
        returnDealType,
        isModifyPrice,
        isModifyCheck,
        isCusInv,
        isAllotCheck,
        isClosed,
        isOrderPaused,
        shopOwnerName,
        shopOwnerPhone,
        openingDate,
        isOuterLeague,
        isAutoRecIn,
        enabledStatus,
        salConInDepotId,
        salRetOutDepotId,
        orgId,
        pageable);
  }
}
