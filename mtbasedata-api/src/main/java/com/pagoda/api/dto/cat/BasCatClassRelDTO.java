package com.pagoda.api.dto.cat;

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
import static com.pagoda.api.dto.cat.BasCatClassRelDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasCatClassRel")
@ApiModel(value = "BasCatClassRelDTO", description = "目录分类关系表")
@EntityFeature(
  entityName = "BasCatClassRelDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = true,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class BasCatClassRelDTO extends AbstractDTO implements Serializable {

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
    name = "objId",
    scene = "",
    nameCN = "对象ID(比如目录为商品，则此放入商品ID)",
    comment = "对象ID(比如目录为商品，则此放入商品ID)",
    nameEN = "obj_id",
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
    name = "objId",
    value = "对象ID(比如目录为商品，则此放入商品ID)",
    dataType = "",
    notes = "5b35f8bb9d2feff19b543496"
  )
  private Long objId;

  @FieldMeta(
    name = "objCode",
    scene = "",
    nameCN = "对象代码[冗余]",
    comment = "对象代码[冗余]",
    nameEN = "obj_code",
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
    name = "objCode",
    value = "对象代码[冗余]",
    dataType = "",
    notes = "5b35f8bb9d2feff19b543495"
  )
  private String objCode;

  @FieldMeta(
    name = "objName",
    scene = "",
    nameCN = "对象名称[冗余]",
    comment = "对象名称[冗余]",
    nameEN = "obj_name",
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
    name = "objName",
    value = "对象名称[冗余]",
    dataType = "",
    notes = "5b35f8bb9d2feff19b54349a"
  )
  private String objName;

  @FieldMeta(
    name = "catClassId",
    scene = "",
    nameCN = "目录分类ID",
    comment = "目录分类ID",
    nameEN = "cat_class_id",
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
    name = "catClassId",
    value = "目录分类ID",
    dataType = "",
    notes = "5b35f8bb9d2feff19b54349d"
  )
  private Long catClassId;

  @FieldMeta(
    name = "catClassCode",
    scene = "",
    nameCN = "目录分类代码",
    comment = "目录分类代码",
    nameEN = "cat_class_code",
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
    name = "catClassCode",
    value = "目录分类代码",
    dataType = "",
    notes = "5b35f8bb9d2feff19b543498"
  )
  private String catClassCode;

  @FieldMeta(
    name = "catClassName",
    scene = "",
    nameCN = "目录分类名称",
    comment = "目录分类名称",
    nameEN = "cat_class_name",
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
    name = "catClassName",
    value = "目录分类名称",
    dataType = "",
    notes = "5b35f8bb9d2feff19b54349e"
  )
  private String catClassName;

  @FieldMeta(
    name = "uniqueId",
    scene = "",
    nameCN = "唯一性ID[if bas_cat.isMulti=Y then =id else =0]",
    comment = "唯一性ID[if bas_cat.isMulti=Y then =id else =0]",
    nameEN = "unique_id",
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
    name = "uniqueId",
    value = "唯一性ID[if bas_cat.isMulti=Y then =id else =0]",
    dataType = "",
    notes = "5b35f8bb9d2feff19b5434a2"
  )
  private Long uniqueId;

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
    name = "path",
    scene = "",
    nameCN = "物化路径[/catclassid/catclassid/]",
    comment = "物化路径[/catclassid/catclassid/]",
    nameEN = "path",
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
    name = "path",
    value = "物化路径[/catclassid/catclassid/]",
    dataType = "",
    notes = "5b35f6ae9d2feff19b528804"
  )
  private String path;

  @FieldMeta(
    name = "catId",
    scene = "",
    nameCN = "目录ID",
    comment = "目录ID",
    nameEN = "cat_id",
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
    name = "catId",
    value = "目录ID",
    dataType = "",
    notes = "5b35f6ae9d2feff19b5287f3"
  )
  private Long catId;

  @FieldMeta(
    name = "tableId",
    scene = "",
    nameCN = "元id",
    comment = "元id",
    nameEN = "table_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = true,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "tableId",
    value = "元id",
    dataType = "",
    notes = "5b35ecaf9d2feff19b4b1c38"
  )
  private Long tableId;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasCatClassRelDTO, Long> _id = o -> o.getId();
    public static final Function<BasCatClassRelDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasCatClassRelDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasCatClassRelDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<BasCatClassRelDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<BasCatClassRelDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<BasCatClassRelDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<BasCatClassRelDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<BasCatClassRelDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<BasCatClassRelDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasCatClassRelDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasCatClassRelDTO, Long> _objId = o -> o.getObjId();
    public static final Function<BasCatClassRelDTO, String> _objCode = o -> o.getObjCode();
    public static final Function<BasCatClassRelDTO, String> _objName = o -> o.getObjName();
    public static final Function<BasCatClassRelDTO, Long> _catClassId = o -> o.getCatClassId();
    public static final Function<BasCatClassRelDTO, String> _catClassCode =
        o -> o.getCatClassCode();
    public static final Function<BasCatClassRelDTO, String> _catClassName =
        o -> o.getCatClassName();
    public static final Function<BasCatClassRelDTO, Long> _uniqueId = o -> o.getUniqueId();
    public static final Function<BasCatClassRelDTO, Long> _entId = o -> o.getEntId();
    public static final Function<BasCatClassRelDTO, String> _path = o -> o.getPath();
    public static final Function<BasCatClassRelDTO, Long> _catId = o -> o.getCatId();
    public static final Function<BasCatClassRelDTO, Long> _tableId = o -> o.getTableId();
  }

  public static ValidatorBuilder<BasCatClassRelDTO> validatorExample() {
    ValidatorBuilder<BasCatClassRelDTO> builder = new ValidatorBuilder();
    builder.field(_tableId, notNull, "元id为空");
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
