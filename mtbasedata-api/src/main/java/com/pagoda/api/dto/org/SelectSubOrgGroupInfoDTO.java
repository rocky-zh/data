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
@ApiModel(value = "SelectSubOrgGroupInfoDTO", description = "查询虚拟机构组子机构信息")
@EntityFeature(
  entityName = "SelectSubOrgGroupInfoDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class SelectSubOrgGroupInfoDTO implements Serializable {
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
    nameCN = "产成商品名",
    comment = "产成商品名",
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
    value = "产成商品名",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d3"
  )
  private String name;

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
    required = false,
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

  @FieldMeta(
    name = "balOrgName",
    scene = "",
    nameCN = "结算机构名称[冗余]",
    comment = "结算机构名称[冗余]",
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
    value = "结算机构名称[冗余]",
    dataType = "",
    notes = "5b35d8689d2feff19b4169ba"
  )
  private String balOrgName;
}
