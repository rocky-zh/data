package com.pagoda.api.driverdata;

import com.pagoda.api.dto.driverdata.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 司机定义服务接口BasDriverService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasDriver", description = "BasDriver api")
public interface BasDriverService extends Remote, BaseBasDriverService {}
