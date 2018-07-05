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
 * bas_district实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.BasDistrict")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`bas_district`")
@org.hibernate.annotations.Table(appliesTo = "`bas_district`", comment = "bas_district")
@SQLDelete(sql = "update `bas_district` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "BasDistrict",
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
public class BasDistrict extends BasDistrictDTO implements Serializable {

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
    name = "districtLevel",
    scene = "",
    nameCN = "行政级别(0-国家，10-省，直辖市，20-地级市，30-县级市)",
    comment = "行政级别(0-国家，10-省，直辖市，20-地级市，30-县级市)",
    nameEN = "district_level",
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
    name = "\"district_level\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "INTEGER   COMMENT '行政级别(0-国家，10-省，直辖市，20-地级市，30-县级市)'"
  )
  private Integer districtLevel;

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
    name = "parentCode",
    scene = "",
    nameCN = "上级行政单位代码",
    comment = "上级行政单位代码",
    nameEN = "parent_code",
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
    name = "\"parent_code\"",
    nullable = true,
    precision = 0,
    scale = 0,
    columnDefinition = "varchar(35)   COMMENT '上级行政单位代码'"
  )
  private String parentCode;

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
    name = "adLat",
    scene = "",
    nameCN = "高德地址纬度",
    comment = "高德地址纬度",
    nameEN = "ad_lat",
    type = "小数",
    format = "",
    displayLen = 10,
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
    name = "\"ad_lat\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(10,10)   COMMENT '高德地址纬度'"
  )
  private java.math.BigDecimal adLat;

  @FieldMeta(
    name = "adLng",
    scene = "",
    nameCN = "高德地址经度",
    comment = "高德地址经度",
    nameEN = "ad_lng",
    type = "小数",
    format = "",
    displayLen = 10,
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
    name = "\"ad_lng\"",
    nullable = true,
    precision = 0,
    scale = 6,
    columnDefinition = "decimal(10,10)   COMMENT '高德地址经度'"
  )
  private java.math.BigDecimal adLng;

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(BasDistrict.class, BasDistrictDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public BasDistrict() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static BasDistrict toExample() {
    BasDistrict example = new BasDistrict();
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
    Field field = BasDistrict.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public BasDistrictDTO toDTO() {
    return mapper.map(this, BasDistrictDTO.class);
  }

  public static BasDistrict convertDTO(BasDistrictDTO dto) {
    return mapper.map(dto, BasDistrict.class);
  }

  public static Iterable<BasDistrict> batchConvertDTO(Iterable<BasDistrictDTO> dtos) {
    List<BasDistrict> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<BasDistrictDTO> batchConvert(Iterable<BasDistrict> entities) {
    List<BasDistrictDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<BasDistrict, BasDistrictDTO> DTO_CONVERTER =
      new Converter<BasDistrict, BasDistrictDTO>() {

        @Override
        public BasDistrictDTO convert(BasDistrict source) {
          return source.toDTO();
        }
      };
}
