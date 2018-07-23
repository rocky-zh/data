package com.pagoda.domain.purapply;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.purapply.*;

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
 * 采购请购单头表实体定义
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
@org.hibernate.annotations.Table(appliesTo = "`pur_apply_head`", comment = "采购请购单头表")
@SQLDelete(sql = "update `pur_apply_head` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "PurApplyHead",
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
    name = "seqno",
    scene = "",
    nameCN = "请购单号码",
    comment = "请购单号码",
    nameEN = "seqno",
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
    name = "\"seqno\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '请购单号码'"
  )
  private String seqno;

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
    name = "sourceType",
    scene = "",
    nameCN = "数据来源{1:手工录入,2:补货汇总生成}",
    comment = "数据来源{1:手工录入,2:补货汇总生成}",
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
    columnDefinition = "INTEGER   COMMENT '数据来源{1:手工录入,2:补货汇总生成}'"
  )
  private Integer sourceType;

  @FieldMeta(
    name = "applyOrgId",
    scene = "",
    nameCN = "申请机构ID",
    comment = "申请机构ID",
    nameEN = "apply_org_id",
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
    name = "\"apply_org_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '申请机构ID'"
  )
  private Long applyOrgId;

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
    columnDefinition = "varchar(35)   COMMENT '申请机构代码'"
  )
  private String applyOrgCode;

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
    columnDefinition = "varchar(60)   COMMENT '申请机构名称'"
  )
  private String applyOrgName;

  @FieldMeta(
    name = "arrOrgId",
    scene = "",
    nameCN = "到货机构ID",
    comment = "到货机构ID",
    nameEN = "arr_org_id",
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
    name = "\"arr_org_id\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "BIGINT   COMMENT '到货机构ID'"
  )
  private Long arrOrgId;

  @FieldMeta(
    name = "arrOrgCode",
    scene = "",
    nameCN = "到货机构代码",
    comment = "到货机构代码",
    nameEN = "arr_org_code",
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
    name = "\"arr_org_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '到货机构代码'"
  )
  private String arrOrgCode;

  @FieldMeta(
    name = "arrOrgName",
    scene = "",
    nameCN = "到货机构名称",
    comment = "到货机构名称",
    nameEN = "arr_org_name",
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
    name = "\"arr_org_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '到货机构名称'"
  )
  private String arrOrgName;

  @FieldMeta(
    name = "planRecDate",
    scene = "",
    nameCN = "应到货日期",
    comment = "应到货日期",
    nameEN = "plan_rec_date",
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
    name = "\"plan_rec_date\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "DATE   COMMENT '应到货日期'"
  )
  @Temporal(TemporalType.DATE)
  private java.util.Date planRecDate;

  @FieldMeta(
    name = "auditorCode",
    scene = "",
    nameCN = "审核人代码",
    comment = "审核人代码",
    nameEN = "auditor_code",
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
    name = "\"auditor_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '审核人代码'"
  )
  private String auditorCode;

  @FieldMeta(
    name = "auditorName",
    scene = "",
    nameCN = "审核人姓名",
    comment = "审核人姓名",
    nameEN = "auditor_name",
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
    name = "\"auditor_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '审核人姓名'"
  )
  private String auditorName;

  @FieldMeta(
    name = "auditTime",
    scene = "",
    nameCN = "审核时间",
    comment = "审核时间",
    nameEN = "audit_time",
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
    name = "\"audit_time\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "DATE   COMMENT '审核时间'"
  )
  @Temporal(TemporalType.TIMESTAMP)
  private java.util.Date auditTime;

  @FieldMeta(
    name = "applyStatus",
    scene = "",
    nameCN =
        "申请状态{10:未提交，20:待审核，30:请购完成(审核通过)，40:已作废 50-已拒绝}rn            20待审核，提交人不可编辑，采购经理审核时可操作修改数量；rn            30请购完成，审核通过的请购单可以被采购订单和内部调拨单新增时查到，并可进行后续采购与调拨业务，流程结束;；rn            40已作废，审核不通过的请购单视为无效请购单，流程结束。rn            }",
    comment =
        "申请状态{10:未提交，20:待审核，30:请购完成(审核通过)，40:已作废 50-已拒绝}rn            20待审核，提交人不可编辑，采购经理审核时可操作修改数量；rn            30请购完成，审核通过的请购单可以被采购订单和内部调拨单新增时查到，并可进行后续采购与调拨业务，流程结束;；rn            40已作废，审核不通过的请购单视为无效请购单，流程结束。rn            }",
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
    columnDefinition =
        "INTEGER   COMMENT '申请状态{10:未提交，20:待审核，30:请购完成(审核通过)，40:已作废 50-已拒绝}rn            20待审核，提交人不可编辑，采购经理审核时可操作修改数量；rn            30请购完成，审核通过的请购单可以被采购订单和内部调拨单新增时查到，并可进行后续采购与调拨业务，流程结束;；rn            40已作废，审核不通过的请购单视为无效请购单，流程结束。rn            }'"
  )
  private Integer applyStatus;

  @FieldMeta(
    name = "calType",
    scene = "",
    nameCN = "计算方式[数据来源=2时使用]{1:按门店订货,2:按门店销量}",
    comment = "计算方式[数据来源=2时使用]{1:按门店订货,2:按门店销量}",
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
    columnDefinition = "INTEGER   COMMENT '计算方式[数据来源=2时使用]{1:按门店订货,2:按门店销量}'"
  )
  private Integer calType;

  @FieldMeta(
    name = "calPurRate",
    scene = "",
    nameCN = "计算采购系数[数据来源=2时使用]",
    comment = "计算采购系数[数据来源=2时使用]",
    nameEN = "cal_pur_rate",
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
    name = "\"cal_pur_rate\"",
    nullable = true,
    precision = 0,
    scale = 4,
    columnDefinition = "decimal(10,10)   COMMENT '计算采购系数[数据来源=2时使用]'"
  )
  private java.math.BigDecimal calPurRate;

  @FieldMeta(
    name = "bpmnStatus",
    scene = "",
    nameCN = "流程引擎审核状态",
    comment = "流程引擎审核状态",
    nameEN = "bpmn_status",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
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
    name = "\"bpmn_status\"",
    nullable = false,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER  NOT NULL   COMMENT '流程引擎审核状态'"
  )
  private Integer bpmnStatus;

  @FieldMeta(
    name = "bpmnRemark",
    scene = "",
    nameCN = "流程引擎审核备注",
    comment = "流程引擎审核备注",
    nameEN = "bpmn_remark",
    type = "字符串",
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
    name = "\"bpmn_remark\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(300)   COMMENT '流程引擎审核备注'"
  )
  private String bpmnRemark;

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
