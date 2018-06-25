package com.pagoda.api.group;

import com.pagoda.api.dto.group.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 省份城市数据服务接口BasDistrictService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasDistrict", description = "BasDistrict api")
public interface BasDistrictService extends Remote, BaseBasDistrictService {}
