package com.pagoda.service.group;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.group.base.*;
import com.pagoda.api.*;
import com.pagoda.api.group.*;
import com.pagoda.api.dto.group.*;
import com.pagoda.domain.group.*;
import com.pagoda.repo.group.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.group.sql.SalOrderControlDynamicSqlSupport.*;
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
