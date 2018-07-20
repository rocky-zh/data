package com.pagoda.api.purorgven;

import com.pagoda.api.dto.purorgven.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 供应商返利头表服务接口BasVenRebateHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasVenRebateHead", description = "BasVenRebateHead api")
public interface BasVenRebateHeadService extends Remote, BaseBasVenRebateHeadService {}
