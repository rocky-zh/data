package com.pagoda.test.service.timegroup;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.test.service.timegroup.base.*;
import com.pagoda.test.api.*;
import com.pagoda.test.api.timegroup.*;
import com.pagoda.test.api.dto.timegroup.*;
import com.pagoda.test.domain.timegroup.*;
import com.pagoda.test.repo.timegroup.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.test.domain.timegroup.sql.SalConsignDetailDynamicSqlSupport.*;
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
 * 发货单明细表服务实现类SalConsignDetailServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class SalConsignDetailServiceImpl extends BaseSalConsignDetailServiceImpl
    implements SalConsignDetailService {}
