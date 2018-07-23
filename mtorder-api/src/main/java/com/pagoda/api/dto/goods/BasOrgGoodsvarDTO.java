package com.pagoda.api.dto.goods;

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
import static com.pagoda.api.dto.goods.BasOrgGoodsvarDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasOrgGoodsvar")
@ApiModel(value = "BasOrgGoodsvarDTO", description = "机构销售商品定义")
@EntityFeature(
  entityName = "BasOrgGoodsvarDTO",
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
public class BasOrgGoodsvarDTO extends AbstractDTO implements Serializable {

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
    name = "badGoodsRate",
    scene = "",
    nameCN = "坏货比例",
    comment = "坏货比例",
    nameEN = "bad_goods_rate",
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
    name = "badGoodsRate",
    value = "坏货比例",
    dataType = "",
    notes = "5b517a829d2feff19b7c605c"
  )
  private java.math.BigDecimal badGoodsRate;

  @FieldMeta(
    name = "prodArea",
    scene = "",
    nameCN = "原产地，来源于商品产地集",
    comment = "原产地，来源于商品产地集",
    nameEN = "prod_area",
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
    name = "prodArea",
    value = "原产地，来源于商品产地集",
    dataType = "",
    notes = "5b517a829d2feff19b7c605b"
  )
  private String prodArea;

  @FieldMeta(
    name = "qualSituDesc",
    scene = "",
    nameCN = "品质状况描述",
    comment = "品质状况描述",
    nameEN = "qual_situ_desc",
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
    name = "qualSituDesc",
    value = "品质状况描述",
    dataType = "",
    notes = "5b517a829d2feff19b7c6060"
  )
  private String qualSituDesc;

  @FieldMeta(
    name = "supplyStateDesc",
    scene = "",
    nameCN = "货源状况描述",
    comment = "货源状况描述",
    nameEN = "supply_state_desc",
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
    name = "supplyStateDesc",
    value = "货源状况描述",
    dataType = "",
    notes = "5b517a829d2feff19b7c6059"
  )
  private String supplyStateDesc;

  @FieldMeta(
    name = "supplyTrendDesc",
    scene = "",
    nameCN = "货源走执描述",
    comment = "货源走执描述",
    nameEN = "supply_trend_desc",
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
    name = "supplyTrendDesc",
    value = "货源走执描述",
    dataType = "",
    notes = "5b517a829d2feff19b7c605a"
  )
  private String supplyTrendDesc;

  @FieldMeta(
    name = "isMustSale",
    scene = "",
    nameCN = "是否必上果品",
    comment = "是否必上果品",
    nameEN = "is_must_sale",
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
    name = "isMustSale",
    value = "是否必上果品",
    dataType = "",
    notes = "5b517a829d2feff19b7c6062"
  )
  private Integer isMustSale;

  @FieldMeta(
    name = "mustSaleDesc",
    scene = "",
    nameCN = "必上商圈描述编码，选择商品必上描述，可多选",
    comment = "必上商圈描述编码，选择商品必上描述，可多选",
    nameEN = "must_sale_desc",
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
    name = "mustSaleDesc",
    value = "必上商圈描述编码，选择商品必上描述，可多选",
    dataType = "",
    notes = "5b517a829d2feff19b7c605e"
  )
  private String mustSaleDesc;

  @FieldMeta(
    name = "difference",
    scene = "",
    nameCN = "差异，无差异|大差异|小差异",
    comment = "差异，无差异|大差异|小差异",
    nameEN = "difference",
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
    name = "difference",
    value = "差异，无差异|大差异|小差异",
    dataType = "",
    notes = "5b517a829d2feff19b7c6067"
  )
  private String difference;

  @FieldMeta(
    name = "goodsWrapDesc",
    scene = "",
    nameCN = "包装信息说明，选填",
    comment = "包装信息说明，选填",
    nameEN = "goods_wrap_desc",
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
    name = "goodsWrapDesc",
    value = "包装信息说明，选填",
    dataType = "",
    notes = "5b517a829d2feff19b7c6065"
  )
  private String goodsWrapDesc;

  @FieldMeta(
    name = "goodsEva",
    scene = "",
    nameCN = "果品评价",
    comment = "果品评价",
    nameEN = "goods_eva",
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
    name = "goodsEva",
    value = "果品评价",
    dataType = "",
    notes = "5b517a829d2feff19b7c606a"
  )
  private String goodsEva;

  @FieldMeta(
    name = "techDesc",
    scene = "",
    nameCN = "导购话术",
    comment = "导购话术",
    nameEN = "tech_desc",
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
    name = "techDesc",
    value = "导购话术",
    dataType = "",
    notes = "5b517a829d2feff19b7c606b"
  )
  private String techDesc;

  @FieldMeta(
    name = "isBEnabledC",
    scene = "",
    nameCN = "B渠道{C:erpWeb}",
    comment = "B渠道{C:erpWeb}",
    nameEN = "is_b_enabled_c",
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
    name = "isBEnabledC",
    value = "B渠道{C:erpWeb}",
    dataType = "",
    notes = "5b517a829d2feff19b7c606d"
  )
  private Integer isBEnabledC;

  @FieldMeta(
    name = "isCEnabledA",
    scene = "",
    nameCN = "是否允许C渠道pos门店可用 {A:门店,C:web,D:微商城,E:IOS,F:Android,M:京东到家,N:饿了么,O:百度外卖,P:美团外卖,X:小程序}",
    comment = "是否允许C渠道pos门店可用 {A:门店,C:web,D:微商城,E:IOS,F:Android,M:京东到家,N:饿了么,O:百度外卖,P:美团外卖,X:小程序}",
    nameEN = "is_c_enabled_a",
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
    name = "isCEnabledA",
    value = "是否允许C渠道pos门店可用 {A:门店,C:web,D:微商城,E:IOS,F:Android,M:京东到家,N:饿了么,O:百度外卖,P:美团外卖,X:小程序}",
    dataType = "",
    notes = "5b517a829d2feff19b7c6070"
  )
  private Integer isCEnabledA;

  @FieldMeta(
    name = "isCEnabledN",
    scene = "",
    nameCN = "是否允许C渠道饿了么可用",
    comment = "是否允许C渠道饿了么可用",
    nameEN = "is_c_enabled_n",
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
    name = "isCEnabledN",
    value = "是否允许C渠道饿了么可用",
    dataType = "",
    notes = "5b517a829d2feff19b7c6072"
  )
  private Integer isCEnabledN;

  @FieldMeta(
    name = "isCEnabledM",
    scene = "",
    nameCN = "是否允许C渠道京东到家可用",
    comment = "是否允许C渠道京东到家可用",
    nameEN = "is_c_enabled_m",
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
    name = "isCEnabledM",
    value = "是否允许C渠道京东到家可用",
    dataType = "",
    notes = "5b517a829d2feff19b7c6074"
  )
  private Integer isCEnabledM;

  @FieldMeta(
    name = "isCEnabledO",
    scene = "",
    nameCN = "是否允许C渠道百度外卖可用",
    comment = "是否允许C渠道百度外卖可用",
    nameEN = "is_c_enabled_o",
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
    name = "isCEnabledO",
    value = "是否允许C渠道百度外卖可用",
    dataType = "",
    notes = "5b517a829d2feff19b7c6077"
  )
  private Integer isCEnabledO;

  @FieldMeta(
    name = "isCEnabledP",
    scene = "",
    nameCN = "是否允许C渠道美团外卖可用",
    comment = "是否允许C渠道美团外卖可用",
    nameEN = "is_c_enabled_p",
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
    name = "isCEnabledP",
    value = "是否允许C渠道美团外卖可用",
    dataType = "",
    notes = "5b517a829d2feff19b7c6078"
  )
  private Integer isCEnabledP;

  @FieldMeta(
    name = "isCEnabledC",
    scene = "",
    nameCN = "是否允许C渠道web商城可用",
    comment = "是否允许C渠道web商城可用",
    nameEN = "is_c_enabled_c",
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
    name = "isCEnabledC",
    value = "是否允许C渠道web商城可用",
    dataType = "",
    notes = "5b517a829d2feff19b7c607a"
  )
  private Integer isCEnabledC;

  @FieldMeta(
    name = "isCEnabledE",
    scene = "",
    nameCN = "是否允许C渠道自营IOS可用",
    comment = "是否允许C渠道自营IOS可用",
    nameEN = "is_c_enabled_e",
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
    name = "isCEnabledE",
    value = "是否允许C渠道自营IOS可用",
    dataType = "",
    notes = "5b517a829d2feff19b7c607d"
  )
  private Integer isCEnabledE;

  @FieldMeta(
    name = "isCEnabledF",
    scene = "",
    nameCN = "是否允许C渠道自营Android可用",
    comment = "是否允许C渠道自营Android可用",
    nameEN = "is_c_enabled_f",
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
    name = "isCEnabledF",
    value = "是否允许C渠道自营Android可用",
    dataType = "",
    notes = "5b517a829d2feff19b7c607f"
  )
  private Integer isCEnabledF;

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
    name = "orgId",
    scene = "",
    nameCN = "机构ID",
    comment = "机构ID",
    nameEN = "org_id",
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
    name = "orgId",
    value = "机构ID",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b8e"
  )
  private Long orgId;

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
    value = "是否允许销售(b2b用)",
    dataType = "",
    notes = "5b35e1719d2feff19b4427f8"
  )
  private Integer isSale;

  @FieldMeta(
    name = "isReturn",
    scene = "",
    nameCN = "是否允许退货(b2b用)",
    comment = "是否允许退货(b2b用)",
    nameEN = "is_return",
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
    name = "isReturn",
    value = "是否允许退货(b2b用)",
    dataType = "",
    notes = "5b35e1719d2feff19b442800"
  )
  private Integer isReturn;

  @FieldMeta(
    name = "isStockInv",
    scene = "",
    nameCN = "备货是否考虑库存",
    comment = "备货是否考虑库存",
    nameEN = "is_stock_inv",
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
    name = "isStockInv",
    value = "备货是否考虑库存",
    dataType = "",
    notes = "5b35e1719d2feff19b4427fa"
  )
  private Integer isStockInv;

  @FieldMeta(
    name = "isRet",
    scene = "",
    nameCN = "是否零售(b2c用，另因按订单退，故无需是否允许退货)[设置为0时需要把iscchannelenble 字段开头的都改为0]",
    comment = "是否零售(b2c用，另因按订单退，故无需是否允许退货)[设置为0时需要把iscchannelenble 字段开头的都改为0]",
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
    value = "是否零售(b2c用，另因按订单退，故无需是否允许退货)[设置为0时需要把iscchannelenble 字段开头的都改为0]",
    dataType = "",
    notes = "5b35e1719d2feff19b442804"
  )
  private Integer isRet;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<BasOrgGoodsvarDTO, Long> id_ = o -> o.getId();
    public static Function<BasOrgGoodsvarDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<BasOrgGoodsvarDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<BasOrgGoodsvarDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<BasOrgGoodsvarDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<BasOrgGoodsvarDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<BasOrgGoodsvarDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<BasOrgGoodsvarDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<BasOrgGoodsvarDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<BasOrgGoodsvarDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<BasOrgGoodsvarDTO, Integer> version_ = o -> o.getVersion();

    public static Function<BasOrgGoodsvarDTO, java.math.BigDecimal> badGoodsRate_ =
        o -> o.getBadGoodsRate();
    public static Function<BasOrgGoodsvarDTO, String> prodArea_ = o -> o.getProdArea();
    public static Function<BasOrgGoodsvarDTO, String> qualSituDesc_ = o -> o.getQualSituDesc();
    public static Function<BasOrgGoodsvarDTO, String> supplyStateDesc_ =
        o -> o.getSupplyStateDesc();
    public static Function<BasOrgGoodsvarDTO, String> supplyTrendDesc_ =
        o -> o.getSupplyTrendDesc();
    public static Function<BasOrgGoodsvarDTO, Integer> isMustSale_ = o -> o.getIsMustSale();
    public static Function<BasOrgGoodsvarDTO, String> mustSaleDesc_ = o -> o.getMustSaleDesc();
    public static Function<BasOrgGoodsvarDTO, String> difference_ = o -> o.getDifference();
    public static Function<BasOrgGoodsvarDTO, String> goodsWrapDesc_ = o -> o.getGoodsWrapDesc();
    public static Function<BasOrgGoodsvarDTO, String> goodsEva_ = o -> o.getGoodsEva();
    public static Function<BasOrgGoodsvarDTO, String> techDesc_ = o -> o.getTechDesc();
    public static Function<BasOrgGoodsvarDTO, Integer> isBEnabledC_ = o -> o.getIsBEnabledC();
    public static Function<BasOrgGoodsvarDTO, Integer> isCEnabledA_ = o -> o.getIsCEnabledA();
    public static Function<BasOrgGoodsvarDTO, Integer> isCEnabledN_ = o -> o.getIsCEnabledN();
    public static Function<BasOrgGoodsvarDTO, Integer> isCEnabledM_ = o -> o.getIsCEnabledM();
    public static Function<BasOrgGoodsvarDTO, Integer> isCEnabledO_ = o -> o.getIsCEnabledO();
    public static Function<BasOrgGoodsvarDTO, Integer> isCEnabledP_ = o -> o.getIsCEnabledP();
    public static Function<BasOrgGoodsvarDTO, Integer> isCEnabledC_ = o -> o.getIsCEnabledC();
    public static Function<BasOrgGoodsvarDTO, Integer> isCEnabledE_ = o -> o.getIsCEnabledE();
    public static Function<BasOrgGoodsvarDTO, Integer> isCEnabledF_ = o -> o.getIsCEnabledF();
    public static Function<BasOrgGoodsvarDTO, Long> entId_ = o -> o.getEntId();
    public static Function<BasOrgGoodsvarDTO, Long> orgId_ = o -> o.getOrgId();
    public static Function<BasOrgGoodsvarDTO, Long> goodsVarId_ = o -> o.getGoodsVarId();
    public static Function<BasOrgGoodsvarDTO, Long> goodsId_ = o -> o.getGoodsId();
    public static Function<BasOrgGoodsvarDTO, Long> unitId_ = o -> o.getUnitId();
    public static Function<BasOrgGoodsvarDTO, String> unitCode_ = o -> o.getUnitCode();
    public static Function<BasOrgGoodsvarDTO, String> unitName_ = o -> o.getUnitName();
    public static Function<BasOrgGoodsvarDTO, java.math.BigDecimal> unitRate_ =
        o -> o.getUnitRate();
    public static Function<BasOrgGoodsvarDTO, Integer> isSale_ = o -> o.getIsSale();
    public static Function<BasOrgGoodsvarDTO, Integer> isReturn_ = o -> o.getIsReturn();
    public static Function<BasOrgGoodsvarDTO, Integer> isStockInv_ = o -> o.getIsStockInv();
    public static Function<BasOrgGoodsvarDTO, Integer> isRet_ = o -> o.getIsRet();
  }

  public static ValidatorBuilder<BasOrgGoodsvarDTO> validatorExample() {
    ValidatorBuilder<BasOrgGoodsvarDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
