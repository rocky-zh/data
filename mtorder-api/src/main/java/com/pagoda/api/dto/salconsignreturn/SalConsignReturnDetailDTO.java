package com.pagoda.api.dto.salconsignreturn;

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
import static com.pagoda.api.dto.salconsignreturn.SalConsignReturnDetailDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalConsignReturnDetail")
@ApiModel(value = "SalConsignReturnDetailDTO", description = "退货单明细表")
@EntityFeature(
  entityName = "SalConsignReturnDetailDTO",
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
public class SalConsignReturnDetailDTO extends AbstractDTO implements Serializable {

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
    name = "returnId",
    scene = "",
    nameCN = "退货单ID",
    comment = "退货单ID",
    nameEN = "return_id",
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
    name = "returnId",
    value = "退货单ID",
    dataType = "",
    notes = "5b35de169d2feff19b42dc3c"
  )
  private Long returnId;

  @FieldMeta(
    name = "returnSeqno",
    scene = "",
    nameCN = "退货单号[冗余]",
    comment = "退货单号[冗余]",
    nameEN = "return_seqno",
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
    name = "returnSeqno",
    value = "退货单号[冗余]",
    dataType = "",
    notes = "5b35de169d2feff19b42dc40"
  )
  private String returnSeqno;

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
    name = "goodsName",
    scene = "price",
    nameCN = "商品名称",
    comment = "商品名称",
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
    value = "商品名称",
    dataType = "",
    notes = "5b36e8c59d2feff19b2d96e4"
  )
  private String goodsName;

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
    name = "salRate",
    scene = "",
    nameCN = "销售单位转换比(销售单位转为基础单位转换比)",
    comment = "销售单位转换比(销售单位转为基础单位转换比)",
    nameEN = "sal_rate",
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
    name = "salRate",
    value = "销售单位转换比(销售单位转为基础单位转换比)",
    dataType = "",
    notes = "5b35de169d2feff19b42dc44"
  )
  private java.math.BigDecimal salRate;

  @FieldMeta(
    name = "salRetInDepotId",
    scene = "",
    nameCN = "默认销售退货入库库房ID",
    comment = "默认销售退货入库库房ID",
    nameEN = "sal_ret_in_depot_id",
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
    name = "salRetInDepotId",
    value = "默认销售退货入库库房ID",
    dataType = "",
    notes = "5b35de169d2feff19b42dc3e"
  )
  private Long salRetInDepotId;

  @FieldMeta(
    name = "salRetInDepotCode",
    scene = "",
    nameCN = "默认销售退货入库库房代码[冗余]",
    comment = "默认销售退货入库库房代码[冗余]",
    nameEN = "sal_ret_in_depot_code",
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
    name = "salRetInDepotCode",
    value = "默认销售退货入库库房代码[冗余]",
    dataType = "",
    notes = "5b35de169d2feff19b42dc43"
  )
  private String salRetInDepotCode;

  @FieldMeta(
    name = "salRetInDepotName",
    scene = "",
    nameCN = "默认销售退货入库库房名称[冗余]",
    comment = "默认销售退货入库库房名称[冗余]",
    nameEN = "sal_ret_in_depot_name",
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
    name = "salRetInDepotName",
    value = "默认销售退货入库库房名称[冗余]",
    dataType = "",
    notes = "5b35de169d2feff19b42dc48"
  )
  private String salRetInDepotName;

  @FieldMeta(
    name = "returnQty",
    scene = "",
    nameCN = "退货数量",
    comment = "退货数量",
    nameEN = "return_qty",
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
    name = "returnQty",
    value = "退货数量",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ea"
  )
  private java.math.BigDecimal returnQty;

  @FieldMeta(
    name = "stockinQty",
    scene = "",
    nameCN = "入库数量",
    comment = "入库数量",
    nameEN = "stockin_qty",
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
    name = "stockinQty",
    value = "入库数量",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ed"
  )
  private java.math.BigDecimal stockinQty;

  @FieldMeta(
    name = "stockinNetWeight",
    scene = "",
    nameCN = "入库净重",
    comment = "入库净重",
    nameEN = "stockin_net_weight",
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
    name = "stockinNetWeight",
    value = "入库净重",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ee"
  )
  private java.math.BigDecimal stockinNetWeight;

  @FieldMeta(
    name = "stockinGrossWeight",
    scene = "",
    nameCN = "入库毛重",
    comment = "入库毛重",
    nameEN = "stockin_gross_weight",
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
    name = "stockinGrossWeight",
    value = "入库毛重",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f0"
  )
  private java.math.BigDecimal stockinGrossWeight;

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
    name = "returnPrice",
    scene = "",
    nameCN = "退货单价",
    comment = "退货单价",
    nameEN = "return_price",
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
    name = "returnPrice",
    value = "退货单价",
    dataType = "",
    notes = "5b35de169d2feff19b42dc46"
  )
  private java.math.BigDecimal returnPrice;

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
    name = "totalReturnAmt",
    scene = "",
    nameCN = "退货总金额[=退货数量*配送单价]",
    comment = "退货总金额[=退货数量*配送单价]",
    nameEN = "total_return_amt",
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
    name = "totalReturnAmt",
    value = "退货总金额[=退货数量*配送单价]",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f6"
  )
  private java.math.BigDecimal totalReturnAmt;

  @FieldMeta(
    name = "totalStockinAmt",
    scene = "",
    nameCN = "入库总金额",
    comment = "入库总金额",
    nameEN = "total_stockin_amt",
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
    name = "totalStockinAmt",
    value = "入库总金额",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f4"
  )
  private java.math.BigDecimal totalStockinAmt;

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

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<SalConsignReturnDetailDTO, Long> _id = o -> o.getId();
    public static final Function<SalConsignReturnDetailDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<SalConsignReturnDetailDTO, Date> _createdAt =
        o -> o.getCreatedAt();
    public static final Function<SalConsignReturnDetailDTO, String> _creatorCode =
        o -> o.getCreatorCode();
    public static final Function<SalConsignReturnDetailDTO, String> _creatorName =
        o -> o.getCreatorName();
    public static final Function<SalConsignReturnDetailDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<SalConsignReturnDetailDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<SalConsignReturnDetailDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<SalConsignReturnDetailDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<SalConsignReturnDetailDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<SalConsignReturnDetailDTO, Integer> _version = o -> o.getVersion();

    public static final Function<SalConsignReturnDetailDTO, Long> _returnId = o -> o.getReturnId();
    public static final Function<SalConsignReturnDetailDTO, String> _returnSeqno =
        o -> o.getReturnSeqno();
    public static final Function<SalConsignReturnDetailDTO, Long> _entId = o -> o.getEntId();
    public static final Function<SalConsignReturnDetailDTO, Long> _goodsId = o -> o.getGoodsId();
    public static final Function<SalConsignReturnDetailDTO, String> _goodsCode =
        o -> o.getGoodsCode();
    public static final Function<SalConsignReturnDetailDTO, String> _goodsName =
        o -> o.getGoodsName();
    public static final Function<SalConsignReturnDetailDTO, String> _goodsSpec =
        o -> o.getGoodsSpec();
    public static final Function<SalConsignReturnDetailDTO, Long> _salUnitId =
        o -> o.getSalUnitId();
    public static final Function<SalConsignReturnDetailDTO, String> _salUnitCode =
        o -> o.getSalUnitCode();
    public static final Function<SalConsignReturnDetailDTO, String> _salUnitName =
        o -> o.getSalUnitName();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _salRate =
        o -> o.getSalRate();
    public static final Function<SalConsignReturnDetailDTO, Long> _salRetInDepotId =
        o -> o.getSalRetInDepotId();
    public static final Function<SalConsignReturnDetailDTO, String> _salRetInDepotCode =
        o -> o.getSalRetInDepotCode();
    public static final Function<SalConsignReturnDetailDTO, String> _salRetInDepotName =
        o -> o.getSalRetInDepotName();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _returnQty =
        o -> o.getReturnQty();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _stockinQty =
        o -> o.getStockinQty();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal>
        _stockinNetWeight = o -> o.getStockinNetWeight();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal>
        _stockinGrossWeight = o -> o.getStockinGrossWeight();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _price =
        o -> o.getPrice();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _returnPrice =
        o -> o.getReturnPrice();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _taxRate =
        o -> o.getTaxRate();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _taxAmt =
        o -> o.getTaxAmt();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _totalReturnAmt =
        o -> o.getTotalReturnAmt();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _totalStockinAmt =
        o -> o.getTotalStockinAmt();
    public static final Function<SalConsignReturnDetailDTO, String> _remark = o -> o.getRemark();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
