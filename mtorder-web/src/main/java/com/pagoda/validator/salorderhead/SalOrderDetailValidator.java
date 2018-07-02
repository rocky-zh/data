package com.pagoda.validator.salorderhead;

import com.pagoda.api.dto.salorderhead.*;

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
public class SalOrderDetailValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return SalOrderDetailDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    SalOrderDetailDTO dto = (SalOrderDetailDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
