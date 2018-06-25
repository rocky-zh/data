package com.pagoda.config;

import com.alibaba.dubbo.config.RegistryConfig;
import com.pagoda.platform.dubbo.annotation.DubboReferenceScan;
import com.pagoda.platform.opentracing.OpentracingConfiguration;
import com.pagoda.platform.dubbo.util.SerializerFactoryUtil;
import com.pagoda.platform.dubbo.util.SortParamDeserializer;
import com.pagoda.platform.dubbo.util.SortParamSerializer;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Dubbo启用配置，默认激活
 *
 * @author PagodaGenerator
 * @generated
 */
@Import(OpentracingConfiguration.class)
@Configuration
@ConditionalOnProperty(name = "dubbo.enabled", havingValue = "true", matchIfMissing = true)
@ImportResource("classpath*:META-INF/spring/*.xml")
@DubboReferenceScan(
  value = {"com.pagoda.api"},
  scope = "remote"
)
public class DubboConfiguration implements InitializingBean {

  /**
   * dubbo的注册中心配置
   *
   * @return
   */
  @Bean
  public RegistryConfig registryConfig(Environment environment) {
    RelaxedPropertyResolver relaxedPropertyResolver =
        new RelaxedPropertyResolver(environment, "dubbo.");
    RegistryConfig registryConfig =
        new RegistryConfig(
            relaxedPropertyResolver.getProperty("registry", "zookeeper://127.0.0.1:2181"));
    registryConfig.setClient("curator");
    return registryConfig;
  }

  /**
   * dubbo启用时，datasource没有使用
   *
   * @return
   */
  @ConditionalOnMissingBean
  @Bean
  public DataSource dataSource() {
    return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).build();
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    // 处理Dubbo排序参数序列化
    SerializerFactoryUtil.addSerializer(Sort.class, SortParamSerializer.instance);
    SerializerFactoryUtil.addSerializer(
        com.pagoda.api.SortParam.class, SortParamSerializer.instance);
    SerializerFactoryUtil.addDeserializer(Sort.class, SortParamDeserializer.instance);
    SerializerFactoryUtil.addDeserializer(
        com.pagoda.api.SortParam.class, SortParamDeserializer.instance);
  }
}
