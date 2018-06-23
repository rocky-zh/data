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
 * 模型BasCatClass对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasCatClassService")
@Slf4j
public class BasCatClassController {
  @Autowired private BasCatClassService basCatClassService;

  @Autowired private BasCatClassValidator basCatClassValidator;

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basCatClassValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basCatClassValidator);
    }
  }

  /**
   * 插入一条BasCatClass记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public BasCatClassDTO create(@Valid @RequestBody BasCatClassDTO dto) {
    return basCatClassService.create(dto);
  }

  /**
   * 删除一条BasCatClass记录
   *
   * @param id
   * @return
   */
  @Timed
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basCatClassService.delete(id);
    return true;
  }

  /**
   * 更新一条BasCatClass记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/update")
  public BasCatClassDTO update(@RequestBody BasCatClassDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basCatClassService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public BasCatClassDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basCatClassService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @GetMapping(value = "/batchGetByIds")
  public Iterable<BasCatClassDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basCatClassService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param fullName
   * @param isLeaf
   * @param levelNum
   * @param parentCatClassCode
   * @param parentCatClassId
   * @param parentCatClassName
   * @param path
   * @param sourceId
   * @param code
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<BasCatClassDTO> findBy(
      @RequestParam(required = false, value = "fullName") String fullName,
      @RequestParam(required = false, value = "isLeaf") String isLeaf,
      @RequestParam(required = false, value = "levelNum") Integer levelNum,
      @RequestParam(required = false, value = "parentCatClassCode") String parentCatClassCode,
      @RequestParam(required = false, value = "parentCatClassId") Integer parentCatClassId,
      @RequestParam(required = false, value = "parentCatClassName") String parentCatClassName,
      @RequestParam(required = false, value = "path") String path,
      @RequestParam(required = false, value = "sourceId") Integer sourceId,
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basCatClassService.findBy(
        fullName,
        isLeaf,
        levelNum,
        parentCatClassCode,
        parentCatClassId,
        parentCatClassName,
        path,
        sourceId,
        code,
        pageable);
  }
}
