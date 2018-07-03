package com.pagoda.api.dto.purapply;

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
@ApiModel(value = "QueryPurApplyByConditionDTO", description = "采购请购单单头条件查询")
@EntityFeature(
  entityName = "QueryPurApplyByConditionDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class QueryPurApplyByConditionDTO implements Serializable {
  @FieldMeta(
    name = "seqno",
    scene = "",
    nameCN = "采购订单号",
    comment = "采购订单号",
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
    value = "采购订单号",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c207"
  )
  private String seqno;

  @FieldMeta(
    name = "auditorName",
    scene = "",
    nameCN = "当前审核用户名称",
    comment = "当前审核用户名称",
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
    value = "当前审核用户名称",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c22d"
  )
  private String auditorName;

  @FieldMeta(
    name = "calType",
    scene = "",
    nameCN = "计算方式[数据来源=2时使用]{1:按门店订货,2:按门店销量}",
    comment = "计算方式[数据来源=2时使用]{1:按门店订货,2:按门店销量}",
    nameEN = "cal_type",
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
    name = "calType",
    value = "计算方式[数据来源=2时使用]{1:按门店订货,2:按门店销量}",
    dataType = "",
    notes = "5b35d5f69d2feff19b411333"
  )
  private Integer calType;

  @FieldMeta(
    name = "planRecDate",
    scene = "",
    nameCN = "应到货日期",
    comment = "应到货日期",
    nameEN = "plan_rec_date",
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
    name = "planRecDate",
    value = "应到货日期",
    dataType = "",
    notes = "5b35d5f69d2feff19b411331"
  )
  private java.util.Date planRecDate;

  @FieldMeta(
    name = "applyStatus",
    scene = "",
    nameCN =
        "申请状态{10:未提交，20:待审核，30:请购完成(审核通过)，40:已作废}  20待审核，提交人不可编辑，采购经理审核时可操作修改数量；  30请购完成，审核通过的请购单可以被采购订单和内部调拨单新增时查到，并可进行后续采购与调拨业务，流程结束;；  40已作废，审核不通过的请购单视为无效请购单，流程结束。  }",
    comment =
        "申请状态{10:未提交，20:待审核，30:请购完成(审核通过)，40:已作废}  20待审核，提交人不可编辑，采购经理审核时可操作修改数量；  30请购完成，审核通过的请购单可以被采购订单和内部调拨单新增时查到，并可进行后续采购与调拨业务，流程结束;；  40已作废，审核不通过的请购单视为无效请购单，流程结束。  }",
    nameEN = "apply_status",
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
    name = "applyStatus",
    value =
        "申请状态{10:未提交，20:待审核，30:请购完成(审核通过)，40:已作废}  20待审核，提交人不可编辑，采购经理审核时可操作修改数量；  30请购完成，审核通过的请购单可以被采购订单和内部调拨单新增时查到，并可进行后续采购与调拨业务，流程结束;；  40已作废，审核不通过的请购单视为无效请购单，流程结束。  }",
    dataType = "",
    notes = "5b35d5f69d2feff19b411337"
  )
  private Integer applyStatus;

  @FieldMeta(
    name = "sourceType",
    scene = "",
    nameCN = "来源类型{1:商品定义中来,2:手工录入的允许修改}[1:来源不允许修改删除，2:来源允许修改和删除]",
    comment = "来源类型{1:商品定义中来,2:手工录入的允许修改}[1:来源不允许修改删除，2:来源允许修改和删除]",
    nameEN = "source_type",
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
    name = "sourceType",
    value = "来源类型{1:商品定义中来,2:手工录入的允许修改}[1:来源不允许修改删除，2:来源允许修改和删除]",
    dataType = "",
    notes = "5b35d5f69d2feff19b411323"
  )
  private Integer sourceType;

  @FieldMeta(
    name = "auditorCode",
    scene = "",
    nameCN = "当前审核用户代码",
    comment = "当前审核用户代码",
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
    value = "当前审核用户代码",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c22b"
  )
  private String auditorCode;

  @FieldMeta(
    name = "arrOrgCode",
    scene = "",
    nameCN = "到货机构代码[冗余]",
    comment = "到货机构代码[冗余]",
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
    value = "到货机构代码[冗余]",
    dataType = "",
    notes = "5b35d5f69d2feff19b41132b"
  )
  private String arrOrgCode;

  @FieldMeta(
    name = "auditTime",
    scene = "",
    nameCN = "当前审核时间",
    comment = "当前审核时间",
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
    value = "当前审核时间",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c22f"
  )
  private java.sql.Timestamp auditTime;

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
    name = "applyOrgName",
    scene = "",
    nameCN = "申请机构名称",
    comment = "申请机构名称",
    nameEN = "apply_org_name",
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
    name = "applyOrgName",
    value = "申请机构名称",
    dataType = "",
    notes = "5b35d5f69d2feff19b411325"
  )
  private String applyOrgName;

  @FieldMeta(
    name = "calPurRate",
    scene = "",
    nameCN = "计算采购系数[头sourcetype=2时计算得到,明细可修改]",
    comment = "计算采购系数[头sourcetype=2时计算得到,明细可修改]",
    nameEN = "cal_pur_rate",
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
    name = "calPurRate",
    value = "计算采购系数[头sourcetype=2时计算得到,明细可修改]",
    dataType = "",
    notes = "5b35d5f69d2feff19b411335"
  )
  private java.math.BigDecimal calPurRate;

  @FieldMeta(
    name = "arrOrgId",
    scene = "",
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
    notes = "5b35d5f69d2feff19b411322"
  )
  private Long arrOrgId;

  @FieldMeta(
    name = "applyOrgCode",
    scene = "",
    nameCN = "申请机构代码",
    comment = "申请机构代码",
    nameEN = "apply_org_code",
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
    name = "applyOrgCode",
    value = "申请机构代码",
    dataType = "",
    notes = "5b35d5f69d2feff19b411329"
  )
  private String applyOrgCode;

  @FieldMeta(
    name = "applyOrgId",
    scene = "",
    nameCN = "申请机构ID",
    comment = "申请机构ID",
    nameEN = "apply_org_id",
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
    name = "applyOrgId",
    value = "申请机构ID",
    dataType = "",
    notes = "5b35d5f69d2feff19b411328"
  )
  private Long applyOrgId;

  @FieldMeta(
    name = "arrOrgName",
    scene = "",
    nameCN = "到货机构名称[冗余]",
    comment = "到货机构名称[冗余]",
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
    value = "到货机构名称[冗余]",
    dataType = "",
    notes = "5b35d5f69d2feff19b41132d"
  )
  private String arrOrgName;
}
