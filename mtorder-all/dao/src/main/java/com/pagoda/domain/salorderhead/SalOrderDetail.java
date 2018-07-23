package com.pagoda.domain.salorderhead;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.salorderhead.*;

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
 * 销售订单明细表实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.SalOrderDetail")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`sal_order_detail`")
@org.hibernate.annotations.Table(appliesTo = "`sal_order_detail`", comment = "销售订单明细表")
@SQLDelete(sql = "update `sal_order_detail` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "SalOrderDetail",
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
public class SalOrderDetail extends SalOrderDetailDTO implements Serializable {

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
    nameCN = "录入时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "created_at", updatable = false, columnDefinition = "datetime COMMENT '录入时间'")
  @CreatedDate
  private Date createdAt;

  @FieldMeta(
    name = "creator_code",
    nameCN = "录入人代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "creator_code", columnDefinition = "varchar(30) COMMENT '录入人代码'")
  @CreatedBy
  private String creatorCode;

  @FieldMeta(
    name = "creator_name",
    nameCN = "录入人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "creator_name", columnDefinition = "varchar(30) COMMENT '录入人名称'")
  private String creatorName;

  @FieldMeta(
    name = "creator_org_code",
    nameCN = "录入人机构代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "creator_org_code", columnDefinition = "varchar(200) COMMENT '录入人机构代码'")
  private String creatorOrgCode;

  @FieldMeta(
    name = "last_modified_at",
    nameCN = "最后修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "last_modified_at", columnDefinition = "datetime COMMENT '最后修改时间'")
  @LastModifiedDate
  private Date lastModifiedAt;

  @FieldMeta(
    name = "modifier_code",
    nameCN = "最后修改人代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "modifier_code", columnDefinition = "varchar(30) COMMENT '最后修改人代码'")
  @LastModifiedBy
  private String modifierCode;

  @FieldMeta(
    name = "modifier_name",
    nameCN = "最后修改人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "modifier_name", columnDefinition = "varchar(30) COMMENT '最后修改人名称'")
  private String modifierName;

  @FieldMeta(
    name = "modifier_org_code",
    nameCN = "最后修改人机构代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "modifier_org_code", columnDefinition = "varchar(200) COMMENT '最后修改人机构代码'")
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
  @Column(
    name = "\"order_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '订单ID[orderId]'"
  )
  private Long orderId;

  @FieldMeta(
    name = "orderSeqno",
    scene = "",
    nameCN = "订单号[冗余]",
    comment = "订单号[冗余]",
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
  @Column(
    name = "\"order_seqno\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '订单号[冗余]'"
  )
  private String orderSeqno;

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
  @Column(
    name = "\"ent_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '企业ID'"
  )
  private Long entId;

  @FieldMeta(
    name = "goodsVarId",
    scene = "",
    nameCN = "销售商品ID",
    comment = "销售商品ID",
    nameEN = "goods_var_id",
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
    name = "\"goods_var_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '销售商品ID'"
  )
  private Long goodsVarId;

  @FieldMeta(
    name = "goodsVarName",
    scene = "",
    nameCN = "零售商品名称[冗余]",
    comment = "零售商品名称[冗余]",
    nameEN = "goods_var_name",
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
    name = "\"goods_var_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '零售商品名称[冗余]'"
  )
  private String goodsVarName;

  @FieldMeta(
    name = "goodsId",
    scene = "",
    nameCN = "商品ID[冗余]",
    comment = "商品ID[冗余]",
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
    columnDefinition = "BIGINT   COMMENT '商品ID[冗余]'"
  )
  private Long goodsId;

  @FieldMeta(
    name = "goodsCode",
    scene = "",
    nameCN = "商品代码[冗余]",
    comment = "商品代码[冗余]",
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
    columnDefinition = "varchar(30)   COMMENT '商品代码[冗余]'"
  )
  private String goodsCode;

  @FieldMeta(
    name = "goodsName",
    scene = "",
    nameCN = "商品名称[冗余]",
    comment = "商品名称[冗余]",
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
    columnDefinition = "varchar(60)   COMMENT '商品名称[冗余]'"
  )
  private String goodsName;

  @FieldMeta(
    name = "goodsSpec",
    scene = "",
    nameCN = "商品规格[冗余]",
    comment = "商品规格[冗余]",
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
    columnDefinition = "varchar(60)   COMMENT '商品规格[冗余]'"
  )
  private String goodsSpec;

  @FieldMeta(
    name = "salUnitid",
    scene = "",
    nameCN = "销售计量单位ID",
    comment = "销售计量单位ID",
    nameEN = "sal_unitid",
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
    name = "\"sal_unitid\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '销售计量单位ID'"
  )
  private Long salUnitid;

  @FieldMeta(
    name = "salUnitCode",
    scene = "",
    nameCN = "销售计量单位代码[冗余]",
    comment = "销售计量单位代码[冗余]",
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
    columnDefinition = "varchar(35)   COMMENT '销售计量单位代码[冗余]'"
  )
  private String salUnitCode;

  @FieldMeta(
    name = "salUnitName",
    scene = "",
    nameCN = "销售计量单位名称[冗余]",
    comment = "销售计量单位名称[冗余]",
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
    columnDefinition = "varchar(60)   COMMENT '销售计量单位名称[冗余]'"
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
    scale = 0,
    columnDefinition = "decimal(18,10)   COMMENT '销售计量单位转换比'"
  )
  private java.math.BigDecimal salUnitRate;

  @FieldMeta(
    name = "requestQty",
    scene = "",
    nameCN = "需求数量[头sourcetype=1使用]",
    comment = "需求数量[头sourcetype=1使用]",
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
  @Column(
    name = "\"request_qty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "decimal(18,10)   COMMENT '需求数量[头sourcetype=1使用]'"
  )
  private java.math.BigDecimal requestQty;

  @FieldMeta(
    name = "maxOrderQty",
    scene = "",
    nameCN = "最大订货量",
    comment = "最大订货量",
    nameEN = "max_order_qty",
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
    name = "\"max_order_qty\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '最大订货量'"
  )
  private java.math.BigDecimal maxOrderQty;

  @FieldMeta(
    name = "minOrderQty",
    scene = "",
    nameCN = "最小订货量",
    comment = "最小订货量",
    nameEN = "min_order_qty",
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
    name = "\"min_order_qty\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '最小订货量'"
  )
  private java.math.BigDecimal minOrderQty;

  @FieldMeta(
    name = "price",
    scene = "",
    nameCN = "单价",
    comment = "单价",
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
    scale = 0,
    columnDefinition = "decimal(18,10)   COMMENT '单价'"
  )
  private java.math.BigDecimal price;

  @FieldMeta(
    name = "discountPrice",
    scene = "",
    nameCN = "折后单价[含税]",
    comment = "折后单价[含税]",
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
    scale = 0,
    columnDefinition = "decimal(18,10)   COMMENT '折后单价[含税]'"
  )
  private java.math.BigDecimal discountPrice;

  @FieldMeta(
    name = "discountRate",
    scene = "",
    nameCN = "折扣率[1为原价,0.9为9折]",
    comment = "折扣率[1为原价,0.9为9折]",
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
    scale = 0,
    columnDefinition = "decimal(10,10)   COMMENT '折扣率[1为原价,0.9为9折]'"
  )
  private java.math.BigDecimal discountRate;

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
  @Column(
    name = "\"discount_amt\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '折扣额度'"
  )
  private java.math.BigDecimal discountAmt;

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
    scale = 0,
    columnDefinition = "decimal(10,10)   COMMENT '税率'"
  )
  private java.math.BigDecimal taxRate;

  @FieldMeta(
    name = "taxAmt",
    scene = "",
    nameCN = "税金[=round(totalAmt*taxrate/(taxrate+1),2)]",
    comment = "税金[=round(totalAmt*taxrate/(taxrate+1),2)]",
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
    scale = 0,
    columnDefinition = "decimal(18,10)   COMMENT '税金[=round(totalAmt*taxrate/(taxrate+1),2)]'"
  )
  private java.math.BigDecimal taxAmt;

  @FieldMeta(
    name = "goodsAmt",
    scene = "",
    nameCN = "货款",
    comment = "货款",
    nameEN = "goods_amt",
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
    name = "\"goods_amt\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '货款'"
  )
  private java.math.BigDecimal goodsAmt;

  @FieldMeta(
    name = "totalAmt",
    scene = "",
    nameCN = "总金额[=round(数量*price,2)]",
    comment = "总金额[=round(数量*price,2)]",
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
    scale = 0,
    columnDefinition = "decimal(18,10)   COMMENT '总金额[=round(数量*price,2)]'"
  )
  private java.math.BigDecimal totalAmt;

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
  @Column(
    name = "\"remark\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(300)   COMMENT '备注'"
  )
  private String remark;

  @FieldMeta(
    name = "conOrgId",
    scene = "",
    nameCN = "发货机构ID",
    comment = "发货机构ID",
    nameEN = "con_org_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
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
    name = "\"con_org_id\"",
    nullable = false,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT  NOT NULL   COMMENT '发货机构ID'"
  )
  private Long conOrgId;

  @FieldMeta(
    name = "conOrgCode",
    scene = "",
    nameCN = "发货机构代码[冗余]",
    comment = "发货机构代码[冗余]",
    nameEN = "con_org_code",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
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
    name = "\"con_org_code\"",
    nullable = false,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)  NOT NULL   COMMENT '发货机构代码[冗余]'"
  )
  private String conOrgCode;

  @FieldMeta(
    name = "conOrgName",
    scene = "",
    nameCN = "发货机构名称[冗余]",
    comment = "发货机构名称[冗余]",
    nameEN = "con_org_name",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = true,
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
    name = "\"con_org_name\"",
    nullable = false,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)  NOT NULL   COMMENT '发货机构名称[冗余]'"
  )
  private String conOrgName;

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
  @Column(
    name = "\"batch_qty\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '批量数量(冗余,机构商品中定义)'"
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
    required = true,
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
    name = "\"batch_policy\"",
    nullable = false,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER  NOT NULL   COMMENT '批量政策{0:无,1:固定倍数,2:最小起订量 冗余,机构商品中定义}'"
  )
  private Integer batchPolicy;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(SalOrderDetail.class, SalOrderDetailDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public SalOrderDetail() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static SalOrderDetail toExample() {
    SalOrderDetail example = new SalOrderDetail();
    example.deleted = null;
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
    Field field = SalOrderDetail.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public SalOrderDetailDTO toDTO() {
    return mapper.map(this, SalOrderDetailDTO.class);
  }

  public static SalOrderDetail convertDTO(SalOrderDetailDTO dto) {
    return mapper.map(dto, SalOrderDetail.class);
  }

  public static Iterable<SalOrderDetail> batchConvertDTO(Iterable<SalOrderDetailDTO> dtos) {
    List<SalOrderDetail> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<SalOrderDetailDTO> batchConvert(Iterable<SalOrderDetail> entities) {
    List<SalOrderDetailDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<SalOrderDetail, SalOrderDetailDTO> DTO_CONVERTER =
      new Converter<SalOrderDetail, SalOrderDetailDTO>() {

        @Override
        public SalOrderDetailDTO convert(SalOrderDetail source) {
          return source.toDTO();
        }
      };
}
