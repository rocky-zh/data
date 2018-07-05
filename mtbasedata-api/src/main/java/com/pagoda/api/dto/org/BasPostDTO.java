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
import static com.pagoda.api.dto.org.BasPostDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasPost")
@ApiModel(value = "BasPostDTO", description = "岗位表  ")
@EntityFeature(
  entityName = "BasPostDTO",
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
public class BasPostDTO extends AbstractDTO implements Serializable {

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
    name = "postLeader",
    scene = "",
    nameCN = "岗位领导{存员工表的id}",
    comment = "岗位领导{存员工表的id}",
    nameEN = "post_leader",
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
    name = "postLeader",
    value = "岗位领导{存员工表的id}",
    dataType = "",
    notes = "5b35e2419d2feff19b448aa0"
  )
  private Long postLeader;

  @FieldMeta(
    name = "isBusRelated",
    scene = "",
    nameCN = "是否业务相关(0:否,1:是)",
    comment = "是否业务相关(0:否,1:是)",
    nameEN = "is_bus_related",
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
    name = "isBusRelated",
    value = "是否业务相关(0:否,1:是)",
    dataType = "",
    notes = "5b35e2419d2feff19b448aa5"
  )
  private Integer isBusRelated;

  @FieldMeta(
    name = "remak",
    scene = "",
    nameCN = "备注",
    comment = "备注",
    nameEN = "remak",
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
  @ApiModelProperty(name = "remak", value = "备注", dataType = "", notes = "5b35e2419d2feff19b448aa1")
  private String remak;

  @FieldMeta(
    name = "code",
    scene = "",
    nameCN = "行政单位代码",
    comment = "行政单位代码",
    nameEN = "code",
    type = "字符串",
    format = "",
    displayLen = 32,
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
    value = "行政单位代码",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3cf"
  )
  private String code;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "产成商品名",
    comment = "产成商品名",
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
    value = "产成商品名",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d3"
  )
  private String name;

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

  @FieldMeta(
    name = "depId",
    scene = "",
    nameCN = "部门ID ",
    comment = "部门ID ",
    nameEN = "dep_id",
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
    name = "depId",
    value = "部门ID ",
    dataType = "",
    notes = "5b35d8689d2feff19b4169b4"
  )
  private Long depId;

  @FieldMeta(
    name = "showOrder",
    scene = "",
    nameCN = "排序",
    comment = "排序",
    nameEN = "show_order",
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
    name = "showOrder",
    value = "排序",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d9"
  )
  private Integer showOrder;

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

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasPostDTO, Long> _id = o -> o.getId();
    public static final Function<BasPostDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasPostDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasPostDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<BasPostDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<BasPostDTO, String> _creatorOrgCode = o -> o.getCreatorOrgCode();
    public static final Function<BasPostDTO, Date> _lastModifiedAt = o -> o.getLastModifiedAt();
    public static final Function<BasPostDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<BasPostDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<BasPostDTO, String> _modifierOrgCode = o -> o.getModifierOrgCode();

    public static final Function<BasPostDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasPostDTO, Long> _postLeader = o -> o.getPostLeader();
    public static final Function<BasPostDTO, Integer> _isBusRelated = o -> o.getIsBusRelated();
    public static final Function<BasPostDTO, String> _remak = o -> o.getRemak();
    public static final Function<BasPostDTO, String> _code = o -> o.getCode();
    public static final Function<BasPostDTO, String> _name = o -> o.getName();
    public static final Function<BasPostDTO, Long> _entId = o -> o.getEntId();
    public static final Function<BasPostDTO, Long> _depId = o -> o.getDepId();
    public static final Function<BasPostDTO, Integer> _showOrder = o -> o.getShowOrder();
    public static final Function<BasPostDTO, Integer> _isEnabled = o -> o.getIsEnabled();
  }

  public static ValidatorBuilder<BasPostDTO> validatorExample() {
    ValidatorBuilder<BasPostDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
