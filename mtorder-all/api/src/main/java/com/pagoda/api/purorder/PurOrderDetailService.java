package com.pagoda.api.purorder;

import com.pagoda.api.dto.purorder.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 采购订单明细表服务接口PurOrderDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PurOrderDetail", description = "PurOrderDetail api")
public interface PurOrderDetailService extends Remote, BasePurOrderDetailService {}
