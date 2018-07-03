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

import static com.pagoda.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.api.dto.pridistribution.SalOrgCusDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalOrgCus")
@ApiModel(value = "SalOrgCusDTO", description = "sal_org_cus")
@EntityFeature(
  entityName = "SalOrgCusDTO",
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
public class SalOrgCusDTO extends AbstractDTO implements Serializable {

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
    name = "balCusOrgId",
    scene = "",
    nameCN = "结算客户ID",
    comment = "结算客户ID",
    nameEN = "bal_cus_org_id",
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
    name = "balCusOrgId",
    value = "结算客户ID",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc70a"
  )
  private Long balCusOrgId;

  @FieldMeta(
    name = "balCusOrgName",
    scene = "",
    nameCN = "结算客户名称[冗余]",
    comment = "结算客户名称[冗余]",
    nameEN = "bal_cus_org_name",
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
    name = "balCusOrgName",
    value = "结算客户名称[冗余]",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc708"
  )
  private String balCusOrgName;

  @FieldMeta(
    name = "dualOrgName",
    scene = "",
    nameCN = "虚拟机构组名称[冗余]",
    comment = "虚拟机构组名称[冗余]",
    nameEN = "dual_org_name",
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
    name = "dualOrgName",
    value = "虚拟机构组名称[冗余]",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc706"
  )
  private String dualOrgName;

  @FieldMeta(
    name = "isPickAutoRec",
    scene = "",
    nameCN = "是否提货自动到货 ",
    comment = "是否提货自动到货 ",
    nameEN = "is_pick_auto_rec",
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
    name = "isPickAutoRec",
    value = "是否提货自动到货 ",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc70e"
  )
  private Integer isPickAutoRec;

  @FieldMeta(
    name = "isPickLimitCon",
    scene = "",
    nameCN = "是否提货限制发货(发货数不能大于提货数)",
    comment = "是否提货限制发货(发货数不能大于提货数)",
    nameEN = "is_pick_limit_con",
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
    name = "isPickLimitCon",
    value = "是否提货限制发货(发货数不能大于提货数)",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc70c"
  )
  private Integer isPickLimitCon;

  @FieldMeta(
    name = "billType",
    scene = "",
    nameCN = "开票依据 ",
    comment = "开票依据 ",
    nameEN = "bill_type",
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
    name = "billType",
    value = "开票依据 ",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc717"
  )
  private Integer billType;

  @FieldMeta(
    name = "isStoBackPrice",
    scene = "",
    nameCN = "是否回填存货价格(用于销售出库使用成本价开票)",
    comment = "是否回填存货价格(用于销售出库使用成本价开票)",
    nameEN = "is_sto_back_price",
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
    name = "isStoBackPrice",
    value = "是否回填存货价格(用于销售出库使用成本价开票)",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc714"
  )
  private Integer isStoBackPrice;

  @FieldMeta(
    name = "isCreateBill",
    scene = "",
    nameCN = "是否生成发票",
    comment = "是否生成发票",
    nameEN = "is_create_bill",
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
    name = "isCreateBill",
    value = "是否生成发票",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc718"
  )
  private Integer isCreateBill;

  @FieldMeta(
    name = "isDefaultCon",
    scene = "",
    nameCN = "是否默认发货关系",
    comment = "是否默认发货关系",
    nameEN = "is_default_con",
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
    name = "isDefaultCon",
    value = "是否默认发货关系",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc710"
  )
  private Integer isDefaultCon;

  @FieldMeta(
    name = "isDefaultAllot",
    scene = "",
    nameCN = "是否默认调拨关系",
    comment = "是否默认调拨关系",
    nameEN = "is_default_allot",
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
    name = "isDefaultAllot",
    value = "是否默认调拨关系",
    dataType = "",
    notes = "5b39f30e9d2feff19bbcc71c"
  )
  private Integer isDefaultAllot;

  @FieldMeta(
    name = "cusOrgId",
    scene = "",
    nameCN = "客户ID",
    comment = "客户ID",
    nameEN = "cus_org_id",
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
    name = "cusOrgId",
    value = "客户ID",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c215"
  )
  private Long cusOrgId;

  @FieldMeta(
    name = "cusOrgCode",
    scene = "",
    nameCN = "客户代码[冗余]",
    comment = "客户代码[冗余]",
    nameEN = "cus_org_code",
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
    name = "cusOrgCode",
    value = "客户代码[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c217"
  )
  private String cusOrgCode;

  @FieldMeta(
    name = "cusOrgName",
    scene = "",
    nameCN = "客户名称[冗余]",
    comment = "客户名称[冗余]",
    nameEN = "cus_org_name",
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
    name = "cusOrgName",
    value = "客户名称[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c219"
  )
  private String cusOrgName;

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
    name = "balOrgId",
    scene = "",
    nameCN = "结算发货机构ID",
    comment = "结算发货机构ID",
    nameEN = "bal_org_id",
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
    name = "balOrgId",
    value = "结算发货机构ID",
    dataType = "",
    notes = "5b35d8689d2feff19b4169bc"
  )
  private Long balOrgId;

  @FieldMeta(
    name = "balOrgName",
    scene = "",
    nameCN = "结算发货机构名称[冗余]",
    comment = "结算发货机构名称[冗余]",
    nameEN = "bal_org_name",
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
    name = "balOrgName",
    value = "结算发货机构名称[冗余]",
    dataType = "",
    notes = "5b35d8689d2feff19b4169ba"
  )
  private String balOrgName;

  @FieldMeta(
    name = "priceCatId",
    scene = "",
    nameCN = "价格目录ID ",
    comment = "价格目录ID ",
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
    value = "价格目录ID ",
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
    name = "isEnabled",
    scene = "",
    nameCN = "是否可用",
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
    value = "是否可用",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d1"
  )
  private Integer isEnabled;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<SalOrgCusDTO, Long> _id = o -> o.getId();
    public static final Function<SalOrgCusDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<SalOrgCusDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<SalOrgCusDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<SalOrgCusDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<SalOrgCusDTO, String> _creatorOrgCode = o -> o.getCreatorOrgCode();
    public static final Function<SalOrgCusDTO, Date> _lastModifiedAt = o -> o.getLastModifiedAt();
    public static final Function<SalOrgCusDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<SalOrgCusDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<SalOrgCusDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<SalOrgCusDTO, Integer> _version = o -> o.getVersion();

    public static final Function<SalOrgCusDTO, Long> _balCusOrgId = o -> o.getBalCusOrgId();
    public static final Function<SalOrgCusDTO, String> _balCusOrgName = o -> o.getBalCusOrgName();
    public static final Function<SalOrgCusDTO, String> _dualOrgName = o -> o.getDualOrgName();
    public static final Function<SalOrgCusDTO, Integer> _isPickAutoRec = o -> o.getIsPickAutoRec();
    public static final Function<SalOrgCusDTO, Integer> _isPickLimitCon =
        o -> o.getIsPickLimitCon();
    public static final Function<SalOrgCusDTO, Integer> _billType = o -> o.getBillType();
    public static final Function<SalOrgCusDTO, Integer> _isStoBackPrice =
        o -> o.getIsStoBackPrice();
    public static final Function<SalOrgCusDTO, Integer> _isCreateBill = o -> o.getIsCreateBill();
    public static final Function<SalOrgCusDTO, Integer> _isDefaultCon = o -> o.getIsDefaultCon();
    public static final Function<SalOrgCusDTO, Integer> _isDefaultAllot =
        o -> o.getIsDefaultAllot();
    public static final Function<SalOrgCusDTO, Long> _cusOrgId = o -> o.getCusOrgId();
    public static final Function<SalOrgCusDTO, String> _cusOrgCode = o -> o.getCusOrgCode();
    public static final Function<SalOrgCusDTO, String> _cusOrgName = o -> o.getCusOrgName();
    public static final Function<SalOrgCusDTO, Long> _orgOrgId = o -> o.getOrgOrgId();
    public static final Function<SalOrgCusDTO, String> _orgOrgCode = o -> o.getOrgOrgCode();
    public static final Function<SalOrgCusDTO, String> _orgOrgName = o -> o.getOrgOrgName();
    public static final Function<SalOrgCusDTO, Long> _balOrgId = o -> o.getBalOrgId();
    public static final Function<SalOrgCusDTO, String> _balOrgName = o -> o.getBalOrgName();
    public static final Function<SalOrgCusDTO, Long> _priceCatId = o -> o.getPriceCatId();
    public static final Function<SalOrgCusDTO, String> _priceCatCode = o -> o.getPriceCatCode();
    public static final Function<SalOrgCusDTO, String> _priceCatName = o -> o.getPriceCatName();
    public static final Function<SalOrgCusDTO, Integer> _isEnabled = o -> o.getIsEnabled();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
