package com.pagoda;

import com.alibaba.com.caucho.hessian.io.AbstractHessianOutput;
import com.alibaba.com.caucho.hessian.io.JavaSerializer;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 修复com.alibaba.com.caucho.hessian.io.JavaSerializer序列化实体类的错误
 *
 * @author PagodaGenerator
 * @generated
 */
@Slf4j
public class DtoSerializer extends JavaSerializer {
  /** DTO类名后缀 */
  private static final String DTO_CLASS_SUFFIX = "DTO";

  Method dtoMethod;

  public DtoSerializer(Class cl, ClassLoader loader) {
    super(cl, loader);
  }

  @Override
  public void writeObject(Object obj, AbstractHessianOutput out) throws IOException {
    Class cl = obj.getClass();
    Class superCl = cl.getSuperclass();
    if (superCl != null && superCl.getSimpleName().endsWith(DTO_CLASS_SUFFIX)) {
      obj = convertDTO(obj);
    }

    super.writeObject(obj, out);
  }

  private Object convertDTO(Object obj) {
    try {
      if (dtoMethod == null) {
        dtoMethod = obj.getClass().getMethod("toDTO", new Class[0]);
      }
      Object dto = dtoMethod.invoke(obj, new Object[0]);
      return dto;
    } catch (Exception e) {
      log.error("convertDTO", e);
    }
    return obj;
  }
}
