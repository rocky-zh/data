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
 * sal_consign_detail实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.SalConsignDetail")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`sal_consign_detail`")
@org.hibernate.annotations.Table(appliesTo = "`sal_consign_detail`", comment = "sal_consign_detail")
@SQLDelete(sql = "update `sal_consign_detail` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "SalConsignDetail",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = true,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class SalConsignDetail extends SalConsignDetailDTO implements Serializable {

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
    name = "tree_path",
    nameCN = "树形节点路径",
    type = "string",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "tree_path", columnDefinition = "varchar(1000) COMMENT '树形节点路径'")
  private String treePath;

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
    name = "actualAmt",
    scene = "",
    nameCN = "实际总金额",
    comment = "实际总金额",
    nameEN = "actual_amt",
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
    name = "\"actual_amt\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '实际总金额'"
  )
  private java.math.BigDecimal actualAmt;

  @FieldMeta(
    name = "conId",
    scene = "",
    nameCN = "发货单ID",
    comment = "发货单ID",
    nameEN = "con_id",
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
    name = "\"con_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "长整型   COMMENT '发货单ID'"
  )
  private Long conId;

  @FieldMeta(
    name = "conNo",
    scene = "",
    nameCN = "发货单号",
    comment = "发货单号",
    nameEN = "con_no",
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
    name = "\"con_no\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '发货单号'"
  )
  private String conNo;

  @FieldMeta(
    name = "discountPrice",
    scene = "",
    nameCN = "折后单价",
    comment = "折后单价",
    nameEN = "discount_price",
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
    name = "\"discount_price\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '折后单价'"
  )
  private java.math.BigDecimal discountPrice;

  @FieldMeta(
    name = "discountRate",
    scene = "",
    nameCN = "折扣",
    comment = "折扣",
    nameEN = "discount_rate",
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
    name = "\"discount_rate\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '折扣'"
  )
  private java.math.BigDecimal discountRate;

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
  @Column(
    name = "\"enabled\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "布尔   COMMENT '是否启用'"
  )
  private Boolean enabled;

  @FieldMeta(
    name = "goodsCode",
    scene = "",
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
  @Column(
    name = "\"goods_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '商品代码'"
  )
  private String goodsCode;

  @FieldMeta(
    name = "goodsId",
    scene = "",
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
  @Column(
    name = "\"goods_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "长整型   COMMENT '商品ID'"
  )
  private Long goodsId;

  @FieldMeta(
    name = "goodsName",
    scene = "",
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
  @Column(
    name = "\"goods_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '商品名称'"
  )
  private String goodsName;

  @FieldMeta(
    name = "goodsSpec",
    scene = "",
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
  @Column(
    name = "\"goods_spec\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '商品规格'"
  )
  private String goodsSpec;

  @FieldMeta(
    name = "grossWeight",
    scene = "",
    nameCN = "毛重",
    comment = "毛重",
    nameEN = "gross_weight",
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
    name = "\"gross_weight\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '毛重'"
  )
  private java.math.BigDecimal grossWeight;

  @FieldMeta(
    name = "netWeight",
    scene = "",
    nameCN = "净重(公斤)",
    comment = "净重(公斤)",
    nameEN = "net_weight",
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
    name = "\"net_weight\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '净重(公斤)'"
  )
  private java.math.BigDecimal netWeight;

  @FieldMeta(
    name = "orderId",
    scene = "",
    nameCN = "订单ID",
    comment = "订单ID",
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
  @Column(
    name = "\"order_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "长整型   COMMENT '订单ID'"
  )
  private Long orderId;

  @FieldMeta(
    name = "orderNo",
    scene = "",
    nameCN = "订单号",
    comment = "订单号",
    nameEN = "order_no",
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
    name = "\"order_no\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '订单号'"
  )
  private String orderNo;

  @FieldMeta(
    name = "price",
    scene = "",
    nameCN = "配送价(含税)",
    comment = "配送价(含税)",
    nameEN = "price",
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
    name = "\"price\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '配送价(含税)'"
  )
  private java.math.BigDecimal price;

  @FieldMeta(
    name = "qty",
    scene = "",
    nameCN = "数量",
    comment = "数量",
    nameEN = "qty",
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
    name = "\"qty\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '数量'"
  )
  private java.math.BigDecimal qty;

  @FieldMeta(
    name = "salConOutDepotCode",
    scene = "",
    nameCN = "默认销售出库库房代码",
    comment = "默认销售出库库房代码",
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
  @Column(
    name = "\"sal_con_out_depot_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '默认销售出库库房代码'"
  )
  private String salConOutDepotCode;

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
  @Column(
    name = "\"sal_con_out_depot_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "长整型   COMMENT '默认销售出库库房ID'"
  )
  private Long salConOutDepotId;

  @FieldMeta(
    name = "salConOutDepotName",
    scene = "",
    nameCN = "默认销售出库库房名称",
    comment = "默认销售出库库房名称",
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
  @Column(
    name = "\"sal_con_out_depot_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '默认销售出库库房名称'"
  )
  private String salConOutDepotName;

  @FieldMeta(
    name = "salUnitCode",
    scene = "",
    nameCN = "销售计量单位代码",
    comment = "销售计量单位代码",
    nameEN = "sal_unit_code",
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
    name = "\"sal_unit_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '销售计量单位代码'"
  )
  private String salUnitCode;

  @FieldMeta(
    name = "salUnitId",
    scene = "",
    nameCN = "销售计量单位ID",
    comment = "销售计量单位ID",
    nameEN = "sal_unit_id",
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
    name = "\"sal_unit_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "长整型   COMMENT '销售计量单位ID'"
  )
  private Long salUnitId;

  @FieldMeta(
    name = "salUnitName",
    scene = "",
    nameCN = "销售计量单位名称",
    comment = "销售计量单位名称",
    nameEN = "sal_unit_name",
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
    name = "\"sal_unit_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '销售计量单位名称'"
  )
  private String salUnitName;

  @FieldMeta(
    name = "salUnitRate",
    scene = "",
    nameCN = "销售计量单位转换比",
    comment = "销售计量单位转换比",
    nameEN = "sal_unit_rate",
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
    name = "\"sal_unit_rate\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '销售计量单位转换比'"
  )
  private java.math.BigDecimal salUnitRate;

  @FieldMeta(
    name = "shippedAmt",
    scene = "",
    nameCN = "已发货总金额",
    comment = "已发货总金额",
    nameEN = "shipped_amt",
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
    name = "\"shipped_amt\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '已发货总金额'"
  )
  private java.math.BigDecimal shippedAmt;

  @FieldMeta(
    name = "shippedCount",
    scene = "",
    nameCN = "发货次数",
    comment = "发货次数",
    nameEN = "shipped_count",
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
    name = "\"shipped_count\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '发货次数'"
  )
  private Integer shippedCount;

  @FieldMeta(
    name = "shippedGrossWeight",
    scene = "",
    nameCN = "已发毛重",
    comment = "已发毛重",
    nameEN = "shipped_gross_weight",
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
    name = "\"shipped_gross_weight\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '已发毛重'"
  )
  private java.math.BigDecimal shippedGrossWeight;

  @FieldMeta(
    name = "shippedNetWeight",
    scene = "",
    nameCN = "已发净重",
    comment = "已发净重",
    nameEN = "shipped_net_weight",
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
    name = "\"shipped_net_weight\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '已发净重'"
  )
  private java.math.BigDecimal shippedNetWeight;

  @FieldMeta(
    name = "shippedPrice",
    scene = "",
    nameCN = "已发货单价",
    comment = "已发货单价",
    nameEN = "shipped_price",
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
    name = "\"shipped_price\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '已发货单价'"
  )
  private java.math.BigDecimal shippedPrice;

  @FieldMeta(
    name = "shippedQty",
    scene = "",
    nameCN = "已发数量",
    comment = "已发数量",
    nameEN = "shipped_qty",
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
    name = "\"shipped_qty\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '已发数量'"
  )
  private java.math.BigDecimal shippedQty;

  @FieldMeta(
    name = "shippedVolume",
    scene = "",
    nameCN = "已发体积",
    comment = "已发体积",
    nameEN = "shipped_volume",
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
    name = "\"shipped_volume\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '已发体积'"
  )
  private java.math.BigDecimal shippedVolume;

  @FieldMeta(
    name = "taxAmt",
    scene = "",
    nameCN = "商品税金",
    comment = "商品税金",
    nameEN = "tax_amt",
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
    name = "\"tax_amt\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '商品税金'"
  )
  private java.math.BigDecimal taxAmt;

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
  @Column(
    name = "\"tax_rate\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '税率'"
  )
  private java.math.BigDecimal taxRate;

  @FieldMeta(
    name = "totalAmt",
    scene = "",
    nameCN = "实际总金额",
    comment = "实际总金额",
    nameEN = "total_amt",
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
    name = "\"total_amt\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '实际总金额'"
  )
  private java.math.BigDecimal totalAmt;

  @FieldMeta(
    name = "volume",
    scene = "",
    nameCN = "体积",
    comment = "体积",
    nameEN = "volume",
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
    name = "\"volume\"",
    nullable = true,
    precision = 0,
    scale = 2,
    columnDefinition = "小数   COMMENT '体积'"
  )
  private java.math.BigDecimal volume;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(SalConsignDetail.class, SalConsignDetailDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public SalConsignDetail() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static SalConsignDetail toExample() {
    SalConsignDetail example = new SalConsignDetail();
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
    Field field = SalConsignDetail.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public SalConsignDetailDTO toDTO() {
    return mapper.map(this, SalConsignDetailDTO.class);
  }

  public static SalConsignDetail convertDTO(SalConsignDetailDTO dto) {
    return mapper.map(dto, SalConsignDetail.class);
  }

  public static Iterable<SalConsignDetail> batchConvertDTO(Iterable<SalConsignDetailDTO> dtos) {
    List<SalConsignDetail> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<SalConsignDetailDTO> batchConvert(Iterable<SalConsignDetail> entities) {
    List<SalConsignDetailDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<SalConsignDetail, SalConsignDetailDTO> DTO_CONVERTER =
      new Converter<SalConsignDetail, SalConsignDetailDTO>() {

        @Override
        public SalConsignDetailDTO convert(SalConsignDetail source) {
          return source.toDTO();
        }
      };
}
