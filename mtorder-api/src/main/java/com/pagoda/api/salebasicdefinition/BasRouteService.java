package com.pagoda.api.salebasicdefinition;

import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 配送线路定义服务接口BasRouteService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasRoute", description = "BasRoute api")
public interface BasRouteService extends Remote, BaseBasRouteService {}
