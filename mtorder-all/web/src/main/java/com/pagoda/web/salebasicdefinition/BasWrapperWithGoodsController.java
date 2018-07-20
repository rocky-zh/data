package com.pagoda.web.salebasicdefinition;

import com.pagoda.api.*;
import com.pagoda.api.salebasicdefinition.*;
import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.validator.salebasicdefinition.*;

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
import static com.pagoda.api.dto.salebasicdefinition.BasWrapperWithGoodsDTO.Getters.*;

/**
 * 模型BasWrapperWithGoods对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasWrapperWithGoodsService")
@Slf4j
public class BasWrapperWithGoodsController implements InitializingBean {
  @Autowired private BasWrapperWithGoodsService basWrapperWithGoodsService;

  @Autowired private BasWrapperWithGoodsValidator basWrapperWithGoodsValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basWrapperWithGoodsValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basWrapperWithGoodsValidator);
    }
  }

  /**
   * 插入一条BasWrapperWithGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasWrapperWithGoods记录")
  @PostMapping(value = "/create")
  public BasWrapperWithGoodsDTO create(@Valid @RequestBody BasWrapperWithGoodsDTO dto) {
    return basWrapperWithGoodsService.create(dto);
  }

  /**
   * 删除一条BasWrapperWithGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasWrapperWithGoods记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basWrapperWithGoodsService.delete(id);
    return true;
  }

  /**
   * 更新一条BasWrapperWithGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasWrapperWithGoods记录")
  @PostMapping(value = "/update")
  public BasWrapperWithGoodsDTO update(@RequestBody BasWrapperWithGoodsDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basWrapperWithGoodsService.update(dto);
  }

  /**
   * 根据主键查询BasWrapperWithGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasWrapperWithGoods记录")
  @GetMapping(value = "/getById")
  public BasWrapperWithGoodsDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basWrapperWithGoodsService.getById(id);
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
  public Iterable<BasWrapperWithGoodsDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basWrapperWithGoodsService.batchGetByIds(idList);
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
   * @param mainGoodsId
   * @param mainGoodsCode
   * @param mainGoodsName
   * @param mainUnitId
   * @param mainUnitName
   * @param mainCardinal
   * @param wrapGoodsId
   * @param wrapGoodsCode
   * @param wrapGoodsName
   * @param wrapUnitId
   * @param wrapUnitName
   * @param wrapCardinal
   * @param isRound
   * @param isEnabled
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasWrapperWithGoodsDTO> findBy(
      @RequestParam(required = false, value = "orgOrgId") Long orgOrgId,
      @RequestParam(required = false, value = "orgOrgCode") String orgOrgCode,
      @RequestParam(required = false, value = "orgOrgName") String orgOrgName,
      @RequestParam(required = false, value = "mainGoodsId") Long mainGoodsId,
      @RequestParam(required = false, value = "mainGoodsCode") String mainGoodsCode,
      @RequestParam(required = false, value = "mainGoodsName") String mainGoodsName,
      @RequestParam(required = false, value = "mainUnitId") Long mainUnitId,
      @RequestParam(required = false, value = "mainUnitName") String mainUnitName,
      @RequestParam(required = false, value = "mainCardinal") java.math.BigDecimal mainCardinal,
      @RequestParam(required = false, value = "wrapGoodsId") Long wrapGoodsId,
      @RequestParam(required = false, value = "wrapGoodsCode") String wrapGoodsCode,
      @RequestParam(required = false, value = "wrapGoodsName") String wrapGoodsName,
      @RequestParam(required = false, value = "wrapUnitId") Long wrapUnitId,
      @RequestParam(required = false, value = "wrapUnitName") String wrapUnitName,
      @RequestParam(required = false, value = "wrapCardinal") java.math.BigDecimal wrapCardinal,
      @RequestParam(required = false, value = "isRound") Integer isRound,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basWrapperWithGoodsService.findBy(
        orgOrgId,
        orgOrgCode,
        orgOrgName,
        mainGoodsId,
        mainGoodsCode,
        mainGoodsName,
        mainUnitId,
        mainUnitName,
        mainCardinal,
        wrapGoodsId,
        wrapGoodsCode,
        wrapGoodsName,
        wrapUnitId,
        wrapUnitName,
        wrapCardinal,
        isRound,
        isEnabled,
        pageable);
  }
}
