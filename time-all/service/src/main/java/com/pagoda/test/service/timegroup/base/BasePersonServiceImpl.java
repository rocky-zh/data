package com.pagoda.test.service.timegroup.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.test.api.*;
import com.pagoda.test.api.timegroup.*;
import com.pagoda.test.api.dto.timegroup.*;
import com.pagoda.test.domain.timegroup.*;
import com.pagoda.test.repo.timegroup.*;

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
 * person服务实现类PersonServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BasePersonServiceImpl implements BasePersonService, InitializingBean {

  @Autowired protected PersonRepository repository;

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
  public Iterable<PersonDTO> findAll() {
    return Person.batchConvert(repository.findAll());
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
  public PersonDTO create(@ApiParam(value = "entity", required = true) @Valid PersonDTO entity)
      throws ServiceException {
    try {
      return repository.create(Person.convertDTO(entity));
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
  public Iterable<PersonDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<PersonDTO> entities)
      throws ServiceException {
    try {
      Iterable<Person> itor = repository.batchCreate(Person.batchConvertDTO(entities));
      return Person.batchConvert(itor);
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
  public PersonDTO update(@ApiParam(value = "entity", required = true) PersonDTO entity)
      throws ServiceException {
    try {
      return repository.update(Person.convertDTO(entity));
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
  public Iterable<PersonDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PersonDTO> entities)
      throws ServiceException {
    try {
      Iterable<Person> itor = repository.batchUpdate(Person.batchConvertDTO(entities));
      return Person.batchConvert(itor);
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
  public PersonDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<PersonDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return Person.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<PersonDTO> findBy(
      @ApiParam("zid") Long zid,
      @ApiParam("tid") Long tid,
      @ApiParam("loginDateTime") java.util.Date loginDateTime,
      @ApiParam("orderDate") java.util.Date orderDate,
      @ApiParam("orderTime") java.util.Date orderTime,
      @ApiParam("logoutTime") java.util.Date logoutTime,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(zid, tid, loginDateTime, orderDate, orderTime, logoutTime, pageable);
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
  public Page<PersonDTO> findByExample(
      @ApiParam("example") PersonDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(Person.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectWithTime", notes = "带时间的查询")
  @Override
  public Page<PersonDTO> selectWithTime(
      @ApiParam("order_time") java.util.Date orderTime,
      @ApiParam("idList") String idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectWithTime(orderTime, idList, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectWithTime", notes = "测试各种Date类型的查询")
  @Override
  public Page<PersonDTO> selectWithTime(
      @ApiParam("order_time") java.util.Date orderTime,
      @ApiParam("logout_time") java.util.Date logoutTime,
      @ApiParam("login_date_time") java.util.Date loginDateTime,
      @ApiParam("order_date") java.util.Date orderDate,
      @ApiParam("idList") List<Long> idList,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectWithTime(
          orderTime, logoutTime, loginDateTime, orderDate, idList, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<PersonDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<PersonDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from person"), new PageParam(0, 10), PersonDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(personTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<PersonDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), PersonDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update person set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(personTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
