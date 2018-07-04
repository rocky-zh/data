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
import static com.pagoda.api.dto.org.BasOrgVenDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasOrgVen")
@ApiModel(value = "BasOrgVenDTO", description = "往来单位-011 供应商明细表")
@EntityFeature(
  entityName = "BasOrgVenDTO",
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
public class BasOrgVenDTO extends AbstractDTO implements Serializable {

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
    name = "isOpenSrm",
    scene = "",
    nameCN = "是否开通供应商协助平台",
    comment = "是否开通供应商协助平台",
    nameEN = "is_open_srm",
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
    name = "isOpenSrm",
    value = "是否开通供应商协助平台",
    dataType = "",
    notes = "5b35e21f9d2feff19b447a4c"
  )
  private Integer isOpenSrm;

  @FieldMeta(
    name = "orgId",
    scene = "",
    nameCN = "往来单位ID[orgid]",
    comment = "往来单位ID[orgid]",
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
    value = "往来单位ID[orgid]",
    dataType = "",
    notes = "5b35dc1a9d2feff19b423b8e"
  )
  private Long orgId;

  @FieldMeta(
    name = "enabledStatus",
    scene = "",
    nameCN = "供应商可用状态{10:淘汰,20:可用,30:未激活}",
    comment = "供应商可用状态{10:淘汰,20:可用,30:未激活}",
    nameEN = "enabled_status",
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
    name = "enabledStatus",
    value = "供应商可用状态{10:淘汰,20:可用,30:未激活}",
    dataType = "",
    notes = "5b35e1159d2feff19b440034"
  )
  private Integer enabledStatus;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasOrgVenDTO, Long> _id = o -> o.getId();
    public static final Function<BasOrgVenDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasOrgVenDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasOrgVenDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<BasOrgVenDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<BasOrgVenDTO, String> _creatorOrgCode = o -> o.getCreatorOrgCode();
    public static final Function<BasOrgVenDTO, Date> _lastModifiedAt = o -> o.getLastModifiedAt();
    public static final Function<BasOrgVenDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<BasOrgVenDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<BasOrgVenDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasOrgVenDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasOrgVenDTO, Integer> _isOpenSrm = o -> o.getIsOpenSrm();
    public static final Function<BasOrgVenDTO, Long> _orgId = o -> o.getOrgId();
    public static final Function<BasOrgVenDTO, Integer> _enabledStatus = o -> o.getEnabledStatus();
  }

  public static ValidatorBuilder<BasOrgVenDTO> validatorExample() {
    ValidatorBuilder<BasOrgVenDTO> builder = new ValidatorBuilder();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
