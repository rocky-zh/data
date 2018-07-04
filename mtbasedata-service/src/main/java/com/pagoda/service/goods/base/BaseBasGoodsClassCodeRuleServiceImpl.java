package com.pagoda.service.goods.base;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.*;
import com.pagoda.api.goods.*;
import com.pagoda.api.dto.goods.*;
import com.pagoda.domain.goods.*;
import com.pagoda.repo.goods.*;

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
 * 商品分类(基本分类的一级分类)与代码规则关系表服务实现类BasGoodsClassCodeRuleServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasGoodsClassCodeRuleServiceImpl
    implements BasGoodsClassCodeRuleService, InitializingBean {

  @Autowired protected BasGoodsClassCodeRuleRepository repository;

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
  public Iterable<BasGoodsClassCodeRuleDTO> findAll() {
    return BasGoodsClassCodeRule.batchConvert(repository.findAll());
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
  public BasGoodsClassCodeRuleDTO create(
      @ApiParam(value = "entity", required = true) @Valid BasGoodsClassCodeRuleDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasGoodsClassCodeRule.convertDTO(entity));
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
  public Iterable<BasGoodsClassCodeRuleDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<BasGoodsClassCodeRuleDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasGoodsClassCodeRule> itor =
          repository.batchCreate(BasGoodsClassCodeRule.batchConvertDTO(entities));
      return BasGoodsClassCodeRule.batchConvert(itor);
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
  public BasGoodsClassCodeRuleDTO update(
      @ApiParam(value = "entity", required = true) BasGoodsClassCodeRuleDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasGoodsClassCodeRule.convertDTO(entity));
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
  public Iterable<BasGoodsClassCodeRuleDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasGoodsClassCodeRuleDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasGoodsClassCodeRule> itor =
          repository.batchUpdate(BasGoodsClassCodeRule.batchConvertDTO(entities));
      return BasGoodsClassCodeRule.batchConvert(itor);
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
  public BasGoodsClassCodeRuleDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<BasGoodsClassCodeRuleDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasGoodsClassCodeRule.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasGoodsClassCodeRuleDTO> findBy(
      @ApiParam("codeRuleId") Long codeRuleId,
      @ApiParam("name") String name,
      @ApiParam("goodsClassId") Long goodsClassId,
      @ApiParam("goodsClassCode") String goodsClassCode,
      @ApiParam("goodsClassName") String goodsClassName,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("isDefault") Integer isDefault,
      @ApiParam("remark") String remark,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          codeRuleId,
          name,
          goodsClassId,
          goodsClassCode,
          goodsClassName,
          isEnabled,
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
  public Page<BasGoodsClassCodeRuleDTO> findByExample(
      @ApiParam("example") BasGoodsClassCodeRuleDTO example,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasGoodsClassCodeRule.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "goodsClassCodeRuleFuzzyQuery", notes = "商品类型的模糊查询方法")
  @Override
  public Page<BasGoodsClassCodeRuleDTO> goodsClassCodeRuleFuzzyQuery(
      @ApiParam("name") String name,
      @ApiParam("goods_class_id") Long goodsClassId,
      @ApiParam("goods_class_name") String goodsClassName,
      @ApiParam("remark") String remark,
      @ApiParam("creator_code") String creatorCode,
      @ApiParam("creator_name") String creatorName,
      @ApiParam("creator_org_code") String creatorOrgCode,
      @ApiParam("modifier_code") String modifierCode,
      @ApiParam("modifier_name") String modifierName,
      @ApiParam("modifier_org_code") String modifierOrgCode,
      @ApiParam("deleted") Long deleted,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.goodsClassCodeRuleFuzzyQuery(
          name,
          goodsClassId,
          goodsClassName,
          remark,
          creatorCode,
          creatorName,
          creatorOrgCode,
          modifierCode,
          modifierName,
          modifierOrgCode,
          deleted,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "resetDefaultValue", notes = "重置默认属性，以保证只有一个默认")
  @Override
  @Transactional(rollbackFor = ServiceException.class)
  public Integer resetDefaultValue(
      @ApiParam("is_default") Integer isDefault, @ApiParam("name") String name) {
    try {
      return repository.resetDefaultValue(isDefault, name);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasGoodsClassCodeRuleDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasGoodsClassCodeRuleDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_goods_class_code_rule"), new PageParam(0, 10), BasGoodsClassCodeRuleDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basGoodsClassCodeRuleTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasGoodsClassCodeRuleDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasGoodsClassCodeRuleDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_goods_class_code_rule set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basGoodsClassCodeRuleTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
