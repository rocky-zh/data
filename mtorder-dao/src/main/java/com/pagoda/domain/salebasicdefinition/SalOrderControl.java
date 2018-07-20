package com.pagoda.domain.salebasicdefinition;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.salebasicdefinition.*;

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
 * 按客户维度进行配送订单、退货、货款等方面的控制实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.SalOrderControl")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`sal_order_control`")
@org.hibernate.annotations.Table(
  appliesTo = "`sal_order_control`",
  comment = "按客户维度进行配送订单、退货、货款等方面的控制"
)
@SQLDelete(sql = "update `sal_order_control` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "SalOrderControl",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = true
)
public class SalOrderControl extends SalOrderControlDTO implements Serializable {

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
    name = "cusOrgId",
    scene = "",
    nameCN = "客户ID",
    comment = "客户ID",
    nameEN = "cus_org_id",
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
    name = "\"cus_org_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '客户ID'"
  )
  private Long cusOrgId;

  @FieldMeta(
    name = "cusOrgCode",
    scene = "",
    nameCN = "客户代码[冗余]",
    comment = "客户代码[冗余]",
    nameEN = "cus_org_code",
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
    name = "\"cus_org_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '客户代码[冗余]'"
  )
  private String cusOrgCode;

  @FieldMeta(
    name = "cusOrgName",
    scene = "",
    nameCN = "客户名称[冗余]",
    comment = "客户名称[冗余]",
    nameEN = "cus_org_name",
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
    name = "\"cus_org_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '客户名称[冗余]'"
  )
  private String cusOrgName;

  @FieldMeta(
    name = "isCtrlDep",
    scene = "",
    nameCN = "存款订单控制. {1:是  0:否}",
    comment = "存款订单控制. {1:是  0:否}",
    nameEN = "is_ctrl_dep",
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
    name = "\"is_ctrl_dep\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '存款订单控制. {1:是  0:否}'"
  )
  private Integer isCtrlDep;

  @FieldMeta(
    name = "beforeDays",
    scene = "",
    nameCN = "存款减控制天数.取当前往前推N天的营业款差额，存款订单控制是必填。否非必填，数值",
    comment = "存款减控制天数.取当前往前推N天的营业款差额，存款订单控制是必填。否非必填，数值",
    nameEN = "before_days",
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
    name = "\"before_days\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '存款减控制天数.取当前往前推N天的营业款差额，存款订单控制是必填。否非必填，数值'"
  )
  private Integer beforeDays;

  @FieldMeta(
    name = "allowPosGapD",
    scene = "",
    nameCN = "存款允许差额.根据存款减天数取门店营业款差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    comment = "存款允许差额.根据存款减天数取门店营业款差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    nameEN = "allow_pos_gap_d",
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
    name = "\"allow_pos_gap_d\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition =
        "INTEGER   COMMENT '存款允许差额.根据存款减天数取门店营业款差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值'"
  )
  private Integer allowPosGapD;

  @FieldMeta(
    name = "allowPosGapM",
    scene = "",
    nameCN = "月累计允许差额.根据存款减天数取门店营业款累计月差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    comment = "月累计允许差额.根据存款减天数取门店营业款累计月差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值",
    nameEN = "allow_pos_gap_m",
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
    name = "\"allow_pos_gap_m\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition =
        "INTEGER   COMMENT '月累计允许差额.根据存款减天数取门店营业款累计月差额和填写的值对比，范围内允许订货，范围外，不允许订货，存款订单控制是必填。否非必填，数值'"
  )
  private Integer allowPosGapM;

  @FieldMeta(
    name = "isDepInput",
    scene = "",
    nameCN = "控制营业款录入  当天是否有录入营业款记录，必填，选择：1:是、2:否",
    comment = "控制营业款录入  当天是否有录入营业款记录，必填，选择：1:是、2:否",
    nameEN = "is_dep_input",
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
    name = "\"is_dep_input\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '控制营业款录入  当天是否有录入营业款记录，必填，选择：1:是、2:否'"
  )
  private Integer isDepInput;

  @FieldMeta(
    name = "isAccnt",
    scene = "",
    nameCN = "控制零售出库未记账单， 是否有未记账的零售出库单，必填，选择：是、否{0:否,1:是}",
    comment = "控制零售出库未记账单， 是否有未记账的零售出库单，必填，选择：是、否{0:否,1:是}",
    nameEN = "is_accnt",
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
    name = "\"is_accnt\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '控制零售出库未记账单， 是否有未记账的零售出库单，必填，选择：是、否{0:否,1:是}'"
  )
  private Integer isAccnt;

  @FieldMeta(
    name = "isDuty",
    scene = "",
    nameCN = "控制考勤，是否启用控制门店没有考勤不让下单{0:否,1:是}",
    comment = "控制考勤，是否启用控制门店没有考勤不让下单{0:否,1:是}",
    nameEN = "is_duty",
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
    name = "\"is_duty\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '控制考勤，是否启用控制门店没有考勤不让下单{0:否,1:是}'"
  )
  private Integer isDuty;

  @FieldMeta(
    name = "isVrfyTrans",
    scene = "",
    nameCN = "控制调拨单审核 是否启用控制门店调拔单未审核不让下单{0:否,1:是}",
    comment = "控制调拨单审核 是否启用控制门店调拔单未审核不让下单{0:否,1:是}",
    nameEN = "is_vrfy_trans",
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
    name = "\"is_vrfy_trans\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '控制调拨单审核 是否启用控制门店调拔单未审核不让下单{0:否,1:是}'"
  )
  private Integer isVrfyTrans;

  @FieldMeta(
    name = "isDistCyc",
    scene = "",
    nameCN = "控制发货周期， 是，周期发货商品下单时执行周期发货规则，即发货时间为非0的商品，否，周期发货商品可在订单直接录入，必填，选择：是、否",
    comment = "控制发货周期， 是，周期发货商品下单时执行周期发货规则，即发货时间为非0的商品，否，周期发货商品可在订单直接录入，必填，选择：是、否",
    nameEN = "is_dist_cyc",
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
    name = "\"is_dist_cyc\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition =
        "INTEGER   COMMENT '控制发货周期， 是，周期发货商品下单时执行周期发货规则，即发货时间为非0的商品，否，周期发货商品可在订单直接录入，必填，选择：是、否'"
  )
  private Integer isDistCyc;

  @FieldMeta(
    name = "isMustSell",
    scene = "",
    nameCN = "控制果品必上，下单时校验必上果品是否达到安全库存，没有自动追加，必填，选择：是、否{0:否,1:是}",
    comment = "控制果品必上，下单时校验必上果品是否达到安全库存，没有自动追加，必填，选择：是、否{0:否,1:是}",
    nameEN = "is_must_sell",
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
    name = "\"is_must_sell\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '控制果品必上，下单时校验必上果品是否达到安全库存，没有自动追加，必填，选择：是、否{0:否,1:是}'"
  )
  private Integer isMustSell;

  @FieldMeta(
    name = "isRouteSplit",
    scene = "",
    nameCN = "参与路线拆分，备用字段，必填，选择：是、否",
    comment = "参与路线拆分，备用字段，必填，选择：是、否",
    nameEN = "is_route_split",
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
    name = "\"is_route_split\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '参与路线拆分，备用字段，必填，选择：是、否'"
  )
  private Integer isRouteSplit;

  @FieldMeta(
    name = "isSafetyStock",
    scene = "",
    nameCN = "控制安全库存金额，订货金额不允许大于近三天平均销售金额N（N取安全库存销售倍数）倍，必填，选择：是、否",
    comment = "控制安全库存金额，订货金额不允许大于近三天平均销售金额N（N取安全库存销售倍数）倍，必填，选择：是、否",
    nameEN = "is_safety_stock",
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
    name = "\"is_safety_stock\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '控制安全库存金额，订货金额不允许大于近三天平均销售金额N（N取安全库存销售倍数）倍，必填，选择：是、否'"
  )
  private Integer isSafetyStock;

  @FieldMeta(
    name = "safetyStockMultiple",
    scene = "",
    nameCN = "安全库存金额销售倍数 数值，默认1.5，控制安全库存为是，必填，否，非必填",
    comment = "安全库存金额销售倍数 数值，默认1.5，控制安全库存为是，必填，否，非必填",
    nameEN = "safety_stock_multiple",
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
    name = "\"safety_stock_multiple\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '安全库存金额销售倍数 数值，默认1.5，控制安全库存为是，必填，否，非必填'"
  )
  private java.math.BigDecimal safetyStockMultiple;

  @FieldMeta(
    name = "isExeBatchPolicy",
    scene = "",
    nameCN = "执行批量政策，下单时校验商品是否符合机构商品信息批量政策，必填，选择：是、否",
    comment = "执行批量政策，下单时校验商品是否符合机构商品信息批量政策，必填，选择：是、否",
    nameEN = "is_exe_batch_policy",
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
    name = "\"is_exe_batch_policy\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '执行批量政策，下单时校验商品是否符合机构商品信息批量政策，必填，选择：是、否'"
  )
  private Integer isExeBatchPolicy;

  @FieldMeta(
    name = "isOneOrder",
    scene = "",
    nameCN = "控制每天仅下一单，必需下拉选择是否，是，仅可下一个订单，否，随意",
    comment = "控制每天仅下一单，必需下拉选择是否，是，仅可下一个订单，否，随意",
    nameEN = "is_one_order",
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
    name = "\"is_one_order\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '控制每天仅下一单，必需下拉选择是否，是，仅可下一个订单，否，随意'"
  )
  private Integer isOneOrder;

  @FieldMeta(
    name = "beginOrderTime",
    scene = "",
    nameCN = "允许下单的时段起始点",
    comment = "允许下单的时段起始点",
    nameEN = "begin_order_time",
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
  @Column(
    name = "\"begin_order_time\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "DATE   COMMENT '允许下单的时段起始点'"
  )
  @Temporal(TemporalType.TIMESTAMP)
  private java.util.Date beginOrderTime;

  @FieldMeta(
    name = "endOrderTime",
    scene = "",
    nameCN = "允许下单的时段结束点",
    comment = "允许下单的时段结束点",
    nameEN = "end_order_time",
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
  @Column(
    name = "\"end_order_time\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "DATE   COMMENT '允许下单的时段结束点'"
  )
  @Temporal(TemporalType.TIMESTAMP)
  private java.util.Date endOrderTime;

  @FieldMeta(
    name = "isCtrlReturn",
    scene = "",
    nameCN = "是否启用控制退货",
    comment = "是否启用控制退货",
    nameEN = "is_ctrl_return",
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
    name = "\"is_ctrl_return\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否启用控制退货'"
  )
  private Integer isCtrlReturn;

  @FieldMeta(
    name = "beginReturnTime",
    scene = "",
    nameCN = "可退货开始时间,如'13:00'",
    comment = "可退货开始时间,如'13:00'",
    nameEN = "begin_return_time",
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
  @Column(
    name = "\"begin_return_time\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "DATE   COMMENT '可退货开始时间,如'13:00''"
  )
  @Temporal(TemporalType.TIMESTAMP)
  private java.util.Date beginReturnTime;

  @FieldMeta(
    name = "endReturnTime",
    scene = "",
    nameCN = "可退货结束时间,如'21:00'",
    comment = "可退货结束时间,如'21:00'",
    nameEN = "end_return_time",
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
  @Column(
    name = "\"end_return_time\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "DATE   COMMENT '可退货结束时间,如'21:00''"
  )
  @Temporal(TemporalType.TIMESTAMP)
  private java.util.Date endReturnTime;

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
  @Column(
    name = "\"is_enabled\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '状态 是否有效，0:有效 >0:无效'"
  )
  private Integer isEnabled;

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
  @Column(
    name = "\"remark\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(300)   COMMENT '备注'"
  )
  private String remark;

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
  @Column(
    name = "\"ent_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '企业id'"
  )
  private Long entId;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(SalOrderControl.class, SalOrderControlDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public SalOrderControl() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static SalOrderControl toExample() {
    SalOrderControl example = new SalOrderControl();
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
    Field field = SalOrderControl.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public SalOrderControlDTO toDTO() {
    return mapper.map(this, SalOrderControlDTO.class);
  }

  public static SalOrderControl convertDTO(SalOrderControlDTO dto) {
    return mapper.map(dto, SalOrderControl.class);
  }

  public static Iterable<SalOrderControl> batchConvertDTO(Iterable<SalOrderControlDTO> dtos) {
    List<SalOrderControl> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<SalOrderControlDTO> batchConvert(Iterable<SalOrderControl> entities) {
    List<SalOrderControlDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<SalOrderControl, SalOrderControlDTO> DTO_CONVERTER =
      new Converter<SalOrderControl, SalOrderControlDTO>() {

        @Override
        public SalOrderControlDTO convert(SalOrderControl source) {
          return source.toDTO();
        }
      };
}
