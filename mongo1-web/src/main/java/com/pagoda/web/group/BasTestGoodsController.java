package com.pagoda.web.group;

import com.pagoda.api.*;
import com.pagoda.api.group.*;
import com.pagoda.api.dto.group.*;
import com.pagoda.validator.group.*;

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
import static com.pagoda.api.dto.group.BasTestGoodsDTO.Getters.*;

/**
 * 模型BasTestGoods对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasTestGoodsService")
@Slf4j
public class BasTestGoodsController implements InitializingBean {
  @Autowired private BasTestGoodsService basTestGoodsService;

  @Autowired private BasTestGoodsValidator basTestGoodsValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basTestGoodsValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basTestGoodsValidator);
    }
  }

  /**
   * 插入一条BasTestGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasTestGoods记录")
  @PostMapping(value = "/create")
  public BasTestGoodsDTO create(@Valid @RequestBody BasTestGoodsDTO dto) {
    return basTestGoodsService.create(dto);
  }

  /**
   * 删除一条BasTestGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasTestGoods记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basTestGoodsService.delete(id);
    return true;
  }

  /**
   * 更新一条BasTestGoods记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasTestGoods记录")
  @PostMapping(value = "/update")
  public BasTestGoodsDTO update(@RequestBody BasTestGoodsDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basTestGoodsService.update(dto);
  }

  /**
   * 根据主键查询BasTestGoods记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasTestGoods记录")
  @GetMapping(value = "/getById")
  public BasTestGoodsDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basTestGoodsService.getById(id);
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
  public Iterable<BasTestGoodsDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basTestGoodsService.batchGetByIds(idList);
  }
}
