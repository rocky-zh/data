package com.pagoda.test.api.group;

import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 盘点单头表服务接口InvCheckStockHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "InvCheckStockHead", description = "InvCheckStockHead api")
public interface InvCheckStockHeadService extends Remote, BaseInvCheckStockHeadService {}
