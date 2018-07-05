package com.pagoda.api.cat;

import com.pagoda.api.dto.cat.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 目录分类表:全系统多维度树形结构表[包含：机构，供应商，部门，客户，库房...等] 1-level： tab服务接口BasCatClassService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasCatClass", description = "BasCatClass api")
public interface BasCatClassService extends Remote, BaseBasCatClassService {}
