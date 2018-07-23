package com.pagoda.service.salebasicdefinition;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.salebasicdefinition.base.*;
import com.pagoda.api.*;
import com.pagoda.api.salebasicdefinition.*;
import com.pagoda.api.dto.salebasicdefinition.*;
import com.pagoda.domain.salebasicdefinition.*;
import com.pagoda.repo.salebasicdefinition.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.salebasicdefinition.sql.BasWrapperWithGoodsDynamicSqlSupport.*;
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
 * 单品包装物带出清单服务实现类BasWrapperWithGoodsServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class BasWrapperWithGoodsServiceImpl extends BaseBasWrapperWithGoodsServiceImpl
    implements BasWrapperWithGoodsService {}
