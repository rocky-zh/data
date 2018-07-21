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
import static com.pagoda.test.api.dto.group.SalConsignDetailDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalConsignDetail")
@ApiModel(value = "SalConsignDetailDTO", description = "发货单明细表")
@EntityFeature(
  entityName = "SalConsignDetailDTO",
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
public class SalConsignDetailDTO extends AbstractDTO implements Serializable {

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
    notes = "5b528e554772960001e54d34"
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
    notes = "5b528e554772960001e54d36"
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
    notes = "5b528e554772960001e54d38"
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
    notes = "5b528e564772960001e54d3a"
  )
  private String orderSeqno;

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
    notes = "5b528e564772960001e54d3c"
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
    notes = "5b528e564772960001e54d3e"
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
    notes = "5b528e564772960001e54d40"
  )
  private String goodsName;

  @FieldMeta(
    name = "salunitId",
    scene = "",
    nameCN = "销售计量单位ID",
    comment = "销售计量单位ID",
    nameEN = "salunit_id",
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
    name = "salunitId",
    value = "销售计量单位ID",
    dataType = "",
    notes = "5b528e564772960001e54d42"
  )
  private Long salunitId;

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
    notes = "5b528e564772960001e54d44"
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
    notes = "5b528e564772960001e54d46"
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
    notes = "5b528e564772960001e54d48"
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
    notes = "5b528e564772960001e54d4a"
  )
  private String salConOutDepotName;

  @FieldMeta(
    name = "grossWeight",
    scene = "",
    nameCN = "毛重",
    comment = "毛重",
    nameEN = "gross_weight",
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
    name = "grossWeight",
    value = "毛重",
    dataType = "",
    notes = "5b528e564772960001e54d4c"
  )
  private java.math.BigDecimal grossWeight;

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
    notes = "5b528e564772960001e54d4e"
  )
  private java.math.BigDecimal shippedGrossWeight;

  @FieldMeta(
    name = "netWeight",
    scene = "",
    nameCN = "净重(公斤)",
    comment = "净重(公斤)",
    nameEN = "net_weight",
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
    name = "netWeight",
    value = "净重(公斤)",
    dataType = "",
    notes = "5b528e564772960001e54d50"
  )
  private java.math.BigDecimal netWeight;

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
    notes = "5b528e564772960001e54d52"
  )
  private java.math.BigDecimal shippedNetWeight;

  @FieldMeta(
    name = "qty",
    scene = "",
    nameCN = "数量",
    comment = "数量",
    nameEN = "qty",
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
  @ApiModelProperty(name = "qty", value = "数量", dataType = "", notes = "5b528e564772960001e54d54")
  private java.math.BigDecimal qty;

  @FieldMeta(
    name = "shippedQty",
    scene = "",
    nameCN = "已发数量",
    comment = "已发数量",
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
    value = "已发数量",
    dataType = "",
    notes = "5b528e564772960001e54d56"
  )
  private java.math.BigDecimal shippedQty;

  @FieldMeta(
    name = "volume",
    scene = "",
    nameCN = "体积",
    comment = "体积",
    nameEN = "volume",
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
    name = "volume",
    value = "体积",
    dataType = "",
    notes = "5b528e564772960001e54d58"
  )
  private java.math.BigDecimal volume;

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
    notes = "5b528e564772960001e54d5a"
  )
  private java.math.BigDecimal shippedVolume;

  @FieldMeta(
    name = "taxAmt",
    scene = "",
    nameCN = "税金[税率*实际总金额]",
    comment = "税金[税率*实际总金额]",
    nameEN = "tax_amt",
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
    name = "taxAmt",
    value = "税金[税率*实际总金额]",
    dataType = "",
    notes = "5b528e564772960001e54d5c"
  )
  private java.math.BigDecimal taxAmt;

  @FieldMeta(
    name = "price",
    scene = "",
    nameCN = "配送价(含税)[数据来源价格管理的配送价格的最新价格，同订单价格]",
    comment = "配送价(含税)[数据来源价格管理的配送价格的最新价格，同订单价格]",
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
  @ApiModelProperty(
    name = "price",
    value = "配送价(含税)[数据来源价格管理的配送价格的最新价格，同订单价格]",
    dataType = "",
    notes = "5b528e564772960001e54d5e"
  )
  private java.math.BigDecimal price;

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
    name = "totalAmt",
    value = "总金额[配送价*数量]",
    dataType = "",
    notes = "5b528e564772960001e54d60"
  )
  private java.math.BigDecimal totalAmt;

  @FieldMeta(
    name = "discountRate",
    scene = "",
    nameCN = "折扣[发货机构下鲜果统一折扣，数据来源虚拟机构组定义]",
    comment = "折扣[发货机构下鲜果统一折扣，数据来源虚拟机构组定义]",
    nameEN = "discount_rate",
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
    name = "discountRate",
    value = "折扣[发货机构下鲜果统一折扣，数据来源虚拟机构组定义]",
    dataType = "",
    notes = "5b528e564772960001e54d62"
  )
  private java.math.BigDecimal discountRate;

  @FieldMeta(
    name = "actualAmt",
    scene = "",
    nameCN = "实际总金额[=(配送价*数量-优惠金额）*(1-折扣)]",
    comment = "实际总金额[=(配送价*数量-优惠金额）*(1-折扣)]",
    nameEN = "actual_amt",
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
    name = "actualAmt",
    value = "实际总金额[=(配送价*数量-优惠金额）*(1-折扣)]",
    dataType = "",
    notes = "5b528e564772960001e54d64"
  )
  private java.math.BigDecimal actualAmt;

  @FieldMeta(
    name = "discountPrice",
    scene = "",
    nameCN = "折后单价(含优惠)[=已发货单价*折扣，四舍五入]",
    comment = "折后单价(含优惠)[=已发货单价*折扣，四舍五入]",
    nameEN = "discount_price",
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
    name = "discountPrice",
    value = "折后单价(含优惠)[=已发货单价*折扣，四舍五入]",
    dataType = "",
    notes = "5b528e564772960001e54d66"
  )
  private java.math.BigDecimal discountPrice;

  @FieldMeta(
    name = "shippedPrice",
    scene = "",
    nameCN = "已发货单价[第n次发货数量*第n次发货单价+第n+1次发货数量*第n+1次发货单价）/实发数量]",
    comment = "已发货单价[第n次发货数量*第n次发货单价+第n+1次发货数量*第n+1次发货单价）/实发数量]",
    nameEN = "shipped_price",
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
    name = "shippedPrice",
    value = "已发货单价[第n次发货数量*第n次发货单价+第n+1次发货数量*第n+1次发货单价）/实发数量]",
    dataType = "",
    notes = "5b528e564772960001e54d68"
  )
  private java.math.BigDecimal shippedPrice;

  @FieldMeta(
    name = "shippedCount",
    scene = "",
    nameCN = "发货次数(总计次数)",
    comment = "发货次数(总计次数)",
    nameEN = "shipped_count",
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
    name = "shippedCount",
    value = "发货次数(总计次数)",
    dataType = "",
    notes = "5b528e564772960001e54d6a"
  )
  private Integer shippedCount;

  @FieldMeta(
    name = "shippedAmt",
    scene = "",
    nameCN = "已发货总金额[=(第n次发货数量*第n次发货单价+第n+1次发货数量*第n+1次发货单价)]",
    comment = "已发货总金额[=(第n次发货数量*第n次发货单价+第n+1次发货数量*第n+1次发货单价)]",
    nameEN = "shipped_amt",
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
    name = "shippedAmt",
    value = "已发货总金额[=(第n次发货数量*第n次发货单价+第n+1次发货数量*第n+1次发货单价)]",
    dataType = "",
    notes = "5b528e564772960001e54d6c"
  )
  private java.math.BigDecimal shippedAmt;

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
    notes = "5b4c7b9977604a00016948b7"
  )
  private Long entId;

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
    notes = "5b4c7b9977604a00016948b9"
  )
  private String goodsSpec;

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
    notes = "5b4c7b9977604a00016948d5"
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
    notes = "5b4c7b9977604a00016948d7"
  )
  private String salUnitName;

  @FieldMeta(
    name = "taxRate",
    scene = "",
    nameCN = "税率",
    comment = "税率",
    nameEN = "tax_rate",
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
    name = "taxRate",
    value = "税率",
    dataType = "",
    notes = "5b4c7b9977604a00016948f1"
  )
  private java.math.BigDecimal taxRate;

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
    public static Function<SalConsignDetailDTO, Long> id_ = o -> o.getId();
    public static Function<SalConsignDetailDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<SalConsignDetailDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<SalConsignDetailDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<SalConsignDetailDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<SalConsignDetailDTO, String> creatorOrgCode_ =
        o -> o.getCreatorOrgCode();
    public static Function<SalConsignDetailDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<SalConsignDetailDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<SalConsignDetailDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<SalConsignDetailDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<SalConsignDetailDTO, Integer> version_ = o -> o.getVersion();

    public static Function<SalConsignDetailDTO, Long> conId_ = o -> o.getConId();
    public static Function<SalConsignDetailDTO, String> conSeqno_ = o -> o.getConSeqno();
    public static Function<SalConsignDetailDTO, Long> orderId_ = o -> o.getOrderId();
    public static Function<SalConsignDetailDTO, String> orderSeqno_ = o -> o.getOrderSeqno();
    public static Function<SalConsignDetailDTO, Long> goodsId_ = o -> o.getGoodsId();
    public static Function<SalConsignDetailDTO, String> goodsCode_ = o -> o.getGoodsCode();
    public static Function<SalConsignDetailDTO, String> goodsName_ = o -> o.getGoodsName();
    public static Function<SalConsignDetailDTO, Long> salunitId_ = o -> o.getSalunitId();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> salUnitRate_ =
        o -> o.getSalUnitRate();
    public static Function<SalConsignDetailDTO, Long> salConOutDepotId_ =
        o -> o.getSalConOutDepotId();
    public static Function<SalConsignDetailDTO, String> salConOutDepotCode_ =
        o -> o.getSalConOutDepotCode();
    public static Function<SalConsignDetailDTO, String> salConOutDepotName_ =
        o -> o.getSalConOutDepotName();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> grossWeight_ =
        o -> o.getGrossWeight();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> shippedGrossWeight_ =
        o -> o.getShippedGrossWeight();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> netWeight_ =
        o -> o.getNetWeight();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> shippedNetWeight_ =
        o -> o.getShippedNetWeight();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> qty_ = o -> o.getQty();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> shippedQty_ =
        o -> o.getShippedQty();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> volume_ = o -> o.getVolume();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> shippedVolume_ =
        o -> o.getShippedVolume();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> taxAmt_ = o -> o.getTaxAmt();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> price_ = o -> o.getPrice();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> totalAmt_ =
        o -> o.getTotalAmt();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> discountRate_ =
        o -> o.getDiscountRate();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> actualAmt_ =
        o -> o.getActualAmt();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> discountPrice_ =
        o -> o.getDiscountPrice();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> shippedPrice_ =
        o -> o.getShippedPrice();
    public static Function<SalConsignDetailDTO, Integer> shippedCount_ = o -> o.getShippedCount();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> shippedAmt_ =
        o -> o.getShippedAmt();
    public static Function<SalConsignDetailDTO, Long> entId_ = o -> o.getEntId();
    public static Function<SalConsignDetailDTO, String> goodsSpec_ = o -> o.getGoodsSpec();
    public static Function<SalConsignDetailDTO, String> salUnitCode_ = o -> o.getSalUnitCode();
    public static Function<SalConsignDetailDTO, String> salUnitName_ = o -> o.getSalUnitName();
    public static Function<SalConsignDetailDTO, java.math.BigDecimal> taxRate_ =
        o -> o.getTaxRate();
    public static Function<SalConsignDetailDTO, String> remark_ = o -> o.getRemark();
  }

  public static ValidatorBuilder<SalConsignDetailDTO> validatorExample() {
    ValidatorBuilder<SalConsignDetailDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
