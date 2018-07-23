package com.pagoda.config;

import com.pagoda.util.FileStorage;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.region.Region;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

/**
 * 腾讯云COS配置
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
@ConditionalOnProperty(name = "tecent.cos.enabled", havingValue = "true", matchIfMissing = false)
public class FileStorageConfiguration {

  @Value("${tecent.cos.secretId}")
  private String secretId;

  @Value("${tecent.cos.secretKey}")
  private String secretKey;

  @Value("${tecent.cos.region}")
  private String region;

  @Value("${tecent.cos.appId}")
  private String appId;

  public FileStorage fileStorage() {
    // 1 初始化用户身份信息(secretId, secretKey)
    COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
    // 2 设置bucket的区域, COS地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
    ClientConfig clientConfig = new ClientConfig(new Region(region));
    // 3 生成cos客户端
    COSClient cosclient = new COSClient(cred, clientConfig);
    // bucket的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
    //        String bucketName = "mybucket-1251668577";
    FileStorage fileStorage = new FileStorage(cosclient, appId);
    return fileStorage;
  }
}
