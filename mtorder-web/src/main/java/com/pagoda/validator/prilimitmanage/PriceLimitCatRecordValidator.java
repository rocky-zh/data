package com.pagoda.validator.prilimitmanage;

import com.pagoda.api.dto.prilimitmanage.*;

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
public class PriceLimitCatRecordValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return PriceLimitCatRecordDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    PriceLimitCatRecordDTO dto = (PriceLimitCatRecordDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
