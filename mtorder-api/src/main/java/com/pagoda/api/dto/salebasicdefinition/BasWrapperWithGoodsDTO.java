package com.pagoda.api.dto.salebasicdefinition;

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
import static com.pagoda.api.dto.salebasicdefinition.BasWrapperWithGoodsDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasWrapperWithGoods")
@ApiModel(value = "BasWrapperWithGoodsDTO", description = "单品包装物带出清单")
@EntityFeature(
  entityName = "BasWrapperWithGoodsDTO",
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
public class BasWrapperWithGoodsDTO extends AbstractDTO implements Serializable {

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
    name = "orgOrgId",
    scene = "",
    nameCN = "机构ID",
    comment = "机构ID",
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
    value = "机构ID",
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
    name = "mainGoodsId",
    scene = "",
    nameCN = "主商品ID",
    comment = "主商品ID",
    nameEN = "main_goods_id",
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
    name = "mainGoodsId",
    value = "主商品ID",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7baf"
  )
  private Long mainGoodsId;

  @FieldMeta(
    name = "mainGoodsCode",
    scene = "",
    nameCN = "主商品编码[冗余]",
    comment = "主商品编码[冗余]",
    nameEN = "main_goods_code",
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
    name = "mainGoodsCode",
    value = "主商品编码[冗余]",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bb0"
  )
  private String mainGoodsCode;

  @FieldMeta(
    name = "mainGoodsName",
    scene = "",
    nameCN = "主商品名称[冗余]",
    comment = "主商品名称[冗余]",
    nameEN = "main_goods_name",
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
    name = "mainGoodsName",
    value = "主商品名称[冗余]",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bb4"
  )
  private String mainGoodsName;

  @FieldMeta(
    name = "mainUnitId",
    scene = "",
    nameCN = "主商品单位ID",
    comment = "主商品单位ID",
    nameEN = "main_unit_id",
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
    name = "mainUnitId",
    value = "主商品单位ID",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bb5"
  )
  private Long mainUnitId;

  @FieldMeta(
    name = "mainUnitName",
    scene = "",
    nameCN = "主商品单位名称[冗余]",
    comment = "主商品单位名称[冗余]",
    nameEN = "main_unit_name",
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
    name = "mainUnitName",
    value = "主商品单位名称[冗余]",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bb1"
  )
  private String mainUnitName;

  @FieldMeta(
    name = "mainCardinal",
    scene = "",
    nameCN = "主商品基数",
    comment = "主商品基数",
    nameEN = "main_cardinal",
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
    name = "mainCardinal",
    value = "主商品基数",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bb8"
  )
  private java.math.BigDecimal mainCardinal;

  @FieldMeta(
    name = "wrapGoodsId",
    scene = "",
    nameCN = "带出商品ID",
    comment = "带出商品ID",
    nameEN = "wrap_goods_id",
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
    name = "wrapGoodsId",
    value = "带出商品ID",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bbb"
  )
  private Long wrapGoodsId;

  @FieldMeta(
    name = "wrapGoodsCode",
    scene = "",
    nameCN = "带出商品编码[冗余]",
    comment = "带出商品编码[冗余]",
    nameEN = "wrap_goods_code",
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
    name = "wrapGoodsCode",
    value = "带出商品编码[冗余]",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bbd"
  )
  private String wrapGoodsCode;

  @FieldMeta(
    name = "wrapGoodsName",
    scene = "",
    nameCN = "带出商品名称[冗余]",
    comment = "带出商品名称[冗余]",
    nameEN = "wrap_goods_name",
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
    name = "wrapGoodsName",
    value = "带出商品名称[冗余]",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bb9"
  )
  private String wrapGoodsName;

  @FieldMeta(
    name = "wrapUnitId",
    scene = "",
    nameCN = "带出商品单位ID",
    comment = "带出商品单位ID",
    nameEN = "wrap_unit_id",
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
    name = "wrapUnitId",
    value = "带出商品单位ID",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bd4"
  )
  private Long wrapUnitId;

  @FieldMeta(
    name = "wrapUnitName",
    scene = "",
    nameCN = "带出商品单位名称[冗余]",
    comment = "带出商品单位名称[冗余]",
    nameEN = "wrap_unit_name",
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
    name = "wrapUnitName",
    value = "带出商品单位名称[冗余]",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bd6"
  )
  private String wrapUnitName;

  @FieldMeta(
    name = "wrapCardinal",
    scene = "",
    nameCN = "带出商品基数",
    comment = "带出商品基数",
    nameEN = "wrap_cardinal",
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
    name = "wrapCardinal",
    value = "带出商品基数",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bd9"
  )
  private java.math.BigDecimal wrapCardinal;

  @FieldMeta(
    name = "isRound",
    scene = "",
    nameCN = "是否取整",
    comment = "是否取整",
    nameEN = "is_round",
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
    name = "isRound",
    value = "是否取整",
    dataType = "",
    notes = "5b4edc5a9d2feff19b5a7bde"
  )
  private Integer isRound;

  @FieldMeta(
    name = "isEnabled",
    scene = "",
    nameCN = "状态 是否有效，0:有效 >0:无效",
    comment = "状态 是否有效，0:有效 >0:无效",
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
    value = "状态 是否有效，0:有效 >0:无效",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d1"
  )
  private Integer isEnabled;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<BasWrapperWithGoodsDTO, Long> id_ = o -> o.getId();
    public static Function<BasWrapperWithGoodsDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<BasWrapperWithGoodsDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<BasWrapperWithGoodsDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<BasWrapperWithGoodsDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<BasWrapperWithGoodsDTO, String> creatorOrgCode_ =
        o -> o.getCreatorOrgCode();
    public static Function<BasWrapperWithGoodsDTO, Date> lastModifiedAt_ =
        o -> o.getLastModifiedAt();
    public static Function<BasWrapperWithGoodsDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<BasWrapperWithGoodsDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<BasWrapperWithGoodsDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<BasWrapperWithGoodsDTO, Integer> version_ = o -> o.getVersion();

    public static Function<BasWrapperWithGoodsDTO, Long> orgOrgId_ = o -> o.getOrgOrgId();
    public static Function<BasWrapperWithGoodsDTO, String> orgOrgCode_ = o -> o.getOrgOrgCode();
    public static Function<BasWrapperWithGoodsDTO, String> orgOrgName_ = o -> o.getOrgOrgName();
    public static Function<BasWrapperWithGoodsDTO, Long> mainGoodsId_ = o -> o.getMainGoodsId();
    public static Function<BasWrapperWithGoodsDTO, String> mainGoodsCode_ =
        o -> o.getMainGoodsCode();
    public static Function<BasWrapperWithGoodsDTO, String> mainGoodsName_ =
        o -> o.getMainGoodsName();
    public static Function<BasWrapperWithGoodsDTO, Long> mainUnitId_ = o -> o.getMainUnitId();
    public static Function<BasWrapperWithGoodsDTO, String> mainUnitName_ = o -> o.getMainUnitName();
    public static Function<BasWrapperWithGoodsDTO, java.math.BigDecimal> mainCardinal_ =
        o -> o.getMainCardinal();
    public static Function<BasWrapperWithGoodsDTO, Long> wrapGoodsId_ = o -> o.getWrapGoodsId();
    public static Function<BasWrapperWithGoodsDTO, String> wrapGoodsCode_ =
        o -> o.getWrapGoodsCode();
    public static Function<BasWrapperWithGoodsDTO, String> wrapGoodsName_ =
        o -> o.getWrapGoodsName();
    public static Function<BasWrapperWithGoodsDTO, Long> wrapUnitId_ = o -> o.getWrapUnitId();
    public static Function<BasWrapperWithGoodsDTO, String> wrapUnitName_ = o -> o.getWrapUnitName();
    public static Function<BasWrapperWithGoodsDTO, java.math.BigDecimal> wrapCardinal_ =
        o -> o.getWrapCardinal();
    public static Function<BasWrapperWithGoodsDTO, Integer> isRound_ = o -> o.getIsRound();
    public static Function<BasWrapperWithGoodsDTO, Integer> isEnabled_ = o -> o.getIsEnabled();
  }

  public static ValidatorBuilder<BasWrapperWithGoodsDTO> validatorExample() {
    ValidatorBuilder<BasWrapperWithGoodsDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
