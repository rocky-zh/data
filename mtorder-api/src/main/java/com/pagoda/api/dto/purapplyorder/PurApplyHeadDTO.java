package com.pagoda.api.dto.purapplyorder;

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
    nameCN = "创建时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "createdAt", value = "创建时间", dataType = "datetime", notes = "")
  private Date createdAt;

  @FieldMeta(
    name = "creatorCode",
    nameCN = "创建人code",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorCode", value = "创建人code", dataType = "string", notes = "")
  private String creatorCode;

  @FieldMeta(
    name = "creatorName",
    nameCN = "创建人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorName", value = "创建人名称", dataType = "string", notes = "")
  private String creatorName;

  @FieldMeta(
    name = "creatorOrgCode",
    nameCN = "创建人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorOrgCode", value = "创建人所属部门", dataType = "string", notes = "")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最近修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "lastModifiedAt", value = "", dataType = "datetime", notes = "")
  private Date lastModifiedAt;

  @FieldMeta(
    name = "modifierCode",
    nameCN = "最近修改人code",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierCode", value = "最近修改人code", dataType = "string", notes = "")
  private String modifierCode;

  @FieldMeta(
    name = "modifierName",
    nameCN = "最近修改人name",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierName", value = "最近修改人name", dataType = "string", notes = "")
  private String modifierName;

  @FieldMeta(
    name = "modifierOrgCode",
    nameCN = "修改人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierOrgCode", value = "修改人所属部门", dataType = "string", notes = "")
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
    nameCN = "调价单号[adjustNo]",
    comment = "调价单号[adjustNo]",
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
    value = "调价单号[adjustNo]",
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
    nameCN = "订单来源{1:手工录入,2:订单追加,3:商品分货,4:周期发货,5 必上果品 6:普通预订单}",
    comment = "订单来源{1:手工录入,2:订单追加,3:商品分货,4:周期发货,5 必上果品 6:普通预订单}",
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
    value = "订单来源{1:手工录入,2:订单追加,3:商品分货,4:周期发货,5 必上果品 6:普通预订单}",
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
  private java.sql.Timestamp auditTime;

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

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<PurApplyHeadDTO, Long> _id = o -> o.getId();
    public static final Function<PurApplyHeadDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<PurApplyHeadDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<PurApplyHeadDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<PurApplyHeadDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<PurApplyHeadDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<PurApplyHeadDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<PurApplyHeadDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<PurApplyHeadDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<PurApplyHeadDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<PurApplyHeadDTO, Integer> _version = o -> o.getVersion();

    public static final Function<PurApplyHeadDTO, String> _seqno = o -> o.getSeqno();
    public static final Function<PurApplyHeadDTO, Long> _entId = o -> o.getEntId();
    public static final Function<PurApplyHeadDTO, Integer> _sourceType = o -> o.getSourceType();
    public static final Function<PurApplyHeadDTO, Long> _applyOrgId = o -> o.getApplyOrgId();
    public static final Function<PurApplyHeadDTO, String> _applyOrgCode = o -> o.getApplyOrgCode();
    public static final Function<PurApplyHeadDTO, String> _applyOrgName = o -> o.getApplyOrgName();
    public static final Function<PurApplyHeadDTO, Long> _arrOrgId = o -> o.getArrOrgId();
    public static final Function<PurApplyHeadDTO, String> _arrOrgCode = o -> o.getArrOrgCode();
    public static final Function<PurApplyHeadDTO, String> _arrOrgName = o -> o.getArrOrgName();
    public static final Function<PurApplyHeadDTO, java.util.Date> _planRecDate =
        o -> o.getPlanRecDate();
    public static final Function<PurApplyHeadDTO, String> _auditorCode = o -> o.getAuditorCode();
    public static final Function<PurApplyHeadDTO, String> _auditorName = o -> o.getAuditorName();
    public static final Function<PurApplyHeadDTO, java.sql.Timestamp> _auditTime =
        o -> o.getAuditTime();
    public static final Function<PurApplyHeadDTO, Integer> _applyStatus = o -> o.getApplyStatus();
    public static final Function<PurApplyHeadDTO, Integer> _calType = o -> o.getCalType();
    public static final Function<PurApplyHeadDTO, java.math.BigDecimal> _calPurRate =
        o -> o.getCalPurRate();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
