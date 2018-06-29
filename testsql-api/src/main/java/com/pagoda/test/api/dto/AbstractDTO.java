package com.pagoda.test.api.dto;

import com.pagoda.platform.jms.annotation.FieldMeta;
import org.springframework.validation.Errors;

import java.lang.reflect.Field;

/**
 * DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
public abstract class AbstractDTO {
  /**
   * 验证必填字段
   *
   * @param errors
   * @return
   */
  public boolean validate(Errors errors) throws IllegalAccessException {
    boolean ok = true;
    Field[] fields = this.getClass().getDeclaredFields();
    if (fields != null) {
      for (Field field : fields) {
        FieldMeta meta = field.getAnnotation(FieldMeta.class);
        if (meta == null) {
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
}
