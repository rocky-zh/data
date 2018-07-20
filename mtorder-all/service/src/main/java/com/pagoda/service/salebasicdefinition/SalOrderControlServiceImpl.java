package com.pagoda.service.salebasicdefinition;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.salebasicdefinition.base.*;
import com.pagoda.api.*;
import com.pagoda.api.salebasicdefinition.*;
import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.domain.salebasicdefinition.*;
import com.pagoda.repo.salebasicdefinition.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.salebasicdefinition.sql.SalOrderControlDynamicSqlSupport.*;
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
 * 按客户维度进行配送订单、退货、货款等方面的控制服务实现类SalOrderControlServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class SalOrderControlServiceImpl extends BaseSalOrderControlServiceImpl
    implements SalOrderControlService {}
