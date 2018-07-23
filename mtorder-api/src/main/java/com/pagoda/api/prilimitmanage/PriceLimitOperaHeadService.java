package com.pagoda.api.prilimitmanage;

import com.pagoda.api.dto.prilimitmanage.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 运营限价单头表服务接口PriceLimitOperaHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceLimitOperaHead", description = "PriceLimitOperaHead api")
public interface PriceLimitOperaHeadService extends Remote, BasePriceLimitOperaHeadService {}
