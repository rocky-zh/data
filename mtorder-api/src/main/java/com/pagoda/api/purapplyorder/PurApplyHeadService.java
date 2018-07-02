package com.pagoda.api.purapplyorder;

import com.pagoda.api.dto.purapplyorder.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 采购请购单头表服务接口PurApplyHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PurApplyHead", description = "PurApplyHead api")
public interface PurApplyHeadService extends Remote, BasePurApplyHeadService {}
