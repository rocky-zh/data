package com.pagoda.util;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.model.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PreDestroy;
import java.io.File;
import java.io.InputStream;

/**
 * 封装腾讯云cos文件调用
 *
 * @author PagodaGenerator
 * @generated
 */
@Slf4j
@Data
public class FileStorage {

  private final COSClient cosClient;
  private final String appId;

  public FileStorage(COSClient cosClient, String appId) {
    this.cosClient = cosClient;
    this.appId = appId;
  }

  /**
   * 将文件上传到腾讯云cos
   *
   * @param localFile 要上传的文件
   * @param uploadFolder cos存放的文件夹名称
   * @param uploadFileKey cos存放文件的key
   * @return
   */
  public String uploadFile(File localFile, String uploadFolder, String uploadFileKey) {
    // bucket的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
    String bucketName = uploadFolder + "-" + appId;
    PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, uploadFileKey, localFile);
    // 设置存储类型, 默认是标准(Standard), 低频(standard_ia)
    putObjectRequest.setStorageClass(StorageClass.Standard_IA);
    PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
    // putobjectResult会返回文件的etag
    String etag = putObjectResult.getETag();
    return etag;
  }

  /**
   * 将文件上传到腾讯云cos
   *
   * @param fileStream 要上传的文件输入流
   * @param contentLength 上传文件的大小
   * @param contentType 上传的文件格式
   * @param uploadFolder cos存放的文件夹名称
   * @param uploadFileKey cos存放文件的key
   * @return
   */
  public String uploadFileStream(
      InputStream fileStream,
      int contentLength,
      String contentType,
      String uploadFolder,
      String uploadFileKey) {
    ObjectMetadata objectMetadata = new ObjectMetadata();
    // 从输入流上传必须制定content length, 否则http客户端可能会缓存所有数据，存在内存OOM的情况
    objectMetadata.setContentLength(contentLength);
    // 默认下载时根据cos路径key的后缀返回响应的contenttype, 上传时设置contenttype会覆盖默认值
    objectMetadata.setContentType(contentType);

    String bucketName = uploadFolder + "-" + appId;
    PutObjectRequest putObjectRequest =
        new PutObjectRequest(bucketName, uploadFileKey, fileStream, objectMetadata);
    // 设置存储类型, 默认是标准(Standard), 低频(standard_ia)
    putObjectRequest.setStorageClass(StorageClass.Standard_IA);
    PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
    // putobjectResult会返回文件的etag
    String etag = putObjectResult.getETag();
    return etag;
  }

  /**
   * 从腾讯云cos下载文件
   *
   * @param downFile 指定要下载到的本地路径
   * @param cosFolder 指定要下载的文件所在的cos文件夹
   * @param fileKey 指定要下载的文件的key
   */
  public void downloadFile(File downFile, String cosFolder, String fileKey) {
    String bucketName = cosFolder + "-" + appId;
    // 指定要下载的文件所在的 bucket 和对象键
    GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, fileKey);
    ObjectMetadata downObjectMeta = cosClient.getObject(getObjectRequest, downFile);
  }

  /**
   * 删除文件
   *
   * @param cosFolder 指定要删除的文件所在的cos文件夹
   * @param fileKey 指定要删除的文件的key
   */
  public void deleteFile(String cosFolder, String fileKey) {
    String bucketName = cosFolder + "-" + appId;
    // 指定要删除的 bucket 和对象键
    cosClient.deleteObject(bucketName, fileKey);
  }

  @PreDestroy
  public void destroy() {
    // 关闭客户端(关闭后台线程)
    cosClient.shutdown();
  }
}
