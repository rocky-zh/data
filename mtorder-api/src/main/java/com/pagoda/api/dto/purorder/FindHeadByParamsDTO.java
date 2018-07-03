package com.pagoda.api.dto.purorder;

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
@ApiModel(value = "FindHeadByParamsDTO", description = "采购单列表查询")
@EntityFeature(
  entityName = "FindHeadByParamsDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class FindHeadByParamsDTO implements Serializable {
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
  private java.sql.Timestamp auditTime;

  @FieldMeta(
    name = "orderStatus",
    scene = "",
    nameCN = "订单状态[此状态变化需要记录日志]{10-未提交, 20-待审核 ,30-待确认, 40-订单完成 50订单作废}             ",
    comment = "订单状态[此状态变化需要记录日志]{10-未提交, 20-待审核 ,30-待确认, 40-订单完成 50订单作废}             ",
    nameEN = "order_status",
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
    name = "orderStatus",
    value = "订单状态[此状态变化需要记录日志]{10-未提交, 20-待审核 ,30-待确认, 40-订单完成 50订单作废}             ",
    dataType = "",
    notes = "5b35dbc79d2feff19b4223aa"
  )
  private Integer orderStatus;

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
    name = "bpmnStatus",
    scene = "",
    nameCN = "流程引擎审核状态{10:XXX,20:XXX,待产品定}",
    comment = "流程引擎审核状态{10:XXX,20:XXX,待产品定}",
    nameEN = "bpmn_status",
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
    name = "bpmnStatus",
    value = "流程引擎审核状态{10:XXX,20:XXX,待产品定}",
    dataType = "",
    notes = "5b39d3c19d2feff19b80b357"
  )
  private Integer bpmnStatus;

  @FieldMeta(
    name = "venComfirmStatus",
    scene = "",
    nameCN = "供应商确认状态{0:未确认,1:已确认}",
    comment = "供应商确认状态{0:未确认,1:已确认}",
    nameEN = "ven_comfirm_status",
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
    name = "venComfirmStatus",
    value = "供应商确认状态{0:未确认,1:已确认}",
    dataType = "",
    notes = "5b39d3c19d2feff19b80b350"
  )
  private Integer venComfirmStatus;

  @FieldMeta(
    name = "venComfirmUserCode",
    scene = "",
    nameCN = "供应商确认人编号",
    comment = "供应商确认人编号",
    nameEN = "ven_comfirm_user_code",
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
    name = "venComfirmUserCode",
    value = "供应商确认人编号",
    dataType = "",
    notes = "5b39d3c19d2feff19b80b351"
  )
  private String venComfirmUserCode;

  @FieldMeta(
    name = "venOrgId",
    scene = "price",
    nameCN = "供应商ID",
    comment = "供应商ID",
    nameEN = "ven_org_id",
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
    name = "venOrgId",
    value = "供应商ID",
    dataType = "",
    notes = "5b36e4da9d2feff19b2994df"
  )
  private Long venOrgId;

  @FieldMeta(
    name = "venComfirmUserName",
    scene = "",
    nameCN = "供应商确认人名称",
    comment = "供应商确认人名称",
    nameEN = "ven_comfirm_user_name",
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
    name = "venComfirmUserName",
    value = "供应商确认人名称",
    dataType = "",
    notes = "5b39d3c19d2feff19b80b353"
  )
  private String venComfirmUserName;

  @FieldMeta(
    name = "bpmnRemark",
    scene = "",
    nameCN = "流程引擎审核备注",
    comment = "流程引擎审核备注",
    nameEN = "bpmn_remark",
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
    name = "bpmnRemark",
    value = "流程引擎审核备注",
    dataType = "",
    notes = "5b39d3c19d2feff19b80b355"
  )
  private String bpmnRemark;
}
