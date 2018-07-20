package com.pagoda.service.purorgven.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.purorgven.*;
import com.pagoda.api.dto.purorgven.*;
import com.pagoda.domain.purorgven.*;
import com.pagoda.repo.purorgven.*;

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
 * 供应商机构服务实现类PurOrgVenServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BasePurOrgVenServiceImpl implements BasePurOrgVenService, InitializingBean {

  @Autowired protected PurOrgVenRepository repository;

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
  public Iterable<PurOrgVenDTO> findAll() {
    return PurOrgVen.batchConvert(repository.findAll());
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
  public PurOrgVenDTO create(
      @ApiParam(value = "entity", required = true) @Valid PurOrgVenDTO entity)
      throws ServiceException {
    try {
      return repository.create(PurOrgVen.convertDTO(entity));
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
  public Iterable<PurOrgVenDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PurOrgVenDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurOrgVen> itor = repository.batchCreate(PurOrgVen.batchConvertDTO(entities));
      return PurOrgVen.batchConvert(itor);
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
  public PurOrgVenDTO update(@ApiParam(value = "entity", required = true) PurOrgVenDTO entity)
      throws ServiceException {
    try {
      return repository.update(PurOrgVen.convertDTO(entity));
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
  public Iterable<PurOrgVenDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PurOrgVenDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurOrgVen> itor = repository.batchUpdate(PurOrgVen.batchConvertDTO(entities));
      return PurOrgVen.batchConvert(itor);
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
  public PurOrgVenDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<PurOrgVenDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return PurOrgVen.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<PurOrgVenDTO> findBy(
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("venOrgId") Long venOrgId,
      @ApiParam("orgOrgId") Long orgOrgId,
      @ApiParam("orgOrgCode") String orgOrgCode,
      @ApiParam("orgOrgName") String orgOrgName,
      @ApiParam("isAllowOrder") Integer isAllowOrder,
      @ApiParam("isAllowRec") Integer isAllowRec,
      @ApiParam("isReturnable") Integer isReturnable,
      @ApiParam("isPausePay") Integer isPausePay,
      @ApiParam("isOrderCheck") Integer isOrderCheck,
      @ApiParam("isRecCheck") Integer isRecCheck,
      @ApiParam("isReturnCheck") Integer isReturnCheck,
      @ApiParam("isInvCheck") Integer isInvCheck,
      @ApiParam("settlementType") Integer settlementType,
      @ApiParam("remark") String remark,
      @ApiParam("venClassId") Long venClassId,
      @ApiParam("venClassName") String venClassName,
      @ApiParam("venClassCode") String venClassCode,
      @ApiParam("balOrgOrgId") Long balOrgOrgId,
      @ApiParam("balOrgOrgCode") String balOrgOrgCode,
      @ApiParam("balOrgOrgName") String balOrgOrgName,
      @ApiParam("entId") Long entId,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          venOrgCode,
          venOrgName,
          venOrgId,
          orgOrgId,
          orgOrgCode,
          orgOrgName,
          isAllowOrder,
          isAllowRec,
          isReturnable,
          isPausePay,
          isOrderCheck,
          isRecCheck,
          isReturnCheck,
          isInvCheck,
          settlementType,
          remark,
          venClassId,
          venClassName,
          venClassCode,
          balOrgOrgId,
          balOrgOrgCode,
          balOrgOrgName,
          entId,
          isEnabled,
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
  public Page<PurOrgVenDTO> findByExample(
      @ApiParam("example") PurOrgVenDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(PurOrgVen.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectOrgVenAuthored", notes = "已授权机构供应商查询")
  @Override
  public Page<PurOrgVenDTO> selectOrgVenAuthored(
      @ApiParam("ven_org_id_list") List<Long> venOrgIdList,
      @ApiParam("org_org_id_list") List<Long> orgOrgIdList,
      @ApiParam("bal_org_org_id_list") List<Long> balOrgOrgIdList,
      @ApiParam("ven_class_id_list") List<Long> venClassIdList,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("ent_id") Long entId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectOrgVenAuthored(
          venOrgIdList,
          orgOrgIdList,
          balOrgOrgIdList,
          venClassIdList,
          isEnabled,
          entId,
          deleted,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<PurOrgVenDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<PurOrgVenDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from pur_org_ven"), new PageParam(0, 10), PurOrgVenDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(purOrgVenTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<PurOrgVenDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), PurOrgVenDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update pur_org_ven set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(purOrgVenTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
