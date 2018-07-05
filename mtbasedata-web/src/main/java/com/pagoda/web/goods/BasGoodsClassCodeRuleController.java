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
import static com.pagoda.api.dto.goods.BasGoodsClassCodeRuleDTO.Getters.*;

/**
 * 模型BasGoodsClassCodeRule对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasGoodsClassCodeRuleService")
@Slf4j
public class BasGoodsClassCodeRuleController implements InitializingBean {
  @Autowired private BasGoodsClassCodeRuleService basGoodsClassCodeRuleService;

  @Autowired private BasGoodsClassCodeRuleValidator basGoodsClassCodeRuleValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basGoodsClassCodeRuleValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basGoodsClassCodeRuleValidator);
    }
  }

  /**
   * 插入一条BasGoodsClassCodeRule记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasGoodsClassCodeRule记录")
  @PostMapping(value = "/create")
  public BasGoodsClassCodeRuleDTO create(@Valid @RequestBody BasGoodsClassCodeRuleDTO dto) {
    return basGoodsClassCodeRuleService.create(dto);
  }

  /**
   * 删除一条BasGoodsClassCodeRule记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasGoodsClassCodeRule记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basGoodsClassCodeRuleService.delete(id);
    return true;
  }

  /**
   * 更新一条BasGoodsClassCodeRule记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasGoodsClassCodeRule记录")
  @PostMapping(value = "/update")
  public BasGoodsClassCodeRuleDTO update(@RequestBody BasGoodsClassCodeRuleDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basGoodsClassCodeRuleService.update(dto);
  }

  /**
   * 根据主键查询BasGoodsClassCodeRule记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasGoodsClassCodeRule记录")
  @GetMapping(value = "/getById")
  public BasGoodsClassCodeRuleDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basGoodsClassCodeRuleService.getById(id);
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
  public Iterable<BasGoodsClassCodeRuleDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basGoodsClassCodeRuleService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param codeRuleId
   * @param name
   * @param goodsClassId
   * @param goodsClassCode
   * @param goodsClassName
   * @param isEnabled
   * @param isDefault
   * @param remark
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasGoodsClassCodeRuleDTO> findBy(
      @RequestParam(required = false, value = "codeRuleId") Long codeRuleId,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "goodsClassId") Long goodsClassId,
      @RequestParam(required = false, value = "goodsClassCode") String goodsClassCode,
      @RequestParam(required = false, value = "goodsClassName") String goodsClassName,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "isDefault") Integer isDefault,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basGoodsClassCodeRuleService.findBy(
        codeRuleId,
        name,
        goodsClassId,
        goodsClassCode,
        goodsClassName,
        isEnabled,
        isDefault,
        remark,
        pageable);
  }
}
