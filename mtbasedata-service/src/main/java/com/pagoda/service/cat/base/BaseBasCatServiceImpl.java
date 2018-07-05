package com.pagoda.service.cat.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.cat.*;
import com.pagoda.api.dto.cat.*;
import com.pagoda.domain.cat.*;
import com.pagoda.repo.cat.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.validation.*;
import io.swagger.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.*;
import org.springframework.validation.annotation.Validated;

/**
 * 目录定义1-level：tableid 包含：机构，供应商，客户，库房2-level: 服务实现类BasCatServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasCatServiceImpl implements BasCatService, InitializingBean {

  @Autowired protected BasCatRepository repository;

  /**
   * 服务初始化
   *
   * @throws Exception
   */
  @Override
  public void afterPropertiesSet() throws Exception {}

  /**
   * 查询所有记录
   *
   * @return
   */
  public Iterable<BasCatDTO> findAll() {
    return BasCat.batchConvert(repository.findAll());
  }

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  @Override
  public BasCatDTO create(@ApiParam(value = "entity", required = true) @Valid BasCatDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasCat.convertDTO(entity));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Create all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   */
  @ApiOperation(value = "batchCreate", notes = "批量插入多条记录")
  @Override
  public Iterable<BasCatDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasCatDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasCat> itor = repository.batchCreate(BasCat.batchConvertDTO(entities));
      return BasCat.batchConvert(itor);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Update a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   */
  @ApiOperation(value = "update", notes = "更新一条记录")
  @Override
  public BasCatDTO update(@ApiParam(value = "entity", required = true) BasCatDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasCat.convertDTO(entity));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Update all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   */
  @ApiOperation(value = "batchUpdate", notes = "批量更新多条记录")
  @Override
  public Iterable<BasCatDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasCatDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasCat> itor = repository.batchUpdate(BasCat.batchConvertDTO(entities));
      return BasCat.batchConvert(itor);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Deletes the entity with the given id.
   *
   * @param id must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
   */
  @ApiOperation(value = "delete", notes = "删除一条记录")
  @Override
  public void delete(@ApiParam(value = "id", required = true) Long id) throws ServiceException {
    try {
      repository.delete(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Deletes the entities in a batch with the given ids.
   *
   * @param ids must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code ids} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "batchDelete", notes = "批量删除多条记录")
  @Override
  public void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids)
      throws ServiceException {
    for (Long id : ids) {
      delete(id);
    }
  }

  /**
   * Retrieves an entity by its id.
   *
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   * @throws IllegalArgumentException if {@code id} is {@literal null}
   */
  @ApiOperation(value = "getById", notes = "根据id查询记录")
  @Override
  public BasCatDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException {
    try {
      return repository.getById(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  @Override
  public Iterable<BasCatDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasCat.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasCatDTO> findBy(
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("entId") Long entId,
      @ApiParam("tableId") Long tableId,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isDefault") Integer isDefault,
      @ApiParam("isMulti") Integer isMulti,
      @ApiParam("showOrder") Integer showOrder,
      @ApiParam("remark") String remark,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          code,
          name,
          entId,
          tableId,
          isEnabled,
          isDefault,
          isMulti,
          showOrder,
          remark,
          searchWord,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * 根据非空的字段进行查询
   *
   * @param example
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByExample", notes = "根据非空字段查询")
  @Override
  public Page<BasCatDTO> findByExample(
      @ApiParam("example") BasCatDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasCat.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "searchBasCatClassByCatId", notes = "根据目录id查询目录下是否存在目录分类")
  @Override
  public Page<BasCatDTO> searchBasCatClassByCatId(
      @ApiParam("cat_id") Long catId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.searchBasCatClassByCatId(catId, deleted, idList, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "searchBasCatCode", notes = "模糊查询目录代码列表")
  @Override
  public Page<BasCatDTO> searchBasCatCode(
      @ApiParam("code") String code,
      @ApiParam("table_id") Long tableId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.searchBasCatCode(code, tableId, deleted, idList, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "searchBasCatName", notes = "模糊查询目录名称")
  @Override
  public Page<BasCatDTO> searchBasCatName(
      @ApiParam("name") String name,
      @ApiParam("table_id") Long tableId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.searchBasCatName(name, tableId, deleted, idList, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "setDefaultCat", notes = "设置默认目录")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer setDefaultCat(
      @ApiParam("table_id") Long tableId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id") Long id) {
    try {
      return repository.setDefaultCat(tableId, deleted, id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "restDefaultBasCat", notes = "设置默认目录之前将所有目录设置为非默认目录以保障只有一个默认目录")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer restDefaultBasCat(
      @ApiParam("table_id") Long tableId,
      @ApiParam("is_default") Integer isDefault,
      @ApiParam("deleted") Long deleted) {
    try {
      return repository.restDefaultBasCat(tableId, isDefault, deleted);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "basCatFuzzyQuery", notes = "目录定义的模糊查询")
  @Override
  public Page<BasCatDTO> basCatFuzzyQuery(
      @ApiParam("id") Long id,
      @ApiParam("code") String code,
      @ApiParam("created_at") java.util.Date createdAt,
      @ApiParam("creator_code") String creatorCode,
      @ApiParam("creator_name") String creatorName,
      @ApiParam("ent_id") Long entId,
      @ApiParam("is_default") Integer isDefault,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("last_modified_at") java.util.Date lastModifiedAt,
      @ApiParam("modifier_code") String modifierCode,
      @ApiParam("modifier_name") String modifierName,
      @ApiParam("name") String name,
      @ApiParam("show_order") Integer showOrder,
      @ApiParam("table_id") Long tableId,
      @ApiParam("version") Integer version,
      @ApiParam("deleted") Long deleted,
      @ApiParam("id_list") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.basCatFuzzyQuery(
          id,
          code,
          createdAt,
          creatorCode,
          creatorName,
          entId,
          isDefault,
          isEnabled,
          lastModifiedAt,
          modifierCode,
          modifierName,
          name,
          showOrder,
          tableId,
          version,
          deleted,
          idList,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasCatDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasCatDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_cat"), new PageParam(0, 10), BasCatDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basCatTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasCatDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasCatDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_cat set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basCatTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
