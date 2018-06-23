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
 * 往来单位主表实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.BasOrg")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`bas_org`")
@org.hibernate.annotations.Table(appliesTo = "`bas_org`", comment = "往来单位主表")
@SQLDelete(sql = "update `bas_org` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "BasOrg",
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
public class BasOrg extends BasOrgDTO implements Serializable {

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
    name = "balOrgName",
    scene = "",
    nameCN = "往来单位结算名称",
    comment = "往来单位结算名称",
    nameEN = "bal_org_name",
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
    name = "\"bal_org_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '往来单位结算名称'"
  )
  private String balOrgName;

  @FieldMeta(
    name = "contactPerson",
    scene = "",
    nameCN = "联系人",
    comment = "联系人",
    nameEN = "contact_person",
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
    name = "\"contact_person\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '联系人'"
  )
  private String contactPerson;

  @FieldMeta(
    name = "depCode",
    scene = "",
    nameCN = "对应部门代码",
    comment = "对应部门代码",
    nameEN = "dep_code",
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
    name = "\"dep_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '对应部门代码'"
  )
  private String depCode;

  @FieldMeta(
    name = "depId",
    scene = "",
    nameCN = "对应部门Id",
    comment = "对应部门Id",
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
    columnDefinition = "长整型   COMMENT '对应部门Id'"
  )
  private Long depId;

  @FieldMeta(
    name = "depName",
    scene = "",
    nameCN = "对应部门名称",
    comment = "对应部门名称",
    nameEN = "dep_name",
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
    name = "\"dep_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '对应部门名称'"
  )
  private String depName;

  @FieldMeta(
    name = "email",
    scene = "",
    nameCN = "邮箱",
    comment = "邮箱",
    nameEN = "email",
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
    name = "\"email\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '邮箱'"
  )
  private String email;

  @FieldMeta(
    name = "isBal",
    scene = "",
    nameCN = "是否结算单位标识",
    comment = "是否结算单位标识",
    nameEN = "is_bal",
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
    name = "\"is_bal\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '是否结算单位标识'"
  )
  private Integer isBal;

  @FieldMeta(
    name = "isCus",
    scene = "",
    nameCN = "是否客户标识",
    comment = "是否客户标识",
    nameEN = "is_cus",
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
    name = "\"is_cus\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '是否客户标识'"
  )
  private Integer isCus;

  @FieldMeta(
    name = "isDep",
    scene = "",
    nameCN = "是否部门标识",
    comment = "是否部门标识",
    nameEN = "is_dep",
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
    name = "\"is_dep\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '是否部门标识'"
  )
  private Integer isDep;

  @FieldMeta(
    name = "isOrg",
    scene = "",
    nameCN = "是否机构标识",
    comment = "是否机构标识",
    nameEN = "is_org",
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
    name = "\"is_org\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '是否机构标识'"
  )
  private Integer isOrg;

  @FieldMeta(
    name = "isOrgGroup",
    scene = "",
    nameCN = "是否虚拟机构组",
    comment = "是否虚拟机构组",
    nameEN = "is_org_group",
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
    name = "\"is_org_group\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '是否虚拟机构组'"
  )
  private Integer isOrgGroup;

  @FieldMeta(
    name = "isOut",
    scene = "",
    nameCN = "是否门店标识",
    comment = "是否门店标识",
    nameEN = "is_out",
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
    name = "\"is_out\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '是否门店标识'"
  )
  private Integer isOut;

  @FieldMeta(
    name = "isVen",
    scene = "",
    nameCN = "是否供应商标识",
    comment = "是否供应商标识",
    nameEN = "is_ven",
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
    name = "\"is_ven\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '是否供应商标识'"
  )
  private Integer isVen;

  @FieldMeta(
    name = "mobilePhone",
    scene = "",
    nameCN = "移动电话",
    comment = "移动电话",
    nameEN = "mobile_phone",
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
    name = "\"mobile_phone\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '移动电话'"
  )
  private String mobilePhone;

  @FieldMeta(
    name = "registerAddress",
    scene = "",
    nameCN = "注册地址",
    comment = "注册地址",
    nameEN = "register_address",
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
    name = "\"register_address\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '注册地址'"
  )
  private String registerAddress;

  @FieldMeta(
    name = "telephone",
    scene = "",
    nameCN = "固定电话",
    comment = "固定电话",
    nameEN = "telephone",
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
    name = "\"telephone\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '固定电话'"
  )
  private String telephone;

  @FieldMeta(
    name = "code",
    scene = "fff",
    nameCN = "代码",
    comment = "代码",
    nameEN = "code",
    type = "字符串",
    format = "ll",
    displayLen = 23,
    formSize = "",
    constraint = "ll",
    constraintParams = "{\"prefix\":\"fx_er\"}",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
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
    scale = 4,
    columnDefinition = "字符串   COMMENT '代码'"
  )
  private String code;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(BasOrg.class, BasOrgDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public BasOrg() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static BasOrg toExample() {
    BasOrg example = new BasOrg();
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
    Field field = BasOrg.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public BasOrgDTO toDTO() {
    return mapper.map(this, BasOrgDTO.class);
  }

  public static BasOrg convertDTO(BasOrgDTO dto) {
    return mapper.map(dto, BasOrg.class);
  }

  public static Iterable<BasOrg> batchConvertDTO(Iterable<BasOrgDTO> dtos) {
    List<BasOrg> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<BasOrgDTO> batchConvert(Iterable<BasOrg> entities) {
    List<BasOrgDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<BasOrg, BasOrgDTO> DTO_CONVERTER =
      new Converter<BasOrg, BasOrgDTO>() {

        @Override
        public BasOrgDTO convert(BasOrg source) {
          return source.toDTO();
        }
      };
}
