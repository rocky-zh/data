package com.pagoda.config;

import io.micrometer.core.annotation.Timed;
import org.apache.http.*;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

import javax.net.ssl.SSLException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * HttpClient，RestTemplate配置类，可用于调用其他的Rest API接口
 *
 * @author PagodaGenerator generated
 */
@Configuration
public class HttpConfiguration {

  /** 关闭空闲连接, 单位分钟 */
  @Value("${httpClient.maxIdleTime}")
  private int maxIdleTime;

  /** 最大连接数 */
  @Value("${httpClient.maxTotal}")
  private int maxTotal;

  /** 单个host最大连接 */
  @Value("${httpClient.maxPerRoute}")
  private int maxPerRoute;

  /** 连接超时, 单位毫秒 */
  @Value("${httpClient.timeout}")
  private int timeout;

  /**
   * Spring封装类，可用于调用其他的Rest API接口
   *
   * @param requestFactory
   * @return
   */
  @Bean
  @ConditionalOnMissingBean
  public RestTemplate restTemplate(HttpComponentsClientHttpRequestFactory requestFactory) {
    RestTemplate restTemplate = new RestTemplate(requestFactory);

    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    List<MediaType> mediaTypes = new ArrayList<>();
    mediaTypes.add(MediaType.TEXT_PLAIN);
    mediaTypes.add(MediaType.TEXT_HTML);
    converter.setSupportedMediaTypes(mediaTypes);

    restTemplate.getMessageConverters().add(converter);
    return restTemplate;
  }

  /**
   * apache封装类，可用于调用其他的Rest API接口
   *
   * @param connectionManager
   * @param httpRequestExecutor
   * @return
   * @throws Exception
   */
  @Bean
  @ConditionalOnMissingBean
  public CloseableHttpClient httpClient(
      PoolingHttpClientConnectionManager connectionManager, HttpRequestExecutor httpRequestExecutor)
      throws Exception {
    CloseableHttpClient httpclient =
        createHttpClient(
            connectionManager, httpRequestExecutor, maxTotal, maxPerRoute, timeout, maxIdleTime);
    return httpclient;
  }

  /**
   * http连接池
   *
   * @return
   */
  @Bean
  @ConditionalOnMissingBean
  public PoolingHttpClientConnectionManager getConnectionManager() {
    return new PoolingHttpClientConnectionManager();
  }

  @Bean
  @ConditionalOnMissingBean
  public HttpRequestExecutor httpRequestExecutor(
      PoolingHttpClientConnectionManager connectionManager) {
    return new InstrumentedHttpRequestExecutor(connectionManager);
  }

  @Bean
  @ConditionalOnMissingBean
  public HttpComponentsClientHttpRequestFactory requestFactory(
      CloseableHttpClient closeableHttpClient) {
    // destroy 时会close掉httpclient
    return new HttpComponentsClientHttpRequestFactory(closeableHttpClient);
  }

  private static CloseableHttpClient createHttpClient(
      PoolingHttpClientConnectionManager connectionManager,
      HttpRequestExecutor httpRequestExecutor,
      int maxTotal,
      int maxPerRoute,
      int timeout,
      int maxIdleTime)
      throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
    // 将最大连接数增加
    connectionManager.setMaxTotal(maxTotal);
    // 将每个路由基础的连接增加
    connectionManager.setDefaultMaxPerRoute(maxPerRoute);
    connectionManager.setDefaultSocketConfig(
        SocketConfig.copy(SocketConfig.DEFAULT).setTcpNoDelay(true).setSoTimeout(timeout).build());

    SSLContextBuilder sslBuilder = SSLContextBuilder.create();
    sslBuilder.loadTrustMaterial(new TrustSelfSignedStrategy());
    SSLConnectionSocketFactory sf = new SSLConnectionSocketFactory(sslBuilder.build());

    RequestConfig requestConfig =
        RequestConfig.custom()
            // 连接池满，等待获取连接的超时值
            .setConnectionRequestTimeout(timeout * 2)
            .setSocketTimeout(timeout)
            .setConnectTimeout(timeout)
            .setRedirectsEnabled(true)
            .build();

    // create client with shared connection pool and loose ssl policy
    CloseableHttpClient httpClient =
        HttpClients.custom()
            .setSSLSocketFactory(sf)
            .setConnectionManager(connectionManager)
            .setDefaultRequestConfig(requestConfig)
            .setConnectionManagerShared(false)
            .setRequestExecutor(httpRequestExecutor)
            .evictExpiredConnections()
            .evictIdleConnections(maxIdleTime, TimeUnit.MINUTES)
            //                .setRetryHandler(httpRequestRetryHandler)
            .build();
    return httpClient;
  }

  /** 可以拦截http请求 */
  public static class InstrumentedHttpRequestExecutor extends HttpRequestExecutor {
    private final PoolingHttpClientConnectionManager connectionManager;

    public InstrumentedHttpRequestExecutor(PoolingHttpClientConnectionManager connectionManager) {
      this.connectionManager = connectionManager;
    }

    @Timed
    @Override
    public HttpResponse execute(HttpRequest request, HttpClientConnection conn, HttpContext context)
        throws HttpException, IOException {
      return super.execute(request, conn, context);
    }

    private static URI requestURI(HttpRequest request) {
      if (request instanceof HttpRequestWrapper) {
        return requestURI(((HttpRequestWrapper) request).getOriginal());
      }
      return (request instanceof HttpUriRequest)
          ? ((HttpUriRequest) request).getURI()
          : URI.create(request.getRequestLine().getUri());
    }
  }

  /**
   * http://blog.csdn.net/minicto/article/details/56677420
   *
   * @return
   */
  HttpRequestRetryHandler getRetryHandler(final int maxRetryCount) {
    HttpRequestRetryHandler myRetryHandler =
        new HttpRequestRetryHandler() {

          @Override
          public boolean retryRequest(
              IOException exception, int executionCount, HttpContext context) {
            if (executionCount >= maxRetryCount) {
              // Do not retry if over max retry count
              return false;
            }
            if (exception instanceof InterruptedIOException) {
              // Timeout
              return false;
            }
            if (exception instanceof UnknownHostException) {
              // Unknown host
              return false;
            }
            if (exception instanceof ConnectTimeoutException) {
              // Connection refused
              return false;
            }
            if (exception instanceof SSLException) {
              // SSL handshake exception
              return false;
            }
            HttpClientContext clientContext = HttpClientContext.adapt(context);
            HttpRequest request = clientContext.getRequest();
            boolean idempotent = !(request instanceof HttpEntityEnclosingRequest);
            if (idempotent) {
              // Retry if the request is considered idempotent
              return true;
            }
            return false;
          }
        };
    return myRetryHandler;
  }
}
