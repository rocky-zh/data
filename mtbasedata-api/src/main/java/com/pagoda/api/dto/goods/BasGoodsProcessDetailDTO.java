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
import static com.pagoda.api.dto.goods.BasGoodsProcessDetailDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasGoodsProcessDetail")
@ApiModel(value = "BasGoodsProcessDetailDTO", description = "生产工艺明细表")
@EntityFeature(
  entityName = "BasGoodsProcessDetailDTO",
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
public class BasGoodsProcessDetailDTO extends AbstractDTO implements Serializable {

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
    name = "goodsProcId",
    scene = "",
    nameCN = "工艺版本ID[goods_proc_id]",
    comment = "工艺版本ID[goods_proc_id]",
    nameEN = "goods_proc_id",
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
    name = "goodsProcId",
    value = "工艺版本ID[goods_proc_id]",
    dataType = "",
    notes = "5b35dfa69d2feff19b436fe4"
  )
  private Long goodsProcId;

  @FieldMeta(
    name = "goodsProcCode",
    scene = "",
    nameCN = "工艺版本代码[冗余]",
    comment = "工艺版本代码[冗余]",
    nameEN = "goods_proc_code",
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
    name = "goodsProcCode",
    value = "工艺版本代码[冗余]",
    dataType = "",
    notes = "5b35dfa69d2feff19b436fe8"
  )
  private String goodsProcCode;

  @FieldMeta(
    name = "goodsProcName",
    scene = "",
    nameCN = "工艺版本名称[冗余]",
    comment = "工艺版本名称[冗余]",
    nameEN = "goods_proc_name",
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
    name = "goodsProcName",
    value = "工艺版本名称[冗余]",
    dataType = "",
    notes = "5b35dfa69d2feff19b436fea"
  )
  private String goodsProcName;

  @FieldMeta(
    name = "feeCode",
    scene = "",
    nameCN = "工序代码(费用代码)",
    comment = "工序代码(费用代码)",
    nameEN = "fee_code",
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
    name = "feeCode",
    value = "工序代码(费用代码)",
    dataType = "",
    notes = "5b35dfa69d2feff19b436fe6"
  )
  private String feeCode;

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

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasGoodsProcessDetailDTO, Long> _id = o -> o.getId();
    public static final Function<BasGoodsProcessDetailDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasGoodsProcessDetailDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasGoodsProcessDetailDTO, String> _creatorCode =
        o -> o.getCreatorCode();
    public static final Function<BasGoodsProcessDetailDTO, String> _creatorName =
        o -> o.getCreatorName();
    public static final Function<BasGoodsProcessDetailDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<BasGoodsProcessDetailDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<BasGoodsProcessDetailDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<BasGoodsProcessDetailDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<BasGoodsProcessDetailDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasGoodsProcessDetailDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasGoodsProcessDetailDTO, Long> _goodsProcId =
        o -> o.getGoodsProcId();
    public static final Function<BasGoodsProcessDetailDTO, String> _goodsProcCode =
        o -> o.getGoodsProcCode();
    public static final Function<BasGoodsProcessDetailDTO, String> _goodsProcName =
        o -> o.getGoodsProcName();
    public static final Function<BasGoodsProcessDetailDTO, String> _feeCode = o -> o.getFeeCode();
    public static final Function<BasGoodsProcessDetailDTO, String> _feeName = o -> o.getFeeName();
    public static final Function<BasGoodsProcessDetailDTO, java.math.BigDecimal> _feeAmt =
        o -> o.getFeeAmt();
    public static final Function<BasGoodsProcessDetailDTO, String> _remark = o -> o.getRemark();
    public static final Function<BasGoodsProcessDetailDTO, Integer> _rankNum = o -> o.getRankNum();
    public static final Function<BasGoodsProcessDetailDTO, Long> _entId = o -> o.getEntId();
  }

  public static ValidatorBuilder<BasGoodsProcessDetailDTO> validatorExample() {
    ValidatorBuilder<BasGoodsProcessDetailDTO> builder = new ValidatorBuilder();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
