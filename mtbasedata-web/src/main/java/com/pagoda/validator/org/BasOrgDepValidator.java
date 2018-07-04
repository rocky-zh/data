package com.pagoda.validator.org;

import com.pagoda.api.dto.org.*;

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
public class BasOrgDepValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasOrgDepDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasOrgDepDTO dto = (BasOrgDepDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
