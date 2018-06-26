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
public class BasOrgGroupOrgCopyCopyDynamicSqlSupport {

  public static BasOrgGroupOrgCopyCopyTable basOrgGroupOrgCopyCopyTable =
      new BasOrgGroupOrgCopyCopyTable();
  public static SqlColumn<Long> id = basOrgGroupOrgCopyCopyTable.id;
  public static SqlColumn<Long> deleted = basOrgGroupOrgCopyCopyTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgGroupOrgCopyCopyTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgGroupOrgCopyCopyTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgGroupOrgCopyCopyTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgGroupOrgCopyCopyTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgGroupOrgCopyCopyTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgGroupOrgCopyCopyTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgGroupOrgCopyCopyTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgGroupOrgCopyCopyTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgGroupOrgCopyCopyTable.version;
  public static SqlColumn<String> orgGroupCode = basOrgGroupOrgCopyCopyTable.orgGroupCode;
  public static SqlColumn<Long> orgGroupId = basOrgGroupOrgCopyCopyTable.orgGroupId;
  public static SqlColumn<String> orgGroupName = basOrgGroupOrgCopyCopyTable.orgGroupName;
  public static SqlColumn<String> orgOrgCode = basOrgGroupOrgCopyCopyTable.orgOrgCode;
  public static SqlColumn<Long> orgOrgId = basOrgGroupOrgCopyCopyTable.orgOrgId;
  public static SqlColumn<String> orgOrgName = basOrgGroupOrgCopyCopyTable.orgOrgName;

  public static final class BasOrgGroupOrgCopyCopyTable extends SqlTable {
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

    public BasOrgGroupOrgCopyCopyTable() {
      super("BasOrgGroupOrgCopyCopy");
    }
  }
}
