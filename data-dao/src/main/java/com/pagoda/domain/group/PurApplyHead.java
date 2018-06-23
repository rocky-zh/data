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
 * 采购请购单表头实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.PurApplyHead")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`pur_apply_head`")
@org.hibernate.annotations.Table(appliesTo = "`pur_apply_head`", comment = "采购请购单表头")
@SQLDelete(sql = "update `pur_apply_head` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "PurApplyHead",
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
public class PurApplyHead extends PurApplyHeadDTO implements Serializable {

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
    name = "applyNo",
    scene = "",
    nameCN = "请购单号码",
    comment = "请购单号码",
    nameEN = "apply_no",
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
    name = "\"apply_no\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '请购单号码'"
  )
  private String applyNo;

  @FieldMeta(
    name = "applyOrgCode",
    scene = "",
    nameCN = "申请机构代码",
    comment = "申请机构代码",
    nameEN = "apply_org_code",
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
    name = "\"apply_org_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '申请机构代码'"
  )
  private String applyOrgCode;

  @FieldMeta(
    name = "applyOrgId",
    scene = "",
    nameCN = "申请机构Id",
    comment = "申请机构Id",
    nameEN = "apply_org_id",
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
    name = "\"apply_org_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '申请机构Id'"
  )
  private Integer applyOrgId;

  @FieldMeta(
    name = "applyOrgName",
    scene = "",
    nameCN = "申请机构名称",
    comment = "申请机构名称",
    nameEN = "apply_org_name",
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
    name = "\"apply_org_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '申请机构名称'"
  )
  private String applyOrgName;

  @FieldMeta(
    name = "applyStatus",
    scene = "",
    nameCN = " 申请状态",
    comment = " 申请状态",
    nameEN = "apply_status",
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
    name = "\"apply_status\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT ' 申请状态'"
  )
  private Integer applyStatus;

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
    name = "calType",
    scene = "",
    nameCN = "计算方式",
    comment = "计算方式",
    nameEN = "cal_type",
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
    name = "\"cal_type\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '计算方式'"
  )
  private Integer calType;

  @FieldMeta(
    name = "checkUserCode",
    scene = "",
    nameCN = "审核用户代码",
    comment = "审核用户代码",
    nameEN = "check_user_code",
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
    name = "\"check_user_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '审核用户代码'"
  )
  private String checkUserCode;

  @FieldMeta(
    name = "checkUserId",
    scene = "",
    nameCN = "审核用户ID",
    comment = "审核用户ID",
    nameEN = "check_user_id",
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
    name = "\"check_user_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '审核用户ID'"
  )
  private Integer checkUserId;

  @FieldMeta(
    name = "checkUserName",
    scene = "",
    nameCN = "审核用户名称",
    comment = "审核用户名称",
    nameEN = "check_user_name",
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
    name = "\"check_user_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '审核用户名称'"
  )
  private String checkUserName;

  @FieldMeta(
    name = "checkdatetime",
    scene = "",
    nameCN = "审核时间",
    comment = "审核时间",
    nameEN = "checkdatetime",
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
    name = "\"checkdatetime\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "时间   COMMENT '审核时间'"
  )
  private java.sql.Timestamp checkdatetime;

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
    name = "planRecDate",
    scene = "",
    nameCN = "应到货日期",
    comment = "应到货日期",
    nameEN = "plan_rec_date",
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
    name = "\"plan_rec_date\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "时间   COMMENT '应到货日期'"
  )
  private java.sql.Timestamp planRecDate;

  @FieldMeta(
    name = "recOrgCode",
    scene = "",
    nameCN = "到货机构代码",
    comment = "到货机构代码",
    nameEN = "rec_org_code",
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
    name = "\"rec_org_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '到货机构代码'"
  )
  private String recOrgCode;

  @FieldMeta(
    name = "recOrgId",
    scene = "",
    nameCN = "到货机构Id",
    comment = "到货机构Id",
    nameEN = "rec_org_id",
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
    name = "\"rec_org_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '到货机构Id'"
  )
  private Integer recOrgId;

  @FieldMeta(
    name = "recOrgName",
    scene = "",
    nameCN = "到货机构名称",
    comment = "到货机构名称",
    nameEN = "rec_org_name",
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
    name = "\"rec_org_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "字符串   COMMENT '到货机构名称'"
  )
  private String recOrgName;

  @FieldMeta(
    name = "sourceType",
    scene = "",
    nameCN = "数据类型",
    comment = "数据类型",
    nameEN = "source_type",
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
    name = "\"source_type\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "整型   COMMENT '数据类型'"
  )
  private Integer sourceType;

  @FieldMeta(
    name = "active",
    scene = "a",
    nameCN = "是否当前版本",
    comment = "是否当前版本",
    nameEN = "active",
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
    name = "\"active\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "布尔   COMMENT '是否当前版本'"
  )
  private Boolean active;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(PurApplyHead.class, PurApplyHeadDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public PurApplyHead() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static PurApplyHead toExample() {
    PurApplyHead example = new PurApplyHead();
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
    Field field = PurApplyHead.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public PurApplyHeadDTO toDTO() {
    return mapper.map(this, PurApplyHeadDTO.class);
  }

  public static PurApplyHead convertDTO(PurApplyHeadDTO dto) {
    return mapper.map(dto, PurApplyHead.class);
  }

  public static Iterable<PurApplyHead> batchConvertDTO(Iterable<PurApplyHeadDTO> dtos) {
    List<PurApplyHead> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<PurApplyHeadDTO> batchConvert(Iterable<PurApplyHead> entities) {
    List<PurApplyHeadDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<PurApplyHead, PurApplyHeadDTO> DTO_CONVERTER =
      new Converter<PurApplyHead, PurApplyHeadDTO>() {

        @Override
        public PurApplyHeadDTO convert(PurApplyHead source) {
          return source.toDTO();
        }
      };
}
