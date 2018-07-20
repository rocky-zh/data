package com.pagoda.api.dto.purorgven;

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
import static com.pagoda.api.dto.purorgven.PurOrgVenDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.PurOrgVen")
@ApiModel(value = "PurOrgVenDTO", description = "供应商机构")
@EntityFeature(
  entityName = "PurOrgVenDTO",
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
public class PurOrgVenDTO extends AbstractDTO implements Serializable {

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
    name = "orgOrgId",
    scene = "",
    nameCN = "机构ID",
    comment = "机构ID",
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
    name = "orgOrgId",
    value = "机构ID",
    dataType = "",
    notes = "5b35de739d2feff19b42fe5f"
  )
  private Long orgOrgId;

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
    name = "orgOrgName",
    value = "机构名称[冗余]",
    dataType = "",
    notes = "5b35de739d2feff19b42fe5e"
  )
  private String orgOrgName;

  @FieldMeta(
    name = "isAllowOrder",
    scene = "",
    nameCN = "是否可订",
    comment = "是否可订",
    nameEN = "is_allow_order",
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
    name = "isAllowOrder",
    value = "是否可订",
    dataType = "",
    notes = "5b35e4069d2feff19b457ce3"
  )
  private Integer isAllowOrder;

  @FieldMeta(
    name = "isAllowRec",
    scene = "",
    nameCN = "是否可进",
    comment = "是否可进",
    nameEN = "is_allow_rec",
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
    name = "isAllowRec",
    value = "是否可进",
    dataType = "",
    notes = "5b35e4069d2feff19b457ce6"
  )
  private Integer isAllowRec;

  @FieldMeta(
    name = "isReturnable",
    scene = "",
    nameCN = "是否可退",
    comment = "是否可退",
    nameEN = "is_returnable",
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
    name = "isReturnable",
    value = "是否可退",
    dataType = "",
    notes = "5b35e4069d2feff19b457ceb"
  )
  private Integer isReturnable;

  @FieldMeta(
    name = "isPausePay",
    scene = "",
    nameCN = "是否暂停付款 ",
    comment = "是否暂停付款 ",
    nameEN = "is_pause_pay",
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
    name = "isPausePay",
    value = "是否暂停付款 ",
    dataType = "",
    notes = "5b35e4069d2feff19b457ced"
  )
  private Integer isPausePay;

  @FieldMeta(
    name = "isOrderCheck",
    scene = "",
    nameCN = "订单审核",
    comment = "订单审核",
    nameEN = "is_order_check",
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
    name = "isOrderCheck",
    value = "订单审核",
    dataType = "",
    notes = "5b35e1159d2feff19b44001d"
  )
  private Integer isOrderCheck;

  @FieldMeta(
    name = "isRecCheck",
    scene = "",
    nameCN = "到货审核",
    comment = "到货审核",
    nameEN = "is_rec_check",
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
    name = "isRecCheck",
    value = "到货审核",
    dataType = "",
    notes = "5b35e4069d2feff19b457cec"
  )
  private Integer isRecCheck;

  @FieldMeta(
    name = "isReturnCheck",
    scene = "",
    nameCN = "退货审核",
    comment = "退货审核",
    nameEN = "is_return_check",
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
    name = "isReturnCheck",
    value = "退货审核",
    dataType = "",
    notes = "5b35e1159d2feff19b44001b"
  )
  private Integer isReturnCheck;

  @FieldMeta(
    name = "isInvCheck",
    scene = "",
    nameCN = "发票审核",
    comment = "发票审核",
    nameEN = "is_inv_check",
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
    name = "isInvCheck",
    value = "发票审核",
    dataType = "",
    notes = "5b35e4069d2feff19b457ce4"
  )
  private Integer isInvCheck;

  @FieldMeta(
    name = "settlementType",
    scene = "",
    nameCN = "结算方式",
    comment = "结算方式",
    nameEN = "settlement_type",
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
    name = "settlementType",
    value = "结算方式",
    dataType = "",
    notes = "5b35e4069d2feff19b457cfa"
  )
  private Integer settlementType;

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
    name = "venClassId",
    scene = "",
    nameCN = "供应商分类ID[冗余]",
    comment = "供应商分类ID[冗余]",
    nameEN = "ven_class_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = true,
    visible = false,
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
    name = "venClassId",
    value = "供应商分类ID[冗余]",
    dataType = "",
    notes = "5b4dded59d2feff19b4527f5"
  )
  private Long venClassId;

  @FieldMeta(
    name = "venClassName",
    scene = "",
    nameCN = "供应商分类名称[冗余]",
    comment = "供应商分类名称[冗余]",
    nameEN = "ven_class_name",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
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
    name = "venClassName",
    value = "供应商分类名称[冗余]",
    dataType = "",
    notes = "5b4dded59d2feff19b4527f9"
  )
  private String venClassName;

  @FieldMeta(
    name = "venClassCode",
    scene = "",
    nameCN = "供应商分类代码[冗余]",
    comment = "供应商分类代码[冗余]",
    nameEN = "ven_class_code",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = true,
    visible = false,
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
    name = "venClassCode",
    value = "供应商分类代码[冗余]",
    dataType = "",
    notes = "5b4dded59d2feff19b4527f7"
  )
  private String venClassCode;

  @FieldMeta(
    name = "balOrgOrgId",
    scene = "",
    nameCN = "结算机构ID ",
    comment = "结算机构ID ",
    nameEN = "bal_org_org_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = true,
    visible = false,
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
    name = "balOrgOrgId",
    value = "结算机构ID ",
    dataType = "",
    notes = "5b36f0ca9d2feff19b362129"
  )
  private Long balOrgOrgId;

  @FieldMeta(
    name = "balOrgOrgCode",
    scene = "",
    nameCN = "结算机构代码[冗余]",
    comment = "结算机构代码[冗余]",
    nameEN = "bal_org_org_code",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = true,
    visible = false,
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
    name = "balOrgOrgCode",
    value = "结算机构代码[冗余]",
    dataType = "",
    notes = "5b36f0ca9d2feff19b36212a"
  )
  private String balOrgOrgCode;

  @FieldMeta(
    name = "balOrgOrgName",
    scene = "",
    nameCN = "结算机构名称[冗余]",
    comment = "结算机构名称[冗余]",
    nameEN = "bal_org_org_name",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
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
    name = "balOrgOrgName",
    value = "结算机构名称[冗余]",
    dataType = "",
    notes = "5b36f0ca9d2feff19b36212d"
  )
  private String balOrgOrgName;

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
    required = true,
    visible = false,
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
    name = "entId",
    value = "企业ID",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c205"
  )
  private Long entId;

  @FieldMeta(
    name = "isEnabled",
    scene = "",
    nameCN = "状态 是否有效，0:有效 >0:无效",
    comment = "状态 是否有效，0:有效 >0:无效",
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
    name = "isEnabled",
    value = "状态 是否有效，0:有效 >0:无效",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d1"
  )
  private Integer isEnabled;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<PurOrgVenDTO, Long> id_ = o -> o.getId();
    public static Function<PurOrgVenDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<PurOrgVenDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<PurOrgVenDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<PurOrgVenDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<PurOrgVenDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<PurOrgVenDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<PurOrgVenDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<PurOrgVenDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<PurOrgVenDTO, String> modifierOrgCode_ = o -> o.getModifierOrgCode();

    public static Function<PurOrgVenDTO, Integer> version_ = o -> o.getVersion();

    public static Function<PurOrgVenDTO, String> venOrgCode_ = o -> o.getVenOrgCode();
    public static Function<PurOrgVenDTO, String> venOrgName_ = o -> o.getVenOrgName();
    public static Function<PurOrgVenDTO, Long> venOrgId_ = o -> o.getVenOrgId();
    public static Function<PurOrgVenDTO, Long> orgOrgId_ = o -> o.getOrgOrgId();
    public static Function<PurOrgVenDTO, String> orgOrgCode_ = o -> o.getOrgOrgCode();
    public static Function<PurOrgVenDTO, String> orgOrgName_ = o -> o.getOrgOrgName();
    public static Function<PurOrgVenDTO, Integer> isAllowOrder_ = o -> o.getIsAllowOrder();
    public static Function<PurOrgVenDTO, Integer> isAllowRec_ = o -> o.getIsAllowRec();
    public static Function<PurOrgVenDTO, Integer> isReturnable_ = o -> o.getIsReturnable();
    public static Function<PurOrgVenDTO, Integer> isPausePay_ = o -> o.getIsPausePay();
    public static Function<PurOrgVenDTO, Integer> isOrderCheck_ = o -> o.getIsOrderCheck();
    public static Function<PurOrgVenDTO, Integer> isRecCheck_ = o -> o.getIsRecCheck();
    public static Function<PurOrgVenDTO, Integer> isReturnCheck_ = o -> o.getIsReturnCheck();
    public static Function<PurOrgVenDTO, Integer> isInvCheck_ = o -> o.getIsInvCheck();
    public static Function<PurOrgVenDTO, Integer> settlementType_ = o -> o.getSettlementType();
    public static Function<PurOrgVenDTO, String> remark_ = o -> o.getRemark();
    public static Function<PurOrgVenDTO, Long> venClassId_ = o -> o.getVenClassId();
    public static Function<PurOrgVenDTO, String> venClassName_ = o -> o.getVenClassName();
    public static Function<PurOrgVenDTO, String> venClassCode_ = o -> o.getVenClassCode();
    public static Function<PurOrgVenDTO, Long> balOrgOrgId_ = o -> o.getBalOrgOrgId();
    public static Function<PurOrgVenDTO, String> balOrgOrgCode_ = o -> o.getBalOrgOrgCode();
    public static Function<PurOrgVenDTO, String> balOrgOrgName_ = o -> o.getBalOrgOrgName();
    public static Function<PurOrgVenDTO, Long> entId_ = o -> o.getEntId();
    public static Function<PurOrgVenDTO, Integer> isEnabled_ = o -> o.getIsEnabled();
  }

  public static ValidatorBuilder<PurOrgVenDTO> validatorExample() {
    ValidatorBuilder<PurOrgVenDTO> builder = new ValidatorBuilder<>();
    builder.field(venClassId_, notNull, "供应商分类ID[冗余]为空");
    builder.field(venClassName_, notNull, "供应商分类名称[冗余]为空");
    builder.field(venClassCode_, notNull, "供应商分类代码[冗余]为空");
    builder.field(balOrgOrgId_, notNull, "结算机构ID 为空");
    builder.field(balOrgOrgCode_, notNull, "结算机构代码[冗余]为空");
    builder.field(balOrgOrgName_, notNull, "结算机构名称[冗余]为空");
    builder.field(entId_, notNull, "企业ID为空");
    builder.field(isEnabled_, notNull, "状态 是否有效，0:有效 >0:无效为空");
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
