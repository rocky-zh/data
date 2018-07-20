package com.pagoda.repo.purorder;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.purorder.*;
import com.pagoda.domain.purorder.*;
import com.pagoda.repo.purorder.custom.*;

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
 * PurOrderDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PurOrderDetailRepository
    extends BasePurOrderDetailRepository,
        PurOrderDetailRepositoryCustom,
        PagodaJpaRepository<PurOrderDetail, Long> {}
