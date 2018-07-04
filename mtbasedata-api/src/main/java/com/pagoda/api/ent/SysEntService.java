package com.pagoda.api.ent;

import com.pagoda.api.dto.ent.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 企业表服务接口SysEntService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "SysEnt", description = "SysEnt api")
public interface SysEntService extends Remote, BaseSysEntService {}
