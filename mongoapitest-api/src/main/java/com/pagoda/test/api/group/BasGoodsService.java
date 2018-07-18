package com.pagoda.test.api.group;

import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 商品定义服务接口BasGoodsService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasGoods", description = "BasGoods api")
public interface BasGoodsService extends Remote, BaseBasGoodsService {}
