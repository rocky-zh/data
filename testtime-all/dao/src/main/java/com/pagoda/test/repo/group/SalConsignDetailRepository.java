package com.pagoda.test.repo.group;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.test.api.dto.group.*;
import com.pagoda.test.domain.group.*;
import com.pagoda.test.repo.group.custom.*;

import java.util.*;
import java.util.concurrent.*;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * SalConsignDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignDetailRepository
    extends BaseSalConsignDetailRepository,
        SalConsignDetailRepositoryCustom,
        PagodaJpaRepository<SalConsignDetail, Long> {}
