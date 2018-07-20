package com.pagoda.api.salorderhead;

import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 销售订单明细表服务接口SalOrderDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalOrderDetail", description = "SalOrderDetail api")
public interface SalOrderDetailService extends Remote, BaseSalOrderDetailService {}
