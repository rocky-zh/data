package com.pagoda.domain.org;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.org.*;

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
 * 往来单位-012 客户明细表实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.BasOrgCus")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`bas_org_cus`")
@org.hibernate.annotations.Table(appliesTo = "`bas_org_cus`", comment = "往来单位-012 客户明细表")
@SQLDelete(sql = "update `bas_org_cus` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "BasOrgCus",
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
public class BasOrgCus extends BasOrgCusDTO implements Serializable {

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
  @Column(
    name = "\"inv_limit_amt\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '库存额上限'"
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
  @Column(
    name = "\"is_inv_limit_amt\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否库存额控制'"
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
  @Column(
    name = "\"check_min_amt\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '需审核最小订单金额'"
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
  @Column(
    name = "\"is_order_check\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '订单审核'"
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
  @Column(
    name = "\"is_return_check\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '退货审核'"
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
  @Column(
    name = "\"return_deal_type\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '退货处理方式{1:返销,2:红出}'"
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
  @Column(
    name = "\"is_modify_price\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否订单可修改价格'"
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
  @Column(
    name = "\"is_modify_check\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否修改价格需审核'"
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
  @Column(
    name = "\"is_cus_inv\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否管理库存'"
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
  @Column(
    name = "\"is_allot_check\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否调拨审核'"
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
  @Column(
    name = "\"is_closed\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否停业（商城门店用）'"
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
  @Column(
    name = "\"is_order_paused\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否暂停接收订单（商城门店用）'"
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
  @Column(
    name = "\"shop_owner_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(30)   COMMENT '店长姓名'"
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
  @Column(
    name = "\"shop_owner_phone\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(30)   COMMENT '店长电话'"
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
  @Column(
    name = "\"opening_date\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "DATE   COMMENT '开业日期'"
  )
  @Temporal(TemporalType.DATE)
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
  @Column(
    name = "\"is_outer_league\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否外加盟'"
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
  @Column(
    name = "\"is_auto_rec_in\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否自动到货(1:是,0:否)'"
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
  @Column(
    name = "\"enabled_status\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '供应商可用状态{10:淘汰,20:可用,30:未激活}'"
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
  @Column(
    name = "\"sal_con_in_depot_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '默认销售到货库房ID'"
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
  @Column(
    name = "\"sal_ret_out_depot_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '默认销售退货出库库房ID'"
  )
  private Long salRetOutDepotId;

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
  @Column(
    name = "\"org_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '机构ID'"
  )
  private Long orgId;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(BasOrgCus.class, BasOrgCusDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public BasOrgCus() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static BasOrgCus toExample() {
    BasOrgCus example = new BasOrgCus();
    // example.deleted = null;
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
    Field field = BasOrgCus.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public BasOrgCusDTO toDTO() {
    return mapper.map(this, BasOrgCusDTO.class);
  }

  public static BasOrgCus convertDTO(BasOrgCusDTO dto) {
    return mapper.map(dto, BasOrgCus.class);
  }

  public static Iterable<BasOrgCus> batchConvertDTO(Iterable<BasOrgCusDTO> dtos) {
    List<BasOrgCus> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<BasOrgCusDTO> batchConvert(Iterable<BasOrgCus> entities) {
    List<BasOrgCusDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<BasOrgCus, BasOrgCusDTO> DTO_CONVERTER =
      new Converter<BasOrgCus, BasOrgCusDTO>() {

        @Override
        public BasOrgCusDTO convert(BasOrgCus source) {
          return source.toDTO();
        }
      };
}
