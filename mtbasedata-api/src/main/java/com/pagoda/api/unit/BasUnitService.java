package com.pagoda.api.unit;

import com.pagoda.api.dto.unit.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 计量单位定义服务接口BasUnitService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasUnit", description = "BasUnit api")
public interface BasUnitService extends Remote, BaseBasUnitService {}
