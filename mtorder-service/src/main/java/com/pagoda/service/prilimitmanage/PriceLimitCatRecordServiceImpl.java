package com.pagoda.service.prilimitmanage;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.prilimitmanage.base.*;
import com.pagoda.api.*;
import com.pagoda.api.prilimitmanage.*;
import com.pagoda.api.dto.prilimitmanage.*;
import com.pagoda.domain.prilimitmanage.*;
import com.pagoda.repo.prilimitmanage.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.prilimitmanage.sql.PriceLimitCatRecordDynamicSqlSupport.*;
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
 * 层级商品限价结果表(对层级价格限制最终结果)服务实现类PriceLimitCatRecordServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PriceLimitCatRecordServiceImpl extends BasePriceLimitCatRecordServiceImpl
    implements PriceLimitCatRecordService {}
