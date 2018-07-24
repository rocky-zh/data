package com.pagoda.test.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 处理上传文件
 *
 * @author PagodaGenerator
 * @generated
 */
@Slf4j
@Component
public class FileUploadEventListener
    implements ApplicationListener<HelloUploadController.FileUploadEvent> {

  @Override
  public void onApplicationEvent(HelloUploadController.FileUploadEvent event) {
    log.debug("Received file upload event | filePath={} | event={}", event.getFilePath(), event);
    // 待业务处理
  }
}
