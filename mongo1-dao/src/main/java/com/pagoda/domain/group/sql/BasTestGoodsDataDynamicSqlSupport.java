package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 商品定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasTestGoodsDataDynamicSqlSupport {

  public static BasTestGoodsDataTable basTestGoodsDataTable = new BasTestGoodsDataTable();
  public static SqlColumn<Long> id = basTestGoodsDataTable.id;
  public static SqlColumn<Long> deleted = basTestGoodsDataTable.deleted;

  public static final class BasTestGoodsDataTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);

    public BasTestGoodsDataTable() {
      super("BasTestGoodsData");
    }
  }
}
