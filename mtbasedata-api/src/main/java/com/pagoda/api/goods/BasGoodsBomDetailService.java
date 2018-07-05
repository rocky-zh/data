package com.pagoda.api.goods;

import com.pagoda.api.dto.goods.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * BOM投入商品明细表 服务接口BasGoodsBomDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasGoodsBomDetail", description = "BasGoodsBomDetail api")
public interface BasGoodsBomDetailService extends Remote, BaseBasGoodsBomDetailService {}
