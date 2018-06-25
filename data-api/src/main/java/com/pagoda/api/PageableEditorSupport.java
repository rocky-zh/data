package com.pagoda.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * PageParam转换器，将http请求的字符串转换成PageParam
 *
 * @author PagodaGenerator
 * @generated
 */
public class PageableEditorSupport extends PropertyEditorSupport {

  @Override
  public String getAsText() {
    PageParam page = (PageParam) getValue();

    return JSON.toJSONString(page);
  }

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    if (StringUtils.isEmpty(text)) {
      setValue(null);
    } else {
      PageParam pageable = new PageParam();
      try {
        JSONObject json = JSON.parseObject(text);
        Integer pageNumber = json.getInteger("pageNumber");
        Integer pageSize = json.getInteger("pageSize");
        if (pageNumber != null) {
          pageable.setPageNumber(pageNumber);
        }
        if (pageSize != null) {
          pageable.setPageSize(pageSize);
        }
        JSONObject sort = json.getJSONObject("sort");
        if (sort != null) {
          SortParam sortParam = JSON.toJavaObject(sort, SortParam.class);
          if (sortParam != null) {
            pageable.setSort(sortParam);
          }
        }
      } catch (NumberFormatException nfe) {
        throw new IllegalArgumentException(nfe);
      }
      setValue(pageable);
    }
  }
}
