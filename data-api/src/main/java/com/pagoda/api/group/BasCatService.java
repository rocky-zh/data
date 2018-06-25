package com.pagoda.api.group;

import com.pagoda.api.dto.group.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 目录定义服务接口BasCatService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasCat", description = "BasCat api")
public interface BasCatService extends Remote, BaseBasCatService {}
