package com.pagoda.api.pridistribution;

import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 配送价调价单头表服务接口PriceAdjustSalHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceAdjustSalHead", description = "PriceAdjustSalHead api")
public interface PriceAdjustSalHeadService extends Remote, BasePriceAdjustSalHeadService {}
