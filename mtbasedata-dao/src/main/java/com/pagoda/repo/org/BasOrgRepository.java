package com.pagoda.repo.org;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
import com.pagoda.repo.org.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * BasOrg 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface BasOrgRepository
    extends BasOrgRepositoryCustom, PagodaJpaRepository<BasOrg, Long> {

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
   */
  @SqlTemplate(
    name = "selectBasOrgForList",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.last_modified_at,bas.mobilephone,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version, baso.code as bal_org_code from bas_org bas inner join bas_org baso on bas.bal_org_id=baso.id where {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#is_bal}}bas.is_bal=:is_bal and {{/is_bal}} {{#is_out}}bas.is_out=:is_out and {{/is_out}} {{#is_dep}}bas.is_dep=:is_dep and {{/is_dep}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#is_org_group}}bas.is_org_group=:is_org_group and {{/is_org_group}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  Page<SelectBasOrgForListDTO> selectBasOrgForList(
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_cus") Integer isCus,
      @Param("is_org") Integer isOrg,
      @Param("is_ven") Integer isVen,
      @Param("is_bal") Integer isBal,
      @Param("is_out") Integer isOut,
      @Param("is_dep") Integer isDep,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_org_group") Integer isOrgGroup,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "selectBasOrgForList",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.last_modified_at,bas.mobilephone,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version, baso.code as bal_org_code from bas_org bas inner join bas_org baso on bas.bal_org_id=baso.id where {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#is_bal}}bas.is_bal=:is_bal and {{/is_bal}} {{#is_out}}bas.is_out=:is_out and {{/is_out}} {{#is_dep}}bas.is_dep=:is_dep and {{/is_dep}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#is_org_group}}bas.is_org_group=:is_org_group and {{/is_org_group}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  List<SelectBasOrgForListDTO> selectBasOrgForList(
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_cus") Integer isCus,
      @Param("is_org") Integer isOrg,
      @Param("is_ven") Integer isVen,
      @Param("is_bal") Integer isBal,
      @Param("is_out") Integer isOut,
      @Param("is_dep") Integer isDep,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_org_group") Integer isOrgGroup,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId);

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
   */
  @SqlTemplate(
    name = "selectBasOrgByNameOrCode",
    sql =
        "select id, code, name from bas_org where {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#is_bal}}is_bal=:is_bal and {{/is_bal}} {{#is_org}}is_org=:is_org and {{/is_org}} {{#is_cus}}is_cus=:is_cus and {{/is_cus}} {{#is_ven}}is_ven=:is_ven and {{/is_ven}} {{#is_org_group}}is_org_group=:is_org_group and {{/is_org_group}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} (code like '{{name}}%' or name like '{{name}}%')"
  )
  Page<BasOrgDTO> selectBasOrgByNameOrCode(
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_bal") Integer isBal,
      @Param("is_org") Integer isOrg,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("is_org_group") Integer isOrgGroup,
      @Param("ent_id") Long entId,
      @Param("name") String name,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "selectBasOrgByNameOrCode",
    sql =
        "select id, code, name from bas_org where {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#is_bal}}is_bal=:is_bal and {{/is_bal}} {{#is_org}}is_org=:is_org and {{/is_org}} {{#is_cus}}is_cus=:is_cus and {{/is_cus}} {{#is_ven}}is_ven=:is_ven and {{/is_ven}} {{#is_org_group}}is_org_group=:is_org_group and {{/is_org_group}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} (code like '{{name}}%' or name like '{{name}}%')"
  )
  List<BasOrgDTO> selectBasOrgByNameOrCode(
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_bal") Integer isBal,
      @Param("is_org") Integer isOrg,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("is_org_group") Integer isOrgGroup,
      @Param("ent_id") Long entId,
      @Param("name") String name);

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
   */
  @SqlTemplate(
    name = "selectBasOrgBalAndCatClassRel",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.created_at,bas.creator_code,bas.creator_name,bas.creator_org_code,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.last_modified_at,bas.mobilephone,bas.modifier_code,bas.modifier_name,bas.modifier_org_code,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version, cat.cat_class_name, cat.cat_class_code, cat.cat_class_id from bas_org bas inner join bas_cat_class_rel cat on cat.path like '{{path}}%' and {{#deleted}}cat.deleted=:deleted and {{/deleted}} {{#ent_id}}cat.ent_id=:ent_id and {{/ent_id}} bas.id=cat.obj_id where {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_bal}}bas.is_bal=:is_bal and {{/is_bal}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  Page<SelectBasOrgBalAndCatClassRelDTO> selectBasOrgBalAndCatClassRel(
      @Param("path") String path,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_org") Integer isOrg,
      @Param("is_bal") Integer isBal,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("is_enabled") Integer isEnabled,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "selectBasOrgBalAndCatClassRel",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.created_at,bas.creator_code,bas.creator_name,bas.creator_org_code,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.last_modified_at,bas.mobilephone,bas.modifier_code,bas.modifier_name,bas.modifier_org_code,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version, cat.cat_class_name, cat.cat_class_code, cat.cat_class_id from bas_org bas inner join bas_cat_class_rel cat on cat.path like '{{path}}%' and {{#deleted}}cat.deleted=:deleted and {{/deleted}} {{#ent_id}}cat.ent_id=:ent_id and {{/ent_id}} bas.id=cat.obj_id where {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_bal}}bas.is_bal=:is_bal and {{/is_bal}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  List<SelectBasOrgBalAndCatClassRelDTO> selectBasOrgBalAndCatClassRel(
      @Param("path") String path,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_org") Integer isOrg,
      @Param("is_bal") Integer isBal,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("is_enabled") Integer isEnabled);

  /**
   * 查询虚拟机构组里面的子机构信息
   *
   * @param orgOrgIds
   * @param deleted
   * @param entId
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectBasOrgOrgByOrgGroup",
    sql =
        "select id,code,name,ent_id,is_enabled,is_cus,is_org,is_ven,is_out,is_dep,dep_code,dep_id,dep_name,is_bal,is_org_group,bal_org_id,bal_org_name,register_address,address,contact_person,telephone,mobilephone,email,remark,search_word,version,deleted,show_order from bas_org where id in({{#org_org_ids}}org_org_ids{{/org_org_ids}}) and {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  Page<BasOrgDTO> selectBasOrgOrgByOrgGroup(
      @Param("org_org_ids") String orgOrgIds,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("pageable") Pageable pageable);

  /**
   * 查询虚拟机构组里面的子机构信息
   *
   * @param orgOrgIds
   * @param deleted
   * @param entId
   * @return
   */
  @SqlTemplate(
    name = "selectBasOrgOrgByOrgGroup",
    sql =
        "select id,code,name,ent_id,is_enabled,is_cus,is_org,is_ven,is_out,is_dep,dep_code,dep_id,dep_name,is_bal,is_org_group,bal_org_id,bal_org_name,register_address,address,contact_person,telephone,mobilephone,email,remark,search_word,version,deleted,show_order from bas_org where id in({{#org_org_ids}}org_org_ids{{/org_org_ids}}) and {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  List<BasOrgDTO> selectBasOrgOrgByOrgGroup(
      @Param("org_org_ids") String orgOrgIds,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId);

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
   */
  @SqlTemplate(
    name = "selectBasOrgWithOutRel",
    sql =
        "select id,code,name,ent_id,is_enabled,is_cus,is_org,is_ven,is_out,is_dep,dep_code,dep_id,dep_name,is_bal,is_org_group,bal_org_id,bal_org_name,register_address,address,contact_person,telephone,mobilephone,email,remark,search_word,version,deleted,show_order from bas_org where {{#bal_org_id}}bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_cus}}is_cus=:is_cus and {{/is_cus}} {{#is_org}}is_org=:is_org and {{/is_org}} {{#is_ven}}is_ven=:is_ven and {{/is_ven}} {{#is_out}}is_out=:is_out and {{/is_out}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#code}}code like '{{code}}%' and {{/code}} {{#name}}name like '{{name}}%' and {{/name}} id not in(select obj_id from bas_cat_class_rel cat where cat.cat_id=:cat_id {{#ent_id}} and cat.ent_id=:ent_id{{/ent_id}} {{#deleted}} and cat.deleted=:deleted{{/deleted}})"
  )
  Page<BasOrgDTO> selectBasOrgWithOutRel(
      @Param("bal_org_id") Long balOrgId,
      @Param("is_cus") Integer isCus,
      @Param("is_org") Integer isOrg,
      @Param("is_ven") Integer isVen,
      @Param("is_out") Integer isOut,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("code") String code,
      @Param("name") String name,
      @Param("cat_id") Long catId,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "selectBasOrgWithOutRel",
    sql =
        "select id,code,name,ent_id,is_enabled,is_cus,is_org,is_ven,is_out,is_dep,dep_code,dep_id,dep_name,is_bal,is_org_group,bal_org_id,bal_org_name,register_address,address,contact_person,telephone,mobilephone,email,remark,search_word,version,deleted,show_order from bas_org where {{#bal_org_id}}bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_cus}}is_cus=:is_cus and {{/is_cus}} {{#is_org}}is_org=:is_org and {{/is_org}} {{#is_ven}}is_ven=:is_ven and {{/is_ven}} {{#is_out}}is_out=:is_out and {{/is_out}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} {{#code}}code like '{{code}}%' and {{/code}} {{#name}}name like '{{name}}%' and {{/name}} id not in(select obj_id from bas_cat_class_rel cat where cat.cat_id=:cat_id {{#ent_id}} and cat.ent_id=:ent_id{{/ent_id}} {{#deleted}} and cat.deleted=:deleted{{/deleted}})"
  )
  List<BasOrgDTO> selectBasOrgWithOutRel(
      @Param("bal_org_id") Long balOrgId,
      @Param("is_cus") Integer isCus,
      @Param("is_org") Integer isOrg,
      @Param("is_ven") Integer isVen,
      @Param("is_out") Integer isOut,
      @Param("is_enabled") Integer isEnabled,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("code") String code,
      @Param("name") String name,
      @Param("cat_id") Long catId);

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
   */
  @SqlTemplate(
    name = "selectBasOrgWithRel",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version, cat.id as cat_class_rel_id from bas_org bas inner join bas_cat_class_rel cat on cat.cat_id=:cat_id and bas.id=cat.obj_id {{#path}} and cat.path like '{{path}}%'{{/path}} {{#ent_id}} and cat.ent_id=:ent_id{{/ent_id}} {{#deleted}} and cat.deleted=:deleted{{/deleted}} where {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#is_out}}bas.is_out=:is_out and {{/is_out}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} 1=1"
  )
  Page<SelectBasOrgWithRelDTO> selectBasOrgWithRel(
      @Param("path") String path,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_cus") Integer isCus,
      @Param("is_org") Integer isOrg,
      @Param("is_ven") Integer isVen,
      @Param("is_out") Integer isOut,
      @Param("is_enabled") Integer isEnabled,
      @Param("code") String code,
      @Param("name") String name,
      @Param("cat_id") Long catId,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "selectBasOrgWithRel",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version, cat.id as cat_class_rel_id from bas_org bas inner join bas_cat_class_rel cat on cat.cat_id=:cat_id and bas.id=cat.obj_id {{#path}} and cat.path like '{{path}}%'{{/path}} {{#ent_id}} and cat.ent_id=:ent_id{{/ent_id}} {{#deleted}} and cat.deleted=:deleted{{/deleted}} where {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#is_out}}bas.is_out=:is_out and {{/is_out}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} 1=1"
  )
  List<SelectBasOrgWithRelDTO> selectBasOrgWithRel(
      @Param("path") String path,
      @Param("ent_id") Long entId,
      @Param("deleted") Long deleted,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_cus") Integer isCus,
      @Param("is_org") Integer isOrg,
      @Param("is_ven") Integer isVen,
      @Param("is_out") Integer isOut,
      @Param("is_enabled") Integer isEnabled,
      @Param("code") String code,
      @Param("name") String name,
      @Param("cat_id") Long catId);

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
   */
  @SqlTemplate(
    name = "selectDialogInfoWithOutCat",
    sql =
        "select id,address,bal_org_id,bal_org_name,code,contact_person,deleted,dep_code,dep_id,dep_name,email,ent_id,is_bal,is_cus,is_dep,is_enabled,is_org,is_org_group,is_out,is_ven,mobilephone,name,register_address,remark,search_word,telephone,version from bas_org where {{#code}}code like '{{code}}%' and {{/code}} {{#name}}name like '{{name}}%' and {{/name}} {{#bal_org_id}}bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_org}}is_org=:is_org and {{/is_org}} {{#is_bal}}is_bal=:is_bal and {{/is_bal}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  Page<BasOrgDTO> selectDialogInfoWithOutCat(
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_org") Integer isOrg,
      @Param("is_bal") Integer isBal,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled,
      @Param("ent_id") Long entId,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "selectDialogInfoWithOutCat",
    sql =
        "select id,address,bal_org_id,bal_org_name,code,contact_person,deleted,dep_code,dep_id,dep_name,email,ent_id,is_bal,is_cus,is_dep,is_enabled,is_org,is_org_group,is_out,is_ven,mobilephone,name,register_address,remark,search_word,telephone,version from bas_org where {{#code}}code like '{{code}}%' and {{/code}} {{#name}}name like '{{name}}%' and {{/name}} {{#bal_org_id}}bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_org}}is_org=:is_org and {{/is_org}} {{#is_bal}}is_bal=:is_bal and {{/is_bal}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  List<BasOrgDTO> selectDialogInfoWithOutCat(
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_org") Integer isOrg,
      @Param("is_bal") Integer isBal,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled,
      @Param("ent_id") Long entId);

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
   */
  @SqlTemplate(
    name = "selectInvByCodeNameOrgIdAndCatRel",
    sql =
        "select a.id,a.ad_code,a.ad_lat,a.ad_lng,a.address,a.bal_org_id,a.code,a.current_period,a.depot_center_id, a.ent_id,a.is_allow_inv_out,a.is_allow_post_return,a.is_check_by_add,a.is_check_by_negative,a.is_check_by_post,a.is_check_input_need_check,a.is_check_qty_zero,a.is_check_show_fin_qty,a.is_dual_depot,a.is_enabled, a.is_pick_allocation,a.is_post_check_all,a.is_post_daily,a.is_post_daily_detail,a.is_pur_rec_in,a.is_pur_ret_out,a.is_sal_con_in,a.is_sal_con_out,a.is_sal_ret_in,a.is_sal_ret_out,a.is_sto_enabled,a.is_turn_exist_no_post,a.manage_type,a.measure_type,a.name,a.org_id,a.phone,a.sto_current_period,a.turn_date_time,a.turn_user_code,a.turn_user_name,a.last_modified_at,a.modifier_name,a.modifier_code,a.modifier_org_code,a.created_at,a.creator_code,a.creator_name,a.creator_org_code,a.version, cat.cat_class_name, cat.cat_class_code, cat.cat_class_id from inv_depot a inner join bas_cat_class_rel cat on cat.path like '{{path}}%' and {{#deleted}}cat.deleted=:deleted and {{/deleted}} {{#ent_id}}cat.ent_id=:ent_id and {{/ent_id}} a.id=cat.obj_id inner join bas_org bas on a.org_id=bas.id and {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} 1=1 where {{#code}}a.code like '{{code}}%' and {{/code}} {{#name}}a.name like '{{name}}%' and {{/name}} {{#org_id}}a.org_id=:org_id and {{/org_id}} {{#deleted}}a.deleted=:deleted and {{/deleted}} {{#is_enabled}}a.is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}a.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  Page<SelectInvByCodeNameOrgIdAndCatRelDTO> selectInvByCodeNameOrgIdAndCatRel(
      @Param("path") String path,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("is_org") Integer isOrg,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("code") String code,
      @Param("name") String name,
      @Param("org_id") Long orgId,
      @Param("is_enabled") Integer isEnabled,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "selectInvByCodeNameOrgIdAndCatRel",
    sql =
        "select a.id,a.ad_code,a.ad_lat,a.ad_lng,a.address,a.bal_org_id,a.code,a.current_period,a.depot_center_id, a.ent_id,a.is_allow_inv_out,a.is_allow_post_return,a.is_check_by_add,a.is_check_by_negative,a.is_check_by_post,a.is_check_input_need_check,a.is_check_qty_zero,a.is_check_show_fin_qty,a.is_dual_depot,a.is_enabled, a.is_pick_allocation,a.is_post_check_all,a.is_post_daily,a.is_post_daily_detail,a.is_pur_rec_in,a.is_pur_ret_out,a.is_sal_con_in,a.is_sal_con_out,a.is_sal_ret_in,a.is_sal_ret_out,a.is_sto_enabled,a.is_turn_exist_no_post,a.manage_type,a.measure_type,a.name,a.org_id,a.phone,a.sto_current_period,a.turn_date_time,a.turn_user_code,a.turn_user_name,a.last_modified_at,a.modifier_name,a.modifier_code,a.modifier_org_code,a.created_at,a.creator_code,a.creator_name,a.creator_org_code,a.version, cat.cat_class_name, cat.cat_class_code, cat.cat_class_id from inv_depot a inner join bas_cat_class_rel cat on cat.path like '{{path}}%' and {{#deleted}}cat.deleted=:deleted and {{/deleted}} {{#ent_id}}cat.ent_id=:ent_id and {{/ent_id}} a.id=cat.obj_id inner join bas_org bas on a.org_id=bas.id and {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} 1=1 where {{#code}}a.code like '{{code}}%' and {{/code}} {{#name}}a.name like '{{name}}%' and {{/name}} {{#org_id}}a.org_id=:org_id and {{/org_id}} {{#deleted}}a.deleted=:deleted and {{/deleted}} {{#is_enabled}}a.is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}a.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  List<SelectInvByCodeNameOrgIdAndCatRelDTO> selectInvByCodeNameOrgIdAndCatRel(
      @Param("path") String path,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("is_org") Integer isOrg,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("code") String code,
      @Param("name") String name,
      @Param("org_id") Long orgId,
      @Param("is_enabled") Integer isEnabled);

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
   */
  @SqlTemplate(
    name = "selectBasOrgByIsWhatAndRel",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.mobilephone,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version,baso.code as bal_org_code from bas_org bas inner join bas_org baso on bas.bal_org_id=baso.id {{#path}} inner join bas_cat_class_rel cat on cat.path like '{{path}}%' and {{#deleted}}cat.deleted=:deleted and {{/deleted}} {{#ent_id}}cat.ent_id=:ent_id and {{/ent_id}} bas.id=cat.obj_id {{/path}} where {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_bal}}bas.is_bal=:is_bal and {{/is_bal}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  Page<SelectBasOrgByIsWhatAndRelDTO> selectBasOrgByIsWhatAndRel(
      @Param("path") String path,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_org") Integer isOrg,
      @Param("is_bal") Integer isBal,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("is_enabled") Integer isEnabled,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "selectBasOrgByIsWhatAndRel",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.mobilephone,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version,baso.code as bal_org_code from bas_org bas inner join bas_org baso on bas.bal_org_id=baso.id {{#path}} inner join bas_cat_class_rel cat on cat.path like '{{path}}%' and {{#deleted}}cat.deleted=:deleted and {{/deleted}} {{#ent_id}}cat.ent_id=:ent_id and {{/ent_id}} bas.id=cat.obj_id {{/path}} where {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_bal}}bas.is_bal=:is_bal and {{/is_bal}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  List<SelectBasOrgByIsWhatAndRelDTO> selectBasOrgByIsWhatAndRel(
      @Param("path") String path,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_org") Integer isOrg,
      @Param("is_bal") Integer isBal,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("is_enabled") Integer isEnabled);

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
   */
  @SqlTemplate(
    name = "selectGroupOrgByCodeOrName",
    sql =
        "select id, code, name, bal_org_name from bas_org where {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#is_bal}}is_bal=:is_bal and {{/is_bal}} {{#is_org}}is_org=:is_org and {{/is_org}} {{#is_cus}}is_cus=:is_cus and {{/is_cus}} {{#is_ven}}is_ven=:is_ven and {{/is_ven}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} (code like '{{name}}%' or name like '{{name}}%') and id not in (select bal_org_id from bas_org_group_org where {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} 1=1)"
  )
  Page<BasOrgDTO> selectGroupOrgByCodeOrName(
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_bal") Integer isBal,
      @Param("is_org") Integer isOrg,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("ent_id") Long entId,
      @Param("name") String name,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "selectGroupOrgByCodeOrName",
    sql =
        "select id, code, name, bal_org_name from bas_org where {{#deleted}}deleted=:deleted and {{/deleted}} {{#is_enabled}}is_enabled=:is_enabled and {{/is_enabled}} {{#is_bal}}is_bal=:is_bal and {{/is_bal}} {{#is_org}}is_org=:is_org and {{/is_org}} {{#is_cus}}is_cus=:is_cus and {{/is_cus}} {{#is_ven}}is_ven=:is_ven and {{/is_ven}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} (code like '{{name}}%' or name like '{{name}}%') and id not in (select bal_org_id from bas_org_group_org where {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} 1=1)"
  )
  List<BasOrgDTO> selectGroupOrgByCodeOrName(
      @Param("deleted") Long deleted,
      @Param("is_enabled") Integer isEnabled,
      @Param("is_bal") Integer isBal,
      @Param("is_org") Integer isOrg,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("ent_id") Long entId,
      @Param("name") String name);

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
   */
  @SqlTemplate(
    name = "seleteGroupOrgWithRelInfo",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.mobilephone,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version from bas_org bas {{#path}} inner join bas_cat_class_rel cat on cat.path like '{{path}}%' and {{#deleted}}cat.deleted=:deleted and {{/deleted}} {{#ent_id}}cat.ent_id=:ent_id and {{/ent_id}} bas.id=cat.obj_id {{/path}} where {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_bal}}bas.is_bal=:is_bal and {{/is_bal}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} bas.id not in(select bal_org_id from bas_org_group_org where {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} 1=1)"
  )
  Page<SeleteGroupOrgWithRelInfoDTO> seleteGroupOrgWithRelInfo(
      @Param("path") String path,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_org") Integer isOrg,
      @Param("is_bal") Integer isBal,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("is_enabled") Integer isEnabled,
      @Param("pageable") Pageable pageable);

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
   * @return
   */
  @SqlTemplate(
    name = "seleteGroupOrgWithRelInfo",
    sql =
        "select bas.id,bas.address,bas.bal_org_id,bas.bal_org_name,bas.code,bas.contact_person,bas.deleted,bas.dep_code,bas.dep_id,bas.dep_name,bas.email,bas.ent_id,bas.is_bal,bas.is_cus,bas.is_dep,bas.is_enabled,bas.is_org,bas.is_org_group,bas.is_out,bas.is_ven,bas.mobilephone,bas.name,bas.register_address,bas.remark,bas.search_word,bas.telephone,bas.version from bas_org bas {{#path}} inner join bas_cat_class_rel cat on cat.path like '{{path}}%' and {{#deleted}}cat.deleted=:deleted and {{/deleted}} {{#ent_id}}cat.ent_id=:ent_id and {{/ent_id}} bas.id=cat.obj_id {{/path}} where {{#code}}bas.code like '{{code}}%' and {{/code}} {{#name}}bas.name like '{{name}}%' and {{/name}} {{#bal_org_id}}bas.bal_org_id=:bal_org_id and {{/bal_org_id}} {{#is_org}}bas.is_org=:is_org and {{/is_org}} {{#is_bal}}bas.is_bal=:is_bal and {{/is_bal}} {{#is_cus}}bas.is_cus=:is_cus and {{/is_cus}} {{#is_ven}}bas.is_ven=:is_ven and {{/is_ven}} {{#deleted}}bas.deleted=:deleted and {{/deleted}} {{#is_enabled}}bas.is_enabled=:is_enabled and {{/is_enabled}} {{#ent_id}}bas.ent_id=:ent_id and {{/ent_id}} bas.id not in(select bal_org_id from bas_org_group_org where {{#deleted}}deleted=:deleted and {{/deleted}} {{#ent_id}}ent_id=:ent_id and {{/ent_id}} 1=1)"
  )
  List<SeleteGroupOrgWithRelInfoDTO> seleteGroupOrgWithRelInfo(
      @Param("path") String path,
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("code") String code,
      @Param("name") String name,
      @Param("bal_org_id") Long balOrgId,
      @Param("is_org") Integer isOrg,
      @Param("is_bal") Integer isBal,
      @Param("is_cus") Integer isCus,
      @Param("is_ven") Integer isVen,
      @Param("is_enabled") Integer isEnabled);

  /**
   * 查询虚拟机构组子机构信息
   *
   * @param deleted
   * @param entId
   * @param orgGroupId
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "selectSubOrgGroupInfo",
    sql =
        "select org.id, bas.name, bas.code, org.show_order, bas.bal_org_name from bas_org bas inner join bas_org_group_org org on org.org_org_id = bas.id and org.org_group_id=:org_group_id {{#deleted}}and org.deleted=:deleted{{/deleted}} {{#ent_id}}and org.ent_id=:ent_id{{/ent_id}} where {{#deleted}}org.deleted=:deleted and {{/deleted}} {{#ent_id}}org.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  Page<SelectSubOrgGroupInfoDTO> selectSubOrgGroupInfo(
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("org_group_id") Long orgGroupId,
      @Param("pageable") Pageable pageable);

  /**
   * 查询虚拟机构组子机构信息
   *
   * @param deleted
   * @param entId
   * @param orgGroupId
   * @return
   */
  @SqlTemplate(
    name = "selectSubOrgGroupInfo",
    sql =
        "select org.id, bas.name, bas.code, org.show_order, bas.bal_org_name from bas_org bas inner join bas_org_group_org org on org.org_org_id = bas.id and org.org_group_id=:org_group_id {{#deleted}}and org.deleted=:deleted{{/deleted}} {{#ent_id}}and org.ent_id=:ent_id{{/ent_id}} where {{#deleted}}org.deleted=:deleted and {{/deleted}} {{#ent_id}}org.ent_id=:ent_id and {{/ent_id}} 1=1"
  )
  List<SelectSubOrgGroupInfoDTO> selectSubOrgGroupInfo(
      @Param("deleted") Long deleted,
      @Param("ent_id") Long entId,
      @Param("org_group_id") Long orgGroupId);

  /**
   * 动态执行一个无参数的sql,返回分页的结果
   *
   * @param selectProvider 通过SqlWrapper.asSelect封装sql
   * @param pageable 分页，排序参数
   * @param returnType 返回对象的class类型
   * @param <T>
   * @return 分页的查询结果列表
   */
  @SqlTemplate(name = "dynamicSelectPage", dynamic = true)
  public <T> Page<T> dynamicSelectPage(
      @Param("selectProvider") SelectStatementProvider selectProvider,
      @Param("pageable") Pageable pageable,
      @Param("returnType") Class<T> returnType);

  /**
   * 动态执行一个无参数的sql,返回单个结果
   *
   * @param selectProvider 通过SqlWrapper.asSelect封装sql
   * @param returnType 返回对象的class类型
   * @param <T>
   * @return 单个查询结果
   */
  @SqlTemplate(name = "dynamicSelectOne", dynamic = true, multiple = false)
  public <T> T dynamicSelectOne(
      @Param("selectProvider") SelectStatementProvider selectProvider,
      @Param("returnType") Class<T> returnType);

  /**
   * 动态执行一个无参数的sql update 语句
   *
   * @param updateProvider
   * @return 修改的记录条数
   */
  @SqlTemplate(name = "dynamicUpdate", dynamic = true)
  @Modifying
  public int dynamicUpdate(@Param("updateProvider") UpdateStatementProvider updateProvider);
}
