package com.pagoda.test.api.dto.group;

import com.pagoda.test.api.dto.*;
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

import static com.pagoda.test.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.test.api.dto.group.SalOrderControlDTO.Getters.*;

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
    notes = "5b505fae4772960001e54ab8"
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
    notes = "5b505fae4772960001e54aba"
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
    notes = "5b505fae4772960001e54abc"
  )
  private String cusOrgName;

  @FieldMeta(
    name = "isCtrlDep",
    scene = "",
    nameCN = "存款订单控制. {1:是 0:否}",
    comment = "存款订单控制. {1:是 0:否}",
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
    value = "存款订单控制. {1:是 0:否}",
    dataType = "",
    notes = "5b505fae4772960001e54abe"
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
    notes = "5b505fae4772960001e54ac0"
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
    notes = "5b505fae4772960001e54ac2"
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
    notes = "5b505fae4772960001e54ac4"
  )
  private Integer allowPosGapM;

  @FieldMeta(
    name = "isCtrlDepInput",
    scene = "",
    nameCN = "控制营业款录入 当天是否有录入营业款记录，必填，选择：1:是、2:否",
    comment = "控制营业款录入 当天是否有录入营业款记录，必填，选择：1:是、2:否",
    nameEN = "is_ctrl_dep_input",
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
    name = "isCtrlDepInput",
    value = "控制营业款录入 当天是否有录入营业款记录，必填，选择：1:是、2:否",
    dataType = "",
    notes = "5b505fae4772960001e54ac6"
  )
  private Integer isCtrlDepInput;

  @FieldMeta(
    name = "isCtrlAccnt",
    scene = "",
    nameCN = "控制零售出库未记账单， 是否有未记账的零售出库单，必填，选择：是、否{0:否,1:是}",
    comment = "控制零售出库未记账单， 是否有未记账的零售出库单，必填，选择：是、否{0:否,1:是}",
    nameEN = "is_ctrl_accnt",
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
    name = "isCtrlAccnt",
    value = "控制零售出库未记账单， 是否有未记账的零售出库单，必填，选择：是、否{0:否,1:是}",
    dataType = "",
    notes = "5b505fae4772960001e54ac8"
  )
  private Integer isCtrlAccnt;

  @FieldMeta(
    name = "isCtrlDuty",
    scene = "",
    nameCN = "控制考勤，是否启用控制门店没有考勤不让下单{0:否,1:是}",
    comment = "控制考勤，是否启用控制门店没有考勤不让下单{0:否,1:是}",
    nameEN = "is_ctrl_duty",
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
    name = "isCtrlDuty",
    value = "控制考勤，是否启用控制门店没有考勤不让下单{0:否,1:是}",
    dataType = "",
    notes = "5b505fae4772960001e54aca"
  )
  private Integer isCtrlDuty;

  @FieldMeta(
    name = "isCtrlVrfyTrans",
    scene = "",
    nameCN = "控制调拨单审核 是否启用控制门店调拔单未审核不让下单{0:否,1:是}",
    comment = "控制调拨单审核 是否启用控制门店调拔单未审核不让下单{0:否,1:是}",
    nameEN = "is_ctrl_vrfy_trans",
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
    name = "isCtrlVrfyTrans",
    value = "控制调拨单审核 是否启用控制门店调拔单未审核不让下单{0:否,1:是}",
    dataType = "",
    notes = "5b505fae4772960001e54acc"
  )
  private Integer isCtrlVrfyTrans;

  @FieldMeta(
    name = "isCtrlDistCyc",
    scene = "",
    nameCN = "控制发货周期， 是，周期发货商品下单时执行周期发货规则，即发货时间为非0的商品，否，周期发货商品可在订单直接录入，必填，选择：是、否",
    comment = "控制发货周期， 是，周期发货商品下单时执行周期发货规则，即发货时间为非0的商品，否，周期发货商品可在订单直接录入，必填，选择：是、否",
    nameEN = "is_ctrl_dist_cyc",
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
    name = "isCtrlDistCyc",
    value = "控制发货周期， 是，周期发货商品下单时执行周期发货规则，即发货时间为非0的商品，否，周期发货商品可在订单直接录入，必填，选择：是、否",
    dataType = "",
    notes = "5b505fae4772960001e54ace"
  )
  private Integer isCtrlDistCyc;

  @FieldMeta(
    name = "isCtrlMustSell",
    scene = "",
    nameCN = "控制果品必上，下单时校验必上果品是否达到安全库存，没有自动追加，必填，选择：是、否{0:否,1:是}",
    comment = "控制果品必上，下单时校验必上果品是否达到安全库存，没有自动追加，必填，选择：是、否{0:否,1:是}",
    nameEN = "is_ctrl_must_sell",
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
    name = "isCtrlMustSell",
    value = "控制果品必上，下单时校验必上果品是否达到安全库存，没有自动追加，必填，选择：是、否{0:否,1:是}",
    dataType = "",
    notes = "5b505fae4772960001e54ad0"
  )
  private Integer isCtrlMustSell;

  @FieldMeta(
    name = "isCtrlRouteSplit",
    scene = "",
    nameCN = "参与路线拆分，备用字段，必填，选择：是、否",
    comment = "参与路线拆分，备用字段，必填，选择：是、否",
    nameEN = "is_ctrl_route_split",
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
    name = "isCtrlRouteSplit",
    value = "参与路线拆分，备用字段，必填，选择：是、否",
    dataType = "",
    notes = "5b505fae4772960001e54ad2"
  )
  private Integer isCtrlRouteSplit;

  @FieldMeta(
    name = "isCtrlSafetyStock",
    scene = "",
    nameCN = "控制安全库存金额，订货金额不允许大于近三天平均销售金额N（N取安全库存销售倍数）倍，必填，选择：是、否",
    comment = "控制安全库存金额，订货金额不允许大于近三天平均销售金额N（N取安全库存销售倍数）倍，必填，选择：是、否",
    nameEN = "is_ctrl_safety_stock",
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
    name = "isCtrlSafetyStock",
    value = "控制安全库存金额，订货金额不允许大于近三天平均销售金额N（N取安全库存销售倍数）倍，必填，选择：是、否",
    dataType = "",
    notes = "5b505fae4772960001e54ad4"
  )
  private Integer isCtrlSafetyStock;

  @FieldMeta(
    name = "allowSafetyStockTimes",
    scene = "",
    nameCN = "安全库存金额销售倍数 数值，默认1.5，控制安全库存为是，必填，否，非必填",
    comment = "安全库存金额销售倍数 数值，默认1.5，控制安全库存为是，必填，否，非必填",
    nameEN = "allow_safety_stock_times",
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
    name = "allowSafetyStockTimes",
    value = "安全库存金额销售倍数 数值，默认1.5，控制安全库存为是，必填，否，非必填",
    dataType = "",
    notes = "5b505fae4772960001e54ad6"
  )
  private java.math.BigDecimal allowSafetyStockTimes;

  @FieldMeta(
    name = "isCtrlExeBatchPolicy",
    scene = "",
    nameCN = "执行批量政策，下单时校验商品是否符合机构商品信息批量政策，必填，选择：是、否",
    comment = "执行批量政策，下单时校验商品是否符合机构商品信息批量政策，必填，选择：是、否",
    nameEN = "is_ctrl_exe_batch_policy",
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
    name = "isCtrlExeBatchPolicy",
    value = "执行批量政策，下单时校验商品是否符合机构商品信息批量政策，必填，选择：是、否",
    dataType = "",
    notes = "5b505fae4772960001e54ad8"
  )
  private Integer isCtrlExeBatchPolicy;

  @FieldMeta(
    name = "isCtrlOneOrder",
    scene = "",
    nameCN = "控制每天仅下一单，必需下拉选择是否，是，仅可下一个订单，否，随意",
    comment = "控制每天仅下一单，必需下拉选择是否，是，仅可下一个订单，否，随意",
    nameEN = "is_ctrl_one_order",
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
    name = "isCtrlOneOrder",
    value = "控制每天仅下一单，必需下拉选择是否，是，仅可下一个订单，否，随意",
    dataType = "",
    notes = "5b505fae4772960001e54ada"
  )
  private Integer isCtrlOneOrder;

  @FieldMeta(
    name = "placeOrderTime1",
    scene = "",
    nameCN = "允许下单的时段起始点",
    comment = "允许下单的时段起始点",
    nameEN = "place_order_time1",
    type = "时分秒",
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
    name = "placeOrderTime1",
    value = "允许下单的时段起始点",
    dataType = "",
    notes = "5b505fae4772960001e54adc"
  )
  private java.sql.Time placeOrderTime1;

  @FieldMeta(
    name = "placeOrderTime2",
    scene = "",
    nameCN = "允许下单的时段结束点",
    comment = "允许下单的时段结束点",
    nameEN = "place_order_time2",
    type = "时分秒",
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
    name = "placeOrderTime2",
    value = "允许下单的时段结束点",
    dataType = "",
    notes = "5b505fae4772960001e54ade"
  )
  private java.sql.Time placeOrderTime2;

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
    notes = "5b505fae4772960001e54ae0"
  )
  private Integer isCtrlReturn;

  @FieldMeta(
    name = "returnGoodsTime1",
    scene = "",
    nameCN = "可退货开始时间,如'13:00'",
    comment = "可退货开始时间,如'13:00'",
    nameEN = "return_goods_time1",
    type = "时分秒",
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
    name = "returnGoodsTime1",
    value = "可退货开始时间,如'13:00'",
    dataType = "",
    notes = "5b505fae4772960001e54ae2"
  )
  private java.sql.Time returnGoodsTime1;

  @FieldMeta(
    name = "returnGoodsTime2",
    scene = "",
    nameCN = "可退货结束时间,如'21:00'",
    comment = "可退货结束时间,如'21:00'",
    nameEN = "return_goods_time2",
    type = "时分秒",
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
    name = "returnGoodsTime2",
    value = "可退货结束时间,如'21:00'",
    dataType = "",
    notes = "5b505fae4772960001e54ae4"
  )
  private java.sql.Time returnGoodsTime2;

  @FieldMeta(
    name = "enabled",
    scene = "",
    nameCN = "是否可用{0不可用，1 可用}",
    comment = "是否可用{0不可用，1 可用}",
    nameEN = "enabled",
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
    name = "enabled",
    value = "是否可用{0不可用，1 可用}",
    dataType = "",
    notes = "5b505faf4772960001e54ae6"
  )
  private Integer enabled;

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
    notes = "5b4d4de377604a0001694a2d"
  )
  private String remark;

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
    public static Function<SalOrderControlDTO, Integer> isCtrlDepInput_ =
        o -> o.getIsCtrlDepInput();
    public static Function<SalOrderControlDTO, Integer> isCtrlAccnt_ = o -> o.getIsCtrlAccnt();
    public static Function<SalOrderControlDTO, Integer> isCtrlDuty_ = o -> o.getIsCtrlDuty();
    public static Function<SalOrderControlDTO, Integer> isCtrlVrfyTrans_ =
        o -> o.getIsCtrlVrfyTrans();
    public static Function<SalOrderControlDTO, Integer> isCtrlDistCyc_ = o -> o.getIsCtrlDistCyc();
    public static Function<SalOrderControlDTO, Integer> isCtrlMustSell_ =
        o -> o.getIsCtrlMustSell();
    public static Function<SalOrderControlDTO, Integer> isCtrlRouteSplit_ =
        o -> o.getIsCtrlRouteSplit();
    public static Function<SalOrderControlDTO, Integer> isCtrlSafetyStock_ =
        o -> o.getIsCtrlSafetyStock();
    public static Function<SalOrderControlDTO, java.math.BigDecimal> allowSafetyStockTimes_ =
        o -> o.getAllowSafetyStockTimes();
    public static Function<SalOrderControlDTO, Integer> isCtrlExeBatchPolicy_ =
        o -> o.getIsCtrlExeBatchPolicy();
    public static Function<SalOrderControlDTO, Integer> isCtrlOneOrder_ =
        o -> o.getIsCtrlOneOrder();
    public static Function<SalOrderControlDTO, java.sql.Time> placeOrderTime1_ =
        o -> o.getPlaceOrderTime1();
    public static Function<SalOrderControlDTO, java.sql.Time> placeOrderTime2_ =
        o -> o.getPlaceOrderTime2();
    public static Function<SalOrderControlDTO, Integer> isCtrlReturn_ = o -> o.getIsCtrlReturn();
    public static Function<SalOrderControlDTO, java.sql.Time> returnGoodsTime1_ =
        o -> o.getReturnGoodsTime1();
    public static Function<SalOrderControlDTO, java.sql.Time> returnGoodsTime2_ =
        o -> o.getReturnGoodsTime2();
    public static Function<SalOrderControlDTO, Integer> enabled_ = o -> o.getEnabled();
    public static Function<SalOrderControlDTO, String> remark_ = o -> o.getRemark();
  }

  public static ValidatorBuilder<SalOrderControlDTO> validatorExample() {
    ValidatorBuilder<SalOrderControlDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
