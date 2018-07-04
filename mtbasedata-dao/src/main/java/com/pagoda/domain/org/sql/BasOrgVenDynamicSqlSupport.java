package com.pagoda.domain.org.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.org.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 往来单位-011 供应商明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgVenDynamicSqlSupport {

  public static BasOrgVenTable basOrgVenTable = new BasOrgVenTable();
  public static SqlColumn<Long> id = basOrgVenTable.id;
  public static SqlColumn<Long> deleted = basOrgVenTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgVenTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgVenTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgVenTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgVenTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgVenTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgVenTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgVenTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgVenTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgVenTable.version;
  public static SqlColumn<Integer> isOpenSrm = basOrgVenTable.isOpenSrm;
  public static SqlColumn<Long> orgId = basOrgVenTable.orgId;
  public static SqlColumn<Integer> enabledStatus = basOrgVenTable.enabledStatus;

  public static final class BasOrgVenTable extends SqlTable {
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

    public final SqlColumn<Integer> isOpenSrm = column("is_open_srm", JDBCType.INTEGER);
    public final SqlColumn<Long> orgId = column("org_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> enabledStatus = column("enabled_status", JDBCType.INTEGER);

    public BasOrgVenTable() {
      super("BasOrgVen");
    }
  }
}
