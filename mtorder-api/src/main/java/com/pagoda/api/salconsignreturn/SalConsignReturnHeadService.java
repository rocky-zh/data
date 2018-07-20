package com.pagoda.api.salconsignreturn;

import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 退货单头表服务接口SalConsignReturnHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalConsignReturnHead", description = "SalConsignReturnHead api")
public interface SalConsignReturnHeadService extends Remote, BaseSalConsignReturnHeadService {}
