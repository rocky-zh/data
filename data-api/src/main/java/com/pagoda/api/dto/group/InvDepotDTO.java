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
@ValidateProperties(rulePrefix = "validator.InvDepot")
@ApiModel(value = "InvDepotDTO", description = "库房定义")
@EntityFeature(
  entityName = "InvDepotDTO",
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
public class InvDepotDTO implements Serializable {

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
    dataType = "布尔",
    notes = "5b2defe27c51e0fcf5b5d25b"
  )
  private Boolean active;

  @FieldMeta(
    name = "adCode",
    scene = "",
    nameCN = "高德地址码",
    comment = "高德地址码",
    nameEN = "ad_code",
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
    name = "adCode",
    value = "高德地址码",
    dataType = "字符串",
    notes = "5b2defe27c51e0fcf5b5d25f"
  )
  private String adCode;

  @FieldMeta(
    name = "adLat",
    scene = "",
    nameCN = "高德地址纬度",
    comment = "高德地址纬度",
    nameEN = "ad_lat",
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
    name = "adLat",
    value = "高德地址纬度",
    dataType = "字符串",
    notes = "5b2defe27c51e0fcf5b5d25d"
  )
  private String adLat;

  @FieldMeta(
    name = "adLng",
    scene = "",
    nameCN = "高德地址经度",
    comment = "高德地址经度",
    nameEN = "ad_lng",
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
    name = "adLng",
    value = "高德地址经度",
    dataType = "字符串",
    notes = "5b2defe27c51e0fcf5b5d261"
  )
  private String adLng;

  @FieldMeta(
    name = "address",
    scene = "",
    nameCN = "地址",
    comment = "地址",
    nameEN = "address",
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
    name = "address",
    value = "地址",
    dataType = "字符串",
    notes = "5b2defe27c51e0fcf5b5d263"
  )
  private String address;

  @FieldMeta(
    name = "balOrgId",
    scene = "",
    nameCN = "所属往来单位结算机构ID",
    comment = "所属往来单位结算机构ID",
    nameEN = "bal_org_id",
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
    name = "balOrgId",
    value = "所属往来单位结算机构ID",
    dataType = "长整型",
    notes = "5b2defe27c51e0fcf5b5d265"
  )
  private Long balOrgId;

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

  @FieldMeta(
    name = "currentPeriod",
    scene = "",
    nameCN = "当前核算期",
    comment = "当前核算期",
    nameEN = "current_period",
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
    name = "currentPeriod",
    value = "当前核算期",
    dataType = "字符串",
    notes = "5b2defe27c51e0fcf5b5d271"
  )
  private String currentPeriod;

  @FieldMeta(
    name = "depotCenterId",
    scene = "",
    nameCN = "存货库房中心ID",
    comment = "存货库房中心ID",
    nameEN = "depot_center_id",
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
    name = "depotCenterId",
    value = "存货库房中心ID",
    dataType = "整型",
    notes = "5b2defe27c51e0fcf5b5d26d"
  )
  private Integer depotCenterId;

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
    dataType = "布尔",
    notes = "5b2defe27c51e0fcf5b5d26f"
  )
  private Boolean enabled;

  @FieldMeta(
    name = "isAllowInvOut",
    scene = "",
    nameCN = "允许负库存出库",
    comment = "允许负库存出库",
    nameEN = "is_allow_inv_out",
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
    name = "isAllowInvOut",
    value = "允许负库存出库",
    dataType = "整型",
    notes = "5b2defe27c51e0fcf5b5d273"
  )
  private Integer isAllowInvOut;

  @FieldMeta(
    name = "isAllowPostReturn",
    scene = "",
    nameCN = "是否允许库存反记帐",
    comment = "是否允许库存反记帐",
    nameEN = "is_allow_post_return",
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
    name = "isAllowPostReturn",
    value = "是否允许库存反记帐",
    dataType = "整型",
    notes = "5b2defe27c51e0fcf5b5d26b"
  )
  private Integer isAllowPostReturn;

  @FieldMeta(
    name = "isCheckByAdd",
    scene = "",
    nameCN = "是否盘点无主帐的单品",
    comment = "是否盘点无主帐的单品",
    nameEN = "is_check_by_add",
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
    name = "isCheckByAdd",
    value = "是否盘点无主帐的单品",
    dataType = "整型",
    notes = "5b2defe27c51e0fcf5b5d275"
  )
  private Integer isCheckByAdd;

  @FieldMeta(
    name = "isCheckByNegative",
    scene = "",
    nameCN = "是否允许盘点数量为负数",
    comment = "是否允许盘点数量为负数",
    nameEN = "is_check_by_negative",
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
    name = "isCheckByNegative",
    value = "是否允许盘点数量为负数",
    dataType = "整型",
    notes = "5b2defe27c51e0fcf5b5d279"
  )
  private Integer isCheckByNegative;

  @FieldMeta(
    name = "isCheckByPost",
    scene = "",
    nameCN = "是否本核算期盘点后允许记帐",
    comment = "是否本核算期盘点后允许记帐",
    nameEN = "is_check_by_post",
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
    name = "isCheckByPost",
    value = "是否本核算期盘点后允许记帐",
    dataType = "整型",
    notes = "5b2defe27c51e0fcf5b5d277"
  )
  private Integer isCheckByPost;

  @FieldMeta(
    name = "isCheckInputNeedCheck",
    scene = "",
    nameCN = "是否盘点手工录入需要审核",
    comment = "是否盘点手工录入需要审核",
    nameEN = "is_check_input_need_check",
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
    name = "isCheckInputNeedCheck",
    value = "是否盘点手工录入需要审核",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d27f"
  )
  private Integer isCheckInputNeedCheck;

  @FieldMeta(
    name = "isCheckQtyZero",
    scene = "",
    nameCN = "是否盘点实盘数读入为0{1:读入为0, 0:读入为账面数量}",
    comment = "是否盘点实盘数读入为0{1:读入为0, 0:读入为账面数量}",
    nameEN = "is_check_qty_zero",
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
    name = "isCheckQtyZero",
    value = "是否盘点实盘数读入为0{1:读入为0, 0:读入为账面数量}",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d27b"
  )
  private Integer isCheckQtyZero;

  @FieldMeta(
    name = "isCheckShowFinQty",
    scene = "",
    nameCN = "是否盘点显示现有库存量",
    comment = "是否盘点显示现有库存量",
    nameEN = "is_check_show_fin_qty",
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
    name = "isCheckShowFinQty",
    value = "是否盘点显示现有库存量",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d27d"
  )
  private Integer isCheckShowFinQty;

  @FieldMeta(
    name = "isDualDepot",
    scene = "",
    nameCN = "是否虚拟库",
    comment = "是否虚拟库",
    nameEN = "is_dual_depot",
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
    name = "isDualDepot",
    value = "是否虚拟库",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d282"
  )
  private Integer isDualDepot;

  @FieldMeta(
    name = "isEnabled",
    scene = "",
    nameCN = "是否可用",
    comment = "是否可用",
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
    value = "是否可用",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d28b"
  )
  private Integer isEnabled;

  @FieldMeta(
    name = "isPickAllocation",
    scene = "",
    nameCN = "是否提货启用占用量",
    comment = "是否提货启用占用量",
    nameEN = "is_pick_allocation",
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
    name = "isPickAllocation",
    value = "是否提货启用占用量",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d285"
  )
  private Integer isPickAllocation;

  @FieldMeta(
    name = "isPostCheckAll",
    scene = "",
    nameCN = "是否整单记账",
    comment = "是否整单记账",
    nameEN = "is_post_check_all",
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
    name = "isPostCheckAll",
    value = "是否整单记账",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d287"
  )
  private Integer isPostCheckAll;

  @FieldMeta(
    name = "isPostDaily",
    scene = "",
    nameCN = "是否记日账",
    comment = "是否记日账",
    nameEN = "is_post_daily",
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
    name = "isPostDaily",
    value = "是否记日账",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d28f"
  )
  private Integer isPostDaily;

  @FieldMeta(
    name = "isPostDailyDetail",
    scene = "",
    nameCN = "是否记录日帐明细表",
    comment = "是否记录日帐明细表",
    nameEN = "is_post_daily_detail",
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
    name = "isPostDailyDetail",
    value = "是否记录日帐明细表",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d289"
  )
  private Integer isPostDailyDetail;

  @FieldMeta(
    name = "isPurRecIn",
    scene = "",
    nameCN = "是否允许采购到货",
    comment = "是否允许采购到货",
    nameEN = "is_pur_rec_in",
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
    name = "isPurRecIn",
    value = "是否允许采购到货",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d28e"
  )
  private Integer isPurRecIn;

  @FieldMeta(
    name = "isPurRetOut",
    scene = "",
    nameCN = "是否允许采购退货",
    comment = "是否允许采购退货",
    nameEN = "is_pur_ret_out",
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
    name = "isPurRetOut",
    value = "是否允许采购退货",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d291"
  )
  private Integer isPurRetOut;

  @FieldMeta(
    name = "isSalConIn",
    scene = "",
    nameCN = "是否允许销售到货",
    comment = "是否允许销售到货",
    nameEN = "is_sal_con_in",
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
    name = "isSalConIn",
    value = "是否允许销售到货",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d293"
  )
  private Integer isSalConIn;

  @FieldMeta(
    name = "isSalConOut",
    scene = "",
    nameCN = "是否允许销售出库",
    comment = "是否允许销售出库",
    nameEN = "is_sal_con_out",
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
    name = "isSalConOut",
    value = "是否允许销售出库",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d295"
  )
  private Integer isSalConOut;

  @FieldMeta(
    name = "isSalRetIn",
    scene = "",
    nameCN = "是否允许销售退货入库",
    comment = "是否允许销售退货入库",
    nameEN = "is_sal_ret_in",
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
    name = "isSalRetIn",
    value = "是否允许销售退货入库",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d2af"
  )
  private Integer isSalRetIn;

  @FieldMeta(
    name = "isSalRetOut",
    scene = "",
    nameCN = "是否允许销售退货出库",
    comment = "是否允许销售退货出库",
    nameEN = "is_sal_ret_out",
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
    name = "isSalRetOut",
    value = "是否允许销售退货出库",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d297"
  )
  private Integer isSalRetOut;

  @FieldMeta(
    name = "isStoEnabled",
    scene = "",
    nameCN = "是否启用存货",
    comment = "是否启用存货",
    nameEN = "is_sto_enabled",
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
    name = "isStoEnabled",
    value = "是否启用存货",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d2b8"
  )
  private Integer isStoEnabled;

  @FieldMeta(
    name = "isTurnExistNoPost",
    scene = "",
    nameCN = "是否允许结转存在未记帐单据",
    comment = "是否允许结转存在未记帐单据",
    nameEN = "is_turn_exist_no_post",
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
    name = "isTurnExistNoPost",
    value = "是否允许结转存在未记帐单据",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d2bf"
  )
  private Integer isTurnExistNoPost;

  @FieldMeta(
    name = "manageType",
    scene = "",
    nameCN = "库房管理细度标识",
    comment = "库房管理细度标识",
    nameEN = "manage_type",
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
    name = "manageType",
    value = "库房管理细度标识",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d2c2"
  )
  private Integer manageType;

  @FieldMeta(
    name = "measureType",
    scene = "",
    nameCN = "多单位标识",
    comment = "多单位标识",
    nameEN = "measure_type",
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
    name = "measureType",
    value = "多单位标识",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d2b2"
  )
  private Integer measureType;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "名称",
    comment = "名称",
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
    value = "名称",
    dataType = "字符串",
    notes = "5b2defe37c51e0fcf5b5d2c7"
  )
  private String name;

  @FieldMeta(
    name = "orgId",
    scene = "",
    nameCN = "所属往来单位Id",
    comment = "所属往来单位Id",
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
    value = "所属往来单位Id",
    dataType = "长整型",
    notes = "5b2defe37c51e0fcf5b5d2c9"
  )
  private Long orgId;

  @FieldMeta(
    name = "phone",
    scene = "",
    nameCN = "联系电话",
    comment = "联系电话",
    nameEN = "phone",
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
    name = "phone",
    value = "联系电话",
    dataType = "字符串",
    notes = "5b2defe37c51e0fcf5b5d2cb"
  )
  private String phone;

  @FieldMeta(
    name = "searchWord",
    scene = "",
    nameCN = "搜索关键词",
    comment = "搜索关键词",
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
    value = "搜索关键词",
    dataType = "字符串",
    notes = "5b2defe37c51e0fcf5b5d2cd"
  )
  private String searchWord;

  @FieldMeta(
    name = "stoCurrentPeriod",
    scene = "",
    nameCN = "存货当前核算期",
    comment = "存货当前核算期",
    nameEN = "sto_current_period",
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
    name = "stoCurrentPeriod",
    value = "存货当前核算期",
    dataType = "整型",
    notes = "5b2defe37c51e0fcf5b5d2cf"
  )
  private Integer stoCurrentPeriod;

  @FieldMeta(
    name = "turnDateTime",
    scene = "",
    nameCN = "库房结转时间",
    comment = "库房结转时间",
    nameEN = "turn_date_time",
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
    name = "turnDateTime",
    value = "库房结转时间",
    dataType = "时间",
    notes = "5b2defe37c51e0fcf5b5d2d1"
  )
  private java.sql.Timestamp turnDateTime;

  @FieldMeta(
    name = "turnUserCode",
    scene = "",
    nameCN = "库房结转用户代码",
    comment = "库房结转用户代码",
    nameEN = "turn_user_code",
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
    name = "turnUserCode",
    value = "库房结转用户代码",
    dataType = "字符串",
    notes = "5b2defe37c51e0fcf5b5d2d4"
  )
  private String turnUserCode;

  @FieldMeta(
    name = "turnUserName",
    scene = "",
    nameCN = "库房结转用户名称",
    comment = "库房结转用户名称",
    nameEN = "turn_user_name",
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
    name = "turnUserName",
    value = "库房结转用户名称",
    dataType = "字符串",
    notes = "5b2defe37c51e0fcf5b5d2d6"
  )
  private String turnUserName;

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
