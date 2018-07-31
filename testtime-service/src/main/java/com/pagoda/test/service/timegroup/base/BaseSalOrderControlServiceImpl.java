package com.pagoda.test.service.timegroup.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.test.api.*;
import com.pagoda.test.api.timegroup.*;
import com.pagoda.test.api.dto.timegroup.*;
import com.pagoda.test.domain.timegroup.*;
import com.pagoda.test.repo.timegroup.*;

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
 * 按客户维度进行配送订单、退货、货款等方面的控制服务实现类SalOrderControlServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseSalOrderControlServiceImpl
    implements BaseSalOrderControlService, InitializingBean {

  @Autowired protected SalOrderControlRepository repository;

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
  public Iterable<SalOrderControlDTO> findAll() {
    return SalOrderControl.batchConvert(repository.findAll());
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
  public SalOrderControlDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalOrderControlDTO entity)
      throws ServiceException {
    try {
      return repository.create(SalOrderControl.convertDTO(entity));
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
  public Iterable<SalOrderControlDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalOrderControlDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalOrderControl> itor =
          repository.batchCreate(SalOrderControl.batchConvertDTO(entities));
      return SalOrderControl.batchConvert(itor);
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
  public SalOrderControlDTO update(
      @ApiParam(value = "entity", required = true) SalOrderControlDTO entity)
      throws ServiceException {
    try {
      return repository.update(SalOrderControl.convertDTO(entity));
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
  public Iterable<SalOrderControlDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalOrderControlDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalOrderControl> itor =
          repository.batchUpdate(SalOrderControl.batchConvertDTO(entities));
      return SalOrderControl.batchConvert(itor);
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
  public SalOrderControlDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<SalOrderControlDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return SalOrderControl.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<SalOrderControlDTO> findBy(
      @ApiParam("cusOrgId") Long cusOrgId,
      @ApiParam("cusOrgCode") String cusOrgCode,
      @ApiParam("cusOrgName") String cusOrgName,
      @ApiParam("isCtrlDep") Integer isCtrlDep,
      @ApiParam("beforeDays") Integer beforeDays,
      @ApiParam("allowPosGapD") Integer allowPosGapD,
      @ApiParam("allowPosGapM") Integer allowPosGapM,
      @ApiParam("isCtrlDepInput") Integer isCtrlDepInput,
      @ApiParam("isCtrlAccnt") Integer isCtrlAccnt,
      @ApiParam("isCtrlDuty") Integer isCtrlDuty,
      @ApiParam("isCtrlVrfyTrans") Integer isCtrlVrfyTrans,
      @ApiParam("isCtrlDistCyc") Integer isCtrlDistCyc,
      @ApiParam("isCtrlMustSell") Integer isCtrlMustSell,
      @ApiParam("isCtrlRouteSplit") Integer isCtrlRouteSplit,
      @ApiParam("isCtrlSafetyStock") Integer isCtrlSafetyStock,
      @ApiParam("allowSafetyStockTimes") java.math.BigDecimal allowSafetyStockTimes,
      @ApiParam("isCtrlExeBatchPolicy") Integer isCtrlExeBatchPolicy,
      @ApiParam("isCtrlOneOrder") Integer isCtrlOneOrder,
      @ApiParam("placeOrderTime") java.util.Date placeOrderTime,
      @ApiParam("placeOrderTime2") java.util.Date placeOrderTime2,
      @ApiParam("isCtrlReturn") Integer isCtrlReturn,
      @ApiParam("returnGoodsTime1") java.util.Date returnGoodsTime1,
      @ApiParam("returnGoodsTime2") java.util.Date returnGoodsTime2,
      @ApiParam("enabled") Integer enabled,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          cusOrgId,
          cusOrgCode,
          cusOrgName,
          isCtrlDep,
          beforeDays,
          allowPosGapD,
          allowPosGapM,
          isCtrlDepInput,
          isCtrlAccnt,
          isCtrlDuty,
          isCtrlVrfyTrans,
          isCtrlDistCyc,
          isCtrlMustSell,
          isCtrlRouteSplit,
          isCtrlSafetyStock,
          allowSafetyStockTimes,
          isCtrlExeBatchPolicy,
          isCtrlOneOrder,
          placeOrderTime,
          placeOrderTime2,
          isCtrlReturn,
          returnGoodsTime1,
          returnGoodsTime2,
          enabled,
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
  public Page<SalOrderControlDTO> findByExample(
      @ApiParam("example") SalOrderControlDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(SalOrderControl.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectWithTime", notes = "根据时分秒查询")
  @Override
  public Page<SalOrderControlDTO> selectWithTime(
      @ApiParam("place_order_time") java.util.Date placeOrderTime,
      @ApiParam("idList") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectWithTime(placeOrderTime, idList, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<SalOrderControlDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<SalOrderControlDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from sal_order_control"), new PageParam(0, 10), SalOrderControlDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(salOrderControlTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<SalOrderControlDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), SalOrderControlDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update sal_order_control set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(salOrderControlTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
