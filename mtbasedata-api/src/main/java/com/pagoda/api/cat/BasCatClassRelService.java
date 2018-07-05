package com.pagoda.api.cat;

import com.pagoda.api.dto.cat.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 目录分类关系表服务接口BasCatClassRelService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasCatClassRel", description = "BasCatClassRel api")
public interface BasCatClassRelService extends Remote, BaseBasCatClassRelService {}
