package com.pagoda.repo.salorderhead;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.domain.salorderhead.*;
import com.pagoda.repo.salorderhead.custom.*;

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
 * SalPreOrderDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalPreOrderDetailRepository
    extends BaseSalPreOrderDetailRepository,
        SalPreOrderDetailRepositoryCustom,
        PagodaJpaRepository<SalPreOrderDetail, Long> {}
