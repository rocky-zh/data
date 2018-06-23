package com.pagoda.api.group;

import com.pagoda.api.dto.group.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 目录分类对象关系表服务接口BasCatClassRelService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasCatClassRel", description = "BasCatClassRel api")
public interface BasCatClassRelService extends Remote, BaseBasCatClassRelService {}
