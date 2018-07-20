package com.pagoda.service.purorgven;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.purorgven.base.*;
import com.pagoda.api.*;
import com.pagoda.api.purorgven.*;
import com.pagoda.api.dto.purorgven.*;
import com.pagoda.domain.purorgven.*;
import com.pagoda.repo.purorgven.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.purorgven.sql.BasVenRebateGoodsDetailDynamicSqlSupport.*;
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
 * 供应商返利商品明细表服务实现类BasVenRebateGoodsDetailServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class BasVenRebateGoodsDetailServiceImpl extends BaseBasVenRebateGoodsDetailServiceImpl
    implements BasVenRebateGoodsDetailService {}
