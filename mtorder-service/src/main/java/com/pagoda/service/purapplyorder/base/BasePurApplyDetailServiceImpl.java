package com.pagoda.service.purapplyorder.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.purapplyorder.*;
import com.pagoda.api.dto.purapplyorder.*;
import com.pagoda.domain.purapplyorder.*;
import com.pagoda.repo.purapplyorder.*;

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
 * 采购请购单明细表服务实现类PurApplyDetailServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BasePurApplyDetailServiceImpl
    implements PurApplyDetailService, InitializingBean {

  @Autowired protected PurApplyDetailRepository repository;

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
  public Iterable<PurApplyDetailDTO> findAll() {
    return PurApplyDetail.batchConvert(repository.findAll());
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
  public PurApplyDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid PurApplyDetailDTO entity)
      throws ServiceException {
    try {
      return repository.create(PurApplyDetail.convertDTO(entity));
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
  public Iterable<PurApplyDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PurApplyDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurApplyDetail> itor =
          repository.batchCreate(PurApplyDetail.batchConvertDTO(entities));
      return PurApplyDetail.batchConvert(itor);
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
  public PurApplyDetailDTO update(
      @ApiParam(value = "entity", required = true) PurApplyDetailDTO entity)
      throws ServiceException {
    try {
      return repository.update(PurApplyDetail.convertDTO(entity));
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
  public Iterable<PurApplyDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PurApplyDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurApplyDetail> itor =
          repository.batchUpdate(PurApplyDetail.batchConvertDTO(entities));
      return PurApplyDetail.batchConvert(itor);
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
  public PurApplyDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<PurApplyDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return PurApplyDetail.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<PurApplyDetailDTO> findBy(
      @ApiParam("applyId") Long applyId,
      @ApiParam("applySeqno") String applySeqno,
      @ApiParam("goodsOrion") String goodsOrion,
      @ApiParam("purUnitId") Long purUnitId,
      @ApiParam("purUnitCode") String purUnitCode,
      @ApiParam("purUnitName") String purUnitName,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("purUnitRate") java.math.BigDecimal purUnitRate,
      @ApiParam("requestQty") java.math.BigDecimal requestQty,
      @ApiParam("applyQty") java.math.BigDecimal applyQty,
      @ApiParam("confirmQty") java.math.BigDecimal confirmQty,
      @ApiParam("invPrice") java.math.BigDecimal invPrice,
      @ApiParam("dealPurQty") java.math.BigDecimal dealPurQty,
      @ApiParam("dealSalQty") java.math.BigDecimal dealSalQty,
      @ApiParam("dealStatus") Integer dealStatus,
      @ApiParam("dealSalOrgId") Long dealSalOrgId,
      @ApiParam("calCusOrderQty") java.math.BigDecimal calCusOrderQty,
      @ApiParam("calOuterFerQty") java.math.BigDecimal calOuterFerQty,
      @ApiParam("calCusSalQty") java.math.BigDecimal calCusSalQty,
      @ApiParam("calInvQty") java.math.BigDecimal calInvQty,
      @ApiParam("calOnWayQty") java.math.BigDecimal calOnWayQty,
      @ApiParam("calStockUpQty") java.math.BigDecimal calStockUpQty,
      @ApiParam("calReplenishmentQty") java.math.BigDecimal calReplenishmentQty,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("planRecDate") java.util.Date planRecDate,
      @ApiParam("remark") String remark,
      @ApiParam("calPurRate") java.math.BigDecimal calPurRate,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          applyId,
          applySeqno,
          goodsOrion,
          purUnitId,
          purUnitCode,
          purUnitName,
          basUnitId,
          basUnitCode,
          basUnitName,
          purUnitRate,
          requestQty,
          applyQty,
          confirmQty,
          invPrice,
          dealPurQty,
          dealSalQty,
          dealStatus,
          dealSalOrgId,
          calCusOrderQty,
          calOuterFerQty,
          calCusSalQty,
          calInvQty,
          calOnWayQty,
          calStockUpQty,
          calReplenishmentQty,
          goodsId,
          goodsCode,
          goodsName,
          goodsSpec,
          planRecDate,
          remark,
          calPurRate,
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
  public Page<PurApplyDetailDTO> findByExample(
      @ApiParam("example") PurApplyDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(PurApplyDetail.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<PurApplyDetailDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<PurApplyDetailDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from pur_apply_detail"), new PageParam(0, 10), PurApplyDetailDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(purApplyDetailTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<PurApplyDetailDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), PurApplyDetailDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update pur_apply_detail set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(purApplyDetailTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
