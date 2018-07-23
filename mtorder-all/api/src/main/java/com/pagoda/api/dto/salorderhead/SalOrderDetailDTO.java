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
import static com.pagoda.api.dto.salorderhead.SalOrderDetailDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalOrderDetail")
@ApiModel(value = "SalOrderDetailDTO", description = "销售订单明细表")
@EntityFeature(
  entityName = "SalOrderDetailDTO",
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
public class SalOrderDetailDTO extends AbstractDTO implements Serializable {

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
    name = "goodsVarId",
    scene = "",
    nameCN = "销售商品ID",
    comment = "销售商品ID",
    nameEN = "goods_var_id",
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
    name = "goodsVarId",
    value = "销售商品ID",
    dataType = "",
    notes = "5b35dad59d2feff19b41e98f"
  )
  private Long goodsVarId;

  @FieldMeta(
    name = "goodsVarName",
    scene = "",
    nameCN = "零售商品名称[冗余]",
    comment = "零售商品名称[冗余]",
    nameEN = "goods_var_name",
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
    name = "goodsVarName",
    value = "零售商品名称[冗余]",
    dataType = "",
    notes = "5b35dad59d2feff19b41e996"
  )
  private String goodsVarName;

  @FieldMeta(
    name = "goodsId",
    scene = "",
    nameCN = "商品ID[冗余]",
    comment = "商品ID[冗余]",
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
    value = "商品ID[冗余]",
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
    name = "salUnitid",
    scene = "",
    nameCN = "销售计量单位ID",
    comment = "销售计量单位ID",
    nameEN = "sal_unitid",
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
    name = "salUnitid",
    value = "销售计量单位ID",
    dataType = "",
    notes = "5b35dad59d2feff19b41e994"
  )
  private Long salUnitid;

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
    name = "requestQty",
    scene = "",
    nameCN = "需求数量[头sourcetype=1使用]",
    comment = "需求数量[头sourcetype=1使用]",
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
    value = "需求数量[头sourcetype=1使用]",
    dataType = "",
    notes = "5b35d7329d2feff19b413993"
  )
  private java.math.BigDecimal requestQty;

  @FieldMeta(
    name = "maxOrderQty",
    scene = "",
    nameCN = "最大订货量",
    comment = "最大订货量",
    nameEN = "max_order_qty",
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
    name = "maxOrderQty",
    value = "最大订货量",
    dataType = "",
    notes = "5b35dad59d2feff19b41e990"
  )
  private java.math.BigDecimal maxOrderQty;

  @FieldMeta(
    name = "minOrderQty",
    scene = "",
    nameCN = "最小订货量",
    comment = "最小订货量",
    nameEN = "min_order_qty",
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
    name = "minOrderQty",
    value = "最小订货量",
    dataType = "",
    notes = "5b35dad59d2feff19b41e998"
  )
  private java.math.BigDecimal minOrderQty;

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
    name = "discountPrice",
    scene = "",
    nameCN = "折后单价[含税]",
    comment = "折后单价[含税]",
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
    value = "折后单价[含税]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d999"
  )
  private java.math.BigDecimal discountPrice;

  @FieldMeta(
    name = "discountRate",
    scene = "",
    nameCN = "折扣率[1为原价,0.9为9折]",
    comment = "折扣率[1为原价,0.9为9折]",
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
    value = "折扣率[1为原价,0.9为9折]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d993"
  )
  private java.math.BigDecimal discountRate;

  @FieldMeta(
    name = "discountAmt",
    scene = "",
    nameCN = "折扣额度",
    comment = "折扣额度",
    nameEN = "discount_amt",
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
    name = "discountAmt",
    value = "折扣额度",
    dataType = "",
    notes = "5b35dad59d2feff19b41e99a"
  )
  private java.math.BigDecimal discountAmt;

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
    notes = "5b35d3a69d2feff19b40d98f"
  )
  private java.math.BigDecimal taxRate;

  @FieldMeta(
    name = "taxAmt",
    scene = "",
    nameCN = "税金[=round(totalAmt*taxrate/(taxrate+1),2)]",
    comment = "税金[=round(totalAmt*taxrate/(taxrate+1),2)]",
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
    value = "税金[=round(totalAmt*taxrate/(taxrate+1),2)]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c225"
  )
  private java.math.BigDecimal taxAmt;

  @FieldMeta(
    name = "goodsAmt",
    scene = "",
    nameCN = "货款",
    comment = "货款",
    nameEN = "goods_amt",
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
    name = "goodsAmt",
    value = "货款",
    dataType = "",
    notes = "5b35dad59d2feff19b41e99e"
  )
  private java.math.BigDecimal goodsAmt;

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
    value = "总金额[=round(数量*price,2)]",
    dataType = "",
    notes = "5b35d2b49d2feff19b40cb44"
  )
  private java.math.BigDecimal totalAmt;

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
    name = "conOrgName",
    value = "发货机构名称[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c213"
  )
  private String conOrgName;

  @FieldMeta(
    name = "batchQty",
    scene = "",
    nameCN = "批量数量(冗余,机构商品中定义)",
    comment = "批量数量(冗余,机构商品中定义)",
    nameEN = "batch_qty",
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
    name = "batchQty",
    value = "批量数量(冗余,机构商品中定义)",
    dataType = "",
    notes = "5b35e1719d2feff19b4427ef"
  )
  private java.math.BigDecimal batchQty;

  @FieldMeta(
    name = "batchPolicy",
    scene = "",
    nameCN = "批量政策{0:无,1:固定倍数,2:最小起订量 冗余,机构商品中定义}",
    comment = "批量政策{0:无,1:固定倍数,2:最小起订量 冗余,机构商品中定义}",
    nameEN = "batch_policy",
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
    name = "batchPolicy",
    value = "批量政策{0:无,1:固定倍数,2:最小起订量 冗余,机构商品中定义}",
    dataType = "",
    notes = "5b35e1719d2feff19b4427f6"
  )
  private Integer batchPolicy;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<SalOrderDetailDTO, Long> id_ = o -> o.getId();
    public static Function<SalOrderDetailDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<SalOrderDetailDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<SalOrderDetailDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<SalOrderDetailDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<SalOrderDetailDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<SalOrderDetailDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<SalOrderDetailDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<SalOrderDetailDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<SalOrderDetailDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<SalOrderDetailDTO, Integer> version_ = o -> o.getVersion();

    public static Function<SalOrderDetailDTO, Long> orderId_ = o -> o.getOrderId();
    public static Function<SalOrderDetailDTO, String> orderSeqno_ = o -> o.getOrderSeqno();
    public static Function<SalOrderDetailDTO, Long> entId_ = o -> o.getEntId();
    public static Function<SalOrderDetailDTO, Long> goodsVarId_ = o -> o.getGoodsVarId();
    public static Function<SalOrderDetailDTO, String> goodsVarName_ = o -> o.getGoodsVarName();
    public static Function<SalOrderDetailDTO, Long> goodsId_ = o -> o.getGoodsId();
    public static Function<SalOrderDetailDTO, String> goodsCode_ = o -> o.getGoodsCode();
    public static Function<SalOrderDetailDTO, String> goodsName_ = o -> o.getGoodsName();
    public static Function<SalOrderDetailDTO, String> goodsSpec_ = o -> o.getGoodsSpec();
    public static Function<SalOrderDetailDTO, Long> salUnitid_ = o -> o.getSalUnitid();
    public static Function<SalOrderDetailDTO, String> salUnitCode_ = o -> o.getSalUnitCode();
    public static Function<SalOrderDetailDTO, String> salUnitName_ = o -> o.getSalUnitName();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> salUnitRate_ =
        o -> o.getSalUnitRate();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> requestQty_ =
        o -> o.getRequestQty();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> maxOrderQty_ =
        o -> o.getMaxOrderQty();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> minOrderQty_ =
        o -> o.getMinOrderQty();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> price_ = o -> o.getPrice();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> discountPrice_ =
        o -> o.getDiscountPrice();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> discountRate_ =
        o -> o.getDiscountRate();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> discountAmt_ =
        o -> o.getDiscountAmt();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> taxRate_ = o -> o.getTaxRate();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> taxAmt_ = o -> o.getTaxAmt();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> goodsAmt_ =
        o -> o.getGoodsAmt();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> totalAmt_ =
        o -> o.getTotalAmt();
    public static Function<SalOrderDetailDTO, String> remark_ = o -> o.getRemark();
    public static Function<SalOrderDetailDTO, Long> conOrgId_ = o -> o.getConOrgId();
    public static Function<SalOrderDetailDTO, String> conOrgCode_ = o -> o.getConOrgCode();
    public static Function<SalOrderDetailDTO, String> conOrgName_ = o -> o.getConOrgName();
    public static Function<SalOrderDetailDTO, java.math.BigDecimal> batchQty_ =
        o -> o.getBatchQty();
    public static Function<SalOrderDetailDTO, Integer> batchPolicy_ = o -> o.getBatchPolicy();
  }

  public static ValidatorBuilder<SalOrderDetailDTO> validatorExample() {
    ValidatorBuilder<SalOrderDetailDTO> builder = new ValidatorBuilder<>();
    builder.field(conOrgId_, notNull, "发货机构ID为空");
    builder.field(conOrgCode_, notNull, "发货机构代码[冗余]为空");
    builder.field(conOrgName_, notNull, "发货机构名称[冗余]为空");
    builder.field(batchPolicy_, notNull, "批量政策{0:无,1:固定倍数,2:最小起订量 冗余,机构商品中定义}为空");
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
