package com.pagoda.validator.salconsignout;

import com.pagoda.api.dto.salconsignout.*;

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
public class SalConsignOutHeadValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return SalConsignOutHeadDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    SalConsignOutHeadDTO dto = (SalConsignOutHeadDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
