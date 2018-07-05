package com.pagoda.service.cat;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.cat.base.*;
import com.pagoda.api.*;
import com.pagoda.api.cat.*;
import com.pagoda.api.dto.cat.*;
import com.pagoda.domain.cat.*;
import com.pagoda.repo.cat.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.cat.sql.BasCatDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.update;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.swagger.annotations.*;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

/**
 * 目录定义1-level：tableid 包含：机构，供应商，客户，库房2-level: 服务实现类BasCatServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class BasCatServiceImpl extends BaseBasCatServiceImpl {}
