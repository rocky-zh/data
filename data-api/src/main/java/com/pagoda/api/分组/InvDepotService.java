package com.pagoda.api.分组;

import com.pagoda.api.dto.分组.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 库房定义服务接口InvDepotService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "InvDepot", description = "InvDepot api")
public interface InvDepotService extends Remote, BaseInvDepotService {}
