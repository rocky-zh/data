package com.pagoda.test.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.test.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 供应商机构实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class PurOrgVenDynamicSqlSupport {

  public static PurOrgVenTable purOrgVenTable = new PurOrgVenTable();
  public static SqlColumn<Long> id = purOrgVenTable.id;
  public static SqlColumn<Long> deleted = purOrgVenTable.deleted;
  public static SqlColumn<Date> createdAt = purOrgVenTable.createdAt;
  public static SqlColumn<String> creatorCode = purOrgVenTable.creatorCode;
  public static SqlColumn<String> creatorName = purOrgVenTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = purOrgVenTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = purOrgVenTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = purOrgVenTable.modifierCode;
  public static SqlColumn<String> modifierName = purOrgVenTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = purOrgVenTable.modifierOrgCode;
  public static SqlColumn<Integer> version = purOrgVenTable.version;
  public static SqlColumn<String> shortNum = purOrgVenTable.shortNum;

  public static final class PurOrgVenTable extends SqlTable {
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

    public final SqlColumn<String> shortNum = column("short_num", JDBCType.VARCHAR);

    public PurOrgVenTable() {
      super("PurOrgVen");
    }
  }
}
