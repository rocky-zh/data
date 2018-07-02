package com.pagoda.service.salorderhead.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.salorderhead.*;
import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.domain.salorderhead.*;
import com.pagoda.repo.salorderhead.*;

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
 * 销售订单服务实现类SalOrderHeadServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseSalOrderHeadServiceImpl implements SalOrderHeadService, InitializingBean {

  @Autowired protected SalOrderHeadRepository repository;

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
  public Iterable<SalOrderHeadDTO> findAll() {
    return SalOrderHead.batchConvert(repository.findAll());
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
  public SalOrderHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalOrderHeadDTO entity)
      throws ServiceException {
    try {
      return repository.create(SalOrderHead.convertDTO(entity));
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
  public Iterable<SalOrderHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalOrderHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalOrderHead> itor = repository.batchCreate(SalOrderHead.batchConvertDTO(entities));
      return SalOrderHead.batchConvert(itor);
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
  public SalOrderHeadDTO update(@ApiParam(value = "entity", required = true) SalOrderHeadDTO entity)
      throws ServiceException {
    try {
      return repository.update(SalOrderHead.convertDTO(entity));
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
  public Iterable<SalOrderHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalOrderHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalOrderHead> itor = repository.batchUpdate(SalOrderHead.batchConvertDTO(entities));
      return SalOrderHead.batchConvert(itor);
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
  public SalOrderHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<SalOrderHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return SalOrderHead.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<SalOrderHeadDTO> findBy(
      @ApiParam("entId") Long entId,
      @ApiParam("seqno") String seqno,
      @ApiParam("conOrgId") Long conOrgId,
      @ApiParam("conOrgCode") String conOrgCode,
      @ApiParam("conOrgName") String conOrgName,
      @ApiParam("cusOrgId") Long cusOrgId,
      @ApiParam("cusOrgCode") String cusOrgCode,
      @ApiParam("cusOrgName") String cusOrgName,
      @ApiParam("preArrivalDate") java.util.Date preArrivalDate,
      @ApiParam("transitLineNo") String transitLineNo,
      @ApiParam("totalAmt") java.math.BigDecimal totalAmt,
      @ApiParam("goodsAmt") java.math.BigDecimal goodsAmt,
      @ApiParam("taxAmt") java.math.BigDecimal taxAmt,
      @ApiParam("totalRequestQty") java.math.BigDecimal totalRequestQty,
      @ApiParam("orderType") Integer orderType,
      @ApiParam("inputMode") Integer inputMode,
      @ApiParam("orderStatus") Integer orderStatus,
      @ApiParam("isFinish") Integer isFinish,
      @ApiParam("remark") String remark,
      @ApiParam("entryDate") java.sql.Timestamp entryDate,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          entId,
          seqno,
          conOrgId,
          conOrgCode,
          conOrgName,
          cusOrgId,
          cusOrgCode,
          cusOrgName,
          preArrivalDate,
          transitLineNo,
          totalAmt,
          goodsAmt,
          taxAmt,
          totalRequestQty,
          orderType,
          inputMode,
          orderStatus,
          isFinish,
          remark,
          entryDate,
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
  public Page<SalOrderHeadDTO> findByExample(
      @ApiParam("example") SalOrderHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(SalOrderHead.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findSalOrderHeadBetween", notes = "查询出录入日期为当天的订单List")
  @Override
  public Page<SalOrderHeadDTO> findSalOrderHeadBetween(
      @ApiParam("version") Integer version,
      @ApiParam("calDateTimeSub") java.sql.Timestamp calDateTimeSub,
      @ApiParam("calDateTimeAdd") java.sql.Timestamp calDateTimeAdd,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findSalOrderHeadBetween(version, calDateTimeSub, calDateTimeAdd, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<SalOrderHeadDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<SalOrderHeadDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from sal_order_head"), new PageParam(0, 10), SalOrderHeadDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(salOrderHeadTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<SalOrderHeadDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), SalOrderHeadDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update sal_order_head set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(salOrderHeadTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
