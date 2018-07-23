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
import static com.pagoda.api.dto.goods.BasOrgGoodsDTO.Getters.*;

/**
 * 模型BasOrgGoods对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasOrgGoodsService")
@Slf4j
public class BasOrgGoodsController implements InitializingBean {
  @Autowired private BasOrgGoodsService basOrgGoodsService;

  @Autowired private BasOrgGoodsValidator basOrgGoodsValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basOrgGoodsValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basOrgGoodsValidator);
    }
  }

  /**
   * 插入一条BasOrgGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasOrgGoods记录")
  @PostMapping(value = "/create")
  public BasOrgGoodsDTO create(@Valid @RequestBody BasOrgGoodsDTO dto) {
    return basOrgGoodsService.create(dto);
  }

  /**
   * 删除一条BasOrgGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasOrgGoods记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basOrgGoodsService.delete(id);
    return true;
  }

  /**
   * 更新一条BasOrgGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasOrgGoods记录")
  @PostMapping(value = "/update")
  public BasOrgGoodsDTO update(@RequestBody BasOrgGoodsDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basOrgGoodsService.update(dto);
  }

  /**
   * 根据主键查询BasOrgGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasOrgGoods记录")
  @GetMapping(value = "/getById")
  public BasOrgGoodsDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basOrgGoodsService.getById(id);
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
  public Iterable<BasOrgGoodsDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basOrgGoodsService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param orgId
   * @param orgCode
   * @param orgName
   * @param goodsId
   * @param goodsCode
   * @param goodsName
   * @param entId
   * @param isOrgLot
   * @param taxRate
   * @param isEnabled
   * @param isPur
   * @param purRetOutDepotCode
   * @param purRetOutDepotName
   * @param purRetOutDepotId
   * @param purRecInDepotId
   * @param purRecInDepotCode
   * @param purRecInDepotName
   * @param salConInDepotId
   * @param salConInDepotCode
   * @param salConInDepotName
   * @param salConOutDepotId
   * @param salConOutDepotCode
   * @param salConOutDepotName
   * @param salRetInDepotId
   * @param salRetInDepotCode
   * @param salRetInDepotName
   * @param salRetOutDepotId
   * @param salRetOutDepotCode
   * @param salRetOutDepotName
   * @param isDataDetail
   * @param batchQty
   * @param batchPolicy
   * @param isSale
   * @param isReturn
   * @param isTrans
   * @param conCycle
   * @param isStockInv
   * @param isRet
   * @param isMustRet
   * @param purExcRatio
   * @param isDefDepot
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasOrgGoodsDTO> findBy(
      @RequestParam(required = false, value = "orgId") Long orgId,
      @RequestParam(required = false, value = "orgCode") String orgCode,
      @RequestParam(required = false, value = "orgName") String orgName,
      @RequestParam(required = false, value = "goodsId") Long goodsId,
      @RequestParam(required = false, value = "goodsCode") String goodsCode,
      @RequestParam(required = false, value = "goodsName") String goodsName,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "isOrgLot") Integer isOrgLot,
      @RequestParam(required = false, value = "taxRate") java.math.BigDecimal taxRate,
      @RequestParam(required = false, value = "isEnabled") Integer isEnabled,
      @RequestParam(required = false, value = "isPur") Integer isPur,
      @RequestParam(required = false, value = "purRetOutDepotCode") String purRetOutDepotCode,
      @RequestParam(required = false, value = "purRetOutDepotName") String purRetOutDepotName,
      @RequestParam(required = false, value = "purRetOutDepotId") Long purRetOutDepotId,
      @RequestParam(required = false, value = "purRecInDepotId") Long purRecInDepotId,
      @RequestParam(required = false, value = "purRecInDepotCode") String purRecInDepotCode,
      @RequestParam(required = false, value = "purRecInDepotName") String purRecInDepotName,
      @RequestParam(required = false, value = "salConInDepotId") Long salConInDepotId,
      @RequestParam(required = false, value = "salConInDepotCode") String salConInDepotCode,
      @RequestParam(required = false, value = "salConInDepotName") String salConInDepotName,
      @RequestParam(required = false, value = "salConOutDepotId") Long salConOutDepotId,
      @RequestParam(required = false, value = "salConOutDepotCode") String salConOutDepotCode,
      @RequestParam(required = false, value = "salConOutDepotName") String salConOutDepotName,
      @RequestParam(required = false, value = "salRetInDepotId") Long salRetInDepotId,
      @RequestParam(required = false, value = "salRetInDepotCode") String salRetInDepotCode,
      @RequestParam(required = false, value = "salRetInDepotName") String salRetInDepotName,
      @RequestParam(required = false, value = "salRetOutDepotId") Long salRetOutDepotId,
      @RequestParam(required = false, value = "salRetOutDepotCode") String salRetOutDepotCode,
      @RequestParam(required = false, value = "salRetOutDepotName") String salRetOutDepotName,
      @RequestParam(required = false, value = "isDataDetail") Integer isDataDetail,
      @RequestParam(required = false, value = "batchQty") java.math.BigDecimal batchQty,
      @RequestParam(required = false, value = "batchPolicy") Integer batchPolicy,
      @RequestParam(required = false, value = "isSale") Integer isSale,
      @RequestParam(required = false, value = "isReturn") Integer isReturn,
      @RequestParam(required = false, value = "isTrans") Integer isTrans,
      @RequestParam(required = false, value = "conCycle") java.math.BigDecimal conCycle,
      @RequestParam(required = false, value = "isStockInv") Integer isStockInv,
      @RequestParam(required = false, value = "isRet") Integer isRet,
      @RequestParam(required = false, value = "isMustRet") Integer isMustRet,
      @RequestParam(required = false, value = "purExcRatio") java.math.BigDecimal purExcRatio,
      @RequestParam(required = false, value = "isDefDepot") Integer isDefDepot,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basOrgGoodsService.findBy(
        orgId,
        orgCode,
        orgName,
        goodsId,
        goodsCode,
        goodsName,
        entId,
        isOrgLot,
        taxRate,
        isEnabled,
        isPur,
        purRetOutDepotCode,
        purRetOutDepotName,
        purRetOutDepotId,
        purRecInDepotId,
        purRecInDepotCode,
        purRecInDepotName,
        salConInDepotId,
        salConInDepotCode,
        salConInDepotName,
        salConOutDepotId,
        salConOutDepotCode,
        salConOutDepotName,
        salRetInDepotId,
        salRetInDepotCode,
        salRetInDepotName,
        salRetOutDepotId,
        salRetOutDepotCode,
        salRetOutDepotName,
        isDataDetail,
        batchQty,
        batchPolicy,
        isSale,
        isReturn,
        isTrans,
        conCycle,
        isStockInv,
        isRet,
        isMustRet,
        purExcRatio,
        isDefDepot,
        pageable);
  }
}
