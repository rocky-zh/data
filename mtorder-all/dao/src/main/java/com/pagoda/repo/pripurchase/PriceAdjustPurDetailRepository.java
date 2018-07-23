package com.pagoda.repo.pripurchase;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.pripurchase.*;
import com.pagoda.domain.pripurchase.*;
import com.pagoda.repo.pripurchase.custom.*;

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
 * PriceAdjustPurDetail 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PriceAdjustPurDetailRepository
    extends BasePriceAdjustPurDetailRepository,
        PriceAdjustPurDetailRepositoryCustom,
        PagodaJpaRepository<PriceAdjustPurDetail, Long> {}
