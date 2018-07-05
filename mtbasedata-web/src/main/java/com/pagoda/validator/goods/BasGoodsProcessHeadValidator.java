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
public class BasGoodsProcessHeadValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return BasGoodsProcessHeadDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    BasGoodsProcessHeadDTO dto = (BasGoodsProcessHeadDTO) target;
    // dto.validate(errors);
    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
