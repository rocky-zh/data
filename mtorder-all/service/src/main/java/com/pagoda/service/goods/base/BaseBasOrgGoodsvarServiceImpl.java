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
 * 机构销售商品定义服务实现类BasOrgGoodsvarServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasOrgGoodsvarServiceImpl
    implements BaseBasOrgGoodsvarService, InitializingBean {

  @Autowired protected BasOrgGoodsvarRepository repository;

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
  public Iterable<BasOrgGoodsvarDTO> findAll() {
    return BasOrgGoodsvar.batchConvert(repository.findAll());
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
  public BasOrgGoodsvarDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasOrgGoodsvarDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasOrgGoodsvar.convertDTO(entity));
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
  public Iterable<BasOrgGoodsvarDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgGoodsvarDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasOrgGoodsvar> itor =
          repository.batchCreate(BasOrgGoodsvar.batchConvertDTO(entities));
      return BasOrgGoodsvar.batchConvert(itor);
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
  public BasOrgGoodsvarDTO update(
      @ApiParam(value = "entity", required = true) BasOrgGoodsvarDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasOrgGoodsvar.convertDTO(entity));
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
  public Iterable<BasOrgGoodsvarDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgGoodsvarDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasOrgGoodsvar> itor =
          repository.batchUpdate(BasOrgGoodsvar.batchConvertDTO(entities));
      return BasOrgGoodsvar.batchConvert(itor);
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
  public BasOrgGoodsvarDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<BasOrgGoodsvarDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasOrgGoodsvar.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasOrgGoodsvarDTO> findBy(
      @ApiParam("badGoodsRate") java.math.BigDecimal badGoodsRate,
      @ApiParam("prodArea") String prodArea,
      @ApiParam("qualSituDesc") String qualSituDesc,
      @ApiParam("supplyStateDesc") String supplyStateDesc,
      @ApiParam("supplyTrendDesc") String supplyTrendDesc,
      @ApiParam("isMustSale") Integer isMustSale,
      @ApiParam("mustSaleDesc") String mustSaleDesc,
      @ApiParam("difference") String difference,
      @ApiParam("goodsWrapDesc") String goodsWrapDesc,
      @ApiParam("goodsEva") String goodsEva,
      @ApiParam("techDesc") String techDesc,
      @ApiParam("isBEnabledC") Integer isBEnabledC,
      @ApiParam("isCEnabledA") Integer isCEnabledA,
      @ApiParam("isCEnabledN") Integer isCEnabledN,
      @ApiParam("isCEnabledM") Integer isCEnabledM,
      @ApiParam("isCEnabledO") Integer isCEnabledO,
      @ApiParam("isCEnabledP") Integer isCEnabledP,
      @ApiParam("isCEnabledC") Integer isCEnabledC,
      @ApiParam("isCEnabledE") Integer isCEnabledE,
      @ApiParam("isCEnabledF") Integer isCEnabledF,
      @ApiParam("entId") Long entId,
      @ApiParam("orgId") Long orgId,
      @ApiParam("goodsVarId") Long goodsVarId,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("unitId") Long unitId,
      @ApiParam("unitCode") String unitCode,
      @ApiParam("unitName") String unitName,
      @ApiParam("unitRate") java.math.BigDecimal unitRate,
      @ApiParam("isSale") Integer isSale,
      @ApiParam("isReturn") Integer isReturn,
      @ApiParam("isStockInv") Integer isStockInv,
      @ApiParam("isRet") Integer isRet,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          badGoodsRate,
          prodArea,
          qualSituDesc,
          supplyStateDesc,
          supplyTrendDesc,
          isMustSale,
          mustSaleDesc,
          difference,
          goodsWrapDesc,
          goodsEva,
          techDesc,
          isBEnabledC,
          isCEnabledA,
          isCEnabledN,
          isCEnabledM,
          isCEnabledO,
          isCEnabledP,
          isCEnabledC,
          isCEnabledE,
          isCEnabledF,
          entId,
          orgId,
          goodsVarId,
          goodsId,
          unitId,
          unitCode,
          unitName,
          unitRate,
          isSale,
          isReturn,
          isStockInv,
          isRet,
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
  public Page<BasOrgGoodsvarDTO> findByExample(
      @ApiParam("example") BasOrgGoodsvarDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasOrgGoodsvar.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasOrgGoodsvarDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasOrgGoodsvarDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_org_goodsvar"), new PageParam(0, 10), BasOrgGoodsvarDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basOrgGoodsvarTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasOrgGoodsvarDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasOrgGoodsvarDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_org_goodsvar set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basOrgGoodsvarTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
