package com.pagoda.api.goods;

import com.pagoda.api.dto.goods.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 机构销售商品定义服务接口BasOrgGoodsvarService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasOrgGoodsvar", description = "BasOrgGoodsvar api")
public interface BasOrgGoodsvarService extends Remote, BaseBasOrgGoodsvarService {}
