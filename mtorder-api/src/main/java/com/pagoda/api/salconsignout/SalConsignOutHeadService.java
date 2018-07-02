package com.pagoda.api.salconsignout;

import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 发货出库单头表服务接口SalConsignOutHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalConsignOutHead", description = "SalConsignOutHead api")
public interface SalConsignOutHeadService extends Remote, BaseSalConsignOutHeadService {}
