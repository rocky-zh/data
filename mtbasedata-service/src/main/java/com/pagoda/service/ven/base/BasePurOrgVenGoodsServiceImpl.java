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
 * 供应商机构商品 服务实现类PurOrgVenGoodsServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BasePurOrgVenGoodsServiceImpl
    implements PurOrgVenGoodsService, InitializingBean {

  @Autowired protected PurOrgVenGoodsRepository repository;

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
  public Iterable<PurOrgVenGoodsDTO> findAll() {
    return PurOrgVenGoods.batchConvert(repository.findAll());
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
  public PurOrgVenGoodsDTO create(
      @ApiParam(value = "entity", required = true) @Valid PurOrgVenGoodsDTO entity)
      throws ServiceException {
    try {
      return repository.create(PurOrgVenGoods.convertDTO(entity));
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
  public Iterable<PurOrgVenGoodsDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PurOrgVenGoodsDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurOrgVenGoods> itor =
          repository.batchCreate(PurOrgVenGoods.batchConvertDTO(entities));
      return PurOrgVenGoods.batchConvert(itor);
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
  public PurOrgVenGoodsDTO update(
      @ApiParam(value = "entity", required = true) PurOrgVenGoodsDTO entity)
      throws ServiceException {
    try {
      return repository.update(PurOrgVenGoods.convertDTO(entity));
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
  public Iterable<PurOrgVenGoodsDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PurOrgVenGoodsDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurOrgVenGoods> itor =
          repository.batchUpdate(PurOrgVenGoods.batchConvertDTO(entities));
      return PurOrgVenGoods.batchConvert(itor);
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
  public PurOrgVenGoodsDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<PurOrgVenGoodsDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return PurOrgVenGoods.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<PurOrgVenGoodsDTO> findBy(
      @ApiParam("unitRate") java.math.BigDecimal unitRate,
      @ApiParam("billTaxRate") java.math.BigDecimal billTaxRate,
      @ApiParam("discountTaxRate") java.math.BigDecimal discountTaxRate,
      @ApiParam("taxType") Integer taxType,
      @ApiParam("isAllowReturn") Integer isAllowReturn,
      @ApiParam("purDepotId") Long purDepotId,
      @ApiParam("venOrgId") Long venOrgId,
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("orgOrgId") Long orgOrgId,
      @ApiParam("orgOrgCode") String orgOrgCode,
      @ApiParam("orgOrgName") String orgOrgName,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("goodsClassName") String goodsClassName,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("unitId") Long unitId,
      @ApiParam("unitCode") String unitCode,
      @ApiParam("unitName") String unitName,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("isDefault") Integer isDefault,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isAllowOrder") Integer isAllowOrder,
      @ApiParam("isAllowRec") Integer isAllowRec,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          unitRate,
          billTaxRate,
          discountTaxRate,
          taxType,
          isAllowReturn,
          purDepotId,
          venOrgId,
          venOrgCode,
          venOrgName,
          orgOrgId,
          orgOrgCode,
          orgOrgName,
          goodsId,
          goodsCode,
          goodsName,
          goodsSpec,
          goodsClassName,
          basUnitName,
          unitId,
          unitCode,
          unitName,
          price,
          isDefault,
          isEnabled,
          isAllowOrder,
          isAllowRec,
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
  public Page<PurOrgVenGoodsDTO> findByExample(
      @ApiParam("example") PurOrgVenGoodsDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(PurOrgVenGoods.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<PurOrgVenGoodsDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<PurOrgVenGoodsDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from pur_org_ven_goods"), new PageParam(0, 10), PurOrgVenGoodsDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(purOrgVenGoodsTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<PurOrgVenGoodsDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), PurOrgVenGoodsDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update pur_org_ven_goods set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(purOrgVenGoodsTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
