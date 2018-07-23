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
public class BasVenRebateGoodsDetailValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasVenRebateGoodsDetailDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasVenRebateGoodsDetailDTO dto = (BasVenRebateGoodsDetailDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
