package com.pagoda.api.group;

import com.pagoda.api.dto.group.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 结算机构开户行表服务接口BasOrgBalBankService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasOrgBalBank", description = "BasOrgBalBank api")
public interface BasOrgBalBankService extends Remote, BaseBasOrgBalBankService {}
