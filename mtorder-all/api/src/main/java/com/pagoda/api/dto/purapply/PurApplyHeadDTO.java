package com.pagoda.api.dto.purapply;

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
import static com.pagoda.api.dto.purapply.PurApplyHeadDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.PurApplyHead")
@ApiModel(value = "PurApplyHeadDTO", description = "采购请购单头表")
@EntityFeature(
  entityName = "PurApplyHeadDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = true,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class PurApplyHeadDTO extends AbstractDTO implements Serializable {

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
    scene = "",
    nameCN = "请购单号码",
    comment = "请购单号码",
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
    value = "请购单号码",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c207"
  )
  private String seqno;

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
    name = "sourceType",
    scene = "",
    nameCN = "数据来源{1:手工录入,2:补货汇总生成}",
    comment = "数据来源{1:手工录入,2:补货汇总生成}",
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
    value = "数据来源{1:手工录入,2:补货汇总生成}",
    dataType = "",
    notes = "5b35d5f69d2feff19b411323"
  )
  private Integer sourceType;

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
    name = "arrOrgCode",
    scene = "",
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
    notes = "5b35d5f69d2feff19b41132b"
  )
  private String arrOrgCode;

  @FieldMeta(
    name = "arrOrgName",
    scene = "",
    nameCN = "到货机构名称",
    comment = "到货机构名称",
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
    value = "到货机构名称",
    dataType = "",
    notes = "5b35d5f69d2feff19b41132d"
  )
  private String arrOrgName;

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
    scene = "",
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
    notes = "5b35d1c89d2feff19b40c22b"
  )
  private String auditorCode;

  @FieldMeta(
    name = "auditorName",
    scene = "",
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
    notes = "5b35d1c89d2feff19b40c22d"
  )
  private String auditorName;

  @FieldMeta(
    name = "auditTime",
    scene = "",
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
    notes = "5b35d1c89d2feff19b40c22f"
  )
  private java.util.Date auditTime;

  @FieldMeta(
    name = "applyStatus",
    scene = "",
    nameCN =
        "申请状态{10:未提交，20:待审核，30:请购完成(审核通过)，40:已作废 50-已拒绝}rn            20待审核，提交人不可编辑，采购经理审核时可操作修改数量；rn            30请购完成，审核通过的请购单可以被采购订单和内部调拨单新增时查到，并可进行后续采购与调拨业务，流程结束;；rn            40已作废，审核不通过的请购单视为无效请购单，流程结束。rn            }",
    comment =
        "申请状态{10:未提交，20:待审核，30:请购完成(审核通过)，40:已作废 50-已拒绝}rn            20待审核，提交人不可编辑，采购经理审核时可操作修改数量；rn            30请购完成，审核通过的请购单可以被采购订单和内部调拨单新增时查到，并可进行后续采购与调拨业务，流程结束;；rn            40已作废，审核不通过的请购单视为无效请购单，流程结束。rn            }",
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
        "申请状态{10:未提交，20:待审核，30:请购完成(审核通过)，40:已作废 50-已拒绝}rn            20待审核，提交人不可编辑，采购经理审核时可操作修改数量；rn            30请购完成，审核通过的请购单可以被采购订单和内部调拨单新增时查到，并可进行后续采购与调拨业务，流程结束;；rn            40已作废，审核不通过的请购单视为无效请购单，流程结束。rn            }",
    dataType = "",
    notes = "5b35d5f69d2feff19b411337"
  )
  private Integer applyStatus;

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
    name = "calPurRate",
    scene = "",
    nameCN = "计算采购系数[数据来源=2时使用]",
    comment = "计算采购系数[数据来源=2时使用]",
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
    value = "计算采购系数[数据来源=2时使用]",
    dataType = "",
    notes = "5b35d5f69d2feff19b411335"
  )
  private java.math.BigDecimal calPurRate;

  @FieldMeta(
    name = "bpmnStatus",
    scene = "",
    nameCN = "流程引擎审核状态",
    comment = "流程引擎审核状态",
    nameEN = "bpmn_status",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = true,
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
    value = "流程引擎审核状态",
    dataType = "",
    notes = "5b39d3c19d2feff19b80b357"
  )
  private Integer bpmnStatus;

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
    name = "bpmnRemark",
    value = "流程引擎审核备注",
    dataType = "",
    notes = "5b39d3c19d2feff19b80b355"
  )
  private String bpmnRemark;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<PurApplyHeadDTO, Long> id_ = o -> o.getId();
    public static Function<PurApplyHeadDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<PurApplyHeadDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<PurApplyHeadDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<PurApplyHeadDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<PurApplyHeadDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<PurApplyHeadDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<PurApplyHeadDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<PurApplyHeadDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<PurApplyHeadDTO, String> modifierOrgCode_ = o -> o.getModifierOrgCode();

    public static Function<PurApplyHeadDTO, Integer> version_ = o -> o.getVersion();

    public static Function<PurApplyHeadDTO, String> seqno_ = o -> o.getSeqno();
    public static Function<PurApplyHeadDTO, Long> entId_ = o -> o.getEntId();
    public static Function<PurApplyHeadDTO, Integer> sourceType_ = o -> o.getSourceType();
    public static Function<PurApplyHeadDTO, Long> applyOrgId_ = o -> o.getApplyOrgId();
    public static Function<PurApplyHeadDTO, String> applyOrgCode_ = o -> o.getApplyOrgCode();
    public static Function<PurApplyHeadDTO, String> applyOrgName_ = o -> o.getApplyOrgName();
    public static Function<PurApplyHeadDTO, Long> arrOrgId_ = o -> o.getArrOrgId();
    public static Function<PurApplyHeadDTO, String> arrOrgCode_ = o -> o.getArrOrgCode();
    public static Function<PurApplyHeadDTO, String> arrOrgName_ = o -> o.getArrOrgName();
    public static Function<PurApplyHeadDTO, java.util.Date> planRecDate_ = o -> o.getPlanRecDate();
    public static Function<PurApplyHeadDTO, String> auditorCode_ = o -> o.getAuditorCode();
    public static Function<PurApplyHeadDTO, String> auditorName_ = o -> o.getAuditorName();
    public static Function<PurApplyHeadDTO, java.util.Date> auditTime_ = o -> o.getAuditTime();
    public static Function<PurApplyHeadDTO, Integer> applyStatus_ = o -> o.getApplyStatus();
    public static Function<PurApplyHeadDTO, Integer> calType_ = o -> o.getCalType();
    public static Function<PurApplyHeadDTO, java.math.BigDecimal> calPurRate_ =
        o -> o.getCalPurRate();
    public static Function<PurApplyHeadDTO, Integer> bpmnStatus_ = o -> o.getBpmnStatus();
    public static Function<PurApplyHeadDTO, String> bpmnRemark_ = o -> o.getBpmnRemark();
  }

  public static ValidatorBuilder<PurApplyHeadDTO> validatorExample() {
    ValidatorBuilder<PurApplyHeadDTO> builder = new ValidatorBuilder<>();
    builder.field(bpmnStatus_, notNull, "流程引擎审核状态为空");
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
