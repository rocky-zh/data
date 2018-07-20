package com.pagoda.api.salorderhead;

import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 销售预订单明细表服务接口SalPreOrderDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalPreOrderDetail", description = "SalPreOrderDetail api")
public interface SalPreOrderDetailService extends Remote, BaseSalPreOrderDetailService {}
