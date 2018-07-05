package com.pagoda.api.org;

import com.pagoda.api.dto.org.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 往来单位-虚拟机构组对应机构服务接口BasOrgGroupOrgService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasOrgGroupOrg", description = "BasOrgGroupOrg api")
public interface BasOrgGroupOrgService extends Remote, BaseBasOrgGroupOrgService {}
