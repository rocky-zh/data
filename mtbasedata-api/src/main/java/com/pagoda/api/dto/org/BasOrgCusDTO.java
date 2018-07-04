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
import static com.pagoda.api.dto.org.BasOrgCusDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasOrgCus")
@ApiModel(value = "BasOrgCusDTO", description = "往来单位-012 客户明细表")
@EntityFeature(
  entityName = "BasOrgCusDTO",
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
public class BasOrgCusDTO extends AbstractDTO implements Serializable {

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
    name = "invLimitAmt",
    scene = "",
    nameCN = "库存额上限",
    comment = "库存额上限",
    nameEN = "inv_limit_amt",
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
    name = "invLimitAmt",
    value = "库存额上限",
    dataType = "",
    notes = "5b35e1159d2feff19b440017"
  )
  private java.math.BigDecimal invLimitAmt;

  @FieldMeta(
    name = "isInvLimitAmt",
    scene = "",
    nameCN = "是否库存额控制",
    comment = "是否库存额控制",
    nameEN = "is_inv_limit_amt",
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
    name = "isInvLimitAmt",
    value = "是否库存额控制",
    dataType = "",
    notes = "5b35e1159d2feff19b440014"
  )
  private Integer isInvLimitAmt;

  @FieldMeta(
    name = "checkMinAmt",
    scene = "",
    nameCN = "需审核最小订单金额",
    comment = "需审核最小订单金额",
    nameEN = "check_min_amt",
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
    name = "checkMinAmt",
    value = "需审核最小订单金额",
    dataType = "",
    notes = "5b35e1159d2feff19b440015"
  )
  private Integer checkMinAmt;

  @FieldMeta(
    name = "isOrderCheck",
    scene = "",
    nameCN = "订单审核",
    comment = "订单审核",
    nameEN = "is_order_check",
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
    name = "isOrderCheck",
    value = "订单审核",
    dataType = "",
    notes = "5b35e1159d2feff19b44001d"
  )
  private Integer isOrderCheck;

  @FieldMeta(
    name = "isReturnCheck",
    scene = "",
    nameCN = "退货审核",
    comment = "退货审核",
    nameEN = "is_return_check",
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
    name = "isReturnCheck",
    value = "退货审核",
    dataType = "",
    notes = "5b35e1159d2feff19b44001b"
  )
  private Integer isReturnCheck;

  @FieldMeta(
    name = "returnDealType",
    scene = "",
    nameCN = "退货处理方式{1:返销,2:红出}",
    comment = "退货处理方式{1:返销,2:红出}",
    nameEN = "return_deal_type",
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
    name = "returnDealType",
    value = "退货处理方式{1:返销,2:红出}",
    dataType = "",
    notes = "5b35e1159d2feff19b44001a"
  )
  private Integer returnDealType;

  @FieldMeta(
    name = "isModifyPrice",
    scene = "",
    nameCN = "是否订单可修改价格",
    comment = "是否订单可修改价格",
    nameEN = "is_modify_price",
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
    name = "isModifyPrice",
    value = "是否订单可修改价格",
    dataType = "",
    notes = "5b35e1159d2feff19b44001f"
  )
  private Integer isModifyPrice;

  @FieldMeta(
    name = "isModifyCheck",
    scene = "",
    nameCN = "是否修改价格需审核",
    comment = "是否修改价格需审核",
    nameEN = "is_modify_check",
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
    name = "isModifyCheck",
    value = "是否修改价格需审核",
    dataType = "",
    notes = "5b35e1159d2feff19b440023"
  )
  private Integer isModifyCheck;

  @FieldMeta(
    name = "isCusInv",
    scene = "",
    nameCN = "是否管理库存",
    comment = "是否管理库存",
    nameEN = "is_cus_inv",
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
    name = "isCusInv",
    value = "是否管理库存",
    dataType = "",
    notes = "5b35e1159d2feff19b440021"
  )
  private Integer isCusInv;

  @FieldMeta(
    name = "isAllotCheck",
    scene = "",
    nameCN = "是否调拨审核",
    comment = "是否调拨审核",
    nameEN = "is_allot_check",
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
    name = "isAllotCheck",
    value = "是否调拨审核",
    dataType = "",
    notes = "5b35e1159d2feff19b440025"
  )
  private Integer isAllotCheck;

  @FieldMeta(
    name = "isClosed",
    scene = "",
    nameCN = "是否停业（商城门店用）",
    comment = "是否停业（商城门店用）",
    nameEN = "is_closed",
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
    name = "isClosed",
    value = "是否停业（商城门店用）",
    dataType = "",
    notes = "5b35e1159d2feff19b440027"
  )
  private Integer isClosed;

  @FieldMeta(
    name = "isOrderPaused",
    scene = "",
    nameCN = "是否暂停接收订单（商城门店用）",
    comment = "是否暂停接收订单（商城门店用）",
    nameEN = "is_order_paused",
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
    name = "isOrderPaused",
    value = "是否暂停接收订单（商城门店用）",
    dataType = "",
    notes = "5b35e1159d2feff19b440029"
  )
  private Integer isOrderPaused;

  @FieldMeta(
    name = "shopOwnerName",
    scene = "",
    nameCN = "店长姓名",
    comment = "店长姓名",
    nameEN = "shop_owner_name",
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
    name = "shopOwnerName",
    value = "店长姓名",
    dataType = "",
    notes = "5b35e1159d2feff19b440031"
  )
  private String shopOwnerName;

  @FieldMeta(
    name = "shopOwnerPhone",
    scene = "",
    nameCN = "店长电话",
    comment = "店长电话",
    nameEN = "shop_owner_phone",
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
    name = "shopOwnerPhone",
    value = "店长电话",
    dataType = "",
    notes = "5b35e1159d2feff19b44002b"
  )
  private String shopOwnerPhone;

  @FieldMeta(
    name = "openingDate",
    scene = "",
    nameCN = "开业日期",
    comment = "开业日期",
    nameEN = "opening_date",
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
    name = "openingDate",
    value = "开业日期",
    dataType = "",
    notes = "5b35e1159d2feff19b44002f"
  )
  private java.util.Date openingDate;

  @FieldMeta(
    name = "isOuterLeague",
    scene = "",
    nameCN = "是否外加盟",
    comment = "是否外加盟",
    nameEN = "is_outer_league",
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
    name = "isOuterLeague",
    value = "是否外加盟",
    dataType = "",
    notes = "5b35e1159d2feff19b44002d"
  )
  private Integer isOuterLeague;

  @FieldMeta(
    name = "isAutoRecIn",
    scene = "",
    nameCN = "是否自动到货(1:是,0:否)",
    comment = "是否自动到货(1:是,0:否)",
    nameEN = "is_auto_rec_in",
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
    name = "isAutoRecIn",
    value = "是否自动到货(1:是,0:否)",
    dataType = "",
    notes = "5b35e1159d2feff19b440035"
  )
  private Integer isAutoRecIn;

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

  @FieldMeta(
    name = "salConInDepotId",
    scene = "",
    nameCN = "默认销售到货库房ID",
    comment = "默认销售到货库房ID",
    nameEN = "sal_con_in_depot_id",
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
    name = "salConInDepotId",
    value = "默认销售到货库房ID",
    dataType = "",
    notes = "5b35e1159d2feff19b44003e"
  )
  private Long salConInDepotId;

  @FieldMeta(
    name = "salRetOutDepotId",
    scene = "",
    nameCN = "默认销售退货出库库房ID",
    comment = "默认销售退货出库库房ID",
    nameEN = "sal_ret_out_depot_id",
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
    name = "salRetOutDepotId",
    value = "默认销售退货出库库房ID",
    dataType = "",
    notes = "5b35e1159d2feff19b440040"
  )
  private Long salRetOutDepotId;

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

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<BasOrgCusDTO, Long> _id = o -> o.getId();
    public static final Function<BasOrgCusDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<BasOrgCusDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<BasOrgCusDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<BasOrgCusDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<BasOrgCusDTO, String> _creatorOrgCode = o -> o.getCreatorOrgCode();
    public static final Function<BasOrgCusDTO, Date> _lastModifiedAt = o -> o.getLastModifiedAt();
    public static final Function<BasOrgCusDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<BasOrgCusDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<BasOrgCusDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<BasOrgCusDTO, Integer> _version = o -> o.getVersion();

    public static final Function<BasOrgCusDTO, java.math.BigDecimal> _invLimitAmt =
        o -> o.getInvLimitAmt();
    public static final Function<BasOrgCusDTO, Integer> _isInvLimitAmt = o -> o.getIsInvLimitAmt();
    public static final Function<BasOrgCusDTO, Integer> _checkMinAmt = o -> o.getCheckMinAmt();
    public static final Function<BasOrgCusDTO, Integer> _isOrderCheck = o -> o.getIsOrderCheck();
    public static final Function<BasOrgCusDTO, Integer> _isReturnCheck = o -> o.getIsReturnCheck();
    public static final Function<BasOrgCusDTO, Integer> _returnDealType =
        o -> o.getReturnDealType();
    public static final Function<BasOrgCusDTO, Integer> _isModifyPrice = o -> o.getIsModifyPrice();
    public static final Function<BasOrgCusDTO, Integer> _isModifyCheck = o -> o.getIsModifyCheck();
    public static final Function<BasOrgCusDTO, Integer> _isCusInv = o -> o.getIsCusInv();
    public static final Function<BasOrgCusDTO, Integer> _isAllotCheck = o -> o.getIsAllotCheck();
    public static final Function<BasOrgCusDTO, Integer> _isClosed = o -> o.getIsClosed();
    public static final Function<BasOrgCusDTO, Integer> _isOrderPaused = o -> o.getIsOrderPaused();
    public static final Function<BasOrgCusDTO, String> _shopOwnerName = o -> o.getShopOwnerName();
    public static final Function<BasOrgCusDTO, String> _shopOwnerPhone = o -> o.getShopOwnerPhone();
    public static final Function<BasOrgCusDTO, java.util.Date> _openingDate =
        o -> o.getOpeningDate();
    public static final Function<BasOrgCusDTO, Integer> _isOuterLeague = o -> o.getIsOuterLeague();
    public static final Function<BasOrgCusDTO, Integer> _isAutoRecIn = o -> o.getIsAutoRecIn();
    public static final Function<BasOrgCusDTO, Integer> _enabledStatus = o -> o.getEnabledStatus();
    public static final Function<BasOrgCusDTO, Long> _salConInDepotId = o -> o.getSalConInDepotId();
    public static final Function<BasOrgCusDTO, Long> _salRetOutDepotId =
        o -> o.getSalRetOutDepotId();
    public static final Function<BasOrgCusDTO, Long> _orgId = o -> o.getOrgId();
  }

  public static ValidatorBuilder<BasOrgCusDTO> validatorExample() {
    ValidatorBuilder<BasOrgCusDTO> builder = new ValidatorBuilder();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
