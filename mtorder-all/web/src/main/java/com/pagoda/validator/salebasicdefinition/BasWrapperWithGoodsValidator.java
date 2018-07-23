package com.pagoda.validator.salebasicdefinition;

import com.pagoda.api.dto.salebasicdefinition.*;

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
public class BasWrapperWithGoodsValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasWrapperWithGoodsDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasWrapperWithGoodsDTO dto = (BasWrapperWithGoodsDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
