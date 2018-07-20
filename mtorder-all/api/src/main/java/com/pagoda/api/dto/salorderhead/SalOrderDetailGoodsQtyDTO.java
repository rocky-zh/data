package com.pagoda.api.dto.salorderhead;

import com.pagoda.api.dto.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
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
import static com.pagoda.api.dto.salorderhead.SalOrderDetailGoodsQtyDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalOrderDetailGoodsQty")
@ApiModel(value = "SalOrderDetailGoodsQtyDTO", description = "销售订单明细来源商品数量表")
@EntityFeature(
  entityName = "SalOrderDetailGoodsQtyDTO",
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
public class SalOrderDetailGoodsQtyDTO extends AbstractDTO implements Serializable {

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
    name = "createdAt",
    nameCN = "录入时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "createdAt", value = "录入时间", dataType = "datetime", notes = "")
  private Date createdAt;

  @FieldMeta(
    name = "creatorCode",
    nameCN = "录入人代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorCode", value = "录入人代码", dataType = "string", notes = "")
  private String creatorCode;

  @FieldMeta(
    name = "creatorName",
    nameCN = "录入人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorName", value = "录入人名称", dataType = "string", notes = "")
  private String creatorName;

  @FieldMeta(
    name = "creatorOrgCode",
    nameCN = "录入人机构代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorOrgCode", value = "录入人机构代码", dataType = "string", notes = "")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最后修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "lastModifiedAt", value = "最后修改时间", dataType = "datetime", notes = "")
  private Date lastModifiedAt;

  @FieldMeta(
    name = "modifierCode",
    nameCN = "最后修改人代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierCode", value = "最后修改人代码", dataType = "string", notes = "")
  private String modifierCode;

  @FieldMeta(
    name = "modifierName",
    nameCN = "最后修改人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierName", value = "最后修改人名称", dataType = "string", notes = "")
  private String modifierName;

  @FieldMeta(
    name = "modifierOrgCode",
    nameCN = "最后修改人机构代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierOrgCode", value = "最后修改人机构代码", dataType = "string", notes = "")
  private String modifierOrgCode;

  @FieldMeta(
    name = "version",
    nameCN = "版本号",
    type = "integer",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "version", value = "版本号", dataType = "", notes = "")
  private Integer version;

  @FieldMeta(
    name = "orderDetailId",
    scene = "",
    nameCN = "订单明细ID",
    comment = "订单明细ID",
    nameEN = "order_detail_id",
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
  @ApiModelProperty(
    name = "orderDetailId",
    value = "订单明细ID",
    dataType = "",
    notes = "5b35e0d49d2feff19b43e4d5"
  )
  private Long orderDetailId;

  @FieldMeta(
    name = "sourceId",
    scene = "",
    nameCN = "来源ID（目录为部门的，关联为bas_org.orgid,其他为空）",
    comment = "来源ID（目录为部门的，关联为bas_org.orgid,其他为空）",
    nameEN = "source_id",
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
  @ApiModelProperty(
    name = "sourceId",
    value = "来源ID（目录为部门的，关联为bas_org.orgid,其他为空）",
    dataType = "",
    notes = "5b35e0d49d2feff19b43e4d7"
  )
  private Long sourceId;

  @FieldMeta(
    name = "sourceNo",
    scene = "",
    nameCN = "来源单据号",
    comment = "来源单据号",
    nameEN = "source_no",
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
  @ApiModelProperty(
    name = "sourceNo",
    value = "来源单据号",
    dataType = "",
    notes = "5b35e0d49d2feff19b43e4d9"
  )
  private String sourceNo;

  @FieldMeta(
    name = "orderId",
    scene = "",
    nameCN = "订单ID[orderId]",
    comment = "订单ID[orderId]",
    nameEN = "order_id",
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
  @ApiModelProperty(
    name = "orderId",
    value = "订单ID[orderId]",
    dataType = "",
    notes = "5b35d2b49d2feff19b40cb3d"
  )
  private Long orderId;

  @FieldMeta(
    name = "orderSeqno",
    scene = "",
    nameCN = "订单号[冗余]",
    comment = "订单号[冗余]",
    nameEN = "order_seqno",
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
  @ApiModelProperty(
    name = "orderSeqno",
    value = "订单号[冗余]",
    dataType = "",
    notes = "5b35d3a69d2feff19b40d96c"
  )
  private String orderSeqno;

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
  @ApiModelProperty(
    name = "entId",
    value = "企业ID",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c205"
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
  @ApiModelProperty(
    name = "sourceType",
    value = "数据来源{1:手工录入,2:补货汇总生成}",
    dataType = "",
    notes = "5b35d5f69d2feff19b411323"
  )
  private Integer sourceType;

  @FieldMeta(
    name = "requestQty",
    scene = "",
    nameCN = "需求数量[头sourcetype=1使用]",
    comment = "需求数量[头sourcetype=1使用]",
    nameEN = "request_qty",
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
  @ApiModelProperty(
    name = "requestQty",
    value = "需求数量[头sourcetype=1使用]",
    dataType = "",
    notes = "5b35d7329d2feff19b413993"
  )
  private java.math.BigDecimal requestQty;

  @FieldMeta(
    name = "remark",
    scene = "",
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
  @ApiModelProperty(
    name = "remark",
    value = "备注",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c231"
  )
  private String remark;

  /** DTO字段的getter */
  public static class Getters {
    public static Function<SalOrderDetailGoodsQtyDTO, Long> id_ = o -> o.getId();
    public static Function<SalOrderDetailGoodsQtyDTO, Long> deleted_ = o -> o.getDeleted();

    public static Function<SalOrderDetailGoodsQtyDTO, Date> createdAt_ = o -> o.getCreatedAt();
    public static Function<SalOrderDetailGoodsQtyDTO, String> creatorCode_ =
        o -> o.getCreatorCode();
    public static Function<SalOrderDetailGoodsQtyDTO, String> creatorName_ =
        o -> o.getCreatorName();
    public static Function<SalOrderDetailGoodsQtyDTO, String> creatorOrgCode_ =
        o -> o.getCreatorOrgCode();
    public static Function<SalOrderDetailGoodsQtyDTO, Date> lastModifiedAt_ =
        o -> o.getLastModifiedAt();
    public static Function<SalOrderDetailGoodsQtyDTO, String> modifierCode_ =
        o -> o.getModifierCode();
    public static Function<SalOrderDetailGoodsQtyDTO, String> modifierName_ =
        o -> o.getModifierName();
    public static Function<SalOrderDetailGoodsQtyDTO, String> modifierOrgCode_ =
        o -> o.getModifierOrgCode();

    public static Function<SalOrderDetailGoodsQtyDTO, Integer> version_ = o -> o.getVersion();

    public static Function<SalOrderDetailGoodsQtyDTO, Long> orderDetailId_ =
        o -> o.getOrderDetailId();
    public static Function<SalOrderDetailGoodsQtyDTO, Long> sourceId_ = o -> o.getSourceId();
    public static Function<SalOrderDetailGoodsQtyDTO, String> sourceNo_ = o -> o.getSourceNo();
    public static Function<SalOrderDetailGoodsQtyDTO, Long> orderId_ = o -> o.getOrderId();
    public static Function<SalOrderDetailGoodsQtyDTO, String> orderSeqno_ = o -> o.getOrderSeqno();
    public static Function<SalOrderDetailGoodsQtyDTO, Long> entId_ = o -> o.getEntId();
    public static Function<SalOrderDetailGoodsQtyDTO, Integer> sourceType_ = o -> o.getSourceType();
    public static Function<SalOrderDetailGoodsQtyDTO, java.math.BigDecimal> requestQty_ =
        o -> o.getRequestQty();
    public static Function<SalOrderDetailGoodsQtyDTO, String> remark_ = o -> o.getRemark();
  }

  public static ValidatorBuilder<SalOrderDetailGoodsQtyDTO> validatorExample() {
    ValidatorBuilder<SalOrderDetailGoodsQtyDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
