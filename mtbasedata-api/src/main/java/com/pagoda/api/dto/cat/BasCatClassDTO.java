package com.pagoda.api.dto.cat;

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
import static com.pagoda.api.dto.cat.BasCatClassDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix="validator.BasCatClass")

@ApiModel(value = "BasCatClassDTO", description = "目录分类表:全系统多维度树形结构表[包含：机构，供应商，部门，客户，库房...等]
1-level： tab")
@EntityFeature(entityName="BasCatClassDTO", idField="id", persistent=true, generationType="auto", batchImport=true, treeStyle=true, auditable=true, traceable=true, approvalRequired=false, requestUrl="/basCatClass/findChildBasCatClass", tableMultiSelect=false)
public class BasCatClassDTO extends AbstractDTO implements Serializable {

    @FieldMeta(name="id", nameCN="主键id", type="long", visible=false, canQuery=false, readOnly=true)
    @ApiModelProperty(name="id", value="主键id", dataType="long", notes="")
    private Long id;

    @FieldMeta(name="deleted", nameCN="软删除标记", type="long", visible=false, canQuery=false, readOnly=true)
    @ApiModelProperty(name="deleted", value="软删除标记", dataType="long", notes="")
    private Long deleted;


    @ApiModelProperty(name="parent", value="父节点", dataType="BasCatClassDTO", notes="")
    private BasCatClassDTO parent;

    @ApiModelProperty(name="children", value="子节点", dataType="list", notes="")
    private List<BasCatClassDTO> children;


    @FieldMeta(name="createdAt", nameCN="录入时间", type="datetime", visible=true, canQuery=false, readOnly=true)
    @ApiModelProperty(name="createdAt", value="录入时间", dataType="datetime", notes="")
    private Date createdAt;

    @FieldMeta(name="creatorCode", nameCN="录入人代码", type="string", visible=true, canQuery=false, readOnly=true)
    @ApiModelProperty(name="creatorCode", value="录入人代码", dataType="string", notes="")
    private String creatorCode;

    @FieldMeta(name="creatorName", nameCN="录入人名称", type="string", visible=true, canQuery=false, readOnly=true)
    @ApiModelProperty(name="creatorName", value="录入人名称", dataType="string", notes="")
    private String creatorName;

    @FieldMeta(name="creatorOrgCode", nameCN="录入人机构代码", type="string", visible=true, canQuery=false, readOnly=true)
    @ApiModelProperty(name="creatorOrgCode", value="录入人机构代码", dataType="string", notes="")
    private String creatorOrgCode;

    @FieldMeta(name="lastModifiedAt", nameCN="最后修改时间", type="datetime", visible=true, canQuery=false, readOnly=true)
    @ApiModelProperty(name="lastModifiedAt", value="最后修改时间", dataType="datetime", notes="")
    private Date lastModifiedAt;

    @FieldMeta(name="modifierCode", nameCN="最后修改人代码", type="string", visible=true, canQuery=false, readOnly=true)
    @ApiModelProperty(name="modifierCode", value="最后修改人代码", dataType="string", notes="")
    private String modifierCode;

    @FieldMeta(name="modifierName", nameCN="最后修改人名称", type="string", visible=true, canQuery=false, readOnly=true)
    @ApiModelProperty(name="modifierName", value="最后修改人名称", dataType="string", notes="")
    private String modifierName;

    @FieldMeta(name="modifierOrgCode", nameCN="最后修改人机构代码", type="string", visible=true, canQuery=false, readOnly=true)
    @ApiModelProperty(name="modifierOrgCode", value="最后修改人机构代码", dataType="string", notes="")
    private String modifierOrgCode;

    @FieldMeta(name="version", nameCN="版本号", type="integer", visible=true, canQuery=false, readOnly=true)
    @ApiModelProperty(name="version", value="版本号", dataType="", notes="")
    private Integer version;



    @FieldMeta(name="fullName", scene="", nameCN="全名[水果-苹果-苹果A]", comment="全名[水果-苹果-苹果A]", nameEN="full_name", type="字符串", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="fullName", value="全名[水果-苹果-苹果A]", dataType="", notes="5b35f6ae9d2feff19b5287f2")
    private String fullName;

    @FieldMeta(name="catId", scene="", nameCN="目录ID", comment="目录ID", nameEN="cat_id", type="长整型", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=true, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="catId", value="目录ID", dataType="", notes="5b35f6ae9d2feff19b5287f3")
    private Long catId;

    @FieldMeta(name="parentCatClassId", scene="", nameCN="父目录分类ID", comment="父目录分类ID", nameEN="parent_cat_class_id", type="长整型", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="parentCatClassId", value="父目录分类ID", dataType="", notes="5b35f6ae9d2feff19b528800")
    private Long parentCatClassId;

    @FieldMeta(name="parentCatClassCode", scene="", nameCN="父目录分类代码[冗余]", comment="父目录分类代码[冗余]", nameEN="parent_cat_class_code", type="字符串", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="parentCatClassCode", value="父目录分类代码[冗余]", dataType="", notes="5b35f6ae9d2feff19b5287f5")
    private String parentCatClassCode;

    @FieldMeta(name="parentCatClassName", scene="", nameCN="父目录分类名称[冗余]", comment="父目录分类名称[冗余]", nameEN="parent_cat_class_name", type="字符串", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="parentCatClassName", value="父目录分类名称[冗余]", dataType="", notes="5b35f6ae9d2feff19b528802")
    private String parentCatClassName;

    @FieldMeta(name="path", scene="", nameCN="物化路径[/catclassid/catclassid/]", comment="物化路径[/catclassid/catclassid/]", nameEN="path", type="字符串", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="path", value="物化路径[/catclassid/catclassid/]", dataType="", notes="5b35f6ae9d2feff19b528804")
    private String path;

    @FieldMeta(name="levelNum", scene="", nameCN="层级数", comment="层级数", nameEN="level_num", type="整型", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="levelNum", value="层级数", dataType="", notes="5b35f6ae9d2feff19b52880a")
    private Integer levelNum;

    @FieldMeta(name="isLeaf", scene="", nameCN="是否子节点", comment="是否子节点", nameEN="is_leaf", type="整型", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="isLeaf", value="是否子节点", dataType="", notes="5b35f6ae9d2feff19b528808")
    private Integer isLeaf;

    @FieldMeta(name="code", scene="", nameCN="行政单位代码", comment="行政单位代码", nameEN="code", type="字符串", format="", displayLen=32, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="code", value="行政单位代码", dataType="", notes="5b35d3559d2feff19b40d3cf")
    private String code;

    @FieldMeta(name="name", scene="", nameCN="行政单位名", comment="行政单位名", nameEN="name", type="字符串", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="name", value="行政单位名", dataType="", notes="5b35d3559d2feff19b40d3d3")
    private String name;

    @FieldMeta(name="entId", scene="", nameCN="企业ID", comment="企业ID", nameEN="ent_id", type="长整型", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=true, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="entId", value="企业ID", dataType="", notes="5b35d1c89d2feff19b40c205")
    private Long entId;

    @FieldMeta(name="sourceId", scene="", nameCN="来源ID（目录为部门的，关联为bas_org.orgid,其他为空）", comment="来源ID（目录为部门的，关联为bas_org.orgid,其他为空）", nameEN="source_id", type="长整型", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="sourceId", value="来源ID（目录为部门的，关联为bas_org.orgid,其他为空）", dataType="", notes="5b35e0d49d2feff19b43e4d7")
    private Long sourceId;

    @FieldMeta(name="isEnabled", scene="", nameCN="是否可用", comment="是否可用", nameEN="is_enabled", type="整型", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="isEnabled", value="是否可用", dataType="", notes="5b35d3559d2feff19b40d3d1")
    private Integer isEnabled;

    @FieldMeta(name="showOrder", scene="", nameCN="排序", comment="排序", nameEN="show_order", type="整型", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="showOrder", value="排序", dataType="", notes="5b35d3559d2feff19b40d3d9")
    private Integer showOrder;

    @FieldMeta(name="remark", scene="price", nameCN="备注", comment="备注", nameEN="remark", type="字符串", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=true, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="remark", value="备注", dataType="", notes="5b36e6a39d2feff19b2b62b5")
    private String remark;

    @FieldMeta(name="tableId", scene="", nameCN="元id", comment="元id", nameEN="table_id", type="长整型", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=false, defaultValue="", tag="", sortable=true, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="tableId", value="元id", dataType="", notes="5b35ecaf9d2feff19b4b1c38")
    private Long tableId;


  /**
   * DTO字段的getter
   */
  public static class Getters {
  public static final Function<BasCatClassDTO, Long> _id = o -> o.getId();
  public static final Function<BasCatClassDTO, Long> _deleted = o -> o.getDeleted();

  

  public static final Function<BasCatClassDTO, Date> _createdAt = o -> o.getCreatedAt();
  public static final Function<BasCatClassDTO, String> _creatorCode = o -> o.getCreatorCode();
  public static final Function<BasCatClassDTO, String> _creatorName = o -> o.getCreatorName();
  public static final Function<BasCatClassDTO, String> _creatorOrgCode = o -> o.getCreatorOrgCode();
  public static final Function<BasCatClassDTO, Date> _lastModifiedAt = o -> o.getLastModifiedAt();
  public static final Function<BasCatClassDTO, String> _modifierCode = o -> o.getModifierCode();
  public static final Function<BasCatClassDTO, String> _modifierName = o -> o.getModifierName();
  public static final Function<BasCatClassDTO, String> _modifierOrgCode = o -> o.getModifierOrgCode();

  public static final Function<BasCatClassDTO, Integer> _version = o -> o.getVersion();


 public static final Function<BasCatClassDTO, String> _fullName = o -> o.getFullName();
 public static final Function<BasCatClassDTO, Long> _catId = o -> o.getCatId();
 public static final Function<BasCatClassDTO, Long> _parentCatClassId = o -> o.getParentCatClassId();
 public static final Function<BasCatClassDTO, String> _parentCatClassCode = o -> o.getParentCatClassCode();
 public static final Function<BasCatClassDTO, String> _parentCatClassName = o -> o.getParentCatClassName();
 public static final Function<BasCatClassDTO, String> _path = o -> o.getPath();
 public static final Function<BasCatClassDTO, Integer> _levelNum = o -> o.getLevelNum();
 public static final Function<BasCatClassDTO, Integer> _isLeaf = o -> o.getIsLeaf();
 public static final Function<BasCatClassDTO, String> _code = o -> o.getCode();
 public static final Function<BasCatClassDTO, String> _name = o -> o.getName();
 public static final Function<BasCatClassDTO, Long> _entId = o -> o.getEntId();
 public static final Function<BasCatClassDTO, Long> _sourceId = o -> o.getSourceId();
 public static final Function<BasCatClassDTO, Integer> _isEnabled = o -> o.getIsEnabled();
 public static final Function<BasCatClassDTO, Integer> _showOrder = o -> o.getShowOrder();
 public static final Function<BasCatClassDTO, String> _remark = o -> o.getRemark();
 public static final Function<BasCatClassDTO, Long> _tableId = o -> o.getTableId();

  }

  public static ValidatorBuilder<InvCheckStockHeadDTO> validatorExample() {
    ValidatorBuilder<InvCheckStockHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

   /**
    * 存储页面post请求的分页参数
    *
    */
    private Pageable pageable;

 /**
   * 添加树形结构子节点
   * @param child
   */
 public void addChild(BasCatClassDTO child) {
    if(children == null) {
      children = new ArrayList<>();
    }
    children.add(child);
  }

}