package com.pagoda.web.group;

import com.pagoda.api.*;
import com.pagoda.api.group.*;
import com.pagoda.api.dto.group.*;
import com.pagoda.validator.group.*;

import io.micrometer.core.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;

/**
 * 模型BasCatClassRel对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasCatClassRelService")
@Slf4j
public class BasCatClassRelController {
  @Autowired private BasCatClassRelService basCatClassRelService;

  @Autowired private BasCatClassRelValidator basCatClassRelValidator;

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
  @PostMapping(value = "/update")
  public BasCatClassRelDTO update(@RequestBody BasCatClassRelDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basCatClassRelService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public BasCatClassRelDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basCatClassRelService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
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
   * @param catClassCode
   * @param catClassId
   * @param catClassName
   * @param objCode
   * @param objId
   * @param objName
   * @param uniqueId
   * @param active
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<BasCatClassRelDTO> findBy(
      @RequestParam(required = false, value = "catClassCode") String catClassCode,
      @RequestParam(required = false, value = "catClassId") Integer catClassId,
      @RequestParam(required = false, value = "catClassName") String catClassName,
      @RequestParam(required = false, value = "objCode") String objCode,
      @RequestParam(required = false, value = "objId") Integer objId,
      @RequestParam(required = false, value = "objName") String objName,
      @RequestParam(required = false, value = "uniqueId") Integer uniqueId,
      @RequestParam(required = false, value = "active") Integer active,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basCatClassRelService.findBy(
        catClassCode,
        catClassId,
        catClassName,
        objCode,
        objId,
        objName,
        uniqueId,
        active,
        pageable);
  }
}
