package com.pagoda.service.pripurchase.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.pripurchase.*;
import com.pagoda.api.dto.pripurchase.*;
import com.pagoda.domain.pripurchase.*;
import com.pagoda.repo.pripurchase.*;

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
 * 采购调价单明细服务实现类PriceAdjustPurDetailServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BasePriceAdjustPurDetailServiceImpl
    implements PriceAdjustPurDetailService, InitializingBean {

  @Autowired protected PriceAdjustPurDetailRepository repository;

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
  public Iterable<PriceAdjustPurDetailDTO> findAll() {
    return PriceAdjustPurDetail.batchConvert(repository.findAll());
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
  public PriceAdjustPurDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid PriceAdjustPurDetailDTO entity)
      throws ServiceException {
    try {
      return repository.create(PriceAdjustPurDetail.convertDTO(entity));
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
  public Iterable<PriceAdjustPurDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<PriceAdjustPurDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<PriceAdjustPurDetail> itor =
          repository.batchCreate(PriceAdjustPurDetail.batchConvertDTO(entities));
      return PriceAdjustPurDetail.batchConvert(itor);
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
  public PriceAdjustPurDetailDTO update(
      @ApiParam(value = "entity", required = true) PriceAdjustPurDetailDTO entity)
      throws ServiceException {
    try {
      return repository.update(PriceAdjustPurDetail.convertDTO(entity));
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
  public Iterable<PriceAdjustPurDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PriceAdjustPurDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<PriceAdjustPurDetail> itor =
          repository.batchUpdate(PriceAdjustPurDetail.batchConvertDTO(entities));
      return PriceAdjustPurDetail.batchConvert(itor);
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
  public PriceAdjustPurDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<PriceAdjustPurDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return PriceAdjustPurDetail.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<PriceAdjustPurDetailDTO> findBy(
      @ApiParam("adjustId") Long adjustId,
      @ApiParam("adjustSeqno") String adjustSeqno,
      @ApiParam("entId") Long entId,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("goodsId") Long goodsId,
      @ApiParam("goodsSpec") String goodsSpec,
      @ApiParam("goodsClassId") Long goodsClassId,
      @ApiParam("goodsClassCode") String goodsClassCode,
      @ApiParam("goodsClassName") String goodsClassName,
      @ApiParam("unitId") Long unitId,
      @ApiParam("unitCode") String unitCode,
      @ApiParam("unitName") String unitName,
      @ApiParam("unitRate") java.math.BigDecimal unitRate,
      @ApiParam("purPrice") java.math.BigDecimal purPrice,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          adjustId,
          adjustSeqno,
          entId,
          goodsCode,
          goodsName,
          goodsId,
          goodsSpec,
          goodsClassId,
          goodsClassCode,
          goodsClassName,
          unitId,
          unitCode,
          unitName,
          unitRate,
          purPrice,
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
  public Page<PriceAdjustPurDetailDTO> findByExample(
      @ApiParam("example") PriceAdjustPurDetailDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(PriceAdjustPurDetail.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findGoodsLastPriceAdjust", notes = "商品最新调价单查询")
  @Override
  public Page<FindGoodsLastPriceAdjustDTO> findGoodsLastPriceAdjust(
      @ApiParam("seqno") String seqno,
      @ApiParam("arr_org_name") String arrOrgName,
      @ApiParam("ven_org_code") String venOrgCode,
      @ApiParam("goods_code") String goodsCode,
      @ApiParam("goods_name") String goodsName,
      @ApiParam("effect_date1") java.util.Date effectDate1,
      @ApiParam("effect_date2") java.util.Date effectDate2,
      @ApiParam("created_at1") java.sql.Timestamp createdAt1,
      @ApiParam("created_at2") java.sql.Timestamp createdAt2,
      @ApiParam("last_modified_at1") java.sql.Timestamp lastModifiedAt1,
      @ApiParam("last_modified_at2") java.sql.Timestamp lastModifiedAt2,
      @ApiParam("creator_code") String creatorCode,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findGoodsLastPriceAdjust(
          seqno,
          arrOrgName,
          venOrgCode,
          goodsCode,
          goodsName,
          effectDate1,
          effectDate2,
          createdAt1,
          createdAt2,
          lastModifiedAt1,
          lastModifiedAt2,
          creatorCode,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<PriceAdjustPurDetailDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<PriceAdjustPurDetailDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from price_adjust_pur_detail"), new PageParam(0, 10), PriceAdjustPurDetailDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(priceAdjustPurDetailTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<PriceAdjustPurDetailDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), PriceAdjustPurDetailDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update price_adjust_pur_detail set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(priceAdjustPurDetailTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
