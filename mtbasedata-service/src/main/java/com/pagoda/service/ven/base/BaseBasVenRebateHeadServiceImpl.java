package com.pagoda.service.ven.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.ven.*;
import com.pagoda.api.dto.ven.*;
import com.pagoda.domain.ven.*;
import com.pagoda.repo.ven.*;

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
 * 供应商返利头表服务实现类BasVenRebateHeadServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasVenRebateHeadServiceImpl
    implements BasVenRebateHeadService, InitializingBean {

  @Autowired protected BasVenRebateHeadRepository repository;

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
  public Iterable<BasVenRebateHeadDTO> findAll() {
    return BasVenRebateHead.batchConvert(repository.findAll());
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
  public BasVenRebateHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasVenRebateHeadDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasVenRebateHead.convertDTO(entity));
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
  public Iterable<BasVenRebateHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasVenRebateHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasVenRebateHead> itor =
          repository.batchCreate(BasVenRebateHead.batchConvertDTO(entities));
      return BasVenRebateHead.batchConvert(itor);
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
  public BasVenRebateHeadDTO update(
      @ApiParam(value = "entity", required = true) BasVenRebateHeadDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasVenRebateHead.convertDTO(entity));
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
  public Iterable<BasVenRebateHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasVenRebateHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasVenRebateHead> itor =
          repository.batchUpdate(BasVenRebateHead.batchConvertDTO(entities));
      return BasVenRebateHead.batchConvert(itor);
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
  public BasVenRebateHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<BasVenRebateHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasVenRebateHead.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasVenRebateHeadDTO> findBy(
      @ApiParam("no") String no,
      @ApiParam("balOrgCode") String balOrgCode,
      @ApiParam("venOrgId") Long venOrgId,
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("rebateMode") Integer rebateMode,
      @ApiParam("rebateRate") java.math.BigDecimal rebateRate,
      @ApiParam("isAllEffect") Integer isAllEffect,
      @ApiParam("beginDate") java.util.Date beginDate,
      @ApiParam("endDate") java.util.Date endDate,
      @ApiParam("balOrgId") Long balOrgId,
      @ApiParam("balOrgName") String balOrgName,
      @ApiParam("status") Integer status,
      @ApiParam("effectDate") java.util.Date effectDate,
      @ApiParam("expiryDate") java.util.Date expiryDate,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          no,
          balOrgCode,
          venOrgId,
          venOrgCode,
          venOrgName,
          rebateMode,
          rebateRate,
          isAllEffect,
          beginDate,
          endDate,
          balOrgId,
          balOrgName,
          status,
          effectDate,
          expiryDate,
          remark,
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
  public Page<BasVenRebateHeadDTO> findByExample(
      @ApiParam("example") BasVenRebateHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasVenRebateHead.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasVenRebateHeadDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasVenRebateHeadDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_ven_rebate_head"), new PageParam(0, 10), BasVenRebateHeadDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basVenRebateHeadTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasVenRebateHeadDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasVenRebateHeadDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_ven_rebate_head set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basVenRebateHeadTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
