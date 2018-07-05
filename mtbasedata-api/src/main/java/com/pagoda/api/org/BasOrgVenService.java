package com.pagoda.api.org;

import com.pagoda.api.dto.org.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 往来单位-011 供应商明细表服务接口BasOrgVenService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasOrgVen", description = "BasOrgVen api")
public interface BasOrgVenService extends Remote, BaseBasOrgVenService {}
