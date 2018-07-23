package com.pagoda.validator.purorgven;

import com.pagoda.api.dto.purorgven.*;

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
public class BasVenRebateOrgDetailValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasVenRebateOrgDetailDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasVenRebateOrgDetailDTO dto = (BasVenRebateOrgDetailDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
