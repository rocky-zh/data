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
import static com.pagoda.api.dto.org.BasOrgOrgDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasOrgOrg")
@ApiModel(value = "BasOrgOrgDTO", description = "往来单位-机构明细表")
@EntityFeature(
  entityName = "BasOrgOrgDTO",
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
public class BasOrgOrgDTO extends AbstractDTO implements Serializable {

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
    name = "dualDepotId",
    scene = "",
    nameCN = "默认虚拟库房",
    comment = "默认虚拟库房",
    nameEN = "dual_depot_id",
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
    name = "dualDepotId",
    value = "默认虚拟库房",
    dataType = "",
    notes = "5b35e2079d2feff19b446def"
  )
  private Long dualDepotId;

  @FieldMeta(
    name = "dualOrgId",
    scene = "",
    nameCN = "父级虚拟机构",
    comment = "父级虚拟机构",
    nameEN = "dual_org_id",
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
    name = "dualOrgId",
    value = "父级虚拟机构",
    dataType = "",
    notes = "5b35e2079d2feff19b446df3"
  )
  private Long dualOrgId;

  @FieldMeta(
    name = "isOrgTaxRate",
    scene = "",
    nameCN = "是否使用机构商品税率",
    comment = "是否使用机构商品税率",
    nameEN = "is_org_tax_rate",
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
    name = "isOrgTaxRate",
    value = "是否使用机构商品税率",
    dataType = "",
    notes = "5b35e2079d2feff19b446df9"
  )
  private Integer isOrgTaxRate;

  @FieldMeta(
    name = "isOrgEnabled",
    scene = "",
    nameCN = "是否机构可用",
    comment = "是否机构可用",
    nameEN = "is_org_enabled",
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
    name = "isOrgEnabled",
    value = "是否机构可用",
    dataType = "",
    notes = "5b35e2079d2feff19b446df1"
  )
  private Integer isOrgEnabled;

  @FieldMeta(
    name = "isUsedWms",
    scene = "",
    nameCN = "是否已上WMS系统{1:是 0:否}",
    comment = "是否已上WMS系统{1:是 0:否}",
    nameEN = "is_used_wms",
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
    name = "isUsedWms",
    value = "是否已上WMS系统{1:是 0:否}",
    dataType = "",
    notes = "5b35e2079d2feff19b446dff"
  )
  private Integer isUsedWms;

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
    name = "salConOutDepotId",
    scene = "",
    nameCN = "默认销售出库库房ID",
    comment = "默认销售出库库房ID",
    nameEN = "sal_con_out_depot_id",
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
    name = "salConOutDepotId",
    value = "默认销售出库库房ID",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d97c"
  )
  private Long salConOutDepotId;

  @FieldMeta(
    name = "salRetInDepotId",
    scene = "",
    nameCN = "默认销售退货入库库房ID",
    comment = "默认销售退货入库库房ID",
    nameEN = "sal_ret_in_depot_id",
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
    name = "salRetInDepotId",
    value = "默认销售退货入库库房ID",
    dataType = "",
    notes = "5b35de169d2feff19b42dc3e"
  )
  private Long salRetInDepotId;

  @FieldMeta(
    name = "purRecInDepotId",
    scene = "",
    nameCN = "默认采购到货入库库房ID",
    comment = "默认采购到货入库库房ID",
    nameEN = "pur_rec_in_depot_id",
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
    name = "purRecInDepotId",
    value = "默认采购到货入库库房ID",
    dataType = "",
    notes = "5b35e1719d2feff19b4427e4"
  )
  private Long purRecInDepotId;

  @FieldMeta(
    name = "purRetOutDepotId",
    scene = "",
    nameCN = "默认采购退货出库库房ID",
    comment = "默认采购退货出库库房ID",
    nameEN = "pur_ret_out_depot_id",
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
    name = "purRetOutDepotId",
    value = "默认采购退货出库库房ID",
    dataType = "",
    notes = "5b35e1719d2feff19b4427de"
  )
  private Long purRetOutDepotId;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasOrgOrgDTO, Long> _id = o -> o.getId();
    public static final Function<BasOrgOrgDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasOrgOrgDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasOrgOrgDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<BasOrgOrgDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<BasOrgOrgDTO, String> _creatorOrgCode = o -> o.getCreatorOrgCode();
    public static final Function<BasOrgOrgDTO, Date> _lastModifiedAt = o -> o.getLastModifiedAt();
    public static final Function<BasOrgOrgDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<BasOrgOrgDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<BasOrgOrgDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasOrgOrgDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasOrgOrgDTO, Long> _dualDepotId = o -> o.getDualDepotId();
    public static final Function<BasOrgOrgDTO, Long> _dualOrgId = o -> o.getDualOrgId();
    public static final Function<BasOrgOrgDTO, Integer> _isOrgTaxRate = o -> o.getIsOrgTaxRate();
    public static final Function<BasOrgOrgDTO, Integer> _isOrgEnabled = o -> o.getIsOrgEnabled();
    public static final Function<BasOrgOrgDTO, Integer> _isUsedWms = o -> o.getIsUsedWms();
    public static final Function<BasOrgOrgDTO, Long> _orgId = o -> o.getOrgId();
    public static final Function<BasOrgOrgDTO, Long> _salConOutDepotId =
        o -> o.getSalConOutDepotId();
    public static final Function<BasOrgOrgDTO, Long> _salRetInDepotId = o -> o.getSalRetInDepotId();
    public static final Function<BasOrgOrgDTO, Long> _purRecInDepotId = o -> o.getPurRecInDepotId();
    public static final Function<BasOrgOrgDTO, Long> _purRetOutDepotId =
        o -> o.getPurRetOutDepotId();
  }

  public static ValidatorBuilder<BasOrgOrgDTO> validatorExample() {
    ValidatorBuilder<BasOrgOrgDTO> builder = new ValidatorBuilder();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
