package com.pagoda.api.pridistribution;

import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * sal_org_cus服务接口SalOrgCusService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalOrgCus", description = "SalOrgCus api")
public interface SalOrgCusService extends Remote, BaseSalOrgCusService {}
