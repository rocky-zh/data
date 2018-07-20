package com.pagoda.test.domain.group;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.test.api.dto.group.*;

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
 * 商品定义实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.BasGoods")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`bas_goods`")
@org.hibernate.annotations.Table(appliesTo = "`bas_goods`", comment = "商品定义")
@SQLDelete(sql = "update `bas_goods` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "BasGoods",
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
public class BasGoods extends BasGoodsDTO implements Serializable {

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
    name = "code",
    scene = "",
    nameCN = "司机编码[driver_code]",
    comment = "司机编码[driver_code]",
    nameEN = "code",
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
    name = "\"code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '司机编码[driver_code]'"
  )
  private String code;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "司机姓名[driver_name]",
    comment = "司机姓名[driver_name]",
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
  @Column(
    name = "\"name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(30)   COMMENT '司机姓名[driver_name]'"
  )
  private String name;

  @FieldMeta(
    name = "shortName",
    scene = "",
    nameCN = "商品简称",
    comment = "商品简称",
    nameEN = "short_name",
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
    name = "\"short_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '商品简称'"
  )
  private String shortName;

  @FieldMeta(
    name = "traditName",
    scene = "",
    nameCN = "商品繁体名称",
    comment = "商品繁体名称",
    nameEN = "tradit_name",
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
    name = "\"tradit_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '商品繁体名称'"
  )
  private String traditName;

  @FieldMeta(
    name = "enName",
    scene = "",
    nameCN = "商品英文名称",
    comment = "商品英文名称",
    nameEN = "en_name",
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
    name = "\"en_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '商品英文名称'"
  )
  private String enName;

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
    columnDefinition = "varchar(60)   COMMENT '商品规格'"
  )
  private String goodsSpec;

  @FieldMeta(
    name = "goodsOrigin",
    scene = "",
    nameCN = "商品产地",
    comment = "商品产地",
    nameEN = "goods_origin",
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
    name = "\"goods_origin\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '商品产地'"
  )
  private String goodsOrigin;

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
  @Column(
    name = "\"goods_level\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '商品等级{1:招牌,2:珍稀,3:A,4:B,5:C}'"
  )
  private Integer goodsLevel;

  @FieldMeta(
    name = "goodsType",
    scene = "",
    nameCN = "商品类型{可选值集数据字典}",
    comment = "商品类型{可选值集数据字典}",
    nameEN = "goods_type",
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
    name = "\"goods_type\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '商品类型{可选值集数据字典}'"
  )
  private Integer goodsType;

  @FieldMeta(
    name = "searchWord",
    scene = "",
    nameCN = "搜索关键词(存储名称首字母)",
    comment = "搜索关键词(存储名称首字母)",
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
  @Column(
    name = "\"search_word\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '搜索关键词(存储名称首字母)'"
  )
  private String searchWord;

  @FieldMeta(
    name = "mnemWord",
    scene = "",
    nameCN = "助记词",
    comment = "助记词",
    nameEN = "mnem_word",
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
    name = "\"mnem_word\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '助记词'"
  )
  private String mnemWord;

  @FieldMeta(
    name = "basUnitId",
    scene = "",
    nameCN = "基本单位ID(即最小单位)",
    comment = "基本单位ID(即最小单位)",
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
    columnDefinition = "BIGINT   COMMENT '基本单位ID(即最小单位)'"
  )
  private Long basUnitId;

  @FieldMeta(
    name = "basUnitCode",
    scene = "",
    nameCN = "基本单位代码[冗余]",
    comment = "基本单位代码[冗余]",
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
    columnDefinition = "varchar(35)   COMMENT '基本单位代码[冗余]'"
  )
  private String basUnitCode;

  @FieldMeta(
    name = "basUnitName",
    scene = "",
    nameCN = "基本单位名称[冗余]",
    comment = "基本单位名称[冗余]",
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
    columnDefinition = "varchar(60)   COMMENT '基本单位名称[冗余]'"
  )
  private String basUnitName;

  @FieldMeta(
    name = "invUnitId",
    scene = "",
    nameCN = "库存单位ID",
    comment = "库存单位ID",
    nameEN = "inv_unit_id",
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
    name = "\"inv_unit_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '库存单位ID'"
  )
  private Long invUnitId;

  @FieldMeta(
    name = "invUnitName",
    scene = "",
    nameCN = "库存单位名称[冗余]",
    comment = "库存单位名称[冗余]",
    nameEN = "inv_unit_name",
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
    name = "\"inv_unit_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '库存单位名称[冗余]'"
  )
  private String invUnitName;

  @FieldMeta(
    name = "invUnitCode",
    scene = "",
    nameCN = "库存单位代码[冗余]",
    comment = "库存单位代码[冗余]",
    nameEN = "inv_unit_code",
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
    name = "\"inv_unit_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '库存单位代码[冗余]'"
  )
  private String invUnitCode;

  @FieldMeta(
    name = "invRate",
    scene = "",
    nameCN = "库存单位转换比(库存单位转为基础单位转换比)",
    comment = "库存单位转换比(库存单位转为基础单位转换比)",
    nameEN = "inv_rate",
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
    name = "\"inv_rate\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(10,10)   COMMENT '库存单位转换比(库存单位转为基础单位转换比)'"
  )
  private java.math.BigDecimal invRate;

  @FieldMeta(
    name = "salUnitId",
    scene = "",
    nameCN = "销售单位ID",
    comment = "销售单位ID",
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
    columnDefinition = "BIGINT   COMMENT '销售单位ID'"
  )
  private Long salUnitId;

  @FieldMeta(
    name = "salUnitCode",
    scene = "",
    nameCN = "销售单位代码[冗余]",
    comment = "销售单位代码[冗余]",
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
    columnDefinition = "varchar(35)   COMMENT '销售单位代码[冗余]'"
  )
  private String salUnitCode;

  @FieldMeta(
    name = "salUnitName",
    scene = "",
    nameCN = "销售单位名称[冗余]",
    comment = "销售单位名称[冗余]",
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
    columnDefinition = "varchar(60)   COMMENT '销售单位名称[冗余]'"
  )
  private String salUnitName;

  @FieldMeta(
    name = "salRate",
    scene = "",
    nameCN = "销售单位转换比(销售单位转为基础单位转换比)",
    comment = "销售单位转换比(销售单位转为基础单位转换比)",
    nameEN = "sal_rate",
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
    name = "\"sal_rate\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(10,10)   COMMENT '销售单位转换比(销售单位转为基础单位转换比)'"
  )
  private java.math.BigDecimal salRate;

  @FieldMeta(
    name = "purUnitId",
    scene = "",
    nameCN = "采购单位ID",
    comment = "采购单位ID",
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
    columnDefinition = "BIGINT   COMMENT '采购单位ID'"
  )
  private Long purUnitId;

  @FieldMeta(
    name = "purUnitCode",
    scene = "",
    nameCN = "采购单位代码[冗余]",
    comment = "采购单位代码[冗余]",
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
    columnDefinition = "varchar(35)   COMMENT '采购单位代码[冗余]'"
  )
  private String purUnitCode;

  @FieldMeta(
    name = "purUnitName",
    scene = "",
    nameCN = "采购单位名称[冗余]",
    comment = "采购单位名称[冗余]",
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
    columnDefinition = "varchar(60)   COMMENT '采购单位名称[冗余]'"
  )
  private String purUnitName;

  @FieldMeta(
    name = "purRate",
    scene = "",
    nameCN = "采购单位转换比(采购单位转为基础单位转换比)",
    comment = "采购单位转换比(采购单位转为基础单位转换比)",
    nameEN = "pur_rate",
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
    name = "\"pur_rate\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(10,10)   COMMENT '采购单位转换比(采购单位转为基础单位转换比)'"
  )
  private java.math.BigDecimal purRate;

  @FieldMeta(
    name = "retUnitId",
    scene = "",
    nameCN = "零售单位ID",
    comment = "零售单位ID",
    nameEN = "ret_unit_id",
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
    name = "\"ret_unit_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '零售单位ID'"
  )
  private Long retUnitId;

  @FieldMeta(
    name = "retUnitCode",
    scene = "",
    nameCN = "零售单位代码[冗余]",
    comment = "零售单位代码[冗余]",
    nameEN = "ret_unit_code",
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
    name = "\"ret_unit_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '零售单位代码[冗余]'"
  )
  private String retUnitCode;

  @FieldMeta(
    name = "retUnitName",
    scene = "",
    nameCN = "零售单位名称[冗余]",
    comment = "零售单位名称[冗余]",
    nameEN = "ret_unit_name",
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
    name = "\"ret_unit_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '零售单位名称[冗余]'"
  )
  private String retUnitName;

  @FieldMeta(
    name = "retRate",
    scene = "",
    nameCN = "零售单位转换比(零售单位转为基础单位转换比)",
    comment = "零售单位转换比(零售单位转为基础单位转换比)",
    nameEN = "ret_rate",
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
    name = "\"ret_rate\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(10,10)   COMMENT '零售单位转换比(零售单位转为基础单位转换比)'"
  )
  private java.math.BigDecimal retRate;

  @FieldMeta(
    name = "unitVolume",
    scene = "",
    nameCN = "基础单位体积,填入的体积单位为L,用于运输使用",
    comment = "基础单位体积,填入的体积单位为L,用于运输使用",
    nameEN = "unit_volume",
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
    name = "\"unit_volume\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '基础单位体积,填入的体积单位为L,用于运输使用'"
  )
  private java.math.BigDecimal unitVolume;

  @FieldMeta(
    name = "unitWeight",
    scene = "",
    nameCN = "基础单位重量,填入的重量单位为KG,用于运输使用",
    comment = "基础单位重量,填入的重量单位为KG,用于运输使用",
    nameEN = "unit_weight",
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
    name = "\"unit_weight\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '基础单位重量,填入的重量单位为KG,用于运输使用'"
  )
  private java.math.BigDecimal unitWeight;

  @FieldMeta(
    name = "barcode",
    scene = "",
    nameCN = "条码(1对1条码，多对多条码在bas_productvar_barcode表中)",
    comment = "条码(1对1条码，多对多条码在bas_productvar_barcode表中)",
    nameEN = "barcode",
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
    name = "\"barcode\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(30)   COMMENT '条码(1对1条码，多对多条码在bas_productvar_barcode表中)'"
  )
  private String barcode;

  @FieldMeta(
    name = "taxRate",
    scene = "",
    nameCN = "企业级销项税率",
    comment = "企业级销项税率",
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
    scale = 6,
    columnDefinition = "decimal(10,10)   COMMENT '企业级销项税率'"
  )
  private java.math.BigDecimal taxRate;

  @FieldMeta(
    name = "isEntLot",
    scene = "",
    nameCN = "是否管理批次(企业级)",
    comment = "是否管理批次(企业级)",
    nameEN = "is_ent_lot",
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
    name = "\"is_ent_lot\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否管理批次(企业级)'"
  )
  private Integer isEntLot;

  @FieldMeta(
    name = "shelfLifeType",
    scene = "",
    nameCN = "保质期类型{0:无,1:天,2:月,3:年}",
    comment = "保质期类型{0:无,1:天,2:月,3:年}",
    nameEN = "shelf_life_type",
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
    name = "\"shelf_life_type\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '保质期类型{0:无,1:天,2:月,3:年}'"
  )
  private Integer shelfLifeType;

  @FieldMeta(
    name = "shelfLifeQty",
    scene = "",
    nameCN = "保质期数量",
    comment = "保质期数量",
    nameEN = "shelf_life_qty",
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
    name = "\"shelf_life_qty\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '保质期数量'"
  )
  private java.math.BigDecimal shelfLifeQty;

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
  @Column(
    name = "\"is_enabled\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否可用'"
  )
  private Integer isEnabled;

  @FieldMeta(
    name = "isPur",
    scene = "",
    nameCN = "是否可采购",
    comment = "是否可采购",
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
  @Column(
    name = "\"is_pur\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否可采购'"
  )
  private Integer isPur;

  @FieldMeta(
    name = "isSale",
    scene = "",
    nameCN = "是否可销售(百果园销售给门店)",
    comment = "是否可销售(百果园销售给门店)",
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
  @Column(
    name = "\"is_sale\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否可销售(百果园销售给门店)'"
  )
  private Integer isSale;

  @FieldMeta(
    name = "isRet",
    scene = "",
    nameCN = "是否可零售(门店销售给会员)",
    comment = "是否可零售(门店销售给会员)",
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
  @Column(
    name = "\"is_ret\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否可零售(门店销售给会员)'"
  )
  private Integer isRet;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(BasGoods.class, BasGoodsDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public BasGoods() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static BasGoods toExample() {
    BasGoods example = new BasGoods();
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
    Field field = BasGoods.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public BasGoodsDTO toDTO() {
    return mapper.map(this, BasGoodsDTO.class);
  }

  public static BasGoods convertDTO(BasGoodsDTO dto) {
    return mapper.map(dto, BasGoods.class);
  }

  public static Iterable<BasGoods> batchConvertDTO(Iterable<BasGoodsDTO> dtos) {
    List<BasGoods> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<BasGoodsDTO> batchConvert(Iterable<BasGoods> entities) {
    List<BasGoodsDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<BasGoods, BasGoodsDTO> DTO_CONVERTER =
      new Converter<BasGoods, BasGoodsDTO>() {

        @Override
        public BasGoodsDTO convert(BasGoods source) {
          return source.toDTO();
        }
      };
}
