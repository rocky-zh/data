package com.pagoda.api.goods;

import com.pagoda.api.dto.goods.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 生产工艺明细表服务接口BasGoodsProcessDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasGoodsProcessDetail", description = "BasGoodsProcessDetail api")
public interface BasGoodsProcessDetailService extends Remote, BaseBasGoodsProcessDetailService {}
