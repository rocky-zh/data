package com.pagoda.test.web.group;

import com.pagoda.test.api.*;
import com.pagoda.test.api.group.*;
import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.validator.group.*;

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
import static com.pagoda.test.api.dto.group.InvCheckStockHeadDTO.Getters.*;

/**
 * 模型InvCheckStockHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/InvCheckStockHeadService")
@Slf4j
public class InvCheckStockHeadController implements InitializingBean {
  @Autowired private InvCheckStockHeadService invCheckStockHeadService;

  @Autowired private InvCheckStockHeadValidator invCheckStockHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (invCheckStockHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(invCheckStockHeadValidator);
    }
  }

  /**
   * 插入一条InvCheckStockHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条InvCheckStockHead记录")
  @PostMapping(value = "/create")
  public InvCheckStockHeadDTO create(@Valid @RequestBody InvCheckStockHeadDTO dto) {
    return invCheckStockHeadService.create(dto);
  }

  /**
   * 删除一条InvCheckStockHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条InvCheckStockHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    invCheckStockHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条InvCheckStockHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条InvCheckStockHead记录")
  @PostMapping(value = "/update")
  public InvCheckStockHeadDTO update(@RequestBody InvCheckStockHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return invCheckStockHeadService.update(dto);
  }

  /**
   * 根据主键查询InvCheckStockHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录InvCheckStockHead记录")
  @GetMapping(value = "/getById")
  public InvCheckStockHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return invCheckStockHeadService.getById(id);
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
  public Iterable<InvCheckStockHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return invCheckStockHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param active
   * @param adjustDate
   * @param adjustUserId
   * @param billDate
   * @param billNo
   * @param billType
   * @param checkQty
   * @param checkStatus
   * @param checkType
   * @param depotCode
   * @param depotId
   * @param depotName
   * @param enabled
   * @param entId
   * @param periodNo
   * @param remark
   * @param ioLimit
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<InvCheckStockHeadDTO> findBy(
      @RequestParam(required = false, value = "active") Boolean active,
      @RequestParam(required = false, value = "adjustDate") java.sql.Timestamp adjustDate,
      @RequestParam(required = false, value = "adjustUserId") String adjustUserId,
      @RequestParam(required = false, value = "billDate") java.util.Date billDate,
      @RequestParam(required = false, value = "billNo") Long billNo,
      @RequestParam(required = false, value = "billType") String billType,
      @RequestParam(required = false, value = "checkQty") Long checkQty,
      @RequestParam(required = false, value = "checkStatus") Integer checkStatus,
      @RequestParam(required = false, value = "checkType") Integer checkType,
      @RequestParam(required = false, value = "depotCode") String depotCode,
      @RequestParam(required = false, value = "depotId") Long depotId,
      @RequestParam(required = false, value = "depotName") String depotName,
      @RequestParam(required = false, value = "enabled") Boolean enabled,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "periodNo") Long periodNo,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "ioLimit") Boolean ioLimit,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return invCheckStockHeadService.findBy(
        active,
        adjustDate,
        adjustUserId,
        billDate,
        billNo,
        billType,
        checkQty,
        checkStatus,
        checkType,
        depotCode,
        depotId,
        depotName,
        enabled,
        entId,
        periodNo,
        remark,
        ioLimit,
        pageable);
  }
}
