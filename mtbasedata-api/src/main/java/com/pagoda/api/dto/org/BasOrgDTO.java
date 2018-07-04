package com.pagoda.api.dto.org;

import com.pagoda.api.dto.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.lang.reflect.*;
import java.io.Serializable;
import java.util.function.*;
import java.util.*;
import io.swagger.annotations.*;
import org.springframework.data.domain.*;
import org.springframework.validation.*;

import static com.pagoda.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.api.dto.org.BasOrgDTO.Getters.*;

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
@ApiModel(value = "BasOrgDTO", description = "往来单位-01 主表定义")
@EntityFeature(
  entityName = "BasOrgDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = true,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "/dubboApi/BasOrgService/selectBasOrgForList",
  tableMultiSelect = true
)
public class BasOrgDTO extends AbstractDTO implements Serializable {

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
    nameCN = "录入时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "createdAt", value = "录入时间", dataType = "datetime", notes = "")
  private Date createdAt;

  @FieldMeta(
    name = "creatorCode",
    nameCN = "录入人代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorCode", value = "录入人代码", dataType = "string", notes = "")
  private String creatorCode;

  @FieldMeta(
    name = "creatorName",
    nameCN = "录入人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorName", value = "录入人名称", dataType = "string", notes = "")
  private String creatorName;

  @FieldMeta(
    name = "creatorOrgCode",
    nameCN = "录入人机构代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorOrgCode", value = "录入人机构代码", dataType = "string", notes = "")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最后修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "lastModifiedAt", value = "最后修改时间", dataType = "datetime", notes = "")
  private Date lastModifiedAt;

  @FieldMeta(
    name = "modifierCode",
    nameCN = "最后修改人代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierCode", value = "最后修改人代码", dataType = "string", notes = "")
  private String modifierCode;

  @FieldMeta(
    name = "modifierName",
    nameCN = "最后修改人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierName", value = "最后修改人名称", dataType = "string", notes = "")
  private String modifierName;

  @FieldMeta(
    name = "modifierOrgCode",
    nameCN = "最后修改人机构代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierOrgCode", value = "最后修改人机构代码", dataType = "string", notes = "")
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
    name = "isCus",
    scene = "",
    nameCN = "是否客户标识{1:是,0:否}",
    comment = "是否客户标识{1:是,0:否}",
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
    value = "是否客户标识{1:是,0:否}",
    dataType = "",
    notes = "5b35d8689d2feff19b4169a7"
  )
  private Integer isCus;

  @FieldMeta(
    name = "isOrg",
    scene = "",
    nameCN = "是否机构标识{1:是,0:否}",
    comment = "是否机构标识{1:是,0:否}",
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
    value = "是否机构标识{1:是,0:否}",
    dataType = "",
    notes = "5b35d8689d2feff19b4169a9"
  )
  private Integer isOrg;

  @FieldMeta(
    name = "isVen",
    scene = "",
    nameCN = "是否供应商标识{1:是,0:否}",
    comment = "是否供应商标识{1:是,0:否}",
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
    value = "是否供应商标识{1:是,0:否}",
    dataType = "",
    notes = "5b35d8689d2feff19b4169a5"
  )
  private Integer isVen;

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
    dataType = "",
    notes = "5b35d8689d2feff19b4169a4"
  )
  private Integer isOut;

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
    dataType = "",
    notes = "5b35d8689d2feff19b4169ae"
  )
  private Integer isDep;

  @FieldMeta(
    name = "depCode",
    scene = "",
    nameCN = "对应部门代码[冗余]",
    comment = "对应部门代码[冗余]",
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
    value = "对应部门代码[冗余]",
    dataType = "",
    notes = "5b35d8689d2feff19b4169b0"
  )
  private String depCode;

  @FieldMeta(
    name = "depId",
    scene = "",
    nameCN = "部门ID ",
    comment = "部门ID ",
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
    value = "部门ID ",
    dataType = "",
    notes = "5b35d8689d2feff19b4169b4"
  )
  private Long depId;

  @FieldMeta(
    name = "depName",
    scene = "",
    nameCN = "对应部门名称[冗余]",
    comment = "对应部门名称[冗余]",
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
    value = "对应部门名称[冗余]",
    dataType = "",
    notes = "5b35d8689d2feff19b4169b2"
  )
  private String depName;

  @FieldMeta(
    name = "isBal",
    scene = "",
    nameCN = "是否结算往来单位标识",
    comment = "是否结算往来单位标识",
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
    value = "是否结算往来单位标识",
    dataType = "",
    notes = "5b35d8689d2feff19b4169b6"
  )
  private Integer isBal;

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
    dataType = "",
    notes = "5b35d8689d2feff19b4169b8"
  )
  private Integer isOrgGroup;

  @FieldMeta(
    name = "balOrgId",
    scene = "",
    nameCN = "结算发货机构ID",
    comment = "结算发货机构ID",
    nameEN = "bal_org_id",
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
    name = "balOrgId",
    value = "结算发货机构ID",
    dataType = "",
    notes = "5b35d8689d2feff19b4169bc"
  )
  private Long balOrgId;

  @FieldMeta(
    name = "balOrgName",
    scene = "",
    nameCN = "结算发货机构名称[冗余]",
    comment = "结算发货机构名称[冗余]",
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
    value = "结算发货机构名称[冗余]",
    dataType = "",
    notes = "5b35d8689d2feff19b4169ba"
  )
  private String balOrgName;

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
    dataType = "",
    notes = "5b35d8689d2feff19b4169be"
  )
  private String registerAddress;

  @FieldMeta(
    name = "address",
    scene = "",
    nameCN = "公司地址",
    comment = "公司地址",
    nameEN = "address",
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
    name = "address",
    value = "公司地址",
    dataType = "",
    notes = "5b35d8689d2feff19b4169c0"
  )
  private String address;

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
    dataType = "",
    notes = "5b35d8689d2feff19b4169c6"
  )
  private String contactPerson;

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
    dataType = "",
    notes = "5b35d8689d2feff19b4169c2"
  )
  private String telephone;

  @FieldMeta(
    name = "mobilephone",
    scene = "",
    nameCN = "移动电话",
    comment = "移动电话",
    nameEN = "mobilephone",
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
    name = "mobilephone",
    value = "移动电话",
    dataType = "",
    notes = "5b35d8689d2feff19b4169cb"
  )
  private String mobilephone;

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
  @ApiModelProperty(name = "email", value = "邮箱", dataType = "", notes = "5b35d8689d2feff19b4169c8")
  private String email;

  @FieldMeta(
    name = "code",
    scene = "",
    nameCN = "行政单位代码",
    comment = "行政单位代码",
    nameEN = "code",
    type = "字符串",
    format = "",
    displayLen = 32,
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
    name = "code",
    value = "行政单位代码",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3cf"
  )
  private String code;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "行政单位名",
    comment = "行政单位名",
    nameEN = "name",
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
    name = "name",
    value = "行政单位名",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d3"
  )
  private String name;

  @FieldMeta(
    name = "entId",
    scene = "",
    nameCN = "企业ID",
    comment = "企业ID",
    nameEN = "ent_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
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
    name = "entId",
    value = "企业ID",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c205"
  )
  private Long entId;

  @FieldMeta(
    name = "isEnabled",
    scene = "",
    nameCN = "是否可用",
    comment = "是否可用",
    nameEN = "is_enabled",
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
    name = "isEnabled",
    value = "是否可用",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d1"
  )
  private Integer isEnabled;

  @FieldMeta(
    name = "remark",
    scene = "",
    nameCN = "备注",
    comment = "备注",
    nameEN = "remark",
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
    name = "remark",
    value = "备注",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c231"
  )
  private String remark;

  @FieldMeta(
    name = "searchWord",
    scene = "",
    nameCN = "搜索关键词(存储name字段首字母)",
    comment = "搜索关键词(存储name字段首字母)",
    nameEN = "search_word",
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
    name = "searchWord",
    value = "搜索关键词(存储name字段首字母)",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d5"
  )
  private String searchWord;

  @FieldMeta(
    name = "showOrder",
    scene = "",
    nameCN = "排序",
    comment = "排序",
    nameEN = "show_order",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = true,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "showOrder",
    value = "排序",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d9"
  )
  private Integer showOrder;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasOrgDTO, Long> _id = o -> o.getId();
    public static final Function<BasOrgDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasOrgDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasOrgDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<BasOrgDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<BasOrgDTO, String> _creatorOrgCode = o -> o.getCreatorOrgCode();
    public static final Function<BasOrgDTO, Date> _lastModifiedAt = o -> o.getLastModifiedAt();
    public static final Function<BasOrgDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<BasOrgDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<BasOrgDTO, String> _modifierOrgCode = o -> o.getModifierOrgCode();

    public static final Function<BasOrgDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasOrgDTO, Integer> _isCus = o -> o.getIsCus();
    public static final Function<BasOrgDTO, Integer> _isOrg = o -> o.getIsOrg();
    public static final Function<BasOrgDTO, Integer> _isVen = o -> o.getIsVen();
    public static final Function<BasOrgDTO, Integer> _isOut = o -> o.getIsOut();
    public static final Function<BasOrgDTO, Integer> _isDep = o -> o.getIsDep();
    public static final Function<BasOrgDTO, String> _depCode = o -> o.getDepCode();
    public static final Function<BasOrgDTO, Long> _depId = o -> o.getDepId();
    public static final Function<BasOrgDTO, String> _depName = o -> o.getDepName();
    public static final Function<BasOrgDTO, Integer> _isBal = o -> o.getIsBal();
    public static final Function<BasOrgDTO, Integer> _isOrgGroup = o -> o.getIsOrgGroup();
    public static final Function<BasOrgDTO, Long> _balOrgId = o -> o.getBalOrgId();
    public static final Function<BasOrgDTO, String> _balOrgName = o -> o.getBalOrgName();
    public static final Function<BasOrgDTO, String> _registerAddress = o -> o.getRegisterAddress();
    public static final Function<BasOrgDTO, String> _address = o -> o.getAddress();
    public static final Function<BasOrgDTO, String> _contactPerson = o -> o.getContactPerson();
    public static final Function<BasOrgDTO, String> _telephone = o -> o.getTelephone();
    public static final Function<BasOrgDTO, String> _mobilephone = o -> o.getMobilephone();
    public static final Function<BasOrgDTO, String> _email = o -> o.getEmail();
    public static final Function<BasOrgDTO, String> _code = o -> o.getCode();
    public static final Function<BasOrgDTO, String> _name = o -> o.getName();
    public static final Function<BasOrgDTO, Long> _entId = o -> o.getEntId();
    public static final Function<BasOrgDTO, Integer> _isEnabled = o -> o.getIsEnabled();
    public static final Function<BasOrgDTO, String> _remark = o -> o.getRemark();
    public static final Function<BasOrgDTO, String> _searchWord = o -> o.getSearchWord();
    public static final Function<BasOrgDTO, Integer> _showOrder = o -> o.getShowOrder();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    builder.field(_showOrder, notNull, "排序为空");
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
