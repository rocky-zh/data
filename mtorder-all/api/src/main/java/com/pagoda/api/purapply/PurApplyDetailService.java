package com.pagoda.api.purapply;

import com.pagoda.api.dto.purapply.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 采购请购单明细表服务接口PurApplyDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PurApplyDetail", description = "PurApplyDetail api")
public interface PurApplyDetailService extends Remote, BasePurApplyDetailService {}
