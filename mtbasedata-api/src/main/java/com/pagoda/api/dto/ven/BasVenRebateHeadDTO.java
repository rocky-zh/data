package com.pagoda.api.dto.ven;

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
import static com.pagoda.api.dto.ven.BasVenRebateHeadDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasVenRebateHead")
@ApiModel(value = "BasVenRebateHeadDTO", description = "供应商返利头表")
@EntityFeature(
  entityName = "BasVenRebateHeadDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = true,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = true
)
public class BasVenRebateHeadDTO extends AbstractDTO implements Serializable {

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
    name = "no",
    scene = "",
    nameCN = "返利协议号",
    comment = "返利协议号",
    nameEN = "no",
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
  @ApiModelProperty(name = "no", value = "返利协议号", dataType = "", notes = "5b35e3d59d2feff19b455ead")
  private String no;

  @FieldMeta(
    name = "balOrgCode",
    scene = "",
    nameCN = "结算机构代码[冗余]",
    comment = "结算机构代码[冗余]",
    nameEN = "bal_org_code",
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
    name = "balOrgCode",
    value = "结算机构代码[冗余]",
    dataType = "",
    notes = "5b35e3d59d2feff19b455eb2"
  )
  private String balOrgCode;

  @FieldMeta(
    name = "venOrgId",
    scene = "",
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
    notes = "5b35e3d59d2feff19b455eac"
  )
  private Long venOrgId;

  @FieldMeta(
    name = "venOrgCode",
    scene = "",
    nameCN = "供应商代码[冗余]",
    comment = "供应商代码[冗余]",
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
    value = "供应商代码[冗余]",
    dataType = "",
    notes = "5b35e3d59d2feff19b455eb1"
  )
  private String venOrgCode;

  @FieldMeta(
    name = "venOrgName",
    scene = "",
    nameCN = "供应商名称[冗余]",
    comment = "供应商名称[冗余]",
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
    value = "供应商名称[冗余]",
    dataType = "",
    notes = "5b35e3d59d2feff19b455eb3"
  )
  private String venOrgName;

  @FieldMeta(
    name = "rebateMode",
    scene = "",
    nameCN = "返利方式(1-金额, 2-数量)",
    comment = "返利方式(1-金额, 2-数量)",
    nameEN = "rebate_mode",
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
    name = "rebateMode",
    value = "返利方式(1-金额, 2-数量)",
    dataType = "",
    notes = "5b35e3d59d2feff19b455eba"
  )
  private Integer rebateMode;

  @FieldMeta(
    name = "rebateRate",
    scene = "",
    nameCN = "返利比例(不能大于1)",
    comment = "返利比例(不能大于1)",
    nameEN = "rebate_rate",
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
    name = "rebateRate",
    value = "返利比例(不能大于1)",
    dataType = "",
    notes = "5b35e3d59d2feff19b455ec2"
  )
  private java.math.BigDecimal rebateRate;

  @FieldMeta(
    name = "isAllEffect",
    scene = "",
    nameCN = "是否全部到货机构生效",
    comment = "是否全部到货机构生效",
    nameEN = "is_all_effect",
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
    name = "isAllEffect",
    value = "是否全部到货机构生效",
    dataType = "",
    notes = "5b35e3d59d2feff19b455eb9"
  )
  private Integer isAllEffect;

  @FieldMeta(
    name = "beginDate",
    scene = "",
    nameCN = "协议开始日期",
    comment = "协议开始日期",
    nameEN = "begin_date",
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
    name = "beginDate",
    value = "协议开始日期",
    dataType = "",
    notes = "5b35e3d59d2feff19b455ebc"
  )
  private java.util.Date beginDate;

  @FieldMeta(
    name = "endDate",
    scene = "",
    nameCN = "协议结束日期",
    comment = "协议结束日期",
    nameEN = "end_date",
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
    name = "endDate",
    value = "协议结束日期",
    dataType = "",
    notes = "5b35e3d59d2feff19b455ebf"
  )
  private java.util.Date endDate;

  @FieldMeta(
    name = "balOrgId",
    scene = "",
    nameCN = "结算机构ID ",
    comment = "结算机构ID ",
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
    value = "结算机构ID ",
    dataType = "",
    notes = "5b35d8689d2feff19b4169bc"
  )
  private Long balOrgId;

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

  @FieldMeta(
    name = "status",
    scene = "",
    nameCN = "状态( 10-新单据,20-已生效 30-已停用)",
    comment = "状态( 10-新单据,20-已生效 30-已停用)",
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
    value = "状态( 10-新单据,20-已生效 30-已停用)",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f8"
  )
  private Integer status;

  @FieldMeta(
    name = "effectDate",
    scene = "",
    nameCN = "生效日期(启用时间,追加时间)",
    comment = "生效日期(启用时间,追加时间)",
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
    value = "生效日期(启用时间,追加时间)",
    dataType = "",
    notes = "5b35e3459d2feff19b450fad"
  )
  private java.util.Date effectDate;

  @FieldMeta(
    name = "expiryDate",
    scene = "",
    nameCN = "失效日期(停用时间)",
    comment = "失效日期(停用时间)",
    nameEN = "expiry_date",
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
    name = "expiryDate",
    value = "失效日期(停用时间)",
    dataType = "",
    notes = "5b35e3459d2feff19b450fb1"
  )
  private java.util.Date expiryDate;

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

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasVenRebateHeadDTO, Long> _id = o -> o.getId();
    public static final Function<BasVenRebateHeadDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasVenRebateHeadDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasVenRebateHeadDTO, String> _creatorCode =
        o -> o.getCreatorCode();
    public static final Function<BasVenRebateHeadDTO, String> _creatorName =
        o -> o.getCreatorName();
    public static final Function<BasVenRebateHeadDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<BasVenRebateHeadDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<BasVenRebateHeadDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<BasVenRebateHeadDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<BasVenRebateHeadDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasVenRebateHeadDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasVenRebateHeadDTO, String> _no = o -> o.getNo();
    public static final Function<BasVenRebateHeadDTO, String> _balOrgCode = o -> o.getBalOrgCode();
    public static final Function<BasVenRebateHeadDTO, Long> _venOrgId = o -> o.getVenOrgId();
    public static final Function<BasVenRebateHeadDTO, String> _venOrgCode = o -> o.getVenOrgCode();
    public static final Function<BasVenRebateHeadDTO, String> _venOrgName = o -> o.getVenOrgName();
    public static final Function<BasVenRebateHeadDTO, Integer> _rebateMode = o -> o.getRebateMode();
    public static final Function<BasVenRebateHeadDTO, java.math.BigDecimal> _rebateRate =
        o -> o.getRebateRate();
    public static final Function<BasVenRebateHeadDTO, Integer> _isAllEffect =
        o -> o.getIsAllEffect();
    public static final Function<BasVenRebateHeadDTO, java.util.Date> _beginDate =
        o -> o.getBeginDate();
    public static final Function<BasVenRebateHeadDTO, java.util.Date> _endDate =
        o -> o.getEndDate();
    public static final Function<BasVenRebateHeadDTO, Long> _balOrgId = o -> o.getBalOrgId();
    public static final Function<BasVenRebateHeadDTO, String> _balOrgName = o -> o.getBalOrgName();
    public static final Function<BasVenRebateHeadDTO, Integer> _status = o -> o.getStatus();
    public static final Function<BasVenRebateHeadDTO, java.util.Date> _effectDate =
        o -> o.getEffectDate();
    public static final Function<BasVenRebateHeadDTO, java.util.Date> _expiryDate =
        o -> o.getExpiryDate();
    public static final Function<BasVenRebateHeadDTO, String> _remark = o -> o.getRemark();
  }

  public static ValidatorBuilder<BasVenRebateHeadDTO> validatorExample() {
    ValidatorBuilder<BasVenRebateHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
