package com.pagoda.test.web.timegroup;

import com.pagoda.test.api.timegroup.*;
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
public class SalConsignDetailServiceTest {

  @Autowired SalConsignDetailService service;

  @Test
  public void testFindBy() {
    System.out.println(service);
  }
}