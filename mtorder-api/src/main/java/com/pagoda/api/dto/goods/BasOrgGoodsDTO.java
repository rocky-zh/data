package com.pagoda.api.dto.goods;

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
import static com.pagoda.api.dto.goods.BasOrgGoodsDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.BasOrgGoods")
@ApiModel(value = "BasOrgGoodsDTO", description = "机构商品定义")
@EntityFeature(
  entityName = "BasOrgGoodsDTO",
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
public class BasOrgGoodsDTO extends AbstractDTO implements Serializable {

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
    name = "orgCode",
    scene = "",
    nameCN = "机构代码",
    comment = "机构代码",
    nameEN = "org_code",
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
    name = "orgCode",
    value = "机构代码",
    dataType = "",
    notes = "5b35e1719d2feff19b4427dc"
  )
  private String orgCode;

  @FieldMeta(
    name = "orgName",
    scene = "",
    nameCN = "机构名称",
    comment = "机构名称",
    nameEN = "org_name",
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
    name = "orgName",
    value = "机构名称",
    dataType = "",
    notes = "5b35e1719d2feff19b4427d7"
  )
  private String orgName;

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
    name = "isOrgLot",
    scene = "",
    nameCN = "是否管理机构批次",
    comment = "是否管理机构批次",
    nameEN = "is_org_lot",
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
    name = "isOrgLot",
    value = "是否管理机构批次",
    dataType = "",
    notes = "5b35e1719d2feff19b4427da"
  )
  private Integer isOrgLot;

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
    name = "isEnabled",
    scene = "",
    nameCN = "状态 是否有效，0:有效 >0:无效",
    comment = "状态 是否有效，0:有效 >0:无效",
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
    value = "状态 是否有效，0:有效 >0:无效",
    dataType = "",
    notes = "5b35d3559d2feff19b40d3d1"
  )
  private Integer isEnabled;

  @FieldMeta(
    name = "isPur",
    scene = "",
    nameCN = "是否可订(采购)[采购按主商品采购]",
    comment = "是否可订(采购)[采购按主商品采购]",
    nameEN = "is_pur",
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
    name = "isPur",
    value = "是否可订(采购)[采购按主商品采购]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427d8"
  )
  private Integer isPur;

  @FieldMeta(
    name = "purRetOutDepotCode",
    scene = "",
    nameCN = "默认采购退货出库库房代码[冗余]",
    comment = "默认采购退货出库库房代码[冗余]",
    nameEN = "pur_ret_out_depot_code",
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
    name = "purRetOutDepotCode",
    value = "默认采购退货出库库房代码[冗余]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427e0"
  )
  private String purRetOutDepotCode;

  @FieldMeta(
    name = "purRetOutDepotName",
    scene = "",
    nameCN = "默认采购退货出库库房名称[冗余]",
    comment = "默认采购退货出库库房名称[冗余]",
    nameEN = "pur_ret_out_depot_name",
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
    name = "purRetOutDepotName",
    value = "默认采购退货出库库房名称[冗余]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427e8"
  )
  private String purRetOutDepotName;

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
    name = "purRecInDepotCode",
    scene = "",
    nameCN = "默认采购到货入库库房代码[冗余]",
    comment = "默认采购到货入库库房代码[冗余]",
    nameEN = "pur_rec_in_depot_code",
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
    name = "purRecInDepotCode",
    value = "默认采购到货入库库房代码[冗余]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427e2"
  )
  private String purRecInDepotCode;

  @FieldMeta(
    name = "purRecInDepotName",
    scene = "",
    nameCN = "默认采购到货入库库房名称[冗余]",
    comment = "默认采购到货入库库房名称[冗余]",
    nameEN = "pur_rec_in_depot_name",
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
    name = "purRecInDepotName",
    value = "默认采购到货入库库房名称[冗余]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427e6"
  )
  private String purRecInDepotName;

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
    name = "salConInDepotCode",
    scene = "",
    nameCN = "默认销售到货库房代码[冗余]",
    comment = "默认销售到货库房代码[冗余]",
    nameEN = "sal_con_in_depot_code",
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
    name = "salConInDepotCode",
    value = "默认销售到货库房代码[冗余]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427ec"
  )
  private String salConInDepotCode;

  @FieldMeta(
    name = "salConInDepotName",
    scene = "",
    nameCN = "默认销售到货库房名称[冗余]",
    comment = "默认销售到货库房名称[冗余]",
    nameEN = "sal_con_in_depot_name",
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
    name = "salConInDepotName",
    value = "默认销售到货库房名称[冗余]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427ea"
  )
  private String salConInDepotName;

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
    name = "salConOutDepotCode",
    scene = "",
    nameCN = "默认销售出库库房代码[冗余]",
    comment = "默认销售出库库房代码[冗余]",
    nameEN = "sal_con_out_depot_code",
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
    name = "salConOutDepotCode",
    value = "默认销售出库库房代码[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d980"
  )
  private String salConOutDepotCode;

  @FieldMeta(
    name = "salConOutDepotName",
    scene = "",
    nameCN = "默认销售出库库房名称[冗余]",
    comment = "默认销售出库库房名称[冗余]",
    nameEN = "sal_con_out_depot_name",
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
    name = "salConOutDepotName",
    value = "默认销售出库库房名称[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d984"
  )
  private String salConOutDepotName;

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
    name = "salRetOutDepotCode",
    scene = "",
    nameCN = "默认销售退货出库库房代码[冗余]",
    comment = "默认销售退货出库库房代码[冗余]",
    nameEN = "sal_ret_out_depot_code",
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
    name = "salRetOutDepotCode",
    value = "默认销售退货出库库房代码[冗余]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427f2"
  )
  private String salRetOutDepotCode;

  @FieldMeta(
    name = "salRetOutDepotName",
    scene = "",
    nameCN = "默认销售退货出库库房名称[冗余]",
    comment = "默认销售退货出库库房名称[冗余]",
    nameEN = "sal_ret_out_depot_name",
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
    name = "salRetOutDepotName",
    value = "默认销售退货出库库房名称[冗余]",
    dataType = "",
    notes = "5b35e1719d2feff19b4427f0"
  )
  private String salRetOutDepotName;

  @FieldMeta(
    name = "isDataDetail",
    scene = "",
    nameCN = "是否取明细数据",
    comment = "是否取明细数据",
    nameEN = "is_data_detail",
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
    name = "isDataDetail",
    value = "是否取明细数据",
    dataType = "",
    notes = "5b35e1719d2feff19b4427f4"
  )
  private Integer isDataDetail;

  @FieldMeta(
    name = "batchQty",
    scene = "",
    nameCN = "批量数量(冗余,机构商品中定义)",
    comment = "批量数量(冗余,机构商品中定义)",
    nameEN = "batch_qty",
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
    name = "batchQty",
    value = "批量数量(冗余,机构商品中定义)",
    dataType = "",
    notes = "5b35e1719d2feff19b4427ef"
  )
  private java.math.BigDecimal batchQty;

  @FieldMeta(
    name = "batchPolicy",
    scene = "",
    nameCN = "批量政策{0:无,1:固定倍数,2:最小起订量 冗余,机构商品中定义}",
    comment = "批量政策{0:无,1:固定倍数,2:最小起订量 冗余,机构商品中定义}",
    nameEN = "batch_policy",
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
    name = "batchPolicy",
    value = "批量政策{0:无,1:固定倍数,2:最小起订量 冗余,机构商品中定义}",
    dataType = "",
    notes = "5b35e1719d2feff19b4427f6"
  )
  private Integer batchPolicy;

  @FieldMeta(
    name = "isSale",
    scene = "",
    nameCN = "是否允许销售(b2b用)",
    comment = "是否允许销售(b2b用)",
    nameEN = "is_sale",
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
    name = "isSale",
    value = "是否允许销售(b2b用)",
    dataType = "",
    notes = "5b35e1719d2feff19b4427f8"
  )
  private Integer isSale;

  @FieldMeta(
    name = "isReturn",
    scene = "",
    nameCN = "是否允许退货(b2b用)",
    comment = "是否允许退货(b2b用)",
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
    value = "是否允许退货(b2b用)",
    dataType = "",
    notes = "5b35e1719d2feff19b442800"
  )
  private Integer isReturn;

  @FieldMeta(
    name = "isTrans",
    scene = "",
    nameCN = "是否可调拔",
    comment = "是否可调拔",
    nameEN = "is_trans",
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
    name = "isTrans",
    value = "是否可调拔",
    dataType = "",
    notes = "5b35e1719d2feff19b4427fc"
  )
  private Integer isTrans;

  @FieldMeta(
    name = "conCycle",
    scene = "",
    nameCN = "发货周期",
    comment = "发货周期",
    nameEN = "con_cycle",
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
    name = "conCycle",
    value = "发货周期",
    dataType = "",
    notes = "5b35e1719d2feff19b4427fe"
  )
  private java.math.BigDecimal conCycle;

  @FieldMeta(
    name = "isStockInv",
    scene = "",
    nameCN = "备货是否考虑库存",
    comment = "备货是否考虑库存",
    nameEN = "is_stock_inv",
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
    name = "isStockInv",
    value = "备货是否考虑库存",
    dataType = "",
    notes = "5b35e1719d2feff19b4427fa"
  )
  private Integer isStockInv;

  @FieldMeta(
    name = "isRet",
    scene = "",
    nameCN = "是否零售(b2c用，另因按订单退，故无需是否允许退货)[设置为0时需要把iscchannelenble 字段开头的都改为0]",
    comment = "是否零售(b2c用，另因按订单退，故无需是否允许退货)[设置为0时需要把iscchannelenble 字段开头的都改为0]",
    nameEN = "is_ret",
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
    name = "isRet",
    value = "是否零售(b2c用，另因按订单退，故无需是否允许退货)[设置为0时需要把iscchannelenble 字段开头的都改为0]",
    dataType = "",
    notes = "5b35e1719d2feff19b442804"
  )
  private Integer isRet;

  @FieldMeta(
    name = "isMustRet",
    scene = "",
    nameCN = "是否必退商品(空/0:不必退|1:部分必退|2:全部必退)",
    comment = "是否必退商品(空/0:不必退|1:部分必退|2:全部必退)",
    nameEN = "is_must_ret",
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
    name = "isMustRet",
    value = "是否必退商品(空/0:不必退|1:部分必退|2:全部必退)",
    dataType = "",
    notes = "5b35e1719d2feff19b442802"
  )
  private Integer isMustRet;

  @FieldMeta(
    name = "purExcRatio",
    scene = "",
    nameCN = "采购发车超量系数",
    comment = "采购发车超量系数",
    nameEN = "pur_exc_ratio",
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
    name = "purExcRatio",
    value = "采购发车超量系数",
    dataType = "",
    notes = "5b35e1719d2feff19b44280c"
  )
  private java.math.BigDecimal purExcRatio;

  @FieldMeta(
    name = "isDefDepot",
    scene = "",
    nameCN = "用于客户下单对同一个商品在同一虚拟机构组下深圳供应链、深圳初加工都可发货的的默认发货机构",
    comment = "用于客户下单对同一个商品在同一虚拟机构组下深圳供应链、深圳初加工都可发货的的默认发货机构",
    nameEN = "is_def_depot",
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
    name = "isDefDepot",
    value = "用于客户下单对同一个商品在同一虚拟机构组下深圳供应链、深圳初加工都可发货的的默认发货机构",
    dataType = "",
    notes = "5b35e1719d2feff19b442814"
  )
  private Integer isDefDepot;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<BasOrgGoodsDTO, Long> id_ = o -> o.getId();
    public static Function<BasOrgGoodsDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<BasOrgGoodsDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<BasOrgGoodsDTO, String> creatorCode_ = o -> o.getCreatorCode();
    public static Function<BasOrgGoodsDTO, String> creatorName_ = o -> o.getCreatorName();
    public static Function<BasOrgGoodsDTO, String> creatorOrgCode_ = o -> o.getCreatorOrgCode();
    public static Function<BasOrgGoodsDTO, Date> lastModifiedAt_ = o -> o.getLastModifiedAt();
    public static Function<BasOrgGoodsDTO, String> modifierCode_ = o -> o.getModifierCode();
    public static Function<BasOrgGoodsDTO, String> modifierName_ = o -> o.getModifierName();
    public static Function<BasOrgGoodsDTO, String> modifierOrgCode_ = o -> o.getModifierOrgCode();

    public static Function<BasOrgGoodsDTO, Integer> version_ = o -> o.getVersion();

    public static Function<BasOrgGoodsDTO, Long> orgId_ = o -> o.getOrgId();
    public static Function<BasOrgGoodsDTO, String> orgCode_ = o -> o.getOrgCode();
    public static Function<BasOrgGoodsDTO, String> orgName_ = o -> o.getOrgName();
    public static Function<BasOrgGoodsDTO, Long> goodsId_ = o -> o.getGoodsId();
    public static Function<BasOrgGoodsDTO, String> goodsCode_ = o -> o.getGoodsCode();
    public static Function<BasOrgGoodsDTO, String> goodsName_ = o -> o.getGoodsName();
    public static Function<BasOrgGoodsDTO, Long> entId_ = o -> o.getEntId();
    public static Function<BasOrgGoodsDTO, Integer> isOrgLot_ = o -> o.getIsOrgLot();
    public static Function<BasOrgGoodsDTO, java.math.BigDecimal> taxRate_ = o -> o.getTaxRate();
    public static Function<BasOrgGoodsDTO, Integer> isEnabled_ = o -> o.getIsEnabled();
    public static Function<BasOrgGoodsDTO, Integer> isPur_ = o -> o.getIsPur();
    public static Function<BasOrgGoodsDTO, String> purRetOutDepotCode_ =
        o -> o.getPurRetOutDepotCode();
    public static Function<BasOrgGoodsDTO, String> purRetOutDepotName_ =
        o -> o.getPurRetOutDepotName();
    public static Function<BasOrgGoodsDTO, Long> purRetOutDepotId_ = o -> o.getPurRetOutDepotId();
    public static Function<BasOrgGoodsDTO, Long> purRecInDepotId_ = o -> o.getPurRecInDepotId();
    public static Function<BasOrgGoodsDTO, String> purRecInDepotCode_ =
        o -> o.getPurRecInDepotCode();
    public static Function<BasOrgGoodsDTO, String> purRecInDepotName_ =
        o -> o.getPurRecInDepotName();
    public static Function<BasOrgGoodsDTO, Long> salConInDepotId_ = o -> o.getSalConInDepotId();
    public static Function<BasOrgGoodsDTO, String> salConInDepotCode_ =
        o -> o.getSalConInDepotCode();
    public static Function<BasOrgGoodsDTO, String> salConInDepotName_ =
        o -> o.getSalConInDepotName();
    public static Function<BasOrgGoodsDTO, Long> salConOutDepotId_ = o -> o.getSalConOutDepotId();
    public static Function<BasOrgGoodsDTO, String> salConOutDepotCode_ =
        o -> o.getSalConOutDepotCode();
    public static Function<BasOrgGoodsDTO, String> salConOutDepotName_ =
        o -> o.getSalConOutDepotName();
    public static Function<BasOrgGoodsDTO, Long> salRetInDepotId_ = o -> o.getSalRetInDepotId();
    public static Function<BasOrgGoodsDTO, String> salRetInDepotCode_ =
        o -> o.getSalRetInDepotCode();
    public static Function<BasOrgGoodsDTO, String> salRetInDepotName_ =
        o -> o.getSalRetInDepotName();
    public static Function<BasOrgGoodsDTO, Long> salRetOutDepotId_ = o -> o.getSalRetOutDepotId();
    public static Function<BasOrgGoodsDTO, String> salRetOutDepotCode_ =
        o -> o.getSalRetOutDepotCode();
    public static Function<BasOrgGoodsDTO, String> salRetOutDepotName_ =
        o -> o.getSalRetOutDepotName();
    public static Function<BasOrgGoodsDTO, Integer> isDataDetail_ = o -> o.getIsDataDetail();
    public static Function<BasOrgGoodsDTO, java.math.BigDecimal> batchQty_ = o -> o.getBatchQty();
    public static Function<BasOrgGoodsDTO, Integer> batchPolicy_ = o -> o.getBatchPolicy();
    public static Function<BasOrgGoodsDTO, Integer> isSale_ = o -> o.getIsSale();
    public static Function<BasOrgGoodsDTO, Integer> isReturn_ = o -> o.getIsReturn();
    public static Function<BasOrgGoodsDTO, Integer> isTrans_ = o -> o.getIsTrans();
    public static Function<BasOrgGoodsDTO, java.math.BigDecimal> conCycle_ = o -> o.getConCycle();
    public static Function<BasOrgGoodsDTO, Integer> isStockInv_ = o -> o.getIsStockInv();
    public static Function<BasOrgGoodsDTO, Integer> isRet_ = o -> o.getIsRet();
    public static Function<BasOrgGoodsDTO, Integer> isMustRet_ = o -> o.getIsMustRet();
    public static Function<BasOrgGoodsDTO, java.math.BigDecimal> purExcRatio_ =
        o -> o.getPurExcRatio();
    public static Function<BasOrgGoodsDTO, Integer> isDefDepot_ = o -> o.getIsDefDepot();
  }

  public static ValidatorBuilder<BasOrgGoodsDTO> validatorExample() {
    ValidatorBuilder<BasOrgGoodsDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
