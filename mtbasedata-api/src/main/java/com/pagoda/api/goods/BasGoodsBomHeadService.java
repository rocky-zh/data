package com.pagoda.api.goods;

import com.pagoda.api.dto.goods.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * BOM商品定义主表服务接口BasGoodsBomHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasGoodsBomHead", description = "BasGoodsBomHead api")
public interface BasGoodsBomHeadService extends Remote, BaseBasGoodsBomHeadService {}
