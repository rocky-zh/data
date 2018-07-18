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
public class BasGoodsValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasGoodsDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasGoodsDTO dto = (BasGoodsDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
