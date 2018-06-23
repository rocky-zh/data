package com.pagoda.api.dto.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.*;
import io.swagger.annotations.*;
import org.springframework.data.domain.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.PurApplyDetail")
@ApiModel(value = "PurApplyDetailDTO", description = "pur_apply_detail")
@EntityFeature(
  entityName = "PurApplyDetailDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class PurApplyDetailDTO implements Serializable {

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
    name = "applyId",
    scene = "",
    nameCN = "请购单头表ID",
    comment = "请购单头表ID",
    nameEN = "apply_id",
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
    name = "applyId",
    value = "请购单头表ID",
    dataType = "长整型",
    notes = "5b2dc08e7c51e0fcf5a05e5a"
  )
  private Long applyId;

  @FieldMeta(
    name = "applyPrice",
    scene = "",
    nameCN = "需求金额",
    comment = "需求金额",
    nameEN = "apply_price",
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
    name = "applyPrice",
    value = "需求金额",
    dataType = "小数",
    notes = "5b2dc08e7c51e0fcf5a05e58"
  )
  private java.math.BigDecimal applyPrice;

  @FieldMeta(
    name = "applyQty",
    scene = "",
    nameCN = "请购数量",
    comment = "请购数量",
    nameEN = "apply_qty",
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
    name = "applyQty",
    value = "请购数量",
    dataType = "整型",
    notes = "5b2dc08e7c51e0fcf5a05e54"
  )
  private Integer applyQty;

  @FieldMeta(
    name = "basUnitCode",
    scene = "",
    nameCN = "基础计量单位代码",
    comment = "基础计量单位代码",
    nameEN = "bas_unit_code",
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
    name = "basUnitCode",
    value = "基础计量单位代码",
    dataType = "字符串",
    notes = "5b2dc08e7c51e0fcf5a05e5e"
  )
  private String basUnitCode;

  @FieldMeta(
    name = "basUnitId",
    scene = "",
    nameCN = "基础计量单位ID",
    comment = "基础计量单位ID",
    nameEN = "bas_unit_id",
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
    name = "basUnitId",
    value = "基础计量单位ID",
    dataType = "长整型",
    notes = "5b2dc08e7c51e0fcf5a05e5c"
  )
  private Long basUnitId;

  @FieldMeta(
    name = "basUnitName",
    scene = "",
    nameCN = "标准单位",
    comment = "标准单位",
    nameEN = "bas_unit_name",
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
    name = "basUnitName",
    value = "标准单位",
    dataType = "字符串",
    notes = "5b2dc08e7c51e0fcf5a05e56"
  )
  private String basUnitName;

  @FieldMeta(
    name = "calCusOrderQty",
    scene = "",
    nameCN = "门店订货数量",
    comment = "门店订货数量",
    nameEN = "cal_cus_order_qty",
    type = "浮点数",
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
    name = "calCusOrderQty",
    value = "门店订货数量",
    dataType = "浮点数",
    notes = "5b2dc08e7c51e0fcf5a05e65"
  )
  private Double calCusOrderQty;

  @FieldMeta(
    name = "calCusSalQty",
    scene = "",
    nameCN = "门店昨日销量",
    comment = "门店昨日销量",
    nameEN = "cal_cus_sal_qty",
    type = "浮点数",
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
    name = "calCusSalQty",
    value = "门店昨日销量",
    dataType = "浮点数",
    notes = "5b2dc08e7c51e0fcf5a05e60"
  )
  private Double calCusSalQty;

  @FieldMeta(
    name = "calInvQty",
    scene = "",
    nameCN = "库存量",
    comment = "库存量",
    nameEN = "cal_inv_qty",
    type = "浮点数",
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
    name = "calInvQty",
    value = "库存量",
    dataType = "浮点数",
    notes = "5b2dc08e7c51e0fcf5a05e62"
  )
  private Double calInvQty;

  @FieldMeta(
    name = "calOnWayQty",
    scene = "",
    nameCN = " 在途量",
    comment = " 在途量",
    nameEN = "cal_on_way_qty",
    type = "浮点数",
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
    name = "calOnWayQty",
    value = " 在途量",
    dataType = "浮点数",
    notes = "5b2dc08e7c51e0fcf5a05e68"
  )
  private Double calOnWayQty;

  @FieldMeta(
    name = "calOuterFerQty",
    scene = "",
    nameCN = " 外区调拨数量[",
    comment = " 外区调拨数量[",
    nameEN = "cal_outer_fer_qty",
    type = "浮点数",
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
    name = "calOuterFerQty",
    value = " 外区调拨数量[",
    dataType = "浮点数",
    notes = "5b2dc08e7c51e0fcf5a05e6a"
  )
  private Double calOuterFerQty;

  @FieldMeta(
    name = "calPurRate",
    scene = "",
    nameCN = " 计算采购系数",
    comment = " 计算采购系数",
    nameEN = "cal_pur_rate",
    type = "浮点数",
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
    value = " 计算采购系数",
    dataType = "浮点数",
    notes = "5b2dc08e7c51e0fcf5a05e66"
  )
  private Double calPurRate;

  @FieldMeta(
    name = "calReplenishmentQty",
    scene = "",
    nameCN = " 补货量",
    comment = " 补货量",
    nameEN = "cal_replenishment_qty",
    type = "浮点数",
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
    name = "calReplenishmentQty",
    value = " 补货量",
    dataType = "浮点数",
    notes = "5b2dc08e7c51e0fcf5a05e6c"
  )
  private Double calReplenishmentQty;

  @FieldMeta(
    name = "calStockUpQty",
    scene = "",
    nameCN = " 备货量",
    comment = " 备货量",
    nameEN = "cal_stock_up_qty",
    type = "浮点数",
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
    name = "calStockUpQty",
    value = " 备货量",
    dataType = "浮点数",
    notes = "5b2dc08e7c51e0fcf5a05e6e"
  )
  private Double calStockUpQty;

  @FieldMeta(
    name = "confirmQty",
    scene = "",
    nameCN = "确认数量",
    comment = "确认数量",
    nameEN = "confirm_qty",
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
    name = "confirmQty",
    value = "确认数量",
    dataType = "整型",
    notes = "5b2dc08e7c51e0fcf5a05e73"
  )
  private Integer confirmQty;

  @FieldMeta(
    name = "dealPurQty",
    scene = "",
    nameCN = "转采购数量",
    comment = "转采购数量",
    nameEN = "deal_pur_qty",
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
    name = "dealPurQty",
    value = "转采购数量",
    dataType = "整型",
    notes = "5b2dc08e7c51e0fcf5a05e70"
  )
  private Integer dealPurQty;

  @FieldMeta(
    name = "dealSalOrgId",
    scene = "",
    nameCN = "转内部销售要货机构ID",
    comment = "转内部销售要货机构ID",
    nameEN = "deal_sal_org_id",
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
    name = "dealSalOrgId",
    value = "转内部销售要货机构ID",
    dataType = "字符串",
    notes = "5b2dc08e7c51e0fcf5a05e74"
  )
  private String dealSalOrgId;

  @FieldMeta(
    name = "dealSalQty",
    scene = "",
    nameCN = "转内部调拨销售数量",
    comment = "转内部调拨销售数量",
    nameEN = "deal_sal_qty",
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
    name = "dealSalQty",
    value = "转内部调拨销售数量",
    dataType = "整型",
    notes = "5b2dc08e7c51e0fcf5a05e76"
  )
  private Integer dealSalQty;

  @FieldMeta(
    name = "dealStatus",
    scene = "",
    nameCN = "处理状态",
    comment = "处理状态",
    nameEN = "deal_status",
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
    name = "dealStatus",
    value = "处理状态",
    dataType = "整型",
    notes = "5b2dc08e7c51e0fcf5a05e78"
  )
  private Integer dealStatus;

  @FieldMeta(
    name = "delId",
    scene = "",
    nameCN = " 删除次数",
    comment = " 删除次数",
    nameEN = "del_id",
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
    name = "delId",
    value = " 删除次数",
    dataType = "整型",
    notes = "5b2dc08e7c51e0fcf5a05e7c"
  )
  private Integer delId;

  @FieldMeta(
    name = "goodsLevel",
    scene = "",
    nameCN = "商品等级",
    comment = "商品等级",
    nameEN = "goods_level",
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
    name = "goodsLevel",
    value = "商品等级",
    dataType = "整型",
    notes = "5b2dc08e7c51e0fcf5a05e7a"
  )
  private Integer goodsLevel;

  @FieldMeta(
    name = "goodsOrion",
    scene = "",
    nameCN = "商品产地",
    comment = "商品产地",
    nameEN = "goods_orion",
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
    name = "goodsOrion",
    value = "商品产地",
    dataType = "字符串",
    notes = "5b2dc08e7c51e0fcf5a05e80"
  )
  private String goodsOrion;

  @FieldMeta(
    name = "invPrice",
    scene = "",
    nameCN = "库存单价",
    comment = "库存单价",
    nameEN = "inv_price",
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
    name = "invPrice",
    value = "库存单价",
    dataType = "小数",
    notes = "5b2dc08e7c51e0fcf5a05e82"
  )
  private java.math.BigDecimal invPrice;

  @FieldMeta(
    name = "purUnitCode",
    scene = "",
    nameCN = " 采购计量单位代码",
    comment = " 采购计量单位代码",
    nameEN = "pur_unit_code",
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
    name = "purUnitCode",
    value = " 采购计量单位代码",
    dataType = "字符串",
    notes = "5b2dc08e7c51e0fcf5a05e84"
  )
  private String purUnitCode;

  @FieldMeta(
    name = "purUnitId",
    scene = "",
    nameCN = "采购计量单位ID",
    comment = "采购计量单位ID",
    nameEN = "pur_unit_id",
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
    name = "purUnitId",
    value = "采购计量单位ID",
    dataType = "长整型",
    notes = "5b2dc08e7c51e0fcf5a05e7e"
  )
  private Long purUnitId;

  @FieldMeta(
    name = "purUnitName",
    scene = "",
    nameCN = "采购计量单位名称",
    comment = "采购计量单位名称",
    nameEN = "pur_unit_name",
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
    name = "purUnitName",
    value = "采购计量单位名称",
    dataType = "字符串",
    notes = "5b2dc08e7c51e0fcf5a05e8c"
  )
  private String purUnitName;

  @FieldMeta(
    name = "purUnitRate",
    scene = "",
    nameCN = " 采购计量单位转换比",
    comment = " 采购计量单位转换比",
    nameEN = "pur_unit_rate",
    type = "浮点数",
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
    name = "purUnitRate",
    value = " 采购计量单位转换比",
    dataType = "浮点数",
    notes = "5b2dc08e7c51e0fcf5a05e86"
  )
  private Double purUnitRate;

  @FieldMeta(
    name = "requestQty",
    scene = "",
    nameCN = "需求数量",
    comment = "需求数量",
    nameEN = "request_qty",
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
    name = "requestQty",
    value = "需求数量",
    dataType = "整型",
    notes = "5b2dc08e7c51e0fcf5a05e8a"
  )
  private Integer requestQty;

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
