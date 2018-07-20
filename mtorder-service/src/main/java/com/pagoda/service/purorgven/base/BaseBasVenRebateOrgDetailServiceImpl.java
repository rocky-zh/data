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
 * 供应商返利到货机构明细表服务实现类BasVenRebateOrgDetailServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasVenRebateOrgDetailServiceImpl
    implements BaseBasVenRebateOrgDetailService, InitializingBean {

  @Autowired protected BasVenRebateOrgDetailRepository repository;

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
  public Iterable<BasVenRebateOrgDetailDTO> findAll() {
    return BasVenRebateOrgDetail.batchConvert(repository.findAll());
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
  public BasVenRebateOrgDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasVenRebateOrgDetailDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasVenRebateOrgDetail.convertDTO(entity));
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
  public Iterable<BasVenRebateOrgDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<BasVenRebateOrgDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasVenRebateOrgDetail> itor =
          repository.batchCreate(BasVenRebateOrgDetail.batchConvertDTO(entities));
      return BasVenRebateOrgDetail.batchConvert(itor);
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
  public BasVenRebateOrgDetailDTO update(
      @ApiParam(value = "entity", required = true) BasVenRebateOrgDetailDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasVenRebateOrgDetail.convertDTO(entity));
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
  public Iterable<BasVenRebateOrgDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasVenRebateOrgDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasVenRebateOrgDetail> itor =
          repository.batchUpdate(BasVenRebateOrgDetail.batchConvertDTO(entities));
      return BasVenRebateOrgDetail.batchConvert(itor);
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
  public BasVenRebateOrgDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<BasVenRebateOrgDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasVenRebateOrgDetail.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasVenRebateOrgDetailDTO> findBy(
      @ApiParam("rebateId") Long rebateId,
      @ApiParam("rebateNo") String rebateNo,
      @ApiParam("arrOrgId") Long arrOrgId,
      @ApiParam("arrOrgCode") String arrOrgCode,
      @ApiParam("arrOrgName") String arrOrgName,
      @ApiParam("entId") Long entId,
      @ApiParam("effectDate") java.util.Date effectDate,
      @ApiParam("expiryDate") java.util.Date expiryDate,
      @ApiParam("status") Integer status,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          rebateId,
          rebateNo,
          arrOrgId,
          arrOrgCode,
          arrOrgName,
          entId,
          effectDate,
          expiryDate,
          status,
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
  public Page<BasVenRebateOrgDetailDTO> findByExample(
      @ApiParam("example") BasVenRebateOrgDetailDTO example,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasVenRebateOrgDetail.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectVenRebateOrgDetailSetted", notes = "查询供应商返利机构明细表")
  @Override
  public Page<BasVenRebateOrgDetailDTO> selectVenRebateOrgDetailSetted(
      @ApiParam("arr_org_code") String arrOrgCode,
      @ApiParam("arr_org_name") String arrOrgName,
      @ApiParam("status") Integer status,
      @ApiParam("ent_id") Long entId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectVenRebateOrgDetailSetted(
          arrOrgCode, arrOrgName, status, entId, deleted, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "updateOrgDetailStatusByRebateId", notes = "通过协议号id更新机构明细的状态")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer updateOrgDetailStatusByRebateId(
      @ApiParam("status") Integer status, @ApiParam("rebate_id") Long rebateId) {
    try {
      return repository.updateOrgDetailStatusByRebateId(status, rebateId);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "deleteOrgDetailByRebateId", notes = "删除供应商返利的机构明细")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer deleteOrgDetailByRebateId(@ApiParam("rebate_id") Long rebateId) {
    try {
      return repository.deleteOrgDetailByRebateId(rebateId);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasVenRebateOrgDetailDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasVenRebateOrgDetailDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_ven_rebate_org_detail"), new PageParam(0, 10), BasVenRebateOrgDetailDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basVenRebateOrgDetailTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasVenRebateOrgDetailDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasVenRebateOrgDetailDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_ven_rebate_org_detail set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basVenRebateOrgDetailTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
