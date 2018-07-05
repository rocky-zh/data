package com.pagoda.api.org;

import com.pagoda.api.dto.org.*;
import com.pagoda.api.*;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.*;
import java.util.concurrent.*;
import javax.validation.*;
import io.swagger.annotations.*;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.Validated;

/**
 * Service继承的父接口,定义一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public interface BaseBasOrgService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  BasOrgDTO create(@ApiParam(value = "entity", required = true) @Valid BasOrgDTO entity)
      throws ServiceException;

  /**
   * Create all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   * @throws ServiceException
   */
  @ApiOperation(value = "batchCreate", notes = "批量插入多条记录")
  Iterable<BasOrgDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<BasOrgDTO> entities)
      throws ServiceException;

  /**
   * Update a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "update", notes = "更新一条记录")
  BasOrgDTO update(@ApiParam(value = "entity", required = true) BasOrgDTO entity)
      throws ServiceException;

  /**
   * Update all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   * @throws ServiceException
   */
  @ApiOperation(value = "batchUpdate", notes = "批量更新多条记录")
  Iterable<BasOrgDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<BasOrgDTO> entities)
      throws ServiceException;

  /**
   * Deletes the entity with the given id.
   *
   * @param id must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "delete", notes = "删除一条记录")
  void delete(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * Deletes the entities in a batch with the given ids.
   *
   * @param ids must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code ids} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "batchDelete", notes = "批量删除多条记录")
  void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids)
      throws ServiceException;

  /**
   * Retrieves an entity by its id.
   *
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   * @throws IllegalArgumentException if {@code id} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "getById", notes = "根据id查询记录")
  BasOrgDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  Iterable<BasOrgDTO> batchGetByIds(@ApiParam("idList") List<Long> idList) throws ServiceException;

  /**
   * 根据非空的字段进行查询
   *
   * @param example
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByExample", notes = "根据非空字段查询")
  Page<BasOrgDTO> findByExample(
      @ApiParam("example") BasOrgDTO example, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param isCus
   * @param isOrg
   * @param isVen
   * @param isOut
   * @param isDep
   * @param depCode
   * @param depId
   * @param depName
   * @param isBal
   * @param isOrgGroup
   * @param balOrgId
   * @param balOrgName
   * @param registerAddress
   * @param address
   * @param contactPerson
   * @param telephone
   * @param mobilephone
   * @param email
   * @param code
   * @param name
   * @param entId
   * @param isEnabled
   * @param remark
   * @param searchWord
   * @param showOrder
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<BasOrgDTO> findBy(
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
      throws ServiceException;

  /**
   * 往来单位定义列表模糊查询
   *
   * @param code
   * @param name
   * @param balOrgId
   * @param isCus
   * @param isOrg
   * @param isVen
   * @param isBal
   * @param isOut
   * @param isDep
   * @param isEnabled
   * @param isOrgGroup
   * @param deleted
   * @param entId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectBasOrgForList", notes = "")
  Page<SelectBasOrgForListDTO> selectBasOrgForList(
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
      throws ServiceException;

  /**
   * 结算、机构、客户、供应商单位name和code模糊查询
   *
   * @param deleted
   * @param isEnabled
   * @param isBal
   * @param isOrg
   * @param isCus
   * @param isVen
   * @param isOrgGroup
   * @param entId
   * @param name
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectBasOrgByNameOrCode", notes = "")
  Page<BasOrgDTO> selectBasOrgByNameOrCode(
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
      throws ServiceException;

  /**
   * 所属往来单位 链目录表 选择弹框查询
   *
   * @param path
   * @param deleted
   * @param entId
   * @param code
   * @param name
   * @param balOrgId
   * @param isOrg
   * @param isBal
   * @param isCus
   * @param isVen
   * @param isEnabled
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectBasOrgBalAndCatClassRel", notes = "")
  Page<SelectBasOrgBalAndCatClassRelDTO> selectBasOrgBalAndCatClassRel(
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
      throws ServiceException;

  /**
   * 查询虚拟机构组里面的子机构信息
   *
   * @param orgOrgIds
   * @param deleted
   * @param entId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectBasOrgOrgByOrgGroup", notes = "")
  Page<BasOrgDTO> selectBasOrgOrgByOrgGroup(
      @ApiParam("org_org_ids") String orgOrgIds,
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 往来单位关系定义查询未分类的数据
   *
   * @param balOrgId
   * @param isCus
   * @param isOrg
   * @param isVen
   * @param isOut
   * @param isEnabled
   * @param deleted
   * @param entId
   * @param code
   * @param name
   * @param catId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectBasOrgWithOutRel", notes = "")
  Page<BasOrgDTO> selectBasOrgWithOutRel(
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
      throws ServiceException;

  /**
   * 往来单位关系定义查询 分类目录下的数据
   *
   * @param path
   * @param entId
   * @param deleted
   * @param balOrgId
   * @param isCus
   * @param isOrg
   * @param isVen
   * @param isOut
   * @param isEnabled
   * @param code
   * @param name
   * @param catId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectBasOrgWithRel", notes = "")
  Page<SelectBasOrgWithRelDTO> selectBasOrgWithRel(
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
      throws ServiceException;

  /**
   * 所属往来单位 未选择目录 选择弹框查询
   *
   * @param code
   * @param name
   * @param balOrgId
   * @param isOrg
   * @param isBal
   * @param isCus
   * @param isVen
   * @param deleted
   * @param isEnabled
   * @param entId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectDialogInfoWithOutCat", notes = "")
  Page<BasOrgDTO> selectDialogInfoWithOutCat(
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
      throws ServiceException;

  /**
   * 查询库房信息，根据目录选择框查询
   *
   * @param path
   * @param deleted
   * @param entId
   * @param isOrg
   * @param isCus
   * @param isVen
   * @param code
   * @param name
   * @param orgId
   * @param isEnabled
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectInvByCodeNameOrgIdAndCatRel", notes = "")
  Page<SelectInvByCodeNameOrgIdAndCatRelDTO> selectInvByCodeNameOrgIdAndCatRel(
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
      throws ServiceException;

  /**
   * 查询客户、供应商、机构目录关系信息
   *
   * @param path
   * @param deleted
   * @param entId
   * @param code
   * @param name
   * @param balOrgId
   * @param isOrg
   * @param isBal
   * @param isCus
   * @param isVen
   * @param isEnabled
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectBasOrgByIsWhatAndRel", notes = "")
  Page<SelectBasOrgByIsWhatAndRelDTO> selectBasOrgByIsWhatAndRel(
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
      throws ServiceException;

  /**
   * 查询虚拟机构组可以绑定的子机构 下拉模糊
   *
   * @param deleted
   * @param isEnabled
   * @param isBal
   * @param isOrg
   * @param isCus
   * @param isVen
   * @param entId
   * @param name
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectGroupOrgByCodeOrName", notes = "")
  Page<BasOrgDTO> selectGroupOrgByCodeOrName(
      @ApiParam("deleted") Long deleted,
      @ApiParam("is_enabled") Integer isEnabled,
      @ApiParam("is_bal") Integer isBal,
      @ApiParam("is_org") Integer isOrg,
      @ApiParam("is_cus") Integer isCus,
      @ApiParam("is_ven") Integer isVen,
      @ApiParam("ent_id") Long entId,
      @ApiParam("name") String name,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 选择框查询虚拟机构组 子机构信息
   *
   * @param path
   * @param deleted
   * @param entId
   * @param code
   * @param name
   * @param balOrgId
   * @param isOrg
   * @param isBal
   * @param isCus
   * @param isVen
   * @param isEnabled
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "seleteGroupOrgWithRelInfo", notes = "")
  Page<SeleteGroupOrgWithRelInfoDTO> seleteGroupOrgWithRelInfo(
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
      throws ServiceException;

  /**
   * 查询虚拟机构组子机构信息
   *
   * @param deleted
   * @param entId
   * @param orgGroupId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "selectSubOrgGroupInfo", notes = "")
  Page<SelectSubOrgGroupInfoDTO> selectSubOrgGroupInfo(
      @ApiParam("deleted") Long deleted,
      @ApiParam("ent_id") Long entId,
      @ApiParam("org_group_id") Long orgGroupId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
