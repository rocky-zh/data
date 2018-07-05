package com.pagoda.api.cat;

import com.pagoda.api.dto.cat.*;
import com.pagoda.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 目录分类扩展表服务接口BasCatClassExtService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "BasCatClassExt", description = "BasCatClassExt api")
public interface BasCatClassExtService extends Remote, BaseBasCatClassExtService {}
