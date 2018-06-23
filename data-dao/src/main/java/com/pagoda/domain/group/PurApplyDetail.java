package com.pagoda.domain.group;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.group.*;

import lombok.Data;
import lombok.experimental.Accessors;
import ma.glasnost.orika.*;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.hibernate.annotations.*;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.domain.AbstractAggregateRoot;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * pur_apply_detail实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.PurApplyDetail")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`pur_apply_detail`")
@org.hibernate.annotations.Table(appliesTo = "`pur_apply_detail`", comment = "pur_apply_detail")
@SQLDelete(sql = "update `pur_apply_detail` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "PurApplyDetail",
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
public class PurApplyDetail extends PurApplyDetailDTO implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @FieldMeta(
    name = "id",
    nameCN = "主键id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  private Long id;

  @FieldMeta(
    name = "deleted",
    nameCN = "软删除标记",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @Column(
    name = "deleted",
    insertable = false,
    columnDefinition = "bigint default 0 COMMENT '软删除标记'"
  )
  private Long deleted = 0L;

  @FieldMeta(
    name = "created_at",
    nameCN = "创建时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "created_at", updatable = false, columnDefinition = "datetime COMMENT '创建时间'")
  @CreatedDate
  private Date createdAt;

  @FieldMeta(
    name = "creator_code",
    nameCN = "创建人code",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "creator_code", columnDefinition = "varchar(30) COMMENT '创建人code'")
  @CreatedBy
  private String creatorCode;

  @FieldMeta(
    name = "creator_name",
    nameCN = "创建人name",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "creator_name", columnDefinition = "varchar(30) COMMENT '创建人name'")
  private String creatorName;

  @FieldMeta(
    name = "creator_org_code",
    nameCN = "创建人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "creator_org_code", columnDefinition = "varchar(200) COMMENT '创建人所属部门'")
  private String creatorOrgCode;

  @FieldMeta(
    name = "last_modified_at",
    nameCN = "最近修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "last_modified_at", columnDefinition = "datetime COMMENT '最近修改时间'")
  @LastModifiedDate
  private Date lastModifiedAt;

  @FieldMeta(
    name = "modifier_code",
    nameCN = "最近修改人code",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "modifier_code", columnDefinition = "varchar(30) COMMENT '最近修改人code'")
  @LastModifiedBy
  private String modifierCode;

  @FieldMeta(
    name = "modifier_name",
    nameCN = "最近修改人name",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "modifier_name", columnDefinition = "varchar(30) COMMENT '最近修改人name'")
  private String modifierName;

  @FieldMeta(
    name = "modifier_org_code",
    nameCN = "修改人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "modifier_org_code", columnDefinition = "varchar(200) COMMENT '修改人所属部门'")
  private String modifierOrgCode;

  @FieldMeta(
    name = "version",
    nameCN = "版本号",
    type = "integer",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "version", columnDefinition = "int(11) COMMENT '版本号'")
  @Version
  private Integer version;

  @FieldMeta(
    name = "applyId",
    scene = "",
    nameCN = "请购单头表ID",
    comment = "请购单头表ID",
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
  @Column(
    name = "\"apply_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "长整型   COMMENT '请购单头表ID'"
  )
  private Long applyId;

  @FieldMeta(
    name = "applyPrice",
    scene = "",
    nameCN = "需求金额",
    comment = "需求金额",
    nameEN = "apply_price",
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
  @Column(
    name = "\"apply_price\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '需求金额'"
  )
  private java.math.BigDecimal applyPrice;

  @FieldMeta(
    name = "applyQty",
    scene = "",
    nameCN = "请购数量",
    comment = "请购数量",
    nameEN = "apply_qty",
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
  @Column(
    name = "\"apply_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '请购数量'"
  )
  private Integer applyQty;

  @FieldMeta(
    name = "basUnitCode",
    scene = "",
    nameCN = "基础计量单位代码",
    comment = "基础计量单位代码",
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
  @Column(
    name = "\"bas_unit_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '基础计量单位代码'"
  )
  private String basUnitCode;

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
  @Column(
    name = "\"bas_unit_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "长整型   COMMENT '基础计量单位ID'"
  )
  private Long basUnitId;

  @FieldMeta(
    name = "basUnitName",
    scene = "",
    nameCN = "标准单位",
    comment = "标准单位",
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
  @Column(
    name = "\"bas_unit_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '标准单位'"
  )
  private String basUnitName;

  @FieldMeta(
    name = "calCusOrderQty",
    scene = "",
    nameCN = "门店订货数量",
    comment = "门店订货数量",
    nameEN = "cal_cus_order_qty",
    type = "浮点数",
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
  @Column(
    name = "\"cal_cus_order_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "浮点数   COMMENT '门店订货数量'"
  )
  private Double calCusOrderQty;

  @FieldMeta(
    name = "calCusSalQty",
    scene = "",
    nameCN = "门店昨日销量",
    comment = "门店昨日销量",
    nameEN = "cal_cus_sal_qty",
    type = "浮点数",
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
  @Column(
    name = "\"cal_cus_sal_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "浮点数   COMMENT '门店昨日销量'"
  )
  private Double calCusSalQty;

  @FieldMeta(
    name = "calInvQty",
    scene = "",
    nameCN = "库存量",
    comment = "库存量",
    nameEN = "cal_inv_qty",
    type = "浮点数",
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
  @Column(
    name = "\"cal_inv_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "浮点数   COMMENT '库存量'"
  )
  private Double calInvQty;

  @FieldMeta(
    name = "calOnWayQty",
    scene = "",
    nameCN = " 在途量",
    comment = " 在途量",
    nameEN = "cal_on_way_qty",
    type = "浮点数",
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
  @Column(
    name = "\"cal_on_way_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "浮点数   COMMENT ' 在途量'"
  )
  private Double calOnWayQty;

  @FieldMeta(
    name = "calOuterFerQty",
    scene = "",
    nameCN = " 外区调拨数量[",
    comment = " 外区调拨数量[",
    nameEN = "cal_outer_fer_qty",
    type = "浮点数",
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
  @Column(
    name = "\"cal_outer_fer_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "浮点数   COMMENT ' 外区调拨数量['"
  )
  private Double calOuterFerQty;

  @FieldMeta(
    name = "calPurRate",
    scene = "",
    nameCN = " 计算采购系数",
    comment = " 计算采购系数",
    nameEN = "cal_pur_rate",
    type = "浮点数",
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
  @Column(
    name = "\"cal_pur_rate\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "浮点数   COMMENT ' 计算采购系数'"
  )
  private Double calPurRate;

  @FieldMeta(
    name = "calReplenishmentQty",
    scene = "",
    nameCN = " 补货量",
    comment = " 补货量",
    nameEN = "cal_replenishment_qty",
    type = "浮点数",
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
  @Column(
    name = "\"cal_replenishment_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "浮点数   COMMENT ' 补货量'"
  )
  private Double calReplenishmentQty;

  @FieldMeta(
    name = "calStockUpQty",
    scene = "",
    nameCN = " 备货量",
    comment = " 备货量",
    nameEN = "cal_stock_up_qty",
    type = "浮点数",
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
  @Column(
    name = "\"cal_stock_up_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "浮点数   COMMENT ' 备货量'"
  )
  private Double calStockUpQty;

  @FieldMeta(
    name = "confirmQty",
    scene = "",
    nameCN = "确认数量",
    comment = "确认数量",
    nameEN = "confirm_qty",
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
  @Column(
    name = "\"confirm_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '确认数量'"
  )
  private Integer confirmQty;

  @FieldMeta(
    name = "dealPurQty",
    scene = "",
    nameCN = "转采购数量",
    comment = "转采购数量",
    nameEN = "deal_pur_qty",
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
  @Column(
    name = "\"deal_pur_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '转采购数量'"
  )
  private Integer dealPurQty;

  @FieldMeta(
    name = "dealSalOrgId",
    scene = "",
    nameCN = "转内部销售要货机构ID",
    comment = "转内部销售要货机构ID",
    nameEN = "deal_sal_org_id",
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
  @Column(
    name = "\"deal_sal_org_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '转内部销售要货机构ID'"
  )
  private String dealSalOrgId;

  @FieldMeta(
    name = "dealSalQty",
    scene = "",
    nameCN = "转内部调拨销售数量",
    comment = "转内部调拨销售数量",
    nameEN = "deal_sal_qty",
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
  @Column(
    name = "\"deal_sal_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '转内部调拨销售数量'"
  )
  private Integer dealSalQty;

  @FieldMeta(
    name = "dealStatus",
    scene = "",
    nameCN = "处理状态",
    comment = "处理状态",
    nameEN = "deal_status",
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
  @Column(
    name = "\"deal_status\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '处理状态'"
  )
  private Integer dealStatus;

  @FieldMeta(
    name = "delId",
    scene = "",
    nameCN = " 删除次数",
    comment = " 删除次数",
    nameEN = "del_id",
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
  @Column(
    name = "\"del_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT ' 删除次数'"
  )
  private Integer delId;

  @FieldMeta(
    name = "goodsLevel",
    scene = "",
    nameCN = "商品等级",
    comment = "商品等级",
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
  @Column(
    name = "\"goods_level\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '商品等级'"
  )
  private Integer goodsLevel;

  @FieldMeta(
    name = "goodsOrion",
    scene = "",
    nameCN = "商品产地",
    comment = "商品产地",
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
  @Column(
    name = "\"goods_orion\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '商品产地'"
  )
  private String goodsOrion;

  @FieldMeta(
    name = "invPrice",
    scene = "",
    nameCN = "库存单价",
    comment = "库存单价",
    nameEN = "inv_price",
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
  @Column(
    name = "\"inv_price\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '库存单价'"
  )
  private java.math.BigDecimal invPrice;

  @FieldMeta(
    name = "purUnitCode",
    scene = "",
    nameCN = " 采购计量单位代码",
    comment = " 采购计量单位代码",
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
  @Column(
    name = "\"pur_unit_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT ' 采购计量单位代码'"
  )
  private String purUnitCode;

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
  @Column(
    name = "\"pur_unit_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "长整型   COMMENT '采购计量单位ID'"
  )
  private Long purUnitId;

  @FieldMeta(
    name = "purUnitName",
    scene = "",
    nameCN = "采购计量单位名称",
    comment = "采购计量单位名称",
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
  @Column(
    name = "\"pur_unit_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '采购计量单位名称'"
  )
  private String purUnitName;

  @FieldMeta(
    name = "purUnitRate",
    scene = "",
    nameCN = " 采购计量单位转换比",
    comment = " 采购计量单位转换比",
    nameEN = "pur_unit_rate",
    type = "浮点数",
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
  @Column(
    name = "\"pur_unit_rate\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "浮点数   COMMENT ' 采购计量单位转换比'"
  )
  private Double purUnitRate;

  @FieldMeta(
    name = "requestQty",
    scene = "",
    nameCN = "需求数量",
    comment = "需求数量",
    nameEN = "request_qty",
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
  @Column(
    name = "\"request_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '需求数量'"
  )
  private Integer requestQty;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(PurApplyDetail.class, PurApplyDetailDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public PurApplyDetail() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static PurApplyDetail toExample() {
    PurApplyDetail example = new PurApplyDetail();
    // example.deleted = null;
    example.enabled = null;
    example.active = null;
    return example;
  }

  /**
   * 通过反射调用动态设置模型的属性值
   *
   * @param fieldName 属性名称
   * @param value 属性值
   * @throws NoSuchFieldException
   * @throws IllegalAccessException
   */
  public void setFeildValue(String fieldName, Object value)
      throws NoSuchFieldException, IllegalAccessException {
    Field field = PurApplyDetail.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public PurApplyDetailDTO toDTO() {
    return mapper.map(this, PurApplyDetailDTO.class);
  }

  public static PurApplyDetail convertDTO(PurApplyDetailDTO dto) {
    return mapper.map(dto, PurApplyDetail.class);
  }

  public static Iterable<PurApplyDetail> batchConvertDTO(Iterable<PurApplyDetailDTO> dtos) {
    List<PurApplyDetail> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<PurApplyDetailDTO> batchConvert(Iterable<PurApplyDetail> entities) {
    List<PurApplyDetailDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<PurApplyDetail, PurApplyDetailDTO> DTO_CONVERTER =
      new Converter<PurApplyDetail, PurApplyDetailDTO>() {

        @Override
        public PurApplyDetailDTO convert(PurApplyDetail source) {
          return source.toDTO();
        }
      };
}
