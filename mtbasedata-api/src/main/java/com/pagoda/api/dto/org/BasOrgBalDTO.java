package com.pagoda.api.dto.org;

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
import static com.pagoda.api.dto.org.BasOrgBalDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasOrgBal")
@ApiModel(
  value = "BasOrgBalDTO",
  description = "往来单位-015 结算机构明细表[注：开户行管理，不加字段，是取bas_org_bal_bank中默认的银行]"
)
@EntityFeature(
  entityName = "BasOrgBalDTO",
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
public class BasOrgBalDTO extends AbstractDTO implements Serializable {

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
    name = "billName",
    scene = "",
    nameCN = "发票名头",
    comment = "发票名头",
    nameEN = "bill_name",
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
    name = "billName",
    value = "发票名头",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b90"
  )
  private String billName;

  @FieldMeta(
    name = "maxBillAmt",
    scene = "",
    nameCN = "最大开发票金额",
    comment = "最大开发票金额",
    nameEN = "max_bill_amt",
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
    name = "maxBillAmt",
    value = "最大开发票金额",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b92"
  )
  private java.math.BigDecimal maxBillAmt;

  @FieldMeta(
    name = "isGoodsPrior",
    scene = "",
    nameCN = "是否货款优先(1:先算货款，然后再算税金。0:先算税金，再算货款。)二者由于尾差可能相差1分钱",
    comment = "是否货款优先(1:先算货款，然后再算税金。0:先算税金，再算货款。)二者由于尾差可能相差1分钱",
    nameEN = "is_goods_prior",
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
    name = "isGoodsPrior",
    value = "是否货款优先(1:先算货款，然后再算税金。0:先算税金，再算货款。)二者由于尾差可能相差1分钱",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b94"
  )
  private Integer isGoodsPrior;

  @FieldMeta(
    name = "isDetailPrior",
    scene = "",
    nameCN = "是否明细优先(1:发票总货款/税金是从明细汇总,0:先算发票总货款/税金,再分摊到明细中)",
    comment = "是否明细优先(1:发票总货款/税金是从明细汇总,0:先算发票总货款/税金,再分摊到明细中)",
    nameEN = "is_detail_prior",
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
    name = "isDetailPrior",
    value = "是否明细优先(1:发票总货款/税金是从明细汇总,0:先算发票总货款/税金,再分摊到明细中)",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b9a"
  )
  private Integer isDetailPrior;

  @FieldMeta(
    name = "legalPerson",
    scene = "",
    nameCN = "法人,结算时维护",
    comment = "法人,结算时维护",
    nameEN = "legal_person",
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
    name = "legalPerson",
    value = "法人,结算时维护",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b96"
  )
  private String legalPerson;

  @FieldMeta(
    name = "taxNumber",
    scene = "",
    nameCN = "纳税识别号,结算时维护",
    comment = "纳税识别号,结算时维护",
    nameEN = "tax_number",
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
    name = "taxNumber",
    value = "纳税识别号,结算时维护",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b9c"
  )
  private String taxNumber;

  @FieldMeta(
    name = "orgProperty",
    scene = "",
    nameCN = "机构属性{ 1:一般纳税人,2:小规模纳税人}",
    comment = "机构属性{ 1:一般纳税人,2:小规模纳税人}",
    nameEN = "org_property",
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
    name = "orgProperty",
    value = "机构属性{ 1:一般纳税人,2:小规模纳税人}",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b99"
  )
  private Integer orgProperty;

  @FieldMeta(
    name = "billAddress",
    scene = "",
    nameCN = "开票地址",
    comment = "开票地址",
    nameEN = "bill_address",
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
    name = "billAddress",
    value = "开票地址",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b9e"
  )
  private String billAddress;

  @FieldMeta(
    name = "billTelephone",
    scene = "",
    nameCN = "开票电话",
    comment = "开票电话",
    nameEN = "bill_telephone",
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
    name = "billTelephone",
    value = "开票电话",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423ba0"
  )
  private String billTelephone;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasOrgBalDTO, Long> _id = o -> o.getId();
    public static final Function<BasOrgBalDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasOrgBalDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasOrgBalDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<BasOrgBalDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<BasOrgBalDTO, String> _creatorOrgCode = o -> o.getCreatorOrgCode();
    public static final Function<BasOrgBalDTO, Date> _lastModifiedAt = o -> o.getLastModifiedAt();
    public static final Function<BasOrgBalDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<BasOrgBalDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<BasOrgBalDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasOrgBalDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasOrgBalDTO, Long> _orgId = o -> o.getOrgId();
    public static final Function<BasOrgBalDTO, String> _billName = o -> o.getBillName();
    public static final Function<BasOrgBalDTO, java.math.BigDecimal> _maxBillAmt =
        o -> o.getMaxBillAmt();
    public static final Function<BasOrgBalDTO, Integer> _isGoodsPrior = o -> o.getIsGoodsPrior();
    public static final Function<BasOrgBalDTO, Integer> _isDetailPrior = o -> o.getIsDetailPrior();
    public static final Function<BasOrgBalDTO, String> _legalPerson = o -> o.getLegalPerson();
    public static final Function<BasOrgBalDTO, String> _taxNumber = o -> o.getTaxNumber();
    public static final Function<BasOrgBalDTO, Integer> _orgProperty = o -> o.getOrgProperty();
    public static final Function<BasOrgBalDTO, String> _billAddress = o -> o.getBillAddress();
    public static final Function<BasOrgBalDTO, String> _billTelephone = o -> o.getBillTelephone();
  }

  public static ValidatorBuilder<BasOrgBalDTO> validatorExample() {
    ValidatorBuilder<BasOrgBalDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
