package com.pagoda.api.salorderhead;

import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 销售订单明细来源商品数量表服务接口SalOrderDetailGoodsQtyService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalOrderDetailGoodsQty", description = "SalOrderDetailGoodsQty api")
public interface SalOrderDetailGoodsQtyService extends Remote, BaseSalOrderDetailGoodsQtyService {}
