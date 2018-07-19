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
import static com.pagoda.test.api.dto.group.BasCatDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasCat")
@ApiModel(value = "BasCatDTO", description = "目录定义  1-level： tableid  包含：机构，供应商，客户，库房  2-level: ")
@EntityFeature(
  entityName = "BasCatDTO",
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
public class BasCatDTO extends AbstractDTO implements Serializable {

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
    name = "codeTest",
    scene = "",
    nameCN = "目录代码[cat]",
    comment = "目录代码[cat]",
    nameEN = "code_test",
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
    name = "codeTest",
    value = "目录代码[cat]",
    dataType = "",
    notes = "5b4d4de377604a0001694a23"
  )
  private String codeTest;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "商品名称[goodsName]",
    comment = "商品名称[goodsName]",
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
    value = "商品名称[goodsName]",
    dataType = "",
    notes = "5b4c7b9877604a00016948af"
  )
  private String name;

  @FieldMeta(
    name = "searchWord",
    scene = "",
    nameCN = "搜索关键词,多个关键词用逗号隔开,用户自定义",
    comment = "搜索关键词,多个关键词用逗号隔开,用户自定义",
    nameEN = "search_word",
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
    name = "searchWord",
    value = "搜索关键词,多个关键词用逗号隔开,用户自定义",
    dataType = "",
    notes = "5b4c7b9977604a00016948c1"
  )
  private String searchWord;

  @FieldMeta(
    name = "entId",
    scene = "",
    nameCN = "企业ID",
    comment = "企业ID",
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
    value = "企业ID",
    dataType = "",
    notes = "5b4c7b9977604a00016948b7"
  )
  private Long entId;

  @FieldMeta(
    name = "tableId",
    scene = "",
    nameCN = "元ID{1:机构,2:商品,3:供应商,4:客户,5:库房} （外键关联对象类型表bas_table,例如tableid=2 为商品。相当于为商品目录定义）",
    comment = "元ID{1:机构,2:商品,3:供应商,4:客户,5:库房} （外键关联对象类型表bas_table,例如tableid=2 为商品。相当于为商品目录定义）",
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
    name = "tableId",
    value = "元ID{1:机构,2:商品,3:供应商,4:客户,5:库房} （外键关联对象类型表bas_table,例如tableid=2 为商品。相当于为商品目录定义）",
    dataType = "",
    notes = "5b4d4de377604a0001694a25"
  )
  private Long tableId;

  @FieldMeta(
    name = "isEnabled",
    scene = "",
    nameCN =
        "是否可用标识:              1.设置为不可用，必须在系统相关中去掉此库房关联                 (1)去掉机构项目中对于此库房的挂接。（供应商项目管理和销售发货机构项目管理）                 (2)库房内商品库存量必须都为0              ",
    comment =
        "是否可用标识:              1.设置为不可用，必须在系统相关中去掉此库房关联                 (1)去掉机构项目中对于此库房的挂接。（供应商项目管理和销售发货机构项目管理）                 (2)库房内商品库存量必须都为0              ",
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
    value =
        "是否可用标识:              1.设置为不可用，必须在系统相关中去掉此库房关联                 (1)去掉机构项目中对于此库房的挂接。（供应商项目管理和销售发货机构项目管理）                 (2)库房内商品库存量必须都为0              ",
    dataType = "",
    notes = "5b4c7b9977604a00016948f9"
  )
  private Integer isEnabled;

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
    notes = "5b4d4de377604a0001694a27"
  )
  private Integer isDefault;

  @FieldMeta(
    name = "isMulti",
    scene = "",
    nameCN = "是否允许对象多次挂接分类[现部门为1，其他为0]",
    comment = "是否允许对象多次挂接分类[现部门为1，其他为0]",
    nameEN = "is_multi",
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
    name = "isMulti",
    value = "是否允许对象多次挂接分类[现部门为1，其他为0]",
    dataType = "",
    notes = "5b4d4de377604a0001694a29"
  )
  private Integer isMulti;

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
    notes = "5b4d4de377604a0001694a2b"
  )
  private Integer showOrder;

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
    public static Function<BasCatDTO, Long> id_ = o -> o.getId();
    public static Function<BasCatDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<BasCatDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<BasCatDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<BasCatDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<BasCatDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<BasCatDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<BasCatDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<BasCatDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<BasCatDTO, String> modifierOrgCode_ = o -> o.getModifierOrgCode();

    public static Function<BasCatDTO, Integer> version_ = o -> o.getVersion();

    public static Function<BasCatDTO, String> codeTest_ = o -> o.getCodeTest();
    public static Function<BasCatDTO, String> name_ = o -> o.getName();
    public static Function<BasCatDTO, String> searchWord_ = o -> o.getSearchWord();
    public static Function<BasCatDTO, Long> entId_ = o -> o.getEntId();
    public static Function<BasCatDTO, Long> tableId_ = o -> o.getTableId();
    public static Function<BasCatDTO, Integer> isEnabled_ = o -> o.getIsEnabled();
    public static Function<BasCatDTO, Integer> isDefault_ = o -> o.getIsDefault();
    public static Function<BasCatDTO, Integer> isMulti_ = o -> o.getIsMulti();
    public static Function<BasCatDTO, Integer> showOrder_ = o -> o.getShowOrder();
    public static Function<BasCatDTO, String> remark_ = o -> o.getRemark();
  }

  public static ValidatorBuilder<BasCatDTO> validatorExample() {
    ValidatorBuilder<BasCatDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
