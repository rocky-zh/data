package com.pagoda.web;

import com.pagoda.config.ApplicationProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 处理上传文件
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@Slf4j
public class MtorderUploadController {

  @Autowired private ApplicationProperties applicationProperties;

  @PostMapping("/upload")
  @ResponseBody
  public boolean singleFileUpload(@RequestParam("file") MultipartFile file) {

    if (file.isEmpty()) {
      return false;
    }
    try {
      // Get the file and save it somewhere
      byte[] bytes = file.getBytes();
      Path path = Paths.get(applicationProperties.getUploadFolder() + file.getOriginalFilename());
      Files.write(path, bytes);

      // 发布文件上传事件
      FileUploadEvent fileUploadEvent = new FileUploadEvent(this, path);
      fileUploadEvent.setTarget(target);
      fileUploadEvent.setParams(params);
      applicationEventPublisher.publishEvent(fileUploadEvent);
      return true;

    } catch (IOException e) {
      log.error("UploadController.singleFileUpload", e);
    }
    return false;
  }

  @Data
  static class FileUploadEvent extends ApplicationEvent {

    /** 调用的服务 */
    private String target;

    /** 传给服务的参数 */
    private String params;

    private Path filePath;

    public FileUploadEvent(Object source, Path filePath) {
      super(source);
      this.filePath = filePath;
    }
  }
}
