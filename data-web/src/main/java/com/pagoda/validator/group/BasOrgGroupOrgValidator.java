package com.pagoda.validator.group;

import com.pagoda.api.dto.group.*;

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
public class BasOrgGroupOrgValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasOrgGroupOrgDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasOrgGroupOrgDTO dto = (BasOrgGroupOrgDTO) target;

    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
