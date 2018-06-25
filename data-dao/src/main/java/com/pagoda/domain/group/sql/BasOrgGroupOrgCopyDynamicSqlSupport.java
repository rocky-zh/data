package com.pagoda.domain.group.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.group.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 虚拟机构组对应机构明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgGroupOrgCopyDynamicSqlSupport {

  public static BasOrgGroupOrgCopyTable basOrgGroupOrgCopyTable = new BasOrgGroupOrgCopyTable();
  public static SqlColumn<Long> id = basOrgGroupOrgCopyTable.id;
  public static SqlColumn<Long> deleted = basOrgGroupOrgCopyTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgGroupOrgCopyTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgGroupOrgCopyTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgGroupOrgCopyTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgGroupOrgCopyTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgGroupOrgCopyTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgGroupOrgCopyTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgGroupOrgCopyTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgGroupOrgCopyTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgGroupOrgCopyTable.version;
  public static SqlColumn<String> orgGroupCode = basOrgGroupOrgCopyTable.orgGroupCode;
  public static SqlColumn<Long> orgGroupId = basOrgGroupOrgCopyTable.orgGroupId;
  public static SqlColumn<String> orgGroupName = basOrgGroupOrgCopyTable.orgGroupName;
  public static SqlColumn<String> orgOrgCode = basOrgGroupOrgCopyTable.orgOrgCode;
  public static SqlColumn<Long> orgOrgId = basOrgGroupOrgCopyTable.orgOrgId;
  public static SqlColumn<String> orgOrgName = basOrgGroupOrgCopyTable.orgOrgName;

  public static final class BasOrgGroupOrgCopyTable extends SqlTable {
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

    public final SqlColumn<String> orgGroupCode = column("org_group_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> orgGroupId = column("org_group_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgGroupName = column("org_group_name", JDBCType.VARCHAR);
    public final SqlColumn<String> orgOrgCode = column("org_org_code", JDBCType.VARCHAR);
    public final SqlColumn<Long> orgOrgId = column("org_org_id", JDBCType.BIGINT);
    public final SqlColumn<String> orgOrgName = column("org_org_name", JDBCType.VARCHAR);

    public BasOrgGroupOrgCopyTable() {
      super("BasOrgGroupOrgCopy");
    }
  }
}
