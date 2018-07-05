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
 * 岗位表 实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.BasPost")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`bas_post`")
@org.hibernate.annotations.Table(appliesTo = "`bas_post`", comment = "岗位表  ")
@SQLDelete(sql = "update `bas_post` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "BasPost",
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
public class BasPost extends BasPostDTO implements Serializable {

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
    name = "postLeader",
    scene = "",
    nameCN = "岗位领导{存员工表的id}",
    comment = "岗位领导{存员工表的id}",
    nameEN = "post_leader",
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
    name = "\"post_leader\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '岗位领导{存员工表的id}'"
  )
  private Long postLeader;

  @FieldMeta(
    name = "isBusRelated",
    scene = "",
    nameCN = "是否业务相关(0:否,1:是)",
    comment = "是否业务相关(0:否,1:是)",
    nameEN = "is_bus_related",
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
    name = "\"is_bus_related\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否业务相关(0:否,1:是)'"
  )
  private Integer isBusRelated;

  @FieldMeta(
    name = "remak",
    scene = "",
    nameCN = "备注",
    comment = "备注",
    nameEN = "remak",
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
    name = "\"remak\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(300)   COMMENT '备注'"
  )
  private String remak;

  @FieldMeta(
    name = "code",
    scene = "",
    nameCN = "行政单位代码",
    comment = "行政单位代码",
    nameEN = "code",
    type = "字符串",
    format = "",
    displayLen = 32,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
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
    columnDefinition = "varchar(35)   COMMENT '行政单位代码'"
  )
  private String code;

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
    name = "entId",
    scene = "",
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

  @FieldMeta(
    name = "depId",
    scene = "",
    nameCN = "部门ID ",
    comment = "部门ID ",
    nameEN = "dep_id",
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
    name = "\"dep_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '部门ID '"
  )
  private Long depId;

  @FieldMeta(
    name = "showOrder",
    scene = "",
    nameCN = "排序",
    comment = "排序",
    nameEN = "show_order",
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
    name = "\"show_order\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '排序'"
  )
  private Integer showOrder;

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

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(BasPost.class, BasPostDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public BasPost() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static BasPost toExample() {
    BasPost example = new BasPost();
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
    Field field = BasPost.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public BasPostDTO toDTO() {
    return mapper.map(this, BasPostDTO.class);
  }

  public static BasPost convertDTO(BasPostDTO dto) {
    return mapper.map(dto, BasPost.class);
  }

  public static Iterable<BasPost> batchConvertDTO(Iterable<BasPostDTO> dtos) {
    List<BasPost> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<BasPostDTO> batchConvert(Iterable<BasPost> entities) {
    List<BasPostDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<BasPost, BasPostDTO> DTO_CONVERTER =
      new Converter<BasPost, BasPostDTO>() {

        @Override
        public BasPostDTO convert(BasPost source) {
          return source.toDTO();
        }
      };
}
