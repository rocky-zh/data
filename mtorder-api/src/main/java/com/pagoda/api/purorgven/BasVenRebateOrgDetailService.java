package com.pagoda.api.purorgven;

import com.pagoda.api.dto.purorgven.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 供应商返利到货机构明细表服务接口BasVenRebateOrgDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasVenRebateOrgDetail", description = "BasVenRebateOrgDetail api")
public interface BasVenRebateOrgDetailService extends Remote, BaseBasVenRebateOrgDetailService {}
