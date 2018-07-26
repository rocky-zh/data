package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * person实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PersonDynamicSqlSupport {

  public static PersonTable personTable = new PersonTable();
  public static SqlColumn<Long> id = personTable.id;
  public static SqlColumn<Long> deleted = personTable.deleted;
  public static SqlColumn<java.util.Date> orderTime = personTable.orderTime;

  public static final class PersonTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);

    public final SqlColumn<java.util.Date> orderTime = column("order_time", JDBCType.DATE);

    public PersonTable() {
      super("Person");
    }
  }
}
