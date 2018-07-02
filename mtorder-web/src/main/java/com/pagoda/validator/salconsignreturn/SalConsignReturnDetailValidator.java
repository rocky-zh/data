package com.pagoda.validator.salconsignreturn;

import com.pagoda.api.dto.salconsignreturn.*;

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
public class SalConsignReturnDetailValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return SalConsignReturnDetailDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    SalConsignReturnDetailDTO dto = (SalConsignReturnDetailDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}