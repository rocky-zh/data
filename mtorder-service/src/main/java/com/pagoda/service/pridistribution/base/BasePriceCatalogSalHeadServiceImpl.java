package com.pagoda.service.pridistribution.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.pridistribution.*;
import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.domain.pridistribution.*;
import com.pagoda.repo.pridistribution.*;

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
 * 价格目录头表(配送价格)服务实现类PriceCatalogSalHeadServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BasePriceCatalogSalHeadServiceImpl
    implements PriceCatalogSalHeadService, InitializingBean {

  @Autowired protected PriceCatalogSalHeadRepository repository;

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
  public Iterable<PriceCatalogSalHeadDTO> findAll() {
    return PriceCatalogSalHead.batchConvert(repository.findAll());
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
  public PriceCatalogSalHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid PriceCatalogSalHeadDTO entity)
      throws ServiceException {
    try {
      return repository.create(PriceCatalogSalHead.convertDTO(entity));
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
  public Iterable<PriceCatalogSalHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<PriceCatalogSalHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<PriceCatalogSalHead> itor =
          repository.batchCreate(PriceCatalogSalHead.batchConvertDTO(entities));
      return PriceCatalogSalHead.batchConvert(itor);
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
  public PriceCatalogSalHeadDTO update(
      @ApiParam(value = "entity", required = true) PriceCatalogSalHeadDTO entity)
      throws ServiceException {
    try {
      return repository.update(PriceCatalogSalHead.convertDTO(entity));
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
  public Iterable<PriceCatalogSalHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PriceCatalogSalHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<PriceCatalogSalHead> itor =
          repository.batchUpdate(PriceCatalogSalHead.batchConvertDTO(entities));
      return PriceCatalogSalHead.batchConvert(itor);
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
  public PriceCatalogSalHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<PriceCatalogSalHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return PriceCatalogSalHead.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<PriceCatalogSalHeadDTO> findBy(
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("balOrgOrgId") Long balOrgOrgId,
      @ApiParam("balOrgOrgCode") String balOrgOrgCode,
      @ApiParam("balOrgOrgName") String balOrgOrgName,
      @ApiParam("entId") Long entId,
      @ApiParam("isEnable") Integer isEnable,
      @ApiParam("isUsed") Integer isUsed,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          code,
          name,
          balOrgOrgId,
          balOrgOrgCode,
          balOrgOrgName,
          entId,
          isEnable,
          isUsed,
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
  public Page<PriceCatalogSalHeadDTO> findByExample(
      @ApiParam("example") PriceCatalogSalHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(PriceCatalogSalHead.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findByMultipleCondititons", notes = "多条件查询价格目录表头")
  @Override
  public Page<PriceCatalogSalHeadDTO> findByMultipleCondititons(
      @ApiParam("name") String name,
      @ApiParam("bal_org_org_code") String balOrgOrgCode,
      @ApiParam("is_enable") Integer isEnable,
      @ApiParam("created_at1") java.sql.Timestamp createdAt1,
      @ApiParam("created_at2") java.sql.Timestamp createdAt2,
      @ApiParam("last_modified_at1") java.sql.Timestamp lastModifiedAt1,
      @ApiParam("last_modified_at2") java.sql.Timestamp lastModifiedAt2,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("creator_org_code_list") String creatorOrgCodeList,
      @ApiParam("code") String code,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByMultipleCondititons(
          name,
          balOrgOrgCode,
          isEnable,
          createdAt1,
          createdAt2,
          lastModifiedAt1,
          lastModifiedAt2,
          creatorOrgCode,
          creatorOrgCodeList,
          code,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<PriceCatalogSalHeadDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<PriceCatalogSalHeadDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from price_catalog_sal_head"), new PageParam(0, 10), PriceCatalogSalHeadDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(priceCatalogSalHeadTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<PriceCatalogSalHeadDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), PriceCatalogSalHeadDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update price_catalog_sal_head set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(priceCatalogSalHeadTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
