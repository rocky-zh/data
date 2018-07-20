package com.pagoda.repo.driverdata;

import com.pagoda.domain.driverdata.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author PagodaGenerator
 * @generated
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BasDriverRepositoryTest {
  // @DataJpaTest
  // @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

  @Autowired BasDriverRepository repository;

  @Test
  public void testFindBy() {}
}
