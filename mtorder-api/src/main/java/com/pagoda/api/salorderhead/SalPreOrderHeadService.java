package com.pagoda.api.salorderhead;

import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 销售预订单服务接口SalPreOrderHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalPreOrderHead", description = "SalPreOrderHead api")
public interface SalPreOrderHeadService extends Remote, BaseSalPreOrderHeadService {}
