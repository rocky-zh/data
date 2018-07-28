package com.pagoda.test;

import com.alibaba.com.caucho.hessian.io.SerializerFactory;
import com.alibaba.dubbo.common.serialize.support.hessian.Hessian2SerializerFactory;
import com.pagoda.test.config.*;
import com.pagoda.platform.dubbo.annotation.*;
import com.pagoda.platform.jms.ApplicationContextHolder;
import com.pagoda.platform.dubbo.util.SortParamSerializer;
import lombok.extern.slf4j.Slf4j;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.ctrip.framework.apollo.spring.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.boot.autoconfigure.data.redis.*;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.data.domain.Sort;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author PagodaGenerator
 * @generated
 */
@EnableHystrix
@EnableApolloConfig
@SpringBootApplication
@ComponentScan({
  "com.pagoda.platform.dubbo.consumer",
  "com.pagoda.platform.dubbo.metadata",
  "com.pagoda.test"
})
@Slf4j
public class TestTimeWebApplication {
  // (exclude = { RedisAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class,
  // HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class})

  public static void main(String[] args) {
    addSerializers();
    ApplicationContext context = SpringApplication.run(TestTimeWebApplication.class, args);
    // 注意这里保存context，用于框架查找spring bean
    ApplicationContextHolder.setApplicationContext(context);
  }

  private static void addSerializers() {
    try {
      SerializerFactory serializerFactory = Hessian2SerializerFactory.SERIALIZER_FACTORY;
      Field staticSerializerField =
          SerializerFactory.class.getDeclaredField("_staticSerializerMap");
      staticSerializerField.setAccessible(true);
      Map staticSerializerMap = (Map) staticSerializerField.get(serializerFactory);

      Field deserializer = SerializerFactory.class.getDeclaredField("_staticDeserializerMap");
      deserializer.setAccessible(true);
      // 处理排序参数序列化
      staticSerializerMap.put(com.pagoda.test.api.SortParam.class, SortParamSerializer.instance);
      staticSerializerMap.put(Sort.class, SortParamSerializer.instance);

    } catch (Exception e) {
      log.error("addSerializers", e);
    }
  }
}
