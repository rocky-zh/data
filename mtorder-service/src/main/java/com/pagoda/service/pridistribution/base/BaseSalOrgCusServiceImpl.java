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
 * sal_org_cus服务实现类SalOrgCusServiceImpl继承的父类,实现一些平台共用的方法
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseSalOrgCusServiceImpl implements SalOrgCusService, InitializingBean  {

    @Autowired
    protected  SalOrgCusRepository repository;


  /**
   * 服务初始化
   * @throws Exception
   */
  @Override
  public void afterPropertiesSet() throws Exception{
  }

  /**
   * 查询所有记录
   * 
   * @return
   */
  public Iterable<SalOrgCusDTO> findAll() {
    return SalOrgCus.batchConvert(repository.findAll());
  }

    /**
     * Create a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity
     * @return the saved entity
     */
    @ApiOperation(value = "create", notes = "新增一条记录")
    @Override
    public SalOrgCusDTO create(@ApiParam(value = "entity", required = true) @Valid SalOrgCusDTO entity) throws ServiceException {
        try {
            return repository.create(SalOrgCus.convertDTO(entity));
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
    public Iterable<SalOrgCusDTO> batchCreate(@ApiParam(value = "entities", required = true) @Valid Iterable<SalOrgCusDTO> entities) throws ServiceException {
        try {
            Iterable<SalOrgCus> itor = repository.batchCreate(SalOrgCus.batchConvertDTO(entities));
            return SalOrgCus.batchConvert(itor);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }


    /**
     * Update a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity
     * @return the saved entity
     */
    @ApiOperation(value = "update", notes = "更新一条记录")
    @Override
    public SalOrgCusDTO update(@ApiParam(value = "entity", required = true) SalOrgCusDTO entity) throws ServiceException {
        try {
            return repository.update(SalOrgCus.convertDTO(entity));
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
    public Iterable<SalOrgCusDTO> batchUpdate(@ApiParam(value = "entities", required = true) Iterable<SalOrgCusDTO> entities) throws ServiceException {
        try {
            Iterable<SalOrgCus> itor = repository.batchUpdate(SalOrgCus.batchConvertDTO(entities));
            return SalOrgCus.batchConvert(itor);
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
    public void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids) throws ServiceException {
        for(Long id : ids) {
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
    public SalOrgCusDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException {
        try {
            return repository.getById(id);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }


    /**
    * 根据主键id批量查询
    * @param idList
    * @return
    * @throws ServiceException
    */
    @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
    @Override
    public Iterable<SalOrgCusDTO> batchGetByIds(@ApiParam("idList") List<Long> idList) throws ServiceException {
        try {
        return SalOrgCus.batchConvert(repository.batchGetByIds(idList));
        } catch (Exception e) {
        throw new ServiceException(e);
        }
    }


    @ApiOperation(value = "findBy", notes = "根据非空字段查询")
    @Override
    public Page<SalOrgCusDTO> findBy(@ApiParam("balCusOrgId")Long balCusOrgId, @ApiParam("balCusOrgName")String balCusOrgName, @ApiParam("dualOrgName")String dualOrgName, @ApiParam("isPickAutoRec")Integer isPickAutoRec, @ApiParam("isPickLimitCon")Integer isPickLimitCon, @ApiParam("billType")Integer billType, @ApiParam("isStoBackPrice")Integer isStoBackPrice, @ApiParam("isCreateBill")Integer isCreateBill, @ApiParam("isDefaultCon")Integer isDefaultCon, @ApiParam("isDefaultAllot")Integer isDefaultAllot, @ApiParam("cusOrgId")Long cusOrgId, @ApiParam("cusOrgCode")String cusOrgCode, @ApiParam("cusOrgName")String cusOrgName, @ApiParam("orgOrgId")Long orgOrgId, @ApiParam("orgOrgCode")String orgOrgCode, @ApiParam("orgOrgName")String orgOrgName, @ApiParam("balOrgId")Long balOrgId, @ApiParam("balOrgName")String balOrgName, @ApiParam("priceCatId")Long priceCatId, @ApiParam("priceCatCode")String priceCatCode, @ApiParam("priceCatName")String priceCatName, @ApiParam("isEnabled")Integer isEnabled, @ApiParam("pageable") Pageable pageable) throws ServiceException {
        try {
            return repository.findBy(balCusOrgId,balCusOrgName,dualOrgName,isPickAutoRec,isPickLimitCon,billType,isStoBackPrice,isCreateBill,isDefaultCon,isDefaultAllot,cusOrgId,cusOrgCode,cusOrgName,orgOrgId,orgOrgCode,orgOrgName,balOrgId,balOrgName,priceCatId,priceCatCode,priceCatName,isEnabled, pageable);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }
    

  /**
   *  根据非空的字段进行查询
   *
   * @param example
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByExample", notes = "根据非空字段查询")
  @Override
  public Page<SalOrgCusDTO> findByExample(@ApiParam("example") SalOrgCusDTO example, @ApiParam("pageable") Pageable pageable) throws ServiceException {
        try {
            return repository.findByExample(SalOrgCus.convertDTO(example), pageable);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }


    @ApiOperation(value = "findSalOrgCusList", notes = "")
    @Override
    public Page<> findSalOrgCusList(@ApiParam("pageable") Pageable pageable) throws ServiceException {
        try {
            return repository.findSalOrgCusList(pageable);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }

    @ApiOperation(value = "findCatalogAndOrg", notes = "去重查询价格目录和发货机构")
    @Override
    public Page<SalOrgCusDTO> findCatalogAndOrg(@ApiParam("pageable") Pageable pageable) throws ServiceException {
        try {
            return repository.findCatalogAndOrg(pageable);
        } catch (Exception e) {
            throw new ServiceException(e);
        }

    }


/*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<SalOrgCusDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<SalOrgCusDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from sal_org_cus"), new PageParam(0, 10), SalOrgCusDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(salOrgCusTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<SalOrgCusDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), SalOrgCusDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update sal_org_cus set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(salOrgCusTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  } 
   */
}