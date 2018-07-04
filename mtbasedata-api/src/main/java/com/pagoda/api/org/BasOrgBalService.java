package com.pagoda.api.org;

import com.pagoda.api.dto.org.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 往来单位-015 结算机构明细表[注：开户行管理，不加字段，是取bas_org_bal_bank中默认的银行]服务接口BasOrgBalService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasOrgBal", description = "BasOrgBal api")
public interface BasOrgBalService extends Remote, BaseBasOrgBalService {}
