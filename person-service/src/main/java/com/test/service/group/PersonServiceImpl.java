package com.test.service.group;

import com.pagoda.platform.jms.jpa.*;
import com.test.service.group.base.*;
import com.test.api.*;
import com.test.api.group.*;
import com.test.api.dto.group.*;
import com.test.domain.group.*;
import com.test.repo.group.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.test.domain.group.sql.PersonDynamicSqlSupport.*;
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
 * person服务实现类PersonServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PersonServiceImpl extends BasePersonServiceImpl implements PersonService {}
