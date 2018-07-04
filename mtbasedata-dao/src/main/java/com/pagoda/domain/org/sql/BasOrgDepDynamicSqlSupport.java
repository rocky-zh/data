package com.pagoda.domain.org.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.domain.org.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * 往来单位-部门明细表实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class BasOrgDepDynamicSqlSupport {

  public static BasOrgDepTable basOrgDepTable = new BasOrgDepTable();
  public static SqlColumn<Long> id = basOrgDepTable.id;
  public static SqlColumn<Long> deleted = basOrgDepTable.deleted;
  public static SqlColumn<Date> createdAt = basOrgDepTable.createdAt;
  public static SqlColumn<String> creatorCode = basOrgDepTable.creatorCode;
  public static SqlColumn<String> creatorName = basOrgDepTable.creatorName;
  public static SqlColumn<String> creatorOrgCode = basOrgDepTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = basOrgDepTable.lastModifiedAt;
  public static SqlColumn<String> modifierCode = basOrgDepTable.modifierCode;
  public static SqlColumn<String> modifierName = basOrgDepTable.modifierName;
  public static SqlColumn<String> modifierOrgCode = basOrgDepTable.modifierOrgCode;
  public static SqlColumn<Integer> version = basOrgDepTable.version;
  public static SqlColumn<Long> ownerDepId = basOrgDepTable.ownerDepId;
  public static SqlColumn<Long> relCatClassId = basOrgDepTable.relCatClassId;
  public static SqlColumn<Integer> isDepEnabled = basOrgDepTable.isDepEnabled;
  public static SqlColumn<Long> orgId = basOrgDepTable.orgId;

  public static final class BasOrgDepTable extends SqlTable {
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

    public final SqlColumn<Long> ownerDepId = column("owner_dep_id", JDBCType.BIGINT);
    public final SqlColumn<Long> relCatClassId = column("rel_cat_class_id", JDBCType.BIGINT);
    public final SqlColumn<Integer> isDepEnabled = column("is_dep_enabled", JDBCType.INTEGER);
    public final SqlColumn<Long> orgId = column("org_id", JDBCType.BIGINT);

    public BasOrgDepTable() {
      super("BasOrgDep");
    }
  }
}
