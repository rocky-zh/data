package com.pagoda.api.dto.group;

import com.pagoda.api.dto.*;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.serializer.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.lang.reflect.*;
import java.io.Serializable;
import java.util.function.*;
import java.util.*;
import io.swagger.annotations.*;
import org.springframework.data.domain.*;
import org.springframework.validation.*;

import static com.pagoda.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.api.dto.group.PersonDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.Person")
@ApiModel(value = "PersonDTO", description = "person")
@EntityFeature(
  entityName = "PersonDTO",
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
public class PersonDTO extends AbstractDTO implements Serializable {

  @FieldMeta(
    name = "id",
    nameCN = "主键id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "id", value = "主键id", dataType = "long", notes = "")
  private Long id;

  @FieldMeta(
    name = "deleted",
    nameCN = "软删除标记",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "deleted", value = "软删除标记", dataType = "long", notes = "")
  private Long deleted;

  @FieldMeta(
    name = "orderTime",
    scene = "",
    nameCN = "order_time",
    comment = "order_time",
    nameEN = "order_time",
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
  @ApiModelProperty(
    name = "orderTime",
    value = "order_time",
    dataType = "",
    notes = "5b56e35c9d2feff19b81096f"
  )
  @JSONField(serializeUsing = TimestampSerializer.class, format = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date orderTime;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<PersonDTO, Long> id_ = o -> o.getId();
    public static Function<PersonDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<PersonDTO, java.util.Date> orderTime_ = o -> o.getOrderTime();
  }

  public static ValidatorBuilder<PersonDTO> validatorExample() {
    ValidatorBuilder<PersonDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
