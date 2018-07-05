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
import static com.pagoda.api.dto.goods.BasGoodsProcessHeadDTO.Getters.*;

/**
 * 模型BasGoodsProcessHead对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasGoodsProcessHeadService")
@Slf4j
public class BasGoodsProcessHeadController implements InitializingBean {
  @Autowired private BasGoodsProcessHeadService basGoodsProcessHeadService;

  @Autowired private BasGoodsProcessHeadValidator basGoodsProcessHeadValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basGoodsProcessHeadValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basGoodsProcessHeadValidator);
    }
  }

  /**
   * 插入一条BasGoodsProcessHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasGoodsProcessHead记录")
  @PostMapping(value = "/create")
  public BasGoodsProcessHeadDTO create(@Valid @RequestBody BasGoodsProcessHeadDTO dto) {
    return basGoodsProcessHeadService.create(dto);
  }

  /**
   * 删除一条BasGoodsProcessHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasGoodsProcessHead记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basGoodsProcessHeadService.delete(id);
    return true;
  }

  /**
   * 更新一条BasGoodsProcessHead记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasGoodsProcessHead记录")
  @PostMapping(value = "/update")
  public BasGoodsProcessHeadDTO update(@RequestBody BasGoodsProcessHeadDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basGoodsProcessHeadService.update(dto);
  }

  /**
   * 根据主键查询BasGoodsProcessHead记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasGoodsProcessHead记录")
  @GetMapping(value = "/getById")
  public BasGoodsProcessHeadDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basGoodsProcessHeadService.getById(id);
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
  public Iterable<BasGoodsProcessHeadDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basGoodsProcessHeadService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param isDefault
   * @param rankNum
   * @param code
   * @param name
   * @param isEnabled
   * @param remark
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasGoodsProcessHeadDTO> findBy(
      @RequestParam(required = false, value = "orgOrgId") Long orgOrgId,
      @RequestParam(required = false, value = "orgOrgCode") String orgOrgCode,
      @RequestParam(required = false, value = "orgOrgName") String orgOrgName,
      @RequestParam(required = false, value = "isDefault") Integer isDefault,
      @RequestParam(required = false, value = "rankNum") Integer rankNum,
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basGoodsProcessHeadService.findBy(
        orgOrgId,
        orgOrgCode,
        orgOrgName,
        isDefault,
        rankNum,
        code,
        name,
        isEnabled,
        remark,
        entId,
        pageable);
  }
}
