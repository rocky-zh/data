package com.test.api.dto.group;

import com.test.api.dto.*;
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

import static com.test.api.dto.ValidatorBuilder.Predicates.*;
import static com.test.api.dto.group.PersonDTO.Getters.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix="validator.Person")

@ApiModel(value = "PersonDTO", description = "person")
@EntityFeature(entityName="PersonDTO", idField="id", persistent=true, generationType="auto", batchImport=false, treeStyle=false, auditable=false, traceable=false, approvalRequired=false, requestUrl="", tableMultiSelect=false)
public class PersonDTO extends AbstractDTO implements Serializable {

    @FieldMeta(name="id", nameCN="主键id", type="long", visible=false, canQuery=false, readOnly=true)
    @ApiModelProperty(name="id", value="主键id", dataType="long", notes="")
    private Long id;

    @FieldMeta(name="deleted", nameCN="软删除标记", type="long", visible=false, canQuery=false, readOnly=true)
    @ApiModelProperty(name="deleted", value="软删除标记", dataType="long", notes="")
    private Long deleted;






    @FieldMeta(name="orderTime", scene="订单时间", nameCN="orderTime", comment="orderTime", nameEN="orderTime", type="时分秒", format="", displayLen=1, formSize="", constraint="", constraintParams="",
        persistent=true, canQuery=true, readOnly=false, required=false, visible=true, defaultValue="", tag="", sortable=false, total=false, pageTotal=false, enumerationType=false, constraintParamsExtra="", fixed="", sensitive=false, index=0)
    @ApiModelProperty(name="orderTime", value="orderTime", dataType="", notes="5b52f84722e0fe00011658e6")
    private  orderTime;


  /**
   * DTO字段的getter
   */
  public static class Getters {
  public static Function<PersonDTO, Long> id_ = o -> o.getId();
  public static Function<PersonDTO, Long> deleted_ = o -> o.getDeleted();





 public static Function<PersonDTO, > orderTime_ = o -> o.getOrderTime();

  }

  public static ValidatorBuilder<PersonDTO> validatorExample() {
    ValidatorBuilder<PersonDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

   /**
    * 存储页面post请求的分页参数
    *
    */
    private Pageable pageable;


}