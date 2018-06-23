package com.pagoda.api.group;

import com.pagoda.api.dto.group.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * pur_apply_detail服务接口PurApplyDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PurApplyDetail", description = "PurApplyDetail api")
public interface PurApplyDetailService extends Remote, BasePurApplyDetailService {}
