package com.pagoda.api.dto.purorgven;

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
import static com.pagoda.api.dto.purorgven.BasVenRebateGoodsDetailDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasVenRebateGoodsDetail")
@ApiModel(value = "BasVenRebateGoodsDetailDTO", description = "供应商返利商品明细表")
@EntityFeature(
  entityName = "BasVenRebateGoodsDetailDTO",
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
public class BasVenRebateGoodsDetailDTO extends AbstractDTO implements Serializable {

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
    name = "rebateId",
    scene = "",
    nameCN = "返利协议ID",
    comment = "返利协议ID",
    nameEN = "rebate_id",
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
    name = "rebateId",
    value = "返利协议ID",
    dataType = "",
    notes = "5b35e3459d2feff19b450f9f"
  )
  private Long rebateId;

  @FieldMeta(
    name = "rebateNo",
    scene = "",
    nameCN = "返利协议号[冗余]",
    comment = "返利协议号[冗余]",
    nameEN = "rebate_no",
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
    name = "rebateNo",
    value = "返利协议号[冗余]",
    dataType = "",
    notes = "5b35e3459d2feff19b450f9c"
  )
  private String rebateNo;

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
    name = "goodsClassId",
    scene = "",
    nameCN = "商品分类ID",
    comment = "商品分类ID",
    nameEN = "goods_class_id",
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
    name = "goodsClassId",
    value = "商品分类ID",
    dataType = "",
    notes = "5b35e3459d2feff19b450fa2"
  )
  private Long goodsClassId;

  @FieldMeta(
    name = "goodsClassCode",
    scene = "price",
    nameCN = "商品分类代码",
    comment = "商品分类代码",
    nameEN = "goods_class_code",
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
    name = "goodsClassCode",
    value = "商品分类代码",
    dataType = "",
    notes = "5b36e9209d2feff19b2df522"
  )
  private String goodsClassCode;

  @FieldMeta(
    name = "goodsClassName",
    scene = "price",
    nameCN = "商品分类",
    comment = "商品分类",
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
    value = "商品分类",
    dataType = "",
    notes = "5b36e9549d2feff19b2e2bc3"
  )
  private String goodsClassName;

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
    name = "effectDate",
    scene = "price",
    nameCN = "生效日期",
    comment = "生效日期",
    nameEN = "effect_date",
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
    name = "effectDate",
    value = "生效日期",
    dataType = "",
    notes = "5b36e5bb9d2feff19b2a77fa"
  )
  private java.util.Date effectDate;

  @FieldMeta(
    name = "expiryDate",
    scene = "",
    nameCN = "失效日期(停用时间)",
    comment = "失效日期(停用时间)",
    nameEN = "expiry_date",
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
    name = "expiryDate",
    value = "失效日期(停用时间)",
    dataType = "",
    notes = "5b35e3459d2feff19b450fb1"
  )
  private java.util.Date expiryDate;

  @FieldMeta(
    name = "status",
    scene = "price",
    nameCN = "状态",
    comment = "状态",
    nameEN = "status",
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
    name = "status",
    value = "状态",
    dataType = "",
    notes = "5b36e56a9d2feff19b2a262e"
  )
  private Integer status;

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
    public static Function<BasVenRebateGoodsDetailDTO, Long> id_ = o -> o.getId();
    public static Function<BasVenRebateGoodsDetailDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<BasVenRebateGoodsDetailDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<BasVenRebateGoodsDetailDTO, String> creatorCode_ =
        o -> o.getCreatorCode();
    public static Function<BasVenRebateGoodsDetailDTO, String> creatorName_ =
        o -> o.getCreatorName();
    public static Function<BasVenRebateGoodsDetailDTO, String> creatorOrgCode_ =
        o -> o.getCreatorOrgCode();
    public static Function<BasVenRebateGoodsDetailDTO, Date> lastModifiedAt_ =
        o -> o.getLastModifiedAt();
    public static Function<BasVenRebateGoodsDetailDTO, String> modifierCode_ =
        o -> o.getModifierCode();
    public static Function<BasVenRebateGoodsDetailDTO, String> modifierName_ =
        o -> o.getModifierName();
    public static Function<BasVenRebateGoodsDetailDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<BasVenRebateGoodsDetailDTO, Integer> version_ = o -> o.getVersion();

    public static Function<BasVenRebateGoodsDetailDTO, Long> rebateId_ = o -> o.getRebateId();
    public static Function<BasVenRebateGoodsDetailDTO, String> rebateNo_ = o -> o.getRebateNo();
    public static Function<BasVenRebateGoodsDetailDTO, Long> entId_ = o -> o.getEntId();
    public static Function<BasVenRebateGoodsDetailDTO, Long> goodsId_ = o -> o.getGoodsId();
    public static Function<BasVenRebateGoodsDetailDTO, String> goodsCode_ = o -> o.getGoodsCode();
    public static Function<BasVenRebateGoodsDetailDTO, String> goodsName_ = o -> o.getGoodsName();
    public static Function<BasVenRebateGoodsDetailDTO, String> goodsSpec_ = o -> o.getGoodsSpec();
    public static Function<BasVenRebateGoodsDetailDTO, Long> goodsClassId_ =
        o -> o.getGoodsClassId();
    public static Function<BasVenRebateGoodsDetailDTO, String> goodsClassCode_ =
        o -> o.getGoodsClassCode();
    public static Function<BasVenRebateGoodsDetailDTO, String> goodsClassName_ =
        o -> o.getGoodsClassName();
    public static Function<BasVenRebateGoodsDetailDTO, Long> unitId_ = o -> o.getUnitId();
    public static Function<BasVenRebateGoodsDetailDTO, String> unitCode_ = o -> o.getUnitCode();
    public static Function<BasVenRebateGoodsDetailDTO, String> unitName_ = o -> o.getUnitName();
    public static Function<BasVenRebateGoodsDetailDTO, java.util.Date> effectDate_ =
        o -> o.getEffectDate();
    public static Function<BasVenRebateGoodsDetailDTO, java.util.Date> expiryDate_ =
        o -> o.getExpiryDate();
    public static Function<BasVenRebateGoodsDetailDTO, Integer> status_ = o -> o.getStatus();
    public static Function<BasVenRebateGoodsDetailDTO, String> remark_ = o -> o.getRemark();
  }

  public static ValidatorBuilder<BasVenRebateGoodsDetailDTO> validatorExample() {
    ValidatorBuilder<BasVenRebateGoodsDetailDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
