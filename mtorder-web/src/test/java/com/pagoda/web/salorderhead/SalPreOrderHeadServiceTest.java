package com.pagoda.web.salorderhead;

import com.pagoda.api.salorderhead.*;
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
public class SalPreOrderHeadServiceTest {

  @Autowired SalPreOrderHeadService service;

  @Test
  public void testFindBy() {
    System.out.println(service);
  }
}
