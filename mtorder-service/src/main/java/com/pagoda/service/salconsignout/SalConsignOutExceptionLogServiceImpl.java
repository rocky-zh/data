package com.pagoda.service.salconsignout;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.salconsignout.base.*;
import com.pagoda.api.*;
import com.pagoda.api.salconsignout.*;
import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.domain.salconsignout.*;
import com.pagoda.repo.salconsignout.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.salconsignout.sql.SalConsignOutExceptionLogDynamicSqlSupport.*;
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
 * 发货出库异常记录表(每次出库异常插入新记录)服务实现类SalConsignOutExceptionLogServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class SalConsignOutExceptionLogServiceImpl
    extends BaseSalConsignOutExceptionLogServiceImpl {}
