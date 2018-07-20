package com.pagoda.api.salebasicdefinition;

import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 单品包装物带出清单服务接口BasWrapperWithGoodsService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasWrapperWithGoods", description = "BasWrapperWithGoods api")
public interface BasWrapperWithGoodsService extends Remote, BaseBasWrapperWithGoodsService {}
