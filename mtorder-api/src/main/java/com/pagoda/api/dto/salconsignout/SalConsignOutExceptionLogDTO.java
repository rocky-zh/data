package com.pagoda.api.dto.salconsignout;

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
import static com.pagoda.api.dto.salconsignout.SalConsignOutExceptionLogDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalConsignOutExceptionLog")
@ApiModel(value = "SalConsignOutExceptionLogDTO", description = "发货出库异常记录表(每次出库异常插入新记录)")
@EntityFeature(
  entityName = "SalConsignOutExceptionLogDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "/SalConsignOutExceptionLogService/findByConId",
  tableMultiSelect = false
)
public class SalConsignOutExceptionLogDTO extends AbstractDTO implements Serializable {

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
    name = "stockoutId",
    scene = "",
    nameCN = "发货出库单ID",
    comment = "发货出库单ID",
    nameEN = "stockout_id",
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
    name = "stockoutId",
    value = "发货出库单ID",
    dataType = "",
    notes = "5b35dd7c9d2feff19b42a6d7"
  )
  private Long stockoutId;

  @FieldMeta(
    name = "stockoutSeqno",
    scene = "",
    nameCN = "发货出库单号[冗余]",
    comment = "发货出库单号[冗余]",
    nameEN = "stockout_seqno",
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
    name = "stockoutSeqno",
    value = "发货出库单号[冗余]",
    dataType = "",
    notes = "5b35dd7c9d2feff19b42a6d9"
  )
  private String stockoutSeqno;

  @FieldMeta(
    name = "conId",
    scene = "",
    nameCN = "发货单ID[conId]",
    comment = "发货单ID[conId]",
    nameEN = "con_id",
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
    name = "conId",
    value = "发货单ID[conId]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c209"
  )
  private Long conId;

  @FieldMeta(
    name = "conSeqno",
    scene = "",
    nameCN = "发货单号",
    comment = "发货单号",
    nameEN = "con_seqno",
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
    name = "conSeqno",
    value = "发货单号",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c20b"
  )
  private String conSeqno;

  @FieldMeta(
    name = "orderId",
    scene = "",
    nameCN = "订单ID[orderId]",
    comment = "订单ID[orderId]",
    nameEN = "order_id",
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
    name = "orderId",
    value = "订单ID[orderId]",
    dataType = "",
    notes = "5b35d2b49d2feff19b40cb3d"
  )
  private Long orderId;

  @FieldMeta(
    name = "orderSeqno",
    scene = "",
    nameCN = "订单号[冗余]",
    comment = "订单号[冗余]",
    nameEN = "order_seqno",
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
    name = "orderSeqno",
    value = "订单号[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d96c"
  )
  private String orderSeqno;

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

  @FieldMeta(
    name = "goodsId",
    scene = "price",
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
    notes = "5b36fa2a9d2feff19b4170ab"
  )
  private Long goodsId;

  @FieldMeta(
    name = "goodsCode",
    scene = "price",
    nameCN = "商品代码",
    comment = "商品代码",
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
    value = "商品代码",
    dataType = "",
    notes = "5b36e88c9d2feff19b2d5b9d"
  )
  private String goodsCode;

  @FieldMeta(
    name = "goodsSpec",
    scene = "price",
    nameCN = "商品规格",
    comment = "商品规格",
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
    value = "商品规格",
    dataType = "",
    notes = "5b36f9d59d2feff19b4107a2"
  )
  private String goodsSpec;

  @FieldMeta(
    name = "salUnitId",
    scene = "",
    nameCN = "销售单位ID",
    comment = "销售单位ID",
    nameEN = "sal_unit_id",
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
    name = "salUnitId",
    value = "销售单位ID",
    dataType = "",
    notes = "5b35dd7c9d2feff19b42a6db"
  )
  private Long salUnitId;

  @FieldMeta(
    name = "salUnitCode",
    scene = "",
    nameCN = "销售计量单位代码[冗余]",
    comment = "销售计量单位代码[冗余]",
    nameEN = "sal_unit_code",
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
    name = "salUnitCode",
    value = "销售计量单位代码[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d974"
  )
  private String salUnitCode;

  @FieldMeta(
    name = "salUnitName",
    scene = "",
    nameCN = "销售计量单位名称[冗余]",
    comment = "销售计量单位名称[冗余]",
    nameEN = "sal_unit_name",
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
    name = "salUnitName",
    value = "销售计量单位名称[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d97a"
  )
  private String salUnitName;

  @FieldMeta(
    name = "salUnitRate",
    scene = "",
    nameCN = "销售计量单位转换比",
    comment = "销售计量单位转换比",
    nameEN = "sal_unit_rate",
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
    name = "salUnitRate",
    value = "销售计量单位转换比",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d97e"
  )
  private java.math.BigDecimal salUnitRate;

  @FieldMeta(
    name = "salConOutDepotId",
    scene = "",
    nameCN = "默认销售出库库房ID",
    comment = "默认销售出库库房ID",
    nameEN = "sal_con_out_depot_id",
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
    name = "salConOutDepotId",
    value = "默认销售出库库房ID",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d97c"
  )
  private Long salConOutDepotId;

  @FieldMeta(
    name = "salConOutDepotCode",
    scene = "",
    nameCN = "默认销售出库库房代码[冗余]",
    comment = "默认销售出库库房代码[冗余]",
    nameEN = "sal_con_out_depot_code",
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
    name = "salConOutDepotCode",
    value = "默认销售出库库房代码[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d980"
  )
  private String salConOutDepotCode;

  @FieldMeta(
    name = "salConOutDepotName",
    scene = "",
    nameCN = "默认销售出库库房名称[冗余]",
    comment = "默认销售出库库房名称[冗余]",
    nameEN = "sal_con_out_depot_name",
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
    name = "salConOutDepotName",
    value = "默认销售出库库房名称[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d984"
  )
  private String salConOutDepotName;

  @FieldMeta(
    name = "shippedQty",
    scene = "",
    nameCN = "已发货数量",
    comment = "已发货数量",
    nameEN = "shipped_qty",
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
    name = "shippedQty",
    value = "已发货数量",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c21d"
  )
  private java.math.BigDecimal shippedQty;

  @FieldMeta(
    name = "shippedNetWeight",
    scene = "",
    nameCN = "已发净重",
    comment = "已发净重",
    nameEN = "shipped_net_weight",
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
    name = "shippedNetWeight",
    value = "已发净重",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c21f"
  )
  private java.math.BigDecimal shippedNetWeight;

  @FieldMeta(
    name = "shippedGrossWeight",
    scene = "",
    nameCN = "已发毛重",
    comment = "已发毛重",
    nameEN = "shipped_gross_weight",
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
    name = "shippedGrossWeight",
    value = "已发毛重",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c221"
  )
  private java.math.BigDecimal shippedGrossWeight;

  @FieldMeta(
    name = "shippedVolume",
    scene = "",
    nameCN = "已发体积",
    comment = "已发体积",
    nameEN = "shipped_volume",
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
    name = "shippedVolume",
    value = "已发体积",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c223"
  )
  private java.math.BigDecimal shippedVolume;

  @FieldMeta(
    name = "price",
    scene = "",
    nameCN = "单价",
    comment = "单价",
    nameEN = "price",
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
  @ApiModelProperty(name = "price", value = "单价", dataType = "", notes = "5b35d3a69d2feff19b40d991")
  private java.math.BigDecimal price;

  @FieldMeta(
    name = "amount",
    scene = "",
    nameCN = "实发金额[实发数量*实发单价]",
    comment = "实发金额[实发数量*实发单价]",
    nameEN = "amount",
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
    name = "amount",
    value = "实发金额[实发数量*实发单价]",
    dataType = "",
    notes = "5b35dda99d2feff19b42b5ea"
  )
  private java.math.BigDecimal amount;

  @FieldMeta(
    name = "shipSeq",
    scene = "",
    nameCN = "发货次数(第几次发货)",
    comment = "发货次数(第几次发货)",
    nameEN = "ship_seq",
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
    name = "shipSeq",
    value = "发货次数(第几次发货)",
    dataType = "",
    notes = "5b35dd7c9d2feff19b42a6dd"
  )
  private Integer shipSeq;

  @FieldMeta(
    name = "consignTime",
    scene = "",
    nameCN = "发货时间",
    comment = "发货时间",
    nameEN = "consign_time",
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
    name = "consignTime",
    value = "发货时间",
    dataType = "",
    notes = "5b35dd7c9d2feff19b42a6e1"
  )
  private java.util.Date consignTime;

  @FieldMeta(
    name = "consignerId",
    scene = "",
    nameCN = "发货人ID",
    comment = "发货人ID",
    nameEN = "consigner_id",
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
    name = "consignerId",
    value = "发货人ID",
    dataType = "",
    notes = "5b35dd7c9d2feff19b42a6e0"
  )
  private Long consignerId;

  @FieldMeta(
    name = "consignerName",
    scene = "",
    nameCN = "发货人姓名",
    comment = "发货人姓名",
    nameEN = "consigner_name",
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
    name = "consignerName",
    value = "发货人姓名",
    dataType = "",
    notes = "5b35dd7c9d2feff19b42a6e5"
  )
  private String consignerName;

  @FieldMeta(
    name = "stockoutStatus",
    scene = "",
    nameCN = "出库状态[10:待出库 20:已出库 30:出库失败,40:已到货]",
    comment = "出库状态[10:待出库 20:已出库 30:出库失败,40:已到货]",
    nameEN = "stockout_status",
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
    name = "stockoutStatus",
    value = "出库状态[10:待出库 20:已出库 30:出库失败,40:已到货]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c229"
  )
  private Integer stockoutStatus;

  @FieldMeta(
    name = "auditTime",
    scene = "purt",
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
    notes = "5b36e5e69d2feff19b2aa2d9"
  )
  private java.util.Date auditTime;

  @FieldMeta(
    name = "auditorCode",
    scene = "price",
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
    notes = "5b36e6009d2feff19b2abd25"
  )
  private String auditorCode;

  @FieldMeta(
    name = "auditorName",
    scene = "price",
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
    notes = "5b36e62d9d2feff19b2aea97"
  )
  private String auditorName;

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
    name = "note",
    scene = "price",
    nameCN = "提示信息",
    comment = "提示信息",
    nameEN = "note",
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
    name = "note",
    value = "提示信息",
    dataType = "",
    notes = "5b36e6c79d2feff19b2b865c"
  )
  private String note;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<SalConsignOutExceptionLogDTO, Long> id_ = o -> o.getId();
    public static Function<SalConsignOutExceptionLogDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<SalConsignOutExceptionLogDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<SalConsignOutExceptionLogDTO, String> creatorCode_ =
        o -> o.getCreatorCode();
    public static Function<SalConsignOutExceptionLogDTO, String> creatorName_ =
        o -> o.getCreatorName();
    public static Function<SalConsignOutExceptionLogDTO, String> creatorOrgCode_ =
        o -> o.getCreatorOrgCode();
    public static Function<SalConsignOutExceptionLogDTO, Date> lastModifiedAt_ =
        o -> o.getLastModifiedAt();
    public static Function<SalConsignOutExceptionLogDTO, String> modifierCode_ =
        o -> o.getModifierCode();
    public static Function<SalConsignOutExceptionLogDTO, String> modifierName_ =
        o -> o.getModifierName();
    public static Function<SalConsignOutExceptionLogDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<SalConsignOutExceptionLogDTO, Integer> version_ = o -> o.getVersion();

    public static Function<SalConsignOutExceptionLogDTO, Long> stockoutId_ = o -> o.getStockoutId();
    public static Function<SalConsignOutExceptionLogDTO, String> stockoutSeqno_ =
        o -> o.getStockoutSeqno();
    public static Function<SalConsignOutExceptionLogDTO, Long> conId_ = o -> o.getConId();
    public static Function<SalConsignOutExceptionLogDTO, String> conSeqno_ = o -> o.getConSeqno();
    public static Function<SalConsignOutExceptionLogDTO, Long> orderId_ = o -> o.getOrderId();
    public static Function<SalConsignOutExceptionLogDTO, String> orderSeqno_ =
        o -> o.getOrderSeqno();
    public static Function<SalConsignOutExceptionLogDTO, Long> entId_ = o -> o.getEntId();
    public static Function<SalConsignOutExceptionLogDTO, Long> goodsId_ = o -> o.getGoodsId();
    public static Function<SalConsignOutExceptionLogDTO, String> goodsCode_ = o -> o.getGoodsCode();
    public static Function<SalConsignOutExceptionLogDTO, String> goodsSpec_ = o -> o.getGoodsSpec();
    public static Function<SalConsignOutExceptionLogDTO, Long> salUnitId_ = o -> o.getSalUnitId();
    public static Function<SalConsignOutExceptionLogDTO, String> salUnitCode_ =
        o -> o.getSalUnitCode();
    public static Function<SalConsignOutExceptionLogDTO, String> salUnitName_ =
        o -> o.getSalUnitName();
    public static Function<SalConsignOutExceptionLogDTO, java.math.BigDecimal> salUnitRate_ =
        o -> o.getSalUnitRate();
    public static Function<SalConsignOutExceptionLogDTO, Long> salConOutDepotId_ =
        o -> o.getSalConOutDepotId();
    public static Function<SalConsignOutExceptionLogDTO, String> salConOutDepotCode_ =
        o -> o.getSalConOutDepotCode();
    public static Function<SalConsignOutExceptionLogDTO, String> salConOutDepotName_ =
        o -> o.getSalConOutDepotName();
    public static Function<SalConsignOutExceptionLogDTO, java.math.BigDecimal> shippedQty_ =
        o -> o.getShippedQty();
    public static Function<SalConsignOutExceptionLogDTO, java.math.BigDecimal> shippedNetWeight_ =
        o -> o.getShippedNetWeight();
    public static Function<SalConsignOutExceptionLogDTO, java.math.BigDecimal> shippedGrossWeight_ =
        o -> o.getShippedGrossWeight();
    public static Function<SalConsignOutExceptionLogDTO, java.math.BigDecimal> shippedVolume_ =
        o -> o.getShippedVolume();
    public static Function<SalConsignOutExceptionLogDTO, java.math.BigDecimal> price_ =
        o -> o.getPrice();
    public static Function<SalConsignOutExceptionLogDTO, java.math.BigDecimal> amount_ =
        o -> o.getAmount();
    public static Function<SalConsignOutExceptionLogDTO, Integer> shipSeq_ = o -> o.getShipSeq();
    public static Function<SalConsignOutExceptionLogDTO, java.util.Date> consignTime_ =
        o -> o.getConsignTime();
    public static Function<SalConsignOutExceptionLogDTO, Long> consignerId_ =
        o -> o.getConsignerId();
    public static Function<SalConsignOutExceptionLogDTO, String> consignerName_ =
        o -> o.getConsignerName();
    public static Function<SalConsignOutExceptionLogDTO, Integer> stockoutStatus_ =
        o -> o.getStockoutStatus();
    public static Function<SalConsignOutExceptionLogDTO, java.util.Date> auditTime_ =
        o -> o.getAuditTime();
    public static Function<SalConsignOutExceptionLogDTO, String> auditorCode_ =
        o -> o.getAuditorCode();
    public static Function<SalConsignOutExceptionLogDTO, String> auditorName_ =
        o -> o.getAuditorName();
    public static Function<SalConsignOutExceptionLogDTO, String> remark_ = o -> o.getRemark();
    public static Function<SalConsignOutExceptionLogDTO, String> note_ = o -> o.getNote();
  }

  public static ValidatorBuilder<SalConsignOutExceptionLogDTO> validatorExample() {
    ValidatorBuilder<SalConsignOutExceptionLogDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
