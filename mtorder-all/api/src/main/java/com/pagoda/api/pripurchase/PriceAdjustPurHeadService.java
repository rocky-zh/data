package com.pagoda.api.pripurchase;

import com.pagoda.api.dto.pripurchase.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 采购调价单头服务接口PriceAdjustPurHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceAdjustPurHead", description = "PriceAdjustPurHead api")
public interface PriceAdjustPurHeadService extends Remote, BasePriceAdjustPurHeadService {}
