package com.pagoda.api.prilimitmanage;

import com.pagoda.api.dto.prilimitmanage.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 层级商品限价结果表(对层级价格限制最终结果)服务接口PriceLimitCatRecordService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceLimitCatRecord", description = "PriceLimitCatRecord api")
public interface PriceLimitCatRecordService extends Remote, BasePriceLimitCatRecordService {}
