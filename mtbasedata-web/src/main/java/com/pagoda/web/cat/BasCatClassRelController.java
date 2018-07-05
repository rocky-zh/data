package com.pagoda.web.cat;

import com.pagoda.api.*;
import com.pagoda.api.cat.*;
import com.pagoda.api.dto.cat.*;
import com.pagoda.validator.cat.*;

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
import static com.pagoda.api.dto.cat.BasCatClassRelDTO.Getters.*;

/**
 * 模型BasCatClassRel对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasCatClassRelService")
@Slf4j
public class BasCatClassRelController implements InitializingBean {
  @Autowired private BasCatClassRelService basCatClassRelService;

  @Autowired private BasCatClassRelValidator basCatClassRelValidator;

  @Override
  public void afterPropertiesSet() throws Exception {
    // 初始化自定义验证器

  }

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basCatClassRelValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basCatClassRelValidator);
    }
  }

  /**
   * 插入一条BasCatClassRel记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "create", notes = "插入一条BasCatClassRel记录")
  @PostMapping(value = "/create")
  public BasCatClassRelDTO create(@Valid @RequestBody BasCatClassRelDTO dto) {
    return basCatClassRelService.create(dto);
  }

  /**
   * 删除一条BasCatClassRel记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "delete", notes = "删除一条BasCatClassRel记录")
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basCatClassRelService.delete(id);
    return true;
  }

  /**
   * 更新一条BasCatClassRel记录
   *
   * @param dto
   * @return
   */
  @Timed
  @ApiOperation(value = "update", notes = "更新一条BasCatClassRel记录")
  @PostMapping(value = "/update")
  public BasCatClassRelDTO update(@RequestBody BasCatClassRelDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basCatClassRelService.update(dto);
  }

  /**
   * 根据主键查询BasCatClassRel记录
   *
   * @param id
   * @return
   */
  @Timed
  @ApiOperation(value = "getById", notes = "根据主键查询记录BasCatClassRel记录")
  @GetMapping(value = "/getById")
  public BasCatClassRelDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basCatClassRelService.getById(id);
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
  public Iterable<BasCatClassRelDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basCatClassRelService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param objId
   * @param objCode
   * @param objName
   * @param catClassId
   * @param catClassCode
   * @param catClassName
   * @param uniqueId
   * @param entId
   * @param path
   * @param catId
   * @param tableId
   * @param pageable
   * @return
   */
  @Timed
  @ApiOperation(value = "findBy", notes = "前端页面查询接口, 包含所有可查询的字段")
  @GetMapping(value = "/findBy")
  public Page<BasCatClassRelDTO> findBy(
      @RequestParam(required = false, value = "objId") Long objId,
      @RequestParam(required = false, value = "objCode") String objCode,
      @RequestParam(required = false, value = "objName") String objName,
      @RequestParam(required = false, value = "catClassId") Long catClassId,
      @RequestParam(required = false, value = "catClassCode") String catClassCode,
      @RequestParam(required = false, value = "catClassName") String catClassName,
      @RequestParam(required = false, value = "uniqueId") Long uniqueId,
      @RequestParam(required = false, value = "entId") Long entId,
      @RequestParam(required = false, value = "path") String path,
      @RequestParam(required = false, value = "catId") Long catId,
      @RequestParam(required = false, value = "tableId") Long tableId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basCatClassRelService.findBy(
        objId,
        objCode,
        objName,
        catClassId,
        catClassCode,
        catClassName,
        uniqueId,
        entId,
        path,
        catId,
        tableId,
        pageable);
  }
}
