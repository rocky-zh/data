package com.pagoda.api.prilimitmanage;

import com.pagoda.api.dto.prilimitmanage.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 限价单客户明细表(限价单为片区层级时,片区对应的客户)服务接口PriceLimitCusDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceLimitCusDetail", description = "PriceLimitCusDetail api")
public interface PriceLimitCusDetailService extends Remote, BasePriceLimitCusDetailService {}
