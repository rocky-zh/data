package com.pagoda.api.goods;

import com.pagoda.api.dto.goods.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 商品单位转换比服务接口BasGoodsUnitService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasGoodsUnit", description = "BasGoodsUnit api")
public interface BasGoodsUnitService extends Remote, BaseBasGoodsUnitService {}
