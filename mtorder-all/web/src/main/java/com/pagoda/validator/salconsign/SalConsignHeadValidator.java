package com.pagoda.validator.salconsign;

import com.pagoda.api.dto.salconsign.*;

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
public class SalConsignHeadValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return SalConsignHeadDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    SalConsignHeadDTO dto = (SalConsignHeadDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
