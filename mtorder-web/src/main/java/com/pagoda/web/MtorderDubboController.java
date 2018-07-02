package com.pagoda.web;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.*;

import com.pagoda.platform.dubbo.consumer.*;
import com.pagoda.platform.dubbo.metadata.EntityFeatureInfo;
import com.pagoda.platform.dubbo.metadata.FieldMetaInfo;
import com.pagoda.platform.dubbo.metadata.MetadataService;
import cn.com.pagoda.common.shiro.subject.*;

import io.micrometer.core.annotation.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通用的Dubbo调用服务，将Dubbo RPC转换成Rest API
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/dubboApi")
@Slf4j
public class MtorderDubboController {

  /** 模块名 * */
  public static final String MODULE_NAME = "Mtorder";

  /** 模块包名 * */
  public static final String MODULE_PACKAGE = "com.pagoda";

  /** DTO包名 * */
  public static final Map<String, String> DTO_PACKAGES = new HashMap<>();

  static {
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.FindGoodsLastPriceAdjustDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsign.sal_consign_headDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.sal_order_detail_goods_qtyDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purapplyorder.pur_apply_headDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.sal_order_detailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.sal_pre_order_headDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.price_adjust_sal_headDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignout.FindSalConsignOutHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignout.sal_consign_out_headDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignreturn.sal_consign_return_detailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.price_catalog_sal_headDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignout.sal_consign_out_exception_logDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.price_adjust_sal_detailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignreturn.sal_consign_return_headDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.price_adjust_pur_headDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsign.sal_consign_detailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.price_catalog_sal_detailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.sal_order_headDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignout.sal_consign_out_detailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.sal_pre_order_detailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.price_adjust_pur_detailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.FindPriceAdjustPurListDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purapplyorder.pur_apply_detailDTO");
  }

  /** api包名 * */
  public static final Map<String, String> API_PACKAGES = new HashMap<>();

  static {
    putInMap(API_PACKAGES, "com.pagoda.api.purapplyorder.pur_apply_detailService");
    putInMap(API_PACKAGES, "com.pagoda.api.pripurchase.price_adjust_pur_headService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.sal_order_detailService");
    putInMap(API_PACKAGES, "com.pagoda.api.pridistribution.price_catalog_sal_detailService");
    putInMap(API_PACKAGES, "com.pagoda.api.pridistribution.price_adjust_sal_detailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.sal_pre_order_headService");
    putInMap(API_PACKAGES, "com.pagoda.api.pridistribution.price_adjust_sal_headService");
    putInMap(API_PACKAGES, "com.pagoda.api.purapplyorder.pur_apply_headService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.sal_pre_order_detailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignout.sal_consign_out_detailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignreturn.sal_consign_return_detailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignout.sal_consign_out_exception_logService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.sal_order_headService");
    putInMap(API_PACKAGES, "com.pagoda.api.pripurchase.price_adjust_pur_detailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignreturn.sal_consign_return_headService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsign.sal_consign_detailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignout.sal_consign_out_headService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.sal_order_detail_goods_qtyService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsign.sal_consign_headService");
    putInMap(API_PACKAGES, "com.pagoda.api.pridistribution.price_catalog_sal_headService");
  }

  /** 查询方法名 * */
  public static final String QUERY_METHOD = "findBy";

  /** 路径分隔符 * */
  public static final String PATH_SEP = "/";

  /** 包名分隔符 * */
  public static final String PACKAGE_SEP = ".";

  /** 请求路径 * */
  public static final String REQUEST_PATH = "/dubboApi";

  /** 调用dubbo rpc */
  @Autowired private DubboGenericInvoker dubboGenericServiceInvoker;

  /** 前端查询元数据 */
  @Autowired private MetadataService metadataService;

  @Value("${dubbo.enabled:true}")
  private boolean dubboEnabled;

  @Autowired private ReflectionInvoker reflectionInvoker;

  // @FastJsonView(exclude = {@FastJsonFilter(clazz = HashMap.class, props = {"class"})})
  /**
   * 将Dubbo RPC转换成Rest API
   *
   * @param httpRequest
   * @param service 接口的全路径名称（带包名）
   * @param method 要调用的接口方法名
   * @param timeout 超时时间，单位毫秒
   * @param retries 重试次数
   * @return
   * @throws Exception
   */
  @Timed
  @ResponseBody
  @GetMapping(value = "/{service}/{method}")
  public Object getInvokeApi(
      HttpServletRequest httpRequest,
      @PathVariable("service") String service,
      @PathVariable("method") String method,
      @RequestHeader(value = "timeout", required = false, defaultValue = "5000") int timeout,
      @RequestHeader(value = "retries", required = false, defaultValue = "2") int retries)
      throws Exception {
    service = addPackageName(service);
    if (dubboEnabled) {
      return dubboGenericServiceInvoker.invokeApi(httpRequest, service, method, timeout, retries);
    } else {
      return reflectionInvoker.invokeApi(httpRequest, service, method);
    }
  }

  static void putInMap(Map<String, String> map, String fullName) {
    map.put(getClassName(fullName), fullName);
  }

  static String addPackageName(String service) {
    if (service.indexOf(PACKAGE_SEP) < 0) {
      return API_PACKAGES.get(StringUtils.capitalize(service));
    } else {
      return service;
    }
  }

  static String getClassName(String name) {
    return name.substring(name.lastIndexOf(PACKAGE_SEP) + 1);
  }

  static String getApiServiceClass(String dtoClass) {
    return dtoClass.replace("DTO", "Service");
  }

  /**
   * 将Dubbo RPC转换成Rest API
   *
   * @param httpRequest
   * @param service 接口的全路径名称（带包名）
   * @param method 要调用的接口方法名
   * @param timeout 超时时间，单位毫秒
   * @param retries 重试次数
   * @return
   * @throws Exception
   */
  @Timed
  @ResponseBody
  @PostMapping(value = "/{service}/{method}")
  public Object postInvokeApi(
      HttpServletRequest httpRequest,
      @PathVariable("service") String service,
      @PathVariable("method") String method,
      @RequestHeader(value = "timeout", required = false, defaultValue = "5000") int timeout,
      @RequestHeader(value = "retries", required = false, defaultValue = "2") int retries)
      throws Exception {
    service = addPackageName(service);
    if (dubboEnabled) {
      return dubboGenericServiceInvoker.invokeApi(httpRequest, service, method, timeout, retries);
    } else {
      return reflectionInvoker.invokeApi(httpRequest, service, method);
    }
  }

  /**
   * 前端组件查询类型的元数据
   *
   * @param httpRequest
   * @param className 类型的全路径名称（带包名）
   * @return
   */
  @Timed
  @ResponseBody
  @GetMapping(value = "/metadata/{className:.+}")
  public Object metadata(
      HttpServletRequest httpRequest, @PathVariable("className") String className) {
    EntityFeatureInfo classMeta = null;
    List<FieldMetaInfo> feilds = null;
    String serviceClass = "";
    if (className.indexOf(PACKAGE_SEP) > -1) {
      classMeta = metadataService.getDtoClassMetadata(className);
      feilds = metadataService.getDtoFieldsMetadata(className);
      serviceClass = API_PACKAGES.get(getApiServiceClass(getClassName(className)));
    } else {
      className = StringUtils.capitalize(className);
      classMeta = metadataService.getDtoClassMetadata(DTO_PACKAGES.get(className));
      feilds = metadataService.getDtoFieldsMetadata(DTO_PACKAGES.get(className));
      serviceClass = API_PACKAGES.get(getApiServiceClass(className));
    }

    JSONObject json = new JSONObject();
    json.put("head", feilds);

    String requestUrl = classMeta.getRequestUrl();
    if (StringUtils.isEmpty(requestUrl)) {
      requestUrl = REQUEST_PATH + PATH_SEP + serviceClass + PATH_SEP + QUERY_METHOD;
    }
    json.put("requestUrl", requestUrl);
    json.put("tableMultiSelect", classMeta.isTableMultiSelect());
    return json;
  }

  /*
  private void checkUserPermission() {
      try {
          PagodaSubject subject = (PagodaSubject) SecurityUtils.getSubject();
          // 用户代码
          String userCode = subject.getUserCode();
          // 员工号，用于记录操作人
          String employeeCode = subject.getEmployeeCode();
          // 部门，用于记录操作人
          String orgCode = subject.getOrgCode();
          System.out.println(userCode);
      } catch (Exception e) {
          log.error("checkUserPermission", e);
      }
  }
  */
}
