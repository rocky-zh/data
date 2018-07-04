package com.pagoda.api.org;

import com.pagoda.api.dto.org.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * bas_district服务接口BasDistrictService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasDistrict", description = "BasDistrict api")
public interface BasDistrictService extends Remote, BaseBasDistrictService {}
