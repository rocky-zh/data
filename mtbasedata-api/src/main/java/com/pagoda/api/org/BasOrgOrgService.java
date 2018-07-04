package com.pagoda.api.org;

import com.pagoda.api.dto.org.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 往来单位-机构明细表服务接口BasOrgOrgService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasOrgOrg", description = "BasOrgOrg api")
public interface BasOrgOrgService extends Remote, BaseBasOrgOrgService {}
