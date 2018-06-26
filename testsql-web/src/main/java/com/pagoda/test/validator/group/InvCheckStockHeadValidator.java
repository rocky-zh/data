package com.pagoda.test.validator.group;

import com.pagoda.test.api.dto.group.*;

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
public class InvCheckStockHeadValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return InvCheckStockHeadDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    InvCheckStockHeadDTO dto = (InvCheckStockHeadDTO) target;

    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
