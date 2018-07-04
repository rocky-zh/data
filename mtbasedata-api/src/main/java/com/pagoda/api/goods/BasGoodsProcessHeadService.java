package com.pagoda.api.goods;

import com.pagoda.api.dto.goods.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 生产工艺定义主表服务接口BasGoodsProcessHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasGoodsProcessHead", description = "BasGoodsProcessHead api")
public interface BasGoodsProcessHeadService extends Remote, BaseBasGoodsProcessHeadService {}
