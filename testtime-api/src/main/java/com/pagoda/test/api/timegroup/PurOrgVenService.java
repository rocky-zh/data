package com.pagoda.test.api.timegroup;

import com.pagoda.test.api.dto.timegroup.*;
import com.pagoda.test.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 供应商机构服务接口PurOrgVenService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PurOrgVen", description = "PurOrgVen api")
public interface PurOrgVenService extends Remote, BasePurOrgVenService {}
