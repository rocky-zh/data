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
import static com.pagoda.test.api.dto.group.BasDriverDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasDriver")
@ApiModel(value = "BasDriverDTO", description = "司机定义")
@EntityFeature(
  entityName = "BasDriverDTO",
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
public class BasDriverDTO extends AbstractDTO implements Serializable {

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
    nameCN = "司机编码[driver_code]",
    comment = "司机编码[driver_code]",
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
    value = "司机编码[driver_code]",
    dataType = "",
    notes = "5b4c7b9877604a00016948ad"
  )
  private String code;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "司机姓名[driver_name]",
    comment = "司机姓名[driver_name]",
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
    value = "司机姓名[driver_name]",
    dataType = "",
    notes = "5b4c7b9877604a00016948af"
  )
  private String name;

  @FieldMeta(
    name = "mobile",
    scene = "",
    nameCN = "司机手机号",
    comment = "司机手机号",
    nameEN = "mobile",
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
    name = "mobile",
    value = "司机手机号",
    dataType = "",
    notes = "5b519d8f4772960001e54c1f"
  )
  private String mobile;

  @FieldMeta(
    name = "shortNum",
    scene = "",
    nameCN = "短号",
    comment = "短号",
    nameEN = "short_num",
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
    name = "shortNum",
    value = "短号",
    dataType = "",
    notes = "5b519d8f4772960001e54c21"
  )
  private String shortNum;

  @FieldMeta(
    name = "plateNum",
    scene = "",
    nameCN = "车牌",
    comment = "车牌",
    nameEN = "plate_num",
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
    name = "plateNum",
    value = "车牌",
    dataType = "",
    notes = "5b519d8f4772960001e54c23"
  )
  private String plateNum;

  @FieldMeta(
    name = "loadingWeight",
    scene = "",
    nameCN = "车辆额定装载重量,单位(吨)",
    comment = "车辆额定装载重量,单位(吨)",
    nameEN = "loading_weight",
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
    name = "loadingWeight",
    value = "车辆额定装载重量,单位(吨)",
    dataType = "",
    notes = "5b519d8f4772960001e54c25"
  )
  private java.math.BigDecimal loadingWeight;

  @FieldMeta(
    name = "loadingVolume",
    scene = "",
    nameCN = "车辆额定装载体积,单位(立方)",
    comment = "车辆额定装载体积,单位(立方)",
    nameEN = "loading_volume",
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
    name = "loadingVolume",
    value = "车辆额定装载体积,单位(立方)",
    dataType = "",
    notes = "5b519d8f4772960001e54c27"
  )
  private java.math.BigDecimal loadingVolume;

  @FieldMeta(
    name = "payAcountNo",
    scene = "",
    nameCN = "付款银行帐号",
    comment = "付款银行帐号",
    nameEN = "pay_acount_no",
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
    name = "payAcountNo",
    value = "付款银行帐号",
    dataType = "",
    notes = "5b519d8f4772960001e54c29"
  )
  private String payAcountNo;

  @FieldMeta(
    name = "registeBank",
    scene = "",
    nameCN = "开户银行",
    comment = "开户银行",
    nameEN = "registe_bank",
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
    name = "registeBank",
    value = "开户银行",
    dataType = "",
    notes = "5b519d8f4772960001e54c2b"
  )
  private String registeBank;

  @FieldMeta(
    name = "driverIdNumber",
    scene = "",
    nameCN = "司机身份证号",
    comment = "司机身份证号",
    nameEN = "driver_id_number",
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
    name = "driverIdNumber",
    value = "司机身份证号",
    dataType = "",
    notes = "5b519d8f4772960001e54c2d"
  )
  private String driverIdNumber;

  @FieldMeta(
    name = "conOrgCode",
    scene = "",
    nameCN = "配送机构代码",
    comment = "配送机构代码",
    nameEN = "con_org_code",
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
    name = "conOrgCode",
    value = "配送机构代码",
    dataType = "",
    notes = "5b519d904772960001e54c2f"
  )
  private String conOrgCode;

  @FieldMeta(
    name = "conOrgName",
    scene = "",
    nameCN = "配送机构名称",
    comment = "配送机构名称",
    nameEN = "con_org_name",
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
    name = "conOrgName",
    value = "配送机构名称",
    dataType = "",
    notes = "5b519d904772960001e54c31"
  )
  private String conOrgName;

  @FieldMeta(
    name = "enabled",
    scene = "",
    nameCN = "是否可用{0不可用，1 可用}",
    comment = "是否可用{0不可用，1 可用}",
    nameEN = "enabled",
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
    name = "enabled",
    value = "是否可用{0不可用，1 可用}",
    dataType = "",
    notes = "5b505faf4772960001e54ae6"
  )
  private Integer enabled;

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
    notes = "5b4d4de377604a0001694a2d"
  )
  private String remark;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<BasDriverDTO, Long> id_ = o -> o.getId();
    public static Function<BasDriverDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<BasDriverDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<BasDriverDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<BasDriverDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<BasDriverDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<BasDriverDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<BasDriverDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<BasDriverDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<BasDriverDTO, String> modifierOrgCode_ = o -> o.getModifierOrgCode();

    public static Function<BasDriverDTO, Integer> version_ = o -> o.getVersion();

    public static Function<BasDriverDTO, String> code_ = o -> o.getCode();
    public static Function<BasDriverDTO, String> name_ = o -> o.getName();
    public static Function<BasDriverDTO, String> mobile_ = o -> o.getMobile();
    public static Function<BasDriverDTO, String> shortNum_ = o -> o.getShortNum();
    public static Function<BasDriverDTO, String> plateNum_ = o -> o.getPlateNum();
    public static Function<BasDriverDTO, java.math.BigDecimal> loadingWeight_ =
        o -> o.getLoadingWeight();
    public static Function<BasDriverDTO, java.math.BigDecimal> loadingVolume_ =
        o -> o.getLoadingVolume();
    public static Function<BasDriverDTO, String> payAcountNo_ = o -> o.getPayAcountNo();
    public static Function<BasDriverDTO, String> registeBank_ = o -> o.getRegisteBank();
    public static Function<BasDriverDTO, String> driverIdNumber_ = o -> o.getDriverIdNumber();
    public static Function<BasDriverDTO, String> conOrgCode_ = o -> o.getConOrgCode();
    public static Function<BasDriverDTO, String> conOrgName_ = o -> o.getConOrgName();
    public static Function<BasDriverDTO, Integer> enabled_ = o -> o.getEnabled();
    public static Function<BasDriverDTO, String> remark_ = o -> o.getRemark();
  }

  public static ValidatorBuilder<BasDriverDTO> validatorExample() {
    ValidatorBuilder<BasDriverDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
