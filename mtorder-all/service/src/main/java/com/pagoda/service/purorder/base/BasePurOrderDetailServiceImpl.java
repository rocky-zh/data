package com.pagoda.service.purorder.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.purorder.*;
import com.pagoda.api.dto.purorder.*;
import com.pagoda.domain.purorder.*;
import com.pagoda.repo.purorder.*;

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
 * 采购订单明细表服务实现类PurOrderDetailServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BasePurOrderDetailServiceImpl
    implements BasePurOrderDetailService, InitializingBean {

  @Autowired protected PurOrderDetailRepository repository;

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
  public Iterable<PurOrderDetailDTO> findAll() {
    return PurOrderDetail.batchConvert(repository.findAll());
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
  public PurOrderDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid PurOrderDetailDTO entity)
      throws ServiceException {
    try {
      return repository.create(PurOrderDetail.convertDTO(entity));
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
  public Iterable<PurOrderDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PurOrderDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurOrderDetail> itor =
          repository.batchCreate(PurOrderDetail.batchConvertDTO(entities));
      return PurOrderDetail.batchConvert(itor);
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
  public PurOrderDetailDTO update(
      @ApiParam(value = "entity", required = true) PurOrderDetailDTO entity)
      throws ServiceException {
    try {
      return repository.update(PurOrderDetail.convertDTO(entity));
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
  public Iterable<PurOrderDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PurOrderDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurOrderDetail> itor =
          repository.batchUpdate(PurOrderDetail.batchConvertDTO(entities));
      return PurOrderDetail.batchConvert(itor);
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
  public PurOrderDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<PurOrderDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return PurOrderDetail.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<PurOrderDetailDTO> findBy(
      @ApiParam("recOrgId") Long recOrgId,
      @ApiParam("recOrgCode") String recOrgCode,
      @ApiParam("recOrgName") String recOrgName,
      @ApiParam("isPrePrice") Integer isPrePrice,
      @ApiParam("purQty") java.math.BigDecimal purQty,
      @ApiParam("discountType") Integer discountType,
      @ApiParam("isRec") Integer isRec,
      @ApiParam("recQty") java.math.BigDecimal recQty,
      @ApiParam("isRecInv") Integer isRecInv,
      @ApiParam("billStatus") Integer billStatus,
      @ApiParam("billQty") java.math.BigDecimal billQty,
      @ApiParam("orderId") Long orderId,
      @ApiParam("orderSeqno") String orderSeqno,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("goodsLevel") Integer goodsLevel,
      @ApiParam("goodsOrion") String goodsOrion,
      @ApiParam("applyQty") java.math.BigDecimal applyQty,
      @ApiParam("purUnitId") Long purUnitId,
      @ApiParam("purUnitCode") String purUnitCode,
      @ApiParam("purUnitName") String purUnitName,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("purUnitRate") java.math.BigDecimal purUnitRate,
      @ApiParam("arrOrgId") Long arrOrgId,
      @ApiParam("arrOrgCode") String arrOrgCode,
      @ApiParam("arrOrgName") String arrOrgName,
      @ApiParam("sourceType") Integer sourceType,
      @ApiParam("requestQty") java.math.BigDecimal requestQty,
      @ApiParam("planRecDate") java.util.Date planRecDate,
      @ApiParam("purPrice") java.math.BigDecimal purPrice,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("discountAmt") java.math.BigDecimal discountAmt,
      @ApiParam("isReturn") Integer isReturn,
      @ApiParam("returnQty") java.math.BigDecimal returnQty,
      @ApiParam("applyId") Long applyId,
      @ApiParam("applySeqno") String applySeqno,
      @ApiParam("venOrgId") Long venOrgId,
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("remark") String remark,
      @ApiParam("stockinQty") java.math.BigDecimal stockinQty,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          recOrgId,
          recOrgCode,
          recOrgName,
          isPrePrice,
          purQty,
          discountType,
          isRec,
          recQty,
          isRecInv,
          billStatus,
          billQty,
          orderId,
          orderSeqno,
          entId,
          goodsId,
          goodsCode,
          goodsName,
          goodsSpec,
          goodsLevel,
          goodsOrion,
          applyQty,
          purUnitId,
          purUnitCode,
          purUnitName,
          basUnitId,
          basUnitCode,
          basUnitName,
          purUnitRate,
          arrOrgId,
          arrOrgCode,
          arrOrgName,
          sourceType,
          requestQty,
          planRecDate,
          purPrice,
          taxRate,
          discountAmt,
          isReturn,
          returnQty,
          applyId,
          applySeqno,
          venOrgId,
          venOrgCode,
          venOrgName,
          remark,
          stockinQty,
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
  public Page<PurOrderDetailDTO> findByExample(
      @ApiParam("example") PurOrderDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(PurOrderDetail.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<PurOrderDetailDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<PurOrderDetailDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from pur_order_detail"), new PageParam(0, 10), PurOrderDetailDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(purOrderDetailTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<PurOrderDetailDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), PurOrderDetailDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update pur_order_detail set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(purOrderDetailTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
