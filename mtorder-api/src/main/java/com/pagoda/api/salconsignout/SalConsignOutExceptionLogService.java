package com.pagoda.api.salconsignout;

import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 发货出库异常记录表(每次出库异常插入新记录)服务接口SalConsignOutExceptionLogService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalConsignOutExceptionLog", description = "SalConsignOutExceptionLog api")
public interface SalConsignOutExceptionLogService
    extends Remote, BaseSalConsignOutExceptionLogService {}
