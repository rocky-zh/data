package com.pagoda.validator.pripurchase;

import com.pagoda.api.dto.pripurchase.*;

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
public class PriceAdjustPurHeadValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return PriceAdjustPurHeadDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    PriceAdjustPurHeadDTO dto = (PriceAdjustPurHeadDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
