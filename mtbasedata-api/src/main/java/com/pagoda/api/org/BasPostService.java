package com.pagoda.api.org;

import com.pagoda.api.dto.org.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 岗位表 服务接口BasPostService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasPost", description = "BasPost api")
public interface BasPostService extends Remote, BaseBasPostService {}
