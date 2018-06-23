package com.pagoda.api.dto.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.*;
import io.swagger.annotations.*;
import org.springframework.data.domain.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasOrg")
@ApiModel(value = "BasOrgDTO", description = "往来单位主表")
@EntityFeature(
  entityName = "BasOrgDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class BasOrgDTO implements Serializable {

  @FieldMeta(
    name = "id",
    nameCN = "主键id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "id", value = "主键id", dataType = "long", notes = "")
  private Long id;

  @FieldMeta(
    name = "deleted",
    nameCN = "软删除标记",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "deleted", value = "软删除标记", dataType = "long", notes = "")
  private Long deleted;

  @FieldMeta(
    name = "createdAt",
    nameCN = "创建时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "createdAt", value = "创建时间", dataType = "datetime", notes = "")
  private Date createdAt;

  @FieldMeta(
    name = "creatorCode",
    nameCN = "创建人code",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorCode", value = "创建人code", dataType = "string", notes = "")
  private String creatorCode;

  @FieldMeta(
    name = "creatorName",
    nameCN = "创建人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorName", value = "创建人名称", dataType = "string", notes = "")
  private String creatorName;

  @FieldMeta(
    name = "creatorOrgCode",
    nameCN = "创建人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorOrgCode", value = "创建人所属部门", dataType = "string", notes = "")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最近修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "lastModifiedAt", value = "", dataType = "datetime", notes = "")
  private Date lastModifiedAt;

  @FieldMeta(
    name = "modifierCode",
    nameCN = "最近修改人code",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierCode", value = "最近修改人code", dataType = "string", notes = "")
  private String modifierCode;

  @FieldMeta(
    name = "modifierName",
    nameCN = "最近修改人name",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierName", value = "最近修改人name", dataType = "string", notes = "")
  private String modifierName;

  @FieldMeta(
    name = "modifierOrgCode",
    nameCN = "修改人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierOrgCode", value = "修改人所属部门", dataType = "string", notes = "")
  private String modifierOrgCode;

  @FieldMeta(
    name = "version",
    nameCN = "版本号",
    type = "integer",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "version", value = "版本号", dataType = "", notes = "")
  private Integer version;

  @FieldMeta(
    name = "balOrgName",
    scene = "",
    nameCN = "往来单位结算名称",
    comment = "往来单位结算名称",
    nameEN = "bal_org_name",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "balOrgName",
    value = "往来单位结算名称",
    dataType = "字符串",
    notes = "5b2df3247c51e0fcf5b8342f"
  )
  private String balOrgName;

  @FieldMeta(
    name = "contactPerson",
    scene = "",
    nameCN = "联系人",
    comment = "联系人",
    nameEN = "contact_person",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "contactPerson",
    value = "联系人",
    dataType = "字符串",
    notes = "5b2df3247c51e0fcf5b83431"
  )
  private String contactPerson;

  @FieldMeta(
    name = "depCode",
    scene = "",
    nameCN = "对应部门代码",
    comment = "对应部门代码",
    nameEN = "dep_code",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "depCode",
    value = "对应部门代码",
    dataType = "字符串",
    notes = "5b2df3247c51e0fcf5b83433"
  )
  private String depCode;

  @FieldMeta(
    name = "depId",
    scene = "",
    nameCN = "对应部门Id",
    comment = "对应部门Id",
    nameEN = "dep_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "depId",
    value = "对应部门Id",
    dataType = "长整型",
    notes = "5b2df3247c51e0fcf5b83435"
  )
  private Long depId;

  @FieldMeta(
    name = "depName",
    scene = "",
    nameCN = "对应部门名称",
    comment = "对应部门名称",
    nameEN = "dep_name",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "depName",
    value = "对应部门名称",
    dataType = "字符串",
    notes = "5b2df3247c51e0fcf5b83437"
  )
  private String depName;

  @FieldMeta(
    name = "email",
    scene = "",
    nameCN = "邮箱",
    comment = "邮箱",
    nameEN = "email",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "email",
    value = "邮箱",
    dataType = "字符串",
    notes = "5b2df3247c51e0fcf5b8343a"
  )
  private String email;

  @FieldMeta(
    name = "isBal",
    scene = "",
    nameCN = "是否结算单位标识",
    comment = "是否结算单位标识",
    nameEN = "is_bal",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isBal",
    value = "是否结算单位标识",
    dataType = "整型",
    notes = "5b2df3247c51e0fcf5b8343c"
  )
  private Integer isBal;

  @FieldMeta(
    name = "isCus",
    scene = "",
    nameCN = "是否客户标识",
    comment = "是否客户标识",
    nameEN = "is_cus",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isCus",
    value = "是否客户标识",
    dataType = "整型",
    notes = "5b2df3247c51e0fcf5b83442"
  )
  private Integer isCus;

  @FieldMeta(
    name = "isDep",
    scene = "",
    nameCN = "是否部门标识",
    comment = "是否部门标识",
    nameEN = "is_dep",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isDep",
    value = "是否部门标识",
    dataType = "整型",
    notes = "5b2df3247c51e0fcf5b8343e"
  )
  private Integer isDep;

  @FieldMeta(
    name = "isOrg",
    scene = "",
    nameCN = "是否机构标识",
    comment = "是否机构标识",
    nameEN = "is_org",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isOrg",
    value = "是否机构标识",
    dataType = "整型",
    notes = "5b2df3247c51e0fcf5b8344a"
  )
  private Integer isOrg;

  @FieldMeta(
    name = "isOrgGroup",
    scene = "",
    nameCN = "是否虚拟机构组",
    comment = "是否虚拟机构组",
    nameEN = "is_org_group",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isOrgGroup",
    value = "是否虚拟机构组",
    dataType = "整型",
    notes = "5b2df3247c51e0fcf5b83445"
  )
  private Integer isOrgGroup;

  @FieldMeta(
    name = "isOut",
    scene = "",
    nameCN = "是否门店标识",
    comment = "是否门店标识",
    nameEN = "is_out",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isOut",
    value = "是否门店标识",
    dataType = "整型",
    notes = "5b2df3247c51e0fcf5b83448"
  )
  private Integer isOut;

  @FieldMeta(
    name = "isVen",
    scene = "",
    nameCN = "是否供应商标识",
    comment = "是否供应商标识",
    nameEN = "is_ven",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isVen",
    value = "是否供应商标识",
    dataType = "整型",
    notes = "5b2df3247c51e0fcf5b8344e"
  )
  private Integer isVen;

  @FieldMeta(
    name = "mobilePhone",
    scene = "",
    nameCN = "移动电话",
    comment = "移动电话",
    nameEN = "mobile_phone",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "mobilePhone",
    value = "移动电话",
    dataType = "字符串",
    notes = "5b2df3247c51e0fcf5b8344c"
  )
  private String mobilePhone;

  @FieldMeta(
    name = "registerAddress",
    scene = "",
    nameCN = "注册地址",
    comment = "注册地址",
    nameEN = "register_address",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "registerAddress",
    value = "注册地址",
    dataType = "字符串",
    notes = "5b2df3247c51e0fcf5b83440"
  )
  private String registerAddress;

  @FieldMeta(
    name = "telephone",
    scene = "",
    nameCN = "固定电话",
    comment = "固定电话",
    nameEN = "telephone",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "telephone",
    value = "固定电话",
    dataType = "字符串",
    notes = "5b2df3247c51e0fcf5b83451"
  )
  private String telephone;

  @FieldMeta(
    name = "code",
    scene = "fff",
    nameCN = "代码",
    comment = "代码",
    nameEN = "code",
    type = "字符串",
    format = "ll",
    displayLen = 23,
    formSize = "",
    constraint = "ll",
    constraintParams = "{\"prefix\":\"fx_er\"}",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "code",
    value = "代码",
    dataType = "字符串",
    notes = "5b2defe27c51e0fcf5b5d268"
  )
  private String code;

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
