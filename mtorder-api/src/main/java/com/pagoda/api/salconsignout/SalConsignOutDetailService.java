package com.pagoda.api.salconsignout;

import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 发货出库单明细表服务接口SalConsignOutDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalConsignOutDetail", description = "SalConsignOutDetail api")
public interface SalConsignOutDetailService extends Remote, BaseSalConsignOutDetailService {}
