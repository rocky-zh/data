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
import static com.pagoda.api.dto.goods.BasOrgGoodsvarDTO.Getters.*;

/**
 * 模型BasOrgGoodsvar对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgGoodsvarService")
@Slf4j
public class BasOrgGoodsvarController implements InitializingBean {
  @Autowired private BasOrgGoodsvarService basOrgGoodsvarService;

  @Autowired private BasOrgGoodsvarValidator basOrgGoodsvarValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgGoodsvarValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgGoodsvarValidator);
    }
  }

  /**
   * 插入一条BasOrgGoodsvar记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasOrgGoodsvar记录")
  @PostMapping(value = "/create")
  public BasOrgGoodsvarDTO create(@Valid @RequestBody BasOrgGoodsvarDTO dto) {
    return basOrgGoodsvarService.create(dto);
  }

  /**
   * 删除一条BasOrgGoodsvar记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasOrgGoodsvar记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgGoodsvarService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrgGoodsvar记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasOrgGoodsvar记录")
  @PostMapping(value = "/update")
  public BasOrgGoodsvarDTO update(@RequestBody BasOrgGoodsvarDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgGoodsvarService.update(dto);
  }

  /**
   * 根据主键查询BasOrgGoodsvar记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasOrgGoodsvar记录")
  @GetMapping(value = "/getById")
  public BasOrgGoodsvarDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgGoodsvarService.getById(id);
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
  public Iterable<BasOrgGoodsvarDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgGoodsvarService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param badGoodsRate
   * @param prodArea
   * @param qualSituDesc
   * @param supplyStateDesc
   * @param supplyTrendDesc
   * @param isMustSale
   * @param mustSaleDesc
   * @param difference
   * @param goodsWrapDesc
   * @param goodsEva
   * @param techDesc
   * @param isBEnabledC
   * @param isCEnabledA
   * @param isCEnabledN
   * @param isCEnabledM
   * @param isCEnabledO
   * @param isCEnabledP
   * @param isCEnabledC
   * @param isCEnabledE
   * @param isCEnabledF
   * @param entId
   * @param orgId
   * @param goodsVarId
   * @param goodsId
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param unitRate
   * @param isSale
   * @param isReturn
   * @param isStockInv
   * @param isRet
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasOrgGoodsvarDTO> findBy(
      @RequestParam(required = false, value = "badGoodsRate") java.math.BigDecimal badGoodsRate,
      @RequestParam(required = false, value = "prodArea") String prodArea,
      @RequestParam(required = false, value = "qualSituDesc") String qualSituDesc,
      @RequestParam(required = false, value = "supplyStateDesc") String supplyStateDesc,
      @RequestParam(required = false, value = "supplyTrendDesc") String supplyTrendDesc,
      @RequestParam(required = false, value = "isMustSale") Integer isMustSale,
      @RequestParam(required = false, value = "mustSaleDesc") String mustSaleDesc,
      @RequestParam(required = false, value = "difference") String difference,
      @RequestParam(required = false, value = "goodsWrapDesc") String goodsWrapDesc,
      @RequestParam(required = false, value = "goodsEva") String goodsEva,
      @RequestParam(required = false, value = "techDesc") String techDesc,
      @RequestParam(required = false, value = "isBEnabledC") Integer isBEnabledC,
      @RequestParam(required = false, value = "isCEnabledA") Integer isCEnabledA,
      @RequestParam(required = false, value = "isCEnabledN") Integer isCEnabledN,
      @RequestParam(required = false, value = "isCEnabledM") Integer isCEnabledM,
      @RequestParam(required = false, value = "isCEnabledO") Integer isCEnabledO,
      @RequestParam(required = false, value = "isCEnabledP") Integer isCEnabledP,
      @RequestParam(required = false, value = "isCEnabledC") Integer isCEnabledC,
      @RequestParam(required = false, value = "isCEnabledE") Integer isCEnabledE,
      @RequestParam(required = false, value = "isCEnabledF") Integer isCEnabledF,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "orgId") Long orgId,
      @RequestParam(required = false, value = "goodsVarId") Long goodsVarId,
      @RequestParam(required = false, value = "goodsId") Long goodsId,
      @RequestParam(required = false, value = "unitId") Long unitId,
      @RequestParam(required = false, value = "unitCode") String unitCode,
      @RequestParam(required = false, value = "unitName") String unitName,
      @RequestParam(required = false, value = "unitRate") java.math.BigDecimal unitRate,
      @RequestParam(required = false, value = "isSale") Integer isSale,
      @RequestParam(required = false, value = "isReturn") Integer isReturn,
      @RequestParam(required = false, value = "isStockInv") Integer isStockInv,
      @RequestParam(required = false, value = "isRet") Integer isRet,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgGoodsvarService.findBy(
        badGoodsRate,
        prodArea,
        qualSituDesc,
        supplyStateDesc,
        supplyTrendDesc,
        isMustSale,
        mustSaleDesc,
        difference,
        goodsWrapDesc,
        goodsEva,
        techDesc,
        isBEnabledC,
        isCEnabledA,
        isCEnabledN,
        isCEnabledM,
        isCEnabledO,
        isCEnabledP,
        isCEnabledC,
        isCEnabledE,
        isCEnabledF,
        entId,
        orgId,
        goodsVarId,
        goodsId,
        unitId,
        unitCode,
        unitName,
        unitRate,
        isSale,
        isReturn,
        isStockInv,
        isRet,
        pageable);
  }
}
