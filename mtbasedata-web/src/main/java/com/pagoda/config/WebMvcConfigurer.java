package com.pagoda.config;

import static com.alibaba.fastjson.util.IOUtils.UTF8;

import com.pagoda.api.*;
import com.pagoda.aop.*;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import java.sql.Timestamp;
import java.util.*;
import java.text.SimpleDateFormat;

import org.springframework.context.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.*;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.Validator;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.FormattingConversionService;

/**
 * Web配置
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

  @Autowired private ApplicationProperties applicationProperties;

  /** 返回前端数据中忽略class属性 */
  protected static final String CLASS = "class";

  protected static final String DATE_FORMAT = "yyyy-MM-dd";

  protected static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

  /**
   * 支持前端跨域访问
   *
   * @param registry
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry
        .addMapping("/**")
        .allowedHeaders("*")
        .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
        .maxAge(3600)
        .allowCredentials(true)
        .allowedOrigins("*");
  }

  @Bean
  public CharacterEncodingFilter characterEncodingFilter() {
    CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
    characterEncodingFilter.setEncoding("UTF-8");
    characterEncodingFilter.setForceEncoding(true);
    return characterEncodingFilter;
  }

  /**
   * swagger文档配置
   *
   * @param registry
   */
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
    registry
        .addResourceHandler("swagger-ui.html")
        .addResourceLocations("classpath:/META-INF/resources/");
    registry
        .addResourceHandler("/webjars/**")
        .addResourceLocations("classpath:/META-INF/resources/webjars/");
  }

  /**
   * 添加请求拦截器
   *
   * @param registry
   */
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    // 多个拦截器组成一个拦截器链
    // addPathPatterns 用于添加拦截规则
    // excludePathPatterns 用户排除拦截
    registry.addInterceptor(new RequestInterceptor()).addPathPatterns("/**");
    super.addInterceptors(registry);
  }

  /**
   * 请求日志
   *
   * @return
   */
  @Bean
  public CommonsRequestLoggingFilter requestLoggingFilter() {
    CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
    filter.setIncludeClientInfo(applicationProperties.isIncludeClientInfo());
    filter.setIncludeQueryString(applicationProperties.isIncludeQueryString());
    filter.setIncludePayload(applicationProperties.isIncludePayload());
    filter.setIncludeHeaders(applicationProperties.isIncludeHeaders());
    filter.setMaxPayloadLength(applicationProperties.getMaxPayloadLength());
    filter.setAfterMessagePrefix("REQUEST DATA : ");
    return filter;
  }

  /**
   * 自定义FastJon转换Api返回对象
   *
   * @param converters
   */
  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
    converter.setSupportedMediaTypes(
        Arrays.asList(
            new MediaType("application", "json", UTF8),
            new MediaType("application", "*+json", UTF8)));
    // 自定义配置，不序列化class属性
    FastJsonConfig config = new FastJsonConfig();
    PropertyPreFilter classFilter =
        new PropertyPreFilter() {

          @Override
          public boolean apply(JSONSerializer serializer, Object object, String name) {
            if (CLASS.equalsIgnoreCase(name)) {
              return false;
            }
            return true;
          }
        };
    SerializeConfig mapping = new SerializeConfig();
    mapping.put(java.util.Date.class, new SimpleDateFormatSerializer(DATE_FORMAT));
    mapping.put(java.sql.Date.class, new SimpleDateFormatSerializer(DATE_FORMAT));
    mapping.put(java.sql.Timestamp.class, new SimpleDateFormatSerializer(DATE_TIME_FORMAT));
    config.setSerializeConfig(mapping);
    config.setSerializeFilters(classFilter);
    converter.setFastJsonConfig(config);
    converters.add(converter);

    // 处理JSON转换Pageable分页参数
    ParserConfig.global.putDeserializer(
        org.springframework.data.domain.Pageable.class,
        new JavaBeanDeserializer(ParserConfig.global, PageParam.class));
  }

  /**
   * ConfigurableWebBindingInitializer.initBinder 控制binder初始化
   *
   * @param mvcConversionService
   * @param validator
   * @return
   */
  @Bean
  protected ConfigurableWebBindingInitializer getConfigurableWebBindingInitializer(
      FormattingConversionService mvcConversionService, Validator validator) {
    ConfigurableWebBindingInitializer initializer = new ConfigurableWebBindingInitializer();
    initializer.setConversionService(mvcConversionService);
    initializer.setValidator(validator);
    initializer.setMessageCodesResolver(getMessageCodesResolver());
    // 加入自定义的转换器
    initializer.setPropertyEditorRegistrar(customEditorRegistrar());
    return initializer;
  }

  /**
   * 自定义http请求参数转换器
   *
   * @return
   */
  @Bean
  public PropertyEditorRegistrar customEditorRegistrar() {
    PropertyEditorRegistrar registrar =
        new PropertyEditorRegistrar() {
          @Override
          public void registerCustomEditors(PropertyEditorRegistry registry) {
            registry.registerCustomEditor(Pageable.class, new PageableEditorSupport());
            registry.registerCustomEditor(
                Date.class, new CustomDateEditor(new SimpleDateFormat(DATE_FORMAT), false));
            registry.registerCustomEditor(
                Timestamp.class,
                new CustomDateEditor(new SimpleDateFormat(DATE_TIME_FORMAT), false) {
                  @Override
                  public void setValue(Object value) {
                    if (value instanceof Date) {
                      super.setValue(new Timestamp(((Date) value).getTime()));
                    } else {
                      super.setValue(value);
                    }
                  }
                });
          }
        };
    return registrar;
  }
}
