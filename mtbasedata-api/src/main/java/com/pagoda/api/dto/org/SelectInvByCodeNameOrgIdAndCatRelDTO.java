package com.pagoda.api.dto.org;

import com.pagoda.api.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import io.swagger.annotations.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "SelectInvByCodeNameOrgIdAndCatRelDTO", description = "查询库房信息，根据目录选择框查询")
@EntityFeature(
  entityName = "SelectInvByCodeNameOrgIdAndCatRelDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class SelectInvByCodeNameOrgIdAndCatRelDTO implements Serializable {
  @FieldMeta(
    name = "creatorCode",
    scene = "",
    nameCN = "录入人代码",
    comment = "录入人代码",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "creatorCode", value = "录入人代码", dataType = "", notes = "")
  private String creatorCode;

  @FieldMeta(
    name = "creatorOrgCode",
    scene = "",
    nameCN = "录入人机构代码",
    comment = "录入人机构代码",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "creatorOrgCode", value = "录入人机构代码", dataType = "", notes = "")
  private String creatorOrgCode;

  @FieldMeta(
    name = "modifierName",
    scene = "",
    nameCN = "最后修改人名称",
    comment = "最后修改人名称",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "modifierName", value = "最后修改人名称", dataType = "", notes = "")
  private String modifierName;

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
    name = "catClassId",
    scene = "",
    nameCN = "目录分类ID",
    comment = "目录分类ID",
    nameEN = "cat_class_id",
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
    name = "catClassId",
    value = "目录分类ID",
    dataType = "",
    notes = "5b35f8bb9d2feff19b54349d"
  )
  private Long catClassId;

  @FieldMeta(
    name = "createdAt",
    scene = "",
    nameCN = "录入时间",
    comment = "录入时间",
    nameEN = "",
    type = "时间",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "createdAt", value = "录入时间", dataType = "", notes = "")
  private java.util.Date createdAt;

  @FieldMeta(
    name = "modifierOrgCode",
    scene = "",
    nameCN = "最后修改人机构代码",
    comment = "最后修改人机构代码",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "modifierOrgCode", value = "最后修改人机构代码", dataType = "", notes = "")
  private String modifierOrgCode;

  @FieldMeta(
    name = "catClassName",
    scene = "",
    nameCN = "目录分类名称",
    comment = "目录分类名称",
    nameEN = "cat_class_name",
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
    name = "catClassName",
    value = "目录分类名称",
    dataType = "",
    notes = "5b35f8bb9d2feff19b54349e"
  )
  private String catClassName;

  @FieldMeta(
    name = "version",
    scene = "",
    nameCN = "版本号",
    comment = "版本号",
    nameEN = "version",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = false,
    canQuery = false,
    readOnly = true,
    required = false,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(
    name = "version",
    value = "版本号",
    dataType = "",
    notes = "5b36e6869d2feff19b2b44ec"
  )
  private Integer version;

  @FieldMeta(
    name = "lastModifiedAt",
    scene = "",
    nameCN = "最后修改时间",
    comment = "最后修改时间",
    nameEN = "",
    type = "时间",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "lastModifiedAt", value = "最后修改时间", dataType = "", notes = "")
  private java.util.Date lastModifiedAt;

  @FieldMeta(
    name = "catClassCode",
    scene = "",
    nameCN = "目录分类代码",
    comment = "目录分类代码",
    nameEN = "cat_class_code",
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
    name = "catClassCode",
    value = "目录分类代码",
    dataType = "",
    notes = "5b35f8bb9d2feff19b543498"
  )
  private String catClassCode;

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
    name = "orgId",
    scene = "",
    nameCN = "往来单位ID[orgid]",
    comment = "往来单位ID[orgid]",
    nameEN = "org_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = false,
    canQuery = false,
    readOnly = false,
    required = false,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(
    name = "orgId",
    value = "往来单位ID[orgid]",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b8e"
  )
  private Long orgId;

  @FieldMeta(
    name = "adLat",
    scene = "",
    nameCN = "高德地址纬度",
    comment = "高德地址纬度",
    nameEN = "ad_lat",
    type = "小数",
    format = "",
    displayLen = 10,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = false,
    canQuery = false,
    readOnly = false,
    required = false,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(
    name = "adLat",
    value = "高德地址纬度",
    dataType = "",
    notes = "5b36e5139d2feff19b29ccca"
  )
  private java.math.BigDecimal adLat;

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
    name = "modifierCode",
    scene = "",
    nameCN = "最后修改人代码",
    comment = "最后修改人代码",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "modifierCode", value = "最后修改人代码", dataType = "", notes = "")
  private String modifierCode;

  @FieldMeta(
    name = "creatorName",
    scene = "",
    nameCN = "录入人名称",
    comment = "录入人名称",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "creatorName", value = "录入人名称", dataType = "", notes = "")
  private String creatorName;

  @FieldMeta(
    name = "id",
    scene = "",
    nameCN = "主键id",
    comment = "主键id",
    nameEN = "",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "id", value = "主键id", dataType = "", notes = "")
  private Long id;

  @FieldMeta(
    name = "adLng",
    scene = "",
    nameCN = "高德地址经度",
    comment = "高德地址经度",
    nameEN = "ad_lng",
    type = "小数",
    format = "",
    displayLen = 10,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = false,
    canQuery = false,
    readOnly = false,
    required = false,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(
    name = "adLng",
    value = "高德地址经度",
    dataType = "",
    notes = "5b36e5139d2feff19b29cccc"
  )
  private java.math.BigDecimal adLng;
}
