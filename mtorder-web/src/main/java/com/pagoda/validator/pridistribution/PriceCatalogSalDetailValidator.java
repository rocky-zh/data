package com.pagoda.validator.pridistribution;

import com.pagoda.api.dto.pridistribution.*;

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
public class PriceCatalogSalDetailValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return PriceCatalogSalDetailDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    PriceCatalogSalDetailDTO dto = (PriceCatalogSalDetailDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
