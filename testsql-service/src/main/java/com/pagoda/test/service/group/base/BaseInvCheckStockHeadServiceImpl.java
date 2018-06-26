package com.pagoda.test.service.group.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.test.api.*;
import com.pagoda.test.api.group.*;
import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.domain.group.*;
import com.pagoda.test.repo.group.*;

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
 * 盘点单头表服务实现类InvCheckStockHeadServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseInvCheckStockHeadServiceImpl
    implements InvCheckStockHeadService, InitializingBean {

  @Autowired protected InvCheckStockHeadRepository repository;

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
  public Iterable<InvCheckStockHeadDTO> findAll() {
    return InvCheckStockHead.batchConvert(repository.findAll());
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
  public InvCheckStockHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid InvCheckStockHeadDTO entity)
      throws ServiceException {
    try {
      return repository.create(InvCheckStockHead.convertDTO(entity));
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
  public Iterable<InvCheckStockHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<InvCheckStockHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<InvCheckStockHead> itor =
          repository.batchCreate(InvCheckStockHead.batchConvertDTO(entities));
      return InvCheckStockHead.batchConvert(itor);
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
  public InvCheckStockHeadDTO update(
      @ApiParam(value = "entity", required = true) InvCheckStockHeadDTO entity)
      throws ServiceException {
    try {
      return repository.update(InvCheckStockHead.convertDTO(entity));
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
  public Iterable<InvCheckStockHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<InvCheckStockHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<InvCheckStockHead> itor =
          repository.batchUpdate(InvCheckStockHead.batchConvertDTO(entities));
      return InvCheckStockHead.batchConvert(itor);
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
  public InvCheckStockHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<InvCheckStockHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return InvCheckStockHead.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<InvCheckStockHeadDTO> findBy(
      @ApiParam("active") Boolean active,
      @ApiParam("adjustDate") java.sql.Timestamp adjustDate,
      @ApiParam("adjustUserId") String adjustUserId,
      @ApiParam("billDate") java.util.Date billDate,
      @ApiParam("billNo") Long billNo,
      @ApiParam("billType") String billType,
      @ApiParam("checkQty") Long checkQty,
      @ApiParam("checkStatus") Integer checkStatus,
      @ApiParam("checkType") Integer checkType,
      @ApiParam("depotCode") String depotCode,
      @ApiParam("depotId") Long depotId,
      @ApiParam("depotName") String depotName,
      @ApiParam("enabled") Boolean enabled,
      @ApiParam("entId") Long entId,
      @ApiParam("periodNo") Long periodNo,
      @ApiParam("remark") String remark,
      @ApiParam("ioLimit") Boolean ioLimit,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          active,
          adjustDate,
          adjustUserId,
          billDate,
          billNo,
          billType,
          checkQty,
          checkStatus,
          checkType,
          depotCode,
          depotId,
          depotName,
          enabled,
          entId,
          periodNo,
          remark,
          ioLimit,
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
  public Page<InvCheckStockHeadDTO> findByExample(
      @ApiParam("example") InvCheckStockHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(InvCheckStockHead.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<InvCheckStockHeadDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<InvCheckStockHeadDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from inv_check_stock_head"), new PageParam(0, 10), InvCheckStockHeadDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(invCheckStockHeadTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<InvCheckStockHeadDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), InvCheckStockHeadDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update inv_check_stock_head set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(invCheckStockHeadTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
