package com.pagoda.api.dto.goods;

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
@ApiModel(value = "GetBasGoodsProcessHeadDetailsDTO", description = "获取生产工艺明细列表")
@EntityFeature(
  entityName = "GetBasGoodsProcessHeadDetailsDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class GetBasGoodsProcessHeadDetailsDTO implements Serializable {
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
    name = "orgOrgCode",
    scene = "",
    nameCN = "机构代码[冗余]",
    comment = "机构代码[冗余]",
    nameEN = "org_org_code",
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
    name = "orgOrgCode",
    value = "机构代码[冗余]",
    dataType = "",
    notes = "5b35de739d2feff19b42fe61"
  )
  private String orgOrgCode;

  @FieldMeta(
    name = "orgOrgId",
    scene = "",
    nameCN = "机构ID ",
    comment = "机构ID ",
    nameEN = "org_org_id",
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
    index = 0
  )
  @ApiModelProperty(
    name = "orgOrgId",
    value = "机构ID ",
    dataType = "",
    notes = "5b35de739d2feff19b42fe5f"
  )
  private Long orgOrgId;

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
    name = "orgOrgName",
    scene = "",
    nameCN = "机构名称[冗余]",
    comment = "机构名称[冗余]",
    nameEN = "org_org_name",
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
    index = 0
  )
  @ApiModelProperty(
    name = "orgOrgName",
    value = "机构名称[冗余]",
    dataType = "",
    notes = "5b35de739d2feff19b42fe5e"
  )
  private String orgOrgName;

  @FieldMeta(
    name = "isDefault",
    scene = "",
    nameCN = "是否主商品",
    comment = "是否主商品",
    nameEN = "is_default",
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
    name = "isDefault",
    value = "是否主商品",
    dataType = "",
    notes = "5b35de739d2feff19b42fe65"
  )
  private Integer isDefault;

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
    name = "isEnabled",
    scene = "",
    nameCN = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
    comment = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
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
    value = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d1"
  )
  private Integer isEnabled;

  @FieldMeta(
    name = "feeName",
    scene = "",
    nameCN = "费用名称(工序名称)",
    comment = "费用名称(工序名称)",
    nameEN = "fee_name",
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
    name = "feeName",
    value = "费用名称(工序名称)",
    dataType = "",
    notes = "5b35dfa69d2feff19b436fec"
  )
  private String feeName;

  @FieldMeta(
    name = "feeCode",
    scene = "",
    nameCN = "工序代码(费用代码)",
    comment = "工序代码(费用代码)",
    nameEN = "fee_code",
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
    name = "feeCode",
    value = "工序代码(费用代码)",
    dataType = "",
    notes = "5b35dfa69d2feff19b436fe6"
  )
  private String feeCode;

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
    name = "rankNum",
    scene = "",
    nameCN = "排序号",
    comment = "排序号",
    nameEN = "rank_num",
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
    name = "rankNum",
    value = "排序号",
    dataType = "",
    notes = "5b35de739d2feff19b42fe67"
  )
  private Integer rankNum;

  @FieldMeta(
    name = "feeAmt",
    scene = "",
    nameCN = "工序费用金额",
    comment = "工序费用金额",
    nameEN = "fee_amt",
    type = "小数",
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
    name = "feeAmt",
    value = "工序费用金额",
    dataType = "",
    notes = "5b35dfa69d2feff19b436fef"
  )
  private java.math.BigDecimal feeAmt;
}
