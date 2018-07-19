package com.pagoda.test.repo.group;

import com.pagoda.test.domain.group.*;
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
public class BasCatRepositoryTest {
  // @DataJpaTest
  // @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

  @Autowired BasCatRepository repository;

  @Test
  public void testFindBy() {}
}
