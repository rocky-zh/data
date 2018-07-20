package com.pagoda.validator.purorder;

import com.pagoda.api.dto.purorder.*;

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
public class PurOrderHeadValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return PurOrderHeadDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    PurOrderHeadDTO dto = (PurOrderHeadDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
