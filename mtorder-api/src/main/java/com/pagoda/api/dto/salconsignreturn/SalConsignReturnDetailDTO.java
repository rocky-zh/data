package com.pagoda.api.dto.salconsignreturn;

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

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalConsignReturnDetail")
@ApiModel(value = "SalConsignReturnDetailDTO", description = "退货单明细表")
@EntityFeature(
  entityName = "SalConsignReturnDetailDTO",
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
public class SalConsignReturnDetailDTO extends AbstractDTO implements Serializable {

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
    name = "returnId",
    scene = "",
    nameCN = "退货单ID",
    comment = "退货单ID",
    nameEN = "return_id",
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
    name = "returnId",
    value = "退货单ID",
    dataType = "",
    notes = "5b35de169d2feff19b42dc3c"
  )
  private Long returnId;

  @FieldMeta(
    name = "returnSeqno",
    scene = "",
    nameCN = "退货单号[冗余]",
    comment = "退货单号[冗余]",
    nameEN = "return_seqno",
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
    name = "returnSeqno",
    value = "退货单号[冗余]",
    dataType = "",
    notes = "5b35de169d2feff19b42dc40"
  )
  private String returnSeqno;

  @FieldMeta(
    name = "salRate",
    scene = "",
    nameCN = "销售单位转换比(销售单位转为基础单位转换比)",
    comment = "销售单位转换比(销售单位转为基础单位转换比)",
    nameEN = "sal_rate",
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
    name = "salRate",
    value = "销售单位转换比(销售单位转为基础单位转换比)",
    dataType = "",
    notes = "5b35de169d2feff19b42dc44"
  )
  private java.math.BigDecimal salRate;

  @FieldMeta(
    name = "salRetInDepotId",
    scene = "",
    nameCN = "默认销售退货入库库房",
    comment = "默认销售退货入库库房",
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
    value = "默认销售退货入库库房",
    dataType = "",
    notes = "5b35de169d2feff19b42dc3e"
  )
  private Long salRetInDepotId;

  @FieldMeta(
    name = "salRetInDepotCode",
    scene = "",
    nameCN = "默认销售退货入库库房代码[冗余]",
    comment = "默认销售退货入库库房代码[冗余]",
    nameEN = "sal_ret_in_depot_code",
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
    name = "salRetInDepotCode",
    value = "默认销售退货入库库房代码[冗余]",
    dataType = "",
    notes = "5b35de169d2feff19b42dc43"
  )
  private String salRetInDepotCode;

  @FieldMeta(
    name = "salRetInDepotName",
    scene = "",
    nameCN = "默认销售退货入库库房名称[冗余]",
    comment = "默认销售退货入库库房名称[冗余]",
    nameEN = "sal_ret_in_depot_name",
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
    name = "salRetInDepotName",
    value = "默认销售退货入库库房名称[冗余]",
    dataType = "",
    notes = "5b35de169d2feff19b42dc48"
  )
  private String salRetInDepotName;

  @FieldMeta(
    name = "returnPrice",
    scene = "",
    nameCN = "退货价格",
    comment = "退货价格",
    nameEN = "return_price",
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
    name = "returnPrice",
    value = "退货价格",
    dataType = "",
    notes = "5b35de169d2feff19b42dc46"
  )
  private java.math.BigDecimal returnPrice;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<SalConsignReturnDetailDTO, Long> _id = o -> o.getId();
    public static final Function<SalConsignReturnDetailDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<SalConsignReturnDetailDTO, Date> _createdAt =
        o -> o.getCreatedAt();
    public static final Function<SalConsignReturnDetailDTO, String> _creatorCode =
        o -> o.getCreatorCode();
    public static final Function<SalConsignReturnDetailDTO, String> _creatorName =
        o -> o.getCreatorName();
    public static final Function<SalConsignReturnDetailDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<SalConsignReturnDetailDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<SalConsignReturnDetailDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<SalConsignReturnDetailDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<SalConsignReturnDetailDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<SalConsignReturnDetailDTO, Integer> _version = o -> o.getVersion();

    public static final Function<SalConsignReturnDetailDTO, Long> _returnId = o -> o.getReturnId();
    public static final Function<SalConsignReturnDetailDTO, String> _returnSeqno =
        o -> o.getReturnSeqno();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _salRate =
        o -> o.getSalRate();
    public static final Function<SalConsignReturnDetailDTO, Long> _salRetInDepotId =
        o -> o.getSalRetInDepotId();
    public static final Function<SalConsignReturnDetailDTO, String> _salRetInDepotCode =
        o -> o.getSalRetInDepotCode();
    public static final Function<SalConsignReturnDetailDTO, String> _salRetInDepotName =
        o -> o.getSalRetInDepotName();
    public static final Function<SalConsignReturnDetailDTO, java.math.BigDecimal> _returnPrice =
        o -> o.getReturnPrice();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
