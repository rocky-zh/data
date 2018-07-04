package com.pagoda.service.org.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.org.*;
import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
import com.pagoda.repo.org.*;

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
 * 往来单位-机构明细表服务实现类BasOrgOrgServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasOrgOrgServiceImpl implements BasOrgOrgService, InitializingBean {

  @Autowired protected BasOrgOrgRepository repository;

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
  public Iterable<BasOrgOrgDTO> findAll() {
    return BasOrgOrg.batchConvert(repository.findAll());
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
  public BasOrgOrgDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasOrgOrgDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasOrgOrg.convertDTO(entity));
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
  public Iterable<BasOrgOrgDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgOrgDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasOrgOrg> itor = repository.batchCreate(BasOrgOrg.batchConvertDTO(entities));
      return BasOrgOrg.batchConvert(itor);
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
  public BasOrgOrgDTO update(@ApiParam(value = "entity", required = true) BasOrgOrgDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasOrgOrg.convertDTO(entity));
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
  public Iterable<BasOrgOrgDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgOrgDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasOrgOrg> itor = repository.batchUpdate(BasOrgOrg.batchConvertDTO(entities));
      return BasOrgOrg.batchConvert(itor);
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
  public BasOrgOrgDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<BasOrgOrgDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasOrgOrg.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasOrgOrgDTO> findBy(
      @ApiParam("dualDepotId") Long dualDepotId,
      @ApiParam("dualOrgId") Long dualOrgId,
      @ApiParam("isOrgTaxRate") Integer isOrgTaxRate,
      @ApiParam("isOrgEnabled") Integer isOrgEnabled,
      @ApiParam("isUsedWms") Integer isUsedWms,
      @ApiParam("orgId") Long orgId,
      @ApiParam("salConOutDepotId") Long salConOutDepotId,
      @ApiParam("salRetInDepotId") Long salRetInDepotId,
      @ApiParam("purRecInDepotId") Long purRecInDepotId,
      @ApiParam("purRetOutDepotId") Long purRetOutDepotId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          dualDepotId,
          dualOrgId,
          isOrgTaxRate,
          isOrgEnabled,
          isUsedWms,
          orgId,
          salConOutDepotId,
          salRetInDepotId,
          purRecInDepotId,
          purRetOutDepotId,
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
  public Page<BasOrgOrgDTO> findByExample(
      @ApiParam("example") BasOrgOrgDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasOrgOrg.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "deleteByOrgId", notes = "删除机构信息 通过OrgId")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer deleteByOrgId(@ApiParam("org_id") Long orgId) {
    try {
      return repository.deleteByOrgId(orgId);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasOrgOrgDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasOrgOrgDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_org_org"), new PageParam(0, 10), BasOrgOrgDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basOrgOrgTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasOrgOrgDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasOrgOrgDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_org_org set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basOrgOrgTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
