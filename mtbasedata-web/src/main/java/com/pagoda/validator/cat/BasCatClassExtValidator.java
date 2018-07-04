package com.pagoda.validator.cat;

import com.pagoda.api.dto.cat.*;

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
public class BasCatClassExtValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasCatClassExtDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasCatClassExtDTO dto = (BasCatClassExtDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
