package com.pagoda.web.goods;

import com.pagoda.api.*;
import com.pagoda.api.goods.*;
import com.pagoda.api.dto.goods.*;
import com.pagoda.validator.goods.*;

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
import static com.pagoda.api.dto.goods.BasGoodsBomHeadDTO.Getters.*;

/**
 * 模型BasGoodsBomHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasGoodsBomHeadService")
@Slf4j
public class BasGoodsBomHeadController implements InitializingBean {
  @Autowired private BasGoodsBomHeadService basGoodsBomHeadService;

  @Autowired private BasGoodsBomHeadValidator basGoodsBomHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basGoodsBomHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basGoodsBomHeadValidator);
    }
  }

  /**
   * 插入一条BasGoodsBomHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasGoodsBomHead记录")
  @PostMapping(value = "/create")
  public BasGoodsBomHeadDTO create(@Valid @RequestBody BasGoodsBomHeadDTO dto) {
    return basGoodsBomHeadService.create(dto);
  }

  /**
   * 删除一条BasGoodsBomHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasGoodsBomHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basGoodsBomHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条BasGoodsBomHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasGoodsBomHead记录")
  @PostMapping(value = "/update")
  public BasGoodsBomHeadDTO update(@RequestBody BasGoodsBomHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basGoodsBomHeadService.update(dto);
  }

  /**
   * 根据主键查询BasGoodsBomHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasGoodsBomHead记录")
  @GetMapping(value = "/getById")
  public BasGoodsBomHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basGoodsBomHeadService.getById(id);
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
  public Iterable<BasGoodsBomHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basGoodsBomHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param inDepotId
   * @param inDepotName
   * @param name
   * @param searchWord
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param goodsProcId
   * @param goodsProcCode
   * @param goodsProcName
   * @param isEnabled
   * @param isDefault
   * @param remark
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasGoodsBomHeadDTO> findBy(
      @RequestParam(required = false, value = "inDepotId") Long inDepotId,
      @RequestParam(required = false, value = "inDepotName") String inDepotName,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "searchWord") String searchWord,
      @RequestParam(required = false, value = "unitId") Long unitId,
      @RequestParam(required = false, value = "unitCode") String unitCode,
      @RequestParam(required = false, value = "unitName") String unitName,
      @RequestParam(required = false, value = "orgOrgId") Long orgOrgId,
      @RequestParam(required = false, value = "orgOrgCode") String orgOrgCode,
      @RequestParam(required = false, value = "orgOrgName") String orgOrgName,
      @RequestParam(required = false, value = "goodsProcId") Long goodsProcId,
      @RequestParam(required = false, value = "goodsProcCode") String goodsProcCode,
      @RequestParam(required = false, value = "goodsProcName") String goodsProcName,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "isDefault") Integer isDefault,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basGoodsBomHeadService.findBy(
        inDepotId,
        inDepotName,
        name,
        searchWord,
        unitId,
        unitCode,
        unitName,
        orgOrgId,
        orgOrgCode,
        orgOrgName,
        goodsProcId,
        goodsProcCode,
        goodsProcName,
        isEnabled,
        isDefault,
        remark,
        entId,
        pageable);
  }
}
