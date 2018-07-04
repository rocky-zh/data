package com.pagoda.service.org;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.org.base.*;
import com.pagoda.api.*;
import com.pagoda.api.org.*;
import com.pagoda.api.dto.org.*;
import com.pagoda.domain.org.*;
import com.pagoda.repo.org.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.org.sql.BasOrgVenDynamicSqlSupport.*;
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
 * 往来单位-011 供应商明细表服务实现类BasOrgVenServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class BasOrgVenServiceImpl extends BaseBasOrgVenServiceImpl {}
