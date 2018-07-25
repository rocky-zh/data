package ;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.regex.*;
import java.util.Collection;
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

    /**
    * 验证错误时是否跑出异常
    */
    boolean throwException = false;

    /**
    * 创建一个验证类
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

    
  public ValidatorBuilder<T> objectNotNull(final Object obj, String error) {
    ValidatorItem item = new ValidatorItem();
    if(obj instanceof Collection) {
      item.predicate = any -> obj != null && ((Collection)obj).isEmpty() == false;
    } else {
      item.predicate = any -> obj != null;
    }
    item.error = error;
    validators.add(item);
    return this;
  }

  /**
   *  验证集合内的每一个对象
   *
   * @param list
   * @param listNullError  集合为空时，可以控制是否返回错误
   * @return
   */
  public Optional<String> validateEach(Collection list, Optional<String> listNullError) {
    if(list == null || list.isEmpty()) {
      if (throwException && listNullError.isPresent()) {
        throw new ValidationException(listNullError.get());
      }
      return listNullError;
    }

    StringBuilder error = new StringBuilder();
    for(Object item: list) {
      validate(item).ifPresent(msg -> error.append(msg));
    }
     return error.length() == 0 ? Optional.empty() : Optional.of(error.toString());
  }

  public Optional<String> validateEach(Collection list) {
    return validateEach(list, Optional.empty());
  }

    public Optional<String> validate(Object o) {
        StringBuilder error = new StringBuilder();
        validators.forEach(validator -> {
            boolean ok = true;
            if(validator.getter == null) {
                ok = validator.predicate.test(o);
            } else {
                ok = validator.predicate.test(validator.getter.apply(o));
            }
            if(!ok) {
                error.append(validator.error).append("\n");
            }
        });
        if(throwException && error.length() > 0) {
            throw new ValidationException(error.toString());
        }
        return  error.length() == 0? Optional.empty() : Optional.of(error.toString()) ;
    }


    @Data
    static class ValidatorItem {
        Function getter;

        /**
         * 需满足的条件
         */
        Predicate predicate;

        String error;
    }

    /**
     * 通用验证方法
     */
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

        /**
        * 判断字符串字符是否全部数字
        */
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
