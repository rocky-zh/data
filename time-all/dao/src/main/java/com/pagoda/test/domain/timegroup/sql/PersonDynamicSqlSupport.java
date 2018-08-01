package com.pagoda.test.domain.timegroup.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.test.domain.timegroup.*;
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
  public static SqlColumn<Long> zid = personTable.zid;
  public static SqlColumn<Long> tid = personTable.tid;
  public static SqlColumn<java.util.Date> loginDateTime = personTable.loginDateTime;
  public static SqlColumn<java.util.Date> orderDate = personTable.orderDate;
  public static SqlColumn<java.util.Date> orderTime = personTable.orderTime;
  public static SqlColumn<java.util.Date> logoutTime = personTable.logoutTime;

  public static final class PersonTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);

    public final SqlColumn<Long> zid = column("zid", JDBCType.BIGINT);
    public final SqlColumn<Long> tid = column("tid", JDBCType.BIGINT);
    public final SqlColumn<java.util.Date> loginDateTime = column("login_date_time", JDBCType.DATE);
    public final SqlColumn<java.util.Date> orderDate = column("order_date", JDBCType.DATE);
    public final SqlColumn<java.util.Date> orderTime = column("order_time", JDBCType.DATE);
    public final SqlColumn<java.util.Date> logoutTime = column("logout_time", JDBCType.DATE);

    public PersonTable() {
      super("Person");
    }
  }
}
