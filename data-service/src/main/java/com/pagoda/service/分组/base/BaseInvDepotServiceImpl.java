package com.pagoda.service.分组.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.分组.*;
import com.pagoda.api.dto.分组.*;
import com.pagoda.domain.分组.*;
import com.pagoda.repo.分组.*;

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
 * 库房定义服务实现类InvDepotServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseInvDepotServiceImpl implements InvDepotService, InitializingBean {

  @Autowired protected InvDepotRepository repository;

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
  public Iterable<InvDepotDTO> findAll() {
    return InvDepot.batchConvert(repository.findAll());
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
  public InvDepotDTO create(@ApiParam(value = "entity", required = true) @Valid InvDepotDTO entity)
      throws ServiceException {
    try {
      return repository.create(InvDepot.convertDTO(entity));
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
  public Iterable<InvDepotDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<InvDepotDTO> entities)
      throws ServiceException {
    try {
      Iterable<InvDepot> itor = repository.batchCreate(InvDepot.batchConvertDTO(entities));
      return InvDepot.batchConvert(itor);
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
  public InvDepotDTO update(@ApiParam(value = "entity", required = true) InvDepotDTO entity)
      throws ServiceException {
    try {
      return repository.update(InvDepot.convertDTO(entity));
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
  public Iterable<InvDepotDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<InvDepotDTO> entities)
      throws ServiceException {
    try {
      Iterable<InvDepot> itor = repository.batchUpdate(InvDepot.batchConvertDTO(entities));
      return InvDepot.batchConvert(itor);
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
  public InvDepotDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<InvDepotDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return InvDepot.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<InvDepotDTO> findBy(
      @ApiParam("adCode") String adCode,
      @ApiParam("adLat") String adLat,
      @ApiParam("adLng") String adLng,
      @ApiParam("address") String address,
      @ApiParam("balOrgId") Long balOrgId,
      @ApiParam("currentPeriod") String currentPeriod,
      @ApiParam("depotCenterId") Integer depotCenterId,
      @ApiParam("isAllowInvOut") Integer isAllowInvOut,
      @ApiParam("isAllowPostReturn") Integer isAllowPostReturn,
      @ApiParam("isCheckByAdd") Integer isCheckByAdd,
      @ApiParam("isCheckByNegative") Integer isCheckByNegative,
      @ApiParam("isCheckByPost") Integer isCheckByPost,
      @ApiParam("isCheckInputNeedCheck") Integer isCheckInputNeedCheck,
      @ApiParam("isCheckQtyZero") Integer isCheckQtyZero,
      @ApiParam("isCheckShowFinQty") Integer isCheckShowFinQty,
      @ApiParam("isDualDepot") Integer isDualDepot,
      @ApiParam("isPickAllocation") Integer isPickAllocation,
      @ApiParam("isPostCheckAll") Integer isPostCheckAll,
      @ApiParam("isPostDaily") Integer isPostDaily,
      @ApiParam("isPostDailyDetail") Integer isPostDailyDetail,
      @ApiParam("isPurRecIn") Integer isPurRecIn,
      @ApiParam("isPurRetOut") Integer isPurRetOut,
      @ApiParam("isSalConIn") Integer isSalConIn,
      @ApiParam("isSalConOut") Integer isSalConOut,
      @ApiParam("isSalRetIn") Integer isSalRetIn,
      @ApiParam("isSalRetOut") Integer isSalRetOut,
      @ApiParam("isStoEnabled") Integer isStoEnabled,
      @ApiParam("isTurnExistNoPost") Integer isTurnExistNoPost,
      @ApiParam("manageType") Integer manageType,
      @ApiParam("measureType") Integer measureType,
      @ApiParam("orgId") Long orgId,
      @ApiParam("phone") String phone,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("stoCurrentPeriod") Integer stoCurrentPeriod,
      @ApiParam("turnDateTime") java.sql.Timestamp turnDateTime,
      @ApiParam("turnUserCode") String turnUserCode,
      @ApiParam("turnUserName") String turnUserName,
      @ApiParam("createDateTime") java.sql.Timestamp createDateTime,
      @ApiParam("createOrgCode") String createOrgCode,
      @ApiParam("createUserCode") String createUserCode,
      @ApiParam("createUserName") String createUserName,
      @ApiParam("delId") Integer delId,
      @ApiParam("depotAddress") String depotAddress,
      @ApiParam("depotPhone") String depotPhone,
      @ApiParam("orgCode") String orgCode,
      @ApiParam("orgName") String orgName,
      @ApiParam("updateDateTime") java.sql.Timestamp updateDateTime,
      @ApiParam("updateOrgCode") String updateOrgCode,
      @ApiParam("updateUserCode") String updateUserCode,
      @ApiParam("updateUserName") String updateUserName,
      @ApiParam("code") String code,
      @ApiParam("entId") Long entId,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("name") String name,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          adCode,
          adLat,
          adLng,
          address,
          balOrgId,
          currentPeriod,
          depotCenterId,
          isAllowInvOut,
          isAllowPostReturn,
          isCheckByAdd,
          isCheckByNegative,
          isCheckByPost,
          isCheckInputNeedCheck,
          isCheckQtyZero,
          isCheckShowFinQty,
          isDualDepot,
          isPickAllocation,
          isPostCheckAll,
          isPostDaily,
          isPostDailyDetail,
          isPurRecIn,
          isPurRetOut,
          isSalConIn,
          isSalConOut,
          isSalRetIn,
          isSalRetOut,
          isStoEnabled,
          isTurnExistNoPost,
          manageType,
          measureType,
          orgId,
          phone,
          searchWord,
          stoCurrentPeriod,
          turnDateTime,
          turnUserCode,
          turnUserName,
          createDateTime,
          createOrgCode,
          createUserCode,
          createUserName,
          delId,
          depotAddress,
          depotPhone,
          orgCode,
          orgName,
          updateDateTime,
          updateOrgCode,
          updateUserCode,
          updateUserName,
          code,
          entId,
          isEnabled,
          name,
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
  public Page<InvDepotDTO> findByExample(
      @ApiParam("example") InvDepotDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(InvDepot.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findInvDepotByCatClass", notes = "根据目录或者目录分类查找库房")
  @Override
  public Page<FindInvDepotByCatClassDTO> findInvDepotByCatClass(
      @ApiParam("cat_id") Long catId,
      @ApiParam("path") String path,
      @ApiParam("table_id") Integer tableId,
      @ApiParam("version") Integer version,
      @ApiParam("id") Long id,
      @ApiParam("ad_code") String adCode,
      @ApiParam("ad_lat") String adLat,
      @ApiParam("ad_lng") String adLng,
      @ApiParam("depot_center_id") Integer depotCenterId,
      @ApiParam("ent_id") Long entId,
      @ApiParam("turn_date_time") java.sql.Timestamp turnDateTime,
      @ApiParam("org_id") Long orgId,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("name") String name,
      @ApiParam("code") String code,
      @ApiParam("current_period") String currentPeriod,
      @ApiParam("deleted") Long deleted,
      @ApiParam("code_list") String codeList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findInvDepotByCatClass(
          catId,
          path,
          tableId,
          version,
          id,
          adCode,
          adLat,
          adLng,
          depotCenterId,
          entId,
          turnDateTime,
          orgId,
          isEnabled,
          name,
          code,
          currentPeriod,
          deleted,
          codeList,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectInvByCodeOrName", notes = "下拉模糊查询库房信息")
  @Override
  public Page<InvDepotDTO> selectInvByCodeOrName(
      @ApiParam("deleted") Long deleted,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("ent_id") Long entId,
      @ApiParam("name") String name,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectInvByCodeOrName(deleted, isEnabled, entId, name, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<InvDepotDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<InvDepotDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from inv_depot"), new PageParam(0, 10), InvDepotDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(invDepotTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<InvDepotDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), InvDepotDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update inv_depot set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(invDepotTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
