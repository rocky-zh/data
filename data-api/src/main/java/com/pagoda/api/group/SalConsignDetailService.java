package com.pagoda.api.group;

import com.pagoda.api.dto.group.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * sal_consign_detail服务接口SalConsignDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SalConsignDetail", description = "SalConsignDetail api")
public interface SalConsignDetailService extends Remote, BaseSalConsignDetailService {}
