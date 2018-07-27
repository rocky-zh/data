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
import static com.pagoda.test.api.dto.group.SalConsignDetailDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalConsignDetail")
@ApiModel(value = "SalConsignDetailDTO", description = "发货单明细表")
@EntityFeature(
  entityName = "SalConsignDetailDTO",
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
public class SalConsignDetailDTO extends AbstractDTO implements Serializable {

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
    name = "mnemWord",
    scene = "",
    nameCN = "助记词",
    comment = "助记词",
    nameEN = "mnem_word",
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
    name = "mnemWord",
    value = "助记词",
    dataType = "",
    notes = "5b4c7b9977604a00016948c3"
  )
  private String mnemWord;

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

  /** DTO字段的getter */
  public static class Getters {
    public static Function<SalConsignDetailDTO, Long> id_ = o -> o.getId();
    public static Function<SalConsignDetailDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<SalConsignDetailDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<SalConsignDetailDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<SalConsignDetailDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<SalConsignDetailDTO, String> creatorOrgCode_ =
        o -> o.getCreatorOrgCode();
    public static Function<SalConsignDetailDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<SalConsignDetailDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<SalConsignDetailDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<SalConsignDetailDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<SalConsignDetailDTO, Integer> version_ = o -> o.getVersion();

    public static Function<SalConsignDetailDTO, String> mnemWord_ = o -> o.getMnemWord();
    public static Function<SalConsignDetailDTO, String> registeBank_ = o -> o.getRegisteBank();
  }

  public static ValidatorBuilder<SalConsignDetailDTO> validatorExample() {
    ValidatorBuilder<SalConsignDetailDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
