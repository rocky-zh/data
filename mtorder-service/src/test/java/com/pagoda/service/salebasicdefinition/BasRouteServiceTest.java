package com.pagoda.service.salebasicdefinition;

import com.pagoda.api.*;
import com.pagoda.api.salebasicdefinition.*;
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
public class BasRouteServiceTest {

  @Autowired BasRouteService service;

  @Test
  public void testFindBy() {
    System.out.println(service);
  }
}
