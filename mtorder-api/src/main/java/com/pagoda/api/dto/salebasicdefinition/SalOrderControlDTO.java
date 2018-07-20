package com.pagoda.api.dto.salebasicdefinition;

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
import static com.pagoda.api.dto.salebasicdefinition.SalOrderControlDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalOrderControl")
@ApiModel(value = "SalOrderControlDTO", description = "按客户维度进行配送订单、退货、货款等方面的控制")
@EntityFeature(
  entityName = "SalOrderControlDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = true
)
public class SalOrderControlDTO extends AbstractDTO implements Serializable {

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
    name = "isCtrlDep",
    scene = "",
    nameCN = "存款订单控制. {1:是  0:否}",
    comment = "存款订单控制. {1:是  0:否}",
    nameEN = "is_ctrl_dep",
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
    name = "isCtrlDep",
    value = "存款订单控制. {1:是  0:否}",
    dataType = "",
    notes = "5b5051779d2feff19b3c85fa"
  )
  private Integer isCtrlDep;

  @FieldMeta(
    name = "beforeDays",
    scene = "",
    nameCN = "存款减控制天数.取当前往前推N天的营业款差额，存款订单控制是必填。否非必填，数值",
    comment = "存款减控制天数.取当前往前推N天的营业款差额，存款订单控制是必填。否非必填，数值",
    nameEN = "before_days",
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
    name = "beforeDays",
    value = "存款减控制天数.取当前往前推N天的营业款差额，存款订单控制是必填。否非必填，数值",
    dataType = "",
    notes = "5b5051779d2feff19b3c8606"
  )
  private Integer beforeDays;

  @FieldMeta(
    name = "allowPosGapD",
    scene = "",
    nameCN = "存款允许差额.根据存款减天数取门店营业款差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    comment = "存款允许差额.根据存款减天数取门店营业款差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    nameEN = "allow_pos_gap_d",
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
    name = "allowPosGapD",
    value = "存款允许差额.根据存款减天数取门店营业款差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    dataType = "",
    notes = "5b5051779d2feff19b3c863e"
  )
  private Integer allowPosGapD;

  @FieldMeta(
    name = "allowPosGapM",
    scene = "",
    nameCN = "月累计允许差额.根据存款减天数取门店营业款累计月差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    comment = "月累计允许差额.根据存款减天数取门店营业款累计月差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    nameEN = "allow_pos_gap_m",
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
    name = "allowPosGapM",
    value = "月累计允许差额.根据存款减天数取门店营业款累计月差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    dataType = "",
    notes = "5b5051779d2feff19b3c863b"
  )
  private Integer allowPosGapM;

  @FieldMeta(
    name = "isDepInput",
    scene = "",
    nameCN = "控制营业款录入  当天是否有录入营业款记录，必填，选择：1:是、2:否",
    comment = "控制营业款录入  当天是否有录入营业款记录，必填，选择：1:是、2:否",
    nameEN = "is_dep_input",
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
    name = "isDepInput",
    value = "控制营业款录入  当天是否有录入营业款记录，必填，选择：1:是、2:否",
    dataType = "",
    notes = "5b5051779d2feff19b3c8647"
  )
  private Integer isDepInput;

  @FieldMeta(
    name = "isAccnt",
    scene = "",
    nameCN = "控制零售出库未记账单， 是否有未记账的零售出库单，必填，选择：是、否{0:否,1:是}",
    comment = "控制零售出库未记账单， 是否有未记账的零售出库单，必填，选择：是、否{0:否,1:是}",
    nameEN = "is_accnt",
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
    name = "isAccnt",
    value = "控制零售出库未记账单， 是否有未记账的零售出库单，必填，选择：是、否{0:否,1:是}",
    dataType = "",
    notes = "5b5051779d2feff19b3c864c"
  )
  private Integer isAccnt;

  @FieldMeta(
    name = "isDuty",
    scene = "",
    nameCN = "控制考勤，是否启用控制门店没有考勤不让下单{0:否,1:是}",
    comment = "控制考勤，是否启用控制门店没有考勤不让下单{0:否,1:是}",
    nameEN = "is_duty",
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
    name = "isDuty",
    value = "控制考勤，是否启用控制门店没有考勤不让下单{0:否,1:是}",
    dataType = "",
    notes = "5b5051779d2feff19b3c864a"
  )
  private Integer isDuty;

  @FieldMeta(
    name = "isVrfyTrans",
    scene = "",
    nameCN = "控制调拨单审核 是否启用控制门店调拔单未审核不让下单{0:否,1:是}",
    comment = "控制调拨单审核 是否启用控制门店调拔单未审核不让下单{0:否,1:是}",
    nameEN = "is_vrfy_trans",
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
    name = "isVrfyTrans",
    value = "控制调拨单审核 是否启用控制门店调拔单未审核不让下单{0:否,1:是}",
    dataType = "",
    notes = "5b5051779d2feff19b3c866a"
  )
  private Integer isVrfyTrans;

  @FieldMeta(
    name = "isDistCyc",
    scene = "",
    nameCN = "控制发货周期， 是，周期发货商品下单时执行周期发货规则，即发货时间为非0的商品，否，周期发货商品可在订单直接录入，必填，选择：是、否",
    comment = "控制发货周期， 是，周期发货商品下单时执行周期发货规则，即发货时间为非0的商品，否，周期发货商品可在订单直接录入，必填，选择：是、否",
    nameEN = "is_dist_cyc",
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
    name = "isDistCyc",
    value = "控制发货周期， 是，周期发货商品下单时执行周期发货规则，即发货时间为非0的商品，否，周期发货商品可在订单直接录入，必填，选择：是、否",
    dataType = "",
    notes = "5b5051779d2feff19b3c86ac"
  )
  private Integer isDistCyc;

  @FieldMeta(
    name = "isMustSell",
    scene = "",
    nameCN = "控制果品必上，下单时校验必上果品是否达到安全库存，没有自动追加，必填，选择：是、否{0:否,1:是}",
    comment = "控制果品必上，下单时校验必上果品是否达到安全库存，没有自动追加，必填，选择：是、否{0:否,1:是}",
    nameEN = "is_must_sell",
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
    name = "isMustSell",
    value = "控制果品必上，下单时校验必上果品是否达到安全库存，没有自动追加，必填，选择：是、否{0:否,1:是}",
    dataType = "",
    notes = "5b5051779d2feff19b3c86bb"
  )
  private Integer isMustSell;

  @FieldMeta(
    name = "isRouteSplit",
    scene = "",
    nameCN = "参与路线拆分，备用字段，必填，选择：是、否",
    comment = "参与路线拆分，备用字段，必填，选择：是、否",
    nameEN = "is_route_split",
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
    name = "isRouteSplit",
    value = "参与路线拆分，备用字段，必填，选择：是、否",
    dataType = "",
    notes = "5b5051779d2feff19b3c86be"
  )
  private Integer isRouteSplit;

  @FieldMeta(
    name = "isSafetyStock",
    scene = "",
    nameCN = "控制安全库存金额，订货金额不允许大于近三天平均销售金额N（N取安全库存销售倍数）倍，必填，选择：是、否",
    comment = "控制安全库存金额，订货金额不允许大于近三天平均销售金额N（N取安全库存销售倍数）倍，必填，选择：是、否",
    nameEN = "is_safety_stock",
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
    name = "isSafetyStock",
    value = "控制安全库存金额，订货金额不允许大于近三天平均销售金额N（N取安全库存销售倍数）倍，必填，选择：是、否",
    dataType = "",
    notes = "5b5051779d2feff19b3c86ba"
  )
  private Integer isSafetyStock;

  @FieldMeta(
    name = "safetyStockMultiple",
    scene = "",
    nameCN = "安全库存金额销售倍数 数值，默认1.5，控制安全库存为是，必填，否，非必填",
    comment = "安全库存金额销售倍数 数值，默认1.5，控制安全库存为是，必填，否，非必填",
    nameEN = "safety_stock_multiple",
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
    name = "safetyStockMultiple",
    value = "安全库存金额销售倍数 数值，默认1.5，控制安全库存为是，必填，否，非必填",
    dataType = "",
    notes = "5b5051779d2feff19b3c86d1"
  )
  private java.math.BigDecimal safetyStockMultiple;

  @FieldMeta(
    name = "isExeBatchPolicy",
    scene = "",
    nameCN = "执行批量政策，下单时校验商品是否符合机构商品信息批量政策，必填，选择：是、否",
    comment = "执行批量政策，下单时校验商品是否符合机构商品信息批量政策，必填，选择：是、否",
    nameEN = "is_exe_batch_policy",
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
    name = "isExeBatchPolicy",
    value = "执行批量政策，下单时校验商品是否符合机构商品信息批量政策，必填，选择：是、否",
    dataType = "",
    notes = "5b5051779d2feff19b3c86e5"
  )
  private Integer isExeBatchPolicy;

  @FieldMeta(
    name = "isOneOrder",
    scene = "",
    nameCN = "控制每天仅下一单，必需下拉选择是否，是，仅可下一个订单，否，随意",
    comment = "控制每天仅下一单，必需下拉选择是否，是，仅可下一个订单，否，随意",
    nameEN = "is_one_order",
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
    name = "isOneOrder",
    value = "控制每天仅下一单，必需下拉选择是否，是，仅可下一个订单，否，随意",
    dataType = "",
    notes = "5b5051779d2feff19b3c86dd"
  )
  private Integer isOneOrder;

  @FieldMeta(
    name = "beginOrderTime",
    scene = "",
    nameCN = "允许下单的时段起始点",
    comment = "允许下单的时段起始点",
    nameEN = "begin_order_time",
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
    name = "beginOrderTime",
    value = "允许下单的时段起始点",
    dataType = "",
    notes = "5b5051779d2feff19b3c86f1"
  )
  private java.util.Date beginOrderTime;

  @FieldMeta(
    name = "endOrderTime",
    scene = "",
    nameCN = "允许下单的时段结束点",
    comment = "允许下单的时段结束点",
    nameEN = "end_order_time",
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
    name = "endOrderTime",
    value = "允许下单的时段结束点",
    dataType = "",
    notes = "5b5051779d2feff19b3c86ef"
  )
  private java.util.Date endOrderTime;

  @FieldMeta(
    name = "isCtrlReturn",
    scene = "",
    nameCN = "是否启用控制退货",
    comment = "是否启用控制退货",
    nameEN = "is_ctrl_return",
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
    name = "isCtrlReturn",
    value = "是否启用控制退货",
    dataType = "",
    notes = "5b5051779d2feff19b3c86ed"
  )
  private Integer isCtrlReturn;

  @FieldMeta(
    name = "beginReturnTime",
    scene = "",
    nameCN = "可退货开始时间,如'13:00'",
    comment = "可退货开始时间,如'13:00'",
    nameEN = "begin_return_time",
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
    name = "beginReturnTime",
    value = "可退货开始时间,如'13:00'",
    dataType = "",
    notes = "5b5051779d2feff19b3c86f8"
  )
  private java.util.Date beginReturnTime;

  @FieldMeta(
    name = "endReturnTime",
    scene = "",
    nameCN = "可退货结束时间,如'21:00'",
    comment = "可退货结束时间,如'21:00'",
    nameEN = "end_return_time",
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
    name = "endReturnTime",
    value = "可退货结束时间,如'21:00'",
    dataType = "",
    notes = "5b5051779d2feff19b3c86fd"
  )
  private java.util.Date endReturnTime;

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
    name = "isEnabled",
    value = "状态 是否有效，0:有效 >0:无效",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d1"
  )
  private Integer isEnabled;

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

  /** DTO字段的getter */
  public static class Getters {
    public static Function<SalOrderControlDTO, Long> id_ = o -> o.getId();
    public static Function<SalOrderControlDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<SalOrderControlDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<SalOrderControlDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<SalOrderControlDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<SalOrderControlDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<SalOrderControlDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<SalOrderControlDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<SalOrderControlDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<SalOrderControlDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<SalOrderControlDTO, Integer> version_ = o -> o.getVersion();

    public static Function<SalOrderControlDTO, Long> cusOrgId_ = o -> o.getCusOrgId();
    public static Function<SalOrderControlDTO, String> cusOrgCode_ = o -> o.getCusOrgCode();
    public static Function<SalOrderControlDTO, String> cusOrgName_ = o -> o.getCusOrgName();
    public static Function<SalOrderControlDTO, Integer> isCtrlDep_ = o -> o.getIsCtrlDep();
    public static Function<SalOrderControlDTO, Integer> beforeDays_ = o -> o.getBeforeDays();
    public static Function<SalOrderControlDTO, Integer> allowPosGapD_ = o -> o.getAllowPosGapD();
    public static Function<SalOrderControlDTO, Integer> allowPosGapM_ = o -> o.getAllowPosGapM();
    public static Function<SalOrderControlDTO, Integer> isDepInput_ = o -> o.getIsDepInput();
    public static Function<SalOrderControlDTO, Integer> isAccnt_ = o -> o.getIsAccnt();
    public static Function<SalOrderControlDTO, Integer> isDuty_ = o -> o.getIsDuty();
    public static Function<SalOrderControlDTO, Integer> isVrfyTrans_ = o -> o.getIsVrfyTrans();
    public static Function<SalOrderControlDTO, Integer> isDistCyc_ = o -> o.getIsDistCyc();
    public static Function<SalOrderControlDTO, Integer> isMustSell_ = o -> o.getIsMustSell();
    public static Function<SalOrderControlDTO, Integer> isRouteSplit_ = o -> o.getIsRouteSplit();
    public static Function<SalOrderControlDTO, Integer> isSafetyStock_ = o -> o.getIsSafetyStock();
    public static Function<SalOrderControlDTO, java.math.BigDecimal> safetyStockMultiple_ =
        o -> o.getSafetyStockMultiple();
    public static Function<SalOrderControlDTO, Integer> isExeBatchPolicy_ =
        o -> o.getIsExeBatchPolicy();
    public static Function<SalOrderControlDTO, Integer> isOneOrder_ = o -> o.getIsOneOrder();
    public static Function<SalOrderControlDTO, java.util.Date> beginOrderTime_ =
        o -> o.getBeginOrderTime();
    public static Function<SalOrderControlDTO, java.util.Date> endOrderTime_ =
        o -> o.getEndOrderTime();
    public static Function<SalOrderControlDTO, Integer> isCtrlReturn_ = o -> o.getIsCtrlReturn();
    public static Function<SalOrderControlDTO, java.util.Date> beginReturnTime_ =
        o -> o.getBeginReturnTime();
    public static Function<SalOrderControlDTO, java.util.Date> endReturnTime_ =
        o -> o.getEndReturnTime();
    public static Function<SalOrderControlDTO, Integer> isEnabled_ = o -> o.getIsEnabled();
    public static Function<SalOrderControlDTO, String> remark_ = o -> o.getRemark();
    public static Function<SalOrderControlDTO, Long> entId_ = o -> o.getEntId();
  }

  public static ValidatorBuilder<SalOrderControlDTO> validatorExample() {
    ValidatorBuilder<SalOrderControlDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
