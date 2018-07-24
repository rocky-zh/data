package com.pagoda.test.api.dto;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.regex.*;
import javax.validation.ValidationException;

/**
 * DTO验证工具类
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
public class ValidatorBuilder<T> {

  List<ValidatorItem> validators = new LinkedList<>();

  /** 验证错误时是否跑出异常 */
  boolean throwException = false;

  /**
   * 创建一个验证类
   *
   * @return
   */
  public static <T> ValidatorBuilder<T> create() {
    return new ValidatorBuilder<>();
  }

  public ValidatorBuilder field(Function getter, Predicate predicate, String error) {
    ValidatorItem item = new ValidatorItem();
    item.getter = getter;
    item.predicate = predicate;
    item.error = error;
    validators.add(item);

    return this;
  }

  public ValidatorBuilder<T> object(Predicate<T> predicate, String error) {
    ValidatorItem item = new ValidatorItem();
    item.predicate = predicate;
    item.error = error;
    validators.add(item);
    return this;
  }

  public Optional<String> validate(Object o) {
    StringBuilder error = new StringBuilder();
    validators.forEach(
        validator -> {
          boolean ok = true;
          if (validator.getter == null) {
            ok = validator.predicate.test(o);
          } else {
            ok = validator.predicate.test(validator.getter.apply(o));
          }
          if (!ok) {
            error.append(validator.error).append("\n");
          }
        });
    if (throwException && error.length() > 0) {
      throw new ValidationException(error.toString());
    }
    return error.length() == 0 ? Optional.empty() : Optional.of(error.toString());
  }

  @Data
  static class ValidatorItem {
    Function getter;

    /** 需满足的条件 */
    Predicate predicate;

    String error;
  }

  /** 通用验证方法 */
  public static class Predicates {
    public static Predicate<String> stringNotEmpty = s -> s != null && s.length() > 0;

    public static Predicate<?> notNull = o -> o != null;

    public static Predicate<Long> max(Long maxVal) {
      return v -> v <= maxVal;
    }

    public static Predicate<Long> min(Long minVal) {
      return v -> v >= minVal;
    }

    public static Predicate<String> minLength(int length) {
      return v -> v != null && v.length() >= length;
    }

    public static Predicate<String> maxLength(int length) {
      return v -> v != null && v.length() <= length;
    }

    public static Predicate<String> regexp(Pattern pattern) {
      return v -> pattern.matcher(v).matches();
    }

    /** 判断字符串字符是否全部数字 */
    public static Predicate<String> digits = s -> isNumeric(s);

    public static boolean isNumeric(final CharSequence cs) {
      if (cs == null || cs.length() == 0) {
        return false;
      }
      final int sz = cs.length();
      for (int i = 0; i < sz; i++) {
        if (Character.isDigit(cs.charAt(i)) == false) {
          return false;
        }
      }
      return true;
    }
  }
}
