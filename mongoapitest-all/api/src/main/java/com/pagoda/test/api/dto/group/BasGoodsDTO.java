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
import static com.pagoda.test.api.dto.group.BasGoodsDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasGoods")
@ApiModel(value = "BasGoodsDTO", description = "商品定义")
@EntityFeature(
  entityName = "BasGoodsDTO",
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
public class BasGoodsDTO extends AbstractDTO implements Serializable {

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
    name = "code",
    scene = "",
    nameCN = "商品代码[goodsCode]",
    comment = "商品代码[goodsCode]",
    nameEN = "code",
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
    name = "code",
    value = "商品代码[goodsCode]",
    dataType = "",
    notes = "5b4c7b9877604a00016948ad"
  )
  private String code;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "商品名称[goodsName]",
    comment = "商品名称[goodsName]",
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
    value = "商品名称[goodsName]",
    dataType = "",
    notes = "5b4c7b9877604a00016948af"
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
    notes = "5b4c7b9877604a00016948b1"
  )
  private String shortName;

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
    notes = "5b4c7b9977604a00016948b3"
  )
  private String traditName;

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
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    notes = "5b4c7b9977604a00016948b5"
  )
  private String enName;

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
    notes = "5b4c7b9977604a00016948b9"
  )
  private String goodsSpec;

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
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    notes = "5b4c7b9977604a00016948bb"
  )
  private String goodsOrigin;

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
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    notes = "5b4c7b9977604a00016948bd"
  )
  private Integer goodsLevel;

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
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    notes = "5b4c7b9977604a00016948bf"
  )
  private Integer goodsType;

  @FieldMeta(
    name = "searchWord",
    scene = "",
    nameCN = "搜索关键词,多个关键词用逗号隔开,用户自定义",
    comment = "搜索关键词,多个关键词用逗号隔开,用户自定义",
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
    value = "搜索关键词,多个关键词用逗号隔开,用户自定义",
    dataType = "",
    notes = "5b4c7b9977604a00016948c1"
  )
  private String searchWord;

  @FieldMeta(
    name = "mnemWord",
    scene = "",
    nameCN = "助记词",
    comment = "助记词",
    nameEN = "mnem_word",
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
    name = "mnemWord",
    value = "助记词",
    dataType = "",
    notes = "5b4c7b9977604a00016948c3"
  )
  private String mnemWord;

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
    notes = "5b4c7b9977604a00016948c5"
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
    notes = "5b4c7b9977604a00016948c7"
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
    notes = "5b4c7b9977604a00016948c9"
  )
  private String basUnitName;

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
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    notes = "5b4c7b9977604a00016948cb"
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
    notes = "5b4c7b9977604a00016948cd"
  )
  private String invUnitName;

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
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    notes = "5b4c7b9977604a00016948cf"
  )
  private String invUnitCode;

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
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    notes = "5b4c7b9977604a00016948d1"
  )
  private java.math.BigDecimal invRate;

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
    notes = "5b4c7b9977604a00016948d3"
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
    notes = "5b4c7b9977604a00016948d5"
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
    notes = "5b4c7b9977604a00016948d7"
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
    notes = "5b4c7b9977604a00016948d9"
  )
  private java.math.BigDecimal salRate;

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
    notes = "5b4c7b9977604a00016948db"
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
    notes = "5b4c7b9977604a00016948dd"
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
    notes = "5b4c7b9977604a00016948df"
  )
  private String purUnitName;

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
    notes = "5b4c7b9977604a00016948e1"
  )
  private java.math.BigDecimal purRate;

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
    notes = "5b4c7b9977604a00016948e3"
  )
  private Long retUnitId;

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
    notes = "5b4c7b9977604a00016948e5"
  )
  private String retUnitCode;

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
    notes = "5b4c7b9977604a00016948e7"
  )
  private String retUnitName;

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
    notes = "5b4c7b9977604a00016948e9"
  )
  private java.math.BigDecimal retRate;

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
    notes = "5b4c7b9977604a00016948eb"
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
    notes = "5b4c7b9977604a00016948ed"
  )
  private java.math.BigDecimal unitWeight;

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
    notes = "5b4c7b9977604a00016948ef"
  )
  private String barcode;

  @FieldMeta(
    name = "taxRate",
    scene = "",
    nameCN = "企业级销项税率",
    comment = "企业级销项税率",
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
    value = "企业级销项税率",
    dataType = "",
    notes = "5b4c7b9977604a00016948f1"
  )
  private java.math.BigDecimal taxRate;

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
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    notes = "5b4c7b9977604a00016948f3"
  )
  private Integer isEntLot;

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
    notes = "5b4c7b9977604a00016948f5"
  )
  private Integer shelfLifeType;

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
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    notes = "5b4c7b9977604a00016948f7"
  )
  private java.math.BigDecimal shelfLifeQty;

  @FieldMeta(
    name = "isEnabled",
    scene = "",
    nameCN =
        "是否可用标识:              1.设置为不可用，必须在系统相关中去掉此库房关联                 (1)去掉机构项目中对于此库房的挂接。（供应商项目管理和销售发货机构项目管理）                 (2)库房内商品库存量必须都为0              ",
    comment =
        "是否可用标识:              1.设置为不可用，必须在系统相关中去掉此库房关联                 (1)去掉机构项目中对于此库房的挂接。（供应商项目管理和销售发货机构项目管理）                 (2)库房内商品库存量必须都为0              ",
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
    value =
        "是否可用标识:              1.设置为不可用，必须在系统相关中去掉此库房关联                 (1)去掉机构项目中对于此库房的挂接。（供应商项目管理和销售发货机构项目管理）                 (2)库房内商品库存量必须都为0              ",
    dataType = "",
    notes = "5b4c7b9977604a00016948f9"
  )
  private Integer isEnabled;

  @FieldMeta(
    name = "isPur",
    scene = "",
    nameCN = "是否可采购",
    comment = "是否可采购",
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
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    value = "是否可采购",
    dataType = "",
    notes = "5b4c7b9977604a00016948fb"
  )
  private Integer isPur;

  @FieldMeta(
    name = "isSale",
    scene = "",
    nameCN = "是否可销售(百果园销售给门店)",
    comment = "是否可销售(百果园销售给门店)",
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
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    value = "是否可销售(百果园销售给门店)",
    dataType = "",
    notes = "5b4c7b9977604a00016948fd"
  )
  private Integer isSale;

  @FieldMeta(
    name = "isRet",
    scene = "",
    nameCN = "是否可零售(门店销售给会员)",
    comment = "是否可零售(门店销售给会员)",
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
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
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
    value = "是否可零售(门店销售给会员)",
    dataType = "",
    notes = "5b4c7b9977604a00016948ff"
  )
  private Integer isRet;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<BasGoodsDTO, Long> id_ = o -> o.getId();
    public static Function<BasGoodsDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<BasGoodsDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<BasGoodsDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<BasGoodsDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<BasGoodsDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<BasGoodsDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<BasGoodsDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<BasGoodsDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<BasGoodsDTO, String> modifierOrgCode_ = o -> o.getModifierOrgCode();

    public static Function<BasGoodsDTO, Integer> version_ = o -> o.getVersion();

    public static Function<BasGoodsDTO, String> code_ = o -> o.getCode();
    public static Function<BasGoodsDTO, String> name_ = o -> o.getName();
    public static Function<BasGoodsDTO, String> shortName_ = o -> o.getShortName();
    public static Function<BasGoodsDTO, String> traditName_ = o -> o.getTraditName();
    public static Function<BasGoodsDTO, String> enName_ = o -> o.getEnName();
    public static Function<BasGoodsDTO, Long> entId_ = o -> o.getEntId();
    public static Function<BasGoodsDTO, String> goodsSpec_ = o -> o.getGoodsSpec();
    public static Function<BasGoodsDTO, String> goodsOrigin_ = o -> o.getGoodsOrigin();
    public static Function<BasGoodsDTO, Integer> goodsLevel_ = o -> o.getGoodsLevel();
    public static Function<BasGoodsDTO, Integer> goodsType_ = o -> o.getGoodsType();
    public static Function<BasGoodsDTO, String> searchWord_ = o -> o.getSearchWord();
    public static Function<BasGoodsDTO, String> mnemWord_ = o -> o.getMnemWord();
    public static Function<BasGoodsDTO, Long> basUnitId_ = o -> o.getBasUnitId();
    public static Function<BasGoodsDTO, String> basUnitCode_ = o -> o.getBasUnitCode();
    public static Function<BasGoodsDTO, String> basUnitName_ = o -> o.getBasUnitName();
    public static Function<BasGoodsDTO, Long> invUnitId_ = o -> o.getInvUnitId();
    public static Function<BasGoodsDTO, String> invUnitName_ = o -> o.getInvUnitName();
    public static Function<BasGoodsDTO, String> invUnitCode_ = o -> o.getInvUnitCode();
    public static Function<BasGoodsDTO, java.math.BigDecimal> invRate_ = o -> o.getInvRate();
    public static Function<BasGoodsDTO, Long> salUnitId_ = o -> o.getSalUnitId();
    public static Function<BasGoodsDTO, String> salUnitCode_ = o -> o.getSalUnitCode();
    public static Function<BasGoodsDTO, String> salUnitName_ = o -> o.getSalUnitName();
    public static Function<BasGoodsDTO, java.math.BigDecimal> salRate_ = o -> o.getSalRate();
    public static Function<BasGoodsDTO, Long> purUnitId_ = o -> o.getPurUnitId();
    public static Function<BasGoodsDTO, String> purUnitCode_ = o -> o.getPurUnitCode();
    public static Function<BasGoodsDTO, String> purUnitName_ = o -> o.getPurUnitName();
    public static Function<BasGoodsDTO, java.math.BigDecimal> purRate_ = o -> o.getPurRate();
    public static Function<BasGoodsDTO, Long> retUnitId_ = o -> o.getRetUnitId();
    public static Function<BasGoodsDTO, String> retUnitCode_ = o -> o.getRetUnitCode();
    public static Function<BasGoodsDTO, String> retUnitName_ = o -> o.getRetUnitName();
    public static Function<BasGoodsDTO, java.math.BigDecimal> retRate_ = o -> o.getRetRate();
    public static Function<BasGoodsDTO, java.math.BigDecimal> unitVolume_ = o -> o.getUnitVolume();
    public static Function<BasGoodsDTO, java.math.BigDecimal> unitWeight_ = o -> o.getUnitWeight();
    public static Function<BasGoodsDTO, String> barcode_ = o -> o.getBarcode();
    public static Function<BasGoodsDTO, java.math.BigDecimal> taxRate_ = o -> o.getTaxRate();
    public static Function<BasGoodsDTO, Integer> isEntLot_ = o -> o.getIsEntLot();
    public static Function<BasGoodsDTO, Integer> shelfLifeType_ = o -> o.getShelfLifeType();
    public static Function<BasGoodsDTO, java.math.BigDecimal> shelfLifeQty_ =
        o -> o.getShelfLifeQty();
    public static Function<BasGoodsDTO, Integer> isEnabled_ = o -> o.getIsEnabled();
    public static Function<BasGoodsDTO, Integer> isPur_ = o -> o.getIsPur();
    public static Function<BasGoodsDTO, Integer> isSale_ = o -> o.getIsSale();
    public static Function<BasGoodsDTO, Integer> isRet_ = o -> o.getIsRet();
  }

  public static ValidatorBuilder<BasGoodsDTO> validatorExample() {
    ValidatorBuilder<BasGoodsDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
