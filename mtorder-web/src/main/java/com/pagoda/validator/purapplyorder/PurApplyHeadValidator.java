package com.pagoda.validator.purapplyorder;

import com.pagoda.api.dto.purapplyorder.*;

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
public class PurApplyHeadValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return PurApplyHeadDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    PurApplyHeadDTO dto = (PurApplyHeadDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
