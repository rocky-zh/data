package com.pagoda.validator.goods;

import com.pagoda.api.dto.goods.*;

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
public class BasGoodsProcessDetailValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasGoodsProcessDetailDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasGoodsProcessDetailDTO dto = (BasGoodsProcessDetailDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
