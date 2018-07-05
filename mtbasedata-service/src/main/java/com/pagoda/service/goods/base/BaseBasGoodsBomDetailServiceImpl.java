package com.pagoda.service.goods.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.goods.*;
import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
import com.pagoda.repo.goods.*;

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
 * BOM投入商品明细表 服务实现类BasGoodsBomDetailServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasGoodsBomDetailServiceImpl
    implements BasGoodsBomDetailService, InitializingBean {

  @Autowired protected BasGoodsBomDetailRepository repository;

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
  public Iterable<BasGoodsBomDetailDTO> findAll() {
    return BasGoodsBomDetail.batchConvert(repository.findAll());
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
  public BasGoodsBomDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasGoodsBomDetailDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasGoodsBomDetail.convertDTO(entity));
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
  public Iterable<BasGoodsBomDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasGoodsBomDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasGoodsBomDetail> itor =
          repository.batchCreate(BasGoodsBomDetail.batchConvertDTO(entities));
      return BasGoodsBomDetail.batchConvert(itor);
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
  public BasGoodsBomDetailDTO update(
      @ApiParam(value = "entity", required = true) BasGoodsBomDetailDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasGoodsBomDetail.convertDTO(entity));
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
  public Iterable<BasGoodsBomDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasGoodsBomDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasGoodsBomDetail> itor =
          repository.batchUpdate(BasGoodsBomDetail.batchConvertDTO(entities));
      return BasGoodsBomDetail.batchConvert(itor);
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
  public BasGoodsBomDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<BasGoodsBomDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasGoodsBomDetail.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasGoodsBomDetailDTO> findBy(
      @ApiParam("outputGoodsId") Long outputGoodsId,
      @ApiParam("outputGoodsName") String outputGoodsName,
      @ApiParam("feeId") Long feeId,
      @ApiParam("inputGoodsId") Long inputGoodsId,
      @ApiParam("inputGoodsName") String inputGoodsName,
      @ApiParam("inputGoodsQty") java.math.BigDecimal inputGoodsQty,
      @ApiParam("outDepotId") Long outDepotId,
      @ApiParam("outDepotName") String outDepotName,
      @ApiParam("feeName") String feeName,
      @ApiParam("feeAmt") java.math.BigDecimal feeAmt,
      @ApiParam("unitId") Long unitId,
      @ApiParam("unitName") String unitName,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isDefault") Integer isDefault,
      @ApiParam("rankNum") Integer rankNum,
      @ApiParam("remark") String remark,
      @ApiParam("entId") Long entId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          outputGoodsId,
          outputGoodsName,
          feeId,
          inputGoodsId,
          inputGoodsName,
          inputGoodsQty,
          outDepotId,
          outDepotName,
          feeName,
          feeAmt,
          unitId,
          unitName,
          isEnabled,
          isDefault,
          rankNum,
          remark,
          entId,
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
  public Page<BasGoodsBomDetailDTO> findByExample(
      @ApiParam("example") BasGoodsBomDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasGoodsBomDetail.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasGoodsBomDetailDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasGoodsBomDetailDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_goods_bom_detail"), new PageParam(0, 10), BasGoodsBomDetailDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basGoodsBomDetailTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasGoodsBomDetailDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasGoodsBomDetailDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_goods_bom_detail set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basGoodsBomDetailTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
