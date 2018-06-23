package com.pagoda.api.dto.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.*;
import io.swagger.annotations.*;
import org.springframework.data.domain.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasCatClass")
@ApiModel(value = "BasCatClassDTO", description = "目录分类表")
@EntityFeature(
  entityName = "BasCatClassDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = true,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class BasCatClassDTO implements Serializable {

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

  @ApiModelProperty(name = "parent", value = "父节点", dataType = "BasCatClassDTO", notes = "")
  private BasCatClassDTO parent;

  @ApiModelProperty(name = "children", value = "子节点", dataType = "list", notes = "")
  private List<BasCatClassDTO> children;

  @FieldMeta(
    name = "treePath",
    nameCN = "树形节点路径",
    type = "string",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "treePath", value = "树形节点路径", dataType = "string", notes = "")
  private String treePath;

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
    name = "fullName",
    scene = "",
    nameCN = "全名",
    comment = "全名",
    nameEN = "full_name",
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
    name = "fullName",
    value = "全名",
    dataType = "字符串",
    notes = "5b2df44e7c51e0fcf5b91453"
  )
  private String fullName;

  @FieldMeta(
    name = "isLeaf",
    scene = "",
    nameCN = "是否子节点",
    comment = "是否子节点",
    nameEN = "is_leaf",
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
    name = "isLeaf",
    value = "是否子节点",
    dataType = "字符串",
    notes = "5b2df44e7c51e0fcf5b91456"
  )
  private String isLeaf;

  @FieldMeta(
    name = "levelNum",
    scene = "",
    nameCN = "层级数",
    comment = "层级数",
    nameEN = "level_num",
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
    name = "levelNum",
    value = "层级数",
    dataType = "整型",
    notes = "5b2df44e7c51e0fcf5b91458"
  )
  private Integer levelNum;

  @FieldMeta(
    name = "parentCatClassCode",
    scene = "",
    nameCN = "父目录分类代码",
    comment = "父目录分类代码",
    nameEN = "parent_cat_class_code",
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
    name = "parentCatClassCode",
    value = "父目录分类代码",
    dataType = "字符串",
    notes = "5b2df44e7c51e0fcf5b9145a"
  )
  private String parentCatClassCode;

  @FieldMeta(
    name = "parentCatClassId",
    scene = "",
    nameCN = "父目录分类Id",
    comment = "父目录分类Id",
    nameEN = "parent_cat_class_id",
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
    name = "parentCatClassId",
    value = "父目录分类Id",
    dataType = "整型",
    notes = "5b2df44e7c51e0fcf5b9145e"
  )
  private Integer parentCatClassId;

  @FieldMeta(
    name = "parentCatClassName",
    scene = "",
    nameCN = "父目录分类名称",
    comment = "父目录分类名称",
    nameEN = "parent_cat_class_name",
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
    name = "parentCatClassName",
    value = "父目录分类名称",
    dataType = "字符串",
    notes = "5b2df44e7c51e0fcf5b91461"
  )
  private String parentCatClassName;

  @FieldMeta(
    name = "path",
    scene = "",
    nameCN = "物化路径",
    comment = "物化路径",
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
    value = "物化路径",
    dataType = "字符串",
    notes = "5b2df44e7c51e0fcf5b9145c"
  )
  private String path;

  @FieldMeta(
    name = "sourceId",
    scene = "",
    nameCN = "来源Id",
    comment = "来源Id",
    nameEN = "source_id",
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
    name = "sourceId",
    value = "来源Id",
    dataType = "整型",
    notes = "5b2df44e7c51e0fcf5b91465"
  )
  private Integer sourceId;

  @FieldMeta(
    name = "code",
    scene = "fff",
    nameCN = "代码",
    comment = "代码",
    nameEN = "code",
    type = "字符串",
    format = "ll",
    displayLen = 23,
    formSize = "",
    constraint = "ll",
    constraintParams = "{\"prefix\":\"fx_er\"}",
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
    value = "代码",
    dataType = "字符串",
    notes = "5b2defe27c51e0fcf5b5d268"
  )
  private String code;

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;

  /**
   * 添加树形结构子节点
   *
   * @param child
   */
  public void addChild(BasCatClassDTO child) {
    if (children == null) {
      children = new ArrayList<>();
    }
    children.add(child);
  }
}
