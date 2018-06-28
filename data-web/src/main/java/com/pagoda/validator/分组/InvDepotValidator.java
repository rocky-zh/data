package com.pagoda.validator.分组;

import com.pagoda.api.dto.分组.*;

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
public class InvDepotValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return InvDepotDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    InvDepotDTO dto = (InvDepotDTO) target;

    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
