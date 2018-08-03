package com.pagoda.test.domain.timegroup.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.test.domain.timegroup.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 司机定义实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasDriverDynamicSqlSupport {

  public static BasDriverTable basDriverTable = new BasDriverTable();
  public static SqlColumn<Long> id = basDriverTable.id;
  public static SqlColumn<Long> deleted = basDriverTable.deleted;
  public static SqlColumn<Date> createdAt = basDriverTable.createdAt;
  public static SqlColumn<String> creatorCode = basDriverTable.creatorCode;
  public static SqlColumn<String> creatorName = basDriverTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basDriverTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basDriverTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basDriverTable.modifierCode;
  public static SqlColumn<String> modifierName = basDriverTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basDriverTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basDriverTable.version;
  public static SqlColumn<String> mnemWord = basDriverTable.mnemWord;

  public static final class BasDriverTable extends SqlTable {
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

    public final SqlColumn<String> mnemWord = column("mnem_word", JDBCType.VARCHAR);

    public BasDriverTable() {
      super("BasDriver");
    }
  }
}
