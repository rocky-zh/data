package com.pagoda.test.aop;

import com.pagoda.test.util.*;
import com.pagoda.platform.jms.audit.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * 日志拦截及发送消息
 *
 * @author PagodaGenerator
 * @generated
 */
@javax.annotation.Generated("com.pagoda.platform.PagodaProcessor")
@javax.annotation.Generated("com.pagoda.platform.PagodaProcessor")
public class AuditLogHandlerInterceptor extends AbstractAuditLogHandlerInterceptor
    implements AsyncHandlerInterceptor {

  @Resource protected AuditLogSender auditLogSender;

  @Value("${spring.application.code:default_code}")
  private String applicationCode;

  @Value("${spring.application.name:default_name}")
  private String applicationName;

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    return true;
  }

  @Override
  public void postHandle(
      HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse,
      Object handler,
      ModelAndView modelAndView)
      throws Exception {
    if (handler instanceof HandlerMethod) {
      HandlerMethod handlerMethod = (HandlerMethod) handler;
      AuditLog auditLog = handlerMethod.getMethodAnnotation(AuditLog.class);
      if (auditLog != null) {
        AuditLogProviderDTO auditLogDTO = new AuditLogProviderDTO(auditLog);
        // 应用配置文件填充
        auditLogDTO.setApplicationCode(applicationCode);
        auditLogDTO.setApplicationName(applicationName);

        // 填充Ip
        auditLogDTO.setIp(getIPAddress(httpServletRequest));
        // 填充请求值
        auditLogDTO.setOperationArgs(map2Str(httpServletRequest.getParameterMap()));
        if (!handlerMethod.isVoid()) { // 请求方法不是void返回
          if (!ModelAndView.class.isAssignableFrom(
              handlerMethod.getMethod().getReturnType())) { // 不是ModelAndView
            auditLogDTO.setOperationResult(
                handlerMethod.getMethod().getReturnType().getName()); // 设置返回结果类型
          }
        }
        if (StringUtils.isEmpty(auditLogDTO.getOperationFunc())) { // 注解默认""
          auditLogDTO.setOperationFunc(
              httpServletRequest.getContextPath()
                  + ":"
                  + handlerMethod.getMethod().getName()); // 注解没设置则取方法名称
        }
        // 填充操作人 从casUser中获取
        setOperatorInfo(auditLogDTO);

        // 将日志发送到mq中
        auditLogSender.send(auditLogDTO);
      }
    }
  }

  @Override
  public void afterCompletion(
      HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {}

  @Override
  public void afterConcurrentHandlingStarted(
      HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {}
}
