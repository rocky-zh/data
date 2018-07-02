package com.pagoda.service.salconsign.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.salconsign.*;
import com.pagoda.api.dto.salconsign.*;
import com.pagoda.domain.salconsign.*;
import com.pagoda.repo.salconsign.*;

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
 * 发货单明细表服务实现类SalConsignDetailServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseSalConsignDetailServiceImpl
    implements SalConsignDetailService, InitializingBean {

  @Autowired protected SalConsignDetailRepository repository;

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
  public Iterable<SalConsignDetailDTO> findAll() {
    return SalConsignDetail.batchConvert(repository.findAll());
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
  public SalConsignDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignDetailDTO entity)
      throws ServiceException {
    try {
      return repository.create(SalConsignDetail.convertDTO(entity));
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
  public Iterable<SalConsignDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalConsignDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalConsignDetail> itor =
          repository.batchCreate(SalConsignDetail.batchConvertDTO(entities));
      return SalConsignDetail.batchConvert(itor);
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
  public SalConsignDetailDTO update(
      @ApiParam(value = "entity", required = true) SalConsignDetailDTO entity)
      throws ServiceException {
    try {
      return repository.update(SalConsignDetail.convertDTO(entity));
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
  public Iterable<SalConsignDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalConsignDetail> itor =
          repository.batchUpdate(SalConsignDetail.batchConvertDTO(entities));
      return SalConsignDetail.batchConvert(itor);
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
  public SalConsignDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<SalConsignDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return SalConsignDetail.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<SalConsignDetailDTO> findBy(
      @ApiParam("orderSeqno") String orderSeqno,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("salunitId") Long salunitId,
      @ApiParam("salUnitCode") String salUnitCode,
      @ApiParam("salUnitName") String salUnitName,
      @ApiParam("salUnitRate") java.math.BigDecimal salUnitRate,
      @ApiParam("salConOutDepotId") Long salConOutDepotId,
      @ApiParam("salConOutDepotCode") String salConOutDepotCode,
      @ApiParam("salConOutDepotName") String salConOutDepotName,
      @ApiParam("grossWeight") java.math.BigDecimal grossWeight,
      @ApiParam("netWeight") java.math.BigDecimal netWeight,
      @ApiParam("qty") java.math.BigDecimal qty,
      @ApiParam("volume") java.math.BigDecimal volume,
      @ApiParam("taxRate") java.math.BigDecimal taxRate,
      @ApiParam("price") java.math.BigDecimal price,
      @ApiParam("discountRate") java.math.BigDecimal discountRate,
      @ApiParam("actualAmt") java.math.BigDecimal actualAmt,
      @ApiParam("discountPrice") java.math.BigDecimal discountPrice,
      @ApiParam("shippedPrice") java.math.BigDecimal shippedPrice,
      @ApiParam("shippedCount") Integer shippedCount,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          orderSeqno,
          goodsId,
          goodsCode,
          goodsName,
          goodsSpec,
          salunitId,
          salUnitCode,
          salUnitName,
          salUnitRate,
          salConOutDepotId,
          salConOutDepotCode,
          salConOutDepotName,
          grossWeight,
          netWeight,
          qty,
          volume,
          taxRate,
          price,
          discountRate,
          actualAmt,
          discountPrice,
          shippedPrice,
          shippedCount,
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
  public Page<SalConsignDetailDTO> findByExample(
      @ApiParam("example") SalConsignDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(SalConsignDetail.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findSalConsignDetail", notes = "根据发货单id查询明细,用于发货时操作")
  @Override
  public Page<SalConsignDetailDTO> findSalConsignDetail(
      @ApiParam("con_id") Long conId,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findSalConsignDetail(conId, creatorOrgCode, codeList, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findSalConsignAllDetails", notes = "通过发货单id查看明细商品更多信息")
  @Override
  public Page<SalConsignDetailDTO> findSalConsignAllDetails(
      @ApiParam("con_id") Long conId,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findSalConsignAllDetails(conId, creatorOrgCode, codeList, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<SalConsignDetailDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<SalConsignDetailDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from sal_consign_detail"), new PageParam(0, 10), SalConsignDetailDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(salConsignDetailTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<SalConsignDetailDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), SalConsignDetailDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update sal_consign_detail set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(salConsignDetailTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
