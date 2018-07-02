package com.pagoda.api.salconsign;

import com.pagoda.api.dto.salconsign.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 发货单明细表服务接口SalConsignDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalConsignDetail", description = "SalConsignDetail api")
public interface SalConsignDetailService extends Remote, BaseSalConsignDetailService {}
