package com.pagoda.api.goods;

import com.pagoda.api.dto.goods.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 商品分类(基本分类的一级分类)与代码规则关系表服务接口BasGoodsClassCodeRuleService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasGoodsClassCodeRule", description = "BasGoodsClassCodeRule api")
public interface BasGoodsClassCodeRuleService extends Remote, BaseBasGoodsClassCodeRuleService {}
