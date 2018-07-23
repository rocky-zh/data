package com.pagoda.api.dto.salconsignreturn;

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
import static com.pagoda.api.dto.salconsignreturn.SalConsignReturnHeadDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalConsignReturnHead")
@ApiModel(value = "SalConsignReturnHeadDTO", description = "退货单头表")
@EntityFeature(
  entityName = "SalConsignReturnHeadDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "/SalConsignReturnHeadService/findSalConsignReturnHeadList",
  tableMultiSelect = true
)
public class SalConsignReturnHeadDTO extends AbstractDTO implements Serializable {

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
    name = "arrOrgId",
    scene = "price",
    nameCN = "到货机构ID",
    comment = "到货机构ID",
    nameEN = "arr_org_id",
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
    name = "arrOrgId",
    value = "到货机构ID",
    dataType = "",
    notes = "5b36e4629d2feff19b291e6f"
  )
  private Long arrOrgId;

  @FieldMeta(
    name = "arrOrgCode",
    scene = "price",
    nameCN = "到货机构代码",
    comment = "到货机构代码",
    nameEN = "arr_org_code",
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
    name = "arrOrgCode",
    value = "到货机构代码",
    dataType = "",
    notes = "5b36e4929d2feff19b294d77"
  )
  private String arrOrgCode;

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
    name = "returnType",
    scene = "",
    nameCN = "退货类型[1:每日必退 2:普通]",
    comment = "退货类型[1:每日必退 2:普通]",
    nameEN = "return_type",
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
    name = "returnType",
    value = "退货类型[1:每日必退 2:普通]",
    dataType = "",
    notes = "5b35de069d2feff19b42d5e6"
  )
  private Integer returnType;

  @FieldMeta(
    name = "returnDate",
    scene = "",
    nameCN = "退货日期",
    comment = "退货日期",
    nameEN = "return_date",
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
    name = "returnDate",
    value = "退货日期",
    dataType = "",
    notes = "5b35de069d2feff19b42d5e8"
  )
  private java.util.Date returnDate;

  @FieldMeta(
    name = "returnQty",
    scene = "",
    nameCN = "退货数量",
    comment = "退货数量",
    nameEN = "return_qty",
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
    name = "returnQty",
    value = "退货数量",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ea"
  )
  private java.math.BigDecimal returnQty;

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
    name = "stockinQty",
    scene = "",
    nameCN = "入库数量",
    comment = "入库数量",
    nameEN = "stockin_qty",
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
    name = "stockinQty",
    value = "入库数量",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ed"
  )
  private java.math.BigDecimal stockinQty;

  @FieldMeta(
    name = "stockinGrossWeight",
    scene = "",
    nameCN = "入库毛重",
    comment = "入库毛重",
    nameEN = "stockin_gross_weight",
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
    name = "stockinGrossWeight",
    value = "入库毛重",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f0"
  )
  private java.math.BigDecimal stockinGrossWeight;

  @FieldMeta(
    name = "stockinNetWeight",
    scene = "",
    nameCN = "入库净重",
    comment = "入库净重",
    nameEN = "stockin_net_weight",
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
    name = "stockinNetWeight",
    value = "入库净重",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ee"
  )
  private java.math.BigDecimal stockinNetWeight;

  @FieldMeta(
    name = "totalTaxAmt",
    scene = "",
    nameCN = "税金",
    comment = "税金",
    nameEN = "total_tax_amt",
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
    name = "totalTaxAmt",
    value = "税金",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f2"
  )
  private java.math.BigDecimal totalTaxAmt;

  @FieldMeta(
    name = "totalReturnAmt",
    scene = "",
    nameCN = "退货总金额[=退货数量*配送单价]",
    comment = "退货总金额[=退货数量*配送单价]",
    nameEN = "total_return_amt",
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
    name = "totalReturnAmt",
    value = "退货总金额[=退货数量*配送单价]",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f6"
  )
  private java.math.BigDecimal totalReturnAmt;

  @FieldMeta(
    name = "totalStockinAmt",
    scene = "",
    nameCN = "入库总金额",
    comment = "入库总金额",
    nameEN = "total_stockin_amt",
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
    name = "totalStockinAmt",
    value = "入库总金额",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f4"
  )
  private java.math.BigDecimal totalStockinAmt;

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
    name = "printCount",
    scene = "",
    nameCN = "打印次数",
    comment = "打印次数",
    nameEN = "print_count",
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
    name = "printCount",
    value = "打印次数",
    dataType = "",
    notes = "5b35d2b49d2feff19b40cb4c"
  )
  private Integer printCount;

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
    name = "note",
    value = "提示信息",
    dataType = "",
    notes = "5b36e6c79d2feff19b2b865c"
  )
  private String note;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<SalConsignReturnHeadDTO, Long> id_ = o -> o.getId();
    public static Function<SalConsignReturnHeadDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<SalConsignReturnHeadDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<SalConsignReturnHeadDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<SalConsignReturnHeadDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<SalConsignReturnHeadDTO, String> creatorOrgCode_ =
        o -> o.getCreatorOrgCode();
    public static Function<SalConsignReturnHeadDTO, Date> lastModifiedAt_ =
        o -> o.getLastModifiedAt();
    public static Function<SalConsignReturnHeadDTO, String> modifierCode_ =
        o -> o.getModifierCode();
    public static Function<SalConsignReturnHeadDTO, String> modifierName_ =
        o -> o.getModifierName();
    public static Function<SalConsignReturnHeadDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<SalConsignReturnHeadDTO, Integer> version_ = o -> o.getVersion();

    public static Function<SalConsignReturnHeadDTO, String> seqno_ = o -> o.getSeqno();
    public static Function<SalConsignReturnHeadDTO, Long> entId_ = o -> o.getEntId();
    public static Function<SalConsignReturnHeadDTO, Long> arrOrgId_ = o -> o.getArrOrgId();
    public static Function<SalConsignReturnHeadDTO, String> arrOrgCode_ = o -> o.getArrOrgCode();
    public static Function<SalConsignReturnHeadDTO, String> arrOrgName_ = o -> o.getArrOrgName();
    public static Function<SalConsignReturnHeadDTO, Long> cusOrgId_ = o -> o.getCusOrgId();
    public static Function<SalConsignReturnHeadDTO, String> cusOrgCode_ = o -> o.getCusOrgCode();
    public static Function<SalConsignReturnHeadDTO, String> cusOrgName_ = o -> o.getCusOrgName();
    public static Function<SalConsignReturnHeadDTO, Integer> returnType_ = o -> o.getReturnType();
    public static Function<SalConsignReturnHeadDTO, java.util.Date> returnDate_ =
        o -> o.getReturnDate();
    public static Function<SalConsignReturnHeadDTO, java.math.BigDecimal> returnQty_ =
        o -> o.getReturnQty();
    public static Function<SalConsignReturnHeadDTO, String> transitLineNo_ =
        o -> o.getTransitLineNo();
    public static Function<SalConsignReturnHeadDTO, java.math.BigDecimal> stockinQty_ =
        o -> o.getStockinQty();
    public static Function<SalConsignReturnHeadDTO, java.math.BigDecimal> stockinGrossWeight_ =
        o -> o.getStockinGrossWeight();
    public static Function<SalConsignReturnHeadDTO, java.math.BigDecimal> stockinNetWeight_ =
        o -> o.getStockinNetWeight();
    public static Function<SalConsignReturnHeadDTO, java.math.BigDecimal> totalTaxAmt_ =
        o -> o.getTotalTaxAmt();
    public static Function<SalConsignReturnHeadDTO, java.math.BigDecimal> totalReturnAmt_ =
        o -> o.getTotalReturnAmt();
    public static Function<SalConsignReturnHeadDTO, java.math.BigDecimal> totalStockinAmt_ =
        o -> o.getTotalStockinAmt();
    public static Function<SalConsignReturnHeadDTO, Integer> status_ = o -> o.getStatus();
    public static Function<SalConsignReturnHeadDTO, Integer> printCount_ = o -> o.getPrintCount();
    public static Function<SalConsignReturnHeadDTO, String> auditorCode_ = o -> o.getAuditorCode();
    public static Function<SalConsignReturnHeadDTO, String> auditorName_ = o -> o.getAuditorName();
    public static Function<SalConsignReturnHeadDTO, java.util.Date> auditTime_ =
        o -> o.getAuditTime();
    public static Function<SalConsignReturnHeadDTO, String> remark_ = o -> o.getRemark();
    public static Function<SalConsignReturnHeadDTO, String> note_ = o -> o.getNote();
  }

  public static ValidatorBuilder<SalConsignReturnHeadDTO> validatorExample() {
    ValidatorBuilder<SalConsignReturnHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
