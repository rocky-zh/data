package com.pagoda.service.salconsignreturn.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.salconsignreturn.*;
import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.domain.salconsignreturn.*;
import com.pagoda.repo.salconsignreturn.*;

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
 * 退货单头表服务实现类SalConsignReturnHeadServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseSalConsignReturnHeadServiceImpl
    implements SalConsignReturnHeadService, InitializingBean {

  @Autowired protected SalConsignReturnHeadRepository repository;

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
  public Iterable<SalConsignReturnHeadDTO> findAll() {
    return SalConsignReturnHead.batchConvert(repository.findAll());
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
  public SalConsignReturnHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignReturnHeadDTO entity)
      throws ServiceException {
    try {
      return repository.create(SalConsignReturnHead.convertDTO(entity));
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
  public Iterable<SalConsignReturnHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<SalConsignReturnHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalConsignReturnHead> itor =
          repository.batchCreate(SalConsignReturnHead.batchConvertDTO(entities));
      return SalConsignReturnHead.batchConvert(itor);
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
  public SalConsignReturnHeadDTO update(
      @ApiParam(value = "entity", required = true) SalConsignReturnHeadDTO entity)
      throws ServiceException {
    try {
      return repository.update(SalConsignReturnHead.convertDTO(entity));
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
  public Iterable<SalConsignReturnHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignReturnHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalConsignReturnHead> itor =
          repository.batchUpdate(SalConsignReturnHead.batchConvertDTO(entities));
      return SalConsignReturnHead.batchConvert(itor);
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
  public SalConsignReturnHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<SalConsignReturnHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return SalConsignReturnHead.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<SalConsignReturnHeadDTO> findBy(
      @ApiParam("returnType") Integer returnType,
      @ApiParam("returnDate") java.sql.Timestamp returnDate,
      @ApiParam("returnQty") java.math.BigDecimal returnQty,
      @ApiParam("stockinQty") java.math.BigDecimal stockinQty,
      @ApiParam("stockinGrossWeight") java.math.BigDecimal stockinGrossWeight,
      @ApiParam("stockinNetWeight") java.math.BigDecimal stockinNetWeight,
      @ApiParam("totalTaxAmt") java.math.BigDecimal totalTaxAmt,
      @ApiParam("totalReturnAmt") java.math.BigDecimal totalReturnAmt,
      @ApiParam("totalStockinAmt") java.math.BigDecimal totalStockinAmt,
      @ApiParam("status") Integer status,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          returnType,
          returnDate,
          returnQty,
          stockinQty,
          stockinGrossWeight,
          stockinNetWeight,
          totalTaxAmt,
          totalReturnAmt,
          totalStockinAmt,
          status,
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
  public Page<SalConsignReturnHeadDTO> findByExample(
      @ApiParam("example") SalConsignReturnHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(SalConsignReturnHead.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findSalConsignReturnHead", notes = "退货单及退货单审核列表查询")
  @Override
  public Page<SalConsignReturnHeadDTO> findSalConsignReturnHead(
      @ApiParam("seqno") String seqno,
      @ApiParam("arr_org_code") String arrOrgCode,
      @ApiParam("arr_org_name") String arrOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("return_type") Integer returnType,
      @ApiParam("status") Integer status,
      @ApiParam("transit_line_no") String transitLineNo,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findSalConsignReturnHead(
          seqno,
          arrOrgCode,
          arrOrgName,
          cusOrgCode,
          cusOrgName,
          returnType,
          status,
          transitLineNo,
          preArrivalDate1,
          preArrivalDate2,
          creatorOrgCode,
          codeList,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "updatePrintCount", notes = "修改打印次数")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer updatePrintCount(
      @ApiParam("seqno") String seqno,
      @ApiParam("arr_org_code") String arrOrgCode,
      @ApiParam("arr_org_name") String arrOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("return_type") Integer returnType,
      @ApiParam("status") Integer status,
      @ApiParam("transit_line_no") String transitLineNo,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList) {
    try {
      return repository.updatePrintCount(
          seqno,
          arrOrgCode,
          arrOrgName,
          cusOrgCode,
          cusOrgName,
          returnType,
          status,
          transitLineNo,
          preArrivalDate1,
          preArrivalDate2,
          creatorOrgCode,
          codeList);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<SalConsignReturnHeadDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<SalConsignReturnHeadDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from sal_consign_return_head"), new PageParam(0, 10), SalConsignReturnHeadDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(salConsignReturnHeadTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<SalConsignReturnHeadDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), SalConsignReturnHeadDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update sal_consign_return_head set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(salConsignReturnHeadTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
