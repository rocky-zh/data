package com.test.api.group;

import com.test.api.dto.group.*;
import com.test.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * person服务接口PersonService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "Person", description = "Person api")
public interface PersonService extends Remote, BasePersonService {}
