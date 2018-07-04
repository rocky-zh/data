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
import static com.pagoda.api.dto.org.BasDistrictDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasDistrict")
@ApiModel(value = "BasDistrictDTO", description = "bas_district")
@EntityFeature(
  entityName = "BasDistrictDTO",
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
public class BasDistrictDTO extends AbstractDTO implements Serializable {

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
    name = "districtLevel",
    scene = "",
    nameCN = "行政级别(0-国家，10-省，直辖市，20-地级市，30-县级市)",
    comment = "行政级别(0-国家，10-省，直辖市，20-地级市，30-县级市)",
    nameEN = "district_level",
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
    name = "districtLevel",
    value = "行政级别(0-国家，10-省，直辖市，20-地级市，30-县级市)",
    dataType = "",
    notes = "5b39c8f29d2feff19b6d0bf7"
  )
  private Integer districtLevel;

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
    name = "parentCode",
    scene = "",
    nameCN = "上级行政单位代码",
    comment = "上级行政单位代码",
    nameEN = "parent_code",
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
    name = "parentCode",
    value = "上级行政单位代码",
    dataType = "",
    notes = "5b36e5139d2feff19b29ccd0"
  )
  private String parentCode;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "行政单位名",
    comment = "行政单位名",
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
    value = "行政单位名",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d3"
  )
  private String name;

  @FieldMeta(
    name = "searchWord",
    scene = "",
    nameCN = "搜索关键词(存储name字段首字母)",
    comment = "搜索关键词(存储name字段首字母)",
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
    value = "搜索关键词(存储name字段首字母)",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d5"
  )
  private String searchWord;

  @FieldMeta(
    name = "adLat",
    scene = "",
    nameCN = "高德地址纬度",
    comment = "高德地址纬度",
    nameEN = "ad_lat",
    type = "小数",
    format = "",
    displayLen = 10,
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
    name = "adLat",
    value = "高德地址纬度",
    dataType = "",
    notes = "5b36e5139d2feff19b29ccca"
  )
  private java.math.BigDecimal adLat;

  @FieldMeta(
    name = "adLng",
    scene = "",
    nameCN = "高德地址经度",
    comment = "高德地址经度",
    nameEN = "ad_lng",
    type = "小数",
    format = "",
    displayLen = 10,
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
    name = "adLng",
    value = "高德地址经度",
    dataType = "",
    notes = "5b36e5139d2feff19b29cccc"
  )
  private java.math.BigDecimal adLng;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasDistrictDTO, Long> _id = o -> o.getId();
    public static final Function<BasDistrictDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasDistrictDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasDistrictDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<BasDistrictDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<BasDistrictDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<BasDistrictDTO, Date> _lastModifiedAt = o -> o.getLastModifiedAt();
    public static final Function<BasDistrictDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<BasDistrictDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<BasDistrictDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasDistrictDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasDistrictDTO, Integer> _districtLevel =
        o -> o.getDistrictLevel();
    public static final Function<BasDistrictDTO, String> _code = o -> o.getCode();
    public static final Function<BasDistrictDTO, String> _parentCode = o -> o.getParentCode();
    public static final Function<BasDistrictDTO, String> _name = o -> o.getName();
    public static final Function<BasDistrictDTO, String> _searchWord = o -> o.getSearchWord();
    public static final Function<BasDistrictDTO, java.math.BigDecimal> _adLat = o -> o.getAdLat();
    public static final Function<BasDistrictDTO, java.math.BigDecimal> _adLng = o -> o.getAdLng();
  }

  public static ValidatorBuilder<BasDistrictDTO> validatorExample() {
    ValidatorBuilder<BasDistrictDTO> builder = new ValidatorBuilder();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
