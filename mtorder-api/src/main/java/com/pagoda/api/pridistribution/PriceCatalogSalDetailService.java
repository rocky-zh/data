package com.pagoda.api.pridistribution;

import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 配送价格目录定义明细表服务接口PriceCatalogSalDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceCatalogSalDetail", description = "PriceCatalogSalDetail api")
public interface PriceCatalogSalDetailService extends Remote, BasePriceCatalogSalDetailService {}
