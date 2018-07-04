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
import static com.pagoda.api.dto.ven.BasVenRebateOrgDetailDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasVenRebateOrgDetail")
@ApiModel(value = "BasVenRebateOrgDetailDTO", description = "供应商返利到货机构明细表")
@EntityFeature(
  entityName = "BasVenRebateOrgDetailDTO",
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
public class BasVenRebateOrgDetailDTO extends AbstractDTO implements Serializable {

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
    name = "rebateId",
    scene = "",
    nameCN = "返利协议ID",
    comment = "返利协议ID",
    nameEN = "rebate_id",
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
    name = "rebateId",
    value = "返利协议ID",
    dataType = "",
    notes = "5b35e3459d2feff19b450f9f"
  )
  private Long rebateId;

  @FieldMeta(
    name = "rebateNo",
    scene = "",
    nameCN = "返利协议号[冗余]",
    comment = "返利协议号[冗余]",
    nameEN = "rebate_no",
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
    name = "rebateNo",
    value = "返利协议号[冗余]",
    dataType = "",
    notes = "5b35e3459d2feff19b450f9c"
  )
  private String rebateNo;

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
    name = "effectDate",
    scene = "",
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
    notes = "5b35e3459d2feff19b450fad"
  )
  private java.util.Date effectDate;

  @FieldMeta(
    name = "expiryDate",
    scene = "",
    nameCN = "失效日期(停用时间)",
    comment = "失效日期(停用时间)",
    nameEN = "expiry_date",
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
    name = "expiryDate",
    value = "失效日期(停用时间)",
    dataType = "",
    notes = "5b35e3459d2feff19b450fb1"
  )
  private java.util.Date expiryDate;

  @FieldMeta(
    name = "status",
    scene = "",
    nameCN = "状态[10:新录入,20:录入完成,30:已审核,40:已入库,50:已驳回]",
    comment = "状态[10:新录入,20:录入完成,30:已审核,40:已入库,50:已驳回]",
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
    value = "状态[10:新录入,20:录入完成,30:已审核,40:已入库,50:已驳回]",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f8"
  )
  private Integer status;

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
    public static final Function<BasVenRebateOrgDetailDTO, Long> _id = o -> o.getId();
    public static final Function<BasVenRebateOrgDetailDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasVenRebateOrgDetailDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasVenRebateOrgDetailDTO, String> _creatorCode =
        o -> o.getCreatorCode();
    public static final Function<BasVenRebateOrgDetailDTO, String> _creatorName =
        o -> o.getCreatorName();
    public static final Function<BasVenRebateOrgDetailDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<BasVenRebateOrgDetailDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<BasVenRebateOrgDetailDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<BasVenRebateOrgDetailDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<BasVenRebateOrgDetailDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasVenRebateOrgDetailDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasVenRebateOrgDetailDTO, Long> _rebateId = o -> o.getRebateId();
    public static final Function<BasVenRebateOrgDetailDTO, String> _rebateNo = o -> o.getRebateNo();
    public static final Function<BasVenRebateOrgDetailDTO, Long> _arrOrgId = o -> o.getArrOrgId();
    public static final Function<BasVenRebateOrgDetailDTO, String> _arrOrgCode =
        o -> o.getArrOrgCode();
    public static final Function<BasVenRebateOrgDetailDTO, String> _arrOrgName =
        o -> o.getArrOrgName();
    public static final Function<BasVenRebateOrgDetailDTO, Long> _entId = o -> o.getEntId();
    public static final Function<BasVenRebateOrgDetailDTO, java.util.Date> _effectDate =
        o -> o.getEffectDate();
    public static final Function<BasVenRebateOrgDetailDTO, java.util.Date> _expiryDate =
        o -> o.getExpiryDate();
    public static final Function<BasVenRebateOrgDetailDTO, Integer> _status = o -> o.getStatus();
    public static final Function<BasVenRebateOrgDetailDTO, String> _remark = o -> o.getRemark();
  }

  public static ValidatorBuilder<BasVenRebateOrgDetailDTO> validatorExample() {
    ValidatorBuilder<BasVenRebateOrgDetailDTO> builder = new ValidatorBuilder();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
