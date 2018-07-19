package com.pagoda.test.api.group;

import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 目录定义 1-level： tableid 包含：机构，供应商，客户，库房 2-level: 服务接口BasCatService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasCat", description = "BasCat api")
public interface BasCatService extends Remote, BaseBasCatService {}
