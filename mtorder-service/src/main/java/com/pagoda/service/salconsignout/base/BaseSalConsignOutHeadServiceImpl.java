package com.pagoda.service.salconsignout.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.salconsignout.*;
import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.domain.salconsignout.*;
import com.pagoda.repo.salconsignout.*;

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
 * 发货出库单头表服务实现类SalConsignOutHeadServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseSalConsignOutHeadServiceImpl
    implements SalConsignOutHeadService, InitializingBean {

  @Autowired protected SalConsignOutHeadRepository repository;

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
  public Iterable<SalConsignOutHeadDTO> findAll() {
    return SalConsignOutHead.batchConvert(repository.findAll());
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
  public SalConsignOutHeadDTO create(
      @ApiParam(value = "entity", required = true) @Valid SalConsignOutHeadDTO entity)
      throws ServiceException {
    try {
      return repository.create(SalConsignOutHead.convertDTO(entity));
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
  public Iterable<SalConsignOutHeadDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<SalConsignOutHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalConsignOutHead> itor =
          repository.batchCreate(SalConsignOutHead.batchConvertDTO(entities));
      return SalConsignOutHead.batchConvert(itor);
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
  public SalConsignOutHeadDTO update(
      @ApiParam(value = "entity", required = true) SalConsignOutHeadDTO entity)
      throws ServiceException {
    try {
      return repository.update(SalConsignOutHead.convertDTO(entity));
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
  public Iterable<SalConsignOutHeadDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<SalConsignOutHeadDTO> entities)
      throws ServiceException {
    try {
      Iterable<SalConsignOutHead> itor =
          repository.batchUpdate(SalConsignOutHead.batchConvertDTO(entities));
      return SalConsignOutHead.batchConvert(itor);
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
  public SalConsignOutHeadDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<SalConsignOutHeadDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return SalConsignOutHead.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<SalConsignOutHeadDTO> findBy(
      @ApiParam("seqno") String seqno,
      @ApiParam("entId") Long entId,
      @ApiParam("conId") Long conId,
      @ApiParam("conSeqno") String conSeqno,
      @ApiParam("preArrivalDate") java.util.Date preArrivalDate,
      @ApiParam("conOrgId") Long conOrgId,
      @ApiParam("conOrgCode") String conOrgCode,
      @ApiParam("conOrgName") String conOrgName,
      @ApiParam("cusOrgId") Long cusOrgId,
      @ApiParam("cusOrgCode") String cusOrgCode,
      @ApiParam("cusOrgName") String cusOrgName,
      @ApiParam("transitLineNo") String transitLineNo,
      @ApiParam("shippedQty") java.math.BigDecimal shippedQty,
      @ApiParam("shippedGrossWeight") java.math.BigDecimal shippedGrossWeight,
      @ApiParam("shippedNetWeight") java.math.BigDecimal shippedNetWeight,
      @ApiParam("shippedVolume") java.math.BigDecimal shippedVolume,
      @ApiParam("shippedAmt") java.math.BigDecimal shippedAmt,
      @ApiParam("taxAmt") java.math.BigDecimal taxAmt,
      @ApiParam("stockoutStatus") Integer stockoutStatus,
      @ApiParam("auditorCode") String auditorCode,
      @ApiParam("auditorName") String auditorName,
      @ApiParam("auditTime") java.sql.Timestamp auditTime,
      @ApiParam("remark") String remark,
      @ApiParam("confirmUserCode") String confirmUserCode,
      @ApiParam("confirmUserName") String confirmUserName,
      @ApiParam("confirmTime") java.sql.Timestamp confirmTime,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          seqno,
          entId,
          conId,
          conSeqno,
          preArrivalDate,
          conOrgId,
          conOrgCode,
          conOrgName,
          cusOrgId,
          cusOrgCode,
          cusOrgName,
          transitLineNo,
          shippedQty,
          shippedGrossWeight,
          shippedNetWeight,
          shippedVolume,
          shippedAmt,
          taxAmt,
          stockoutStatus,
          auditorCode,
          auditorName,
          auditTime,
          remark,
          confirmUserCode,
          confirmUserName,
          confirmTime,
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
  public Page<SalConsignOutHeadDTO> findByExample(
      @ApiParam("example") SalConsignOutHeadDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(SalConsignOutHead.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findSalConsignOutHead", notes = "根据相关条件查询发货出库单单头部数据")
  @Override
  public Page<FindSalConsignOutHeadDTO> findSalConsignOutHead(
      @ApiParam("con_seqno") String conSeqno,
      @ApiParam("seqno") String seqno,
      @ApiParam("con_org_code") String conOrgCode,
      @ApiParam("con_org_name") String conOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("transit_line_no") String transitLineNo,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("goods_code") String goodsCode,
      @ApiParam("goods_name") String goodsName,
      @ApiParam("stockout_status") Integer stockoutStatus,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findSalConsignOutHead(
          conSeqno,
          seqno,
          conOrgCode,
          conOrgName,
          cusOrgCode,
          cusOrgName,
          transitLineNo,
          preArrivalDate1,
          preArrivalDate2,
          goodsCode,
          goodsName,
          stockoutStatus,
          creatorOrgCode,
          codeList,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findConfirmGoodsList", notes = "确认到货页面查询")
  @Override
  public Page<SalConsignOutHeadDTO> findConfirmGoodsList(
      @ApiParam("seqno") String seqno,
      @ApiParam("con_org_code") String conOrgCode,
      @ApiParam("con_org_name") String conOrgName,
      @ApiParam("cus_org_code") String cusOrgCode,
      @ApiParam("cus_org_name") String cusOrgName,
      @ApiParam("pre_arrival_date1") java.util.Date preArrivalDate1,
      @ApiParam("pre_arrival_date2") java.util.Date preArrivalDate2,
      @ApiParam("stockout_status") Integer stockoutStatus,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("codeList") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findConfirmGoodsList(
          seqno,
          conOrgCode,
          conOrgName,
          cusOrgCode,
          cusOrgName,
          preArrivalDate1,
          preArrivalDate2,
          stockoutStatus,
          creatorOrgCode,
          codeList,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<SalConsignOutHeadDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<SalConsignOutHeadDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from sal_consign_out_head"), new PageParam(0, 10), SalConsignOutHeadDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(salConsignOutHeadTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<SalConsignOutHeadDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), SalConsignOutHeadDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update sal_consign_out_head set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(salConsignOutHeadTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
