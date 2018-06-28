package com.pagoda.api.分组;

import com.pagoda.api.dto.分组.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 目录分类表服务接口BasCatClassService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasCatClass", description = "BasCatClass api")
public interface BasCatClassService extends Remote, BaseBasCatClassService {}
