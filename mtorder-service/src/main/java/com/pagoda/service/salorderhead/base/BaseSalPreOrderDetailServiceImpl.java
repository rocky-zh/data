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
 * 销售预订单明细表服务实现类SalPreOrderDetailServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseSalPreOrderDetailServiceImpl
    implements SalPreOrderDetailService, InitializingBean {

  @Autowired protected SalPreOrderDetailRepository repository;

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
  public Iterable<SalPreOrderDetailDTO> findAll() {
    return SalPreOrderDetail.batchConvert(repository.findAll());
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
  public SalPreOrderDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalPreOrderDetailDTO entity)
      throws ServiceException {
    try {
      return repository.create(SalPreOrderDetail.convertDTO(entity));
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
  public Iterable<SalPreOrderDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalPreOrderDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalPreOrderDetail> itor =
          repository.batchCreate(SalPreOrderDetail.batchConvertDTO(entities));
      return SalPreOrderDetail.batchConvert(itor);
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
  public SalPreOrderDetailDTO update(
      @ApiParam(value = "entity", required = true) SalPreOrderDetailDTO entity)
      throws ServiceException {
    try {
      return repository.update(SalPreOrderDetail.convertDTO(entity));
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
  public Iterable<SalPreOrderDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalPreOrderDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalPreOrderDetail> itor =
          repository.batchUpdate(SalPreOrderDetail.batchConvertDTO(entities));
      return SalPreOrderDetail.batchConvert(itor);
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
  public SalPreOrderDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<SalPreOrderDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return SalPreOrderDetail.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<SalPreOrderDetailDTO> findBy(
      @ApiParam("preOrderId") Long preOrderId,
      @ApiParam("preOrderSeqno") String preOrderSeqno,
      @ApiParam("prePlanQty") java.math.BigDecimal prePlanQty,
      @ApiParam("auditQty") java.math.BigDecimal auditQty,
      @ApiParam("invQty") java.math.BigDecimal invQty,
      @ApiParam("detailStatus") Integer detailStatus,
      @ApiParam("areaId") Long areaId,
      @ApiParam("areaCode") String areaCode,
      @ApiParam("areaName") String areaName,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsVarId") Long goodsVarId,
      @ApiParam("goodsVarName") String goodsVarName,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("salUnitid") Long salUnitid,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salUnitRate") java.math.BigDecimal salUnitRate,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("maxOrderQty") java.math.BigDecimal maxOrderQty,
      @ApiParam("minOrderQty") java.math.BigDecimal minOrderQty,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("totalAmt") java.math.BigDecimal totalAmt,
      @ApiParam("preArrivalDate") java.util.Date preArrivalDate,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          preOrderId,
          preOrderSeqno,
          prePlanQty,
          auditQty,
          invQty,
          detailStatus,
          areaId,
          areaCode,
          areaName,
          entId,
          goodsVarId,
          goodsVarName,
          goodsId,
          goodsCode,
          goodsName,
          goodsSpec,
          salUnitid,
          salUnitCode,
          salUnitName,
          salUnitRate,
          basUnitId,
          basUnitCode,
          basUnitName,
          maxOrderQty,
          minOrderQty,
          price,
          totalAmt,
          preArrivalDate,
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
  public Page<SalPreOrderDetailDTO> findByExample(
      @ApiParam("example") SalPreOrderDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(SalPreOrderDetail.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findDetailForAppend", notes = "查询追加预订单的明细")
  @Override
  public Page<SalPreOrderDetailDTO> findDetailForAppend(
      @ApiParam("pre_order_id") List<Long> preOrderId,
      @ApiParam("detail_status") List<Integer> detailStatus,
      @ApiParam("pre_arrival_date") java.util.Date preArrivalDate,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findDetailForAppend(preOrderId, detailStatus, preArrivalDate, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<SalPreOrderDetailDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<SalPreOrderDetailDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from sal_pre_order_detail"), new PageParam(0, 10), SalPreOrderDetailDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(salPreOrderDetailTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<SalPreOrderDetailDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), SalPreOrderDetailDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update sal_pre_order_detail set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(salPreOrderDetailTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
