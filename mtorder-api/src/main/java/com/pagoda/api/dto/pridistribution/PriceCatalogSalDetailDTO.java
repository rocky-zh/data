package com.pagoda.api.dto.pridistribution;

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
@ValidateProperties(rulePrefix = "validator.PriceCatalogSalDetail")
@ApiModel(value = "PriceCatalogSalDetailDTO", description = "配送价格目录定义明细表")
@EntityFeature(
  entityName = "PriceCatalogSalDetailDTO",
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
public class PriceCatalogSalDetailDTO extends AbstractDTO implements Serializable {

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
    name = "priceCatId",
    scene = "",
    nameCN = "价格目录ID",
    comment = "价格目录ID",
    nameEN = "price_cat_id",
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
    name = "priceCatId",
    value = "价格目录ID",
    dataType = "",
    notes = "5b36f2be9d2feff19b38603f"
  )
  private Long priceCatId;

  @FieldMeta(
    name = "priceCatCode",
    scene = "",
    nameCN = "价格目录代码",
    comment = "价格目录代码",
    nameEN = "price_cat_code",
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
    name = "priceCatCode",
    value = "价格目录代码",
    dataType = "",
    notes = "5b36f2be9d2feff19b38603d"
  )
  private String priceCatCode;

  @FieldMeta(
    name = "priceCatName",
    scene = "",
    nameCN = "价格目录名称",
    comment = "价格目录名称",
    nameEN = "price_cat_name",
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
    name = "priceCatName",
    value = "价格目录名称",
    dataType = "",
    notes = "5b36f2be9d2feff19b386055"
  )
  private String priceCatName;

  @FieldMeta(
    name = "salPrice",
    scene = "",
    nameCN = "销售价格",
    comment = "销售价格",
    nameEN = "sal_price",
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
    name = "salPrice",
    value = "销售价格",
    dataType = "",
    notes = "5b36f2be9d2feff19b386056"
  )
  private java.math.BigDecimal salPrice;

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
    name = "unitId",
    scene = "price",
    nameCN = "单位ID",
    comment = "单位ID",
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
    value = "单位ID",
    dataType = "",
    notes = "5b36e7ee9d2feff19b2cb728"
  )
  private Long unitId;

  @FieldMeta(
    name = "unitCode",
    scene = "price",
    nameCN = "单位代码",
    comment = "单位代码",
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
    value = "单位代码",
    dataType = "",
    notes = "5b36ebef9d2feff19b30ed4a"
  )
  private String unitCode;

  @FieldMeta(
    name = "unitName",
    scene = "price",
    nameCN = "单位名称",
    comment = "单位名称",
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
    value = "单位名称",
    dataType = "",
    notes = "5b36ec199d2feff19b311a64"
  )
  private String unitName;

  @FieldMeta(
    name = "unitRate",
    scene = "price",
    nameCN = "转换系数",
    comment = "转换系数",
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
    value = "转换系数",
    dataType = "",
    notes = "5b36ec649d2feff19b31695b"
  )
  private java.math.BigDecimal unitRate;

  @FieldMeta(
    name = "returnPrice",
    scene = "",
    nameCN = "退货价格",
    comment = "退货价格",
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
    value = "退货价格",
    dataType = "",
    notes = "5b35de169d2feff19b42dc46"
  )
  private java.math.BigDecimal returnPrice;

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
    public static final Function<PriceCatalogSalDetailDTO, Long> _id = o -> o.getId();
    public static final Function<PriceCatalogSalDetailDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<PriceCatalogSalDetailDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<PriceCatalogSalDetailDTO, String> _creatorCode =
        o -> o.getCreatorCode();
    public static final Function<PriceCatalogSalDetailDTO, String> _creatorName =
        o -> o.getCreatorName();
    public static final Function<PriceCatalogSalDetailDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<PriceCatalogSalDetailDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<PriceCatalogSalDetailDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<PriceCatalogSalDetailDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<PriceCatalogSalDetailDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<PriceCatalogSalDetailDTO, Integer> _version = o -> o.getVersion();

    public static final Function<PriceCatalogSalDetailDTO, Long> _priceCatId =
        o -> o.getPriceCatId();
    public static final Function<PriceCatalogSalDetailDTO, String> _priceCatCode =
        o -> o.getPriceCatCode();
    public static final Function<PriceCatalogSalDetailDTO, String> _priceCatName =
        o -> o.getPriceCatName();
    public static final Function<PriceCatalogSalDetailDTO, java.math.BigDecimal> _salPrice =
        o -> o.getSalPrice();
    public static final Function<PriceCatalogSalDetailDTO, Long> _entId = o -> o.getEntId();
    public static final Function<PriceCatalogSalDetailDTO, Long> _goodsId = o -> o.getGoodsId();
    public static final Function<PriceCatalogSalDetailDTO, String> _goodsCode =
        o -> o.getGoodsCode();
    public static final Function<PriceCatalogSalDetailDTO, String> _goodsName =
        o -> o.getGoodsName();
    public static final Function<PriceCatalogSalDetailDTO, String> _goodsSpec =
        o -> o.getGoodsSpec();
    public static final Function<PriceCatalogSalDetailDTO, Long> _unitId = o -> o.getUnitId();
    public static final Function<PriceCatalogSalDetailDTO, String> _unitCode = o -> o.getUnitCode();
    public static final Function<PriceCatalogSalDetailDTO, String> _unitName = o -> o.getUnitName();
    public static final Function<PriceCatalogSalDetailDTO, java.math.BigDecimal> _unitRate =
        o -> o.getUnitRate();
    public static final Function<PriceCatalogSalDetailDTO, java.math.BigDecimal> _returnPrice =
        o -> o.getReturnPrice();
    public static final Function<PriceCatalogSalDetailDTO, String> _remark = o -> o.getRemark();
  }

  public static ValidatorBuilder<PriceCatalogSalDetailDTO> validatorExample() {
    ValidatorBuilder<PriceCatalogSalDetailDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}