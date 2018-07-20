package com.pagoda.api.dto.salorderhead;

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
import static com.pagoda.api.dto.salorderhead.SalPreOrderHeadDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalPreOrderHead")
@ApiModel(value = "SalPreOrderHeadDTO", description = "销售预订单")
@EntityFeature(
  entityName = "SalPreOrderHeadDTO",
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
public class SalPreOrderHeadDTO extends AbstractDTO implements Serializable {

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
    name = "preOrderType",
    scene = "",
    nameCN = "预订单类型{1:分货果品,2:周期发货商品,3:一般}",
    comment = "预订单类型{1:分货果品,2:周期发货商品,3:一般}",
    nameEN = "pre_order_type",
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
    name = "preOrderType",
    value = "预订单类型{1:分货果品,2:周期发货商品,3:一般}",
    dataType = "",
    notes = "5b35dc919d2feff19b425e82"
  )
  private Integer preOrderType;

  @FieldMeta(
    name = "preOrderStatus",
    scene = "",
    nameCN = "预订单状态{10:新录入,20:录入完成,30:已审核,40:已追加}",
    comment = "预订单状态{10:新录入,20:录入完成,30:已审核,40:已追加}",
    nameEN = "pre_order_status",
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
    name = "preOrderStatus",
    value = "预订单状态{10:新录入,20:录入完成,30:已审核,40:已追加}",
    dataType = "",
    notes = "5b35dc919d2feff19b425e83"
  )
  private Integer preOrderStatus;

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
    name = "totalAmt",
    scene = "",
    nameCN = "总金额[=round(数量*price,2)]",
    comment = "总金额[=round(数量*price,2)]",
    nameEN = "total_amt",
    type = "小数",
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
    name = "totalAmt",
    value = "总金额[=round(数量*price,2)]",
    dataType = "",
    notes = "5b35d2b49d2feff19b40cb44"
  )
  private java.math.BigDecimal totalAmt;

  @FieldMeta(
    name = "totalRequestQty",
    scene = "",
    nameCN = "总需求量",
    comment = "总需求量",
    nameEN = "total_request_qty",
    type = "小数",
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
    name = "totalRequestQty",
    value = "总需求量",
    dataType = "",
    notes = "5b35dbc79d2feff19b4223a5"
  )
  private java.math.BigDecimal totalRequestQty;

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
    name = "orgOrgName",
    value = "机构名称[冗余]",
    dataType = "",
    notes = "5b35de739d2feff19b42fe5e"
  )
  private String orgOrgName;

  @FieldMeta(
    name = "commitTime",
    scene = "price",
    nameCN = "提交时间(对应录入完成状态时间)",
    comment = "提交时间(对应录入完成状态时间)",
    nameEN = "commit_time",
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
    name = "commitTime",
    value = "提交时间(对应录入完成状态时间)",
    dataType = "",
    notes = "5b3d769f9d2feff19bd2c2ce"
  )
  private java.util.Date commitTime;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<SalPreOrderHeadDTO, Long> id_ = o -> o.getId();
    public static Function<SalPreOrderHeadDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<SalPreOrderHeadDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<SalPreOrderHeadDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<SalPreOrderHeadDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<SalPreOrderHeadDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<SalPreOrderHeadDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<SalPreOrderHeadDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<SalPreOrderHeadDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<SalPreOrderHeadDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<SalPreOrderHeadDTO, Integer> version_ = o -> o.getVersion();

    public static Function<SalPreOrderHeadDTO, Integer> preOrderType_ = o -> o.getPreOrderType();
    public static Function<SalPreOrderHeadDTO, Integer> preOrderStatus_ =
        o -> o.getPreOrderStatus();
    public static Function<SalPreOrderHeadDTO, Long> entId_ = o -> o.getEntId();
    public static Function<SalPreOrderHeadDTO, String> seqno_ = o -> o.getSeqno();
    public static Function<SalPreOrderHeadDTO, Long> cusOrgId_ = o -> o.getCusOrgId();
    public static Function<SalPreOrderHeadDTO, String> cusOrgCode_ = o -> o.getCusOrgCode();
    public static Function<SalPreOrderHeadDTO, String> cusOrgName_ = o -> o.getCusOrgName();
    public static Function<SalPreOrderHeadDTO, String> remark_ = o -> o.getRemark();
    public static Function<SalPreOrderHeadDTO, java.math.BigDecimal> totalAmt_ =
        o -> o.getTotalAmt();
    public static Function<SalPreOrderHeadDTO, java.math.BigDecimal> totalRequestQty_ =
        o -> o.getTotalRequestQty();
    public static Function<SalPreOrderHeadDTO, Long> orgOrgId_ = o -> o.getOrgOrgId();
    public static Function<SalPreOrderHeadDTO, String> orgOrgCode_ = o -> o.getOrgOrgCode();
    public static Function<SalPreOrderHeadDTO, String> orgOrgName_ = o -> o.getOrgOrgName();
    public static Function<SalPreOrderHeadDTO, java.util.Date> commitTime_ = o -> o.getCommitTime();
  }

  public static ValidatorBuilder<SalPreOrderHeadDTO> validatorExample() {
    ValidatorBuilder<SalPreOrderHeadDTO> builder = new ValidatorBuilder<>();
    builder.field(totalAmt_, notNull, "总金额[=round(数量*price,2)]为空");
    builder.field(totalRequestQty_, notNull, "总需求量为空");
    builder.field(orgOrgId_, notNull, "机构ID为空");
    builder.field(orgOrgCode_, notNull, "机构代码[冗余]为空");
    builder.field(orgOrgName_, notNull, "机构名称[冗余]为空");
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
