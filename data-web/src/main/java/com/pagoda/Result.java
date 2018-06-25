package com.pagoda;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * 出错情况下，controller可以选择返回Result对象
 *
 * @author PagodaGenerator
 * @generated
 */
@ApiModel(description = "响应结果")
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result implements Serializable {

  public static final String RESULT_CODE = "resultCode";
  public static final String DATA = "data";
  public static final String ERROR_MSG = "errorMsg";

  @ApiModelProperty(required = true, value = "返回码,非0表示错误")
  private Integer resultCode = 0;

  @ApiModelProperty(required = false, value = "错误的描述信息")
  private String errorMsg = "";

  @ApiModelProperty(required = false, value = "返回的数据内容")
  private Object data;

  /**
   * 构造一个正常响应
   *
   * @param data
   * @return
   */
  public static Result ok(Object data) {
    Result result = new Result();
    result.setData(data);
    return result;
  }

  /**
   * 构造一个错误响应
   *
   * @param code
   * @param msg
   * @return
   */
  public static Result error(Integer code, String msg) {
    Result result = new Result();
    result.setResultCode(code);
    result.setErrorMsg(msg);
    return result;
  }

  /**
   * 返回给前端的json
   *
   * @return
   */
  public JSONObject toJSON() {
    JSONObject json = new JSONObject();
    json.put(RESULT_CODE, resultCode);
    json.put(ERROR_MSG, errorMsg);
    if (data != null) {
      json.put(DATA, data);
    }
    return json;
  }
}
