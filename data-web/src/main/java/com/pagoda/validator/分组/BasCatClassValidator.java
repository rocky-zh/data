package com.pagoda.validator.分组;

import com.pagoda.api.dto.分组.*;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * 使用spring校验，参考http://www.bbenson.co/post/spring-validations-with-examples/
 *
 * @author PagodaGenerator
 * @generated
 */
@Component
public class BasCatClassValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasCatClassDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasCatClassDTO dto = (BasCatClassDTO) target;

    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
