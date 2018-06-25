package com.pagoda.api.group;

import com.pagoda.api.dto.group.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 虚拟机构组对应机构明细表服务接口BasOrgGroupOrgCopyCopyService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasOrgGroupOrgCopyCopy", description = "BasOrgGroupOrgCopyCopy api")
public interface BasOrgGroupOrgCopyCopyService extends Remote, BaseBasOrgGroupOrgCopyCopyService {}
