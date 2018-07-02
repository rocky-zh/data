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
@ValidateProperties(rulePrefix = "validator.PurApplyDetail")
@ApiModel(value = "PurApplyDetailDTO", description = "采购请购单明细表")
@EntityFeature(
  entityName = "PurApplyDetailDTO",
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
public class PurApplyDetailDTO extends AbstractDTO implements Serializable {

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
    dataType = "",
    notes = "5b35d7329d2feff19b413981"
  )
  private Long applyId;

  @FieldMeta(
    name = "applySeqno",
    scene = "",
    nameCN = "请购单号码",
    comment = "请购单号码",
    nameEN = "apply_seqno",
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
    name = "applySeqno",
    value = "请购单号码",
    dataType = "",
    notes = "5b35d7329d2feff19b413983"
  )
  private String applySeqno;

  @FieldMeta(
    name = "goodsOrion",
    scene = "",
    nameCN = "商品产地[冗余]",
    comment = "商品产地[冗余]",
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
    value = "商品产地[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b413986"
  )
  private String goodsOrion;

  @FieldMeta(
    name = "purUnitId",
    scene = "",
    nameCN = "采购单位ID",
    comment = "采购单位ID",
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
    value = "采购单位ID",
    dataType = "",
    notes = "5b35d7329d2feff19b413980"
  )
  private Long purUnitId;

  @FieldMeta(
    name = "purUnitCode",
    scene = "",
    nameCN = "采购单位代码[冗余]",
    comment = "采购单位代码[冗余]",
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
    value = "采购单位代码[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b41398b"
  )
  private String purUnitCode;

  @FieldMeta(
    name = "purUnitName",
    scene = "",
    nameCN = "采购单位名称[冗余]",
    comment = "采购单位名称[冗余]",
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
    value = "采购单位名称[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b413987"
  )
  private String purUnitName;

  @FieldMeta(
    name = "basUnitId",
    scene = "",
    nameCN = "基本单位ID(即最小单位)",
    comment = "基本单位ID(即最小单位)",
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
    value = "基本单位ID(即最小单位)",
    dataType = "",
    notes = "5b35d7329d2feff19b413991"
  )
  private Long basUnitId;

  @FieldMeta(
    name = "basUnitCode",
    scene = "",
    nameCN = "基本单位代码[冗余]",
    comment = "基本单位代码[冗余]",
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
    value = "基本单位代码[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b41398f"
  )
  private String basUnitCode;

  @FieldMeta(
    name = "basUnitName",
    scene = "",
    nameCN = "基本单位名称[冗余]",
    comment = "基本单位名称[冗余]",
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
    value = "基本单位名称[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b41398d"
  )
  private String basUnitName;

  @FieldMeta(
    name = "purUnitRate",
    scene = "",
    nameCN = "采购计量单位转换比",
    comment = "采购计量单位转换比",
    nameEN = "pur_unit_rate",
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
    name = "purUnitRate",
    value = "采购计量单位转换比",
    dataType = "",
    notes = "5b35d7329d2feff19b41398a"
  )
  private java.math.BigDecimal purUnitRate;

  @FieldMeta(
    name = "requestQty",
    scene = "",
    nameCN = "需求量",
    comment = "需求量",
    nameEN = "request_qty",
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
    name = "requestQty",
    value = "需求量",
    dataType = "",
    notes = "5b35d7329d2feff19b413993"
  )
  private java.math.BigDecimal requestQty;

  @FieldMeta(
    name = "applyQty",
    scene = "",
    nameCN = "请购数量",
    comment = "请购数量",
    nameEN = "apply_qty",
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
    name = "applyQty",
    value = "请购数量",
    dataType = "",
    notes = "5b35d7329d2feff19b413995"
  )
  private java.math.BigDecimal applyQty;

  @FieldMeta(
    name = "confirmQty",
    scene = "",
    nameCN = "确认数量[头sourcetype=2时 =applyqty]",
    comment = "确认数量[头sourcetype=2时 =applyqty]",
    nameEN = "confirm_qty",
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
    name = "confirmQty",
    value = "确认数量[头sourcetype=2时 =applyqty]",
    dataType = "",
    notes = "5b35d7329d2feff19b413997"
  )
  private java.math.BigDecimal confirmQty;

  @FieldMeta(
    name = "invPrice",
    scene = "",
    nameCN = "库存单价[头sourcetype=1使用]",
    comment = "库存单价[头sourcetype=1使用]",
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
    value = "库存单价[头sourcetype=1使用]",
    dataType = "",
    notes = "5b35d7329d2feff19b41399d"
  )
  private java.math.BigDecimal invPrice;

  @FieldMeta(
    name = "dealPurQty",
    scene = "",
    nameCN = "转采购数量",
    comment = "转采购数量",
    nameEN = "deal_pur_qty",
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
    name = "dealPurQty",
    value = "转采购数量",
    dataType = "",
    notes = "5b35d7329d2feff19b413999"
  )
  private java.math.BigDecimal dealPurQty;

  @FieldMeta(
    name = "dealSalQty",
    scene = "",
    nameCN = "转内部调拨销售数量",
    comment = "转内部调拨销售数量",
    nameEN = "deal_sal_qty",
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
    name = "dealSalQty",
    value = "转内部调拨销售数量",
    dataType = "",
    notes = "5b35d7329d2feff19b41399b"
  )
  private java.math.BigDecimal dealSalQty;

  @FieldMeta(
    name = "dealStatus",
    scene = "",
    nameCN = "处理状态{10:未处理,20:已转采购,30:已转调拨}",
    comment = "处理状态{10:未处理,20:已转采购,30:已转调拨}",
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
    value = "处理状态{10:未处理,20:已转采购,30:已转调拨}",
    dataType = "",
    notes = "5b35d7329d2feff19b4139a5"
  )
  private Integer dealStatus;

  @FieldMeta(
    name = "dealSalOrgId",
    scene = "",
    nameCN = "转内部销售要货机构ID",
    comment = "转内部销售要货机构ID",
    nameEN = "deal_sal_org_id",
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
    name = "dealSalOrgId",
    value = "转内部销售要货机构ID",
    dataType = "",
    notes = "5b35d7329d2feff19b4139a9"
  )
  private Long dealSalOrgId;

  @FieldMeta(
    name = "calCusOrderQty",
    scene = "",
    nameCN = "门店订货数量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    comment = "门店订货数量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    nameEN = "cal_cus_order_qty",
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
    name = "calCusOrderQty",
    value = "门店订货数量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    dataType = "",
    notes = "5b35d7329d2feff19b4139ab"
  )
  private java.math.BigDecimal calCusOrderQty;

  @FieldMeta(
    name = "calOuterFerQty",
    scene = "",
    nameCN = "外区调拨数量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    comment = "外区调拨数量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    nameEN = "cal_outer_fer_qty",
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
    name = "calOuterFerQty",
    value = "外区调拨数量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    dataType = "",
    notes = "5b35d7329d2feff19b4139a7"
  )
  private java.math.BigDecimal calOuterFerQty;

  @FieldMeta(
    name = "calCusSalQty",
    scene = "",
    nameCN = "门店昨日销量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    comment = "门店昨日销量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    nameEN = "cal_cus_sal_qty",
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
    name = "calCusSalQty",
    value = "门店昨日销量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    dataType = "",
    notes = "5b35d7329d2feff19b4139a4"
  )
  private java.math.BigDecimal calCusSalQty;

  @FieldMeta(
    name = "calInvQty",
    scene = "",
    nameCN = "库存量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    comment = "库存量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    nameEN = "cal_inv_qty",
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
    name = "calInvQty",
    value = "库存量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    dataType = "",
    notes = "5b35d7329d2feff19b4139a0"
  )
  private java.math.BigDecimal calInvQty;

  @FieldMeta(
    name = "calOnWayQty",
    scene = "",
    nameCN = "在途量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    comment = "在途量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    nameEN = "cal_on_way_qty",
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
    name = "calOnWayQty",
    value = "在途量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    dataType = "",
    notes = "5b35d7329d2feff19b4139b8"
  )
  private java.math.BigDecimal calOnWayQty;

  @FieldMeta(
    name = "calStockUpQty",
    scene = "",
    nameCN = "备货量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    comment = "备货量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    nameEN = "cal_stock_up_qty",
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
    name = "calStockUpQty",
    value = "备货量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    dataType = "",
    notes = "5b35d7329d2feff19b4139b0"
  )
  private java.math.BigDecimal calStockUpQty;

  @FieldMeta(
    name = "calReplenishmentQty",
    scene = "",
    nameCN = "补货量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    comment = "补货量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    nameEN = "cal_replenishment_qty",
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
    name = "calReplenishmentQty",
    value = "补货量[头sourcetype=2时计算得到,存入本表unitid对应数量]",
    dataType = "",
    notes = "5b35d7329d2feff19b4139b5"
  )
  private java.math.BigDecimal calReplenishmentQty;

  @FieldMeta(
    name = "goodsId",
    scene = "",
    nameCN = "商品ID",
    comment = "商品ID",
    nameEN = "goods_id",
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
    name = "goodsId",
    value = "商品ID",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d96e"
  )
  private Long goodsId;

  @FieldMeta(
    name = "goodsCode",
    scene = "",
    nameCN = "商品代码[冗余]",
    comment = "商品代码[冗余]",
    nameEN = "goods_code",
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
    name = "goodsCode",
    value = "商品代码[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d972"
  )
  private String goodsCode;

  @FieldMeta(
    name = "goodsName",
    scene = "",
    nameCN = "商品名称[冗余]",
    comment = "商品名称[冗余]",
    nameEN = "goods_name",
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
    name = "goodsName",
    value = "商品名称[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d971"
  )
  private String goodsName;

  @FieldMeta(
    name = "goodsSpec",
    scene = "",
    nameCN = "商品规格[冗余]",
    comment = "商品规格[冗余]",
    nameEN = "goods_spec",
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
    name = "goodsSpec",
    value = "商品规格[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d976"
  )
  private String goodsSpec;

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
    public static final Function<PurApplyDetailDTO, Long> _id = o -> o.getId();
    public static final Function<PurApplyDetailDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<PurApplyDetailDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<PurApplyDetailDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<PurApplyDetailDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<PurApplyDetailDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<PurApplyDetailDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<PurApplyDetailDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<PurApplyDetailDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<PurApplyDetailDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<PurApplyDetailDTO, Integer> _version = o -> o.getVersion();

    public static final Function<PurApplyDetailDTO, Long> _applyId = o -> o.getApplyId();
    public static final Function<PurApplyDetailDTO, String> _applySeqno = o -> o.getApplySeqno();
    public static final Function<PurApplyDetailDTO, String> _goodsOrion = o -> o.getGoodsOrion();
    public static final Function<PurApplyDetailDTO, Long> _purUnitId = o -> o.getPurUnitId();
    public static final Function<PurApplyDetailDTO, String> _purUnitCode = o -> o.getPurUnitCode();
    public static final Function<PurApplyDetailDTO, String> _purUnitName = o -> o.getPurUnitName();
    public static final Function<PurApplyDetailDTO, Long> _basUnitId = o -> o.getBasUnitId();
    public static final Function<PurApplyDetailDTO, String> _basUnitCode = o -> o.getBasUnitCode();
    public static final Function<PurApplyDetailDTO, String> _basUnitName = o -> o.getBasUnitName();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _purUnitRate =
        o -> o.getPurUnitRate();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _requestQty =
        o -> o.getRequestQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _applyQty =
        o -> o.getApplyQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _confirmQty =
        o -> o.getConfirmQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _invPrice =
        o -> o.getInvPrice();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _dealPurQty =
        o -> o.getDealPurQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _dealSalQty =
        o -> o.getDealSalQty();
    public static final Function<PurApplyDetailDTO, Integer> _dealStatus = o -> o.getDealStatus();
    public static final Function<PurApplyDetailDTO, Long> _dealSalOrgId = o -> o.getDealSalOrgId();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _calCusOrderQty =
        o -> o.getCalCusOrderQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _calOuterFerQty =
        o -> o.getCalOuterFerQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _calCusSalQty =
        o -> o.getCalCusSalQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _calInvQty =
        o -> o.getCalInvQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _calOnWayQty =
        o -> o.getCalOnWayQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _calStockUpQty =
        o -> o.getCalStockUpQty();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _calReplenishmentQty =
        o -> o.getCalReplenishmentQty();
    public static final Function<PurApplyDetailDTO, Long> _goodsId = o -> o.getGoodsId();
    public static final Function<PurApplyDetailDTO, String> _goodsCode = o -> o.getGoodsCode();
    public static final Function<PurApplyDetailDTO, String> _goodsName = o -> o.getGoodsName();
    public static final Function<PurApplyDetailDTO, String> _goodsSpec = o -> o.getGoodsSpec();
    public static final Function<PurApplyDetailDTO, java.util.Date> _planRecDate =
        o -> o.getPlanRecDate();
    public static final Function<PurApplyDetailDTO, String> _remark = o -> o.getRemark();
    public static final Function<PurApplyDetailDTO, java.math.BigDecimal> _calPurRate =
        o -> o.getCalPurRate();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
