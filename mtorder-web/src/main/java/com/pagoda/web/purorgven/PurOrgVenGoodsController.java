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
import static com.pagoda.api.dto.purorgven.PurOrgVenGoodsDTO.Getters.*;

/**
 * 模型PurOrgVenGoods对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/PurOrgVenGoodsService")
@Slf4j
public class PurOrgVenGoodsController implements InitializingBean {
  @Autowired private PurOrgVenGoodsService purOrgVenGoodsService;

  @Autowired private PurOrgVenGoodsValidator purOrgVenGoodsValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (purOrgVenGoodsValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(purOrgVenGoodsValidator);
    }
  }

  /**
   * 插入一条PurOrgVenGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条PurOrgVenGoods记录")
  @PostMapping(value = "/create")
  public PurOrgVenGoodsDTO create(@Valid @RequestBody PurOrgVenGoodsDTO dto) {
    return purOrgVenGoodsService.create(dto);
  }

  /**
   * 删除一条PurOrgVenGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条PurOrgVenGoods记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    purOrgVenGoodsService.delete(id);
    return true;
  }

  /**
   * 更新一条PurOrgVenGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条PurOrgVenGoods记录")
  @PostMapping(value = "/update")
  public PurOrgVenGoodsDTO update(@RequestBody PurOrgVenGoodsDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return purOrgVenGoodsService.update(dto);
  }

  /**
   * 根据主键查询PurOrgVenGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录PurOrgVenGoods记录")
  @GetMapping(value = "/getById")
  public PurOrgVenGoodsDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return purOrgVenGoodsService.getById(id);
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
  public Iterable<PurOrgVenGoodsDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return purOrgVenGoodsService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param venOrgId
   * @param venOrgCode
   * @param venOrgName
   * @param orgOrgId
   * @param orgOrgCode
   * @param orgOrgName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param goodsSpec
   * @param goodsClassName
   * @param basUnitName
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param unitRate
   * @param price
   * @param billTaxRate
   * @param discountTaxRate
   * @param taxType
   * @param isDefault
   * @param isEnabled
   * @param isAllowReturn
   * @param purDepotId
   * @param isAllowOrder
   * @param isAllowRec
   * @param goodsClassId
   * @param basUnitId
   * @param entId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<PurOrgVenGoodsDTO> findBy(
      @RequestParam(required = false, value = "venOrgId") Long venOrgId,
      @RequestParam(required = false, value = "venOrgCode") String venOrgCode,
      @RequestParam(required = false, value = "venOrgName") String venOrgName,
      @RequestParam(required = false, value = "orgOrgId") Long orgOrgId,
      @RequestParam(required = false, value = "orgOrgCode") String orgOrgCode,
      @RequestParam(required = false, value = "orgOrgName") String orgOrgName,
      @RequestParam(required = false, value = "goodsId") Long goodsId,
      @RequestParam(required = false, value = "goodsCode") String goodsCode,
      @RequestParam(required = false, value = "goodsName") String goodsName,
      @RequestParam(required = false, value = "goodsSpec") String goodsSpec,
      @RequestParam(required = false, value = "goodsClassName") String goodsClassName,
      @RequestParam(required = false, value = "basUnitName") String basUnitName,
      @RequestParam(required = false, value = "unitId") Long unitId,
      @RequestParam(required = false, value = "unitCode") String unitCode,
      @RequestParam(required = false, value = "unitName") String unitName,
      @RequestParam(required = false, value = "unitRate") java.math.BigDecimal unitRate,
      @RequestParam(required = false, value = "price") java.math.BigDecimal price,
      @RequestParam(required = false, value = "billTaxRate") java.math.BigDecimal billTaxRate,
      @RequestParam(required = false, value = "discountTaxRate")
          java.math.BigDecimal discountTaxRate,
      @RequestParam(required = false, value = "taxType") Integer taxType,
      @RequestParam(required = false, value = "isDefault") Integer isDefault,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "isAllowReturn") Integer isAllowReturn,
      @RequestParam(required = false, value = "purDepotId") Long purDepotId,
      @RequestParam(required = false, value = "isAllowOrder") Integer isAllowOrder,
      @RequestParam(required = false, value = "isAllowRec") Integer isAllowRec,
      @RequestParam(required = false, value = "goodsClassId") Long goodsClassId,
      @RequestParam(required = false, value = "basUnitId") Long basUnitId,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return purOrgVenGoodsService.findBy(
        venOrgId,
        venOrgCode,
        venOrgName,
        orgOrgId,
        orgOrgCode,
        orgOrgName,
        goodsId,
        goodsCode,
        goodsName,
        goodsSpec,
        goodsClassName,
        basUnitName,
        unitId,
        unitCode,
        unitName,
        unitRate,
        price,
        billTaxRate,
        discountTaxRate,
        taxType,
        isDefault,
        isEnabled,
        isAllowReturn,
        purDepotId,
        isAllowOrder,
        isAllowRec,
        goodsClassId,
        basUnitId,
        entId,
        pageable);
  }
}
