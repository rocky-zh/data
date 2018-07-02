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
    name = "entryDate",
    scene = "",
    nameCN = "录入完成日期",
    comment = "录入完成日期",
    nameEN = "entry_date",
    type = "时间",
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
    name = "entryDate",
    value = "录入完成日期",
    dataType = "",
    notes = "5b35d2b49d2feff19b40cb46"
  )
  private java.sql.Timestamp entryDate;

  @FieldMeta(
    name = "totalAmt",
    scene = "",
    nameCN = "总金额[配送价*数量]",
    comment = "总金额[配送价*数量]",
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
    value = "总金额[配送价*数量]",
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

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<SalPreOrderHeadDTO, Long> _id = o -> o.getId();
    public static final Function<SalPreOrderHeadDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<SalPreOrderHeadDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<SalPreOrderHeadDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<SalPreOrderHeadDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<SalPreOrderHeadDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<SalPreOrderHeadDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<SalPreOrderHeadDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<SalPreOrderHeadDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<SalPreOrderHeadDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<SalPreOrderHeadDTO, Integer> _version = o -> o.getVersion();

    public static final Function<SalPreOrderHeadDTO, Integer> _preOrderType =
        o -> o.getPreOrderType();
    public static final Function<SalPreOrderHeadDTO, Integer> _preOrderStatus =
        o -> o.getPreOrderStatus();
    public static final Function<SalPreOrderHeadDTO, Long> _entId = o -> o.getEntId();
    public static final Function<SalPreOrderHeadDTO, String> _seqno = o -> o.getSeqno();
    public static final Function<SalPreOrderHeadDTO, Long> _conOrgId = o -> o.getConOrgId();
    public static final Function<SalPreOrderHeadDTO, String> _conOrgCode = o -> o.getConOrgCode();
    public static final Function<SalPreOrderHeadDTO, String> _conOrgName = o -> o.getConOrgName();
    public static final Function<SalPreOrderHeadDTO, Long> _cusOrgId = o -> o.getCusOrgId();
    public static final Function<SalPreOrderHeadDTO, String> _cusOrgCode = o -> o.getCusOrgCode();
    public static final Function<SalPreOrderHeadDTO, String> _cusOrgName = o -> o.getCusOrgName();
    public static final Function<SalPreOrderHeadDTO, String> _remark = o -> o.getRemark();
    public static final Function<SalPreOrderHeadDTO, java.sql.Timestamp> _entryDate =
        o -> o.getEntryDate();
    public static final Function<SalPreOrderHeadDTO, java.math.BigDecimal> _totalAmt =
        o -> o.getTotalAmt();
    public static final Function<SalPreOrderHeadDTO, java.math.BigDecimal> _totalRequestQty =
        o -> o.getTotalRequestQty();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    builder.field(_entryDate, notNull, "录入完成日期为空");
    builder.field(_totalAmt, notNull, "总金额[配送价*数量]为空");
    builder.field(_totalRequestQty, notNull, "总需求量为空");
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
