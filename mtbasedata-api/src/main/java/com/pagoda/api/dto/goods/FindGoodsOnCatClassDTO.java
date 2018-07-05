package com.pagoda.api.dto.goods;

import com.pagoda.api.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import io.swagger.annotations.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "FindGoodsOnCatClassDTO", description = "分类关系->根据目录分类查找商品")
@EntityFeature(
  entityName = "FindGoodsOnCatClassDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class FindGoodsOnCatClassDTO implements Serializable {
  @FieldMeta(
    name = "goodsOrigin",
    scene = "",
    nameCN = "商品产地",
    comment = "商品产地",
    nameEN = "goods_origin",
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
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "goodsOrigin",
    value = "商品产地",
    dataType = "",
    notes = "5b35f9149d2feff19b548022"
  )
  private String goodsOrigin;

  @FieldMeta(
    name = "retUnitCode",
    scene = "",
    nameCN = "零售单位代码[冗余]",
    comment = "零售单位代码[冗余]",
    nameEN = "ret_unit_code",
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
    name = "retUnitCode",
    value = "零售单位代码[冗余]",
    dataType = "",
    notes = "5b35f9149d2feff19b54803e"
  )
  private String retUnitCode;

  @FieldMeta(
    name = "invUnitId",
    scene = "",
    nameCN = "库存单位ID",
    comment = "库存单位ID",
    nameEN = "inv_unit_id",
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
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "invUnitId",
    value = "库存单位ID",
    dataType = "",
    notes = "5b35f9149d2feff19b54802d"
  )
  private Long invUnitId;

  @FieldMeta(
    name = "invUnitName",
    scene = "",
    nameCN = "库存单位名称[冗余]",
    comment = "库存单位名称[冗余]",
    nameEN = "inv_unit_name",
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
    name = "invUnitName",
    value = "库存单位名称[冗余]",
    dataType = "",
    notes = "5b35f9149d2feff19b54802a"
  )
  private String invUnitName;

  @FieldMeta(
    name = "taxRate",
    scene = "",
    nameCN = "机构商品税率",
    comment = "机构商品税率",
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
    value = "机构商品税率",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d98f"
  )
  private java.math.BigDecimal taxRate;

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
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    dataType = "",
    notes = "5b35d7329d2feff19b413991"
  )
  private Long basUnitId;

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
    dataType = "",
    notes = "5b35d7329d2feff19b413980"
  )
  private Long purUnitId;

  @FieldMeta(
    name = "enName",
    scene = "",
    nameCN = "商品英文名称",
    comment = "商品英文名称",
    nameEN = "en_name",
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
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "enName",
    value = "商品英文名称",
    dataType = "",
    notes = "5b35f9149d2feff19b548029"
  )
  private String enName;

  @FieldMeta(
    name = "basUnitCode",
    scene = "",
    nameCN = "基础计量单位代码[冗余]",
    comment = "基础计量单位代码[冗余]",
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
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    value = "基础计量单位代码[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b41398f"
  )
  private String basUnitCode;

  @FieldMeta(
    name = "id",
    scene = "",
    nameCN = "主键id",
    comment = "主键id",
    nameEN = "",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "id", value = "主键id", dataType = "", notes = "")
  private Long id;

  @FieldMeta(
    name = "searchWord",
    scene = "",
    nameCN = "搜索关键词(存储名称首字母)",
    comment = "搜索关键词(存储名称首字母)",
    nameEN = "search_word",
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
    name = "searchWord",
    value = "搜索关键词(存储名称首字母)",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d5"
  )
  private String searchWord;

  @FieldMeta(
    name = "barcode",
    scene = "",
    nameCN = "条码(1对1条码，多对多条码在bas_productvar_barcode表中)",
    comment = "条码(1对1条码，多对多条码在bas_productvar_barcode表中)",
    nameEN = "barcode",
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
    name = "barcode",
    value = "条码(1对1条码，多对多条码在bas_productvar_barcode表中)",
    dataType = "",
    notes = "5b35f9149d2feff19b54804a"
  )
  private String barcode;

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
    name = "isSale",
    scene = "",
    nameCN = "是否允许销售(b2b用)",
    comment = "是否允许销售(b2b用)",
    nameEN = "is_sale",
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
    visible = false,
    defaultValue = "1",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isSale",
    value = "是否允许销售(b2b用)",
    dataType = "",
    notes = "5b35e1719d2feff19b4427f8"
  )
  private Integer isSale;

  @FieldMeta(
    name = "isRet",
    scene = "",
    nameCN = "是否零售(b2c用，另因按订单退，故无需是否允许退货)",
    comment = "是否零售(b2c用，另因按订单退，故无需是否允许退货)",
    nameEN = "is_ret",
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
    visible = false,
    defaultValue = "1",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isRet",
    value = "是否零售(b2c用，另因按订单退，故无需是否允许退货)",
    dataType = "",
    notes = "5b35e1719d2feff19b442804"
  )
  private Integer isRet;

  @FieldMeta(
    name = "shelfLifeQty",
    scene = "",
    nameCN = "保质期数量",
    comment = "保质期数量",
    nameEN = "shelf_life_qty",
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
    name = "shelfLifeQty",
    value = "保质期数量",
    dataType = "",
    notes = "5b35f9149d2feff19b54804e"
  )
  private java.math.BigDecimal shelfLifeQty;

  @FieldMeta(
    name = "shelfLifeType",
    scene = "",
    nameCN = "保质期类型{0:无,1:天,2:月,3:年}",
    comment = "保质期类型{0:无,1:天,2:月,3:年}",
    nameEN = "shelf_life_type",
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
    name = "shelfLifeType",
    value = "保质期类型{0:无,1:天,2:月,3:年}",
    dataType = "",
    notes = "5b35f9149d2feff19b54804b"
  )
  private Integer shelfLifeType;

  @FieldMeta(
    name = "modifierOrgCode",
    scene = "",
    nameCN = "最后修改人机构代码",
    comment = "最后修改人机构代码",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "modifierOrgCode", value = "最后修改人机构代码", dataType = "", notes = "")
  private String modifierOrgCode;

  @FieldMeta(
    name = "version",
    scene = "",
    nameCN = "版本号",
    comment = "版本号",
    nameEN = "version",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = false,
    canQuery = false,
    readOnly = true,
    required = false,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(
    name = "version",
    value = "版本号",
    dataType = "",
    notes = "5b36e6869d2feff19b2b44ec"
  )
  private Integer version;

  @FieldMeta(
    name = "fullName",
    scene = "",
    nameCN = "全名[水果-苹果-苹果A]",
    comment = "全名[水果-苹果-苹果A]",
    nameEN = "full_name",
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
    name = "fullName",
    value = "全名[水果-苹果-苹果A]",
    dataType = "",
    notes = "5b35f6ae9d2feff19b5287f2"
  )
  private String fullName;

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
    name = "basUnitName",
    value = "基本单位名称[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b41398d"
  )
  private String basUnitName;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "产成商品名",
    comment = "产成商品名",
    nameEN = "name",
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
    name = "name",
    value = "产成商品名",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d3"
  )
  private String name;

  @FieldMeta(
    name = "shortName",
    scene = "",
    nameCN = "商品简称",
    comment = "商品简称",
    nameEN = "short_name",
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
    name = "shortName",
    value = "商品简称",
    dataType = "",
    notes = "5b35f9149d2feff19b548024"
  )
  private String shortName;

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
    name = "creatorOrgCode",
    scene = "",
    nameCN = "录入人机构代码",
    comment = "录入人机构代码",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "creatorOrgCode", value = "录入人机构代码", dataType = "", notes = "")
  private String creatorOrgCode;

  @FieldMeta(
    name = "modifierName",
    scene = "",
    nameCN = "最后修改人名称",
    comment = "最后修改人名称",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "modifierName", value = "最后修改人名称", dataType = "", notes = "")
  private String modifierName;

  @FieldMeta(
    name = "code",
    scene = "",
    nameCN = "行政单位代码",
    comment = "行政单位代码",
    nameEN = "code",
    type = "字符串",
    format = "",
    displayLen = 32,
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
    name = "code",
    value = "行政单位代码",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3cf"
  )
  private String code;

  @FieldMeta(
    name = "retRate",
    scene = "",
    nameCN = "零售单位转换比(零售单位转为基础单位转换比)",
    comment = "零售单位转换比(零售单位转为基础单位转换比)",
    nameEN = "ret_rate",
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
    name = "retRate",
    value = "零售单位转换比(零售单位转为基础单位转换比)",
    dataType = "",
    notes = "5b35f9149d2feff19b548042"
  )
  private java.math.BigDecimal retRate;

  @FieldMeta(
    name = "purUnitName",
    scene = "",
    nameCN = "采购计量单位名称[冗余]",
    comment = "采购计量单位名称[冗余]",
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
    value = "采购计量单位名称[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b413987"
  )
  private String purUnitName;

  @FieldMeta(
    name = "createdAt",
    scene = "",
    nameCN = "录入时间",
    comment = "录入时间",
    nameEN = "",
    type = "时间",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "createdAt", value = "录入时间", dataType = "", notes = "")
  private java.util.Date createdAt;

  @FieldMeta(
    name = "lastModifiedAt",
    scene = "",
    nameCN = "最后修改时间",
    comment = "最后修改时间",
    nameEN = "",
    type = "时间",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "lastModifiedAt", value = "最后修改时间", dataType = "", notes = "")
  private java.util.Date lastModifiedAt;

  @FieldMeta(
    name = "isEnabled",
    scene = "",
    nameCN = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
    comment = "是否可用",
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
    required = true,
    visible = true,
    defaultValue = "1",
    tag = "",
    sortable = false,
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
    value = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d1"
  )
  private Integer isEnabled;

  @FieldMeta(
    name = "isPur",
    scene = "",
    nameCN = "是否可订(采购)[采购按主商品采购]",
    comment = "是否可订(采购)[采购按主商品采购]",
    nameEN = "is_pur",
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
    visible = false,
    defaultValue = "1",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isPur",
    value = "是否可订(采购)[采购按主商品采购]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427d8"
  )
  private Integer isPur;

  @FieldMeta(
    name = "retUnitId",
    scene = "",
    nameCN = "零售单位ID",
    comment = "零售单位ID",
    nameEN = "ret_unit_id",
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
    name = "retUnitId",
    value = "零售单位ID",
    dataType = "",
    notes = "5b35f9149d2feff19b548038"
  )
  private Long retUnitId;

  @FieldMeta(
    name = "traditName",
    scene = "",
    nameCN = "商品繁体名称",
    comment = "商品繁体名称",
    nameEN = "tradit_name",
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
    name = "traditName",
    value = "商品繁体名称",
    dataType = "",
    notes = "5b35f9149d2feff19b548023"
  )
  private String traditName;

  @FieldMeta(
    name = "creatorCode",
    scene = "",
    nameCN = "录入人代码",
    comment = "录入人代码",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "creatorCode", value = "录入人代码", dataType = "", notes = "")
  private String creatorCode;

  @FieldMeta(
    name = "purRate",
    scene = "",
    nameCN = "采购单位转换比(采购单位转为基础单位转换比)",
    comment = "采购单位转换比(采购单位转为基础单位转换比)",
    nameEN = "pur_rate",
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
    name = "purRate",
    value = "采购单位转换比(采购单位转为基础单位转换比)",
    dataType = "",
    notes = "5b35f9149d2feff19b54803a"
  )
  private java.math.BigDecimal purRate;

  @FieldMeta(
    name = "isEntLot",
    scene = "",
    nameCN = "是否管理批次(企业级)",
    comment = "是否管理批次(企业级)",
    nameEN = "is_ent_lot",
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
    visible = false,
    defaultValue = "0",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "isEntLot",
    value = "是否管理批次(企业级)",
    dataType = "",
    notes = "5b35f9149d2feff19b548044"
  )
  private Integer isEntLot;

  @FieldMeta(
    name = "retUnitName",
    scene = "",
    nameCN = "零售单位名称[冗余]",
    comment = "零售单位名称[冗余]",
    nameEN = "ret_unit_name",
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
    name = "retUnitName",
    value = "零售单位名称[冗余]",
    dataType = "",
    notes = "5b35f9149d2feff19b548040"
  )
  private String retUnitName;

  @FieldMeta(
    name = "entId",
    scene = "",
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
    notes = "5b35d1c89d2feff19b40c205"
  )
  private Long entId;

  @FieldMeta(
    name = "goodsLevel",
    scene = "",
    nameCN = "商品等级{1:招牌,2:珍稀,3:A,4:B,5:C}",
    comment = "商品等级{1:招牌,2:珍稀,3:A,4:B,5:C}",
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
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    value = "商品等级{1:招牌,2:珍稀,3:A,4:B,5:C}",
    dataType = "",
    notes = "5b35f9149d2feff19b548031"
  )
  private Integer goodsLevel;

  @FieldMeta(
    name = "deleted",
    scene = "",
    nameCN = "软删除标记",
    comment = "软删除标记",
    nameEN = "",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "deleted", value = "软删除标记", dataType = "", notes = "")
  private Long deleted;

  @FieldMeta(
    name = "invUnitCode",
    scene = "",
    nameCN = "库存单位代码[冗余]",
    comment = "库存单位代码[冗余]",
    nameEN = "inv_unit_code",
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
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "invUnitCode",
    value = "库存单位代码[冗余]",
    dataType = "",
    notes = "5b35f9149d2feff19b548032"
  )
  private String invUnitCode;

  @FieldMeta(
    name = "modifierCode",
    scene = "",
    nameCN = "最后修改人代码",
    comment = "最后修改人代码",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "modifierCode", value = "最后修改人代码", dataType = "", notes = "")
  private String modifierCode;

  @FieldMeta(
    name = "invRate",
    scene = "",
    nameCN = "库存单位转换比(库存单位转为基础单位转换比)",
    comment = "库存单位转换比(库存单位转为基础单位转换比)",
    nameEN = "inv_rate",
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
    name = "invRate",
    value = "库存单位转换比(库存单位转为基础单位转换比)",
    dataType = "",
    notes = "5b35f9149d2feff19b548036"
  )
  private java.math.BigDecimal invRate;

  @FieldMeta(
    name = "creatorName",
    scene = "",
    nameCN = "录入人名称",
    comment = "录入人名称",
    nameEN = "",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = false,
    readOnly = true,
    required = true,
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = -1
  )
  @ApiModelProperty(name = "creatorName", value = "录入人名称", dataType = "", notes = "")
  private String creatorName;

  @FieldMeta(
    name = "goodsType",
    scene = "",
    nameCN = "商品类型{可选值集数据字典}",
    comment = "商品类型{可选值集数据字典}",
    nameEN = "goods_type",
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
    visible = false,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "goodsType",
    value = "商品类型{可选值集数据字典}",
    dataType = "",
    notes = "5b35f9149d2feff19b54802e"
  )
  private Integer goodsType;

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
    name = "salUnitName",
    value = "销售单位名称[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d97a"
  )
  private String salUnitName;

  @FieldMeta(
    name = "purUnitCode",
    scene = "",
    nameCN = "采购计量单位代码[冗余]",
    comment = "采购计量单位代码[冗余]",
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
    value = "采购计量单位代码[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b41398b"
  )
  private String purUnitCode;

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
    name = "unitVolume",
    scene = "",
    nameCN = "基础单位体积,填入的体积单位为L,用于运输使用",
    comment = "基础单位体积,填入的体积单位为L,用于运输使用",
    nameEN = "unit_volume",
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
    name = "unitVolume",
    value = "基础单位体积,填入的体积单位为L,用于运输使用",
    dataType = "",
    notes = "5b35f9149d2feff19b54803f"
  )
  private java.math.BigDecimal unitVolume;

  @FieldMeta(
    name = "unitWeight",
    scene = "",
    nameCN = "基础单位重量,填入的重量单位为KG,用于运输使用",
    comment = "基础单位重量,填入的重量单位为KG,用于运输使用",
    nameEN = "unit_weight",
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
    name = "unitWeight",
    value = "基础单位重量,填入的重量单位为KG,用于运输使用",
    dataType = "",
    notes = "5b35f9149d2feff19b548046"
  )
  private java.math.BigDecimal unitWeight;
}
