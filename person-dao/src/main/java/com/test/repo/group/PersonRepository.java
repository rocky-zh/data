package com.test.repo.group;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.test.api.dto.group.*;
import com.test.domain.group.*;
import com.test.repo.group.custom.*;

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
 * Person 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface PersonRepository
    extends BasePersonRepository, PersonRepositoryCustom, PagodaJpaRepository<Person, Long> {}
