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
 * 商品定义服务实现类BasGoodsServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasGoodsServiceImpl implements BasGoodsService, InitializingBean {

  @Autowired protected BasGoodsRepository repository;

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
  public Iterable<BasGoodsDTO> findAll() {
    return BasGoods.batchConvert(repository.findAll());
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
  public BasGoodsDTO create(@ApiParam(value = "entity", required = true) @Valid BasGoodsDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasGoods.convertDTO(entity));
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
  public Iterable<BasGoodsDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasGoodsDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasGoods> itor = repository.batchCreate(BasGoods.batchConvertDTO(entities));
      return BasGoods.batchConvert(itor);
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
  public BasGoodsDTO update(@ApiParam(value = "entity", required = true) BasGoodsDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasGoods.convertDTO(entity));
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
  public Iterable<BasGoodsDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasGoodsDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasGoods> itor = repository.batchUpdate(BasGoods.batchConvertDTO(entities));
      return BasGoods.batchConvert(itor);
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
  public BasGoodsDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<BasGoodsDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasGoods.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasGoodsDTO> findBy(
      @ApiParam("shortName") String shortName,
      @ApiParam("traditName") String traditName,
      @ApiParam("enName") String enName,
      @ApiParam("goodsOrigin") String goodsOrigin,
      @ApiParam("goodsLevel") Integer goodsLevel,
      @ApiParam("goodsType") Integer goodsType,
      @ApiParam("invUnitId") Long invUnitId,
      @ApiParam("invUnitName") String invUnitName,
      @ApiParam("invUnitCode") String invUnitCode,
      @ApiParam("invRate") java.math.BigDecimal invRate,
      @ApiParam("purRate") java.math.BigDecimal purRate,
      @ApiParam("retUnitId") Long retUnitId,
      @ApiParam("retUnitCode") String retUnitCode,
      @ApiParam("retUnitName") String retUnitName,
      @ApiParam("retRate") java.math.BigDecimal retRate,
      @ApiParam("unitVolume") java.math.BigDecimal unitVolume,
      @ApiParam("unitWeight") java.math.BigDecimal unitWeight,
      @ApiParam("barcode") String barcode,
      @ApiParam("isEntLot") Integer isEntLot,
      @ApiParam("shelfLifeType") Integer shelfLifeType,
      @ApiParam("shelfLifeQty") java.math.BigDecimal shelfLifeQty,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("basUnitId") Long basUnitId,
      @ApiParam("basUnitCode") String basUnitCode,
      @ApiParam("basUnitName") String basUnitName,
      @ApiParam("salUnitId") Long salUnitId,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salRate") java.math.BigDecimal salRate,
      @ApiParam("purUnitId") Long purUnitId,
      @ApiParam("purUnitCode") String purUnitCode,
      @ApiParam("purUnitName") String purUnitName,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isPur") Integer isPur,
      @ApiParam("isSale") Integer isSale,
      @ApiParam("isRet") Integer isRet,
      @ApiParam("mnemWord") String mnemWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          shortName,
          traditName,
          enName,
          goodsOrigin,
          goodsLevel,
          goodsType,
          invUnitId,
          invUnitName,
          invUnitCode,
          invRate,
          purRate,
          retUnitId,
          retUnitCode,
          retUnitName,
          retRate,
          unitVolume,
          unitWeight,
          barcode,
          isEntLot,
          shelfLifeType,
          shelfLifeQty,
          code,
          name,
          entId,
          goodsSpec,
          searchWord,
          basUnitId,
          basUnitCode,
          basUnitName,
          salUnitId,
          salUnitCode,
          salUnitName,
          salRate,
          purUnitId,
          purUnitCode,
          purUnitName,
          taxRate,
          isEnabled,
          isPur,
          isSale,
          isRet,
          mnemWord,
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
  public Page<BasGoodsDTO> findByExample(
      @ApiParam("example") BasGoodsDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasGoods.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findGoodsInDefine", notes = "商品定义->商品查询")
  @Override
  public Page<FindGoodsInDefineDTO> findGoodsInDefine(
      @ApiParam("cat_id") Long catId,
      @ApiParam("path") String path,
      @ApiParam("is_pur") Integer isPur,
      @ApiParam("table_id") Long tableId,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("is_sale") Integer isSale,
      @ApiParam("is_ret") Integer isRet,
      @ApiParam("created_at") java.util.Date createdAt,
      @ApiParam("name") String name,
      @ApiParam("barcode") String barcode,
      @ApiParam("code") String code,
      @ApiParam("goods_type") Integer goodsType,
      @ApiParam("mnem_word") String mnemWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findGoodsInDefine(
          catId, path, isPur, tableId, isEnabled, deleted, entId, isSale, isRet, createdAt, name,
          barcode, code, goodsType, mnemWord, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findGoodsOnCatClass", notes = "分类关系->根据目录分类查找商品")
  @Override
  public Page<FindGoodsOnCatClassDTO> findGoodsOnCatClass(
      @ApiParam("path") String path,
      @ApiParam("cat_id") Long catId,
      @ApiParam("is_pur") Integer isPur,
      @ApiParam("table_id") Long tableId,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("is_sale") Integer isSale,
      @ApiParam("is_ret") Integer isRet,
      @ApiParam("created_at") java.util.Date createdAt,
      @ApiParam("name") String name,
      @ApiParam("barcode") String barcode,
      @ApiParam("code") String code,
      @ApiParam("goods_type") Integer goodsType,
      @ApiParam("mnem_word") String mnemWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findGoodsOnCatClass(
          path, catId, isPur, tableId, isEnabled, deleted, entId, isSale, isRet, createdAt, name,
          barcode, code, goodsType, mnemWord, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findNoClassGoodsOnCat", notes = "分类关系->查找没有在当前目录下的商品")
  @Override
  public Page<BasGoodsDTO> findNoClassGoodsOnCat(
      @ApiParam("cat_id") Long catId,
      @ApiParam("ent_id") Long entId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("table_id") Long tableId,
      @ApiParam("is_pur") Integer isPur,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("is_sale") Integer isSale,
      @ApiParam("is_ret") Integer isRet,
      @ApiParam("created_at") java.util.Date createdAt,
      @ApiParam("name") String name,
      @ApiParam("barcode") String barcode,
      @ApiParam("code") String code,
      @ApiParam("goods_type") Integer goodsType,
      @ApiParam("mnem_word") String mnemWord,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findNoClassGoodsOnCat(
          catId, entId, deleted, tableId, isPur, isEnabled, isSale, isRet, createdAt, name, barcode,
          code, goodsType, mnemWord, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasGoodsDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasGoodsDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_goods"), new PageParam(0, 10), BasGoodsDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basGoodsTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasGoodsDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasGoodsDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_goods set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basGoodsTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
