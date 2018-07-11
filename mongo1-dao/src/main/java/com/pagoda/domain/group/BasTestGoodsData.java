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
 * 商品定义实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@ValidateProperties(rulePrefix = "validator.BasTestGoodsData")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`bas_test_goods_data`")
@org.hibernate.annotations.Table(appliesTo = "`bas_test_goods_data`", comment = "商品定义")
@SQLDelete(sql = "update `bas_test_goods_data` set deleted = id where id = ?")
@Where(clause = "deleted = 0")
@EntityListeners({PagodaEntityListener.class})
@EntityFeature(
  entityName = "BasTestGoodsData",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = false,
  auditable = false,
  traceable = false,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class BasTestGoodsData extends BasTestGoodsDataDTO implements Serializable {

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

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(BasTestGoodsData.class, BasTestGoodsDataDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .exclude("pageable")
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public BasTestGoodsData() {}

  /**
   * 生成用于查询的对象，将有默认值的字段重置为null
   *
   * @return
   */
  public static BasTestGoodsData toExample() {
    BasTestGoodsData example = new BasTestGoodsData();
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
    Field field = BasTestGoodsData.class.getDeclaredField(fieldName);
    field.setAccessible(true);
    field.set(this, value);
  }

  public BasTestGoodsDataDTO toDTO() {
    return mapper.map(this, BasTestGoodsDataDTO.class);
  }

  public static BasTestGoodsData convertDTO(BasTestGoodsDataDTO dto) {
    return mapper.map(dto, BasTestGoodsData.class);
  }

  public static Iterable<BasTestGoodsData> batchConvertDTO(Iterable<BasTestGoodsDataDTO> dtos) {
    List<BasTestGoodsData> entities = new ArrayList<>();
    if (dtos != null) {
      dtos.forEach(d -> entities.add(convertDTO(d)));
    }
    return entities;
  }

  public static Iterable<BasTestGoodsDataDTO> batchConvert(Iterable<BasTestGoodsData> entities) {
    List<BasTestGoodsDataDTO> dtos = new ArrayList<>();
    if (entities != null) {
      entities.forEach(e -> dtos.add(e));
    }
    return dtos;
  }

  public static Converter<BasTestGoodsData, BasTestGoodsDataDTO> DTO_CONVERTER =
      new Converter<BasTestGoodsData, BasTestGoodsDataDTO>() {

        @Override
        public BasTestGoodsDataDTO convert(BasTestGoodsData source) {
          return source.toDTO();
        }
      };
}
