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
import static com.pagoda.api.dto.goods.BasGoodsBomDetailDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasGoodsBomDetail")
@ApiModel(value = "BasGoodsBomDetailDTO", description = "BOM投入商品明细表 ")
@EntityFeature(
  entityName = "BasGoodsBomDetailDTO",
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
public class BasGoodsBomDetailDTO extends AbstractDTO implements Serializable {

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
    name = "outputGoodsId",
    scene = "",
    nameCN = "产成商品ID",
    comment = "产成商品ID",
    nameEN = "output_goods_id",
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
    name = "outputGoodsId",
    value = "产成商品ID",
    dataType = "",
    notes = "5b3b58299d2feff19ba7d6da"
  )
  private Long outputGoodsId;

  @FieldMeta(
    name = "outputGoodsName",
    scene = "",
    nameCN = "产成商品名",
    comment = "产成商品名",
    nameEN = "output_goods_name",
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
    name = "outputGoodsName",
    value = "产成商品名",
    dataType = "",
    notes = "5b3b58299d2feff19ba7d6dd"
  )
  private String outputGoodsName;

  @FieldMeta(
    name = "feeId",
    scene = "",
    nameCN = "工序ID",
    comment = "工序ID",
    nameEN = "fee_id",
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
    name = "feeId",
    value = "工序ID",
    dataType = "",
    notes = "5b3b58299d2feff19ba7d6de"
  )
  private Long feeId;

  @FieldMeta(
    name = "inputGoodsId",
    scene = "",
    nameCN = "投入商品ID",
    comment = "投入商品ID",
    nameEN = "input_goods_id",
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
    name = "inputGoodsId",
    value = "投入商品ID",
    dataType = "",
    notes = "5b3b58299d2feff19ba7d6e0"
  )
  private Long inputGoodsId;

  @FieldMeta(
    name = "inputGoodsName",
    scene = "",
    nameCN = "投入商品名",
    comment = "投入商品名",
    nameEN = "input_goods_name",
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
    name = "inputGoodsName",
    value = "投入商品名",
    dataType = "",
    notes = "5b3b58299d2feff19ba7d6e8"
  )
  private String inputGoodsName;

  @FieldMeta(
    name = "inputGoodsQty",
    scene = "",
    nameCN = "消耗数",
    comment = "消耗数",
    nameEN = "input_goods_qty",
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
    name = "inputGoodsQty",
    value = "消耗数",
    dataType = "",
    notes = "5b3b58299d2feff19ba7d6e4"
  )
  private java.math.BigDecimal inputGoodsQty;

  @FieldMeta(
    name = "outDepotId",
    scene = "",
    nameCN = "出库库房ID(投入商品出库)",
    comment = "出库库房ID(投入商品出库)",
    nameEN = "out_depot_id",
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
    name = "outDepotId",
    value = "出库库房ID(投入商品出库)",
    dataType = "",
    notes = "5b3b58299d2feff19ba7d6e3"
  )
  private Long outDepotId;

  @FieldMeta(
    name = "outDepotName",
    scene = "",
    nameCN = "出库库房名称[冗余]",
    comment = "出库库房名称[冗余]",
    nameEN = "out_depot_name",
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
    name = "outDepotName",
    value = "出库库房名称[冗余]",
    dataType = "",
    notes = "5b3b58299d2feff19ba7d6ea"
  )
  private String outDepotName;

  @FieldMeta(
    name = "feeName",
    scene = "",
    nameCN = "费用名称(工序名称)",
    comment = "费用名称(工序名称)",
    nameEN = "fee_name",
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
    name = "feeName",
    value = "费用名称(工序名称)",
    dataType = "",
    notes = "5b35dfa69d2feff19b436fec"
  )
  private String feeName;

  @FieldMeta(
    name = "feeAmt",
    scene = "",
    nameCN = "工序费用金额",
    comment = "工序费用金额",
    nameEN = "fee_amt",
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
    name = "feeAmt",
    value = "工序费用金额",
    dataType = "",
    notes = "5b35dfa69d2feff19b436fef"
  )
  private java.math.BigDecimal feeAmt;

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
    name = "rankNum",
    scene = "",
    nameCN = "排序号",
    comment = "排序号",
    nameEN = "rank_num",
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
    name = "rankNum",
    value = "排序号",
    dataType = "",
    notes = "5b35de739d2feff19b42fe67"
  )
  private Integer rankNum;

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

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasGoodsBomDetailDTO, Long> _id = o -> o.getId();
    public static final Function<BasGoodsBomDetailDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasGoodsBomDetailDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasGoodsBomDetailDTO, String> _creatorCode =
        o -> o.getCreatorCode();
    public static final Function<BasGoodsBomDetailDTO, String> _creatorName =
        o -> o.getCreatorName();
    public static final Function<BasGoodsBomDetailDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<BasGoodsBomDetailDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<BasGoodsBomDetailDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<BasGoodsBomDetailDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<BasGoodsBomDetailDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasGoodsBomDetailDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasGoodsBomDetailDTO, Long> _outputGoodsId =
        o -> o.getOutputGoodsId();
    public static final Function<BasGoodsBomDetailDTO, String> _outputGoodsName =
        o -> o.getOutputGoodsName();
    public static final Function<BasGoodsBomDetailDTO, Long> _feeId = o -> o.getFeeId();
    public static final Function<BasGoodsBomDetailDTO, Long> _inputGoodsId =
        o -> o.getInputGoodsId();
    public static final Function<BasGoodsBomDetailDTO, String> _inputGoodsName =
        o -> o.getInputGoodsName();
    public static final Function<BasGoodsBomDetailDTO, java.math.BigDecimal> _inputGoodsQty =
        o -> o.getInputGoodsQty();
    public static final Function<BasGoodsBomDetailDTO, Long> _outDepotId = o -> o.getOutDepotId();
    public static final Function<BasGoodsBomDetailDTO, String> _outDepotName =
        o -> o.getOutDepotName();
    public static final Function<BasGoodsBomDetailDTO, String> _feeName = o -> o.getFeeName();
    public static final Function<BasGoodsBomDetailDTO, java.math.BigDecimal> _feeAmt =
        o -> o.getFeeAmt();
    public static final Function<BasGoodsBomDetailDTO, Long> _unitId = o -> o.getUnitId();
    public static final Function<BasGoodsBomDetailDTO, String> _unitName = o -> o.getUnitName();
    public static final Function<BasGoodsBomDetailDTO, Integer> _isEnabled = o -> o.getIsEnabled();
    public static final Function<BasGoodsBomDetailDTO, Integer> _isDefault = o -> o.getIsDefault();
    public static final Function<BasGoodsBomDetailDTO, Integer> _rankNum = o -> o.getRankNum();
    public static final Function<BasGoodsBomDetailDTO, String> _remark = o -> o.getRemark();
    public static final Function<BasGoodsBomDetailDTO, Long> _entId = o -> o.getEntId();
  }

  public static ValidatorBuilder<BasGoodsBomDetailDTO> validatorExample() {
    ValidatorBuilder<BasGoodsBomDetailDTO> builder = new ValidatorBuilder();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
