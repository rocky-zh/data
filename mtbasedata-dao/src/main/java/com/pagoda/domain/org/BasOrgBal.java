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
 * 往来单位-015 结算机构明细表[注：开户行管理，不加字段，是取bas_org_bal_bank中默认的银行]实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.BasOrgBal")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`bas_org_bal`")
@org.hibernate.annotations.Table(
  appliesTo = "`bas_org_bal`",
  comment = "往来单位-015 结算机构明细表[注：开户行管理，不加字段，是取bas_org_bal_bank中默认的银行]"
)
@SQLDelete(sql = "update `bas_org_bal` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "BasOrgBal",
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
public class BasOrgBal extends BasOrgBalDTO implements Serializable {

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
    name = "orgId",
    scene = "",
    nameCN = "往来单位ID[orgid]",
    comment = "往来单位ID[orgid]",
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
    columnDefinition = "BIGINT   COMMENT '往来单位ID[orgid]'"
  )
  private Long orgId;

  @FieldMeta(
    name = "billName",
    scene = "",
    nameCN = "发票名头",
    comment = "发票名头",
    nameEN = "bill_name",
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
    name = "\"bill_name\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '发票名头'"
  )
  private String billName;

  @FieldMeta(
    name = "maxBillAmt",
    scene = "",
    nameCN = "最大开发票金额",
    comment = "最大开发票金额",
    nameEN = "max_bill_amt",
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
    name = "\"max_bill_amt\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(18,10)   COMMENT '最大开发票金额'"
  )
  private java.math.BigDecimal maxBillAmt;

  @FieldMeta(
    name = "isGoodsPrior",
    scene = "",
    nameCN = "是否货款优先(1:先算货款，然后再算税金。0:先算税金，再算货款。)二者由于尾差可能相差1分钱",
    comment = "是否货款优先(1:先算货款，然后再算税金。0:先算税金，再算货款。)二者由于尾差可能相差1分钱",
    nameEN = "is_goods_prior",
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
    name = "\"is_goods_prior\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否货款优先(1:先算货款，然后再算税金。0:先算税金，再算货款。)二者由于尾差可能相差1分钱'"
  )
  private Integer isGoodsPrior;

  @FieldMeta(
    name = "isDetailPrior",
    scene = "",
    nameCN = "是否明细优先(1:发票总货款/税金是从明细汇总,0:先算发票总货款/税金,再分摊到明细中)",
    comment = "是否明细优先(1:发票总货款/税金是从明细汇总,0:先算发票总货款/税金,再分摊到明细中)",
    nameEN = "is_detail_prior",
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
    name = "\"is_detail_prior\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '是否明细优先(1:发票总货款/税金是从明细汇总,0:先算发票总货款/税金,再分摊到明细中)'"
  )
  private Integer isDetailPrior;

  @FieldMeta(
    name = "legalPerson",
    scene = "",
    nameCN = "法人,结算时维护",
    comment = "法人,结算时维护",
    nameEN = "legal_person",
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
    name = "\"legal_person\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '法人,结算时维护'"
  )
  private String legalPerson;

  @FieldMeta(
    name = "taxNumber",
    scene = "",
    nameCN = "纳税识别号,结算时维护",
    comment = "纳税识别号,结算时维护",
    nameEN = "tax_number",
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
    name = "\"tax_number\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(60)   COMMENT '纳税识别号,结算时维护'"
  )
  private String taxNumber;

  @FieldMeta(
    name = "orgProperty",
    scene = "",
    nameCN = "机构属性{ 1:一般纳税人,2:小规模纳税人}",
    comment = "机构属性{ 1:一般纳税人,2:小规模纳税人}",
    nameEN = "org_property",
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
    name = "\"org_property\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '机构属性{ 1:一般纳税人,2:小规模纳税人}'"
  )
  private Integer orgProperty;

  @FieldMeta(
    name = "billAddress",
    scene = "",
    nameCN = "开票地址",
    comment = "开票地址",
    nameEN = "bill_address",
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
    name = "\"bill_address\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(300)   COMMENT '开票地址'"
  )
  private String billAddress;

  @FieldMeta(
    name = "billTelephone",
    scene = "",
    nameCN = "开票电话",
    comment = "开票电话",
    nameEN = "bill_telephone",
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
    name = "\"bill_telephone\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(30)   COMMENT '开票电话'"
  )
  private String billTelephone;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(BasOrgBal.class, BasOrgBalDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public BasOrgBal() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static BasOrgBal toExample() {
    BasOrgBal example = new BasOrgBal();
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
    Field field = BasOrgBal.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public BasOrgBalDTO toDTO() {
    return mapper.map(this, BasOrgBalDTO.class);
  }

  public static BasOrgBal convertDTO(BasOrgBalDTO dto) {
    return mapper.map(dto, BasOrgBal.class);
  }

  public static Iterable<BasOrgBal> batchConvertDTO(Iterable<BasOrgBalDTO> dtos) {
    List<BasOrgBal> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<BasOrgBalDTO> batchConvert(Iterable<BasOrgBal> entities) {
    List<BasOrgBalDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<BasOrgBal, BasOrgBalDTO> DTO_CONVERTER =
      new Converter<BasOrgBal, BasOrgBalDTO>() {

        @Override
        public BasOrgBalDTO convert(BasOrgBal source) {
          return source.toDTO();
        }
      };
}
