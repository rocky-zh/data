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
 * 往来单位-01 主表定义服务实现类BasOrgServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BaseBasOrgServiceImpl implements BasOrgService, InitializingBean {

  @Autowired protected BasOrgRepository repository;

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
  public Iterable<BasOrgDTO> findAll() {
    return BasOrg.batchConvert(repository.findAll());
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
  public BasOrgDTO create(@ApiParam(value = "entity", required = true) @Valid BasOrgDTO entity)
      throws ServiceException {
    try {
      return repository.create(BasOrg.convertDTO(entity));
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
  public Iterable<BasOrgDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasOrg> itor = repository.batchCreate(BasOrg.batchConvertDTO(entities));
      return BasOrg.batchConvert(itor);
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
  public BasOrgDTO update(@ApiParam(value = "entity", required = true) BasOrgDTO entity)
      throws ServiceException {
    try {
      return repository.update(BasOrg.convertDTO(entity));
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
  public Iterable<BasOrgDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgDTO> entities)
      throws ServiceException {
    try {
      Iterable<BasOrg> itor = repository.batchUpdate(BasOrg.batchConvertDTO(entities));
      return BasOrg.batchConvert(itor);
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
  public BasOrgDTO getById(@ApiParam(value = "id", required = true) Long id)
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
  public Iterable<BasOrgDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return BasOrg.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<BasOrgDTO> findBy(
      @ApiParam("isCus") Integer isCus,
      @ApiParam("isOrg") Integer isOrg,
      @ApiParam("isVen") Integer isVen,
      @ApiParam("isOut") Integer isOut,
      @ApiParam("isDep") Integer isDep,
      @ApiParam("depCode") String depCode,
      @ApiParam("depId") Long depId,
      @ApiParam("depName") String depName,
      @ApiParam("isBal") Integer isBal,
      @ApiParam("isOrgGroup") Integer isOrgGroup,
      @ApiParam("balOrgId") Long balOrgId,
      @ApiParam("balOrgName") String balOrgName,
      @ApiParam("registerAddress") String registerAddress,
      @ApiParam("address") String address,
      @ApiParam("contactPerson") String contactPerson,
      @ApiParam("telephone") String telephone,
      @ApiParam("mobilephone") String mobilephone,
      @ApiParam("email") String email,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("entId") Long entId,
      @ApiParam("isEnabled") Integer isEnabled,
      @ApiParam("remark") String remark,
      @ApiParam("searchWord") String searchWord,
      @ApiParam("showOrder") Integer showOrder,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(
          isCus,
          isOrg,
          isVen,
          isOut,
          isDep,
          depCode,
          depId,
          depName,
          isBal,
          isOrgGroup,
          balOrgId,
          balOrgName,
          registerAddress,
          address,
          contactPerson,
          telephone,
          mobilephone,
          email,
          code,
          name,
          entId,
          isEnabled,
          remark,
          searchWord,
          showOrder,
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
  public Page<BasOrgDTO> findByExample(
      @ApiParam("example") BasOrgDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(BasOrg.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectBasOrgForList", notes = "往来单位定义列表模糊查询")
  @Override
  public Page<SelectBasOrgForListDTO> selectBasOrgForList(
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("bal_org_id") Long balOrgId,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("is_bal") Integer isBal,
      @ApiParam("is_out") Integer isOut,
      @ApiParam("is_dep") Integer isDep,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("is_org_group") Integer isOrgGroup,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectBasOrgForList(
          code,
          name,
          balOrgId,
          isCus,
          isOrg,
          isVen,
          isBal,
          isOut,
          isDep,
          isEnabled,
          isOrgGroup,
          deleted,
          entId,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectBasOrgByNameOrCode", notes = "结算、机构、客户、供应商单位name和code模糊查询")
  @Override
  public Page<BasOrgDTO> selectBasOrgByNameOrCode(
      @ApiParam("deleted") Long deleted,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("is_bal") Integer isBal,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("is_org_group") Integer isOrgGroup,
      @ApiParam("ent_id") Long entId,
      @ApiParam("name") String name,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectBasOrgByNameOrCode(
          deleted, isEnabled, isBal, isOrg, isCus, isVen, isOrgGroup, entId, name, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectBasOrgBalAndCatClassRel", notes = "所属往来单位 链目录表 选择弹框查询")
  @Override
  public Page<SelectBasOrgBalAndCatClassRelDTO> selectBasOrgBalAndCatClassRel(
      @ApiParam("path") String path,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("bal_org_id") Long balOrgId,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_bal") Integer isBal,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectBasOrgBalAndCatClassRel(
          path, deleted, entId, code, name, balOrgId, isOrg, isBal, isCus, isVen, isEnabled,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectBasOrgOrgByOrgGroup", notes = "查询虚拟机构组里面的子机构信息")
  @Override
  public Page<BasOrgDTO> selectBasOrgOrgByOrgGroup(
      @ApiParam("org_org_ids") String orgOrgIds,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectBasOrgOrgByOrgGroup(orgOrgIds, deleted, entId, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectBasOrgWithOutRel", notes = "往来单位关系定义查询未分类的数据")
  @Override
  public Page<BasOrgDTO> selectBasOrgWithOutRel(
      @ApiParam("bal_org_id") Long balOrgId,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("is_out") Integer isOut,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("cat_id") Long catId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectBasOrgWithOutRel(
          balOrgId, isCus, isOrg, isVen, isOut, isEnabled, deleted, entId, code, name, catId,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectBasOrgWithRel", notes = "往来单位关系定义查询 分类目录下的数据")
  @Override
  public Page<SelectBasOrgWithRelDTO> selectBasOrgWithRel(
      @ApiParam("path") String path,
      @ApiParam("ent_id") Long entId,
      @ApiParam("deleted") Long deleted,
      @ApiParam("bal_org_id") Long balOrgId,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("is_out") Integer isOut,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("cat_id") Long catId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectBasOrgWithRel(
          path, entId, deleted, balOrgId, isCus, isOrg, isVen, isOut, isEnabled, code, name, catId,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectDialogInfoWithOutCat", notes = "所属往来单位 未选择目录 选择弹框查询")
  @Override
  public Page<BasOrgDTO> selectDialogInfoWithOutCat(
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("bal_org_id") Long balOrgId,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_bal") Integer isBal,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("deleted") Long deleted,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("ent_id") Long entId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectDialogInfoWithOutCat(
          code, name, balOrgId, isOrg, isBal, isCus, isVen, deleted, isEnabled, entId, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectInvByCodeNameOrgIdAndCatRel", notes = "查询库房信息，根据目录选择框查询")
  @Override
  public Page<SelectInvByCodeNameOrgIdAndCatRelDTO> selectInvByCodeNameOrgIdAndCatRel(
      @ApiParam("path") String path,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("org_id") Long orgId,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectInvByCodeNameOrgIdAndCatRel(
          path, deleted, entId, isOrg, isCus, isVen, code, name, orgId, isEnabled, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectBasOrgByIsWhatAndRel", notes = "查询客户、供应商、机构目录关系信息")
  @Override
  public Page<SelectBasOrgByIsWhatAndRelDTO> selectBasOrgByIsWhatAndRel(
      @ApiParam("path") String path,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("bal_org_id") Long balOrgId,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_bal") Integer isBal,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectBasOrgByIsWhatAndRel(
          path, deleted, entId, code, name, balOrgId, isOrg, isBal, isCus, isVen, isEnabled,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectGroupOrgByCodeOrName", notes = "查询虚拟机构组可以绑定的子机构 下拉模糊")
  @Override
  public Page<BasOrgDTO> selectGroupOrgByCodeOrName(
      @ApiParam("deleted") Long deleted,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("is_bal") Integer isBal,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("ent_id") Long entId,
      @ApiParam("name") String name,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectGroupOrgByCodeOrName(
          deleted, isEnabled, isBal, isOrg, isCus, isVen, entId, name, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "seleteGroupOrgWithRelInfo", notes = "选择框查询虚拟机构组 子机构信息")
  @Override
  public Page<SeleteGroupOrgWithRelInfoDTO> seleteGroupOrgWithRelInfo(
      @ApiParam("path") String path,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("code") String code,
      @ApiParam("name") String name,
      @ApiParam("bal_org_id") Long balOrgId,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_bal") Integer isBal,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.seleteGroupOrgWithRelInfo(
          path, deleted, entId, code, name, balOrgId, isOrg, isBal, isCus, isVen, isEnabled,
          pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "selectSubOrgGroupInfo", notes = "查询虚拟机构组子机构信息")
  @Override
  public Page<SelectSubOrgGroupInfoDTO> selectSubOrgGroupInfo(
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("org_group_id") Long orgGroupId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.selectSubOrgGroupInfo(deleted, entId, orgGroupId, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<BasOrgDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<BasOrgDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from bas_org"), new PageParam(0, 10), BasOrgDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(basOrgTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<BasOrgDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), BasOrgDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update bas_org set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(basOrgTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
