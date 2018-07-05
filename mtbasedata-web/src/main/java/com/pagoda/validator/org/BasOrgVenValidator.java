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
public class BasOrgVenValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasOrgVenDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasOrgVenDTO dto = (BasOrgVenDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
