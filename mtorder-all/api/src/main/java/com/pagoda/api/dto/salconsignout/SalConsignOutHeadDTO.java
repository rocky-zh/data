package com.pagoda.api.dto.salconsignout;

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
import static com.pagoda.api.dto.salconsignout.SalConsignOutHeadDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalConsignOutHead")
@ApiModel(value = "SalConsignOutHeadDTO", description = "发货出库单头表")
@EntityFeature(
  entityName = "SalConsignOutHeadDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "/SalConsignOutHeadService/findSalConsignOutHeadList",
  tableMultiSelect = true
)
public class SalConsignOutHeadDTO extends AbstractDTO implements Serializable {

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
    name = "entId",
    scene = "price",
    nameCN = "企业id",
    comment = "企业id",
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
    value = "企业id",
    dataType = "",
    notes = "5b36e41b9d2feff19b28d81c"
  )
  private Long entId;

  @FieldMeta(
    name = "conId",
    scene = "",
    nameCN = "发货单ID[conId]",
    comment = "发货单ID[conId]",
    nameEN = "con_id",
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
    name = "conId",
    value = "发货单ID[conId]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c209"
  )
  private Long conId;

  @FieldMeta(
    name = "conSeqno",
    scene = "",
    nameCN = "发货单号",
    comment = "发货单号",
    nameEN = "con_seqno",
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
    name = "conSeqno",
    value = "发货单号",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c20b"
  )
  private String conSeqno;

  @FieldMeta(
    name = "preArrivalDate",
    scene = "",
    nameCN = "要求到货日期",
    comment = "要求到货日期",
    nameEN = "pre_arrival_date",
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
    name = "preArrivalDate",
    value = "要求到货日期",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c20f"
  )
  private java.util.Date preArrivalDate;

  @FieldMeta(
    name = "conOrgId",
    scene = "",
    nameCN = "发货机构ID",
    comment = "发货机构ID",
    nameEN = "con_org_id",
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
    name = "conOrgId",
    value = "发货机构ID",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c20d"
  )
  private Long conOrgId;

  @FieldMeta(
    name = "conOrgCode",
    scene = "",
    nameCN = "发货机构代码[冗余]",
    comment = "发货机构代码[冗余]",
    nameEN = "con_org_code",
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
    name = "conOrgCode",
    value = "发货机构代码[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c211"
  )
  private String conOrgCode;

  @FieldMeta(
    name = "conOrgName",
    scene = "",
    nameCN = "发货机构名称[冗余]",
    comment = "发货机构名称[冗余]",
    nameEN = "con_org_name",
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
    name = "conOrgName",
    value = "发货机构名称[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c213"
  )
  private String conOrgName;

  @FieldMeta(
    name = "cusOrgId",
    scene = "",
    nameCN = "客户ID",
    comment = "客户ID",
    nameEN = "cus_org_id",
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
    name = "cusOrgId",
    value = "客户ID",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c215"
  )
  private Long cusOrgId;

  @FieldMeta(
    name = "cusOrgCode",
    scene = "",
    nameCN = "客户代码[冗余]",
    comment = "客户代码[冗余]",
    nameEN = "cus_org_code",
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
    name = "cusOrgCode",
    value = "客户代码[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c217"
  )
  private String cusOrgCode;

  @FieldMeta(
    name = "cusOrgName",
    scene = "",
    nameCN = "客户名称[冗余]",
    comment = "客户名称[冗余]",
    nameEN = "cus_org_name",
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
    name = "cusOrgName",
    value = "客户名称[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c219"
  )
  private String cusOrgName;

  @FieldMeta(
    name = "transitLineNo",
    scene = "",
    nameCN = "线路号",
    comment = "线路号",
    nameEN = "transit_line_no",
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
    name = "transitLineNo",
    value = "线路号",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c21b"
  )
  private String transitLineNo;

  @FieldMeta(
    name = "shippedQty",
    scene = "",
    nameCN = "已发货数量",
    comment = "已发货数量",
    nameEN = "shipped_qty",
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
    name = "shippedQty",
    value = "已发货数量",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c21d"
  )
  private java.math.BigDecimal shippedQty;

  @FieldMeta(
    name = "shippedGrossWeight",
    scene = "",
    nameCN = "已发毛重",
    comment = "已发毛重",
    nameEN = "shipped_gross_weight",
    type = "小数",
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
    name = "shippedGrossWeight",
    value = "已发毛重",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c221"
  )
  private java.math.BigDecimal shippedGrossWeight;

  @FieldMeta(
    name = "shippedNetWeight",
    scene = "",
    nameCN = "已发净重",
    comment = "已发净重",
    nameEN = "shipped_net_weight",
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
    name = "shippedNetWeight",
    value = "已发净重",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c21f"
  )
  private java.math.BigDecimal shippedNetWeight;

  @FieldMeta(
    name = "shippedVolume",
    scene = "",
    nameCN = "已发体积",
    comment = "已发体积",
    nameEN = "shipped_volume",
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
    name = "shippedVolume",
    value = "已发体积",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c223"
  )
  private java.math.BigDecimal shippedVolume;

  @FieldMeta(
    name = "shippedAmt",
    scene = "",
    nameCN = "已发货总金额",
    comment = "已发货总金额",
    nameEN = "shipped_amt",
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
    name = "shippedAmt",
    value = "已发货总金额",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c227"
  )
  private java.math.BigDecimal shippedAmt;

  @FieldMeta(
    name = "taxAmt",
    scene = "",
    nameCN = "税金[=round(totalAmt*taxrate/(taxrate+1),2)]",
    comment = "税金[=round(totalAmt*taxrate/(taxrate+1),2)]",
    nameEN = "tax_amt",
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
    name = "taxAmt",
    value = "税金[=round(totalAmt*taxrate/(taxrate+1),2)]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c225"
  )
  private java.math.BigDecimal taxAmt;

  @FieldMeta(
    name = "stockoutStatus",
    scene = "",
    nameCN = "出库状态[10:待出库 20:已出库 30:出库失败,40:已到货]",
    comment = "出库状态[10:待出库 20:已出库 30:出库失败,40:已到货]",
    nameEN = "stockout_status",
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
    name = "stockoutStatus",
    value = "出库状态[10:待出库 20:已出库 30:出库失败,40:已到货]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c229"
  )
  private Integer stockoutStatus;

  @FieldMeta(
    name = "auditorCode",
    scene = "price",
    nameCN = "审核人代码",
    comment = "审核人代码",
    nameEN = "auditor_code",
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
    name = "auditorCode",
    value = "审核人代码",
    dataType = "",
    notes = "5b36e6009d2feff19b2abd25"
  )
  private String auditorCode;

  @FieldMeta(
    name = "auditorName",
    scene = "price",
    nameCN = "审核人姓名",
    comment = "审核人姓名",
    nameEN = "auditor_name",
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
    name = "auditorName",
    value = "审核人姓名",
    dataType = "",
    notes = "5b36e62d9d2feff19b2aea97"
  )
  private String auditorName;

  @FieldMeta(
    name = "auditTime",
    scene = "purt",
    nameCN = "审核时间",
    comment = "审核时间",
    nameEN = "audit_time",
    type = "时间",
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
    name = "auditTime",
    value = "审核时间",
    dataType = "",
    notes = "5b36e5e69d2feff19b2aa2d9"
  )
  private java.util.Date auditTime;

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
    notes = "5b36e6a39d2feff19b2b62b5"
  )
  private String remark;

  @FieldMeta(
    name = "confirmUserCode",
    scene = "",
    nameCN = "确认到货人代码",
    comment = "确认到货人代码",
    nameEN = "confirm_user_code",
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
    name = "confirmUserCode",
    value = "确认到货人代码",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c233"
  )
  private String confirmUserCode;

  @FieldMeta(
    name = "confirmUserName",
    scene = "",
    nameCN = "确认到货人名称",
    comment = "确认到货人名称",
    nameEN = "confirm_user_name",
    type = "字符串",
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
    name = "confirmUserName",
    value = "确认到货人名称",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c236"
  )
  private String confirmUserName;

  @FieldMeta(
    name = "confirmTime",
    scene = "",
    nameCN = "确认到货时间",
    comment = "确认到货时间",
    nameEN = "confirm_time",
    type = "时间",
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
    name = "confirmTime",
    value = "确认到货时间",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c237"
  )
  private java.util.Date confirmTime;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<SalConsignOutHeadDTO, Long> id_ = o -> o.getId();
    public static Function<SalConsignOutHeadDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<SalConsignOutHeadDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<SalConsignOutHeadDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<SalConsignOutHeadDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<SalConsignOutHeadDTO, String> creatorOrgCode_ =
        o -> o.getCreatorOrgCode();
    public static Function<SalConsignOutHeadDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<SalConsignOutHeadDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<SalConsignOutHeadDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<SalConsignOutHeadDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<SalConsignOutHeadDTO, Integer> version_ = o -> o.getVersion();

    public static Function<SalConsignOutHeadDTO, String> seqno_ = o -> o.getSeqno();
    public static Function<SalConsignOutHeadDTO, Long> entId_ = o -> o.getEntId();
    public static Function<SalConsignOutHeadDTO, Long> conId_ = o -> o.getConId();
    public static Function<SalConsignOutHeadDTO, String> conSeqno_ = o -> o.getConSeqno();
    public static Function<SalConsignOutHeadDTO, java.util.Date> preArrivalDate_ =
        o -> o.getPreArrivalDate();
    public static Function<SalConsignOutHeadDTO, Long> conOrgId_ = o -> o.getConOrgId();
    public static Function<SalConsignOutHeadDTO, String> conOrgCode_ = o -> o.getConOrgCode();
    public static Function<SalConsignOutHeadDTO, String> conOrgName_ = o -> o.getConOrgName();
    public static Function<SalConsignOutHeadDTO, Long> cusOrgId_ = o -> o.getCusOrgId();
    public static Function<SalConsignOutHeadDTO, String> cusOrgCode_ = o -> o.getCusOrgCode();
    public static Function<SalConsignOutHeadDTO, String> cusOrgName_ = o -> o.getCusOrgName();
    public static Function<SalConsignOutHeadDTO, String> transitLineNo_ = o -> o.getTransitLineNo();
    public static Function<SalConsignOutHeadDTO, java.math.BigDecimal> shippedQty_ =
        o -> o.getShippedQty();
    public static Function<SalConsignOutHeadDTO, java.math.BigDecimal> shippedGrossWeight_ =
        o -> o.getShippedGrossWeight();
    public static Function<SalConsignOutHeadDTO, java.math.BigDecimal> shippedNetWeight_ =
        o -> o.getShippedNetWeight();
    public static Function<SalConsignOutHeadDTO, java.math.BigDecimal> shippedVolume_ =
        o -> o.getShippedVolume();
    public static Function<SalConsignOutHeadDTO, java.math.BigDecimal> shippedAmt_ =
        o -> o.getShippedAmt();
    public static Function<SalConsignOutHeadDTO, java.math.BigDecimal> taxAmt_ = o -> o.getTaxAmt();
    public static Function<SalConsignOutHeadDTO, Integer> stockoutStatus_ =
        o -> o.getStockoutStatus();
    public static Function<SalConsignOutHeadDTO, String> auditorCode_ = o -> o.getAuditorCode();
    public static Function<SalConsignOutHeadDTO, String> auditorName_ = o -> o.getAuditorName();
    public static Function<SalConsignOutHeadDTO, java.util.Date> auditTime_ = o -> o.getAuditTime();
    public static Function<SalConsignOutHeadDTO, String> remark_ = o -> o.getRemark();
    public static Function<SalConsignOutHeadDTO, String> confirmUserCode_ =
        o -> o.getConfirmUserCode();
    public static Function<SalConsignOutHeadDTO, String> confirmUserName_ =
        o -> o.getConfirmUserName();
    public static Function<SalConsignOutHeadDTO, java.util.Date> confirmTime_ =
        o -> o.getConfirmTime();
  }

  public static ValidatorBuilder<SalConsignOutHeadDTO> validatorExample() {
    ValidatorBuilder<SalConsignOutHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
