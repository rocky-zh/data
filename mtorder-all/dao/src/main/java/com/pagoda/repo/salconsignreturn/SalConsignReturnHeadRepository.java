package com.pagoda.repo.salconsignreturn;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.domain.salconsignreturn.*;
import com.pagoda.repo.salconsignreturn.custom.*;

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
 * SalConsignReturnHead 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalConsignReturnHeadRepository
    extends BaseSalConsignReturnHeadRepository,
        SalConsignReturnHeadRepositoryCustom,
        PagodaJpaRepository<SalConsignReturnHead, Long> {}
