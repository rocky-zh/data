package com.test.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.jxls.common.Context;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReadStatus;
import org.jxls.reader.XLSReader;
import org.jxls.util.JxlsHelper;
import org.xml.sax.SAXException;

import java.util.*;
import java.io.*;

/**
 * http://wiki.pagoda.com.cn/pages/viewpage.action?pageId=5570836 使用jxls导入导出excel
 *
 * @author PagodaGenerator
 * @generated
 */
public class ExcelUtils {

  /**
   * 导入excel
   *
   * @param templateFile 导入的xml规则模板
   * @param excelFile 导入的excel文件
   * @param beans 存放导入的excel数据
   * @return
   * @throws IOException
   * @throws SAXException
   * @throws InvalidFormatException
   */
  public Optional<String> importExcel(InputStream templateFile, InputStream excelFile, Map beans)
      throws IOException, SAXException, InvalidFormatException {
    XLSReader reader = ReaderBuilder.buildFromXML(templateFile);
    XLSReadStatus status = reader.read(excelFile, beans);
    if (status.isStatusOK()) {
      return Optional.empty();
    }
    StringBuilder buf = new StringBuilder();
    status.getReadMessages().stream().forEach(msg -> buf.append(msg));
    return Optional.of(buf.toString());
  }

  /**
   * 导出excel
   *
   * @param templateFile 导出的模板文件
   * @param excelFile 导出的excel文件输出流
   * @param data 导出的数据
   * @throws IOException
   */
  public void exportExcel(InputStream templateFile, OutputStream excelFile, Map data)
      throws IOException {
    Context context = new Context(data);
    JxlsHelper.getInstance().processTemplate(templateFile, excelFile, context);
  }
}
