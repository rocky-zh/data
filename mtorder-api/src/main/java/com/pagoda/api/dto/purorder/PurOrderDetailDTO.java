package com.pagoda.api.dto.purorder;

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
import static com.pagoda.api.dto.purorder.PurOrderDetailDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.PurOrderDetail")
@ApiModel(value = "PurOrderDetailDTO", description = "采购订单明细表")
@EntityFeature(
  entityName = "PurOrderDetailDTO",
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
public class PurOrderDetailDTO extends AbstractDTO implements Serializable {

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
    name = "recOrgId",
    scene = "",
    nameCN = "收货机构ID",
    comment = "收货机构ID",
    nameEN = "rec_org_id",
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
    name = "recOrgId",
    value = "收货机构ID",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8b4"
  )
  private Long recOrgId;

  @FieldMeta(
    name = "recOrgCode",
    scene = "",
    nameCN = "收货机构代码[冗余]",
    comment = "收货机构代码[冗余]",
    nameEN = "rec_org_code",
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
    name = "recOrgCode",
    value = "收货机构代码[冗余]",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8bd"
  )
  private String recOrgCode;

  @FieldMeta(
    name = "recOrgName",
    scene = "",
    nameCN = "收货机构名称[冗余]",
    comment = "收货机构名称[冗余]",
    nameEN = "rec_org_name",
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
    name = "recOrgName",
    value = "收货机构名称[冗余]",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8ba"
  )
  private String recOrgName;

  @FieldMeta(
    name = "isPrePrice",
    scene = "",
    nameCN = "是否预估价{1:是,0:否}",
    comment = "是否预估价{1:是,0:否}",
    nameEN = "is_pre_price",
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
    name = "isPrePrice",
    value = "是否预估价{1:是,0:否}",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8b7"
  )
  private Integer isPrePrice;

  @FieldMeta(
    name = "purQty",
    scene = "",
    nameCN = "采购数量",
    comment = "采购数量",
    nameEN = "pur_qty",
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
    name = "purQty",
    value = "采购数量",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8b8"
  )
  private java.math.BigDecimal purQty;

  @FieldMeta(
    name = "discountType",
    scene = "",
    nameCN = "折扣方式[1:单价扣减,2:金额折扣]",
    comment = "折扣方式[1:单价扣减,2:金额折扣]",
    nameEN = "discount_type",
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
    name = "discountType",
    value = "折扣方式[1:单价扣减,2:金额折扣]",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8be"
  )
  private Integer discountType;

  @FieldMeta(
    name = "isRec",
    scene = "",
    nameCN = "是否到货{1:是,0:否}",
    comment = "是否到货{1:是,0:否}",
    nameEN = "is_rec",
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
    name = "isRec",
    value = "是否到货{1:是,0:否}",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8c3"
  )
  private Integer isRec;

  @FieldMeta(
    name = "recQty",
    scene = "",
    nameCN = "到货数量",
    comment = "到货数量",
    nameEN = "rec_qty",
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
    name = "recQty",
    value = "到货数量",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8c4"
  )
  private java.math.BigDecimal recQty;

  @FieldMeta(
    name = "isRecInv",
    scene = "",
    nameCN = "是否入库{1:是,0:否}",
    comment = "是否入库{1:是,0:否}",
    nameEN = "is_rec_inv",
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
    name = "isRecInv",
    value = "是否入库{1:是,0:否}",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8c0"
  )
  private Integer isRecInv;

  @FieldMeta(
    name = "recInvQty",
    scene = "",
    nameCN = "入库数量",
    comment = "入库数量",
    nameEN = "rec_inv_qty",
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
    name = "recInvQty",
    value = "入库数量",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8c6"
  )
  private java.math.BigDecimal recInvQty;

  @FieldMeta(
    name = "billStatus",
    scene = "",
    nameCN = "开票状态{待开票}",
    comment = "开票状态{待开票}",
    nameEN = "bill_status",
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
    name = "billStatus",
    value = "开票状态{待开票}",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8c8"
  )
  private Integer billStatus;

  @FieldMeta(
    name = "billQty",
    scene = "",
    nameCN = "开票数量",
    comment = "开票数量",
    nameEN = "bill_qty",
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
    name = "billQty",
    value = "开票数量",
    dataType = "",
    notes = "5b39d4699d2feff19b81e8ca"
  )
  private java.math.BigDecimal billQty;

  @FieldMeta(
    name = "orderId",
    scene = "",
    nameCN = "订单ID[orderId]",
    comment = "订单ID[orderId]",
    nameEN = "order_id",
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
    name = "orderId",
    value = "订单ID[orderId]",
    dataType = "",
    notes = "5b35d2b49d2feff19b40cb3d"
  )
  private Long orderId;

  @FieldMeta(
    name = "orderSeqno",
    scene = "",
    nameCN = "采购订单号",
    comment = "采购订单号",
    nameEN = "order_seqno",
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
    name = "orderSeqno",
    value = "采购订单号",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d96c"
  )
  private String orderSeqno;

  @FieldMeta(
    name = "entId",
    scene = "price",
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
    notes = "5b36e41b9d2feff19b28d81c"
  )
  private Long entId;

  @FieldMeta(
    name = "goodsId",
    scene = "price",
    nameCN = "商品ID",
    comment = "商品ID",
    nameEN = "goods_id",
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
    name = "goodsId",
    value = "商品ID",
    dataType = "",
    notes = "5b36fa2a9d2feff19b4170ab"
  )
  private Long goodsId;

  @FieldMeta(
    name = "goodsCode",
    scene = "price",
    nameCN = "商品代码",
    comment = "商品代码",
    nameEN = "goods_code",
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
    name = "goodsCode",
    value = "商品代码",
    dataType = "",
    notes = "5b36e88c9d2feff19b2d5b9d"
  )
  private String goodsCode;

  @FieldMeta(
    name = "goodsName",
    scene = "price",
    nameCN = "商品名称",
    comment = "商品名称",
    nameEN = "goods_name",
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
    name = "goodsName",
    value = "商品名称",
    dataType = "",
    notes = "5b36e8c59d2feff19b2d96e4"
  )
  private String goodsName;

  @FieldMeta(
    name = "goodsSpec",
    scene = "price",
    nameCN = "商品规格",
    comment = "商品规格",
    nameEN = "goods_spec",
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
    name = "goodsSpec",
    value = "商品规格",
    dataType = "",
    notes = "5b36f9d59d2feff19b4107a2"
  )
  private String goodsSpec;

  @FieldMeta(
    name = "goodsLevel",
    scene = "",
    nameCN = "商品等级{1:招牌,2:珍稀,3:A,4:B,5:C}",
    comment = "商品等级{1:招牌,2:珍稀,3:A,4:B,5:C}",
    nameEN = "goods_level",
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
    name = "goodsLevel",
    value = "商品等级{1:招牌,2:珍稀,3:A,4:B,5:C}",
    dataType = "",
    notes = "5b35f9149d2feff19b548031"
  )
  private Integer goodsLevel;

  @FieldMeta(
    name = "goodsOrion",
    scene = "",
    nameCN = "商品产地[冗余]",
    comment = "商品产地[冗余]",
    nameEN = "goods_orion",
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
    name = "goodsOrion",
    value = "商品产地[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b413986"
  )
  private String goodsOrion;

  @FieldMeta(
    name = "applyQty",
    scene = "",
    nameCN = "请购数量",
    comment = "请购数量",
    nameEN = "apply_qty",
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
    name = "applyQty",
    value = "请购数量",
    dataType = "",
    notes = "5b35d7329d2feff19b413995"
  )
  private java.math.BigDecimal applyQty;

  @FieldMeta(
    name = "purUnitId",
    scene = "",
    nameCN = "采购计量单位ID",
    comment = "采购计量单位ID",
    nameEN = "pur_unit_id",
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
    name = "purUnitId",
    value = "采购计量单位ID",
    dataType = "",
    notes = "5b35d7329d2feff19b413980"
  )
  private Long purUnitId;

  @FieldMeta(
    name = "purUnitCode",
    scene = "",
    nameCN = "采购计量单位代码[冗余]",
    comment = "采购计量单位代码[冗余]",
    nameEN = "pur_unit_code",
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
    name = "purUnitCode",
    value = "采购计量单位代码[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b41398b"
  )
  private String purUnitCode;

  @FieldMeta(
    name = "purUnitName",
    scene = "",
    nameCN = "采购计量单位名称[冗余]",
    comment = "采购计量单位名称[冗余]",
    nameEN = "pur_unit_name",
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
    name = "purUnitName",
    value = "采购计量单位名称[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b413987"
  )
  private String purUnitName;

  @FieldMeta(
    name = "basUnitId",
    scene = "",
    nameCN = "基础计量单位ID",
    comment = "基础计量单位ID",
    nameEN = "bas_unit_id",
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
    name = "basUnitId",
    value = "基础计量单位ID",
    dataType = "",
    notes = "5b35d7329d2feff19b413991"
  )
  private Long basUnitId;

  @FieldMeta(
    name = "basUnitCode",
    scene = "",
    nameCN = "基础计量单位代码[冗余]",
    comment = "基础计量单位代码[冗余]",
    nameEN = "bas_unit_code",
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
    name = "basUnitCode",
    value = "基础计量单位代码[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b41398f"
  )
  private String basUnitCode;

  @FieldMeta(
    name = "basUnitName",
    scene = "",
    nameCN = "基础计量单位名称[冗余]",
    comment = "基础计量单位名称[冗余]",
    nameEN = "bas_unit_name",
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
    name = "basUnitName",
    value = "基础计量单位名称[冗余]",
    dataType = "",
    notes = "5b35d7329d2feff19b41398d"
  )
  private String basUnitName;

  @FieldMeta(
    name = "purUnitRate",
    scene = "",
    nameCN = "采购计量单位转换比",
    comment = "采购计量单位转换比",
    nameEN = "pur_unit_rate",
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
    name = "purUnitRate",
    value = "采购计量单位转换比",
    dataType = "",
    notes = "5b35d7329d2feff19b41398a"
  )
  private java.math.BigDecimal purUnitRate;

  @FieldMeta(
    name = "arrOrgId",
    scene = "price",
    nameCN = "到货机构ID",
    comment = "到货机构ID",
    nameEN = "arr_org_id",
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
    name = "arrOrgId",
    value = "到货机构ID",
    dataType = "",
    notes = "5b36e4629d2feff19b291e6f"
  )
  private Long arrOrgId;

  @FieldMeta(
    name = "arrOrgCode",
    scene = "price",
    nameCN = "到货机构代码",
    comment = "到货机构代码",
    nameEN = "arr_org_code",
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
    name = "arrOrgCode",
    value = "到货机构代码",
    dataType = "",
    notes = "5b36e4929d2feff19b294d77"
  )
  private String arrOrgCode;

  @FieldMeta(
    name = "arrOrgName",
    scene = "price",
    nameCN = "到货机构",
    comment = "到货机构",
    nameEN = "arr_org_name",
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
    name = "arrOrgName",
    value = "到货机构",
    dataType = "",
    notes = "5b36e4b89d2feff19b297368"
  )
  private String arrOrgName;

  @FieldMeta(
    name = "sourceType",
    scene = "",
    nameCN = "订单明细来源类型",
    comment = "订单明细来源类型",
    nameEN = "source_Type",
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
    name = "sourceType",
    value = "订单明细来源类型",
    dataType = "",
    notes = "5b374ac59d2feff19ba91218"
  )
  private Integer sourceType;

  @FieldMeta(
    name = "requestQty",
    scene = "",
    nameCN = "需求数量",
    comment = "需求数量",
    nameEN = "request_qty",
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
    name = "requestQty",
    value = "需求数量",
    dataType = "",
    notes = "5b35d7329d2feff19b413993"
  )
  private java.math.BigDecimal requestQty;

  @FieldMeta(
    name = "planRecDate",
    scene = "",
    nameCN = "应到货日期",
    comment = "应到货日期",
    nameEN = "plan_rec_date",
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
    name = "planRecDate",
    value = "应到货日期",
    dataType = "",
    notes = "5b35d5f69d2feff19b411331"
  )
  private java.util.Date planRecDate;

  @FieldMeta(
    name = "purPrice",
    scene = "price",
    nameCN = "采购单价[含税]",
    comment = "采购单价[含税]",
    nameEN = "pur_price",
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
    name = "purPrice",
    value = "采购单价[含税]",
    dataType = "",
    notes = "5b36e1339d2feff19b25feb5"
  )
  private java.math.BigDecimal purPrice;

  @FieldMeta(
    name = "taxRate",
    scene = "",
    nameCN = "税率",
    comment = "税率",
    nameEN = "tax_rate",
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
    name = "taxRate",
    value = "税率",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d98f"
  )
  private java.math.BigDecimal taxRate;

  @FieldMeta(
    name = "discountAmt",
    scene = "",
    nameCN = "折扣额度",
    comment = "折扣额度",
    nameEN = "discount_amt",
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
    name = "discountAmt",
    value = "折扣额度",
    dataType = "",
    notes = "5b35dad59d2feff19b41e99a"
  )
  private java.math.BigDecimal discountAmt;

  @FieldMeta(
    name = "isReturn",
    scene = "",
    nameCN = "是否退货{1:是,0:否}",
    comment = "是否退货{1:是,0:否}",
    nameEN = "is_return",
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
    name = "isReturn",
    value = "是否退货{1:是,0:否}",
    dataType = "",
    notes = "5b35e1719d2feff19b442800"
  )
  private Integer isReturn;

  @FieldMeta(
    name = "returnQty",
    scene = "",
    nameCN = "退货数量",
    comment = "退货数量",
    nameEN = "return_qty",
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
    name = "returnQty",
    value = "退货数量",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ea"
  )
  private java.math.BigDecimal returnQty;

  @FieldMeta(
    name = "applyId",
    scene = "",
    nameCN = "请购单ID",
    comment = "请购单ID",
    nameEN = "apply_id",
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
    name = "applyId",
    value = "请购单ID",
    dataType = "",
    notes = "5b35d7329d2feff19b413981"
  )
  private Long applyId;

  @FieldMeta(
    name = "applySeqno",
    scene = "",
    nameCN = "请购单号码",
    comment = "请购单号码",
    nameEN = "apply_seqno",
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
    name = "applySeqno",
    value = "请购单号码",
    dataType = "",
    notes = "5b35d7329d2feff19b413983"
  )
  private String applySeqno;

  @FieldMeta(
    name = "venOrgId",
    scene = "price",
    nameCN = "供应商ID",
    comment = "供应商ID",
    nameEN = "ven_org_id",
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
    name = "venOrgId",
    value = "供应商ID",
    dataType = "",
    notes = "5b36e4da9d2feff19b2994df"
  )
  private Long venOrgId;

  @FieldMeta(
    name = "venOrgCode",
    scene = "price",
    nameCN = "供应商代码",
    comment = "供应商代码",
    nameEN = "ven_org_code",
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
    name = "venOrgCode",
    value = "供应商代码",
    dataType = "",
    notes = "5b36e5099d2feff19b29c39c"
  )
  private String venOrgCode;

  @FieldMeta(
    name = "venOrgName",
    scene = "price",
    nameCN = "供应商名称",
    comment = "供应商名称",
    nameEN = "ven_org_name",
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
    name = "venOrgName",
    value = "供应商名称",
    dataType = "",
    notes = "5b36e5409d2feff19b29fb44"
  )
  private String venOrgName;

  @FieldMeta(
    name = "remark",
    scene = "price",
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
    notes = "5b36e6a39d2feff19b2b62b5"
  )
  private String remark;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<PurOrderDetailDTO, Long> _id = o -> o.getId();
    public static final Function<PurOrderDetailDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<PurOrderDetailDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<PurOrderDetailDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<PurOrderDetailDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<PurOrderDetailDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<PurOrderDetailDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<PurOrderDetailDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<PurOrderDetailDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<PurOrderDetailDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<PurOrderDetailDTO, Integer> _version = o -> o.getVersion();

    public static final Function<PurOrderDetailDTO, Long> _recOrgId = o -> o.getRecOrgId();
    public static final Function<PurOrderDetailDTO, String> _recOrgCode = o -> o.getRecOrgCode();
    public static final Function<PurOrderDetailDTO, String> _recOrgName = o -> o.getRecOrgName();
    public static final Function<PurOrderDetailDTO, Integer> _isPrePrice = o -> o.getIsPrePrice();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _purQty =
        o -> o.getPurQty();
    public static final Function<PurOrderDetailDTO, Integer> _discountType =
        o -> o.getDiscountType();
    public static final Function<PurOrderDetailDTO, Integer> _isRec = o -> o.getIsRec();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _recQty =
        o -> o.getRecQty();
    public static final Function<PurOrderDetailDTO, Integer> _isRecInv = o -> o.getIsRecInv();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _recInvQty =
        o -> o.getRecInvQty();
    public static final Function<PurOrderDetailDTO, Integer> _billStatus = o -> o.getBillStatus();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _billQty =
        o -> o.getBillQty();
    public static final Function<PurOrderDetailDTO, Long> _orderId = o -> o.getOrderId();
    public static final Function<PurOrderDetailDTO, String> _orderSeqno = o -> o.getOrderSeqno();
    public static final Function<PurOrderDetailDTO, Long> _entId = o -> o.getEntId();
    public static final Function<PurOrderDetailDTO, Long> _goodsId = o -> o.getGoodsId();
    public static final Function<PurOrderDetailDTO, String> _goodsCode = o -> o.getGoodsCode();
    public static final Function<PurOrderDetailDTO, String> _goodsName = o -> o.getGoodsName();
    public static final Function<PurOrderDetailDTO, String> _goodsSpec = o -> o.getGoodsSpec();
    public static final Function<PurOrderDetailDTO, Integer> _goodsLevel = o -> o.getGoodsLevel();
    public static final Function<PurOrderDetailDTO, String> _goodsOrion = o -> o.getGoodsOrion();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _applyQty =
        o -> o.getApplyQty();
    public static final Function<PurOrderDetailDTO, Long> _purUnitId = o -> o.getPurUnitId();
    public static final Function<PurOrderDetailDTO, String> _purUnitCode = o -> o.getPurUnitCode();
    public static final Function<PurOrderDetailDTO, String> _purUnitName = o -> o.getPurUnitName();
    public static final Function<PurOrderDetailDTO, Long> _basUnitId = o -> o.getBasUnitId();
    public static final Function<PurOrderDetailDTO, String> _basUnitCode = o -> o.getBasUnitCode();
    public static final Function<PurOrderDetailDTO, String> _basUnitName = o -> o.getBasUnitName();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _purUnitRate =
        o -> o.getPurUnitRate();
    public static final Function<PurOrderDetailDTO, Long> _arrOrgId = o -> o.getArrOrgId();
    public static final Function<PurOrderDetailDTO, String> _arrOrgCode = o -> o.getArrOrgCode();
    public static final Function<PurOrderDetailDTO, String> _arrOrgName = o -> o.getArrOrgName();
    public static final Function<PurOrderDetailDTO, Integer> _sourceType = o -> o.getSourceType();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _requestQty =
        o -> o.getRequestQty();
    public static final Function<PurOrderDetailDTO, java.util.Date> _planRecDate =
        o -> o.getPlanRecDate();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _purPrice =
        o -> o.getPurPrice();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _taxRate =
        o -> o.getTaxRate();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _discountAmt =
        o -> o.getDiscountAmt();
    public static final Function<PurOrderDetailDTO, Integer> _isReturn = o -> o.getIsReturn();
    public static final Function<PurOrderDetailDTO, java.math.BigDecimal> _returnQty =
        o -> o.getReturnQty();
    public static final Function<PurOrderDetailDTO, Long> _applyId = o -> o.getApplyId();
    public static final Function<PurOrderDetailDTO, String> _applySeqno = o -> o.getApplySeqno();
    public static final Function<PurOrderDetailDTO, Long> _venOrgId = o -> o.getVenOrgId();
    public static final Function<PurOrderDetailDTO, String> _venOrgCode = o -> o.getVenOrgCode();
    public static final Function<PurOrderDetailDTO, String> _venOrgName = o -> o.getVenOrgName();
    public static final Function<PurOrderDetailDTO, String> _remark = o -> o.getRemark();
  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
