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
import static com.pagoda.api.dto.goods.BasGoodsBomDetailDTO.Getters.*;

/**
 * 模型BasGoodsBomDetail对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasGoodsBomDetailService")
@Slf4j
public class BasGoodsBomDetailController implements InitializingBean {
  @Autowired private BasGoodsBomDetailService basGoodsBomDetailService;

  @Autowired private BasGoodsBomDetailValidator basGoodsBomDetailValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basGoodsBomDetailValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basGoodsBomDetailValidator);
    }
  }

  /**
   * 插入一条BasGoodsBomDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasGoodsBomDetail记录")
  @PostMapping(value = "/create")
  public BasGoodsBomDetailDTO create(@Valid @RequestBody BasGoodsBomDetailDTO dto) {
    return basGoodsBomDetailService.create(dto);
  }

  /**
   * 删除一条BasGoodsBomDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasGoodsBomDetail记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basGoodsBomDetailService.delete(id);
    return true;
  }

  /**
   * 更新一条BasGoodsBomDetail记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasGoodsBomDetail记录")
  @PostMapping(value = "/update")
  public BasGoodsBomDetailDTO update(@RequestBody BasGoodsBomDetailDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basGoodsBomDetailService.update(dto);
  }

  /**
   * 根据主键查询BasGoodsBomDetail记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasGoodsBomDetail记录")
  @GetMapping(value = "/getById")
  public BasGoodsBomDetailDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basGoodsBomDetailService.getById(id);
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
  public Iterable<BasGoodsBomDetailDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basGoodsBomDetailService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param outputGoodsId
   * @param outputGoodsName
   * @param feeId
   * @param inputGoodsId
   * @param inputGoodsName
   * @param inputGoodsQty
   * @param outDepotId
   * @param outDepotName
   * @param feeName
   * @param feeAmt
   * @param unitId
   * @param unitName
   * @param isEnabled
   * @param isDefault
   * @param rankNum
   * @param remark
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasGoodsBomDetailDTO> findBy(
      @RequestParam(required = false, value = "outputGoodsId") Long outputGoodsId,
      @RequestParam(required = false, value = "outputGoodsName") String outputGoodsName,
      @RequestParam(required = false, value = "feeId") Long feeId,
      @RequestParam(required = false, value = "inputGoodsId") Long inputGoodsId,
      @RequestParam(required = false, value = "inputGoodsName") String inputGoodsName,
      @RequestParam(required = false, value = "inputGoodsQty") java.math.BigDecimal inputGoodsQty,
      @RequestParam(required = false, value = "outDepotId") Long outDepotId,
      @RequestParam(required = false, value = "outDepotName") String outDepotName,
      @RequestParam(required = false, value = "feeName") String feeName,
      @RequestParam(required = false, value = "feeAmt") java.math.BigDecimal feeAmt,
      @RequestParam(required = false, value = "unitId") Long unitId,
      @RequestParam(required = false, value = "unitName") String unitName,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "isDefault") Integer isDefault,
      @RequestParam(required = false, value = "rankNum") Integer rankNum,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basGoodsBomDetailService.findBy(
        outputGoodsId,
        outputGoodsName,
        feeId,
        inputGoodsId,
        inputGoodsName,
        inputGoodsQty,
        outDepotId,
        outDepotName,
        feeName,
        feeAmt,
        unitId,
        unitName,
        isEnabled,
        isDefault,
        rankNum,
        remark,
        entId,
        pageable);
  }
}
