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
public class BasTestGoodsDynamicSqlSupport {

  public static BasTestGoodsTable basTestGoodsTable = new BasTestGoodsTable();
  public static SqlColumn<Long> id = basTestGoodsTable.id;
  public static SqlColumn<Long> deleted = basTestGoodsTable.deleted;

  public static final class BasTestGoodsTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);

    public BasTestGoodsTable() {
      super("BasTestGoods");
    }
  }
}
