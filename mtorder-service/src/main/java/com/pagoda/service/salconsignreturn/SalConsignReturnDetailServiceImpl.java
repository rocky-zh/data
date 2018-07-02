package com.pagoda.service.salconsignreturn;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.salconsignreturn.base.*;
import com.pagoda.api.*;
import com.pagoda.api.salconsignreturn.*;
import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.domain.salconsignreturn.*;
import com.pagoda.repo.salconsignreturn.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.salconsignreturn.sql.SalConsignReturnDetailDynamicSqlSupport.*;
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
 * 退货单明细表服务实现类SalConsignReturnDetailServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class SalConsignReturnDetailServiceImpl extends BaseSalConsignReturnDetailServiceImpl {}
