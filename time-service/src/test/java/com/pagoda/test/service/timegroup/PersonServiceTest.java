package com.pagoda.test.service.timegroup;

import com.pagoda.test.api.*;
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
public class PersonServiceTest {

  @Autowired PersonService service;

  @Test
  public void testFindBy() {
    System.out.println(service);
  }
}
