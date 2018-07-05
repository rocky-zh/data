package com.pagoda.api.cat;

import com.pagoda.api.dto.cat.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 目录定义1-level：tableid 包含：机构，供应商，客户，库房2-level: 服务接口BasCatService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasCat", description = "BasCat api")
public interface BasCatService extends Remote, BaseBasCatService {}
