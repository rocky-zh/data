package com.pagoda.test.api.dto.timegroup;

import com.pagoda.test.api.dto.*;
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

import static com.pagoda.test.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.test.api.dto.timegroup.PersonDTO.Getters.*;

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
    name = "zid",
    scene = "",
    nameCN = "zid",
    comment = "zid",
    nameEN = "zid",
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
  @ApiModelProperty(name = "zid", value = "zid", dataType = "", notes = "5b61188569ea4c0001be1526")
  private Long zid;

  @FieldMeta(
    name = "tid",
    scene = "",
    nameCN = "tid",
    comment = "tid",
    nameEN = "tid",
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
  @ApiModelProperty(name = "tid", value = "tid", dataType = "", notes = "5b61188569ea4c0001be1528")
  private Long tid;

  @FieldMeta(
    name = "loginDateTime",
    scene = "",
    nameCN = "login_date_time",
    comment = "login_date_time",
    nameEN = "login_date_time",
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
    name = "loginDateTime",
    value = "login_date_time",
    dataType = "",
    notes = "5b61188569ea4c0001be152a"
  )
  @JSONField(serializeUsing = TimestampSerializer.class, format = "yyyy-MM-dd HH:mm:ss")
  private java.util.Date loginDateTime;

  @FieldMeta(
    name = "orderDate",
    scene = "",
    nameCN = "order_date",
    comment = "order_date",
    nameEN = "order_date",
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
  @ApiModelProperty(
    name = "orderDate",
    value = "order_date",
    dataType = "",
    notes = "5b61188569ea4c0001be152c"
  )
  private java.util.Date orderDate;

  @FieldMeta(
    name = "orderTime",
    scene = "订单时间",
    nameCN = "order_time",
    comment = "order_time",
    nameEN = "order_time",
    type = "时分秒",
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
    notes = "5b52f84722e0fe00011658e6"
  )
  @JSONField(serializeUsing = TimeSerializer.class, format = "HH:mm:ss")
  private java.util.Date orderTime;

  @FieldMeta(
    name = "logoutTime",
    scene = "",
    nameCN = "退出时间",
    comment = "退出时间",
    nameEN = "logout_time",
    type = "时分秒",
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
    name = "logoutTime",
    value = "退出时间",
    dataType = "",
    notes = "5b611a5369ea4c0001be1605"
  )
  @JSONField(serializeUsing = TimeSerializer.class, format = "HH:mm:ss")
  private java.util.Date logoutTime;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<PersonDTO, Long> id_ = o -> o.getId();
    public static Function<PersonDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<PersonDTO, Long> zid_ = o -> o.getZid();
    public static Function<PersonDTO, Long> tid_ = o -> o.getTid();
    public static Function<PersonDTO, java.util.Date> loginDateTime_ = o -> o.getLoginDateTime();
    public static Function<PersonDTO, java.util.Date> orderDate_ = o -> o.getOrderDate();
    public static Function<PersonDTO, java.util.Date> orderTime_ = o -> o.getOrderTime();
    public static Function<PersonDTO, java.util.Date> logoutTime_ = o -> o.getLogoutTime();
  }

  public static ValidatorBuilder<PersonDTO> validatorExample() {
    ValidatorBuilder<PersonDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
