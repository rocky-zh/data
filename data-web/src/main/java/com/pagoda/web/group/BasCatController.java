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
 * 模型BasCat对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/BasCatService")
@Slf4j
public class BasCatController {
  @Autowired private BasCatService basCatService;

  @Autowired private BasCatValidator basCatValidator;

  @InitBinder()
  public void setupBinder(WebDataBinder binder) {
    if (binder.getTarget() == null) {
      return;
    }
    if (basCatValidator.supports(binder.getTarget().getClass())) {
      binder.addValidators(basCatValidator);
    }
  }

  /**
   * 插入一条BasCat记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public BasCatDTO create(@Valid @RequestBody BasCatDTO dto) {
    return basCatService.create(dto);
  }

  /**
   * 删除一条BasCat记录
   *
   * @param id
   * @return
   */
  @Timed
  @PostMapping(value = "/delete")
  public boolean delete(@RequestParam("id") Long id) {
    basCatService.delete(id);
    return true;
  }

  /**
   * 更新一条BasCat记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/update")
  public BasCatDTO update(@RequestBody BasCatDTO dto) {
    Objects.requireNonNull(dto.getId(), "id is null");
    return basCatService.update(dto);
  }

  /**
   * 根据主键查询记录
   *
   * @param id
   * @return
   */
  @Timed
  @GetMapping(value = "/getById")
  public BasCatDTO getById(@RequestParam(required = true, value = "id") Long id) {
    return basCatService.getById(id);
  }

  /**
   * 根据主键批量查询记录，不分页
   *
   * @param idList
   * @return
   */
  @Timed
  @GetMapping(value = "/batchGetByIds")
  public Iterable<BasCatDTO> batchGetByIds(
      @RequestParam(required = true, value = "idList") List<Long> idList) {
    return basCatService.batchGetByIds(idList);
  }

  /**
   * 针对前端页面, 所有可查询的字段。
   * 权限控制需要添加如下的注解，取值要跟权限系统的配置参数一致，CAS配置也要启用，用户登录后会查询其拥有的所有的权限。 @RequiresOperation(page =
   * "需要权限访问的页面", operations = "需要具备的操作权限", note =
   * "说明") @RequiresResource(@ResourceFilter(resourceCode = "资源属性代码", model = "需要权限过滤的模型", field =
   * "资源属性对应的模型字段"))
   *
   * @param active
   * @param code
   * @param deleted1
   * @param enabled1
   * @param isDefault
   * @param isEnabled
   * @param isMulti
   * @param name
   * @param remark
   * @param searchWord
   * @param showOrder
   * @param tableId
   * @param pageable
   * @return
   */
  @Timed
  @GetMapping(value = "/findBy")
  public Page<BasCatDTO> findBy(
      @RequestParam(required = false, value = "active") Boolean active,
      @RequestParam(required = false, value = "code") String code,
      @RequestParam(required = false, value = "deleted1") Long deleted1,
      @RequestParam(required = false, value = "enabled1") Boolean enabled1,
      @RequestParam(required = false, value = "isDefault") String isDefault,
      @RequestParam(required = false, value = "isEnabled") String isEnabled,
      @RequestParam(required = false, value = "isMulti") String isMulti,
      @RequestParam(required = false, value = "name") String name,
      @RequestParam(required = false, value = "remark") String remark,
      @RequestParam(required = false, value = "searchWord") String searchWord,
      @RequestParam(required = false, value = "showOrder") Integer showOrder,
      @RequestParam(required = false, value = "tableId") Integer tableId,
      @RequestParam(required = false, value = "pageable") Pageable pageable) {
    return basCatService.findBy(
        active,
        code,
        deleted1,
        enabled1,
        isDefault,
        isEnabled,
        isMulti,
        name,
        remark,
        searchWord,
        showOrder,
        tableId,
        pageable);
  }
}
