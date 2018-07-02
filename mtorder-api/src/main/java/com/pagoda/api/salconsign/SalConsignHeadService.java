package com.pagoda.api.salconsign;

import com.pagoda.api.dto.salconsign.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 发货单头表服务接口SalConsignHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalConsignHead", description = "SalConsignHead api")
public interface SalConsignHeadService extends Remote, BaseSalConsignHeadService {}
