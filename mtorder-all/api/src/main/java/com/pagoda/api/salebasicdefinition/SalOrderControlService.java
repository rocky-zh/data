package com.pagoda.api.salebasicdefinition;

import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 按客户维度进行配送订单、退货、货款等方面的控制服务接口SalOrderControlService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalOrderControl", description = "SalOrderControl api")
public interface SalOrderControlService extends Remote, BaseSalOrderControlService {}
