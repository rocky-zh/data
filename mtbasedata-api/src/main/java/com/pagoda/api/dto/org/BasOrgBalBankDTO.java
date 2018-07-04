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
import static com.pagoda.api.dto.org.BasOrgBalBankDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasOrgBalBank")
@ApiModel(value = "BasOrgBalBankDTO", description = "往来单位-016 结算机构开户行表 ")
@EntityFeature(
  entityName = "BasOrgBalBankDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = true,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "/dubboApi/BasOrgBalBankService/getBankInfo",
  tableMultiSelect = true
)
public class BasOrgBalBankDTO extends AbstractDTO implements Serializable {

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
    name = "bank",
    scene = "",
    nameCN = "银行",
    comment = "银行",
    nameEN = "bank",
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
  @ApiModelProperty(name = "bank", value = "银行", dataType = "", notes = "5b36e5329d2feff19b29ecd3")
  private String bank;

  @FieldMeta(
    name = "provinceName",
    scene = "",
    nameCN = "省名称",
    comment = "省名称",
    nameEN = "province_name",
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
    name = "provinceName",
    value = "省名称",
    dataType = "",
    notes = "5b36e5329d2feff19b29ecda"
  )
  private String provinceName;

  @FieldMeta(
    name = "cityName",
    scene = "",
    nameCN = "市名称",
    comment = "市名称",
    nameEN = "city_name",
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
    name = "cityName",
    value = "市名称",
    dataType = "",
    notes = "5b36e5329d2feff19b29ecd1"
  )
  private String cityName;

  @FieldMeta(
    name = "registerBank",
    scene = "",
    nameCN = "支行",
    comment = "支行",
    nameEN = "register_bank",
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
    name = "registerBank",
    value = "支行",
    dataType = "",
    notes = "5b36e5329d2feff19b29ecd5"
  )
  private String registerBank;

  @FieldMeta(
    name = "accountName",
    scene = "",
    nameCN = "开户人姓名",
    comment = "开户人姓名",
    nameEN = "account_name",
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
    name = "accountName",
    value = "开户人姓名",
    dataType = "",
    notes = "5b36e5329d2feff19b29ecd8"
  )
  private String accountName;

  @FieldMeta(
    name = "bankAccountNo",
    scene = "",
    nameCN = "银行卡号 ",
    comment = "银行卡号 ",
    nameEN = "bank_account_no",
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
    name = "bankAccountNo",
    value = "银行卡号 ",
    dataType = "",
    notes = "5b36e5329d2feff19b29ecdb"
  )
  private String bankAccountNo;

  @FieldMeta(
    name = "cityCode",
    scene = "",
    nameCN = "市编码",
    comment = "市编码",
    nameEN = "city_code",
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
    name = "cityCode",
    value = "市编码",
    dataType = "",
    notes = "5b36e5329d2feff19b29ecdd"
  )
  private String cityCode;

  @FieldMeta(
    name = "provinceCode",
    scene = "",
    nameCN = "省编码",
    comment = "省编码",
    nameEN = "province_code",
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
    name = "provinceCode",
    value = "省编码",
    dataType = "",
    notes = "5b36e5329d2feff19b29ece6"
  )
  private String provinceCode;

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
    name = "isDefault",
    scene = "",
    nameCN = "是否默认",
    comment = "是否默认",
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
    value = "是否默认",
    dataType = "",
    notes = "5b35de739d2feff19b42fe65"
  )
  private Integer isDefault;

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

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasOrgBalBankDTO, Long> _id = o -> o.getId();
    public static final Function<BasOrgBalBankDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasOrgBalBankDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasOrgBalBankDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<BasOrgBalBankDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<BasOrgBalBankDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<BasOrgBalBankDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<BasOrgBalBankDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<BasOrgBalBankDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<BasOrgBalBankDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasOrgBalBankDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasOrgBalBankDTO, String> _bank = o -> o.getBank();
    public static final Function<BasOrgBalBankDTO, String> _provinceName = o -> o.getProvinceName();
    public static final Function<BasOrgBalBankDTO, String> _cityName = o -> o.getCityName();
    public static final Function<BasOrgBalBankDTO, String> _registerBank = o -> o.getRegisterBank();
    public static final Function<BasOrgBalBankDTO, String> _accountName = o -> o.getAccountName();
    public static final Function<BasOrgBalBankDTO, String> _bankAccountNo =
        o -> o.getBankAccountNo();
    public static final Function<BasOrgBalBankDTO, String> _cityCode = o -> o.getCityCode();
    public static final Function<BasOrgBalBankDTO, String> _provinceCode = o -> o.getProvinceCode();
    public static final Function<BasOrgBalBankDTO, Long> _balOrgId = o -> o.getBalOrgId();
    public static final Function<BasOrgBalBankDTO, Integer> _isDefault = o -> o.getIsDefault();
    public static final Function<BasOrgBalBankDTO, String> _remark = o -> o.getRemark();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
