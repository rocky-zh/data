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
import static com.pagoda.api.dto.goods.BasGoodsUnitDTO.Getters.*;

/**
 * 模型BasGoodsUnit对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasGoodsUnitService")
@Slf4j
public class BasGoodsUnitController implements InitializingBean {
  @Autowired private BasGoodsUnitService basGoodsUnitService;

  @Autowired private BasGoodsUnitValidator basGoodsUnitValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basGoodsUnitValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basGoodsUnitValidator);
    }
  }

  /**
   * 插入一条BasGoodsUnit记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasGoodsUnit记录")
  @PostMapping(value = "/create")
  public BasGoodsUnitDTO create(@Valid @RequestBody BasGoodsUnitDTO dto) {
    return basGoodsUnitService.create(dto);
  }

  /**
   * 删除一条BasGoodsUnit记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasGoodsUnit记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basGoodsUnitService.delete(id);
    return true;
  }

  /**
   * 更新一条BasGoodsUnit记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasGoodsUnit记录")
  @PostMapping(value = "/update")
  public BasGoodsUnitDTO update(@RequestBody BasGoodsUnitDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basGoodsUnitService.update(dto);
  }

  /**
   * 根据主键查询BasGoodsUnit记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasGoodsUnit记录")
  @GetMapping(value = "/getById")
  public BasGoodsUnitDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basGoodsUnitService.getById(id);
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
  public Iterable<BasGoodsUnitDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basGoodsUnitService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param isPermitDecimal
   * @param isUsedPur
   * @param isUsedSal
   * @param isUsedRet
   * @param goodsId
   * @param unitId
   * @param unitCode
   * @param unitName
   * @param entId
   * @param unitRate
   * @param sourceType
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasGoodsUnitDTO> findBy(
      @RequestParam(required = false, value = "isPermitDecimal") Integer isPermitDecimal,
      @RequestParam(required = false, value = "isUsedPur") Integer isUsedPur,
      @RequestParam(required = false, value = "isUsedSal") Integer isUsedSal,
      @RequestParam(required = false, value = "isUsedRet") Integer isUsedRet,
      @RequestParam(required = false, value = "goodsId") Long goodsId,
      @RequestParam(required = false, value = "unitId") Long unitId,
      @RequestParam(required = false, value = "unitCode") String unitCode,
      @RequestParam(required = false, value = "unitName") String unitName,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "unitRate") java.math.BigDecimal unitRate,
      @RequestParam(required = false, value = "sourceType") Integer sourceType,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basGoodsUnitService.findBy(
        isPermitDecimal,
        isUsedPur,
        isUsedSal,
        isUsedRet,
        goodsId,
        unitId,
        unitCode,
        unitName,
        entId,
        unitRate,
        sourceType,
        pageable);
  }
}
