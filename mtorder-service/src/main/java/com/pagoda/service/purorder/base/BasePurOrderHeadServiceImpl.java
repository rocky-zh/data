package com.pagoda.service.purorder.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.purorder.*;
import com.pagoda.api.dto.purorder.*;
import com.pagoda.domain.purorder.*;
import com.pagoda.repo.purorder.*;

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
 * 采购订单头表服务实现类PurOrderHeadServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BasePurOrderHeadServiceImpl implements PurOrderHeadService, InitializingBean {

  @Autowired protected PurOrderHeadRepository repository;

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
  public Iterable<PurOrderHeadDTO> findAll() {
    return PurOrderHead.batchConvert(repository.findAll());
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
  public PurOrderHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid PurOrderHeadDTO entity)
      throws ServiceException {
    try {
      return repository.create(PurOrderHead.convertDTO(entity));
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
  public Iterable<PurOrderHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PurOrderHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurOrderHead> itor = repository.batchCreate(PurOrderHead.batchConvertDTO(entities));
      return PurOrderHead.batchConvert(itor);
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
  public PurOrderHeadDTO update(@ApiParam(value = "entity", required = true) PurOrderHeadDTO entity)
      throws ServiceException {
    try {
      return repository.update(PurOrderHead.convertDTO(entity));
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
  public Iterable<PurOrderHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PurOrderHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<PurOrderHead> itor = repository.batchUpdate(PurOrderHead.batchConvertDTO(entities));
      return PurOrderHead.batchConvert(itor);
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
  public PurOrderHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<PurOrderHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return PurOrderHead.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<PurOrderHeadDTO> findBy(
      @ApiParam("entId") Long entId,
      @ApiParam("seqno") String seqno,
      @ApiParam("venOrgId") Long venOrgId,
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("venComfirmStatus") Integer venComfirmStatus,
      @ApiParam("venComfirmUserCode") String venComfirmUserCode,
      @ApiParam("venComfirmUserName") String venComfirmUserName,
      @ApiParam("orderStatus") Integer orderStatus,
      @ApiParam("planRecDate") java.util.Date planRecDate,
      @ApiParam("auditorCode") String auditorCode,
      @ApiParam("auditorName") String auditorName,
      @ApiParam("auditTime") java.sql.Timestamp auditTime,
      @ApiParam("bpmnStatus") Integer bpmnStatus,
      @ApiParam("bpmnRemark") String bpmnRemark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          entId,
          seqno,
          venOrgId,
          venOrgCode,
          venOrgName,
          venComfirmStatus,
          venComfirmUserCode,
          venComfirmUserName,
          orderStatus,
          planRecDate,
          auditorCode,
          auditorName,
          auditTime,
          bpmnStatus,
          bpmnRemark,
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
  public Page<PurOrderHeadDTO> findByExample(
      @ApiParam("example") PurOrderHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(PurOrderHead.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findHeadByParams", notes = "采购单列表查询")
  @Override
  public Page<FindHeadByParamsDTO> findHeadByParams(
      @ApiParam("orderNo") String orderNo,
      @ApiParam("venOrgCode") String venOrgCode,
      @ApiParam("venOrgName") String venOrgName,
      @ApiParam("recOrgCode") String recOrgCode,
      @ApiParam("recOrgName") String recOrgName,
      @ApiParam("arrOrgCode") String arrOrgCode,
      @ApiParam("arrOrgName") String arrOrgName,
      @ApiParam("goodsCode") String goodsCode,
      @ApiParam("goodsName") String goodsName,
      @ApiParam("creatorCode") String creatorCode,
      @ApiParam("creatorName") String creatorName,
      @ApiParam("createdAt") String createdAt,
      @ApiParam("planRecDate") String planRecDate,
      @ApiParam("auditorCode") String auditorCode,
      @ApiParam("auditorName") String auditorName,
      @ApiParam("auditTime") String auditTime,
      @ApiParam("orderStatus") String orderStatus,
      @ApiParam("seqno") String seqno,
      @ApiParam("aimOrgCode") String aimOrgCode,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findHeadByParams(
          orderNo,
          venOrgCode,
          venOrgName,
          recOrgCode,
          recOrgName,
          arrOrgCode,
          arrOrgName,
          goodsCode,
          goodsName,
          creatorCode,
          creatorName,
          createdAt,
          planRecDate,
          auditorCode,
          auditorName,
          auditTime,
          orderStatus,
          seqno,
          aimOrgCode,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<PurOrderHeadDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<PurOrderHeadDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from pur_order_head"), new PageParam(0, 10), PurOrderHeadDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(purOrderHeadTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<PurOrderHeadDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), PurOrderHeadDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update pur_order_head set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(purOrderHeadTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
