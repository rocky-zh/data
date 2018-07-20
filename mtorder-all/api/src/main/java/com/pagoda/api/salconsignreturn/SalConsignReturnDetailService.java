package com.pagoda.api.salconsignreturn;

import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 退货单明细表服务接口SalConsignReturnDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalConsignReturnDetail", description = "SalConsignReturnDetail api")
public interface SalConsignReturnDetailService extends Remote, BaseSalConsignReturnDetailService {}
