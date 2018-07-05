package com.pagoda.api.org;

import com.pagoda.api.dto.org.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 往来单位-016 结算机构开户行表 服务接口BasOrgBalBankService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasOrgBalBank", description = "BasOrgBalBank api")
public interface BasOrgBalBankService extends Remote, BaseBasOrgBalBankService {}
