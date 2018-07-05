package com.pagoda.service.ven;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.service.ven.base.*;
import com.pagoda.api.*;
import com.pagoda.api.ven.*;
import com.pagoda.api.dto.ven.*;
import com.pagoda.domain.ven.*;
import com.pagoda.repo.ven.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.domain.ven.sql.PurOrgVenDynamicSqlSupport.*;
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
 * 供应商机构服务实现类PurOrgVenServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PurOrgVenServiceImpl extends BasePurOrgVenServiceImpl {}
