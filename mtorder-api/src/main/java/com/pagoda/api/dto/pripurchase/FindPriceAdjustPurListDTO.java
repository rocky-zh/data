package com.pagoda.api.dto.pripurchase;

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
@ApiModel(value = "FindPriceAdjustPurListDTO", description = "查询调价单")
@EntityFeature(
  entityName = "FindPriceAdjustPurListDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class FindPriceAdjustPurListDTO implements Serializable {
  @FieldMeta(
    name = "effectDate",
    scene = "price",
    nameCN = "生效日期",
    comment = "生效日期",
    nameEN = "effect_date",
    type = "日期",
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
    name = "effectDate",
    value = "生效日期",
    dataType = "",
    notes = "5b36e5bb9d2feff19b2a77fa"
  )
  private java.util.Date effectDate;

  @FieldMeta(
    name = "note",
    scene = "price",
    nameCN = "提示信息",
    comment = "提示信息",
    nameEN = "note",
    type = "字符串",
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
    name = "note",
    value = "提示信息",
    dataType = "",
    notes = "5b36e6c79d2feff19b2b865c"
  )
  private String note;

  @FieldMeta(
    name = "modifierName",
    scene = "",
    nameCN = "最近修改人name",
    comment = "最近修改人name",
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
  @ApiModelProperty(name = "modifierName", value = "最近修改人name", dataType = "", notes = "")
  private String modifierName;

  @FieldMeta(
    name = "seqno",
    scene = "price",
    nameCN = "调价单号",
    comment = "调价单号",
    nameEN = "seqno",
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
    name = "seqno",
    value = "调价单号",
    dataType = "",
    notes = "5b36e3bf9d2feff19b287d2f"
  )
  private String seqno;

  @FieldMeta(
    name = "createdAt",
    scene = "",
    nameCN = "创建时间",
    comment = "创建时间",
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
  @ApiModelProperty(name = "createdAt", value = "创建时间", dataType = "", notes = "")
  private java.sql.Timestamp createdAt;

  @FieldMeta(
    name = "creatorName",
    scene = "",
    nameCN = "创建人名称",
    comment = "创建人名称",
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
  @ApiModelProperty(name = "creatorName", value = "创建人名称", dataType = "", notes = "")
  private String creatorName;

  @FieldMeta(
    name = "remark",
    scene = "price",
    nameCN = "备注",
    comment = "备注",
    nameEN = "remark",
    type = "字符串",
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
    name = "remark",
    value = "备注",
    dataType = "",
    notes = "5b36e6a39d2feff19b2b62b5"
  )
  private String remark;

  @FieldMeta(
    name = "venOrgName",
    scene = "price",
    nameCN = "供应商名称",
    comment = "供应商名称",
    nameEN = "ven_org_name",
    type = "字符串",
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
    name = "venOrgName",
    value = "供应商名称",
    dataType = "",
    notes = "5b36e5409d2feff19b29fb44"
  )
  private String venOrgName;

  @FieldMeta(
    name = "venOrgCode",
    scene = "price",
    nameCN = "供应商代码",
    comment = "供应商代码",
    nameEN = "ven_org_code",
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
    name = "venOrgCode",
    value = "供应商代码",
    dataType = "",
    notes = "5b36e5099d2feff19b29c39c"
  )
  private String venOrgCode;

  @FieldMeta(
    name = "arrOrgName",
    scene = "price",
    nameCN = "到货机构",
    comment = "到货机构",
    nameEN = "arr_org_name",
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
    name = "arrOrgName",
    value = "到货机构",
    dataType = "",
    notes = "5b36e4b89d2feff19b297368"
  )
  private String arrOrgName;

  @FieldMeta(
    name = "status",
    scene = "price",
    nameCN = "状态",
    comment = "状态",
    nameEN = "status",
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
    name = "status",
    value = "状态",
    dataType = "",
    notes = "5b36e56a9d2feff19b2a262e"
  )
  private Integer status;

  @FieldMeta(
    name = "lastModifiedAt",
    scene = "",
    nameCN = "最近修改时间",
    comment = "最近修改时间",
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
  @ApiModelProperty(name = "lastModifiedAt", value = "最近修改时间", dataType = "", notes = "")
  private java.sql.Timestamp lastModifiedAt;
}
