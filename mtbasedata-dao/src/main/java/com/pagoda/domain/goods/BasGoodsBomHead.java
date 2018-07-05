package com.pagoda.domain.goods;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.goods.*;

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
 * BOM商品定义主表实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.BasGoodsBomHead")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`bas_goods_bom_head`")
@org.hibernate.annotations.Table(appliesTo = "`bas_goods_bom_head`", comment = "BOM商品定义主表")
@SQLDelete(sql = "update `bas_goods_bom_head` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "BasGoodsBomHead",
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
public class BasGoodsBomHead extends BasGoodsBomHeadDTO implements Serializable {

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
    name = "inDepotId",
    scene = "",
    nameCN = "入库库房ID(产成商品入库)",
    comment = "入库库房ID(产成商品入库)",
    nameEN = "in_depot_id",
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
    name = "\"in_depot_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '入库库房ID(产成商品入库)'"
  )
  private Long inDepotId;

  @FieldMeta(
    name = "inDepotName",
    scene = "",
    nameCN = "入库库房名称[冗余]",
    comment = "入库库房名称[冗余]",
    nameEN = "in_depot_name",
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
    name = "\"in_depot_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '入库库房名称[冗余]'"
  )
  private String inDepotName;

  @FieldMeta(
    name = "name",
    scene = "",
    nameCN = "产成商品名",
    comment = "产成商品名",
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
    columnDefinition = "varchar(60)   COMMENT '产成商品名'"
  )
  private String name;

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
    name = "unitId",
    scene = "price",
    nameCN = "单位ID",
    comment = "单位ID",
    nameEN = "unit_id",
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
    name = "\"unit_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '单位ID'"
  )
  private Long unitId;

  @FieldMeta(
    name = "unitCode",
    scene = "price",
    nameCN = "单位代码",
    comment = "单位代码",
    nameEN = "unit_code",
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
    name = "\"unit_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '单位代码'"
  )
  private String unitCode;

  @FieldMeta(
    name = "unitName",
    scene = "price",
    nameCN = "单位名称",
    comment = "单位名称",
    nameEN = "unit_name",
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
    name = "\"unit_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '单位名称'"
  )
  private String unitName;

  @FieldMeta(
    name = "orgOrgId",
    scene = "",
    nameCN = "机构ID ",
    comment = "机构ID ",
    nameEN = "org_org_id",
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
    name = "\"org_org_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '机构ID '"
  )
  private Long orgOrgId;

  @FieldMeta(
    name = "orgOrgCode",
    scene = "",
    nameCN = "机构代码[冗余]",
    comment = "机构代码[冗余]",
    nameEN = "org_org_code",
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
    name = "\"org_org_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '机构代码[冗余]'"
  )
  private String orgOrgCode;

  @FieldMeta(
    name = "orgOrgName",
    scene = "",
    nameCN = "机构名称[冗余]",
    comment = "机构名称[冗余]",
    nameEN = "org_org_name",
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
    name = "\"org_org_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '机构名称[冗余]'"
  )
  private String orgOrgName;

  @FieldMeta(
    name = "goodsProcId",
    scene = "",
    nameCN = "工艺版本ID[goods_proc_id]",
    comment = "工艺版本ID[goods_proc_id]",
    nameEN = "goods_proc_id",
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
    name = "\"goods_proc_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '工艺版本ID[goods_proc_id]'"
  )
  private Long goodsProcId;

  @FieldMeta(
    name = "goodsProcCode",
    scene = "",
    nameCN = "工艺版本代码[冗余]",
    comment = "工艺版本代码[冗余]",
    nameEN = "goods_proc_code",
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
    name = "\"goods_proc_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '工艺版本代码[冗余]'"
  )
  private String goodsProcCode;

  @FieldMeta(
    name = "goodsProcName",
    scene = "",
    nameCN = "工艺版本名称[冗余]",
    comment = "工艺版本名称[冗余]",
    nameEN = "goods_proc_name",
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
    name = "\"goods_proc_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '工艺版本名称[冗余]'"
  )
  private String goodsProcName;

  @FieldMeta(
    name = "isEnabled",
    scene = "",
    nameCN = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
    comment = "是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]",
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
    columnDefinition = "INTEGER   COMMENT '是否可用[设置为不可用，需要把bas_org_productvar 下也设置为不可用]'"
  )
  private Integer isEnabled;

  @FieldMeta(
    name = "isDefault",
    scene = "",
    nameCN = "是否主商品",
    comment = "是否主商品",
    nameEN = "is_default",
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
    name = "\"is_default\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否主商品'"
  )
  private Integer isDefault;

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
        .classMap(BasGoodsBomHead.class, BasGoodsBomHeadDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public BasGoodsBomHead() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static BasGoodsBomHead toExample() {
    BasGoodsBomHead example = new BasGoodsBomHead();
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
    Field field = BasGoodsBomHead.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public BasGoodsBomHeadDTO toDTO() {
    return mapper.map(this, BasGoodsBomHeadDTO.class);
  }

  public static BasGoodsBomHead convertDTO(BasGoodsBomHeadDTO dto) {
    return mapper.map(dto, BasGoodsBomHead.class);
  }

  public static Iterable<BasGoodsBomHead> batchConvertDTO(Iterable<BasGoodsBomHeadDTO> dtos) {
    List<BasGoodsBomHead> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<BasGoodsBomHeadDTO> batchConvert(Iterable<BasGoodsBomHead> entities) {
    List<BasGoodsBomHeadDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<BasGoodsBomHead, BasGoodsBomHeadDTO> DTO_CONVERTER =
      new Converter<BasGoodsBomHead, BasGoodsBomHeadDTO>() {

        @Override
        public BasGoodsBomHeadDTO convert(BasGoodsBomHead source) {
          return source.toDTO();
        }
      };
}
