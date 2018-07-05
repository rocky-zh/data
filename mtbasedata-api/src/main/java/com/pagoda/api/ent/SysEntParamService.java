package com.pagoda.api.ent;

import com.pagoda.api.dto.ent.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 企业参数表[包含1.weburl 用于图片跟链接2.bas_goodsva服务接口SysEntParamService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SysEntParam", description = "SysEntParam api")
public interface SysEntParamService extends Remote, BaseSysEntParamService {}
