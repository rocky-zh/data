package com.pagoda.api.dto.ven;

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
import static com.pagoda.api.dto.ven.PurOrgVenGoodsDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.PurOrgVenGoods")
@ApiModel(value = "PurOrgVenGoodsDTO", description = "供应商机构商品 ")
@EntityFeature(
  entityName = "PurOrgVenGoodsDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = true,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = true
)
public class PurOrgVenGoodsDTO extends AbstractDTO implements Serializable {

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
    name = "unitRate",
    scene = "",
    nameCN = "报价单位系数[冗余]",
    comment = "报价单位系数[冗余]",
    nameEN = "unit_rate",
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
    name = "unitRate",
    value = "报价单位系数[冗余]",
    dataType = "",
    notes = "5b35e43a9d2feff19b459d18"
  )
  private java.math.BigDecimal unitRate;

  @FieldMeta(
    name = "billTaxRate",
    scene = "",
    nameCN = "进项税率(供应商销项税率)",
    comment = "进项税率(供应商销项税率)",
    nameEN = "bill_tax_rate",
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
    name = "billTaxRate",
    value = "进项税率(供应商销项税率)",
    dataType = "",
    notes = "5b35e43a9d2feff19b459d19"
  )
  private java.math.BigDecimal billTaxRate;

  @FieldMeta(
    name = "discountTaxRate",
    scene = "",
    nameCN = "可抵扣税率",
    comment = "可抵扣税率",
    nameEN = "discount_tax_rate",
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
    name = "discountTaxRate",
    value = "可抵扣税率",
    dataType = "",
    notes = "5b35e43a9d2feff19b459d21"
  )
  private java.math.BigDecimal discountTaxRate;

  @FieldMeta(
    name = "taxType",
    scene = "",
    nameCN = "税金类型",
    comment = "税金类型",
    nameEN = "tax_type",
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
    name = "taxType",
    value = "税金类型",
    dataType = "",
    notes = "5b35e43a9d2feff19b459d1f"
  )
  private Integer taxType;

  @FieldMeta(
    name = "isAllowReturn",
    scene = "",
    nameCN = "是否可退",
    comment = "是否可退",
    nameEN = "is_allow_return",
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
    name = "isAllowReturn",
    value = "是否可退",
    dataType = "",
    notes = "5b35e43a9d2feff19b459d1d"
  )
  private Integer isAllowReturn;

  @FieldMeta(
    name = "purDepotId",
    scene = "",
    nameCN = "默认采购库房ID",
    comment = "默认采购库房ID",
    nameEN = "pur_depot_id",
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
    name = "purDepotId",
    value = "默认采购库房ID",
    dataType = "",
    notes = "5b35e43a9d2feff19b459d1b"
  )
  private Long purDepotId;

  @FieldMeta(
    name = "venOrgId",
    scene = "",
    nameCN = "供应商ID",
    comment = "供应商ID",
    nameEN = "ven_org_id",
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
    name = "venOrgId",
    value = "供应商ID",
    dataType = "",
    notes = "5b35e3d59d2feff19b455eac"
  )
  private Long venOrgId;

  @FieldMeta(
    name = "venOrgCode",
    scene = "",
    nameCN = "供应商代码[冗余]",
    comment = "供应商代码[冗余]",
    nameEN = "ven_org_code",
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
    name = "venOrgCode",
    value = "供应商代码[冗余]",
    dataType = "",
    notes = "5b35e3d59d2feff19b455eb1"
  )
  private String venOrgCode;

  @FieldMeta(
    name = "venOrgName",
    scene = "",
    nameCN = "供应商名称[冗余]",
    comment = "供应商名称[冗余]",
    nameEN = "ven_org_name",
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
    name = "venOrgName",
    value = "供应商名称[冗余]",
    dataType = "",
    notes = "5b35e3d59d2feff19b455eb3"
  )
  private String venOrgName;

  @FieldMeta(
    name = "orgOrgId",
    scene = "",
    nameCN = "机构ID ",
    comment = "机构ID ",
    nameEN = "org_org_id",
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
    name = "orgOrgId",
    value = "机构ID ",
    dataType = "",
    notes = "5b35de739d2feff19b42fe5f"
  )
  private Long orgOrgId;

  @FieldMeta(
    name = "orgOrgCode",
    scene = "",
    nameCN = "机构代码[冗余]",
    comment = "机构代码[冗余]",
    nameEN = "org_org_code",
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
    name = "orgOrgCode",
    value = "机构代码[冗余]",
    dataType = "",
    notes = "5b35de739d2feff19b42fe61"
  )
  private String orgOrgCode;

  @FieldMeta(
    name = "orgOrgName",
    scene = "",
    nameCN = "机构名称[冗余]",
    comment = "机构名称[冗余]",
    nameEN = "org_org_name",
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
    name = "orgOrgName",
    value = "机构名称[冗余]",
    dataType = "",
    notes = "5b35de739d2feff19b42fe5e"
  )
  private String orgOrgName;

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
    notes = "5b35d3a69d2feff19b40d972"
  )
  private String goodsCode;

  @FieldMeta(
    name = "goodsName",
    scene = "",
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
    name = "goodsClassName",
    scene = "",
    nameCN = "商品分类名称[冗余]",
    comment = "商品分类名称[冗余]",
    nameEN = "goods_class_name",
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
    name = "goodsClassName",
    value = "商品分类名称[冗余]",
    dataType = "",
    notes = "5b35e3459d2feff19b450fa4"
  )
  private String goodsClassName;

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
    name = "unitId",
    scene = "",
    nameCN = "计量单位ID",
    comment = "计量单位ID",
    nameEN = "unit_id",
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
    name = "unitId",
    value = "计量单位ID",
    dataType = "",
    notes = "5b35e3459d2feff19b450fa6"
  )
  private Long unitId;

  @FieldMeta(
    name = "unitCode",
    scene = "",
    nameCN = "计量单位代码[冗余]",
    comment = "计量单位代码[冗余]",
    nameEN = "unit_code",
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
    name = "unitCode",
    value = "计量单位代码[冗余]",
    dataType = "",
    notes = "5b35e3459d2feff19b450fa8"
  )
  private String unitCode;

  @FieldMeta(
    name = "unitName",
    scene = "",
    nameCN = "计量单位名称[冗余]",
    comment = "计量单位名称[冗余]",
    nameEN = "unit_name",
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
    name = "unitName",
    value = "计量单位名称[冗余]",
    dataType = "",
    notes = "5b35e3459d2feff19b450fab"
  )
  private String unitName;

  @FieldMeta(
    name = "price",
    scene = "",
    nameCN = "报价(采购价)",
    comment = "报价(采购价)",
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
    value = "报价(采购价)",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d991"
  )
  private java.math.BigDecimal price;

  @FieldMeta(
    name = "isDefault",
    scene = "",
    nameCN = "是否主商品",
    comment = "是否主商品",
    nameEN = "is_default",
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
    name = "isDefault",
    value = "是否主商品",
    dataType = "",
    notes = "5b35de739d2feff19b42fe65"
  )
  private Integer isDefault;

  @FieldMeta(
    name = "isEnabled",
    scene = "",
    nameCN = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
    comment = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
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
    value = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d1"
  )
  private Integer isEnabled;

  @FieldMeta(
    name = "isAllowOrder",
    scene = "",
    nameCN = "是否可订",
    comment = "是否可订",
    nameEN = "is_allow_order",
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
    name = "isAllowOrder",
    value = "是否可订",
    dataType = "",
    notes = "5b35e4069d2feff19b457ce3"
  )
  private Integer isAllowOrder;

  @FieldMeta(
    name = "isAllowRec",
    scene = "",
    nameCN = "是否可进",
    comment = "是否可进",
    nameEN = "is_allow_rec",
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
    name = "isAllowRec",
    value = "是否可进",
    dataType = "",
    notes = "5b35e4069d2feff19b457ce6"
  )
  private Integer isAllowRec;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<PurOrgVenGoodsDTO, Long> _id = o -> o.getId();
    public static final Function<PurOrgVenGoodsDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<PurOrgVenGoodsDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<PurOrgVenGoodsDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<PurOrgVenGoodsDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<PurOrgVenGoodsDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<PurOrgVenGoodsDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<PurOrgVenGoodsDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<PurOrgVenGoodsDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<PurOrgVenGoodsDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<PurOrgVenGoodsDTO, Integer> _version = o -> o.getVersion();

    public static final Function<PurOrgVenGoodsDTO, java.math.BigDecimal> _unitRate =
        o -> o.getUnitRate();
    public static final Function<PurOrgVenGoodsDTO, java.math.BigDecimal> _billTaxRate =
        o -> o.getBillTaxRate();
    public static final Function<PurOrgVenGoodsDTO, java.math.BigDecimal> _discountTaxRate =
        o -> o.getDiscountTaxRate();
    public static final Function<PurOrgVenGoodsDTO, Integer> _taxType = o -> o.getTaxType();
    public static final Function<PurOrgVenGoodsDTO, Integer> _isAllowReturn =
        o -> o.getIsAllowReturn();
    public static final Function<PurOrgVenGoodsDTO, Long> _purDepotId = o -> o.getPurDepotId();
    public static final Function<PurOrgVenGoodsDTO, Long> _venOrgId = o -> o.getVenOrgId();
    public static final Function<PurOrgVenGoodsDTO, String> _venOrgCode = o -> o.getVenOrgCode();
    public static final Function<PurOrgVenGoodsDTO, String> _venOrgName = o -> o.getVenOrgName();
    public static final Function<PurOrgVenGoodsDTO, Long> _orgOrgId = o -> o.getOrgOrgId();
    public static final Function<PurOrgVenGoodsDTO, String> _orgOrgCode = o -> o.getOrgOrgCode();
    public static final Function<PurOrgVenGoodsDTO, String> _orgOrgName = o -> o.getOrgOrgName();
    public static final Function<PurOrgVenGoodsDTO, Long> _goodsId = o -> o.getGoodsId();
    public static final Function<PurOrgVenGoodsDTO, String> _goodsCode = o -> o.getGoodsCode();
    public static final Function<PurOrgVenGoodsDTO, String> _goodsName = o -> o.getGoodsName();
    public static final Function<PurOrgVenGoodsDTO, String> _goodsSpec = o -> o.getGoodsSpec();
    public static final Function<PurOrgVenGoodsDTO, String> _goodsClassName =
        o -> o.getGoodsClassName();
    public static final Function<PurOrgVenGoodsDTO, String> _basUnitName = o -> o.getBasUnitName();
    public static final Function<PurOrgVenGoodsDTO, Long> _unitId = o -> o.getUnitId();
    public static final Function<PurOrgVenGoodsDTO, String> _unitCode = o -> o.getUnitCode();
    public static final Function<PurOrgVenGoodsDTO, String> _unitName = o -> o.getUnitName();
    public static final Function<PurOrgVenGoodsDTO, java.math.BigDecimal> _price =
        o -> o.getPrice();
    public static final Function<PurOrgVenGoodsDTO, Integer> _isDefault = o -> o.getIsDefault();
    public static final Function<PurOrgVenGoodsDTO, Integer> _isEnabled = o -> o.getIsEnabled();
    public static final Function<PurOrgVenGoodsDTO, Integer> _isAllowOrder =
        o -> o.getIsAllowOrder();
    public static final Function<PurOrgVenGoodsDTO, Integer> _isAllowRec = o -> o.getIsAllowRec();
  }

  public static ValidatorBuilder<PurOrgVenGoodsDTO> validatorExample() {
    ValidatorBuilder<PurOrgVenGoodsDTO> builder = new ValidatorBuilder();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
