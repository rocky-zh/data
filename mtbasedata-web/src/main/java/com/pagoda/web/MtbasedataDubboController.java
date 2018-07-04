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
public class MtbasedataDubboController {

  /** 模块名 * */
  public static final String MODULE_NAME = "Mtbasedata";

  /** 模块包名 * */
  public static final String MODULE_PACKAGE = "com.pagoda";

  /** DTO包名 * */
  public static final Map<String, String> DTO_PACKAGES = new HashMap<>();

  static {
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.SeleteGroupOrgWithRelInfoDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.cat.basCatClassDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basDistrictDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.FindGoodsInDefineDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basOrgDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.ent.sysEntDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.ent.sysEntParamDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.cat.basCatDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.basOrgGoodsDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.SelectBasOrgForListDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.cat.basCatClassRelDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.SelectSubOrgGroupInfoDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basOrgGroupOrgDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basOrgVenDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.ven.basVenRebateGoodsDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.basGoodsDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.ven.basVenRebateOrgDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.ven.purOrgVenDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.SelectInvByCodeNameOrgIdAndCatRelDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.SelectBasOrgByIsWhatAndRelDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.basGoodsUnitDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.SelectBasOrgBalAndCatClassRelDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basPostDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.FindGoodOnCatClassDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.unit.basUnitDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basOrgBalDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.basGoodsProcessDetailDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.ven.purOrgVenGoodsDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.basGoodsClassCodeRuleDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.cat.basCatClassExtDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.SelectBasOrgWithRelDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basOrgCusDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.basGoodsProcessHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.ven.basVenRebateHeadDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.goods.GetBasGoodsProcessHeadDetailsDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basOrgDepDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basOrgBalBankDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.api.dto.org.basOrgOrgDTO");
  }

  /** api包名 * */
  public static final Map<String, String> API_PACKAGES = new HashMap<>();

  static {
    putInMap(API_PACKAGES, "com.pagoda.api.org.basOrgBalService");
    putInMap(API_PACKAGES, "com.pagoda.api.org.basDistrictService");
    putInMap(API_PACKAGES, "com.pagoda.api.org.basOrgService");
    putInMap(API_PACKAGES, "com.pagoda.api.org.basOrgCusService");
    putInMap(API_PACKAGES, "com.pagoda.api.org.basOrgGroupOrgService");
    putInMap(API_PACKAGES, "com.pagoda.api.ent.sysEntParamService");
    putInMap(API_PACKAGES, "com.pagoda.api.ven.basVenRebateHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.org.basOrgDepService");
    putInMap(API_PACKAGES, "com.pagoda.api.cat.basCatService");
    putInMap(API_PACKAGES, "com.pagoda.api.cat.basCatClassService");
    putInMap(API_PACKAGES, "com.pagoda.api.goods.basGoodsUnitService");
    putInMap(API_PACKAGES, "com.pagoda.api.ent.sysEntService");
    putInMap(API_PACKAGES, "com.pagoda.api.cat.basCatClassExtService");
    putInMap(API_PACKAGES, "com.pagoda.api.unit.basUnitService");
    putInMap(API_PACKAGES, "com.pagoda.api.ven.basVenRebateGoodsDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.org.basPostService");
    putInMap(API_PACKAGES, "com.pagoda.api.goods.basOrgGoodsService");
    putInMap(API_PACKAGES, "com.pagoda.api.org.basOrgOrgService");
    putInMap(API_PACKAGES, "com.pagoda.api.goods.basGoodsProcessDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.ven.purOrgVenService");
    putInMap(API_PACKAGES, "com.pagoda.api.cat.basCatClassRelService");
    putInMap(API_PACKAGES, "com.pagoda.api.goods.basGoodsService");
    putInMap(API_PACKAGES, "com.pagoda.api.org.basOrgBalBankService");
    putInMap(API_PACKAGES, "com.pagoda.api.ven.basVenRebateOrgDetailService");
    putInMap(API_PACKAGES, "com.pagoda.api.ven.purOrgVenGoodsService");
    putInMap(API_PACKAGES, "com.pagoda.api.goods.basGoodsProcessHeadService");
    putInMap(API_PACKAGES, "com.pagoda.api.org.basOrgVenService");
    putInMap(API_PACKAGES, "com.pagoda.api.goods.basGoodsClassCodeRuleService");
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
