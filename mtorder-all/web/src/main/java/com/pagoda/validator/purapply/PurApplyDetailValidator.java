package com.pagoda.validator.purapply;

import com.pagoda.api.dto.purapply.*;

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
public class PurApplyDetailValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return PurApplyDetailDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    PurApplyDetailDTO dto = (PurApplyDetailDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
