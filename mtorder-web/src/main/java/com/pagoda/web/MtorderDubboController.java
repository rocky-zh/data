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
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.FindAdjusNoListDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.SalPreOrderHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.FindFinishedListDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignreturn.SalConsignReturnHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.SalOrgCusDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.PriceAdjustSalHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.FindSalPriceAndReturnPriceDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsign.SalConsignHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.FindPriceAdjustLogsDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.SalPreOrderDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purorgven.BasVenRebateHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.FindPriceAdjustPurListDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignout.SalConsignOutExceptionLogDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purorder.PurOrderHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.SalOrderDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purorgven.PurOrgVenDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.PriceCatalogSalHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.PriceAdjustPurDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.prilimitmanage.PriceLimitCatRecordDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.SalOrderDetailGoodsQtyDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.prilimitmanage.PriceLimitGoodsDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.FindLogstableHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignreturn.SalConsignReturnDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.FindBasOrgGoodsOnManagerDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.FindGoodsHistoryPriceDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsign.SalConsignDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.PriceAdjustSalDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignout.SalConsignOutHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salebasicdefinition.BasRouteDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.driverdata.BasDriverDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.FindGoodsLastPriceAdjustDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignout.FindSalConsignOutHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.prilimitmanage.PriceLimitCusRecordDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purorgven.BasVenRebateOrgDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salorderhead.SalOrderHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salconsignout.SalConsignOutDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.PriceCatalogSalDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purorgven.PurOrgVenGoodsDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purapply.QueryPurApplyByConditionDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salebasicdefinition.BasWrapperWithGoodsDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.BasOrgGoodsvarDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pripurchase.PriceAdjustPurHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.prilimitmanage.PriceLimitOperaHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.BasOrgGoodsDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purapply.PurApplyHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purorgven.BasVenRebateGoodsDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purapply.PurApplyDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.salebasicdefinition.SalOrderControlDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.purorder.PurOrderDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.prilimitmanage.PriceLimitCusDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.pridistribution.FindPriceAdjustHeadDTO");
  }

  /** api包名 * */
  public static final Map<String, String> API_PACKAGES = new HashMap<>();

  static {
    putInMap(API_PACKAGES, "com.pagoda.api.pridistribution.PriceCatalogSalHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.prilimitmanage.PriceLimitGoodsDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignreturn.SalConsignReturnDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.purorgven.BasVenRebateGoodsDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.pridistribution.PriceAdjustSalHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignout.SalConsignOutHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.prilimitmanage.PriceLimitCatRecordService");
    putInMap(API_PACKAGES, "com.pagoda.api.salebasicdefinition.SalOrderControlService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignout.SalConsignOutDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.pridistribution.SalOrgCusService");
    putInMap(API_PACKAGES, "com.pagoda.api.goods.BasOrgGoodsService");
    putInMap(API_PACKAGES, "com.pagoda.api.salebasicdefinition.BasWrapperWithGoodsService");
    putInMap(API_PACKAGES, "com.pagoda.api.purorgven.PurOrgVenGoodsService");
    putInMap(API_PACKAGES, "com.pagoda.api.pripurchase.PriceAdjustPurDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.purapply.PurApplyDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsign.SalConsignDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.purorder.PurOrderHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.goods.BasOrgGoodsvarService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.SalPreOrderHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.purorgven.BasVenRebateOrgDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsign.SalConsignHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.purorgven.BasVenRebateHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.prilimitmanage.PriceLimitCusRecordService");
    putInMap(API_PACKAGES, "com.pagoda.api.prilimitmanage.PriceLimitOperaHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.SalPreOrderDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.SalOrderDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.salebasicdefinition.BasRouteService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.SalOrderHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.pridistribution.PriceAdjustSalDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.pridistribution.PriceCatalogSalDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.purorder.PurOrderDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.prilimitmanage.PriceLimitCusDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.purorgven.PurOrgVenService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignreturn.SalConsignReturnHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.purapply.PurApplyHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.salorderhead.SalOrderDetailGoodsQtyService");
    putInMap(API_PACKAGES, "com.pagoda.api.salconsignout.SalConsignOutExceptionLogService");
    putInMap(API_PACKAGES, "com.pagoda.api.driverdata.BasDriverService");
    putInMap(API_PACKAGES, "com.pagoda.api.pripurchase.PriceAdjustPurHeadService");
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
