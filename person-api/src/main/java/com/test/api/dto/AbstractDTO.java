package com.test.api.dto;

import com.pagoda.platform.jms.annotation.*;
import java.lang.reflect.*;
import java.util.*;

import org.springframework.validation.*;

/**
 * DTO对象抽象父类，定义一些工具方法
 *
 * @author PagodaGenerator
 * @generated
 */
public abstract class AbstractDTO {
  /**
   * 查询字段元数据
   *
   * @param name
   * @return
   * @throws NoSuchFieldException
   */
  public Optional<FieldMeta> getFeildMeta(String name) throws NoSuchFieldException {
    Field field = this.getClass().getDeclaredField(name);
    if (field != null) {
      FieldMeta meta = field.getAnnotation(FieldMeta.class);
      return Optional.ofNullable(meta);
    }
    return Optional.empty();
  }

  /**
   * 查询字段的中文名字
   *
   * @param name
   * @return
   * @throws NoSuchFieldException
   */
  public String getFieldName(String name) throws NoSuchFieldException {
    Optional<FieldMeta> meta = getFeildMeta(name);
    if (meta.isPresent()) {
      return meta.get().nameCN();
    }
    return name;
  }

  /**
   * 验证必填字段
   *
   * @param errors
   * @return
   */
  public boolean validateFieldMeta(Errors errors) throws IllegalAccessException {
    boolean ok = true;
    Field[] fields = this.getClass().getDeclaredFields();
    if (fields != null) {
      for (Field field : fields) {
        FieldMeta meta = field.getAnnotation(FieldMeta.class);
        // 新增记录时，主键可能为空
        if (meta == null || "id".equals(field.getName())) {
          continue;
        }
        if (meta.required()) {
          field.setAccessible(true);
          if (field.get(this) == null) {
            errors.rejectValue(meta.name(), "required.field", "缺少必填字段 " + meta.name());
            ok = false;
          }
        }
      }
    }
    return ok;
  }

  /**
   * 清除字段的值
   *
   * @param fieldNames
   * @throws IllegalAccessException
   */
  public void clearFeilds(List<String> fieldNames) throws IllegalAccessException {
    Field[] fields = this.getClass().getDeclaredFields();
    if (fields != null) {
      for (Field field : fields) {
        if (fieldNames.contains(field.getName())) {
          field.setAccessible(true);
          field.set(this, null);
        }
      }
    }
  }
}
