package com.pagoda.domain.salconsignout.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.salconsignout.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 发货出库异常记录表(每次出库异常插入新记录)实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SalConsignOutExceptionLogDynamicSqlSupport {

  public static SalConsignOutExceptionLogTable salConsignOutExceptionLogTable =
      new SalConsignOutExceptionLogTable();
  public static SqlColumn<Long> id = salConsignOutExceptionLogTable.id;
  public static SqlColumn<Long> deleted = salConsignOutExceptionLogTable.deleted;
  public static SqlColumn<Date> createdAt = salConsignOutExceptionLogTable.createdAt;
  public static SqlColumn<String> creatorCode = salConsignOutExceptionLogTable.creatorCode;
  public static SqlColumn<String> creatorName = salConsignOutExceptionLogTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = salConsignOutExceptionLogTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = salConsignOutExceptionLogTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = salConsignOutExceptionLogTable.modifierCode;
  public static SqlColumn<String> modifierName = salConsignOutExceptionLogTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = salConsignOutExceptionLogTable.modifierOrgCode;
  public static SqlColumn<Integer> version = salConsignOutExceptionLogTable.version;
  public static SqlColumn<java.math.BigDecimal> amount = salConsignOutExceptionLogTable.amount;

  public static final class SalConsignOutExceptionLogTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);

    public final SqlColumn<Date> createdAt = column("created_at", JDBCType.DATE);
    public final SqlColumn<String> creatorCode = column("creator_code", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorName = column("creator_name", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorOrgCode = column("creator_org_code", JDBCType.VARCHAR);
    public final SqlColumn<String> lastModifiedAt = column("last_modified_at", JDBCType.DATE);
    public final SqlColumn<String> modifierName = column("modifier_name", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierCode = column("modifier_code", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierOrgCode = column("modifier_org_code", JDBCType.VARCHAR);
    public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

    public final SqlColumn<java.math.BigDecimal> amount = column("amount", JDBCType.DECIMAL);

    public SalConsignOutExceptionLogTable() {
      super("SalConsignOutExceptionLog");
    }
  }
}
