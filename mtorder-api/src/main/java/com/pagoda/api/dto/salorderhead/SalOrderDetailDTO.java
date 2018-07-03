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
    nameCN = "采购订单号",
    comment = "采购订单号",
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
    value = "采购订单号",
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
    nameCN = "零售商品ID",
    comment = "零售商品ID",
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
    value = "零售商品ID",
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
    nameCN = "销售单位代码[冗余]",
    comment = "销售单位代码[冗余]",
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
    value = "销售单位代码[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d974"
  )
  private String salUnitCode;

  @FieldMeta(
    name = "salUnitName",
    scene = "",
    nameCN = "销售单位名称[冗余]",
    comment = "销售单位名称[冗余]",
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
    value = "销售单位名称[冗余]",
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
    nameCN = "需求数量",
    comment = "需求数量",
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
    value = "需求数量",
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
    nameCN = "单价[根据商品信息自动带出，来源价格管理中当天的最新商品配送价格数据，不能修改]",
    comment = "单价[根据商品信息自动带出，来源价格管理中当天的最新商品配送价格数据，不能修改]",
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
    value = "单价[根据商品信息自动带出，来源价格管理中当天的最新商品配送价格数据，不能修改]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d991"
  )
  private java.math.BigDecimal price;

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
    notes = "5b35d3a69d2feff19b40d999"
  )
  private java.math.BigDecimal discountPrice;

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
    nameCN = "税金",
    comment = "税金",
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
    value = "税金",
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
    name = "sourceType",
    scene = "",
    nameCN = "订单明细来源类型",
    comment = "订单明细来源类型",
    nameEN = "source_Type",
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
    name = "sourceType",
    value = "订单明细来源类型",
    dataType = "",
    notes = "5b374ac59d2feff19ba91218"
  )
  private Integer sourceType;

  @FieldMeta(
    name = "sourceId",
    scene = "",
    nameCN = "订单明细来源Id",
    comment = "订单明细来源Id",
    nameEN = "source_Id",
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
    name = "sourceId",
    value = "订单明细来源Id",
    dataType = "",
    notes = "5b374a6b9d2feff19ba88fac"
  )
  private Long sourceId;

  @FieldMeta(
    name = "sourceNo",
    scene = "",
    nameCN = "来源单据号",
    comment = "来源单据号",
    nameEN = "source_no",
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
    name = "sourceNo",
    value = "来源单据号",
    dataType = "",
    notes = "5b35e0d49d2feff19b43e4d9"
  )
  private String sourceNo;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<SalOrderDetailDTO, Long> _id = o -> o.getId();
    public static final Function<SalOrderDetailDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<SalOrderDetailDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<SalOrderDetailDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<SalOrderDetailDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<SalOrderDetailDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<SalOrderDetailDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<SalOrderDetailDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<SalOrderDetailDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<SalOrderDetailDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<SalOrderDetailDTO, Integer> _version = o -> o.getVersion();

    public static final Function<SalOrderDetailDTO, Long> _orderId = o -> o.getOrderId();
    public static final Function<SalOrderDetailDTO, String> _orderSeqno = o -> o.getOrderSeqno();
    public static final Function<SalOrderDetailDTO, Long> _entId = o -> o.getEntId();
    public static final Function<SalOrderDetailDTO, Long> _goodsVarId = o -> o.getGoodsVarId();
    public static final Function<SalOrderDetailDTO, String> _goodsVarName =
        o -> o.getGoodsVarName();
    public static final Function<SalOrderDetailDTO, Long> _goodsId = o -> o.getGoodsId();
    public static final Function<SalOrderDetailDTO, String> _goodsCode = o -> o.getGoodsCode();
    public static final Function<SalOrderDetailDTO, String> _goodsName = o -> o.getGoodsName();
    public static final Function<SalOrderDetailDTO, String> _goodsSpec = o -> o.getGoodsSpec();
    public static final Function<SalOrderDetailDTO, Long> _salUnitid = o -> o.getSalUnitid();
    public static final Function<SalOrderDetailDTO, String> _salUnitCode = o -> o.getSalUnitCode();
    public static final Function<SalOrderDetailDTO, String> _salUnitName = o -> o.getSalUnitName();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _salUnitRate =
        o -> o.getSalUnitRate();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _requestQty =
        o -> o.getRequestQty();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _maxOrderQty =
        o -> o.getMaxOrderQty();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _minOrderQty =
        o -> o.getMinOrderQty();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _price =
        o -> o.getPrice();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _discountPrice =
        o -> o.getDiscountPrice();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _discountRate =
        o -> o.getDiscountRate();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _discountAmt =
        o -> o.getDiscountAmt();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _taxRate =
        o -> o.getTaxRate();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _taxAmt =
        o -> o.getTaxAmt();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _goodsAmt =
        o -> o.getGoodsAmt();
    public static final Function<SalOrderDetailDTO, java.math.BigDecimal> _totalAmt =
        o -> o.getTotalAmt();
    public static final Function<SalOrderDetailDTO, String> _remark = o -> o.getRemark();
    public static final Function<SalOrderDetailDTO, Integer> _sourceType = o -> o.getSourceType();
    public static final Function<SalOrderDetailDTO, Long> _sourceId = o -> o.getSourceId();
    public static final Function<SalOrderDetailDTO, String> _sourceNo = o -> o.getSourceNo();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
