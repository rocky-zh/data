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

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.InvCheckStockHead")
@ApiModel(value = "InvCheckStockHeadDTO", description = "盘点单头表")
@EntityFeature(
  entityName = "InvCheckStockHeadDTO",
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
public class InvCheckStockHeadDTO extends AbstractDTO implements Serializable {

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
    name = "active",
    scene = "",
    nameCN = "是否当前版本",
    comment = "是否当前版本",
    nameEN = "active",
    type = "布尔",
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
    name = "active",
    value = "是否当前版本",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ad2"
  )
  private Boolean active;

  @FieldMeta(
    name = "adjustDate",
    scene = "",
    nameCN = "调账日期",
    comment = "调账日期",
    nameEN = "adjust_date",
    type = "时间",
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
    name = "adjustDate",
    value = "调账日期",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ad4"
  )
  private java.sql.Timestamp adjustDate;

  @FieldMeta(
    name = "adjustUserId",
    scene = "",
    nameCN = "调账人Id",
    comment = "调账人Id",
    nameEN = "adjust_user_id",
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
    name = "adjustUserId",
    value = "调账人Id",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ad6"
  )
  private String adjustUserId;

  @FieldMeta(
    name = "billDate",
    scene = "",
    nameCN = "盘点日期",
    comment = "盘点日期",
    nameEN = "bill_date",
    type = "日期",
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
    name = "billDate",
    value = "盘点日期",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ad8"
  )
  private java.util.Date billDate;

  @FieldMeta(
    name = "billNo",
    scene = "",
    nameCN = "盘点单号",
    comment = "盘点单号",
    nameEN = "bill_no",
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
    name = "billNo",
    value = "盘点单号",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436adc"
  )
  private Long billNo;

  @FieldMeta(
    name = "billType",
    scene = "",
    nameCN = "{1:盘点单,2:封存单}",
    comment = "{1:盘点单,2:封存单}",
    nameEN = "bill_type",
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
    name = "billType",
    value = "{1:盘点单,2:封存单}",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ada"
  )
  private String billType;

  @FieldMeta(
    name = "checkQty",
    scene = "",
    nameCN = "盘点商品数量",
    comment = "盘点商品数量",
    nameEN = "check_qty",
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
    name = "checkQty",
    value = "盘点商品数量",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ade"
  )
  private Long checkQty;

  @FieldMeta(
    name = "checkStatus",
    scene = "",
    nameCN = "{00-创建中,10-盘点中,20-调账完成,30-已撤销}",
    comment = "{00-创建中,10-盘点中,20-调账完成,30-已撤销}",
    nameEN = "check_status",
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
    name = "checkStatus",
    value = "{00-创建中,10-盘点中,20-调账完成,30-已撤销}",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ae0"
  )
  private Integer checkStatus;

  @FieldMeta(
    name = "checkType",
    scene = "",
    nameCN = "{00-全盘，10局盘}",
    comment = "{00-全盘，10局盘}",
    nameEN = "check_type",
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
    name = "checkType",
    value = "{00-全盘，10局盘}",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ae2"
  )
  private Integer checkType;

  @FieldMeta(
    name = "depotCode",
    scene = "",
    nameCN = "库房代码",
    comment = "库房代码",
    nameEN = "depot_code",
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
    name = "depotCode",
    value = "库房代码",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ae4"
  )
  private String depotCode;

  @FieldMeta(
    name = "depotId",
    scene = "",
    nameCN = "库房Id",
    comment = "库房Id",
    nameEN = "depot_id",
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
    name = "depotId",
    value = "库房Id",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ae6"
  )
  private Long depotId;

  @FieldMeta(
    name = "depotName",
    scene = "",
    nameCN = "库房名称",
    comment = "库房名称",
    nameEN = "depot_name",
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
    name = "depotName",
    value = "库房名称",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436ae8"
  )
  private String depotName;

  @FieldMeta(
    name = "enabled",
    scene = "",
    nameCN = "是否启用",
    comment = "是否启用",
    nameEN = "enabled",
    type = "布尔",
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
    value = "是否启用",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436aea"
  )
  private Boolean enabled;

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
    notes = "5b31f3017c51e0fcf5436aec"
  )
  private Long entId;

  @FieldMeta(
    name = "periodNo",
    scene = "",
    nameCN = "核算期",
    comment = "核算期",
    nameEN = "period_no",
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
    name = "periodNo",
    value = "核算期",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436aee"
  )
  private Long periodNo;

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
    notes = "5b31f3017c51e0fcf5436af0"
  )
  private String remark;

  @FieldMeta(
    name = "ioLimit",
    scene = "",
    nameCN = "入出库限制",
    comment = "入出库限制",
    nameEN = "io_limit",
    type = "布尔",
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
    name = "ioLimit",
    value = "入出库限制",
    dataType = "",
    notes = "5b31f3017c51e0fcf5436af2"
  )
  private Boolean ioLimit;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<InvCheckStockHeadDTO, Long> _id = o -> o.getId();
    public static final Function<InvCheckStockHeadDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<InvCheckStockHeadDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<InvCheckStockHeadDTO, String> _creatorCode =
        o -> o.getCreatorCode();
    public static final Function<InvCheckStockHeadDTO, String> _creatorName =
        o -> o.getCreatorName();
    public static final Function<InvCheckStockHeadDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<InvCheckStockHeadDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<InvCheckStockHeadDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<InvCheckStockHeadDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<InvCheckStockHeadDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<InvCheckStockHeadDTO, Integer> _version = o -> o.getVersion();

    public static final Function<InvCheckStockHeadDTO, Boolean> _active = o -> o.getActive();
    public static final Function<InvCheckStockHeadDTO, java.sql.Timestamp> _adjustDate =
        o -> o.getAdjustDate();
    public static final Function<InvCheckStockHeadDTO, String> _adjustUserId =
        o -> o.getAdjustUserId();
    public static final Function<InvCheckStockHeadDTO, java.util.Date> _billDate =
        o -> o.getBillDate();
    public static final Function<InvCheckStockHeadDTO, Long> _billNo = o -> o.getBillNo();
    public static final Function<InvCheckStockHeadDTO, String> _billType = o -> o.getBillType();
    public static final Function<InvCheckStockHeadDTO, Long> _checkQty = o -> o.getCheckQty();
    public static final Function<InvCheckStockHeadDTO, Integer> _checkStatus =
        o -> o.getCheckStatus();
    public static final Function<InvCheckStockHeadDTO, Integer> _checkType = o -> o.getCheckType();
    public static final Function<InvCheckStockHeadDTO, String> _depotCode = o -> o.getDepotCode();
    public static final Function<InvCheckStockHeadDTO, Long> _depotId = o -> o.getDepotId();
    public static final Function<InvCheckStockHeadDTO, String> _depotName = o -> o.getDepotName();
    public static final Function<InvCheckStockHeadDTO, Boolean> _enabled = o -> o.getEnabled();
    public static final Function<InvCheckStockHeadDTO, Long> _entId = o -> o.getEntId();
    public static final Function<InvCheckStockHeadDTO, Long> _periodNo = o -> o.getPeriodNo();
    public static final Function<InvCheckStockHeadDTO, String> _remark = o -> o.getRemark();
    public static final Function<InvCheckStockHeadDTO, Boolean> _ioLimit = o -> o.getIoLimit();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
