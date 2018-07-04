package com.pagoda.web;

import com.pagoda.config.ApplicationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MtbasedataUploadController {

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
      return true;

    } catch (IOException e) {
      log.error("UploadController.singleFileUpload", e);
    }
    return false;
  }
}
