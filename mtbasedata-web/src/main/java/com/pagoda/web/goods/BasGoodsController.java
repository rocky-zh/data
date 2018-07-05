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
import static com.pagoda.api.dto.goods.BasGoodsDTO.Getters.*;

/**
 * 模型BasGoods对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasGoodsService")
@Slf4j
public class BasGoodsController implements InitializingBean {
  @Autowired private BasGoodsService basGoodsService;

  @Autowired private BasGoodsValidator basGoodsValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basGoodsValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basGoodsValidator);
    }
  }

  /**
   * 插入一条BasGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasGoods记录")
  @PostMapping(value = "/create")
  public BasGoodsDTO create(@Valid @RequestBody BasGoodsDTO dto) {
    return basGoodsService.create(dto);
  }

  /**
   * 删除一条BasGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasGoods记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basGoodsService.delete(id);
    return true;
  }

  /**
   * 更新一条BasGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasGoods记录")
  @PostMapping(value = "/update")
  public BasGoodsDTO update(@RequestBody BasGoodsDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basGoodsService.update(dto);
  }

  /**
   * 根据主键查询BasGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasGoods记录")
  @GetMapping(value = "/getById")
  public BasGoodsDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basGoodsService.getById(id);
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
  public Iterable<BasGoodsDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basGoodsService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param shortName
   * @param traditName
   * @param enName
   * @param goodsOrigin
   * @param goodsLevel
   * @param goodsType
   * @param invUnitId
   * @param invUnitName
   * @param invUnitCode
   * @param invRate
   * @param purRate
   * @param retUnitId
   * @param retUnitCode
   * @param retUnitName
   * @param retRate
   * @param unitVolume
   * @param unitWeight
   * @param barcode
   * @param isEntLot
   * @param shelfLifeType
   * @param shelfLifeQty
   * @param code
   * @param name
   * @param entId
   * @param goodsSpec
   * @param searchWord
   * @param basUnitId
   * @param basUnitCode
   * @param basUnitName
   * @param salUnitId
   * @param salUnitCode
   * @param salUnitName
   * @param salRate
   * @param purUnitId
   * @param purUnitCode
   * @param purUnitName
   * @param taxRate
   * @param isEnabled
   * @param isPur
   * @param isSale
   * @param isRet
   * @param mnemWord
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasGoodsDTO> findBy(
      @RequestParam(required = false, value = "shortName") String shortName,
      @RequestParam(required = false, value = "traditName") String traditName,
      @RequestParam(required = false, value = "enName") String enName,
      @RequestParam(required = false, value = "goodsOrigin") String goodsOrigin,
      @RequestParam(required = false, value = "goodsLevel") Integer goodsLevel,
      @RequestParam(required = false, value = "goodsType") Integer goodsType,
      @RequestParam(required = false, value = "invUnitId") Long invUnitId,
      @RequestParam(required = false, value = "invUnitName") String invUnitName,
      @RequestParam(required = false, value = "invUnitCode") String invUnitCode,
      @RequestParam(required = false, value = "invRate") java.math.BigDecimal invRate,
      @RequestParam(required = false, value = "purRate") java.math.BigDecimal purRate,
      @RequestParam(required = false, value = "retUnitId") Long retUnitId,
      @RequestParam(required = false, value = "retUnitCode") String retUnitCode,
      @RequestParam(required = false, value = "retUnitName") String retUnitName,
      @RequestParam(required = false, value = "retRate") java.math.BigDecimal retRate,
      @RequestParam(required = false, value = "unitVolume") java.math.BigDecimal unitVolume,
      @RequestParam(required = false, value = "unitWeight") java.math.BigDecimal unitWeight,
      @RequestParam(required = false, value = "barcode") String barcode,
      @RequestParam(required = false, value = "isEntLot") Integer isEntLot,
      @RequestParam(required = false, value = "shelfLifeType") Integer shelfLifeType,
      @RequestParam(required = false, value = "shelfLifeQty") java.math.BigDecimal shelfLifeQty,
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "goodsSpec") String goodsSpec,
      @RequestParam(required = false, value = "searchWord") String searchWord,
      @RequestParam(required = false, value = "basUnitId") Long basUnitId,
      @RequestParam(required = false, value = "basUnitCode") String basUnitCode,
      @RequestParam(required = false, value = "basUnitName") String basUnitName,
      @RequestParam(required = false, value = "salUnitId") Long salUnitId,
      @RequestParam(required = false, value = "salUnitCode") String salUnitCode,
      @RequestParam(required = false, value = "salUnitName") String salUnitName,
      @RequestParam(required = false, value = "salRate") java.math.BigDecimal salRate,
      @RequestParam(required = false, value = "purUnitId") Long purUnitId,
      @RequestParam(required = false, value = "purUnitCode") String purUnitCode,
      @RequestParam(required = false, value = "purUnitName") String purUnitName,
      @RequestParam(required = false, value = "taxRate") java.math.BigDecimal taxRate,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "isPur") Integer isPur,
      @RequestParam(required = false, value = "isSale") Integer isSale,
      @RequestParam(required = false, value = "isRet") Integer isRet,
      @RequestParam(required = false, value = "mnemWord") String mnemWord,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basGoodsService.findBy(
        shortName,
        traditName,
        enName,
        goodsOrigin,
        goodsLevel,
        goodsType,
        invUnitId,
        invUnitName,
        invUnitCode,
        invRate,
        purRate,
        retUnitId,
        retUnitCode,
        retUnitName,
        retRate,
        unitVolume,
        unitWeight,
        barcode,
        isEntLot,
        shelfLifeType,
        shelfLifeQty,
        code,
        name,
        entId,
        goodsSpec,
        searchWord,
        basUnitId,
        basUnitCode,
        basUnitName,
        salUnitId,
        salUnitCode,
        salUnitName,
        salRate,
        purUnitId,
        purUnitCode,
        purUnitName,
        taxRate,
        isEnabled,
        isPur,
        isSale,
        isRet,
        mnemWord,
        pageable);
  }
}
