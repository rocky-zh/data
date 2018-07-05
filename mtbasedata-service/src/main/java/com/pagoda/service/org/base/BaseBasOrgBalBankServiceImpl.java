package com.pagoda.service.org.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.org.*;
import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
import com.pagoda.repo.org.*;

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
 * 往来单位-016 结算机构开户行表 服务实现类BasOrgBalBankServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasOrgBalBankServiceImpl
    implements BasOrgBalBankService, InitializingBean {

  @Autowired protected BasOrgBalBankRepository repository;

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
  public Iterable<BasOrgBalBankDTO> findAll() {
    return BasOrgBalBank.batchConvert(repository.findAll());
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
  public BasOrgBalBankDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasOrgBalBankDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasOrgBalBank.convertDTO(entity));
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
  public Iterable<BasOrgBalBankDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgBalBankDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasOrgBalBank> itor =
          repository.batchCreate(BasOrgBalBank.batchConvertDTO(entities));
      return BasOrgBalBank.batchConvert(itor);
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
  public BasOrgBalBankDTO update(
      @ApiParam(value = "entity", required = true) BasOrgBalBankDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasOrgBalBank.convertDTO(entity));
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
  public Iterable<BasOrgBalBankDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgBalBankDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasOrgBalBank> itor =
          repository.batchUpdate(BasOrgBalBank.batchConvertDTO(entities));
      return BasOrgBalBank.batchConvert(itor);
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
  public BasOrgBalBankDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<BasOrgBalBankDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasOrgBalBank.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasOrgBalBankDTO> findBy(
      @ApiParam("bank") String bank,
      @ApiParam("provinceName") String provinceName,
      @ApiParam("cityName") String cityName,
      @ApiParam("registerBank") String registerBank,
      @ApiParam("accountName") String accountName,
      @ApiParam("bankAccountNo") String bankAccountNo,
      @ApiParam("cityCode") String cityCode,
      @ApiParam("provinceCode") String provinceCode,
      @ApiParam("balOrgId") Long balOrgId,
      @ApiParam("isDefault") Integer isDefault,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          bank,
          provinceName,
          cityName,
          registerBank,
          accountName,
          bankAccountNo,
          cityCode,
          provinceCode,
          balOrgId,
          isDefault,
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
  public Page<BasOrgBalBankDTO> findByExample(
      @ApiParam("example") BasOrgBalBankDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasOrgBalBank.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "updateDefByBalOrgId", notes = "将改结算单位的所有默认开户行改为否")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer updateDefByBalOrgId(@ApiParam("bal_org_id") Long balOrgId) {
    try {
      return repository.updateDefByBalOrgId(balOrgId);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "updateDefById", notes = "修改开户行的是否默认")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer updateDefById(@ApiParam("id") Long id) {
    try {
      return repository.updateDefById(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "deleteByBalOrgId", notes = "通过结算单位Id删除开户行信息")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer deleteByBalOrgId(@ApiParam("bal_org_id") Long balOrgId) {
    try {
      return repository.deleteByBalOrgId(balOrgId);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasOrgBalBankDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasOrgBalBankDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_org_bal_bank"), new PageParam(0, 10), BasOrgBalBankDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basOrgBalBankTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasOrgBalBankDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasOrgBalBankDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_org_bal_bank set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basOrgBalBankTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
