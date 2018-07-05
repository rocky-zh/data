package com.pagoda.domain.ent.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.ent.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 企业表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class SysEntDynamicSqlSupport {

  public static SysEntTable sysEntTable = new SysEntTable();
  public static SqlColumn<Long> id = sysEntTable.id;
  public static SqlColumn<Long> deleted = sysEntTable.deleted;
  public static SqlColumn<Date> createdAt = sysEntTable.createdAt;
  public static SqlColumn<String> creatorCode = sysEntTable.creatorCode;
  public static SqlColumn<String> creatorName = sysEntTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = sysEntTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = sysEntTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = sysEntTable.modifierCode;
  public static SqlColumn<String> modifierName = sysEntTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = sysEntTable.modifierOrgCode;
  public static SqlColumn<Integer> version = sysEntTable.version;
  public static SqlColumn<String> entCode = sysEntTable.entCode;
  public static SqlColumn<String> entName = sysEntTable.entName;
  public static SqlColumn<Integer> isEnabled = sysEntTable.isEnabled;

  public static final class SysEntTable extends SqlTable {
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

    public final SqlColumn<String> entCode = column("ent_code", JDBCType.VARCHAR);
    public final SqlColumn<String> entName = column("ent_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> isEnabled = column("is_enabled", JDBCType.INTEGER);

    public SysEntTable() {
      super("SysEnt");
    }
  }
}
