package com.pagoda.service.ven;

import com.pagoda.api.*;
import com.pagoda.api.ven.*;
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
public class BasVenRebateGoodsDetailServiceTest {

  @Autowired BasVenRebateGoodsDetailService service;

  @Test
  public void testFindBy() {
    System.out.println(service);
  }
}
